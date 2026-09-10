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
public final class fj implements Runnable {
    public final int f32848a;
    public final Object f32849b;

    public fj(Object obj, int i10) {
        this.f32848a = i10;
        this.f32849b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f32848a;
        int i14 = 0;
        Object obj = this.f32849b;
        switch (i13) {
            case 0:
                gj gjVar = (gj) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((eo) gjVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(gjVar.f33124c);
                return;
            case 1:
                eo.X1(((wj) obj).y3);
                return;
            case 2:
                ((zj) obj).T.A0.O(false);
                return;
            case 3:
                zi ziVar = (zi) obj;
                eo eoVar = ziVar.f39353b;
                if (eoVar.f32309e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(eoVar.f32309e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new org.telegram.ui.Cells.v5(ziVar, 9));
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
                pm pmVar = ((fm) obj).f32865c.f33136a;
                i11 = ((org.telegram.ui.ActionBar.p2) pmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                pmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((tm) obj).f36965c.e9(true);
                return;
            case 7:
                ((cj) obj).c(false);
                return;
            case 8:
                eo eoVar2 = ((qn) obj).h;
                eoVar2.getNotificationCenter().onAnimationFinish(eoVar2.I9);
                return;
            case 9:
                eo eoVar3 = ((vn) obj).h;
                eoVar3.f32367j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(eoVar3.f32367j0.getSearchField());
                if (eoVar3.f32448pa > 0) {
                    sf sfVar = new sf(eoVar3, 9);
                    eoVar3.f32460qa = sfVar;
                    AndroidUtilities.runOnUIThread(sfVar, 200L);
                    return;
                }
                return;
            case 10:
                yo yoVar = ((uo) obj).f37301a;
                yoVar.e.setImageDrawable(yoVar.f39060r);
                yoVar.f39042b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = yoVar.D0;
                if (user != null) {
                    user.photo = null;
                    yoVar.getMessagesController().putUser(yoVar.D0, true);
                }
                yoVar.O0 = true;
                if (yoVar.R0 == null) {
                    yoVar.R0 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                yoVar.f39042b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                yoVar.f39042b0.e.setAnimation(yoVar.R0);
                return;
            case 11:
                ((br) obj).run(0);
                return;
            case 12:
                ((as) obj).invalidateSelf();
                return;
            case 13:
                is isVar = (is) obj;
                ArrayList arrayList = isVar.f33789c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                isVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((zs) obj).f39436a;
                contactsActivity.Z.f24572r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f24572r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((pt) obj).f35899a.p();
                return;
            case 17:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
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
                wy wyVar = ((uw) obj).B0;
                wyVar.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) wyVar, 9, true));
                wyVar.f38536z0.setIsEditing(false);
                wyVar.I4(false);
                return;
            case 23:
                wy wyVar2 = ((vw) obj).f37634b;
                wyVar2.f38536z0.setIsEditing(true);
                wyVar2.I4(true);
                return;
            case 24:
                ((ww) obj).f38395a.f38437f0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                wy wyVar3 = ((ky) obj).f34472a;
                i12 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                wyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 26:
                ((fz) obj).removeSelfFromStack();
                return;
            case 27:
                iz izVar = (iz) obj;
                ArrayList arrayList2 = izVar.f33823x;
                ArrayList arrayList3 = izVar.f33822w;
                if (izVar.f33820r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = izVar.f33820r;
                    tL_sendMessageEmojiInteraction.emoticon = izVar.v;
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
                                izVar.f33820r = 0;
                                izVar.v = null;
                                izVar.f33821s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                izVar.f33824y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = izVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(izVar.f33816b).getInputPeer(izVar.I);
                        ConnectionsManager.getInstance(izVar.f33816b).sendRequest(tL_messages_setTyping, null);
                        izVar.f33820r = 0;
                        izVar.v = null;
                        izVar.f33821s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                izVar.f33824y = null;
                return;
            case 28:
                ((e00) obj).e0(true);
                return;
            default:
                ((c00) obj).f38842a.getBackground().setState(new int[0]);
                return;
        }
    }
}
