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
    public final int f36755a;
    public final Object f36756b;

    public cj(Object obj, int i10) {
        this.f36755a = i10;
        this.f36756b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f36755a;
        int i15 = 0;
        Object obj = this.f36756b;
        switch (i14) {
            case 0:
                ci.x5 x5Var = (ci.x5) obj;
                i10 = ((org.telegram.ui.ActionBar.m2) ((zn) x5Var.f6302e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(x5Var.f6300b);
                return;
            case 1:
                ej ejVar = (ej) obj;
                i11 = ((org.telegram.ui.ActionBar.m2) ((zn) ejVar.f37413e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(ejVar.f37412c);
                return;
            case 2:
                zn.X1(((wj) obj).f43850x3);
                return;
            case 3:
                ((zj) obj).T.A0.O(false);
                return;
            case 4:
                xi xiVar = (xi) obj;
                zn znVar = xiVar.f44115b;
                if (znVar.f44789e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(znVar.f44789e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new s4(xiVar, 20));
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
                mm mmVar = ((cm) obj).f36818c.f37084a;
                i12 = ((org.telegram.ui.ActionBar.m2) mmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                mmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((qm) obj).f41236c.j9(true);
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
                znVar3.f44847j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(znVar3.f44847j0.getSearchField());
                if (znVar3.f44928pa > 0) {
                    qf qfVar = new qf(znVar3, 7);
                    znVar3.f44940qa = qfVar;
                    AndroidUtilities.runOnUIThread(qfVar, 200L);
                    return;
                }
                return;
            case 11:
                uo uoVar = ((qo) obj).f41244a;
                uoVar.f42695e.setImageDrawable(uoVar.f42710r);
                uoVar.f42691b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = uoVar.D0;
                if (user != null) {
                    user.photo = null;
                    uoVar.getMessagesController().putUser(uoVar.D0, true);
                }
                uoVar.O0 = true;
                if (uoVar.R0 == null) {
                    uoVar.R0 = new org.telegram.ui.Components.dk0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                uoVar.f42691b0.f22748e.setTranslationX(-AndroidUtilities.dp(8.0f));
                uoVar.f42691b0.f22748e.setAnimation(uoVar.R0);
                return;
            case 12:
                ((xq) obj).run(0);
                return;
            case 13:
                ((wr) obj).invalidateSelf();
                return;
            case 14:
                es esVar = (es) obj;
                ArrayList arrayList = esVar.f37468c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                esVar.invalidateSelf();
                return;
            case 15:
                ContactsActivity contactsActivity = ((vs) obj).f43166a;
                contactsActivity.Z.f31038r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f31038r);
                return;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 17:
                ((mt) obj).f40107a.p();
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
                sy syVar = ((qw) obj).B0;
                syVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) syVar, 9, true));
                syVar.f42045z0.setIsEditing(false);
                syVar.F4(false);
                return;
            case 24:
                sy syVar2 = ((rw) obj).f41554b;
                syVar2.f42045z0.setIsEditing(true);
                syVar2.F4(true);
                return;
            case 25:
                ((sw) obj).f41901a.f41947f0.setAlpha(1.0f);
                return;
            case 26:
                Bundle bundle2 = new Bundle();
                sy syVar3 = ((gy) obj).f38210a;
                i13 = ((org.telegram.ui.ActionBar.m2) syVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                syVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 27:
                ((bz) obj).removeSelfFromStack();
                return;
            case 28:
                ez ezVar = (ez) obj;
                ArrayList arrayList2 = ezVar.f37523x;
                ArrayList arrayList3 = ezVar.f37522w;
                if (ezVar.f37520r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = ezVar.f37520r;
                    tL_sendMessageEmojiInteraction.emoticon = ezVar.v;
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
                                ezVar.f37520r = 0;
                                ezVar.v = null;
                                ezVar.f37521s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                ezVar.f37524y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = ezVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(ezVar.f37515b).getInputPeer(ezVar.I);
                        ConnectionsManager.getInstance(ezVar.f37515b).sendRequest(tL_messages_setTyping, null);
                        ezVar.f37520r = 0;
                        ezVar.v = null;
                        ezVar.f37521s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                ezVar.f37524y = null;
                return;
            default:
                ((b00) obj).e0(true);
                return;
        }
    }
}
