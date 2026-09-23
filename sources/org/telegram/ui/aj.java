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
public final class aj implements Runnable {
    public final int f31808a;
    public final Object f31809b;

    public aj(Object obj, int i10) {
        this.f31808a = i10;
        this.f31809b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f31808a;
        int i14 = 0;
        Object obj = this.f31809b;
        switch (i13) {
            case 0:
                bj bjVar = (bj) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((xn) bjVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(bjVar.f32129c);
                return;
            case 1:
                xn.X1(((rj) obj).f36882z3);
                return;
            case 2:
                ((uj) obj).T.A0.O(false);
                return;
            case 3:
                ui uiVar = (ui) obj;
                xn xnVar = uiVar.f38116b;
                if (xnVar.f39363e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(xnVar.f39363e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new u4(uiVar, 19));
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
                km kmVar = ((am) obj).f31831c.f32143a;
                i11 = ((org.telegram.ui.ActionBar.n2) kmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                kmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((om) obj).f35909c.e9(true);
                return;
            case 7:
                ((xi) obj).c(false);
                return;
            case 8:
                xn xnVar2 = ((kn) obj).h;
                xnVar2.getNotificationCenter().onAnimationFinish(xnVar2.I9);
                return;
            case 9:
                xn xnVar3 = ((pn) obj).h;
                xnVar3.f39421j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(xnVar3.f39421j0.getSearchField());
                if (xnVar3.f39502pa > 0) {
                    pf pfVar = new pf(xnVar3, 9);
                    xnVar3.f39514qa = pfVar;
                    AndroidUtilities.runOnUIThread(pfVar, 200L);
                    return;
                }
                return;
            case 10:
                so soVar = ((oo) obj).f35915a;
                soVar.e.setImageDrawable(soVar.f37364r);
                soVar.f37346b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = soVar.D0;
                if (user != null) {
                    user.photo = null;
                    soVar.getMessagesController().putUser(soVar.D0, true);
                }
                soVar.O0 = true;
                if (soVar.R0 == null) {
                    soVar.R0 = new org.telegram.ui.Components.yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                soVar.f37346b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                soVar.f37346b0.e.setAnimation(soVar.R0);
                return;
            case 11:
                ((vq) obj).run(0);
                return;
            case 12:
                ((ur) obj).invalidateSelf();
                return;
            case 13:
                cs csVar = (cs) obj;
                ArrayList arrayList = csVar.f32396c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                csVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((us) obj).f38212a;
                contactsActivity.Z.f22890r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f22890r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((lt) obj).f35086a.p();
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
                ((org.telegram.ui.Cells.z2) obj).d();
                return;
            case 20:
                ((org.telegram.ui.Cells.ya) obj).b();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 22:
                ry ryVar = ((pw) obj).B0;
                ryVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) ryVar, 9, true));
                ryVar.f37082z0.setIsEditing(false);
                ryVar.I4(false);
                return;
            case 23:
                ry ryVar2 = ((qw) obj).f36622b;
                ryVar2.f37082z0.setIsEditing(true);
                ryVar2.I4(true);
                return;
            case 24:
                ((rw) obj).f36944a.f36984f0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                ry ryVar3 = ((fy) obj).f33393a;
                i12 = ((org.telegram.ui.ActionBar.n2) ryVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                ryVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 26:
                ((az) obj).removeSelfFromStack();
                return;
            case 27:
                dz dzVar = (dz) obj;
                ArrayList arrayList2 = dzVar.f32750x;
                ArrayList arrayList3 = dzVar.f32749w;
                if (dzVar.f32747r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = dzVar.f32747r;
                    tL_sendMessageEmojiInteraction.emoticon = dzVar.v;
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
                                dzVar.f32747r = 0;
                                dzVar.v = null;
                                dzVar.f32748s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                dzVar.f32751y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = dzVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(dzVar.f32743b).getInputPeer(dzVar.I);
                        ConnectionsManager.getInstance(dzVar.f32743b).sendRequest(tL_messages_setTyping, null);
                        dzVar.f32747r = 0;
                        dzVar.v = null;
                        dzVar.f32748s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                dzVar.f32751y = null;
                return;
            case 28:
                ((zz) obj).e0(true);
                return;
            default:
                ((xz) obj).f37464a.getBackground().setState(new int[0]);
                return;
        }
    }
}
