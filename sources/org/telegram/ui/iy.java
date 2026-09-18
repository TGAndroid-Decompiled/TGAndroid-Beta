package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class iy {
    public final wy f34710a;

    public iy(wy wyVar) {
        this.f34710a = wyVar;
    }

    public final long a() {
        wy wyVar = this.f34710a;
        qx qxVar = wyVar.F3;
        if (qxVar != null && (qxVar.getFragment() instanceof fg1)) {
            return -((fg1) wyVar.F3.getFragment()).f33640a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        wy wyVar = this.f34710a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
        org.telegram.ui.Components.sn0 sn0Var = wyVar.C0.f30551c0;
        if (sn0Var.N && sn0Var.P()) {
            alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.sn0 sn0Var2 = wyVar.C0.f30551c0;
            if (sn0Var2.N) {
                arrayList = sn0Var2.f9787v0;
            } else {
                arrayList = sn0Var2.f9786u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f18447a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                public final iy f34385b;

                {
                    this.f34385b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f34385b.f34710a.C0.f30551c0.E();
                            return;
                        default:
                            wy wyVar2 = this.f34385b.f34710a;
                            if (wyVar2.C0.f30551c0.P()) {
                                wyVar2.C0.f30551c0.E();
                                return;
                            }
                            org.telegram.ui.Components.sn0 sn0Var3 = wyVar2.C0.f30551c0;
                            sn0Var3.f9773j0.c();
                            sn0Var3.J.clear();
                            sn0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) {
                public final iy f34385b;

                {
                    this.f34385b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f34385b.f34710a.C0.f30551c0.E();
                            return;
                        default:
                            wy wyVar2 = this.f34385b.f34710a;
                            if (wyVar2.C0.f30551c0.P()) {
                                wyVar2.C0.f30551c0.E();
                                return;
                            }
                            org.telegram.ui.Components.sn0 sn0Var3 = wyVar2.C0.f30551c0;
                            sn0Var3.f9773j0.c();
                            sn0Var3.J.clear();
                            sn0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
        wyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19101q7));
        }
    }

    public final void c() {
        int i10;
        gy gyVar = this.f34710a.C0;
        if (gyVar != null) {
            org.telegram.ui.Components.rk0 rk0Var = gyVar.f30553e0;
            int i11 = gyVar.T0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            rk0Var.b(i10);
            gyVar.T0 = gyVar.f30551c0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        wy wyVar = this.f34710a;
        if (wyVar.C0.f30549a0.getVisibility() == 0) {
            z11 = true;
        }
        if (wyVar.f39249j2 && wyVar.f39253k2) {
            gy gyVar = wyVar.C0;
            if (gyVar.f30549a0 != null) {
                if (!z10 && gyVar.f30551c0.h() == 0) {
                    wyVar.C0.f30549a0.e(false, z11);
                } else {
                    wyVar.C0.f30549a0.e(true, z11);
                }
            }
        }
        if (z10 && wyVar.C0.f30551c0.h() == 0) {
            gy gyVar2 = wyVar.C0;
            gyVar2.f30553e0.a();
            gyVar2.W.invalidate();
            gyVar2.T0 = 0;
        }
    }
}
