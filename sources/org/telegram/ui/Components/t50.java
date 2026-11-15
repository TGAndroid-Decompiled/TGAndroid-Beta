package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t50 extends tj0 {
    public final a60 f39542c;

    public t50(a60 a60Var) {
        this.f39542c = a60Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 == 3 || i7 == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i7) {
        a60 a60Var = this.f39542c;
        if (a60Var.f32873h2 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) a60Var.f32874i2.get(i7 - a60Var.T1);
            if (org.telegram.messenger.m5.E(dialog.f28055id)) {
                return org.telegram.messenger.np.s1(a60Var.f29679a).a2(Long.valueOf(dialog.f28055id));
            }
            return org.telegram.messenger.np.s1(a60Var.f29679a).M0(Long.valueOf(-dialog.f28055id));
        }
        return (TLObject) a60Var.Z1.get(i7 - a60Var.T1);
    }

    @Override
    public final int b() {
        return this.f39542c.X1;
    }

    @Override
    public final int d(int i7) {
        a60 a60Var = this.f39542c;
        if (i7 == a60Var.S1) {
            return 1;
        }
        a60Var.getClass();
        if (i7 == 0) {
            return 2;
        }
        if (i7 >= a60Var.T1 && i7 < a60Var.U1) {
            return 3;
        }
        if (i7 == a60Var.W1) {
            return 4;
        }
        if (i7 == a60Var.V1) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        long j3;
        boolean z10;
        long j10;
        boolean z11;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i10 != 2) {
            if (i10 == 3) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                TLObject E = E(i7);
                Object object = h4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).f28200id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).f28051id;
                } else {
                    j3 = 0;
                }
                a60 a60Var = this.f39542c;
                boolean z12 = false;
                if (i7 != a60Var.U1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.e(E, null, null, z10);
                if (E instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) E).f28200id;
                } else if (E instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) E).f28051id;
                } else {
                    j10 = 0;
                }
                if (j10 != 0) {
                    a0.h hVar = a60Var.O1;
                    if (hVar != null && hVar.h(j10) >= 0) {
                        h4Var.c(true, false);
                        h4Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (a60Var.f32867a2.h(j10) >= 0) {
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
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x4 x4Var;
        boolean z10;
        Context context = viewGroup.getContext();
        if (i7 != 2) {
            a60 a60Var = this.f39542c;
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(context);
                        x4Var2.b(2131232204, 7, org.telegram.messenger.hd.M0(2131743390, null), true);
                        int i10 = org.telegram.ui.ActionBar.j6.f29030n5;
                        x4Var2.a(i10, i10);
                        x4Var = x4Var2;
                    } else {
                        s50 s50Var = new s50(context, null, 0, null, 0);
                        s50Var.setLayoutParams(new v4.p0(-1, -1));
                        s50Var.f33709e.setVisibility(8);
                        org.telegram.ui.zr zrVar = a60Var.f32873h2;
                        xh.l lVar = s50Var.d;
                        if (zrVar != null) {
                            lVar.setText(org.telegram.messenger.hd.M0(2131750726, null));
                        } else {
                            lVar.setText(org.telegram.messenger.hd.M0(2131748223, null));
                        }
                        s50Var.setAnimateLayoutChange(true);
                        x4Var = s50Var;
                    }
                } else {
                    x4Var = new View(context);
                }
            } else {
                if (a60Var.f32873h2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x4Var = new org.telegram.ui.Cells.h4(context, 1, 0, z10);
            }
        } else {
            x4Var = new bi.o2(20, context, this);
        }
        return new v4.e1(x4Var);
    }
}
