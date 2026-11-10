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
    public final int f44981a;
    public final Object f44982b;

    public dh(Object obj, int i7) {
        this.f44981a = i7;
        this.f44982b = obj;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f44981a;
        int i14 = 0;
        Object obj = this.f44982b;
        switch (i13) {
            case 0:
                ((n6) obj).a(Boolean.FALSE, null);
                return;
            case 1:
                fi.b5 b5Var = (fi.b5) obj;
                i7 = ((org.telegram.ui.ActionBar.f2) ((cn) b5Var.f11685e)).currentAccount;
                org.telegram.messenger.qs.f(i7).j(b5Var.f11683b);
                return;
            case 2:
                li liVar = (li) obj;
                i10 = ((org.telegram.ui.ActionBar.f2) ((cn) liVar.f47618e)).currentAccount;
                org.telegram.messenger.qs.f(i10).j(liVar.f47617c);
                return;
            case 3:
                cn.f2(((cj) obj).F3);
                return;
            case 4:
                ((fj) obj).T.C0.O(false);
                return;
            case 5:
                ((org.telegram.messenger.ij) obj).f23287q = false;
                return;
            case 6:
                Bundle bundle = new Bundle();
                ll llVar = ((fl) obj).f45792c.f46111a;
                i11 = ((org.telegram.ui.ActionBar.f2) llVar.Q).currentAccount;
                bundle.putLong("user_id", org.telegram.messenger.p10.i(i11).f24493n);
                llVar.Q.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 7:
                ((nl) obj).f48224b.C9(true);
                return;
            case 8:
                ((ji) obj).c(false);
                return;
            case 9:
                cn cnVar = ((om) obj).h;
                cnVar.getNotificationCenter().j(cnVar.f44470da);
                return;
            case 10:
                cn cnVar2 = ((um) obj).f50521b;
                cnVar2.f44540j0.getSearchField().requestFocus();
                org.telegram.messenger.g0.K3(cnVar2.f44540j0.getSearchField());
                if (cnVar2.Ka > 0) {
                    bf bfVar = new bf(cnVar2, 9);
                    cnVar2.La = bfVar;
                    org.telegram.messenger.g0.i3(bfVar, 200L);
                    return;
                }
                return;
            case 11:
                rn rnVar = ((pn) obj).f48804a;
                rnVar.f49454e.setImageDrawable(rnVar.f49469r);
                rnVar.f49450b0.o(2131232047, org.telegram.messenger.id.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.C0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().X3(rnVar.C0, true, false);
                }
                rnVar.O0 = true;
                if (rnVar.R0 == null) {
                    rnVar.R0 = new org.telegram.ui.Components.zg0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.f49450b0.f29585e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.f49450b0.f29585e.setAnimation(rnVar.R0);
                return;
            case 12:
                ((vp) obj).a(0);
                return;
            case 13:
                ((xq) obj).invalidateSelf();
                return;
            case 14:
                fr frVar = (fr) obj;
                ArrayList arrayList = frVar.f45825c;
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
                ((js) obj).f47066a.o();
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
                org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(((org.telegram.messenger.c) obj).f21770a);
                q10.getMessagesStorage().f26723a.c(new org.telegram.messenger.w5(q10, 0));
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
                ((zw) ((w9) obj).f50949b).f52583f0.setAlpha(1.0f);
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                zw zwVar = ((mw) obj).f48063a;
                i12 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                bundle2.putLong("user_id", org.telegram.messenger.p10.i(i12).e());
                bundle2.putBoolean("my_profile", true);
                zwVar.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                zw zwVar2 = ((pw) obj).B0;
                zwVar2.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) zwVar2, 9, true));
                zwVar2.f52683z0.setIsEditing(false);
                zwVar2.U4(false);
                return;
            case 25:
                zw zwVar3 = ((qw) obj).f49166b;
                zwVar3.f52683z0.setIsEditing(true);
                zwVar3.U4(true);
                return;
            case 26:
                ((hx) obj).removeSelfFromStack();
                return;
            case 27:
                lx lxVar = (lx) obj;
                ArrayList arrayList2 = lxVar.f47720y;
                ArrayList arrayList3 = lxVar.f47719x;
                if (lxVar.f47716r != 0) {
                    TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = new TLRPC.TL_sendMessageEmojiInteraction();
                    tL_sendMessageEmojiInteraction.msg_id = lxVar.f47716r;
                    tL_sendMessageEmojiInteraction.emoticon = lxVar.f47718w;
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
                                lxVar.f47716r = 0;
                                lxVar.f47718w = null;
                                lxVar.f47717s = 0L;
                                arrayList3.clear();
                                arrayList2.clear();
                                org.telegram.messenger.a8.g(e, true);
                                lxVar.D = null;
                                return;
                            }
                        }
                        jSONObject.put("a", jSONArray);
                        tL_sendMessageEmojiInteraction.interaction.data = jSONObject.toString();
                        TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                        long j3 = lxVar.J;
                        if (j3 != 0) {
                            tL_messages_setTyping.top_msg_id = (int) j3;
                            tL_messages_setTyping.flags = 1 | tL_messages_setTyping.flags;
                        }
                        tL_messages_setTyping.action = tL_sendMessageEmojiInteraction;
                        tL_messages_setTyping.peer = org.telegram.messenger.qp.s1(lxVar.f47711b).j1(lxVar.I);
                        ConnectionsManager.getInstance(lxVar.f47711b).sendRequest(tL_messages_setTyping, null);
                        lxVar.f47716r = 0;
                        lxVar.f47718w = null;
                        lxVar.f47717s = 0L;
                        arrayList3.clear();
                        arrayList2.clear();
                    } catch (JSONException e11) {
                        e = e11;
                    }
                }
                lxVar.D = null;
                return;
            case 28:
                ((jy) obj).j0(true);
                return;
            default:
                ((hy) obj).f44832a.getBackground().setState(new int[0]);
                return;
        }
    }
}
