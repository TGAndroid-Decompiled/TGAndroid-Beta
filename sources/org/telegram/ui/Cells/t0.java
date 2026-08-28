package org.telegram.ui.Cells;

import org.telegram.tgnet.TLRPC;
public interface t0 {
    void C0(TLRPC.TL_chatInviteExported tL_chatInviteExported);

    void E(w0 w0Var, int i9);

    void I(w0 w0Var);

    void L(w0 w0Var, int i9, int i10);

    void N1(w0 w0Var, String str);

    void O(w0 w0Var);

    void V0(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize);

    boolean Z1(w0 w0Var, float f10, float f11);

    long a();

    void a2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    long b();

    void c0(w0 w0Var);

    boolean h();

    void o1(long j10);

    void p1(w0 w0Var);

    void v1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str);

    org.telegram.ui.ActionBar.o2 y0();
}
