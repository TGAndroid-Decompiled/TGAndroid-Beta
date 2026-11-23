package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lw {
    public final bx f49849a;

    public lw(bx bxVar) {
        this.f49849a = bxVar;
    }

    public final long a() {
        bx bxVar = this.f49849a;
        wv wvVar = bxVar.H3;
        if (wvVar != null && (wvVar.getFragment() instanceof w91)) {
            return -((w91) bxVar.H3.getFragment()).f53216a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i7;
        bx bxVar = this.f49849a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bxVar.getParentActivity());
        org.telegram.ui.Components.mm0 mm0Var = bxVar.D0.f40085e0;
        boolean z10 = mm0Var.O;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        if (z10 && mm0Var.O()) {
            t1Var.S = org.telegram.messenger.gd.N0(2131752047, null);
            org.telegram.ui.Components.mm0 mm0Var2 = bxVar.D0.f40085e0;
            if (mm0Var2.O) {
                arrayList = mm0Var2.f17590w0;
            } else {
                arrayList = mm0Var2.f17588v0;
            }
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            t1Var.U = org.telegram.messenger.gd.G(i7, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) {
                public final lw f49535b;

                {
                    this.f49535b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f49535b.f49849a.D0.f40085e0.E();
                            return;
                        default:
                            bx bxVar2 = this.f49535b.f49849a;
                            if (bxVar2.D0.f40085e0.O()) {
                                bxVar2.D0.f40085e0.E();
                                return;
                            }
                            org.telegram.ui.Components.mm0 mm0Var3 = bxVar2.D0.f40085e0;
                            mm0Var3.f17575k0.c();
                            mm0Var3.K.clear();
                            mm0Var3.f();
                            return;
                    }
                }
            });
        } else {
            t1Var.S = org.telegram.messenger.gd.N0(2131752044, null);
            t1Var.U = org.telegram.messenger.gd.N0(2131752049, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752087, null), new org.telegram.ui.ActionBar.q1(this) {
                public final lw f49535b;

                {
                    this.f49535b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f49535b.f49849a.D0.f40085e0.E();
                            return;
                        default:
                            bx bxVar2 = this.f49535b.f49849a;
                            if (bxVar2.D0.f40085e0.O()) {
                                bxVar2.D0.f40085e0.E();
                                return;
                            }
                            org.telegram.ui.Components.mm0 mm0Var3 = bxVar2.D0.f40085e0;
                            mm0Var3.f17575k0.c();
                            mm0Var3.K.clear();
                            mm0Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        bxVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, bxVar.getResourceProvider());
        }
    }

    public final void c() {
        int i7;
        jw jwVar = this.f49849a.D0;
        if (jwVar != null) {
            org.telegram.ui.Components.hj0 hj0Var = jwVar.f40087g0;
            int i10 = jwVar.V0;
            if (i10 > 0) {
                i7 = i10 + 1;
            } else {
                i7 = 0;
            }
            hj0Var.b(i7);
            jwVar.V0 = jwVar.f40085e0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        bx bxVar = this.f49849a;
        if (bxVar.D0.f40083c0.getVisibility() == 0) {
            z11 = true;
        }
        if (bxVar.f46579l2 && bxVar.f46583m2) {
            jw jwVar = bxVar.D0;
            if (jwVar.f40083c0 != null) {
                if (!z10 && jwVar.f40085e0.b() == 0) {
                    bxVar.D0.f40083c0.e(false, z11);
                } else {
                    bxVar.D0.f40083c0.e(true, z11);
                }
            }
        }
        if (z10 && bxVar.D0.f40085e0.b() == 0) {
            jw jwVar2 = bxVar.D0;
            jwVar2.f40087g0.a();
            jwVar2.f40082b0.invalidate();
            jwVar2.V0 = 0;
        }
    }
}
