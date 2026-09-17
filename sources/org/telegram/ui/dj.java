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
public final class dj implements Runnable {
    public final int f35805a;
    public final Object f35806b;

    public dj(Object obj, int i10) {
        this.f35805a = i10;
        this.f35806b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f35805a;
        int i14 = 0;
        Object obj = this.f35806b;
        switch (i13) {
            case 0:
                ej ejVar = (ej) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((co) ejVar.f36098e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(ejVar.f36097c);
                return;
            case 1:
                co.X1(((uj) obj).y3);
                return;
            case 2:
                ((xj) obj).T.A0.O(false);
                return;
            case 3:
                xi xiVar = (xi) obj;
                co coVar = xiVar.f42738b;
                if (coVar.f35241e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(coVar.f35241e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new s0(xiVar, 22));
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
                om omVar = ((em) obj).f36131c.f36433a;
                i11 = ((org.telegram.ui.ActionBar.n2) omVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                omVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((sm) obj).f40474c.e9(true);
                return;
            case 7:
                ((aj) obj).c(false);
                return;
            case 8:
                co coVar2 = ((pn) obj).h;
                coVar2.getNotificationCenter().onAnimationFinish(coVar2.I9);
                return;
            case 9:
                co coVar3 = ((un) obj).h;
                coVar3.f35299j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(coVar3.f35299j0.getSearchField());
                if (coVar3.f35380pa > 0) {
                    qf qfVar = new qf(coVar3, 9);
                    coVar3.f35392qa = qfVar;
                    AndroidUtilities.runOnUIThread(qfVar, 200L);
                    return;
                }
                return;
            case 10:
                xo xoVar = ((uo) obj).f41194a;
                xoVar.f42775e.setImageDrawable(xoVar.f42790r);
                xoVar.f42771b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = xoVar.D0;
                if (user != null) {
                    user.photo = null;
                    xoVar.getMessagesController().putUser(xoVar.D0, true);
                }
                xoVar.O0 = true;
                if (xoVar.R0 == null) {
                    xoVar.R0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                xoVar.f42771b0.f22684e.setTranslationX(-AndroidUtilities.dp(8.0f));
                xoVar.f42771b0.f22684e.setAnimation(xoVar.R0);
                return;
            case 11:
                ((ar) obj).run(0);
                return;
            case 12:
                ((zr) obj).invalidateSelf();
                return;
            case 13:
                hs hsVar = (hs) obj;
                ArrayList arrayList = hsVar.f37102c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                hsVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((ys) obj).f43202a;
                contactsActivity.Z.f24523r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f24523r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((ot) obj).f39310a.p();
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
                ((org.telegram.ui.Cells.wa) obj).b();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 22:
                uy uyVar = ((sw) obj).B0;
                uyVar.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) uyVar, 9, true));
                uyVar.f41365z0.setIsEditing(false);
                uyVar.I4(false);
                return;
            case 23:
                uy uyVar2 = ((tw) obj).f40842b;
                uyVar2.f41365z0.setIsEditing(true);
                uyVar2.I4(true);
                return;
            case 24:
                ((uw) obj).f41224a.f41266f0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                uy uyVar3 = ((iy) obj).f37454a;
                i12 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                uyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 26:
                ((dz) obj).removeSelfFromStack();
                return;
            case 27:
                gz gzVar = (gz) obj;
                ArrayList arrayList2 = gzVar.f36822x;
                ArrayList arrayList3 = gzVar.f36821w;
                if (gzVar.f36819r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = gzVar.f36819r;
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
                                gzVar.f36819r = 0;
                                gzVar.v = null;
                                gzVar.f36820s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                gzVar.f36823y = null;
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
                        tL_messages_setTyping.peer = MessagesController.getInstance(gzVar.f36814b).getInputPeer(gzVar.I);
                        ConnectionsManager.getInstance(gzVar.f36814b).sendRequest(tL_messages_setTyping, null);
                        gzVar.f36819r = 0;
                        gzVar.v = null;
                        gzVar.f36820s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e10) {
                        e = e10;
                    }
                }
                gzVar.f36823y = null;
                return;
            case 28:
                ((c00) obj).e0(true);
                return;
            default:
                ((a00) obj).f41716a.getBackground().setState(new int[0]);
                return;
        }
    }
}
