package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class td implements Runnable {
    public final int f39908a;
    public final ChatActivityEnterView f39909b;

    public td(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f39908a = i7;
        this.f39909b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i7 = this.f39908a;
        ChatActivityEnterView chatActivityEnterView = this.f39909b;
        switch (i7) {
            case 0:
                hf hfVar = chatActivityEnterView.F0;
                if (hfVar != null) {
                    hfVar.setText("");
                    return;
                }
                return;
            case 1:
                hf hfVar2 = chatActivityEnterView.F0;
                if (hfVar2 != null) {
                    hfVar2.setText("");
                }
                chatActivityEnterView.P(true);
                return;
            case 2:
                org.telegram.ui.dg0 dg0Var = chatActivityEnterView.M0;
                if (dg0Var != null) {
                    dg0Var.h(false);
                    chatActivityEnterView.M0 = null;
                }
                org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 5), 600L);
                return;
            case 3:
                b5.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new le(chatActivityEnterView, 2), chatActivityEnterView.M4);
                return;
            case 4:
                int i10 = ChatActivityEnterView.f32633s7;
                ChatActivityEnterView chatActivityEnterView2 = this.f39909b;
                chatActivityEnterView2.x1(true, 2147483646, 0, 0L, true);
                org.telegram.ui.dg0 dg0Var2 = chatActivityEnterView2.M0;
                if (dg0Var2 != null) {
                    dg0Var2.h(false);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                TL_iv.RichMessage richMessage = chatActivityEnterView.f32792u2;
                if (richMessage != null && chatActivityEnterView.F0 != null && bnVar != null) {
                    org.telegram.messenger.mp.u1(chatActivityEnterView.R);
                    boolean z10 = org.telegram.messenger.s2.f26829a;
                    oi.b2 b2Var = new oi.b2(richMessage);
                    b2Var.f22061e = true;
                    b2Var.setResourceProvider(chatActivityEnterView.M4);
                    b2Var.K = bnVar;
                    b2Var.f22078s = bnVar.U;
                    b2Var.f22083w = bnVar.f46118a0;
                    b2Var.M = new td(chatActivityEnterView, 11);
                    b2Var.L = new td(chatActivityEnterView, 13);
                    bnVar.presentFragment(b2Var);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
                if (bnVar2 != null) {
                    bnVar2.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar2, 43, true));
                    return;
                }
                return;
            case 7:
                int i11 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.getClass();
                return;
            case 8:
                if (!chatActivityEnterView.O2 && !chatActivityEnterView.f32800v3) {
                    chatActivityEnterView.P(true);
                    return;
                }
                return;
            case 9:
                int i12 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.e2(true, true);
                chatActivityEnterView.W = null;
                return;
            case 10:
                int i13 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.G2();
                return;
            case 11:
                hf hfVar3 = chatActivityEnterView.F0;
                if (hfVar3 != null) {
                    hfVar3.setText("");
                    return;
                }
                return;
            case 12:
                org.telegram.ui.dg0 dg0Var3 = chatActivityEnterView.M0;
                if (dg0Var3 != null) {
                    dg0Var3.h(chatActivityEnterView.f32675e6);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            case 13:
                hf hfVar4 = chatActivityEnterView.F0;
                if (hfVar4 != null) {
                    hfVar4.setText("");
                }
                chatActivityEnterView.P(true);
                return;
            case 14:
                int i14 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.z1();
                return;
            case 15:
                chatActivityEnterView.f32648b4 = false;
                chatActivityEnterView.k1();
                return;
            case 16:
                int i15 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.H();
                return;
            case 17:
                int i16 = ChatActivityEnterView.f32633s7;
                p0 p0Var = chatActivityEnterView.f32743n6;
                if (p0Var != null && p0Var.d) {
                    p0Var.d = false;
                    p0Var.f38329a.invalidate();
                }
                if (chatActivityEnterView.f32819x6) {
                    chatActivityEnterView.f32819x6 = false;
                    chatActivityEnterView.F1 = false;
                    hf hfVar5 = chatActivityEnterView.F0;
                    if (hfVar5 != null) {
                        hfVar5.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                chatActivityEnterView.q0();
                return;
        }
    }
}
