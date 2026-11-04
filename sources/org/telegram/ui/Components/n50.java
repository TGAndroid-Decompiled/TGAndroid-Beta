package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n50 extends sj0 {
    public final t50 f36378c;

    public n50(t50 t50Var) {
        this.f36378c = t50Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 == 3 || i3 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i3) {
        t50 t50Var = this.f36378c;
        if (t50Var.f38291e2 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) t50Var.f38292f2.get(i3 - t50Var.Q1);
            if (org.telegram.messenger.m5.E(dialog.f27005id)) {
                return org.telegram.messenger.hp.s1(t50Var.f28583a).a2(Long.valueOf(dialog.f27005id));
            }
            return org.telegram.messenger.hp.s1(t50Var.f28583a).M0(Long.valueOf(-dialog.f27005id));
        }
        return (TLObject) t50Var.W1.get(i3 - t50Var.Q1);
    }

    @Override
    public final int b() {
        return this.f36378c.U1;
    }

    @Override
    public final int d(int i3) {
        t50 t50Var = this.f36378c;
        if (i3 == t50Var.P1) {
            return 1;
        }
        t50Var.getClass();
        if (i3 == 0) {
            return 2;
        }
        if (i3 >= t50Var.Q1 && i3 < t50Var.R1) {
            return 3;
        }
        if (i3 == t50Var.T1) {
            return 4;
        }
        if (i3 == t50Var.S1) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 != 2) {
            if (i10 == 3) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                TLObject E = E(i3);
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f27150id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f27001id;
                } else {
                    j10 = 0;
                }
                t50 t50Var = this.f36378c;
                boolean z12 = false;
                if (i3 != t50Var.R1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f27150id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f27001id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = t50Var.L1;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (t50Var.X1.h(j11) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j10 == j11) {
                        z12 = true;
                    }
                    h4Var.c(z11, z12);
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
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.x4 x4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i3 != 2) {
            t50 t50Var = this.f36378c;
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(context);
                        x4Var2.b(2131232203, 7, org.telegram.messenger.bd.M0(2131743400, null), true);
                        int i10 = org.telegram.ui.ActionBar.k6.f28061n5;
                        x4Var2.a(i10, i10);
                        x4Var = x4Var2;
                    } else {
                        m50 m50Var = new m50(context, null, 0, null, 0);
                        m50Var.setLayoutParams(new u4.p0(-1, -1));
                        m50Var.f41128e.setVisibility(8);
                        org.telegram.ui.ur urVar = t50Var.f38291e2;
                        yh.l lVar = m50Var.d;
                        if (urVar != null) {
                            lVar.setText(org.telegram.messenger.bd.M0(2131750727, null));
                        } else {
                            lVar.setText(org.telegram.messenger.bd.M0(2131748231, null));
                        }
                        m50Var.setAnimateLayoutChange(true);
                        x4Var = m50Var;
                    }
                } else {
                    x4Var = new View(context);
                }
            } else {
                if (t50Var.f38291e2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x4Var = new org.telegram.ui.Cells.h4(context, 1, 0, z10);
            }
        } else {
            x4Var = new ai.x2(20, context, this);
        }
        return new u4.d1(x4Var);
    }
}
