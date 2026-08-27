package org.telegram.ui.Cells;

import org.telegram.tgnet.TLRPC;

public interface t0 {
    void A1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str);

    void C(v0 v0Var, int i10);

    void I(v0 v0Var);

    void J(v0 v0Var, int i10, int i11);

    void K(v0 v0Var);

    void S(v0 v0Var);

    void T1(v0 v0Var, String str);

    void Z0(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize);

    long a();

    long b();

    boolean f();

    boolean g2(v0 v0Var, float f10, float f11);

    void j2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11);

    void p1(long j10);

    void q1(v0 v0Var);

    org.telegram.ui.ActionBar.n2 y0();

    void z0(TLRPC.TL_chatInviteExported tL_chatInviteExported);
}
