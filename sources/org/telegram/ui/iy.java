package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class iy {
    public final wy f33812a;

    public iy(wy wyVar) {
        this.f33812a = wyVar;
    }

    public final long a() {
        wy wyVar = this.f33812a;
        qx qxVar = wyVar.F3;
        if (qxVar != null && (qxVar.getFragment() instanceof ig1)) {
            return -((ig1) wyVar.F3.getFragment()).f33681a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        wy wyVar = this.f33812a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
        org.telegram.ui.Components.ao0 ao0Var = wyVar.C0.f23713b0;
        if (ao0Var.N && ao0Var.P()) {
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.ao0 ao0Var2 = wyVar.C0.f23713b0;
            if (ao0Var2.N) {
                arrayList = ao0Var2.f8053v0;
            } else {
                arrayList = ao0Var2.f8052u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f17528a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) {
                public final iy f33485b;

                {
                    this.f33485b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f33485b.f33812a.C0.f23713b0.E();
                            return;
                        default:
                            wy wyVar2 = this.f33485b.f33812a;
                            if (wyVar2.C0.f23713b0.P()) {
                                wyVar2.C0.f23713b0.E();
                                return;
                            }
                            org.telegram.ui.Components.ao0 ao0Var3 = wyVar2.C0.f23713b0;
                            ao0Var3.f8039j0.c();
                            ao0Var3.J.clear();
                            ao0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.c2(this) {
                public final iy f33485b;

                {
                    this.f33485b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f33485b.f33812a.C0.f23713b0.E();
                            return;
                        default:
                            wy wyVar2 = this.f33485b.f33812a;
                            if (wyVar2.C0.f23713b0.P()) {
                                wyVar2.C0.f23713b0.E();
                                return;
                            }
                            org.telegram.ui.Components.ao0 ao0Var3 = wyVar2.C0.f23713b0;
                            ao0Var3.f8039j0.c();
                            ao0Var3.J.clear();
                            ao0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        wyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
        }
    }

    public final void c() {
        int i10;
        gy gyVar = this.f33812a.C0;
        if (gyVar != null) {
            org.telegram.ui.Components.zk0 zk0Var = gyVar.f23715d0;
            int i11 = gyVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            zk0Var.b(i10);
            gyVar.S0 = gyVar.f23713b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        wy wyVar = this.f33812a;
        if (wyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (wyVar.f38459j2 && wyVar.f38463k2) {
            gy gyVar = wyVar.C0;
            if (gyVar.W != null) {
                if (!z10 && gyVar.f23713b0.h() == 0) {
                    wyVar.C0.W.e(false, z11);
                } else {
                    wyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && wyVar.C0.f23713b0.h() == 0) {
            gy gyVar2 = wyVar.C0;
            gyVar2.f23715d0.a();
            gyVar2.V.invalidate();
            gyVar2.S0 = 0;
        }
    }
}
