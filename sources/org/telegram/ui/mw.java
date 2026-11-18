package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mw {
    public final cx f49979a;

    public mw(cx cxVar) {
        this.f49979a = cxVar;
    }

    public final long a() {
        cx cxVar = this.f49979a;
        xv xvVar = cxVar.H3;
        if (xvVar != null && (xvVar.getFragment() instanceof y91)) {
            return -((y91) cxVar.H3.getFragment()).f54109a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i7;
        cx cxVar = this.f49979a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
        org.telegram.ui.Components.km0 km0Var = cxVar.D0.f39185e0;
        boolean z10 = km0Var.O;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        if (z10 && km0Var.O()) {
            u1Var.S = org.telegram.messenger.gd.M0(2131752048, null);
            org.telegram.ui.Components.km0 km0Var2 = cxVar.D0.f39185e0;
            if (km0Var2.O) {
                arrayList = km0Var2.f17497w0;
            } else {
                arrayList = km0Var2.f17495v0;
            }
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            u1Var.U = org.telegram.messenger.gd.G(i7, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752090, null), new org.telegram.ui.ActionBar.r1(this) {
                public final mw f49702b;

                {
                    this.f49702b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f49702b.f49979a.D0.f39185e0.E();
                            return;
                        default:
                            cx cxVar2 = this.f49702b.f49979a;
                            if (cxVar2.D0.f39185e0.O()) {
                                cxVar2.D0.f39185e0.E();
                                return;
                            }
                            org.telegram.ui.Components.km0 km0Var3 = cxVar2.D0.f39185e0;
                            km0Var3.f17482k0.c();
                            km0Var3.K.clear();
                            km0Var3.f();
                            return;
                    }
                }
            });
        } else {
            u1Var.S = org.telegram.messenger.gd.M0(2131752045, null);
            u1Var.U = org.telegram.messenger.gd.M0(2131752050, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752088, null), new org.telegram.ui.ActionBar.r1(this) {
                public final mw f49702b;

                {
                    this.f49702b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f49702b.f49979a.D0.f39185e0.E();
                            return;
                        default:
                            cx cxVar2 = this.f49702b.f49979a;
                            if (cxVar2.D0.f39185e0.O()) {
                                cxVar2.D0.f39185e0.E();
                                return;
                            }
                            org.telegram.ui.Components.km0 km0Var3 = cxVar2.D0.f39185e0;
                            km0Var3.f17482k0.c();
                            km0Var3.K.clear();
                            km0Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        cxVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, cxVar.getResourceProvider());
        }
    }

    public final void c() {
        int i7;
        kw kwVar = this.f49979a.D0;
        if (kwVar != null) {
            org.telegram.ui.Components.fj0 fj0Var = kwVar.f39187g0;
            int i10 = kwVar.V0;
            if (i10 > 0) {
                i7 = i10 + 1;
            } else {
                i7 = 0;
            }
            fj0Var.b(i7);
            kwVar.V0 = kwVar.f39185e0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        cx cxVar = this.f49979a;
        if (cxVar.D0.f39183c0.getVisibility() == 0) {
            z11 = true;
        }
        if (cxVar.f46713l2 && cxVar.f46717m2) {
            kw kwVar = cxVar.D0;
            if (kwVar.f39183c0 != null) {
                if (!z10 && kwVar.f39185e0.b() == 0) {
                    cxVar.D0.f39183c0.e(false, z11);
                } else {
                    cxVar.D0.f39183c0.e(true, z11);
                }
            }
        }
        if (z10 && cxVar.D0.f39185e0.b() == 0) {
            kw kwVar2 = cxVar.D0;
            kwVar2.f39187g0.a();
            kwVar2.f39182b0.invalidate();
            kwVar2.V0 = 0;
        }
    }
}
