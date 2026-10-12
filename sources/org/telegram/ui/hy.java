package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hy {
    public final vy f38562a;

    public hy(vy vyVar) {
        this.f38562a = vyVar;
    }

    public final long a() {
        vy vyVar = this.f38562a;
        px pxVar = vyVar.F3;
        if (pxVar != null && (pxVar.getFragment() instanceof hg1)) {
            return -((hg1) vyVar.F3.getFragment()).f38376a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        vy vyVar = this.f38562a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vyVar.getParentActivity());
        org.telegram.ui.Components.cp0 cp0Var = vyVar.C0.f27598b0;
        if (cp0Var.N && cp0Var.P()) {
            alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.cp0 cp0Var2 = vyVar.C0.f27598b0;
            if (cp0Var2.N) {
                arrayList = cp0Var2.f10639v0;
            } else {
                arrayList = cp0Var2.f10638u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f20142a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                public final hy f38175b;

                {
                    this.f38175b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f38175b.f38562a.C0.f27598b0.E();
                            return;
                        default:
                            vy vyVar2 = this.f38175b.f38562a;
                            if (vyVar2.C0.f27598b0.P()) {
                                vyVar2.C0.f27598b0.E();
                                return;
                            }
                            org.telegram.ui.Components.cp0 cp0Var3 = vyVar2.C0.f27598b0;
                            cp0Var3.f10625j0.c();
                            cp0Var3.J.clear();
                            cp0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.z1(this) {
                public final hy f38175b;

                {
                    this.f38175b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f38175b.f38562a.C0.f27598b0.E();
                            return;
                        default:
                            vy vyVar2 = this.f38175b.f38562a;
                            if (vyVar2.C0.f27598b0.P()) {
                                vyVar2.C0.f27598b0.E();
                                return;
                            }
                            org.telegram.ui.Components.cp0 cp0Var3 = vyVar2.C0.f27598b0;
                            cp0Var3.f10625j0.c();
                            cp0Var3.J.clear();
                            cp0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        vyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(vyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20800q7));
        }
    }

    public final void c() {
        int i10;
        fy fyVar = this.f38562a.C0;
        if (fyVar != null) {
            org.telegram.ui.Components.bm0 bm0Var = fyVar.f27600d0;
            int i11 = fyVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            bm0Var.b(i10);
            fyVar.S0 = fyVar.f27598b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        vy vyVar = this.f38562a;
        if (vyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (vyVar.f42933j2 && vyVar.f42937k2) {
            fy fyVar = vyVar.C0;
            if (fyVar.W != null) {
                if (!z10 && fyVar.f27598b0.h() == 0) {
                    vyVar.C0.W.e(false, z11);
                } else {
                    vyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && vyVar.C0.f27598b0.h() == 0) {
            fy fyVar2 = vyVar.C0;
            fyVar2.f27600d0.a();
            fyVar2.V.invalidate();
            fyVar2.S0 = 0;
        }
    }
}
