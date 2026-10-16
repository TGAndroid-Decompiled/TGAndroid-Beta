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
    public final int f36230a;
    public final Object f36231b;

    public gj(Object obj, int i10) {
        this.f36230a = i10;
        this.f36231b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f36230a;
        int i15 = 0;
        Object obj = this.f36231b;
        switch (i14) {
            case 0:
                di.w5 w5Var = (di.w5) obj;
                i10 = ((org.telegram.ui.ActionBar.m2) ((fo) w5Var.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(w5Var.f8053b);
                return;
            case 1:
                ij ijVar = (ij) obj;
                i11 = ((org.telegram.ui.ActionBar.m2) ((fo) ijVar.e)).currentAccount;
                NotificationCenter.getInstance(i11).onAnimationFinish(ijVar.f36824c);
                return;
            case 2:
                fo.X1(((ak) obj).f33980x3);
                return;
            case 3:
                ((dk) obj).T.A0.O(false);
                return;
            case 4:
                bj bjVar = (bj) obj;
                fo foVar = bjVar.f34340b;
                if (foVar.f35626e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(foVar.f35626e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new u0(bjVar, 23));
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
                rm rmVar = ((hm) obj).f36613c.f36836a;
                i12 = ((org.telegram.ui.ActionBar.m2) rmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i12).clientUserId);
                rmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((vm) obj).f40731c.j9(true);
                return;
            case 8:
                ((ej) obj).c(false);
                return;
            case 9:
                fo foVar2 = ((rn) obj).h;
                foVar2.getNotificationCenter().onAnimationFinish(foVar2.I9);
                return;
            case 10:
                fo foVar3 = ((wn) obj).h;
                foVar3.f35684j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(foVar3.f35684j0.getSearchField());
                if (foVar3.f35766pa > 0) {
                    wf wfVar = new wf(foVar3, 7);
                    foVar3.f35778qa = wfVar;
                    AndroidUtilities.runOnUIThread(wfVar, 200L);
                    return;
                }
                return;
            case 11:
                zo zoVar = ((wo) obj).f41330a;
                zoVar.e.setImageDrawable(zoVar.f42384r);
                zoVar.f42366b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = zoVar.D0;
                if (user != null) {
                    user.photo = null;
                    zoVar.getMessagesController().putUser(zoVar.D0, true);
                }
                zoVar.O0 = true;
                if (zoVar.R0 == null) {
                    zoVar.R0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                zoVar.f42366b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                zoVar.f42366b0.e.setAnimation(zoVar.R0);
                return;
            case 12:
                ((dr) obj).run(0);
                return;
            case 13:
                ((cs) obj).invalidateSelf();
                return;
            case 14:
                ls lsVar = (ls) obj;
                ArrayList arrayList = lsVar.f37811c;
                int size = arrayList.size();
                while (i15 < size) {
                    Object obj2 = arrayList.get(i15);
                    i15++;
                    ((View) obj2).invalidate();
                }
                lsVar.invalidateSelf();
                return;
            case 15:
                ContactsActivity contactsActivity = ((ct) obj).f34789a;
                contactsActivity.Z.f27510r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f27510r);
                return;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 17:
                ((tt) obj).f40207a.p();
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
                yy yyVar = ((ww) obj).B0;
                yyVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) yyVar, 9, true));
                yyVar.f42110z0.setIsEditing(false);
                yyVar.G4(false);
                return;
            case 24:
                yy yyVar2 = ((xw) obj).f41671b;
                yyVar2.f42110z0.setIsEditing(true);
                yyVar2.G4(true);
                return;
            case 25:
                ((yw) obj).f41968a.f42010f0.setAlpha(1.0f);
                return;
            case 26:
                Bundle bundle2 = new Bundle();
                yy yyVar3 = ((my) obj).f38085a;
                i13 = ((org.telegram.ui.ActionBar.m2) yyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i13).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                yyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 27:
                ((hz) obj).removeSelfFromStack();
                return;
            case 28:
                kz kzVar = (kz) obj;
                ArrayList arrayList2 = kzVar.f37557x;
                ArrayList arrayList3 = kzVar.f37556w;
                if (kzVar.f37554r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = kzVar.f37554r;
                    tL_sendMessageEmojiInteraction.emoticon = kzVar.v;
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
                            } catch (JSONException e) {
                                e = e;
                                kzVar.f37554r = 0;
                                kzVar.v = null;
                                kzVar.f37555s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                kzVar.f37558y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = kzVar.J;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(kzVar.f37550b).getInputPeer(kzVar.I);
                        ConnectionsManager.getInstance(kzVar.f37550b).sendRequest(tL_messages_setTyping, null);
                        kzVar.f37554r = 0;
                        kzVar.v = null;
                        kzVar.f37555s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                kzVar.f37558y = null;
                return;
            default:
                ((h00) obj).e0(true);
                return;
        }
    }
}
