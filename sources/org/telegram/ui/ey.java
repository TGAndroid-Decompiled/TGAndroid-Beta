package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ey {
    public final sy f37478a;

    public ey(sy syVar) {
        this.f37478a = syVar;
    }

    public final long a() {
        sy syVar = this.f37478a;
        mx mxVar = syVar.F3;
        if (mxVar != null && (mxVar.getFragment() instanceof eg1)) {
            return -((eg1) syVar.F3.getFragment()).f37311a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        sy syVar = this.f37478a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(syVar.getParentActivity());
        org.telegram.ui.Components.yo0 yo0Var = syVar.C0.f26437b0;
        if (yo0Var.N && yo0Var.P()) {
            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.yo0 yo0Var2 = syVar.C0.f26437b0;
            if (yo0Var2.N) {
                arrayList = yo0Var2.f10640v0;
            } else {
                arrayList = yo0Var2.f10639u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f20368a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                public final ey f37141b;

                {
                    this.f37141b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f37141b.f37478a.C0.f26437b0.E();
                            return;
                        default:
                            sy syVar2 = this.f37141b.f37478a;
                            if (syVar2.C0.f26437b0.P()) {
                                syVar2.C0.f26437b0.E();
                                return;
                            }
                            org.telegram.ui.Components.yo0 yo0Var3 = syVar2.C0.f26437b0;
                            yo0Var3.f10626j0.c();
                            yo0Var3.J.clear();
                            yo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.z1(this) {
                public final ey f37141b;

                {
                    this.f37141b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f37141b.f37478a.C0.f26437b0.E();
                            return;
                        default:
                            sy syVar2 = this.f37141b.f37478a;
                            if (syVar2.C0.f26437b0.P()) {
                                syVar2.C0.f26437b0.E();
                                return;
                            }
                            org.telegram.ui.Components.yo0 yo0Var3 = syVar2.C0.f26437b0;
                            yo0Var3.f10626j0.c();
                            yo0Var3.J.clear();
                            yo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        syVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(syVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21026q7));
        }
    }

    public final void c() {
        int i10;
        cy cyVar = this.f37478a.C0;
        if (cyVar != null) {
            org.telegram.ui.Components.xl0 xl0Var = cyVar.f26439d0;
            int i11 = cyVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            xl0Var.b(i10);
            cyVar.S0 = cyVar.f26437b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        sy syVar = this.f37478a;
        if (syVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (syVar.f41935j2 && syVar.f41939k2) {
            cy cyVar = syVar.C0;
            if (cyVar.W != null) {
                if (!z10 && cyVar.f26437b0.h() == 0) {
                    syVar.C0.W.e(false, z11);
                } else {
                    syVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && syVar.C0.f26437b0.h() == 0) {
            cy cyVar2 = syVar.C0;
            cyVar2.f26439d0.a();
            cyVar2.V.invalidate();
            cyVar2.S0 = 0;
        }
    }
}
