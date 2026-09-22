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
    public final int f33035a;
    public final Object f33036b;

    public dj(Object obj, int i10) {
        this.f33035a = i10;
        this.f33036b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f33035a;
        int i14 = 0;
        Object obj = this.f33036b;
        switch (i13) {
            case 0:
                ej ejVar = (ej) obj;
                i10 = ((org.telegram.ui.ActionBar.n2) ((bo) ejVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(ejVar.f33361c);
                return;
            case 1:
                bo.X1(((uj) obj).y3);
                return;
            case 2:
                ((xj) obj).T.A0.O(false);
                return;
            case 3:
                xi xiVar = (xi) obj;
                bo boVar = xiVar.f39636b;
                if (boVar.f32286e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(boVar.f32286e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new t4(xiVar, 19));
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
                nm nmVar = ((dm) obj).f33051c.f33375a;
                i11 = ((org.telegram.ui.ActionBar.n2) nmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                nmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((rm) obj).f37167c.e9(true);
                return;
            case 7:
                ((aj) obj).c(false);
                return;
            case 8:
                bo boVar2 = ((on) obj).h;
                boVar2.getNotificationCenter().onAnimationFinish(boVar2.I9);
                return;
            case 9:
                bo boVar3 = ((tn) obj).h;
                boVar3.f32344j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(boVar3.f32344j0.getSearchField());
                if (boVar3.f32425pa > 0) {
                    qf qfVar = new qf(boVar3, 9);
                    boVar3.f32437qa = qfVar;
                    AndroidUtilities.runOnUIThread(qfVar, 200L);
                    return;
                }
                return;
            case 10:
                wo woVar = ((so) obj).f37426a;
                woVar.e.setImageDrawable(woVar.f39286r);
                woVar.f39268b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = woVar.D0;
                if (user != null) {
                    user.photo = null;
                    woVar.getMessagesController().putUser(woVar.D0, true);
                }
                woVar.O0 = true;
                if (woVar.R0 == null) {
                    woVar.R0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                woVar.f39268b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                woVar.f39268b0.e.setAnimation(woVar.R0);
                return;
            case 11:
                ((zq) obj).run(0);
                return;
            case 12:
                ((yr) obj).invalidateSelf();
                return;
            case 13:
                hs hsVar = (hs) obj;
                ArrayList arrayList = hsVar.f34348c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                hsVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((ys) obj).f39954a;
                contactsActivity.Z.f22569r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f22569r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((ot) obj).f36339a.p();
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
                ((org.telegram.ui.Cells.xa) obj).b();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 22:
                uy uyVar = ((sw) obj).B0;
                uyVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) uyVar, 9, true));
                uyVar.f38326z0.setIsEditing(false);
                uyVar.I4(false);
                return;
            case 23:
                uy uyVar2 = ((tw) obj).f37741b;
                uyVar2.f38326z0.setIsEditing(true);
                uyVar2.I4(true);
                return;
            case 24:
                ((uw) obj).f38185a.f38228f0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                uy uyVar3 = ((iy) obj).f34732a;
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
                ArrayList arrayList2 = gzVar.f33984x;
                ArrayList arrayList3 = gzVar.f33983w;
                if (gzVar.f33981r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = gzVar.f33981r;
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
                                gzVar.f33981r = 0;
                                gzVar.v = null;
                                gzVar.f33982s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                gzVar.f33985y = null;
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
                        tL_messages_setTyping.peer = MessagesController.getInstance(gzVar.f33977b).getInputPeer(gzVar.I);
                        ConnectionsManager.getInstance(gzVar.f33977b).sendRequest(tL_messages_setTyping, null);
                        gzVar.f33981r = 0;
                        gzVar.v = null;
                        gzVar.f33982s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                gzVar.f33985y = null;
                return;
            case 28:
                ((c00) obj).e0(true);
                return;
            default:
                ((a00) obj).f38648a.getBackground().setState(new int[0]);
                return;
        }
    }
}
