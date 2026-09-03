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
public final class bj implements Runnable {
    public final int f32897a;
    public final Object f32898b;

    public bj(Object obj, int i10) {
        this.f32897a = i10;
        this.f32898b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f32897a;
        int i14 = 0;
        Object obj = this.f32898b;
        switch (i13) {
            case 0:
                cj cjVar = (cj) obj;
                i10 = ((org.telegram.ui.ActionBar.p2) ((zn) cjVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(cjVar.f33166c);
                return;
            case 1:
                zn.X1(((sj) obj).f38254v3);
                return;
            case 2:
                ((vj) obj).T.f40800x0.O(false);
                return;
            case 3:
                vi viVar = (vi) obj;
                zn znVar = viVar.f39116b;
                if (znVar.f40526b2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(znVar.f40526b2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new u5(viVar, 18));
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
                lm lmVar = ((cm) obj).f33191c.f33499a;
                i11 = ((org.telegram.ui.ActionBar.p2) lmVar.N).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                lmVar.N.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((pm) obj).f37186c.e9(true);
                return;
            case 7:
                ((yi) obj).c(false);
                return;
            case 8:
                zn znVar2 = ((mn) obj).h;
                znVar2.getNotificationCenter().onAnimationFinish(znVar2.F9);
                return;
            case 9:
                zn znVar3 = ((rn) obj).h;
                znVar3.f40588g0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(znVar3.f40588g0.getSearchField());
                if (znVar3.f40670ma > 0) {
                    nf nfVar = new nf(znVar3, 9);
                    znVar3.f40684na = nfVar;
                    AndroidUtilities.runOnUIThread(nfVar, 200L);
                    return;
                }
                return;
            case 10:
                ro roVar = ((po) obj).f37201a;
                roVar.e.setImageDrawable(roVar.f37921r);
                roVar.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = roVar.A0;
                if (user != null) {
                    user.photo = null;
                    roVar.getMessagesController().putUser(roVar.A0, true);
                }
                roVar.L0 = true;
                if (roVar.O0 == null) {
                    roVar.O0 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                roVar.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                roVar.Y.e.setAnimation(roVar.O0);
                return;
            case 11:
                ((vq) obj).run(0);
                return;
            case 12:
                ((vr) obj).invalidateSelf();
                return;
            case 13:
                es esVar = (es) obj;
                ArrayList arrayList = esVar.f33845c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                esVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((ws) obj).f39766a;
                contactsActivity.W.f24117r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.W.f24117r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((nt) obj).f36580a.p();
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
                ((org.telegram.ui.Cells.y2) obj).d();
                return;
            case 20:
                ((org.telegram.ui.Cells.ra) obj).b();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 22:
                qy qyVar = ((pw) obj).f37238y0;
                qyVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) qyVar, 9, true));
                qyVar.f37633w0.setIsEditing(false);
                qyVar.I4(false);
                return;
            case 23:
                qy qyVar2 = ((qw) obj).f37510b;
                qyVar2.f37633w0.setIsEditing(true);
                qyVar2.I4(true);
                return;
            case 24:
                ((rw) obj).f38065a.f37533c0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                qy qyVar3 = ((ey) obj).f33878a;
                i12 = ((org.telegram.ui.ActionBar.p2) qyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                qyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 26:
                ((zy) obj).removeSelfFromStack();
                return;
            case 27:
                dz dzVar = (dz) obj;
                ArrayList arrayList2 = dzVar.f33565x;
                ArrayList arrayList3 = dzVar.f33564w;
                if (dzVar.f33562r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = dzVar.f33562r;
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
                                dzVar.f33562r = 0;
                                dzVar.v = null;
                                dzVar.f33563s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                dzVar.f33566y = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j10 = dzVar.G;
                        if (j10 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j10;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = MessagesController.getInstance(dzVar.f33558b).getInputPeer(dzVar.F);
                        ConnectionsManager.getInstance(dzVar.f33558b).sendRequest(tL_messages_setTyping, null);
                        dzVar.f33562r = 0;
                        dzVar.v = null;
                        dzVar.f33563s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e6) {
                        e = e6;
                    }
                }
                dzVar.f33566y = null;
                return;
            case 28:
                ((a00) obj).e0(true);
                return;
            default:
                ((yz) obj).f38614a.getBackground().setState(new int[0]);
                return;
        }
    }
}
