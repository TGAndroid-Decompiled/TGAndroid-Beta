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
public final class ej implements Runnable {
    public final int f33414a;
    public final Object f33415b;

    public ej(Object obj, int i10) {
        this.f33414a = i10;
        this.f33415b = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f33414a;
        int i14 = 0;
        Object obj = this.f33415b;
        switch (i13) {
            case 0:
                fj fjVar = (fj) obj;
                i10 = ((org.telegram.ui.ActionBar.o2) ((bo) fjVar.e)).currentAccount;
                NotificationCenter.getInstance(i10).onAnimationFinish(fjVar.f33701c);
                return;
            case 1:
                bo.X1(((vj) obj).y3);
                return;
            case 2:
                ((yj) obj).T.A0.O(false);
                return;
            case 3:
                yi yiVar = (yi) obj;
                bo boVar = yiVar.f39923b;
                if (boVar.f32268e2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(boVar.f32268e2, View.ALPHA, 0.0f));
                    animatorSet.addListener(new t4(yiVar, 19));
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
                nm nmVar = ((dm) obj).f33186c.f33441a;
                i11 = ((org.telegram.ui.ActionBar.o2) nmVar.Q).currentAccount;
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                nmVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                ((rm) obj).f37260c.e9(true);
                return;
            case 7:
                ((bj) obj).c(false);
                return;
            case 8:
                bo boVar2 = ((on) obj).h;
                boVar2.getNotificationCenter().onAnimationFinish(boVar2.I9);
                return;
            case 9:
                bo boVar3 = ((tn) obj).h;
                boVar3.f32327j0.getSearchField().requestFocus();
                AndroidUtilities.showKeyboard(boVar3.f32327j0.getSearchField());
                if (boVar3.f32408pa > 0) {
                    sf sfVar = new sf(boVar3, 9);
                    boVar3.f32420qa = sfVar;
                    AndroidUtilities.runOnUIThread(sfVar, 200L);
                    return;
                }
                return;
            case 10:
                wo woVar = ((so) obj).f37532a;
                woVar.e.setImageDrawable(woVar.f39103r);
                woVar.f39085b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                TLRPC.User user = woVar.D0;
                if (user != null) {
                    user.photo = null;
                    woVar.getMessagesController().putUser(woVar.D0, true);
                }
                woVar.O0 = true;
                if (woVar.R0 == null) {
                    woVar.R0 = new org.telegram.ui.Components.yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                }
                woVar.f39085b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                woVar.f39085b0.e.setAnimation(woVar.R0);
                return;
            case 11:
                ((zq) obj).run(0);
                return;
            case 12:
                ((as) obj).invalidateSelf();
                return;
            case 13:
                js jsVar = (js) obj;
                ArrayList arrayList = jsVar.f34924c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                jsVar.invalidateSelf();
                return;
            case 14:
                ContactsActivity contactsActivity = ((at) obj).f31976a;
                contactsActivity.Z.f22543r.requestFocus();
                AndroidUtilities.showKeyboard(contactsActivity.Z.f22543r);
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((qt) obj).f37017a.p();
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
                ((org.telegram.ui.Cells.z2) obj).d();
                return;
            case 20:
                ((org.telegram.ui.Cells.xa) obj).b();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).a();
                return;
            case 22:
                wy wyVar = ((uw) obj).B0;
                wyVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) wyVar, 9, true));
                wyVar.f39320z0.setIsEditing(false);
                wyVar.I4(false);
                return;
            case 23:
                wy wyVar2 = ((vw) obj).f38511b;
                wyVar2.f39320z0.setIsEditing(true);
                wyVar2.I4(true);
                return;
            case 24:
                ((ww) obj).f39179a.f39221f0.setAlpha(1.0f);
                return;
            case 25:
                Bundle bundle2 = new Bundle();
                wy wyVar3 = ((ky) obj).f35375a;
                i12 = ((org.telegram.ui.ActionBar.o2) wyVar3).currentAccount;
                bundle2.putLong("user_id", UserConfig.getInstance(i12).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                wyVar3.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 26:
                ((fz) obj).removeSelfFromStack();
                return;
            case 27:
                iz izVar = (iz) obj;
                ArrayList arrayList2 = izVar.f34724x;
                ArrayList arrayList3 = izVar.f34723w;
                if (izVar.f34721r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = izVar.f34721r;
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
                                izVar.f34721r = 0;
                                izVar.v = null;
                                izVar.f34722s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                FileLog.e(e);
                                izVar.f34725y = null;
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
                        tL_messages_setTyping.peer = MessagesController.getInstance(izVar.f34717b).getInputPeer(izVar.I);
                        ConnectionsManager.getInstance(izVar.f34717b).sendRequest(tL_messages_setTyping, null);
                        izVar.f34721r = 0;
                        izVar.v = null;
                        izVar.f34722s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e7) {
                        e = e7;
                    }
                }
                izVar.f34725y = null;
                return;
            case 28:
                ((e00) obj).e0(true);
                return;
            default:
                ((c00) obj).f39727a.getBackground().setState(new int[0]);
                return;
        }
    }
}
