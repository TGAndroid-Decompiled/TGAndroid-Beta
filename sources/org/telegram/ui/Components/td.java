package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class td implements Runnable {
    public final int f39982a;
    public final ChatActivityEnterView f39983b;

    public td(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f39982a = i7;
        this.f39983b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i7 = this.f39982a;
        ChatActivityEnterView chatActivityEnterView = this.f39983b;
        switch (i7) {
            case 0:
                gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null) {
                    gfVar.setText("");
                    return;
                }
                return;
            case 1:
                gf gfVar2 = chatActivityEnterView.F0;
                if (gfVar2 != null) {
                    gfVar2.setText("");
                }
                chatActivityEnterView.P(true);
                return;
            case 2:
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var != null) {
                    eg0Var.h(false);
                    chatActivityEnterView.M0 = null;
                }
                org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 5), 600L);
                return;
            case 3:
                b5.J(chatActivityEnterView.C3, chatActivityEnterView.D3.a(), new ke(chatActivityEnterView, 2), chatActivityEnterView.K4);
                return;
            case 4:
                int i10 = ChatActivityEnterView.f32538n7;
                ChatActivityEnterView chatActivityEnterView2 = this.f39983b;
                chatActivityEnterView2.s1(true, 2147483646, 0, 0L, true);
                org.telegram.ui.eg0 eg0Var2 = chatActivityEnterView2.M0;
                if (eg0Var2 != null) {
                    eg0Var2.h(false);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                TL_iv.RichMessage richMessage = chatActivityEnterView.f32680s2;
                if (richMessage != null && chatActivityEnterView.F0 != null && bnVar != null) {
                    org.telegram.messenger.mp.u1(chatActivityEnterView.R);
                    boolean z10 = org.telegram.messenger.s2.f26723a;
                    oi.z1 z1Var = new oi.z1(richMessage);
                    z1Var.f22522e = true;
                    z1Var.setResourceProvider(chatActivityEnterView.K4);
                    z1Var.K = bnVar;
                    z1Var.f22539s = bnVar.U;
                    z1Var.f22544w = bnVar.f45932a0;
                    z1Var.M = new td(chatActivityEnterView, 11);
                    z1Var.L = new td(chatActivityEnterView, 13);
                    bnVar.presentFragment(z1Var);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.bn bnVar2 = chatActivityEnterView.D3;
                if (bnVar2 != null) {
                    bnVar2.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) bnVar2, 43, true));
                    return;
                }
                return;
            case 7:
                int i11 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.getClass();
                return;
            case 8:
                if (!chatActivityEnterView.M2 && !chatActivityEnterView.f32687t3) {
                    chatActivityEnterView.P(true);
                    return;
                }
                return;
            case 9:
                int i12 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.Y1(true, true);
                chatActivityEnterView.W = null;
                return;
            case 10:
                int i13 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.A2();
                return;
            case 11:
                gf gfVar3 = chatActivityEnterView.F0;
                if (gfVar3 != null) {
                    gfVar3.setText("");
                    return;
                }
                return;
            case 12:
                org.telegram.ui.eg0 eg0Var3 = chatActivityEnterView.M0;
                if (eg0Var3 != null) {
                    eg0Var3.h(chatActivityEnterView.f32564c6);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                return;
            case 13:
                gf gfVar4 = chatActivityEnterView.F0;
                if (gfVar4 != null) {
                    gfVar4.setText("");
                }
                chatActivityEnterView.P(true);
                return;
            case 14:
                int i14 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.u1();
                return;
            case 15:
                chatActivityEnterView.Z3 = false;
                chatActivityEnterView.f1();
                return;
            case 16:
                int i15 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.I();
                return;
            default:
                int i16 = ChatActivityEnterView.f32538n7;
                p0 p0Var = chatActivityEnterView.f32633l6;
                if (p0Var != null && p0Var.d) {
                    p0Var.d = false;
                    p0Var.f38199a.invalidate();
                }
                if (chatActivityEnterView.f32703v6) {
                    chatActivityEnterView.f32703v6 = false;
                    chatActivityEnterView.D1 = false;
                    gf gfVar5 = chatActivityEnterView.F0;
                    if (gfVar5 != null) {
                        gfVar5.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
