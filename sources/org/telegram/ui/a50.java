package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class a50 extends org.telegram.ui.Components.tj0 {
    public final Context f44938c;
    public int d;
    public final ArrayList f44939e = new ArrayList();
    public final c50 f44940f;

    public a50(c50 c50Var, Context context) {
        this.f44940f = c50Var;
        this.f44938c = context;
    }

    @Override
    public final void A(v4.e1 e1Var) {
        if (e1Var.f58539f == 2) {
            ((org.telegram.ui.Cells.h4) e1Var.f58535a).f30385a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 3 && i7 != 4) {
            if (i7 != 6 || !this.f44940f.R) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f44939e.size();
    }

    @Override
    public final int d(int i7) {
        return ((z40) this.f44939e.get(i7)).f56015a;
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.f44939e;
        arrayList.clear();
        arrayList.add(new rg.a(0, true));
        c50 c50Var = this.f44940f;
        if (c50Var.Q == 5) {
            arrayList.add(new rg.a(6, true));
            arrayList.add(new z40(org.telegram.messenger.hd.M0(2131750588, null)));
        } else {
            arrayList.add(new rg.a(4, true));
            arrayList.add(new z40(org.telegram.messenger.hd.M0(2131749455, null)));
        }
        if (c50Var.U != null) {
            arrayList.add(new rg.a(1, true));
            arrayList.add(new rg.a(3, true));
            arrayList.add(new rg.a(0, true));
        }
        if (c50Var.L.size() > 0) {
            arrayList.add(new rg.a(1, true));
            this.d = arrayList.size();
            for (int i7 = 0; i7 < c50Var.L.size(); i7++) {
                arrayList.add(new rg.a(2, true));
            }
            arrayList.add(new rg.a(7, true));
        }
        super.f();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        String c02;
        boolean z10;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        ArrayList arrayList = this.f44939e;
        boolean z11 = false;
        c50 c50Var = this.f44940f;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (c50Var.U != null && i7 == 1) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753961, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.hd.G(c50Var.L.size(), "Members", new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                h4Var.d(c50Var.getMessagesController().a2((Long) c50Var.L.get(i7 - this.d)), null, null);
                if (i7 != arrayList.size() - 1) {
                    z11 = true;
                }
                h4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.v9) view).b(c50Var.U, false);
                return;
            case 4:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                int i11 = c50Var.X;
                if (i11 == 0) {
                    c02 = org.telegram.messenger.hd.M0(2131747439, null);
                } else {
                    c02 = org.telegram.messenger.hd.c0(i11);
                }
                String str = c02;
                String M0 = org.telegram.messenger.hd.M0(2131753850, null);
                z10 = ((org.telegram.ui.ActionBar.e2) c50Var).fragmentBeginToShow;
                l8Var.u(M0, str, z10, 2131232061, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.y8) view).setText(((z40) arrayList.get(i7)).f53806c);
                return;
            case 6:
                org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                l8Var2.n(2131232408, org.telegram.messenger.hd.M0(2131752281, null), true);
                l8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n4 n4Var;
        Context context = this.f44938c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    n4Var = new org.telegram.ui.Cells.v9(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    n4Var = view;
                                }
                            } else {
                                n4Var = new org.telegram.ui.Cells.l8(23, this.f44938c, this.f44940f.getResourceProvider(), false, true);
                            }
                        } else {
                            n4Var = new org.telegram.ui.Cells.y8(context);
                        }
                    } else {
                        n4Var = new org.telegram.ui.Cells.l8(context);
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
            n4Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
        }
        return new v4.e1(n4Var);
    }
}
