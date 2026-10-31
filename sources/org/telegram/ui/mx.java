package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mx {
    public final ay f39787a;

    public mx(ay ayVar) {
        this.f39787a = ayVar;
    }

    public final long a() {
        ay ayVar = this.f39787a;
        xw xwVar = ayVar.F3;
        if (xwVar != null && (xwVar.getFragment() instanceof pb1)) {
            return -((pb1) ayVar.F3.getFragment()).f40566a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        ay ayVar = this.f39787a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ayVar.getParentActivity());
        org.telegram.ui.Components.zm0 zm0Var = ayVar.C0.f26451d0;
        boolean z10 = zm0Var.N;
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        if (z10 && zm0Var.O()) {
            x1Var.R = org.telegram.messenger.cd.L0(2131752059, null);
            org.telegram.ui.Components.zm0 zm0Var2 = ayVar.C0.f26451d0;
            if (zm0Var2.N) {
                arrayList = zm0Var2.f55707v0;
            } else {
                arrayList = zm0Var2.f55706u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            x1Var.T = org.telegram.messenger.cd.G(i10, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1(this) {
                public final mx f39423b;

                {
                    this.f39423b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                    switch (r2) {
                        case 0:
                            this.f39423b.f39787a.C0.f26451d0.E();
                            return;
                        default:
                            ay ayVar2 = this.f39423b.f39787a;
                            if (ayVar2.C0.f26451d0.O()) {
                                ayVar2.C0.f26451d0.E();
                                return;
                            }
                            org.telegram.ui.Components.zm0 zm0Var3 = ayVar2.C0.f26451d0;
                            zm0Var3.f55693j0.c();
                            zm0Var3.J.clear();
                            zm0Var3.f();
                            return;
                    }
                }
            });
        } else {
            x1Var.R = org.telegram.messenger.cd.L0(2131752056, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131752061, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752099, null), new org.telegram.ui.ActionBar.u1(this) {
                public final mx f39423b;

                {
                    this.f39423b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                    switch (r2) {
                        case 0:
                            this.f39423b.f39787a.C0.f26451d0.E();
                            return;
                        default:
                            ay ayVar2 = this.f39423b.f39787a;
                            if (ayVar2.C0.f26451d0.O()) {
                                ayVar2.C0.f26451d0.E();
                                return;
                            }
                            org.telegram.ui.Components.zm0 zm0Var3 = ayVar2.C0.f26451d0;
                            zm0Var3.f55693j0.c();
                            zm0Var3.J.clear();
                            zm0Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        ayVar.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, ayVar.getResourceProvider());
        }
    }

    public final void c() {
        int i10;
        kx kxVar = this.f39787a.C0;
        if (kxVar != null) {
            org.telegram.ui.Components.wj0 wj0Var = kxVar.f26453f0;
            int i11 = kxVar.U0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            wj0Var.b(i10);
            kxVar.U0 = kxVar.f26451d0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ay ayVar = this.f39787a;
        if (ayVar.C0.f26449b0.getVisibility() == 0) {
            z11 = true;
        }
        if (ayVar.f35822j2 && ayVar.f35827k2) {
            kx kxVar = ayVar.C0;
            if (kxVar.f26449b0 != null) {
                if (!z10 && kxVar.f26451d0.b() == 0) {
                    ayVar.C0.f26449b0.e(false, z11);
                } else {
                    ayVar.C0.f26449b0.e(true, z11);
                }
            }
        }
        if (z10 && ayVar.C0.f26451d0.b() == 0) {
            kx kxVar2 = ayVar.C0;
            kxVar2.f26453f0.a();
            kxVar2.f26448a0.invalidate();
            kxVar2.U0 = 0;
        }
    }
}
