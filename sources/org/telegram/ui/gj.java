package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gj implements Runnable {
    public final int f38075a;
    public final Object f38076b;

    public gj(Object obj, int i10) {
        this.f38075a = i10;
        this.f38076b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f38075a;
        int i15 = 0;
        Object obj = this.f38076b;
        switch (i14) {
            case 0:
                ci.x5 x5Var = (ci.x5) obj;
                i10 = ((org.telegram.ui.ActionBar.m2) ((eo) x5Var.f6301e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(x5Var.f6299b);
                return;
            case 1:
                ij ijVar = (ij) obj;
                i11 = ((org.telegram.ui.ActionBar.m2) ((eo) ijVar.f38928e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(ijVar.f38927c);
                return;
            case 2:
                eo.X1(((ak) obj).f35891x3);
                return;
            case 3:
                ((dk) obj).T.A0.O(false);
                return;
            case 4:
                bj bjVar = (bj) obj;
                eo eoVar = bjVar.f36187b;
                if (eoVar.f37249e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(eoVar.f37249e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new w4(bjVar, 20));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    return;
                }
                return;
            case 5:
                ((MessageObject) obj).settingAvatar = false;
                return;
            case 6:
                Bundle bundle = new Bundle();
                qm qmVar = ((gm) obj).f38100c.f38467a;
                i12 = ((org.telegram.ui.ActionBar.m2) qmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                qmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((um) obj).f42538c.j9(true);
                return;
            case 8:
                ((ej) obj).c(false);
                return;
            case 9:
                eo eoVar2 = ((qn) obj).h;
                eoVar2.getNotificationCenter().onAnimationFinish(eoVar2.I9);
                return;
            case 10:
                eo eoVar3 = ((vn) obj).h;
                eoVar3.f37307j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(eoVar3.f37307j0.getSearchField());
                if (eoVar3.f37388pa > 0) {
                    vf vfVar = new vf(eoVar3, 7);
                    eoVar3.f37400qa = vfVar;
                    AndroidUtilities.runOnUIThread(vfVar, 200L);
                    return;
                }
                return;
            case 11:
                xo xoVar = ((uo) obj).f42544a;
                xoVar.f44059e.setImageDrawable(xoVar.f44074r);
                xoVar.f44055b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = xoVar.D0;
                if (user != null) {
                    user.photo = null;
                    xoVar.getMessagesController().putUser(xoVar.D0, true);
                }
                xoVar.O0 = true;
                if (xoVar.R0 == null) {
                    xoVar.R0 = new org.telegram.ui.Components.fk0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                xoVar.f44055b0.f22484e.setTranslationX(-AndroidUtilities.dp(8.0f));
                xoVar.f44055b0.f22484e.setAnimation(xoVar.R0);
                return;
            case 12:
                ((ar) obj).run(0);
                return;
            case 13:
                ((as) obj).invalidateSelf();
                return;
            case 14:
                is isVar = (is) obj;
                ArrayList arrayList = isVar.f38988c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                isVar.invalidateSelf();
                return;
            case 15:
                ContactsActivity contactsActivity = ((zs) obj).f44916a;
                contactsActivity.Z.f31362r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f31362r);
                return;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 17:
                ((qt) obj).f41433a.p();
                return;
            case 18:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                    return;
                }
                return;
            case 19:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                return;
            case 20:
                ((org.telegram.ui.Cells.a3) obj).d();
                return;
            case 21:
                ((org.telegram.ui.Cells.ua) obj).b();
                return;
            case 22:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 23:
                vy vyVar = ((sw) obj).B0;
                vyVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) vyVar, 9, true));
                vyVar.f43009z0.setIsEditing(false);
                vyVar.F4(false);
                return;
            case 24:
                vy vyVar2 = ((uw) obj).f42603b;
                vyVar2.f43009z0.setIsEditing(true);
                vyVar2.F4(true);
                return;
            case 25:
                ((vw) obj).f42865a.f42911f0.setAlpha(1.0f);
                return;
            case 26:
                Bundle bundle2 = new Bundle();
                vy vyVar3 = ((jy) obj).f39300a;
                i13 = ((org.telegram.ui.ActionBar.m2) vyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                vyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 27:
                ((ez) obj).removeSelfFromStack();
                return;
            case 28:
                hz hzVar = (hz) obj;
                ArrayList arrayList2 = hzVar.f38573x;
                ArrayList arrayList3 = hzVar.f38572w;
                if (hzVar.f38570r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = hzVar.f38570r;
                    tL_sendMessageEmojiInteraction.emoticon = hzVar.v;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i16)).intValue() + 1);
                                jSONObject2.put("t", ((float) ((Long) arrayList3.get(i16)).longValue()) / 1000.0f);
                                jSONArray.put(i16, jSONObject2);
                            } catch (JSONException e7) {
                                e = e7;
                                hzVar.f38570r = 0;
                                hzVar.v = null;
                                hzVar.f38571s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                hzVar.f38574y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = hzVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(hzVar.f38565b).getInputPeer(hzVar.I);
                        ConnectionsManager.getInstance(hzVar.f38565b).sendRequest(tL_messages_setTyping, null);
                        hzVar.f38570r = 0;
                        hzVar.v = null;
                        hzVar.f38571s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                hzVar.f38574y = null;
                return;
            default:
                ((e00) obj).e0(true);
                return;
        }
    }
}
