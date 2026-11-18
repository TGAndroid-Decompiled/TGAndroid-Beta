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
public final class bh implements Runnable {
    public final int f45855a;
    public final Object f45856b;

    public bh(Object obj, int i7) {
        this.f45855a = i7;
        this.f45856b = obj;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f45855a;
        int i14 = 0;
        Object obj = this.f45856b;
        switch (i13) {
            case 0:
                ((m6) obj).a(Boolean.FALSE, null);
                return;
            case 1:
                hi.y4 y4Var = (hi.y4) obj;
                i7 = ((org.telegram.ui.ActionBar.h2) ((bn) y4Var.f15766e)).currentAccount;
                org.telegram.messenger.ks.f(i7).j(y4Var.f15764b);
                return;
            case 2:
                ki kiVar = (ki) obj;
                i10 = ((org.telegram.ui.ActionBar.h2) ((bn) kiVar.f49283e)).currentAccount;
                org.telegram.messenger.ks.f(i10).j(kiVar.f49282c);
                return;
            case 3:
                bn.f2(((bj) obj).G3);
                return;
            case 4:
                ((ej) obj).T.D0.O(false);
                return;
            case 5:
                ((org.telegram.messenger.fj) obj).f23988q = false;
                return;
            case 6:
                Bundle bundle = new Bundle();
                kl klVar = ((el) obj).f47253c.f47687a;
                i11 = ((org.telegram.ui.ActionBar.h2) klVar.R).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.j10.i(i11).f24789n);
                klVar.R.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((ml) obj).f49850b.D9(true);
                return;
            case 8:
                ((hi) obj).c(false);
                return;
            case 9:
                bn bnVar = ((nm) obj).h;
                bnVar.getNotificationCenter().j(bnVar.fa);
                return;
            case 10:
                bn bnVar2 = ((tm) obj).f52300b;
                bnVar2.f46058k0.getSearchField().requestFocus();
                org.telegram.messenger.g0.I3(bnVar2.f46058k0.getSearchField());
                if (bnVar2.Ma > 0) {
                    af afVar = new af(bnVar2, 9);
                    bnVar2.Na = afVar;
                    org.telegram.messenger.g0.h3(afVar, 200L);
                    return;
                }
                return;
            case 11:
                rn rnVar = ((pn) obj).f50869a;
                rnVar.f51671e.setImageDrawable(rnVar.f51686r);
                rnVar.f51669c0.o(2131232049, org.telegram.messenger.gd.M0(2131752201, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.D0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().e4(rnVar.D0, true, false);
                }
                rnVar.P0 = true;
                if (rnVar.S0 == null) {
                    rnVar.S0 = new org.telegram.ui.Components.mh0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.f51669c0.f31137e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.f51669c0.f31137e.setAnimation(rnVar.S0);
                return;
            case 12:
                ((wp) obj).a(0);
                return;
            case 13:
                ((xq) obj).invalidateSelf();
                return;
            case 14:
                fr frVar = (fr) obj;
                ArrayList arrayList = frVar.f47746c;
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
                ((js) obj).f49050a.o();
                return;
            case 17:
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) obj;
                org.telegram.ui.ActionBar.x2 x2Var = x2VarArr[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                    x2VarArr[0] = null;
                    return;
                }
                return;
            case 18:
                org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(((org.telegram.messenger.c) obj).f23218a);
                q10.getMessagesStorage().f27052a.c(new org.telegram.messenger.x5(q10, 0));
                return;
            case 19:
                ((org.telegram.ui.Cells.c3) obj).updateColors();
                return;
            case 20:
                ((org.telegram.ui.Cells.oa) obj).updateColors();
                return;
            case 21:
                ((org.telegram.ui.Cells.m) obj).updateColors();
                return;
            case 22:
                ((cx) ((dv) obj).f46979b).f46668g0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                cx cxVar = ((ow) obj).f50627a;
                i12 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.j10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                cxVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                cx cxVar2 = ((rw) obj).I0;
                cxVar2.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) cxVar2, 9, true));
                cxVar2.A0.setIsEditing(false);
                cxVar2.c5(false);
                return;
            case 25:
                cx cxVar3 = ((tw) obj).f52363b;
                cxVar3.A0.setIsEditing(true);
                cxVar3.c5(true);
                return;
            case 26:
                ((kx) obj).removeSelfFromStack();
                return;
            case 27:
                nx nxVar = (nx) obj;
                ArrayList arrayList2 = nxVar.f50335y;
                ArrayList arrayList3 = nxVar.f50334x;
                if (nxVar.f50331r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = nxVar.f50331r;
                    tL_sendMessageEmojiInteraction.emoticon = nxVar.f50333w;
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
                                nxVar.f50331r = 0;
                                nxVar.f50333w = null;
                                nxVar.f50332s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                nxVar.E = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = nxVar.K;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.mp.u1(nxVar.f50326b).l1(nxVar.J);
                        ConnectionsManager.getInstance(nxVar.f50326b).sendRequest(tL_messages_setTyping, null);
                        nxVar.f50331r = 0;
                        nxVar.f50333w = null;
                        nxVar.f50332s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                nxVar.E = null;
                return;
            case 28:
                ((ky) obj).j0(true);
                return;
            default:
                ((iy) obj).f46999a.getBackground().setState(new int[0]);
                return;
        }
    }
}
