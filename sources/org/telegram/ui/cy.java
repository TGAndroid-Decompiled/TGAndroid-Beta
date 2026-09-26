package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cy {
    public final qy f32816a;

    public cy(qy qyVar) {
        this.f32816a = qyVar;
    }

    public final long a() {
        qy qyVar = this.f32816a;
        kx kxVar = qyVar.F3;
        if (kxVar != null && (kxVar.getFragment() instanceof wf1)) {
            return -((wf1) qyVar.F3.getFragment()).f39307a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i10;
        qy qyVar = this.f32816a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
        org.telegram.ui.Components.fo0 fo0Var = qyVar.C0.f26463b0;
        if (fo0Var.N && fo0Var.P()) {
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.fo0 fo0Var2 = qyVar.C0.f26463b0;
            if (fo0Var2.N) {
                arrayList = fo0Var2.f9768v0;
            } else {
                arrayList = fo0Var2.f9767u0;
            }
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            alertDialog$Builder.f18661a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", i10, new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) {
                public final cy f32254b;

                {
                    this.f32254b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f32254b.f32816a.C0.f26463b0.E();
                            return;
                        default:
                            qy qyVar2 = this.f32254b.f32816a;
                            if (qyVar2.C0.f26463b0.P()) {
                                qyVar2.C0.f26463b0.E();
                                return;
                            }
                            org.telegram.ui.Components.fo0 fo0Var3 = qyVar2.C0.f26463b0;
                            fo0Var3.f9754j0.c();
                            fo0Var3.J.clear();
                            fo0Var3.l();
                            return;
                    }
                }
            });
        } else {
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.ClearSearchAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.z1(this) {
                public final cy f32254b;

                {
                    this.f32254b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r2) {
                        case 0:
                            this.f32254b.f32816a.C0.f26463b0.E();
                            return;
                        default:
                            qy qyVar2 = this.f32254b.f32816a;
                            if (qyVar2.C0.f26463b0.P()) {
                                qyVar2.C0.f26463b0.E();
                                return;
                            }
                            org.telegram.ui.Components.fo0 fo0Var3 = qyVar2.C0.f26463b0;
                            fo0Var3.f9754j0.c();
                            fo0Var3.J.clear();
                            fo0Var3.l();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
        qyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19298q7));
        }
    }

    public final void c() {
        int i10;
        zx zxVar = this.f32816a.C0;
        if (zxVar != null) {
            org.telegram.ui.Components.cl0 cl0Var = zxVar.f26465d0;
            int i11 = zxVar.S0;
            if (i11 > 0) {
                i10 = i11 + 1;
            } else {
                i10 = 0;
            }
            cl0Var.b(i10);
            zxVar.S0 = zxVar.f26463b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        qy qyVar = this.f32816a;
        if (qyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (qyVar.f37060j2 && qyVar.f37064k2) {
            zx zxVar = qyVar.C0;
            if (zxVar.W != null) {
                if (!z10 && zxVar.f26463b0.h() == 0) {
                    qyVar.C0.W.e(false, z11);
                } else {
                    qyVar.C0.W.e(true, z11);
                }
            }
        }
        if (z10 && qyVar.C0.f26463b0.h() == 0) {
            zx zxVar2 = qyVar.C0;
            zxVar2.f26465d0.a();
            zxVar2.V.invalidate();
            zxVar2.S0 = 0;
        }
    }
}
