package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ox {
    public final dy f41259a;

    public ox(dy dyVar) {
        this.f41259a = dyVar;
    }

    public final long a() {
        dy dyVar = this.f41259a;
        yw ywVar = dyVar.B3;
        if (ywVar != null && (ywVar.getFragment() instanceof we1)) {
            return -((we1) dyVar.B3.getFragment()).f43741a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i9;
        dy dyVar = this.f41259a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar.getParentActivity());
        org.telegram.ui.Components.an0 an0Var = dyVar.f37750y0.U;
        if (an0Var.J && an0Var.P()) {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.an0 an0Var2 = dyVar.f37750y0.U;
            if (an0Var2.J) {
                arrayList = an0Var2.f19307r0;
            } else {
                arrayList = an0Var2.f19305q0;
            }
            if (arrayList != null) {
                i9 = arrayList.size();
            } else {
                i9 = 0;
            }
            alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("ClearSearchAlertPartial", i9, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                public final ox f40845b;

                {
                    this.f40845b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f40845b.f41259a.f37750y0.U.E();
                            return;
                        default:
                            dy dyVar2 = this.f40845b.f41259a;
                            if (dyVar2.f37750y0.U.P()) {
                                dyVar2.f37750y0.U.E();
                                return;
                            }
                            org.telegram.ui.Components.an0 an0Var3 = dyVar2.f37750y0.U;
                            an0Var3.f19294f0.c();
                            an0Var3.F.clear();
                            an0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) {
                public final ox f40845b;

                {
                    this.f40845b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f40845b.f41259a.f37750y0.U.E();
                            return;
                        default:
                            dy dyVar2 = this.f40845b.f41259a;
                            if (dyVar2.f37750y0.U.P()) {
                                dyVar2.f37750y0.U.E();
                                return;
                            }
                            org.telegram.ui.Components.an0 an0Var3 = dyVar2.f37750y0.U;
                            an0Var3.f19294f0.c();
                            an0Var3.F.clear();
                            an0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        dyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
        }
    }

    public final void c() {
        int i9;
        mx mxVar = this.f41259a.f37750y0;
        if (mxVar != null) {
            org.telegram.ui.Components.dk0 dk0Var = mxVar.W;
            int i10 = mxVar.O0;
            if (i10 > 0) {
                i9 = i10 + 1;
            } else {
                i9 = 0;
            }
            dk0Var.b(i9);
            mxVar.O0 = mxVar.U.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        dy dyVar = this.f41259a;
        if (dyVar.f37750y0.S.getVisibility() == 0) {
            z11 = true;
        }
        if (dyVar.f37658f2 && dyVar.f37663g2) {
            mx mxVar = dyVar.f37750y0;
            if (mxVar.S != null) {
                if (!z10 && mxVar.U.h() == 0) {
                    dyVar.f37750y0.S.e(false, z11);
                } else {
                    dyVar.f37750y0.S.e(true, z11);
                }
            }
        }
        if (z10 && dyVar.f37750y0.U.h() == 0) {
            mx mxVar2 = dyVar.f37750y0;
            mxVar2.W.a();
            mxVar2.R.invalidate();
            mxVar2.O0 = 0;
        }
    }
}
