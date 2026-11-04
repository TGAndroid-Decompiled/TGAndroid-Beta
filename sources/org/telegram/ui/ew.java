package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ew {
    public final uw f45056a;

    public ew(uw uwVar) {
        this.f45056a = uwVar;
    }

    public final long a() {
        uw uwVar = this.f45056a;
        pv pvVar = uwVar.G3;
        if (pvVar != null && (pvVar.getFragment() instanceof m91)) {
            return -((m91) uwVar.G3.getFragment()).f47575a;
        }
        return 0L;
    }

    public final void b() {
        ArrayList arrayList;
        int i3;
        uw uwVar = this.f45056a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uwVar.getParentActivity());
        org.telegram.ui.Components.bm0 bm0Var = uwVar.D0.f34751e0;
        boolean z10 = bm0Var.O;
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        if (z10 && bm0Var.O()) {
            s1Var.S = org.telegram.messenger.bd.M0(2131752059, null);
            org.telegram.ui.Components.bm0 bm0Var2 = uwVar.D0.f34751e0;
            if (bm0Var2.O) {
                arrayList = bm0Var2.f16984w0;
            } else {
                arrayList = bm0Var2.f16982v0;
            }
            if (arrayList != null) {
                i3 = arrayList.size();
            } else {
                i3 = 0;
            }
            s1Var.U = org.telegram.messenger.bd.G(i3, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752101, null), new org.telegram.ui.ActionBar.p1(this) {
                public final ew f44819b;

                {
                    this.f44819b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f44819b.f45056a.D0.f34751e0.E();
                            return;
                        default:
                            uw uwVar2 = this.f44819b.f45056a;
                            if (uwVar2.D0.f34751e0.O()) {
                                uwVar2.D0.f34751e0.E();
                                return;
                            }
                            org.telegram.ui.Components.bm0 bm0Var3 = uwVar2.D0.f34751e0;
                            bm0Var3.f16969k0.c();
                            bm0Var3.K.clear();
                            bm0Var3.f();
                            return;
                    }
                }
            });
        } else {
            s1Var.S = org.telegram.messenger.bd.M0(2131752056, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131752061, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new org.telegram.ui.ActionBar.p1(this) {
                public final ew f44819b;

                {
                    this.f44819b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f44819b.f45056a.D0.f34751e0.E();
                            return;
                        default:
                            uw uwVar2 = this.f44819b.f45056a;
                            if (uwVar2.D0.f34751e0.O()) {
                                uwVar2.D0.f34751e0.E();
                                return;
                            }
                            org.telegram.ui.Components.bm0 bm0Var3 = uwVar2.D0.f34751e0;
                            bm0Var3.f16969k0.c();
                            bm0Var3.K.clear();
                            bm0Var3.f();
                            return;
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        uwVar.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, uwVar.getResourceProvider());
        }
    }

    public final void c() {
        int i3;
        cw cwVar = this.f45056a.D0;
        if (cwVar != null) {
            org.telegram.ui.Components.wi0 wi0Var = cwVar.f34753g0;
            int i10 = cwVar.V0;
            if (i10 > 0) {
                i3 = i10 + 1;
            } else {
                i3 = 0;
            }
            wi0Var.b(i3);
            cwVar.V0 = cwVar.f34751e0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        uw uwVar = this.f45056a;
        if (uwVar.D0.f34749c0.getVisibility() == 0) {
            z11 = true;
        }
        if (uwVar.f50255k2 && uwVar.f50260l2) {
            cw cwVar = uwVar.D0;
            if (cwVar.f34749c0 != null) {
                if (!z10 && cwVar.f34751e0.b() == 0) {
                    uwVar.D0.f34749c0.e(false, z11);
                } else {
                    uwVar.D0.f34749c0.e(true, z11);
                }
            }
        }
        if (z10 && uwVar.D0.f34751e0.b() == 0) {
            cw cwVar2 = uwVar.D0;
            cwVar2.f34753g0.a();
            cwVar2.f34748b0.invalidate();
            cwVar2.V0 = 0;
        }
    }
}
