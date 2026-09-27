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
    public final int f32735a;
    public final Object f32736b;

    public cj(Object obj, int i10) {
        this.f32735a = i10;
        this.f32736b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f32735a;
        int i14 = 0;
        Object obj = this.f32736b;
        switch (i13) {
            case 0:
                dj djVar = (dj) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((xn) djVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(djVar.f32989c);
                return;
            case 1:
                xn.X1(((tj) obj).f37852z3);
                return;
            case 2:
                ((wj) obj).T.A0.O(false);
                return;
            case 3:
                wi wiVar = (wi) obj;
                xn xnVar = wiVar.f39351b;
                if (xnVar.f39743e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(xnVar.f39743e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new v4(wiVar, 19));
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
                km kmVar = ((am) obj).f32102c.f32390a;
                i11 = ((org.telegram.ui.ActionBar.o2) kmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                kmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((om) obj).f36226c.e9(true);
                return;
            case 7:
                ((zi) obj).c(false);
                return;
            case 8:
                xn xnVar2 = ((kn) obj).h;
                xnVar2.getNotificationCenter().onAnimationFinish(xnVar2.I9);
                return;
            case 9:
                xn xnVar3 = ((pn) obj).h;
                xnVar3.f39802j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(xnVar3.f39802j0.getSearchField());
                if (xnVar3.f39883pa > 0) {
                    rf rfVar = new rf(xnVar3, 8);
                    xnVar3.f39895qa = rfVar;
                    AndroidUtilities.runOnUIThread(rfVar, 200L);
                    return;
                }
                return;
            case 10:
                so soVar = ((oo) obj).f36232a;
                soVar.e.setImageDrawable(soVar.f37524r);
                soVar.f37506b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = soVar.D0;
                if (user != null) {
                    user.photo = null;
                    soVar.getMessagesController().putUser(soVar.D0, true);
                }
                soVar.O0 = true;
                if (soVar.R0 == null) {
                    soVar.R0 = new org.telegram.ui.Components.kj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                soVar.f37506b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                soVar.f37506b0.e.setAnimation(soVar.R0);
                return;
            case 11:
                ((vq) obj).run(0);
                return;
            case 12:
                ((wr) obj).invalidateSelf();
                return;
            case 13:
                es esVar = (es) obj;
                ArrayList arrayList = esVar.f33310c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                esVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((vs) obj).f38697a;
                contactsActivity.Z.f23850r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f23850r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((mt) obj).f35750a.p();
                return;
            case 17:
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
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
                ((qw) obj).f36915a.f37982f0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                ty tyVar = ((fy) obj).f33654a;
                i12 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                tyVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                ty tyVar2 = ((iy) obj).B0;
                tyVar2.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) tyVar2, 9, true));
                tyVar2.f38079z0.setIsEditing(false);
                tyVar2.R4(false);
                return;
            case 25:
                ty tyVar3 = ((ky) obj).f35193b;
                tyVar3.f38079z0.setIsEditing(true);
                tyVar3.R4(true);
                return;
            case 26:
                ((cz) obj).removeSelfFromStack();
                return;
            case 27:
                fz fzVar = (fz) obj;
                ArrayList arrayList2 = fzVar.f33665x;
                ArrayList arrayList3 = fzVar.f33664w;
                if (fzVar.f33662r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = fzVar.f33662r;
                    tL_sendMessageEmojiInteraction.emoticon = fzVar.v;
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
                            } catch (JSONException e) {
                                e = e;
                                fzVar.f33662r = 0;
                                fzVar.v = null;
                                fzVar.f33663s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                fzVar.f33666y = null;
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
                        tL_messages_setTyping.peer = MessagesController.getInstance(fzVar.f33658b).getInputPeer(fzVar.I);
                        ConnectionsManager.getInstance(fzVar.f33658b).sendRequest(tL_messages_setTyping, null);
                        fzVar.f33662r = 0;
                        fzVar.v = null;
                        fzVar.f33663s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                fzVar.f33666y = null;
                return;
            case 28:
                ((b00) obj).e0(true);
                return;
            default:
                ((zz) obj).f38381a.getBackground().setState(new int[0]);
                return;
        }
    }
}
