package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lx {
    public final zx f39397a;

    public lx(zx zxVar) {
        this.f39397a = zxVar;
    }

    public final long a() {
        zx zxVar = this.f39397a;
        ww wwVar = zxVar.F3;
        if (wwVar != null && (wwVar.getFragment() instanceof nb1)) {
            return -((nb1) zxVar.F3.getFragment()).f39797a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        zx zxVar = this.f39397a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zxVar.getParentActivity());
        org.telegram.ui.Components.an0 an0Var = zxVar.C0.f26872d0;
        boolean z10 = an0Var.N;
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        if (z10 && an0Var.O()) {
            x1Var.R = org.telegram.messenger.dd.L0(2131752059, null);
            org.telegram.ui.Components.an0 an0Var2 = zxVar.C0.f26872d0;
            if (an0Var2.N) {
                arrayList = an0Var2.f55725v0;
            } else {
                arrayList = an0Var2.f55724u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            x1Var.T = org.telegram.messenger.dd.G(i10, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1(this) {
                public final lx f39013b;

                {
                    this.f39013b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                    switch (r2) {
                        case 0:
                            this.f39013b.f39397a.C0.f26872d0.E();
                            return;
                        default:
                            zx zxVar2 = this.f39013b.f39397a;
                            if (zxVar2.C0.f26872d0.O()) {
                                zxVar2.C0.f26872d0.E();
                                return;
                            }
                            org.telegram.ui.Components.an0 an0Var3 = zxVar2.C0.f26872d0;
                            an0Var3.f55711j0.c();
                            an0Var3.J.clear();
                            an0Var3.f();
                            return;
                    }
                }
            });
        } else {
            x1Var.R = org.telegram.messenger.dd.L0(2131752056, null);
            x1Var.T = org.telegram.messenger.dd.L0(2131752061, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752099, null), new org.telegram.ui.ActionBar.u1(this) {
                public final lx f39013b;

                {
                    this.f39013b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                    switch (r2) {
                        case 0:
                            this.f39013b.f39397a.C0.f26872d0.E();
                            return;
                        default:
                            zx zxVar2 = this.f39013b.f39397a;
                            if (zxVar2.C0.f26872d0.O()) {
                                zxVar2.C0.f26872d0.E();
                                return;
                            }
                            org.telegram.ui.Components.an0 an0Var3 = zxVar2.C0.f26872d0;
                            an0Var3.f55711j0.c();
                            an0Var3.J.clear();
                            an0Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        zxVar.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, zxVar.getResourceProvider());
        }
    }

    public final void c() {
        int i10;
        jx jxVar = this.f39397a.C0;
        if (jxVar != null) {
            org.telegram.ui.Components.xj0 xj0Var = jxVar.f26874f0;
            int i11 = jxVar.U0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            xj0Var.b(i10);
            jxVar.U0 = jxVar.f26872d0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        zx zxVar = this.f39397a;
        if (zxVar.C0.f26870b0.getVisibility() == 0) {
            z11 = true;
        }
        if (zxVar.f44165j2 && zxVar.f44170k2) {
            jx jxVar = zxVar.C0;
            if (jxVar.f26870b0 != null) {
                if (!z10 && jxVar.f26872d0.b() == 0) {
                    zxVar.C0.f26870b0.e(false, z11);
                } else {
                    zxVar.C0.f26870b0.e(true, z11);
                }
            }
        }
        if (z10 && zxVar.C0.f26872d0.b() == 0) {
            jx jxVar2 = zxVar.C0;
            jxVar2.f26874f0.a();
            jxVar2.f26869a0.invalidate();
            jxVar2.U0 = 0;
        }
    }
}
