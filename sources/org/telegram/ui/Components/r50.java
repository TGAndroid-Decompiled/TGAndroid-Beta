package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r50 extends pj0 {
    public final y50 f37562c;

    public r50(y50 y50Var) {
        this.f37562c = y50Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 == 3 || i7 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i7) {
        y50 y50Var = this.f37562c;
        if (y50Var.d2 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) y50Var.f40603e2.get(i7 - y50Var.P1);
            if (org.telegram.messenger.m5.E(dialog.f26960id)) {
                return org.telegram.messenger.qp.s1(y50Var.f28621a).a2(Long.valueOf(dialog.f26960id));
            }
            return org.telegram.messenger.qp.s1(y50Var.f28621a).M0(Long.valueOf(-dialog.f26960id));
        }
        return (TLObject) y50Var.V1.get(i7 - y50Var.P1);
    }

    @Override
    public final int b() {
        return this.f37562c.T1;
    }

    @Override
    public final int d(int i7) {
        y50 y50Var = this.f37562c;
        if (i7 == y50Var.O1) {
            return 1;
        }
        y50Var.getClass();
        if (i7 == 0) {
            return 2;
        }
        if (i7 >= y50Var.P1 && i7 < y50Var.Q1) {
            return 3;
        }
        if (i7 == y50Var.S1) {
            return 4;
        }
        if (i7 == y50Var.R1) {
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
        int i10 = d1Var.f57060f;
        View view = d1Var.f57056a;
        if (i10 != 2) {
            if (i10 == 3) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                TLObject E = E(i7);
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f27105id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f26956id;
                } else {
                    j3 = 0;
                }
                y50 y50Var = this.f37562c;
                boolean z11 = false;
                if (i7 != y50Var.Q1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                h4Var.e(E, null, null, z9);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f27105id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f26956id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.h hVar = y50Var.K1;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (y50Var.W1.h(j10) >= 0) {
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
            y50 y50Var = this.f37562c;
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(context);
                        x4Var2.b(2131232203, 7, org.telegram.messenger.id.M0(2131743390, null), true);
                        int i10 = org.telegram.ui.ActionBar.l6.f28046n5;
                        x4Var2.a(i10, i10);
                        x4Var = x4Var2;
                    } else {
                        q50 q50Var = new q50(context, null, 0, null, 0);
                        q50Var.setLayoutParams(new v4.o0(-1, -1));
                        q50Var.f32768e.setVisibility(8);
                        org.telegram.ui.yr yrVar = y50Var.d2;
                        xh.l lVar = q50Var.d;
                        if (yrVar != null) {
                            lVar.setText(org.telegram.messenger.id.M0(2131750726, null));
                        } else {
                            lVar.setText(org.telegram.messenger.id.M0(2131748223, null));
                        }
                        q50Var.setAnimateLayoutChange(true);
                        x4Var = q50Var;
                    }
                } else {
                    x4Var = new View(context);
                }
            } else {
                if (y50Var.d2 != null) {
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
