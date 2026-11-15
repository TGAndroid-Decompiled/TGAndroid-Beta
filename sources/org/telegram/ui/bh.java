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
    public final int f45742a;
    public final Object f45743b;

    public bh(Object obj, int i7) {
        this.f45742a = i7;
        this.f45743b = obj;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f45742a;
        int i14 = 0;
        Object obj = this.f45743b;
        switch (i13) {
            case 0:
                ((n6) obj).a(Boolean.FALSE, null);
                return;
            case 1:
                hi.z4 z4Var = (hi.z4) obj;
                i7 = ((org.telegram.ui.ActionBar.e2) ((an) z4Var.f15502e)).currentAccount;
                org.telegram.messenger.ns.f(i7).j(z4Var.f15500b);
                return;
            case 2:
                ji jiVar = (ji) obj;
                i10 = ((org.telegram.ui.ActionBar.e2) ((an) jiVar.f48348e)).currentAccount;
                org.telegram.messenger.ns.f(i10).j(jiVar.f48347c);
                return;
            case 3:
                an.f2(((aj) obj).G3);
                return;
            case 4:
                ((dj) obj).T.D0.O(false);
                return;
            case 5:
                ((org.telegram.messenger.gj) obj).f23842q = false;
                return;
            case 6:
                Bundle bundle = new Bundle();
                jl jlVar = ((dl) obj).f46393c.f46852a;
                i11 = ((org.telegram.ui.ActionBar.e2) jlVar.R).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.m10.i(i11).f24959n);
                jlVar.R.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((ll) obj).f48998b.D9(true);
                return;
            case 8:
                ((hi) obj).c(false);
                return;
            case 9:
                an anVar = ((mm) obj).h;
                anVar.getNotificationCenter().j(anVar.f45183ea);
                return;
            case 10:
                an anVar2 = ((sm) obj).f51244b;
                anVar2.f45252k0.getSearchField().requestFocus();
                org.telegram.messenger.g0.J3(anVar2.f45252k0.getSearchField());
                if (anVar2.La > 0) {
                    ye yeVar = new ye(anVar2, 10);
                    anVar2.Ma = yeVar;
                    org.telegram.messenger.g0.i3(yeVar, 200L);
                    return;
                }
                return;
            case 11:
                qn qnVar = ((on) obj).f50005a;
                qnVar.f50667e.setImageDrawable(qnVar.f50682r);
                qnVar.f50665c0.o(2131232048, org.telegram.messenger.hd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = qnVar.D0;
                if (user != null) {
                    user.photo = null;
                    qnVar.getMessagesController().X3(qnVar.D0, true, false);
                }
                qnVar.P0 = true;
                if (qnVar.S0 == null) {
                    qnVar.S0 = new org.telegram.ui.Components.ch0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                qnVar.f50665c0.f30656e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                qnVar.f50665c0.f30656e.setAnimation(qnVar.S0);
                return;
            case 12:
                ((vp) obj).a(0);
                return;
            case 13:
                ((wq) obj).invalidateSelf();
                return;
            case 14:
                er erVar = (er) obj;
                ArrayList arrayList = erVar.f46885c;
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
                ((js) obj).f48406a.o();
                return;
            case 17:
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) obj;
                org.telegram.ui.ActionBar.u2 u2Var = u2VarArr[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                    u2VarArr[0] = null;
                    return;
                }
                return;
            case 18:
                org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(((org.telegram.messenger.c) obj).f22782a);
                q10.getMessagesStorage().f27219a.c(new org.telegram.messenger.w5(q10, 0));
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
                ((yw) ((p9) obj).f50161b).f53643g0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                yw ywVar = ((lw) obj).f49045a;
                i12 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.m10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                ywVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                yw ywVar2 = ((ow) obj).C0;
                ywVar2.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) ywVar2, 9, true));
                ywVar2.A0.setIsEditing(false);
                ywVar2.U4(false);
                return;
            case 25:
                yw ywVar3 = ((pw) obj).f50376b;
                ywVar3.A0.setIsEditing(true);
                ywVar3.U4(true);
                return;
            case 26:
                ((gx) obj).removeSelfFromStack();
                return;
            case 27:
                jx jxVar = (jx) obj;
                ArrayList arrayList2 = jxVar.f48444y;
                ArrayList arrayList3 = jxVar.f48443x;
                if (jxVar.f48440r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = jxVar.f48440r;
                    tL_sendMessageEmojiInteraction.emoticon = jxVar.f48442w;
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
                                jxVar.f48440r = 0;
                                jxVar.f48442w = null;
                                jxVar.f48441s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                jxVar.E = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = jxVar.K;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.np.s1(jxVar.f48435b).j1(jxVar.J);
                        ConnectionsManager.getInstance(jxVar.f48435b).sendRequest(tL_messages_setTyping, null);
                        jxVar.f48440r = 0;
                        jxVar.f48442w = null;
                        jxVar.f48441s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                jxVar.E = null;
                return;
            case 28:
                ((hy) obj).j0(true);
                return;
            default:
                ((fy) obj).f54043a.getBackground().setState(new int[0]);
                return;
        }
    }
}
