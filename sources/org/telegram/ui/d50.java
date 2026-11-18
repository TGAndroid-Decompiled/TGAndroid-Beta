package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d50 extends org.telegram.ui.Components.bk0 {
    public final Context f46836c;
    public int d;
    public final ArrayList f46837e = new ArrayList();
    public final f50 f46838f;

    public d50(f50 f50Var, Context context) {
        this.f46838f = f50Var;
        this.f46836c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        if (f1Var.f59126f == 2) {
            ((org.telegram.ui.Cells.h4) f1Var.f59122a).f30762a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 3 && i7 != 4) {
            if (i7 != 6 || !this.f46838f.R) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f46837e.size();
    }

    @Override
    public final int d(int i7) {
        return ((c50) this.f46837e.get(i7)).f56589a;
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.f46837e;
        arrayList.clear();
        arrayList.add(new rg.a(0, true));
        f50 f50Var = this.f46838f;
        if (f50Var.Q == 5) {
            arrayList.add(new rg.a(6, true));
            arrayList.add(new c50(org.telegram.messenger.gd.M0(2131750572, null)));
        } else {
            arrayList.add(new rg.a(4, true));
            arrayList.add(new c50(org.telegram.messenger.gd.M0(2131749263, null)));
        }
        if (f50Var.U != null) {
            arrayList.add(new rg.a(1, true));
            arrayList.add(new rg.a(3, true));
            arrayList.add(new rg.a(0, true));
        }
        if (f50Var.L.size() > 0) {
            arrayList.add(new rg.a(1, true));
            this.d = arrayList.size();
            for (int i7 = 0; i7 < f50Var.L.size(); i7++) {
                arrayList.add(new rg.a(2, true));
            }
            arrayList.add(new rg.a(7, true));
        }
        super.f();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String c02;
        boolean z10;
        int i10 = f1Var.f59126f;
        View view = f1Var.f59122a;
        ArrayList arrayList = this.f46837e;
        boolean z11 = false;
        f50 f50Var = this.f46838f;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (f50Var.U != null && i7 == 1) {
                    n4Var.setText(org.telegram.messenger.gd.M0(2131753959, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.gd.G(f50Var.L.size(), "Members", new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                h4Var.d(f50Var.getMessagesController().c2((Long) f50Var.L.get(i7 - this.d)), null, null);
                if (i7 != arrayList.size() - 1) {
                    z11 = true;
                }
                h4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.w9) view).b(f50Var.U, false);
                return;
            case 4:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                int i11 = f50Var.X;
                if (i11 == 0) {
                    c02 = org.telegram.messenger.gd.M0(2131747246, null);
                } else {
                    c02 = org.telegram.messenger.gd.c0(i11);
                }
                String str = c02;
                String M0 = org.telegram.messenger.gd.M0(2131753848, null);
                z10 = ((org.telegram.ui.ActionBar.h2) f50Var).fragmentBeginToShow;
                m8Var.u(M0, str, z10, 2131232062, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.z8) view).setText(((c50) arrayList.get(i7)).f46404c);
                return;
            case 6:
                org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                m8Var2.n(2131232409, org.telegram.messenger.gd.M0(2131752270, null), true);
                m8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n4 n4Var;
        Context context = this.f46836c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    n4Var = new org.telegram.ui.Cells.w9(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    n4Var = view;
                                }
                            } else {
                                n4Var = new org.telegram.ui.Cells.m8(23, this.f46836c, this.f46838f.getResourceProvider(), false, true);
                            }
                        } else {
                            n4Var = new org.telegram.ui.Cells.z8(context);
                        }
                    } else {
                        n4Var = new org.telegram.ui.Cells.m8(context);
                    }
                } else {
                    n4Var = new org.telegram.ui.Cells.h4(context, 0, 3, false);
                }
            } else {
                org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
                n4Var2.setHeight(46);
                n4Var = n4Var2;
            }
        } else {
            n4Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
        }
        return new v4.f1(n4Var);
    }
}
