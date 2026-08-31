package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ay {
    public final py f35264a;

    public ay(py pyVar) {
        this.f35264a = pyVar;
    }

    public final long a() {
        py pyVar = this.f35264a;
        kx kxVar = pyVar.C3;
        if (kxVar != null && (kxVar.getFragment() instanceof mf1)) {
            return -((mf1) pyVar.C3.getFragment()).f39102a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        py pyVar = this.f35264a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar.getParentActivity());
        org.telegram.ui.Components.xn0 xn0Var = pyVar.f40306z0.V;
        if (xn0Var.K && xn0Var.P()) {
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.xn0 xn0Var2 = pyVar.f40306z0.V;
            if (xn0Var2.K) {
                arrayList = xn0Var2.f48774s0;
            } else {
                arrayList = xn0Var2.f48772r0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f21166a.Q = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) {
                public final ay f44011b;

                {
                    this.f44011b = this;
                }

                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f44011b.f35264a.f40306z0.V.E();
                            return;
                        default:
                            py pyVar2 = this.f44011b.f35264a;
                            if (pyVar2.f40306z0.V.P()) {
                                pyVar2.f40306z0.V.E();
                                return;
                            }
                            org.telegram.ui.Components.xn0 xn0Var3 = pyVar2.f40306z0.V;
                            xn0Var3.f48760g0.c();
                            xn0Var3.G.clear();
                            xn0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.c2(this) {
                public final ay f44011b;

                {
                    this.f44011b = this;
                }

                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f44011b.f35264a.f40306z0.V.E();
                            return;
                        default:
                            py pyVar2 = this.f44011b.f35264a;
                            if (pyVar2.f40306z0.V.P()) {
                                pyVar2.f40306z0.V.E();
                                return;
                            }
                            org.telegram.ui.Components.xn0 xn0Var3 = pyVar2.f40306z0.V;
                            xn0Var3.f48760g0.c();
                            xn0Var3.G.clear();
                            xn0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        pyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7));
        }
    }

    public final void c() {
        int i10;
        yx yxVar = this.f35264a.f40306z0;
        if (yxVar != null) {
            org.telegram.ui.Components.al0 al0Var = yxVar.f26597a0;
            int i11 = yxVar.P0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            al0Var.b(i10);
            yxVar.P0 = yxVar.V.h();
        }
    }

    public final void d(boolean z4, boolean z10) {
        py pyVar = this.f35264a;
        if (pyVar.f40306z0.T.getVisibility() == 0) {
            z10 = true;
        }
        if (pyVar.f40214g2 && pyVar.f40219h2) {
            yx yxVar = pyVar.f40306z0;
            if (yxVar.T != null) {
                if (!z4 && yxVar.V.h() == 0) {
                    pyVar.f40306z0.T.e(false, z10);
                } else {
                    pyVar.f40306z0.T.e(true, z10);
                }
            }
        }
        if (z4 && pyVar.f40306z0.V.h() == 0) {
            yx yxVar2 = pyVar.f40306z0;
            yxVar2.f26597a0.a();
            yxVar2.S.invalidate();
            yxVar2.P0 = 0;
        }
    }
}
