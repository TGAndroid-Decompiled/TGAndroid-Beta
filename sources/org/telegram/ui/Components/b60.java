package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b60 extends bk0 {
    public final j60 f33569c;

    public b60(j60 j60Var) {
        this.f33569c = j60Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 == 3 || i7 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i7) {
        j60 j60Var = this.f33569c;
        if (j60Var.f36358h2 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) j60Var.f36359i2.get(i7 - j60Var.T1);
            if (org.telegram.messenger.n5.E(dialog.f28409id)) {
                return org.telegram.messenger.mp.u1(j60Var.f30189a).c2(Long.valueOf(dialog.f28409id));
            }
            return org.telegram.messenger.mp.u1(j60Var.f30189a).O0(Long.valueOf(-dialog.f28409id));
        }
        return (TLObject) j60Var.Z1.get(i7 - j60Var.T1);
    }

    @Override
    public final int b() {
        return this.f33569c.X1;
    }

    @Override
    public final int d(int i7) {
        j60 j60Var = this.f33569c;
        if (i7 == j60Var.S1) {
            return 1;
        }
        j60Var.getClass();
        if (i7 == 0) {
            return 2;
        }
        if (i7 >= j60Var.T1 && i7 < j60Var.U1) {
            return 3;
        }
        if (i7 == j60Var.W1) {
            return 4;
        }
        if (i7 == j60Var.V1) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        long j3;
        boolean z10;
        long j10;
        boolean z11;
        int i10 = f1Var.f59126f;
        View view = f1Var.f59122a;
        if (i10 != 2) {
            if (i10 == 3) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                TLObject E = E(i7);
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f28554id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28405id;
                } else {
                    j3 = 0;
                }
                j60 j60Var = this.f33569c;
                boolean z12 = false;
                if (i7 != j60Var.U1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f28554id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f28405id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.h hVar = j60Var.O1;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (j60Var.f36352a2.h(j10) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j3 == j10) {
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
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x4 x4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i7 != 2) {
            j60 j60Var = this.f33569c;
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(context);
                        x4Var2.b(2131232205, 7, org.telegram.messenger.gd.M0(2131743153, null), true);
                        int i10 = org.telegram.ui.ActionBar.n6.f29577n5;
                        x4Var2.a(i10, i10);
                        x4Var = x4Var2;
                    } else {
                        a60 a60Var = new a60(context, null, 0, null, 0);
                        a60Var.setLayoutParams(new v4.q0(-1, -1));
                        a60Var.f36896e.setVisibility(8);
                        org.telegram.ui.zr zrVar = j60Var.f36358h2;
                        xh.l lVar = a60Var.d;
                        if (zrVar != null) {
                            lVar.setText(org.telegram.messenger.gd.M0(2131750715, null));
                        } else {
                            lVar.setText(org.telegram.messenger.gd.M0(2131748031, null));
                        }
                        a60Var.setAnimateLayoutChange(true);
                        x4Var = a60Var;
                    }
                } else {
                    x4Var = new View(context);
                }
            } else {
                if (j60Var.f36358h2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x4Var = new org.telegram.ui.Cells.h4(context, 1, 0, z10);
            }
        } else {
            x4Var = new bi.i3(20, context, this);
        }
        return new v4.f1(x4Var);
    }
}
