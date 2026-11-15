package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jw {
    public final yw f48468a;

    public jw(yw ywVar) {
        this.f48468a = ywVar;
    }

    public final long a() {
        yw ywVar = this.f48468a;
        uv uvVar = ywVar.H3;
        if (uvVar != null && (uvVar.getFragment() instanceof u91)) {
            return -((u91) ywVar.H3.getFragment()).f51834a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i7;
        yw ywVar = this.f48468a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ywVar.getParentActivity());
        org.telegram.ui.Components.cm0 cm0Var = ywVar.D0.f36050e0;
        boolean z10 = cm0Var.O;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        if (z10 && cm0Var.O()) {
            t1Var.S = org.telegram.messenger.hd.M0(2131752059, null);
            org.telegram.ui.Components.cm0 cm0Var2 = ywVar.D0.f36050e0;
            if (cm0Var2.O) {
                arrayList = cm0Var2.f17111w0;
            } else {
                arrayList = cm0Var2.f17109v0;
            }
            if (arrayList != null) {
                i7 = arrayList.size();
            } else {
                i7 = 0;
            }
            t1Var.U = org.telegram.messenger.hd.G(i7, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752101, null), new org.telegram.ui.ActionBar.q1(this) {
                public final jw f48136b;

                {
                    this.f48136b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f48136b.f48468a.D0.f36050e0.E();
                            return;
                        default:
                            yw ywVar2 = this.f48136b.f48468a;
                            if (ywVar2.D0.f36050e0.O()) {
                                ywVar2.D0.f36050e0.E();
                                return;
                            }
                            org.telegram.ui.Components.cm0 cm0Var3 = ywVar2.D0.f36050e0;
                            cm0Var3.f17096k0.c();
                            cm0Var3.K.clear();
                            cm0Var3.f();
                            return;
                    }
                }
            });
        } else {
            t1Var.S = org.telegram.messenger.hd.M0(2131752056, null);
            t1Var.U = org.telegram.messenger.hd.M0(2131752061, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new org.telegram.ui.ActionBar.q1(this) {
                public final jw f48136b;

                {
                    this.f48136b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f48136b.f48468a.D0.f36050e0.E();
                            return;
                        default:
                            yw ywVar2 = this.f48136b.f48468a;
                            if (ywVar2.D0.f36050e0.O()) {
                                ywVar2.D0.f36050e0.E();
                                return;
                            }
                            org.telegram.ui.Components.cm0 cm0Var3 = ywVar2.D0.f36050e0;
                            cm0Var3.f17096k0.c();
                            cm0Var3.K.clear();
                            cm0Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        ywVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, ywVar.getResourceProvider());
        }
    }

    public final void c() {
        int i7;
        hw hwVar = this.f48468a.D0;
        if (hwVar != null) {
            org.telegram.ui.Components.xi0 xi0Var = hwVar.f36052g0;
            int i10 = hwVar.V0;
            if (i10 > 0) {
                i7 = i10 + 1;
            } else {
                i7 = 0;
            }
            xi0Var.b(i7);
            hwVar.V0 = hwVar.f36050e0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        yw ywVar = this.f48468a;
        if (ywVar.D0.f36048c0.getVisibility() == 0) {
            z11 = true;
        }
        if (ywVar.f53703l2 && ywVar.f53707m2) {
            hw hwVar = ywVar.D0;
            if (hwVar.f36048c0 != null) {
                if (!z10 && hwVar.f36050e0.b() == 0) {
                    ywVar.D0.f36048c0.e(false, z11);
                } else {
                    ywVar.D0.f36048c0.e(true, z11);
                }
            }
        }
        if (z10 && ywVar.D0.f36050e0.b() == 0) {
            hw hwVar2 = ywVar.D0;
            hwVar2.f36052g0.a();
            hwVar2.f36047b0.invalidate();
            hwVar2.V0 = 0;
        }
    }
}
