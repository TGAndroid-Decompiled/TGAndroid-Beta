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
    public final int f44350a;
    public final Object f44351b;

    public bh(Object obj, int i7) {
        this.f44350a = i7;
        this.f44351b = obj;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f44350a;
        int i14 = 0;
        Object obj = this.f44351b;
        switch (i13) {
            case 0:
                ((n6) obj).a(Boolean.FALSE, null);
                return;
            case 1:
                fi.b5 b5Var = (fi.b5) obj;
                i7 = ((org.telegram.ui.ActionBar.f2) ((an) b5Var.f11680e)).currentAccount;
                org.telegram.messenger.qs.f(i7).j(b5Var.f11678b);
                return;
            case 2:
                ji jiVar = (ji) obj;
                i10 = ((org.telegram.ui.ActionBar.f2) ((an) jiVar.f46985e)).currentAccount;
                org.telegram.messenger.qs.f(i10).j(jiVar.f46984c);
                return;
            case 3:
                an.e2(((aj) obj).F3);
                return;
            case 4:
                ((dj) obj).T.C0.O(false);
                return;
            case 5:
                ((org.telegram.messenger.ij) obj).f23265q = false;
                return;
            case 6:
                Bundle bundle = new Bundle();
                jl jlVar = ((dl) obj).f45090c.f45372a;
                i11 = ((org.telegram.ui.ActionBar.f2) jlVar.Q).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.p10.i(i11).f24486n);
                jlVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((ll) obj).f47557b.B9(true);
                return;
            case 8:
                ((hi) obj).c(false);
                return;
            case 9:
                an anVar = ((mm) obj).h;
                anVar.getNotificationCenter().j(anVar.f43741ba);
                return;
            case 10:
                an anVar2 = ((sm) obj).f49790b;
                anVar2.f43837j0.getSearchField().requestFocus();
                org.telegram.messenger.g0.K3(anVar2.f43837j0.getSearchField());
                if (anVar2.Ia > 0) {
                    af afVar = new af(anVar2, 9);
                    anVar2.Ja = afVar;
                    org.telegram.messenger.g0.i3(afVar, 200L);
                    return;
                }
                return;
            case 11:
                pn pnVar = ((nn) obj).f48091a;
                pnVar.f48863e.setImageDrawable(pnVar.f48878r);
                pnVar.f48859b0.o(2131232047, org.telegram.messenger.hd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = pnVar.C0;
                if (user != null) {
                    user.photo = null;
                    pnVar.getMessagesController().X3(pnVar.C0, true, false);
                }
                pnVar.O0 = true;
                if (pnVar.R0 == null) {
                    pnVar.R0 = new org.telegram.ui.Components.zg0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                pnVar.f48859b0.f29567e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                pnVar.f48859b0.f29567e.setAnimation(pnVar.R0);
                return;
            case 12:
                ((tp) obj).a(0);
                return;
            case 13:
                ((uq) obj).invalidateSelf();
                return;
            case 14:
                cr crVar = (cr) obj;
                ArrayList arrayList = crVar.f44873c;
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    ((View) obj2).invalidate();
                }
                crVar.invalidateSelf();
                return;
            case 15:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                return;
            case 16:
                ((gs) obj).f46087a.o();
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
                org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(((org.telegram.messenger.c) obj).f21729a);
                q10.getMessagesStorage().f26696a.c(new org.telegram.messenger.w5(q10, 0));
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
                ((ww) ((w9) obj).f51028b).f51555f0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                ww wwVar = ((jw) obj).f47047a;
                i12 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.p10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                wwVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                ww wwVar2 = ((mw) obj).B0;
                wwVar2.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) wwVar2, 9, true));
                wwVar2.f51654z0.setIsEditing(false);
                wwVar2.U4(false);
                return;
            case 25:
                ww wwVar3 = ((nw) obj).f48150b;
                wwVar3.f51654z0.setIsEditing(true);
                wwVar3.U4(true);
                return;
            case 26:
                ((ex) obj).removeSelfFromStack();
                return;
            case 27:
                ix ixVar = (ix) obj;
                ArrayList arrayList2 = ixVar.f46769y;
                ArrayList arrayList3 = ixVar.f46768x;
                if (ixVar.f46765r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = ixVar.f46765r;
                    tL_sendMessageEmojiInteraction.emoticon = ixVar.f46767w;
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
                                ixVar.f46765r = 0;
                                ixVar.f46767w = null;
                                ixVar.f46766s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                ixVar.D = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = ixVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.qp.s1(ixVar.f46760b).j1(ixVar.I);
                        ConnectionsManager.getInstance(ixVar.f46760b).sendRequest(tL_messages_setTyping, null);
                        ixVar.f46765r = 0;
                        ixVar.f46767w = null;
                        ixVar.f46766s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                ixVar.D = null;
                return;
            case 28:
                ((gy) obj).j0(true);
                return;
            default:
                ((ey) obj).f52355a.getBackground().setState(new int[0]);
                return;
        }
    }
}
