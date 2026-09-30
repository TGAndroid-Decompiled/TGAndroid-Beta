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
    public final int f32251a;
    public final Object f32252b;

    public aj(Object obj, int i10) {
        this.f32251a = i10;
        this.f32252b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f32251a;
        int i14 = 0;
        Object obj = this.f32252b;
        switch (i13) {
            case 0:
                bj bjVar = (bj) obj;
                i10 = ((org.telegram.ui.ActionBar.m2) ((wn) bjVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(bjVar.f32510c);
                return;
            case 1:
                wn.X1(((rj) obj).G3);
                return;
            case 2:
                ((uj) obj).T.A0.O(false);
                return;
            case 3:
                ui uiVar = (ui) obj;
                wn wnVar = uiVar.f38576b;
                if (wnVar.f39555e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(wnVar.f39555e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new t4(uiVar, 19));
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
                jm jmVar = ((zl) obj).f40643c.f32271a;
                i11 = ((org.telegram.ui.ActionBar.m2) jmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                jmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((nm) obj).f36040c.e9(true);
                return;
            case 7:
                ((xi) obj).c(false);
                return;
            case 8:
                wn wnVar2 = ((jn) obj).h;
                wnVar2.getNotificationCenter().onAnimationFinish(wnVar2.I9);
                return;
            case 9:
                wn wnVar3 = ((on) obj).h;
                wnVar3.f39613j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(wnVar3.f39613j0.getSearchField());
                if (wnVar3.f39694pa > 0) {
                    of ofVar = new of(wnVar3, 8);
                    wnVar3.f39706qa = ofVar;
                    AndroidUtilities.runOnUIThread(ofVar, 200L);
                    return;
                }
                return;
            case 10:
                ro roVar = ((no) obj).f36046a;
                roVar.e.setImageDrawable(roVar.f37503r);
                roVar.f37485b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = roVar.D0;
                if (user != null) {
                    user.photo = null;
                    roVar.getMessagesController().putUser(roVar.D0, true);
                }
                roVar.O0 = true;
                if (roVar.R0 == null) {
                    roVar.R0 = new org.telegram.ui.Components.lj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                roVar.f37485b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                roVar.f37485b0.e.setAnimation(roVar.R0);
                return;
            case 11:
                ((uq) obj).run(0);
                return;
            case 12:
                ((tr) obj).invalidateSelf();
                return;
            case 13:
                bs bsVar = (bs) obj;
                ArrayList arrayList = bsVar.f32556c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                bsVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((ss) obj).f37965a;
                contactsActivity.Z.f24137r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f24137r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((jt) obj).f34957a.p();
                return;
            case 17:
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
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
                qy qyVar = ((nw) obj).B0;
                qyVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) qyVar, 9, true));
                qyVar.f37238z0.setIsEditing(false);
                qyVar.I4(false);
                return;
            case 23:
                qy qyVar2 = ((pw) obj).f36786b;
                qyVar2.f37238z0.setIsEditing(true);
                qyVar2.I4(true);
                return;
            case 24:
                ((qw) obj).f37100a.f37140f0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                qy qyVar3 = ((ey) obj).f33567a;
                i12 = ((org.telegram.ui.ActionBar.m2) qyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                qyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 26:
                ((zy) obj).removeSelfFromStack();
                return;
            case 27:
                cz czVar = (cz) obj;
                ArrayList arrayList2 = czVar.f32906x;
                ArrayList arrayList3 = czVar.f32905w;
                if (czVar.f32903r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = czVar.f32903r;
                    tL_sendMessageEmojiInteraction.emoticon = czVar.v;
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
                                czVar.f32903r = 0;
                                czVar.v = null;
                                czVar.f32904s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                czVar.f32907y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = czVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(czVar.f32899b).getInputPeer(czVar.I);
                        ConnectionsManager.getInstance(czVar.f32899b).sendRequest(tL_messages_setTyping, null);
                        czVar.f32903r = 0;
                        czVar.v = null;
                        czVar.f32904s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                czVar.f32907y = null;
                return;
            case 28:
                ((yz) obj).e0(true);
                return;
            default:
                ((wz) obj).f37637a.getBackground().setState(new int[0]);
                return;
        }
    }
}
