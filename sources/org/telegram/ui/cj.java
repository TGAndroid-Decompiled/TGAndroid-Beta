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
public final class cj implements Runnable {
    public final int f36693a;
    public final Object f36694b;

    public cj(Object obj, int i10) {
        this.f36693a = i10;
        this.f36694b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f36693a;
        int i15 = 0;
        Object obj = this.f36694b;
        switch (i14) {
            case 0:
                ci.x5 x5Var = (ci.x5) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) x5Var.f6303e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(x5Var.f6301b);
                return;
            case 1:
                ej ejVar = (ej) obj;
                i11 = ((org.telegram.ui.ActionBar.n2) ((zn) ejVar.f37274e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(ejVar.f37273c);
                return;
            case 2:
                zn.X1(((wj) obj).f43696x3);
                return;
            case 3:
                ((zj) obj).T.A0.O(false);
                return;
            case 4:
                xi xiVar = (xi) obj;
                zn znVar = xiVar.f44044b;
                if (znVar.f44756e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(znVar.f44756e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new t4(xiVar, 20));
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
                mm mmVar = ((cm) obj).f36706c.f37050a;
                i12 = ((org.telegram.ui.ActionBar.n2) mmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                mmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((qm) obj).f41148c.j9(true);
                return;
            case 8:
                ((aj) obj).c(false);
                return;
            case 9:
                zn znVar2 = ((mn) obj).h;
                znVar2.getNotificationCenter().onAnimationFinish(znVar2.I9);
                return;
            case 10:
                zn znVar3 = ((rn) obj).h;
                znVar3.f44814j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(znVar3.f44814j0.getSearchField());
                if (znVar3.f44895pa > 0) {
                    rf rfVar = new rf(znVar3, 7);
                    znVar3.f44907qa = rfVar;
                    AndroidUtilities.runOnUIThread(rfVar, 200L);
                    return;
                }
                return;
            case 11:
                uo uoVar = ((qo) obj).f41156a;
                uoVar.f42471e.setImageDrawable(uoVar.f42486r);
                uoVar.f42467b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = uoVar.D0;
                if (user != null) {
                    user.photo = null;
                    uoVar.getMessagesController().putUser(uoVar.D0, true);
                }
                uoVar.O0 = true;
                if (uoVar.R0 == null) {
                    uoVar.R0 = new org.telegram.ui.Components.ck0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                uoVar.f42467b0.f22720e.setTranslationX(-AndroidUtilities.dp(8.0f));
                uoVar.f42467b0.f22720e.setAnimation(uoVar.R0);
                return;
            case 12:
                ((xq) obj).run(0);
                return;
            case 13:
                ((xr) obj).invalidateSelf();
                return;
            case 14:
                fs fsVar = (fs) obj;
                ArrayList arrayList = fsVar.f37673c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                fsVar.invalidateSelf();
                return;
            case 15:
                ContactsActivity contactsActivity = ((ws) obj).f43750a;
                contactsActivity.Z.f30614r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f30614r);
                return;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 17:
                ((nt) obj).f40362a.p();
                return;
            case 18:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
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
                ty tyVar = ((qw) obj).B0;
                tyVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) tyVar, 9, true));
                tyVar.f42278z0.setIsEditing(false);
                tyVar.F4(false);
                return;
            case 24:
                ty tyVar2 = ((sw) obj).f41780b;
                tyVar2.f42278z0.setIsEditing(true);
                tyVar2.F4(true);
                return;
            case 25:
                ((tw) obj).f42134a.f42180f0.setAlpha(1.0f);
                return;
            case 26:
                Bundle bundle2 = new Bundle();
                ty tyVar3 = ((hy) obj).f38415a;
                i13 = ((org.telegram.ui.ActionBar.n2) tyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                tyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 27:
                ((cz) obj).removeSelfFromStack();
                return;
            case 28:
                fz fzVar = (fz) obj;
                ArrayList arrayList2 = fzVar.f37728x;
                ArrayList arrayList3 = fzVar.f37727w;
                if (fzVar.f37725r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = fzVar.f37725r;
                    tL_sendMessageEmojiInteraction.emoticon = fzVar.v;
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
                                fzVar.f37725r = 0;
                                fzVar.v = null;
                                fzVar.f37726s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                fzVar.f37729y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = fzVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(fzVar.f37720b).getInputPeer(fzVar.I);
                        ConnectionsManager.getInstance(fzVar.f37720b).sendRequest(tL_messages_setTyping, null);
                        fzVar.f37725r = 0;
                        fzVar.v = null;
                        fzVar.f37726s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                fzVar.f37729y = null;
                return;
            default:
                ((c00) obj).e0(true);
                return;
        }
    }
}
