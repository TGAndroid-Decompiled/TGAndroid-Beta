package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class eh implements Runnable {
    public final int f47299a;
    public final Object f47300b;
    public final Object f47301c;

    public eh(int i7, Object obj, Object obj2) {
        this.f47299a = i7;
        this.f47300b = obj;
        this.f47301c = obj2;
    }

    @Override
    public final void run() {
        String str;
        String a02;
        TLRPC.Chat O0;
        org.telegram.ui.Components.de deVar;
        int i7 = this.f47299a;
        boolean z10 = false;
        Object obj = this.f47301c;
        Object obj2 = this.f47300b;
        switch (i7) {
            case 0:
                bn bnVar = (bn) obj2;
                View view = (View) obj;
                if (bnVar.getParentActivity() != null) {
                    bnVar.Z0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    bnVar.Z0.l(bnVar.L);
                    bnVar.Z0.s(16.0f);
                    bnVar.Z0.r(true);
                    bnVar.Z0.v(org.telegram.messenger.hd.N0(2131753099, null));
                    bnVar.Z0.o(0.0f, 96.0f);
                    bnVar.Z0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - bnVar.Xa) - bnVar.f46111m1.getHeight()));
                    bnVar.f46111m1.addView(bnVar.Z0, c8.ma.e(-1, 100, 87));
                    hi.l3 l3Var = bnVar.Z0;
                    l3Var.f14988r0 = new zd(bnVar, 3);
                    l3Var.x();
                    org.telegram.ui.Components.n30.f37761x.b();
                    return;
                }
                return;
            case 1:
                ((bn) obj2).f46111m1.removeView((org.telegram.ui.Components.xi0) obj);
                return;
            case 2:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                bn bnVar2 = ((di) obj2).f46979s;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) bnVar2.G6[0].get(gjVar.e1());
                if (gjVar2 != null && gjVar2 != gjVar) {
                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) bnVar2.G6[0].get(gjVar.e1());
                    gjVar3.f24213k.reactions = gjVar.f24213k.reactions;
                    gjVar = gjVar3;
                }
                bnVar2.Yc(gjVar, true);
                ch.l0.f();
                return;
            case 3:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                bn bnVar3 = ((fl) ((fm) obj2).f47763f).f47758a.R;
                int i10 = bn.f45940md;
                bnVar3.pb();
                v0Var.getMessageObject().f24240r = false;
                v0Var.invalidate();
                return;
            case 4:
                hi.l3 l3Var2 = (hi.l3) obj;
                bn bnVar4 = ((mm) obj2).f49941a;
                bnVar4.f46111m1.removeView(l3Var2);
                if (l3Var2 == bnVar4.P1) {
                    bnVar4.P1 = null;
                    return;
                }
                return;
            case 5:
                Long l10 = (Long) obj;
                bn bnVar5 = ((gm) obj2).W2.f49941a;
                if (l10.longValue() < 0 && (O0 = bnVar5.getMessagesController().O0(Long.valueOf(-l10.longValue()))) != null) {
                    str = O0.title;
                } else {
                    str = "";
                }
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar5);
                if (TextUtils.isEmpty(str)) {
                    a02 = org.telegram.messenger.hd.N0(2131745986, null);
                } else {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131745987, str);
                }
                org.telegram.messenger.o10.u(a02, b02, 2131623990, 36);
                return;
            case 6:
                rn rnVar = (rn) obj2;
                rnVar.getClass();
                rnVar.presentFragment(c51.g0((TLRPC.Chat) obj, true));
                return;
            case 7:
                jo joVar = (jo) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = joVar.getMessagesController().j1(joVar.f49033a0);
                joVar.f49045i0 = joVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(joVar, str2, tL_channels_checkUsername, 6), 2);
                return;
            case 8:
                jo joVar2 = (jo) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                    z10 = true;
                }
                joVar2.f49038d0 = z10;
                if (!z10 && joVar2.getUserConfig().q() && !joVar2.f49040e0 && joVar2.f49061y != null) {
                    joVar2.f49040e0 = true;
                    joVar2.h0();
                    joVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new sn(joVar2, 1));
                    return;
                }
                return;
            case 9:
                vo.Z((vo) obj2, (org.telegram.ui.ActionBar.t1[]) obj);
                return;
            case 10:
                vo voVar = (vo) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    voVar.getMessagesController().Z3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    voVar.f52867w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.v3.c0(next) || org.telegram.messenger.v3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                voVar.f52868x = false;
                voVar.f52869y = true;
                voVar.g0();
                return;
            case 11:
                ((ro) obj2).f51687y.d.Q = false;
                ((org.telegram.ui.Components.t70) obj).run();
                return;
            case 12:
                ((ro) obj2).f51687y.d.P = false;
                ((org.telegram.ui.Components.u70) obj).run();
                return;
            case 13:
                vo voVar2 = ((ro) obj2).f51687y.d;
                voVar2.P = false;
                voVar2.Q = false;
                ((Runnable) obj).run();
                return;
            case 14:
                ro roVar = (ro) obj2;
                roVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                roVar.h = true;
                roVar.f40700c.setChecked(true);
                return;
            case 15:
                rq rqVar = (rq) obj2;
                rqVar.getClass();
                rqVar.getMessagesController().b3(0, ((TLRPC.Updates) obj).chats.get(0).f28434id, true);
                return;
            case 16:
                TLRPC.User user = (TLRPC.User) obj;
                rq rqVar2 = ((gq) obj2).f48159a;
                if (org.telegram.ui.Components.lc.a(rqVar2)) {
                    org.telegram.ui.Components.lc.C(user.first_name, rqVar2).j();
                    return;
                }
                return;
            case 17:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                org.telegram.messenger.e eVar = ((org.telegram.ui.Components.n0) obj2).f37698s2;
                eVar.f23645b.remove(tL_aiComposeTone);
                eVar.d();
                eVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(eVar.f23644a).sendRequest(savetone, null);
                return;
            case 18:
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
            case 19:
                ru0 ru0Var = (ru0) obj;
                if (((boolean[]) obj2)[0]) {
                    ru0Var.run();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                gcVar.f35531n = true;
                org.telegram.ui.Components.lb lbVar = gcVar.f35523e;
                if (lbVar instanceof org.telegram.ui.Components.mb) {
                    org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) ((org.telegram.ui.Components.mb) lbVar);
                    nbVar.f38157b.setText(charSequence);
                    org.telegram.messenger.g0.T3(nbVar.d, false, false);
                    org.telegram.messenger.g0.T3(nbVar.f38157b, true, false);
                }
                gcVar.i(true);
                return;
            case 21:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.yc) obj2).removeView((hi.l3) obj);
                return;
            case 23:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i11 = ChatActivityEnterView.f32569s7;
                ((org.telegram.ui.Components.dd) obj).run();
                org.telegram.messenger.c6.p(chatActivityEnterView.R, chatActivityEnterView.G3);
                return;
            case 24:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                org.telegram.ui.Components.c5.J(chatActivityEnterView2.E3, chatActivityEnterView2.F3.a(), new h9.g1((org.telegram.ui.Components.hd) obj, 29), chatActivityEnterView2.M4);
                return;
            case 25:
                int i12 = ChatActivityEnterView.f32569s7;
                ((ChatActivityEnterView) obj2).removeView((hi.l3) obj);
                return;
            case 26:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView3.R3 == ((TLRPC.TL_document) obj) && (deVar = chatActivityEnterView3.f32615f1) != null && deVar.getVisibility() == 0) {
                    chatActivityEnterView3.f32762y5 = true;
                    chatActivityEnterView3.s1();
                    chatActivityEnterView3.f32762y5 = false;
                    return;
                }
                return;
            case 27:
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) obj2;
                if (chatActivityEnterView4.V6 == ((org.telegram.ui.Components.a70) obj)) {
                    chatActivityEnterView4.V6 = null;
                    return;
                }
                return;
            case 28:
                ChatActivityEnterView chatActivityEnterView5 = (ChatActivityEnterView) obj2;
                int i13 = ChatActivityEnterView.f32569s7;
                chatActivityEnterView5.setFieldText((CharSequence) obj);
                chatActivityEnterView5.f32571a0 = null;
                return;
            default:
                ((ji.g) obj2).a((ai.g) obj);
                return;
        }
    }
}
