package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class td implements Runnable {
    public final int f39822a;
    public final ChatActivityEnterView f39823b;

    public td(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f39822a = i7;
        this.f39823b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        int i7 = this.f39822a;
        ChatActivityEnterView chatActivityEnterView = this.f39823b;
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
                c5.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new ke(chatActivityEnterView, 2), chatActivityEnterView.M4);
                return;
            case 4:
                int i10 = ChatActivityEnterView.f32535s7;
                ChatActivityEnterView chatActivityEnterView2 = this.f39823b;
                chatActivityEnterView2.w1(true, 2147483646, 0, 0L, true);
                org.telegram.ui.eg0 eg0Var2 = chatActivityEnterView2.M0;
                if (eg0Var2 != null) {
                    eg0Var2.h(false);
                    chatActivityEnterView2.M0 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                TL_iv.RichMessage richMessage = chatActivityEnterView.f32694u2;
                if (richMessage != null && chatActivityEnterView.F0 != null && bnVar != null) {
                    org.telegram.messenger.np.u1(chatActivityEnterView.R);
                    boolean z10 = org.telegram.messenger.s2.f26694a;
                    oi.a2 a2Var = new oi.a2(richMessage);
                    a2Var.f21932e = true;
                    a2Var.setResourceProvider(chatActivityEnterView.M4);
                    a2Var.K = bnVar;
                    a2Var.f21949s = bnVar.U;
                    a2Var.f21954w = bnVar.f45903a0;
                    a2Var.M = new td(chatActivityEnterView, 11);
                    a2Var.L = new td(chatActivityEnterView, 13);
                    bnVar.presentFragment(a2Var);
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
                int i11 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.getClass();
                return;
            case 8:
                if (!chatActivityEnterView.O2 && !chatActivityEnterView.f32702v3) {
                    chatActivityEnterView.P(true);
                    return;
                }
                return;
            case 9:
                int i12 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.c2(true, true);
                chatActivityEnterView.W = null;
                return;
            case 10:
                int i13 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.D2();
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
                    eg0Var3.h(chatActivityEnterView.f32577e6);
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
                int i14 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.y1();
                return;
            case 15:
                chatActivityEnterView.f32550b4 = false;
                chatActivityEnterView.j1();
                return;
            case 16:
                int i15 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.I();
                return;
            case 17:
                int i16 = ChatActivityEnterView.f32535s7;
                q0 q0Var = chatActivityEnterView.f32645n6;
                if (q0Var != null && q0Var.d) {
                    q0Var.d = false;
                    q0Var.f38671a.invalidate();
                }
                if (chatActivityEnterView.f32721x6) {
                    chatActivityEnterView.f32721x6 = false;
                    chatActivityEnterView.F1 = false;
                    gf gfVar5 = chatActivityEnterView.F0;
                    if (gfVar5 != null) {
                        gfVar5.invalidate();
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
