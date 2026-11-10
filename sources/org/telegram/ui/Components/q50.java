package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q50 extends oj0 {
    public final x50 f37153c;

    public q50(x50 x50Var) {
        this.f37153c = x50Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 == 3 || i7 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i7) {
        x50 x50Var = this.f37153c;
        if (x50Var.f40189g2 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) x50Var.f40190h2.get(i7 - x50Var.S1);
            if (org.telegram.messenger.m5.E(dialog.f26964id)) {
                return org.telegram.messenger.qp.s1(x50Var.f28669a).a2(Long.valueOf(dialog.f26964id));
            }
            return org.telegram.messenger.qp.s1(x50Var.f28669a).M0(Long.valueOf(-dialog.f26964id));
        }
        return (TLObject) x50Var.Y1.get(i7 - x50Var.S1);
    }

    @Override
    public final int b() {
        return this.f37153c.W1;
    }

    @Override
    public final int d(int i7) {
        x50 x50Var = this.f37153c;
        if (i7 == x50Var.R1) {
            return 1;
        }
        x50Var.getClass();
        if (i7 == 0) {
            return 2;
        }
        if (i7 >= x50Var.S1 && i7 < x50Var.T1) {
            return 3;
        }
        if (i7 == x50Var.V1) {
            return 4;
        }
        if (i7 == x50Var.U1) {
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
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i10 != 2) {
            if (i10 == 3) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                TLObject E = E(i7);
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f27109id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f26960id;
                } else {
                    j3 = 0;
                }
                x50 x50Var = this.f37153c;
                boolean z11 = false;
                if (i7 != x50Var.T1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                h4Var.e(E, null, null, z9);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f27109id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f26960id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.h hVar = x50Var.N1;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (x50Var.Z1.h(j10) >= 0) {
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
            x50 x50Var = this.f37153c;
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(context);
                        x4Var2.b(2131232203, 7, org.telegram.messenger.id.M0(2131743390, null), true);
                        int i10 = org.telegram.ui.ActionBar.m6.f28071n5;
                        x4Var2.a(i10, i10);
                        x4Var = x4Var2;
                    } else {
                        p50 p50Var = new p50(context, null, 0, null, 0);
                        p50Var.setLayoutParams(new v4.o0(-1, -1));
                        p50Var.f32368e.setVisibility(8);
                        org.telegram.ui.zr zrVar = x50Var.f40189g2;
                        xh.l lVar = p50Var.d;
                        if (zrVar != null) {
                            lVar.setText(org.telegram.messenger.id.M0(2131750726, null));
                        } else {
                            lVar.setText(org.telegram.messenger.id.M0(2131748223, null));
                        }
                        p50Var.setAnimateLayoutChange(true);
                        x4Var = p50Var;
                    }
                } else {
                    x4Var = new View(context);
                }
            } else {
                if (x50Var.f40189g2 != null) {
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
