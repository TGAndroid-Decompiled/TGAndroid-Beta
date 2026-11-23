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
public final class ch implements Runnable {
    public final int f46795a;
    public final Object f46796b;

    public ch(Object obj, int i7) {
        this.f46795a = i7;
        this.f46796b = obj;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f46795a;
        int i14 = 0;
        Object obj = this.f46796b;
        switch (i13) {
            case 0:
                ((n6) obj).a(Boolean.FALSE, null);
                return;
            case 1:
                bi.z0 z0Var = (bi.z0) obj;
                i7 = ((org.telegram.ui.ActionBar.g2) ((bn) z0Var.f4282e)).currentAccount;
                org.telegram.messenger.ks.f(i7).j(z0Var.f4280b);
                return;
            case 2:
                ki kiVar = (ki) obj;
                i10 = ((org.telegram.ui.ActionBar.g2) ((bn) kiVar.f49434e)).currentAccount;
                org.telegram.messenger.ks.f(i10).j(kiVar.f49433c);
                return;
            case 3:
                bn.f2(((bj) obj).G3);
                return;
            case 4:
                ((ej) obj).T.D0.O(false);
                return;
            case 5:
                ((org.telegram.messenger.fj) obj).f24096q = false;
                return;
            case 6:
                Bundle bundle = new Bundle();
                kl klVar = ((el) obj).f47572c.f47911a;
                i11 = ((org.telegram.ui.ActionBar.g2) klVar.R).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.i10.i(i11).f24656n);
                klVar.R.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((ml) obj).f50076b.D9(true);
                return;
            case 8:
                ((hi) obj).c(false);
                return;
            case 9:
                bn bnVar = ((nm) obj).h;
                bnVar.getNotificationCenter().j(bnVar.fa);
                return;
            case 10:
                bn bnVar2 = ((tm) obj).f52426b;
                bnVar2.f46253k0.getSearchField().requestFocus();
                org.telegram.messenger.g0.I3(bnVar2.f46253k0.getSearchField());
                if (bnVar2.Ma > 0) {
                    af afVar = new af(bnVar2, 9);
                    bnVar2.Na = afVar;
                    org.telegram.messenger.g0.h3(afVar, 200L);
                    return;
                }
                return;
            case 11:
                rn rnVar = ((pn) obj).f51082a;
                rnVar.f51771e.setImageDrawable(rnVar.f51786r);
                rnVar.f51769c0.o(2131232052, org.telegram.messenger.gd.N0(2131752200, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.D0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().e4(rnVar.D0, true, false);
                }
                rnVar.P0 = true;
                if (rnVar.S0 == null) {
                    rnVar.S0 = new org.telegram.ui.Components.nh0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.f51769c0.f31176e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.f51769c0.f31176e.setAnimation(rnVar.S0);
                return;
            case 12:
                ((wp) obj).a(0);
                return;
            case 13:
                ((xq) obj).invalidateSelf();
                return;
            case 14:
                fr frVar = (fr) obj;
                ArrayList arrayList = frVar.f47949c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                frVar.invalidateSelf();
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((js) obj).f49201a.o();
                return;
            case 17:
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj;
                org.telegram.ui.ActionBar.w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    w2VarArr[0] = null;
                    return;
                }
                return;
            case 18:
                org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(((org.telegram.messenger.c) obj).f23343a);
                q10.getMessagesStorage().f27149a.c(new org.telegram.messenger.x5(q10, 0));
                return;
            case 19:
                ((org.telegram.ui.Cells.c3) obj).updateColors();
                return;
            case 20:
                ((org.telegram.ui.Cells.pa) obj).updateColors();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).updateColors();
                return;
            case 22:
                ((bx) ((cv) obj).f46882b).f46554g0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                bx bxVar = ((nw) obj).f50440a;
                i12 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.i10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                bxVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                bx bxVar2 = ((qw) obj).I0;
                bxVar2.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bxVar2, 9, true));
                bxVar2.A0.setIsEditing(false);
                bxVar2.c5(false);
                return;
            case 25:
                bx bxVar3 = ((sw) obj).f52164b;
                bxVar3.A0.setIsEditing(true);
                bxVar3.c5(true);
                return;
            case 26:
                ((jx) obj).removeSelfFromStack();
                return;
            case 27:
                mx mxVar = (mx) obj;
                ArrayList arrayList2 = mxVar.f50144y;
                ArrayList arrayList3 = mxVar.f50143x;
                if (mxVar.f50140r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = mxVar.f50140r;
                    tL_sendMessageEmojiInteraction.emoticon = mxVar.f50142w;
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
                                mxVar.f50140r = 0;
                                mxVar.f50142w = null;
                                mxVar.f50141s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                mxVar.E = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = mxVar.K;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.mp.u1(mxVar.f50135b).l1(mxVar.J);
                        ConnectionsManager.getInstance(mxVar.f50135b).sendRequest(tL_messages_setTyping, null);
                        mxVar.f50140r = 0;
                        mxVar.f50142w = null;
                        mxVar.f50141s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                mxVar.E = null;
                return;
            case 28:
                ((jy) obj).j0(true);
                return;
            default:
                ((hy) obj).f46896a.getBackground().setState(new int[0]);
                return;
        }
    }
}
