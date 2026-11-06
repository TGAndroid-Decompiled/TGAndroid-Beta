package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q50 extends oj0 {
    public final x50 f37169c;

    public q50(x50 x50Var) {
        this.f37169c = x50Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56955f;
        if (i7 == 3 || i7 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i7) {
        x50 x50Var = this.f37169c;
        if (x50Var.d2 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) x50Var.f40194e2.get(i7 - x50Var.P1);
            if (org.telegram.messenger.m5.E(dialog.f26957id)) {
                return org.telegram.messenger.qp.s1(x50Var.f28613a).a2(Long.valueOf(dialog.f26957id));
            }
            return org.telegram.messenger.qp.s1(x50Var.f28613a).M0(Long.valueOf(-dialog.f26957id));
        }
        return (TLObject) x50Var.V1.get(i7 - x50Var.P1);
    }

    @Override
    public final int b() {
        return this.f37169c.T1;
    }

    @Override
    public final int d(int i7) {
        x50 x50Var = this.f37169c;
        if (i7 == x50Var.O1) {
            return 1;
        }
        x50Var.getClass();
        if (i7 == 0) {
            return 2;
        }
        if (i7 >= x50Var.P1 && i7 < x50Var.Q1) {
            return 3;
        }
        if (i7 == x50Var.S1) {
            return 4;
        }
        if (i7 == x50Var.R1) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        long j3;
        boolean z9;
        long j10;
        boolean z10;
        int i10 = d1Var.f56955f;
        View view = d1Var.f56951a;
        if (i10 != 2) {
            if (i10 == 3) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                TLObject E = E(i7);
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f27102id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f26953id;
                } else {
                    j3 = 0;
                }
                x50 x50Var = this.f37169c;
                boolean z11 = false;
                if (i7 != x50Var.Q1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                h4Var.e(E, null, null, z9);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f27102id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f26953id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.h hVar = x50Var.K1;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (x50Var.W1.h(j10) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j3 == j10) {
                        z11 = true;
                    }
                    h4Var.c(z10, z11);
                    h4Var.setCheckBoxEnabled(true);
                    return;
                }
                return;
            }
            return;
        }
        view.requestLayout();
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x4 x4Var;
        boolean z9;
        Context context = viewGroup.getContext();
        if (i7 != 2) {
            x50 x50Var = this.f37169c;
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(context);
                        x4Var2.b(2131232203, 7, org.telegram.messenger.hd.M0(2131743391, null), true);
                        int i10 = org.telegram.ui.ActionBar.k6.f28030n5;
                        x4Var2.a(i10, i10);
                        x4Var = x4Var2;
                    } else {
                        p50 p50Var = new p50(context, null, 0, null, 0);
                        p50Var.setLayoutParams(new v4.o0(-1, -1));
                        p50Var.f31925e.setVisibility(8);
                        org.telegram.ui.wr wrVar = x50Var.d2;
                        xh.l lVar = p50Var.d;
                        if (wrVar != null) {
                            lVar.setText(org.telegram.messenger.hd.M0(2131750727, null));
                        } else {
                            lVar.setText(org.telegram.messenger.hd.M0(2131748222, null));
                        }
                        p50Var.setAnimateLayoutChange(true);
                        x4Var = p50Var;
                    }
                } else {
                    x4Var = new View(context);
                }
            } else {
                if (x50Var.d2 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                x4Var = new org.telegram.ui.Cells.h4(context, 1, 0, z9);
            }
        } else {
            x4Var = new bi.ec(19, context, this);
        }
        return new v4.d1(x4Var);
    }
}
