package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ox {
    public final ey f42245a;

    public ox(ey eyVar) {
        this.f42245a = eyVar;
    }

    public final long a() {
        ey eyVar = this.f42245a;
        vw vwVar = eyVar.G3;
        if (vwVar != null && (vwVar.getFragment() instanceof cf1)) {
            return -((cf1) eyVar.G3.getFragment()).f38288a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        ey eyVar = this.f42245a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
        org.telegram.ui.Components.xo0 xo0Var = eyVar.C0.f28244d0;
        if (xo0Var.N && xo0Var.O()) {
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.xo0 xo0Var2 = eyVar.C0.f28244d0;
            if (xo0Var2.N) {
                arrayList = xo0Var2.f14096v0;
            } else {
                arrayList = xo0Var2.f14095u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f22369a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) {
                public final ox f41911b;

                {
                    this.f41911b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f41911b.f42245a.C0.f28244d0.E();
                            return;
                        default:
                            ey eyVar2 = this.f41911b.f42245a;
                            if (eyVar2.C0.f28244d0.O()) {
                                eyVar2.C0.f28244d0.E();
                                return;
                            }
                            org.telegram.ui.Components.xo0 xo0Var3 = eyVar2.C0.f28244d0;
                            xo0Var3.f14082j0.c();
                            xo0Var3.J.clear();
                            xo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) {
                public final ox f41911b;

                {
                    this.f41911b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f41911b.f42245a.C0.f28244d0.E();
                            return;
                        default:
                            ey eyVar2 = this.f41911b.f42245a;
                            if (eyVar2.C0.f28244d0.O()) {
                                eyVar2.C0.f28244d0.E();
                                return;
                            }
                            org.telegram.ui.Components.xo0 xo0Var3 = eyVar2.C0.f28244d0;
                            xo0Var3.f14082j0.c();
                            xo0Var3.J.clear();
                            xo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        eyVar.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, eyVar.getResourceProvider());
        }
    }

    public final void c() {
        int i10;
        mx mxVar = this.f42245a.C0;
        if (mxVar != null) {
            org.telegram.ui.Components.rl0 rl0Var = mxVar.f28246f0;
            int i11 = mxVar.U0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            rl0Var.b(i10);
            mxVar.U0 = mxVar.f28244d0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ey eyVar = this.f42245a;
        if (eyVar.C0.f28242b0.getVisibility() == 0) {
            z11 = true;
        }
        if (eyVar.f39026j2 && eyVar.f39031k2) {
            mx mxVar = eyVar.C0;
            if (mxVar.f28242b0 != null) {
                if (!z10 && mxVar.f28244d0.h() == 0) {
                    eyVar.C0.f28242b0.e(false, z11);
                } else {
                    eyVar.C0.f28242b0.e(true, z11);
                }
            }
        }
        if (z10 && eyVar.C0.f28244d0.h() == 0) {
            mx mxVar2 = eyVar.C0;
            mxVar2.f28246f0.a();
            mxVar2.f28241a0.invalidate();
            mxVar2.U0 = 0;
        }
    }
}
