package org.telegram.ui;

import android.animation.Animator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ci implements Runnable {
    public final int f46555a;
    public final Object f46556b;
    public final Object f46557c;

    public ci(int i7, Object obj, Object obj2) {
        this.f46555a = i7;
        this.f46556b = obj;
        this.f46557c = obj2;
    }

    @Override
    public final void run() {
        String str;
        String a02;
        TLRPC.Chat O0;
        org.telegram.ui.Components.de deVar;
        int i7 = this.f46555a;
        boolean z10 = false;
        Object obj = this.f46557c;
        Object obj2 = this.f46556b;
        switch (i7) {
            case 0:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                bn bnVar = ((di) obj2).f46939s;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) bnVar.G6[0].get(gjVar.e1());
                if (gjVar2 != null && gjVar2 != gjVar) {
                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) bnVar.G6[0].get(gjVar.e1());
                    gjVar3.f24177k.reactions = gjVar.f24177k.reactions;
                    gjVar = gjVar3;
                }
                bnVar.Yc(gjVar, true);
                ch.l0.f();
                return;
            case 1:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                bn bnVar2 = ((fl) ((fm) obj2).f47731f).f47726a.R;
                int i10 = bn.f45893md;
                bnVar2.pb();
                v0Var.getMessageObject().f24204r = false;
                v0Var.invalidate();
                return;
            case 2:
                hi.l3 l3Var = (hi.l3) obj;
                bn bnVar3 = ((mm) obj2).f49910a;
                bnVar3.f46064m1.removeView(l3Var);
                if (l3Var == bnVar3.P1) {
                    bnVar3.P1 = null;
                    return;
                }
                return;
            case 3:
                Long l10 = (Long) obj;
                bn bnVar4 = ((gm) obj2).W2.f49910a;
                if (l10.longValue() < 0 && (O0 = bnVar4.getMessagesController().O0(Long.valueOf(-l10.longValue()))) != null) {
                    str = O0.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar4);
                if (TextUtils.isEmpty(str)) {
                    a02 = org.telegram.messenger.hd.N0(2131745986, null);
                } else {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131745987, str);
                }
                org.telegram.messenger.o10.u(a02, b02, 2131623990, 36);
                return;
            case 4:
                rn rnVar = (rn) obj2;
                rnVar.getClass();
                rnVar.presentFragment(c51.g0((TLRPC.Chat) obj, true));
                return;
            case 5:
                io ioVar = (io) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = ioVar.getMessagesController().j1(ioVar.f48778a0);
                ioVar.f48790i0 = ioVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(ioVar, str2, tL_channels_checkUsername, 6), 2);
                return;
            case 6:
                io ioVar2 = (io) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                    z10 = true;
                }
                ioVar2.f48783d0 = z10;
                if (!z10 && ioVar2.getUserConfig().q() && !ioVar2.f48785e0 && ioVar2.f48806y != null) {
                    ioVar2.f48785e0 = true;
                    ioVar2.h0();
                    ioVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new sn(ioVar2, 1));
                    return;
                }
                return;
            case 7:
                uo.Z((uo) obj2, (org.telegram.ui.ActionBar.t1[]) obj);
                return;
            case 8:
                uo uoVar = (uo) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    uoVar.getMessagesController().Z3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    uoVar.f52605w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.v3.c0(next) || org.telegram.messenger.v3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                uoVar.f52606x = false;
                uoVar.f52607y = true;
                uoVar.g0();
                return;
            case 9:
                ((qo) obj2).f51249y.d.Q = false;
                ((org.telegram.ui.Components.t70) obj).run();
                return;
            case 10:
                ((qo) obj2).f51249y.d.P = false;
                ((org.telegram.ui.Components.u70) obj).run();
                return;
            case 11:
                uo uoVar2 = ((qo) obj2).f51249y.d;
                uoVar2.P = false;
                uoVar2.Q = false;
                ((Runnable) obj).run();
                return;
            case 12:
                qo qoVar = (qo) obj2;
                qoVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                qoVar.h = true;
                qoVar.f40652c.setChecked(true);
                return;
            case 13:
                rq rqVar = (rq) obj2;
                rqVar.getClass();
                rqVar.getMessagesController().b3(0, ((TLRPC.Updates) obj).chats.get(0).f28398id, true);
                return;
            case 14:
                TLRPC.User user = (TLRPC.User) obj;
                rq rqVar2 = ((gq) obj2).f48094a;
                if (org.telegram.ui.Components.lc.a(rqVar2)) {
                    org.telegram.ui.Components.lc.C(user.first_name, rqVar2).j();
                    return;
                }
                return;
            case 15:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                org.telegram.messenger.e eVar = ((org.telegram.ui.Components.n0) obj2).f37654s2;
                eVar.f23609b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.f23608a).sendRequest(savetone, null);
                return;
            case 16:
                org.telegram.ui.Components.w wVar = (org.telegram.ui.Components.w) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) obj;
                wVar.getClass();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.D4(tL_aiComposeTone2.author_id));
                    wVar.dismiss();
                    return;
                }
                return;
            case 17:
                su0 su0Var = (su0) obj;
                if (((boolean[]) obj2)[0]) {
                    su0Var.run();
                    return;
                }
                return;
            case 18:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                gcVar.f35493n = true;
                org.telegram.ui.Components.lb lbVar = gcVar.f35485e;
                if (lbVar instanceof org.telegram.ui.Components.mb) {
                    org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) ((org.telegram.ui.Components.mb) lbVar);
                    nbVar.f38124b.setText(charSequence);
                    org.telegram.messenger.g0.T3(nbVar.d, false, false);
                    org.telegram.messenger.g0.T3(nbVar.f38124b, true, false);
                }
                gcVar.i(true);
                return;
            case 19:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.yc) obj2).removeView((hi.l3) obj);
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i11 = ChatActivityEnterView.f32535s7;
                ((org.telegram.ui.Components.dd) obj).run();
                org.telegram.messenger.c6.p(chatActivityEnterView.R, chatActivityEnterView.G3);
                return;
            case 22:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                org.telegram.ui.Components.c5.J(chatActivityEnterView2.E3, chatActivityEnterView2.F3.a(), new h9.g1((org.telegram.ui.Components.hd) obj, 29), chatActivityEnterView2.M4);
                return;
            case 23:
                int i12 = ChatActivityEnterView.f32535s7;
                ((ChatActivityEnterView) obj2).removeView((hi.l3) obj);
                return;
            case 24:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView3.R3 == ((TLRPC.TL_document) obj) && (deVar = chatActivityEnterView3.f32581f1) != null && deVar.getVisibility() == 0) {
                    chatActivityEnterView3.f32728y5 = true;
                    chatActivityEnterView3.s1();
                    chatActivityEnterView3.f32728y5 = false;
                    return;
                }
                return;
            case 25:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView4.V6 == ((org.telegram.ui.Components.a70) obj)) {
                    chatActivityEnterView4.V6 = null;
                    return;
                }
                return;
            case 26:
                ChatActivityEnterView chatActivityEnterView5 = (ChatActivityEnterView) obj2;
                int i13 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView5.setFieldText((CharSequence) obj);
                chatActivityEnterView5.f32537a0 = null;
                return;
            case 27:
                ((ji.g) obj2).a((ai.c) obj);
                return;
            case 28:
                org.telegram.ui.Components.qf qfVar = (org.telegram.ui.Components.qf) obj2;
                qfVar.getClass();
                org.telegram.messenger.g0.E2((ji.o) obj);
                ChatActivityEnterView chatActivityEnterView6 = qfVar.f38848a;
                chatActivityEnterView6.f32687t1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView6.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.sf) obj2).onAnimationEnd((Animator) obj);
                return;
        }
    }
}
