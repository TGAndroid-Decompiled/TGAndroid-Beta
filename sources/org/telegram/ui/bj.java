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
public final class bj implements Runnable {
    public final int f35125a;
    public final Object f35126b;

    public bj(Object obj, int i10) {
        this.f35125a = i10;
        this.f35126b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f35125a;
        int i14 = 0;
        Object obj = this.f35126b;
        switch (i13) {
            case 0:
                cj cjVar = (cj) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((yn) cjVar.f35494e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(cjVar.f35493c);
                return;
            case 1:
                yn.X1(((sj) obj).G3);
                return;
            case 2:
                ((vj) obj).T.f43572y0.O(false);
                return;
            case 3:
                vi viVar = (vi) obj;
                yn ynVar = viVar.f41764b;
                if (ynVar.f43299c2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ynVar.f43299c2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new u4(viVar, 19));
                    animatorSet.setDuration(300L);
                    animatorSet.start();
                    return;
                }
                return;
            case 4:
                ((MessageObject) obj).settingAvatar = false;
                return;
            case 5:
                Bundle bundle = new Bundle();
                jm jmVar = ((zl) obj).f43856c.f34867a;
                i11 = ((org.telegram.ui.ActionBar.n2) jmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                jmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((nm) obj).f39015c.f9(true);
                return;
            case 7:
                ((yi) obj).c(false);
                return;
            case 8:
                yn ynVar2 = ((ln) obj).h;
                ynVar2.getNotificationCenter().onAnimationFinish(ynVar2.G9);
                return;
            case 9:
                yn ynVar3 = ((qn) obj).h;
                ynVar3.f43359h0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(ynVar3.f43359h0.getSearchField());
                if (ynVar3.f43443na > 0) {
                    yf yfVar = new yf(ynVar3, 6);
                    ynVar3.f43453oa = yfVar;
                    AndroidUtilities.runOnUIThread(yfVar, 200L);
                    return;
                }
                return;
            case 10:
                to toVar = ((po) obj).f39526a;
                toVar.f40895e.setImageDrawable(toVar.f40910r);
                toVar.f40891b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = toVar.D0;
                if (user != null) {
                    user.photo = null;
                    toVar.getMessagesController().putUser(toVar.D0, true);
                }
                toVar.O0 = true;
                if (toVar.R0 == null) {
                    toVar.R0 = new org.telegram.ui.Components.kj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                toVar.f40891b0.f22727e.setTranslationX(-AndroidUtilities.dp(8.0f));
                toVar.f40891b0.f22727e.setAnimation(toVar.R0);
                return;
            case 11:
                ((wq) obj).run(0);
                return;
            case 12:
                ((xr) obj).invalidateSelf();
                return;
            case 13:
                fs fsVar = (fs) obj;
                ArrayList arrayList = fsVar.f36383c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                fsVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((ws) obj).f42636a;
                contactsActivity.Z.f26252r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f26252r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((nt) obj).f39042a.p();
                return;
            case 17:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                    return;
                }
                return;
            case 18:
                ((AccountInstance) obj).getDownloadController().loadDownloadingFiles();
                return;
            case 19:
                ((org.telegram.ui.Cells.a3) obj).d();
                return;
            case 20:
                ((org.telegram.ui.Cells.wa) obj).b();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 22:
                ((sw) obj).f40628a.f41406f0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                uy uyVar = ((hy) obj).f37194a;
                i12 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                uyVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                uy uyVar2 = ((ky) obj).B0;
                uyVar2.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) uyVar2, 9, true));
                uyVar2.f41503z0.setIsEditing(false);
                uyVar2.R4(false);
                return;
            case 25:
                uy uyVar3 = ((ly) obj).f38365b;
                uyVar3.f41503z0.setIsEditing(true);
                uyVar3.R4(true);
                return;
            case 26:
                ((dz) obj).removeSelfFromStack();
                return;
            case 27:
                gz gzVar = (gz) obj;
                ArrayList arrayList2 = gzVar.f36791x;
                ArrayList arrayList3 = gzVar.f36790w;
                if (gzVar.f36788r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = gzVar.f36788r;
                    tL_sendMessageEmojiInteraction.emoticon = gzVar.v;
                    tL_sendMessageEmojiInteraction.interaction = new TLRPC.TL_dataJSON();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("v", 1);
                        JSONArray jSONArray = new JSONArray();
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("i", ((Integer) arrayList2.get(i15)).intValue() + 1);
                                jSONObject2.put("t", ((float) ((Long) arrayList3.get(i15)).longValue()) / 1000.0f);
                                jSONArray.put(i15, jSONObject2);
                            } catch (JSONException e7) {
                                e = e7;
                                gzVar.f36788r = 0;
                                gzVar.v = null;
                                gzVar.f36789s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                gzVar.f36792y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = gzVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(gzVar.f36783b).getInputPeer(gzVar.I);
                        ConnectionsManager.getInstance(gzVar.f36783b).sendRequest(tL_messages_setTyping, null);
                        gzVar.f36788r = 0;
                        gzVar.v = null;
                        gzVar.f36789s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                gzVar.f36792y = null;
                return;
            case 28:
                ((c00) obj).e0(true);
                return;
            default:
                ((a00) obj).f41864a.getBackground().setState(new int[0]);
                return;
        }
    }
}
