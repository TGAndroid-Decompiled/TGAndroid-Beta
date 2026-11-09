package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class dh implements Runnable {
    public final int f44982a;
    public final Object f44983b;

    public dh(Object obj, int i7) {
        this.f44982a = i7;
        this.f44983b = obj;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f44982a;
        int i14 = 0;
        Object obj = this.f44983b;
        switch (i13) {
            case 0:
                ((n6) obj).a(Boolean.FALSE, null);
                return;
            case 1:
                fi.b5 b5Var = (fi.b5) obj;
                i7 = ((org.telegram.ui.ActionBar.f2) ((cn) b5Var.f11680e)).currentAccount;
                org.telegram.messenger.qs.f(i7).j(b5Var.f11678b);
                return;
            case 2:
                li liVar = (li) obj;
                i10 = ((org.telegram.ui.ActionBar.f2) ((cn) liVar.f47626e)).currentAccount;
                org.telegram.messenger.qs.f(i10).j(liVar.f47625c);
                return;
            case 3:
                cn.f2(((cj) obj).F3);
                return;
            case 4:
                ((fj) obj).T.C0.O(false);
                return;
            case 5:
                ((org.telegram.messenger.ij) obj).f23283q = false;
                return;
            case 6:
                Bundle bundle = new Bundle();
                ll llVar = ((fl) obj).f45739c.f46031a;
                i11 = ((org.telegram.ui.ActionBar.f2) llVar.Q).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.p10.i(i11).f24489n);
                llVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((nl) obj).f48204b.C9(true);
                return;
            case 8:
                ((ji) obj).c(false);
                return;
            case 9:
                cn cnVar = ((om) obj).h;
                cnVar.getNotificationCenter().j(cnVar.f44429da);
                return;
            case 10:
                cn cnVar2 = ((um) obj).f50425b;
                cnVar2.f44499j0.getSearchField().requestFocus();
                org.telegram.messenger.g0.K3(cnVar2.f44499j0.getSearchField());
                if (cnVar2.Ka > 0) {
                    af afVar = new af(cnVar2, 9);
                    cnVar2.La = afVar;
                    org.telegram.messenger.g0.i3(afVar, 200L);
                    return;
                }
                return;
            case 11:
                rn rnVar = ((pn) obj).f48762a;
                rnVar.f49516e.setImageDrawable(rnVar.f49531r);
                rnVar.f49512b0.o(2131232047, org.telegram.messenger.id.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.C0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().X3(rnVar.C0, true, false);
                }
                rnVar.O0 = true;
                if (rnVar.R0 == null) {
                    rnVar.R0 = new org.telegram.ui.Components.ah0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.f49512b0.f29574e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.f49512b0.f29574e.setAnimation(rnVar.R0);
                return;
            case 12:
                ((vp) obj).a(0);
                return;
            case 13:
                ((wq) obj).invalidateSelf();
                return;
            case 14:
                er erVar = (er) obj;
                ArrayList arrayList = erVar.f45488c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                erVar.invalidateSelf();
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((is) obj).f46750a.o();
                return;
            case 17:
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) obj;
                org.telegram.ui.ActionBar.v2 v2Var = v2VarArr[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                    v2VarArr[0] = null;
                    return;
                }
                return;
            case 18:
                org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(((org.telegram.messenger.c) obj).f21765a);
                q10.getMessagesStorage().f26719a.c(new org.telegram.messenger.w5(q10, 0));
                return;
            case 19:
                ((org.telegram.ui.Cells.b3) obj).updateColors();
                return;
            case 20:
                ((org.telegram.ui.Cells.ma) obj).updateColors();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).updateColors();
                return;
            case 22:
                ((yw) ((w9) obj).f50987b).f52237f0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                yw ywVar = ((lw) obj).f47688a;
                i12 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.p10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                ywVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                yw ywVar2 = ((ow) obj).B0;
                ywVar2.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) ywVar2, 9, true));
                ywVar2.f52337z0.setIsEditing(false);
                ywVar2.U4(false);
                return;
            case 25:
                yw ywVar3 = ((pw) obj).f48821b;
                ywVar3.f52337z0.setIsEditing(true);
                ywVar3.U4(true);
                return;
            case 26:
                ((gx) obj).removeSelfFromStack();
                return;
            case 27:
                kx kxVar = (kx) obj;
                ArrayList arrayList2 = kxVar.f47396y;
                ArrayList arrayList3 = kxVar.f47395x;
                if (kxVar.f47392r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = kxVar.f47392r;
                    tL_sendMessageEmojiInteraction.emoticon = kxVar.f47394w;
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
                            } catch (JSONException e10) {
                                e = e10;
                                kxVar.f47392r = 0;
                                kxVar.f47394w = null;
                                kxVar.f47393s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                kxVar.D = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = kxVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.qp.s1(kxVar.f47387b).j1(kxVar.I);
                        ConnectionsManager.getInstance(kxVar.f47387b).sendRequest(tL_messages_setTyping, null);
                        kxVar.f47392r = 0;
                        kxVar.f47394w = null;
                        kxVar.f47393s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                kxVar.D = null;
                return;
            case 28:
                ((iy) obj).j0(true);
                return;
            default:
                ((gy) obj).f43816a.getBackground().setState(new int[0]);
                return;
        }
    }
}
