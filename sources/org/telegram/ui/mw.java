package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mw {
    public final cx f49972a;

    public mw(cx cxVar) {
        this.f49972a = cxVar;
    }

    public final long a() {
        cx cxVar = this.f49972a;
        xv xvVar = cxVar.H3;
        if (xvVar != null && (xvVar.getFragment() instanceof y91)) {
            return -((y91) cxVar.H3.getFragment()).f54075a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i7;
        cx cxVar = this.f49972a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
        org.telegram.ui.Components.mm0 mm0Var = cxVar.D0.f39905e0;
        boolean z10 = mm0Var.O;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        if (z10 && mm0Var.O()) {
            t1Var.S = org.telegram.messenger.hd.N0(2131752047, null);
            org.telegram.ui.Components.mm0 mm0Var2 = cxVar.D0.f39905e0;
            if (mm0Var2.O) {
                arrayList = mm0Var2.f17488w0;
            } else {
                arrayList = mm0Var2.f17486v0;
            }
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            t1Var.U = org.telegram.messenger.hd.G(i7, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) {
                public final mw f49682b;

                {
                    this.f49682b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f49682b.f49972a.D0.f39905e0.E();
                            return;
                        default:
                            cx cxVar2 = this.f49682b.f49972a;
                            if (cxVar2.D0.f39905e0.O()) {
                                cxVar2.D0.f39905e0.E();
                                return;
                            }
                            org.telegram.ui.Components.mm0 mm0Var3 = cxVar2.D0.f39905e0;
                            mm0Var3.f17473k0.c();
                            mm0Var3.K.clear();
                            mm0Var3.f();
                            return;
                    }
                }
            });
        } else {
            t1Var.S = org.telegram.messenger.hd.N0(2131752044, null);
            t1Var.U = org.telegram.messenger.hd.N0(2131752049, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752087, null), new org.telegram.ui.ActionBar.q1(this) {
                public final mw f49682b;

                {
                    this.f49682b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f49682b.f49972a.D0.f39905e0.E();
                            return;
                        default:
                            cx cxVar2 = this.f49682b.f49972a;
                            if (cxVar2.D0.f39905e0.O()) {
                                cxVar2.D0.f39905e0.E();
                                return;
                            }
                            org.telegram.ui.Components.mm0 mm0Var3 = cxVar2.D0.f39905e0;
                            mm0Var3.f17473k0.c();
                            mm0Var3.K.clear();
                            mm0Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        cxVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, cxVar.getResourceProvider());
        }
    }

    public final void c() {
        int i7;
        kw kwVar = this.f49972a.D0;
        if (kwVar != null) {
            org.telegram.ui.Components.hj0 hj0Var = kwVar.f39907g0;
            int i10 = kwVar.V0;
            if (i10 > 0) {
                i7 = i10 + 1;
            } else {
                i7 = 0;
            }
            hj0Var.b(i7);
            kwVar.V0 = kwVar.f39905e0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        cx cxVar = this.f49972a;
        if (cxVar.D0.f39903c0.getVisibility() == 0) {
            z11 = true;
        }
        if (cxVar.f46713l2 && cxVar.f46717m2) {
            kw kwVar = cxVar.D0;
            if (kwVar.f39903c0 != null) {
                if (!z10 && kwVar.f39905e0.b() == 0) {
                    cxVar.D0.f39903c0.e(false, z11);
                } else {
                    cxVar.D0.f39903c0.e(true, z11);
                }
            }
        }
        if (z10 && cxVar.D0.f39905e0.b() == 0) {
            kw kwVar2 = cxVar.D0;
            kwVar2.f39907g0.a();
            kwVar2.f39902b0.invalidate();
            kwVar2.V0 = 0;
        }
    }
}
