package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g60 extends sk0 {
    public final m60 f26263c;

    public g60(m60 m60Var) {
        this.f26263c = m60Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 == 3 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i10) {
        m60 m60Var = this.f26263c;
        if (m60Var.f28299d2 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) m60Var.f28300e2.get(i10 - m60Var.P1);
            if (org.telegram.messenger.o5.E(dialog.f19797id)) {
                return org.telegram.messenger.vp.r1(m60Var.f21583a).Z1(Long.valueOf(dialog.f19797id));
            }
            return org.telegram.messenger.vp.r1(m60Var.f21583a).L0(Long.valueOf(-dialog.f19797id));
        }
        return (TLObject) m60Var.V1.get(i10 - m60Var.P1);
    }

    @Override
    public final int b() {
        return this.f26263c.T1;
    }

    @Override
    public final int d(int i10) {
        m60 m60Var = this.f26263c;
        if (i10 == m60Var.O1) {
            return 1;
        }
        m60Var.getClass();
        if (i10 == 0) {
            return 2;
        }
        if (i10 >= m60Var.P1 && i10 < m60Var.Q1) {
            return 3;
        }
        if (i10 == m60Var.S1) {
            return 4;
        }
        if (i10 == m60Var.R1) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                TLObject E = E(i10);
                Object object = j4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).f19942id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).f19793id;
                } else {
                    j10 = 0;
                }
                m60 m60Var = this.f26263c;
                boolean z12 = false;
                if (i10 != m60Var.Q1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) E).f19942id;
                } else if (E instanceof TLRPC.Chat) {
                    j11 = -((TLRPC.Chat) E).f19793id;
                } else {
                    j11 = 0;
                }
                if (j11 != 0) {
                    a0.h hVar = m60Var.K1;
                    if (hVar != null && hVar.h(j11) >= 0) {
                        j4Var.c(true, false);
                        j4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (m60Var.W1.h(j11) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j10 == j11) {
                        z12 = true;
                    }
                    j4Var.c(z11, z12);
                    j4Var.setCheckBoxEnabled(true);
                    return;
                }
                return;
            }
            return;
        }
        view.requestLayout();
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.b5 b5Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i10 != 2) {
            m60 m60Var = this.f26263c;
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(context);
                        b5Var2.b(2131232202, 7, org.telegram.messenger.cd.L0(2131743416, null), true);
                        int i11 = org.telegram.ui.ActionBar.t6.f21114n5;
                        b5Var2.a(i11, i11);
                        b5Var = b5Var2;
                    } else {
                        f60 f60Var = new f60(context, null, 0, null, 0);
                        f60Var.setLayoutParams(new s4.o0(-1, -1));
                        f60Var.e.setVisibility(8);
                        org.telegram.ui.tt ttVar = m60Var.f28299d2;
                        nh.p pVar = f60Var.d;
                        if (ttVar != null) {
                            pVar.setText(org.telegram.messenger.cd.L0(2131750727, null));
                        } else {
                            pVar.setText(org.telegram.messenger.cd.L0(2131748240, null));
                        }
                        f60Var.setAnimateLayoutChange(true);
                        b5Var = f60Var;
                    }
                } else {
                    b5Var = new View(context);
                }
            } else {
                if (m60Var.f28299d2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b5Var = new org.telegram.ui.Cells.j4(context, 1, 0, z10);
            }
        } else {
            b5Var = new bi.t0(this, context, 14);
        }
        return new s4.c1(b5Var);
    }
}
