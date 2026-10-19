package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nx {
    public final cy f39695a;

    public nx(cy cyVar) {
        this.f39695a = cyVar;
    }

    public final long a() {
        cy cyVar = this.f39695a;
        ww wwVar = cyVar.G3;
        if (wwVar != null && (wwVar.getFragment() instanceof re1)) {
            return -((re1) cyVar.G3.getFragment()).f41142a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        cy cyVar = this.f39695a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity());
        org.telegram.ui.Components.oo0 oo0Var = cyVar.C0.f31349b0;
        if (oo0Var.N && oo0Var.P()) {
            alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.oo0 oo0Var2 = cyVar.C0.f31349b0;
            if (oo0Var2.N) {
                arrayList = oo0Var2.f11897v0;
            } else {
                arrayList = oo0Var2.f11896u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f20602a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                public final nx f39356b;

                {
                    this.f39356b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f39356b.f39695a.C0.f31349b0.E();
                            return;
                        default:
                            cy cyVar2 = this.f39356b.f39695a;
                            if (cyVar2.C0.f31349b0.P()) {
                                cyVar2.C0.f31349b0.E();
                                return;
                            }
                            org.telegram.ui.Components.oo0 oo0Var3 = cyVar2.C0.f31349b0;
                            oo0Var3.f11883j0.c();
                            oo0Var3.J.clear();
                            oo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f20602a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) {
                public final nx f39356b;

                {
                    this.f39356b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f39356b.f39695a.C0.f31349b0.E();
                            return;
                        default:
                            cy cyVar2 = this.f39356b.f39695a;
                            if (cyVar2.C0.f31349b0.P()) {
                                cyVar2.C0.f31349b0.E();
                                return;
                            }
                            org.telegram.ui.Components.oo0 oo0Var3 = cyVar2.C0.f31349b0;
                            oo0Var3.f11883j0.c();
                            oo0Var3.J.clear();
                            oo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
        cyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21225q7));
        }
    }

    public final void c() {
        int i10;
        lx lxVar = this.f39695a.C0;
        if (lxVar != null) {
            org.telegram.ui.Components.nl0 nl0Var = lxVar.f31351d0;
            int i11 = lxVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            nl0Var.b(i10);
            lxVar.S0 = lxVar.f31349b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        cy cyVar = this.f39695a;
        if (cyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (cyVar.f36113j2 && cyVar.f36118k2) {
            lx lxVar = cyVar.C0;
            if (lxVar.W != null) {
                if (!z10 && lxVar.f31349b0.h() == 0) {
                    cyVar.C0.W.e(false, z11);
                } else {
                    cyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && cyVar.C0.f31349b0.h() == 0) {
            lx lxVar2 = cyVar.C0;
            lxVar2.f31351d0.a();
            lxVar2.V.invalidate();
            lxVar2.S0 = 0;
        }
    }
}
