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
    public final int f32669a;
    public final Object f32670b;

    public cj(Object obj, int i10) {
        this.f32669a = i10;
        this.f32670b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f32669a;
        int i14 = 0;
        Object obj = this.f32670b;
        switch (i13) {
            case 0:
                dj djVar = (dj) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) djVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(djVar.f33036c);
                return;
            case 1:
                zn.X1(((tj) obj).y3);
                return;
            case 2:
                ((wj) obj).T.A0.O(false);
                return;
            case 3:
                wi wiVar = (wi) obj;
                zn znVar = wiVar.f39176b;
                if (znVar.f40254e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(znVar.f40254e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new t4(wiVar, 19));
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
                lm lmVar = ((bm) obj).f32412c.f32716a;
                i11 = ((org.telegram.ui.ActionBar.n2) lmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                lmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((pm) obj).f36508c.e9(true);
                return;
            case 7:
                ((zi) obj).c(false);
                return;
            case 8:
                zn znVar2 = ((mn) obj).h;
                znVar2.getNotificationCenter().onAnimationFinish(znVar2.I9);
                return;
            case 9:
                zn znVar3 = ((rn) obj).h;
                znVar3.f40313j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(znVar3.f40313j0.getSearchField());
                if (znVar3.f40394pa > 0) {
                    rf rfVar = new rf(znVar3, 8);
                    znVar3.f40406qa = rfVar;
                    AndroidUtilities.runOnUIThread(rfVar, 200L);
                    return;
                }
                return;
            case 10:
                uo uoVar = ((qo) obj).f36864a;
                uoVar.e.setImageDrawable(uoVar.f38055r);
                uoVar.f38037b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = uoVar.D0;
                if (user != null) {
                    user.photo = null;
                    uoVar.getMessagesController().putUser(uoVar.D0, true);
                }
                uoVar.O0 = true;
                if (uoVar.R0 == null) {
                    uoVar.R0 = new org.telegram.ui.Components.ij0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                uoVar.f38037b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                uoVar.f38037b0.e.setAnimation(uoVar.R0);
                return;
            case 11:
                ((xq) obj).run(0);
                return;
            case 12:
                ((yr) obj).invalidateSelf();
                return;
            case 13:
                hs hsVar = (hs) obj;
                ArrayList arrayList = hsVar.f34226c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                hsVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((ys) obj).f39891a;
                contactsActivity.Z.f22787r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f22787r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((ot) obj).f36238a.p();
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
                uy uyVar = ((sw) obj).B0;
                uyVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) uyVar, 9, true));
                uyVar.f38253z0.setIsEditing(false);
                uyVar.I4(false);
                return;
            case 23:
                uy uyVar2 = ((tw) obj).f37815b;
                uyVar2.f38253z0.setIsEditing(true);
                uyVar2.I4(true);
                return;
            case 24:
                ((uw) obj).f38112a.f38155f0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                uy uyVar3 = ((iy) obj).f34638a;
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
                ArrayList arrayList2 = gzVar.f33977x;
                ArrayList arrayList3 = gzVar.f33976w;
                if (gzVar.f33974r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = gzVar.f33974r;
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
                            } catch (JSONException e) {
                                e = e;
                                gzVar.f33974r = 0;
                                gzVar.v = null;
                                gzVar.f33975s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                gzVar.f33978y = null;
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
                        tL_messages_setTyping.peer = MessagesController.getInstance(gzVar.f33970b).getInputPeer(gzVar.I);
                        ConnectionsManager.getInstance(gzVar.f33970b).sendRequest(tL_messages_setTyping, null);
                        gzVar.f33974r = 0;
                        gzVar.v = null;
                        gzVar.f33975s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                gzVar.f33978y = null;
                return;
            case 28:
                ((c00) obj).e0(true);
                return;
            default:
                ((a00) obj).f38636a.getBackground().setState(new int[0]);
                return;
        }
    }
}
