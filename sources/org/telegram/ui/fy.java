package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fy {
    public final uy f36433a;

    public fy(uy uyVar) {
        this.f36433a = uyVar;
    }

    public final long a() {
        uy uyVar = this.f36433a;
        mx mxVar = uyVar.F3;
        if (mxVar != null && (mxVar.getFragment() instanceof yf1)) {
            return -((yf1) uyVar.F3.getFragment()).f43170a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        uy uyVar = this.f36433a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
        org.telegram.ui.Components.jo0 jo0Var = uyVar.C0.f30125d0;
        if (jo0Var.N && jo0Var.P()) {
            alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.jo0 jo0Var2 = uyVar.C0.f30125d0;
            if (jo0Var2.N) {
                arrayList = jo0Var2.f10636v0;
            } else {
                arrayList = jo0Var2.f10635u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f20372a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) {
                public final fy f36117b;

                {
                    this.f36117b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f36117b.f36433a.C0.f30125d0.E();
                            return;
                        default:
                            uy uyVar2 = this.f36117b.f36433a;
                            if (uyVar2.C0.f30125d0.P()) {
                                uyVar2.C0.f30125d0.E();
                                return;
                            }
                            org.telegram.ui.Components.jo0 jo0Var3 = uyVar2.C0.f30125d0;
                            jo0Var3.f10622j0.c();
                            jo0Var3.J.clear();
                            jo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) {
                public final fy f36117b;

                {
                    this.f36117b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f36117b.f36433a.C0.f30125d0.E();
                            return;
                        default:
                            uy uyVar2 = this.f36117b.f36433a;
                            if (uyVar2.C0.f30125d0.P()) {
                                uyVar2.C0.f30125d0.E();
                                return;
                            }
                            org.telegram.ui.Components.jo0 jo0Var3 = uyVar2.C0.f30125d0;
                            jo0Var3.f10622j0.c();
                            jo0Var3.J.clear();
                            jo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
        uyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21063q7));
        }
    }

    public final void c() {
        int i10;
        dy dyVar = this.f36433a.C0;
        if (dyVar != null) {
            org.telegram.ui.Components.dl0 dl0Var = dyVar.f30127f0;
            int i11 = dyVar.U0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            dl0Var.b(i10);
            dyVar.U0 = dyVar.f30125d0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        uy uyVar = this.f36433a;
        if (uyVar.C0.f30123b0.getVisibility() == 0) {
            z11 = true;
        }
        if (uyVar.f41428j2 && uyVar.f41432k2) {
            dy dyVar = uyVar.C0;
            if (dyVar.f30123b0 != null) {
                if (!z10 && dyVar.f30125d0.h() == 0) {
                    uyVar.C0.f30123b0.e(false, z11);
                } else {
                    uyVar.C0.f30123b0.e(true, z11);
                }
            }
        }
        if (z10 && uyVar.C0.f30125d0.h() == 0) {
            dy dyVar2 = uyVar.C0;
            dyVar2.f30127f0.a();
            dyVar2.f30122a0.invalidate();
            dyVar2.U0 = 0;
        }
    }
}
