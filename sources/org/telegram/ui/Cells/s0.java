package org.telegram.ui.Cells;

import org.telegram.tgnet.TLRPC;
public interface s0 {
    void G(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize);

    void H0(v0 v0Var, String str);

    boolean M0(v0 v0Var, float f7, float f10);

    void P0(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10);

    long a();

    long b();

    boolean d();

    void e(v0 v0Var, int i10);

    void f(v0 v0Var);

    void g(v0 v0Var, int i10, int i11);

    void i0(long j10);

    void k(v0 v0Var);

    void l0(v0 v0Var);

    void t(v0 v0Var);

    void v0(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str);

    org.telegram.ui.ActionBar.r2 y();

    void z(TLRPC.TL_chatInviteExported tL_chatInviteExported);
}
