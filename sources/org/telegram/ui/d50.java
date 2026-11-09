package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class d50 extends org.telegram.ui.Components.pj0 {
    public final Context f44822c;
    public int d;
    public final ArrayList f44823e = new ArrayList();
    public final f50 f44824f;

    public d50(f50 f50Var, Context context) {
        this.f44824f = f50Var;
        this.f44822c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        if (d1Var.f57060f == 2) {
            ((org.telegram.ui.Cells.h4) d1Var.f57056a).f29266a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 3 && i7 != 4) {
            if (i7 != 6 || !this.f44824f.Q) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f44823e.size();
    }

    @Override
    public final int d(int i7) {
        return ((c50) this.f44823e.get(i7)).f54544a;
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.f44823e;
        arrayList.clear();
        arrayList.add(new rg.a(0, true));
        f50 f50Var = this.f44824f;
        if (f50Var.P == 5) {
            arrayList.add(new rg.a(6, true));
            arrayList.add(new c50(org.telegram.messenger.id.M0(2131750588, null)));
        } else {
            arrayList.add(new rg.a(4, true));
            arrayList.add(new c50(org.telegram.messenger.id.M0(2131749455, null)));
        }
        if (f50Var.T != null) {
            arrayList.add(new rg.a(1, true));
            arrayList.add(new rg.a(3, true));
            arrayList.add(new rg.a(0, true));
        }
        if (f50Var.K.size() > 0) {
            arrayList.add(new rg.a(1, true));
            this.d = arrayList.size();
            for (int i7 = 0; i7 < f50Var.K.size(); i7++) {
                arrayList.add(new rg.a(2, true));
            }
            arrayList.add(new rg.a(7, true));
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String c02;
        boolean z9;
        int i10 = d1Var.f57060f;
        View view = d1Var.f57056a;
        ArrayList arrayList = this.f44823e;
        boolean z10 = false;
        f50 f50Var = this.f44824f;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (f50Var.T != null && i7 == 1) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131753961, null));
                    return;
                } else {
                    n4Var.setText(org.telegram.messenger.id.G(f50Var.K.size(), "Members", new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                h4Var.d(f50Var.getMessagesController().a2((Long) f50Var.K.get(i7 - this.d)), null, null);
                if (i7 != arrayList.size() - 1) {
                    z10 = true;
                }
                h4Var.setDrawDivider(z10);
                return;
            case 3:
                ((org.telegram.ui.Cells.w9) view).b(f50Var.T, false);
                return;
            case 4:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                int i11 = f50Var.W;
                if (i11 == 0) {
                    c02 = org.telegram.messenger.id.M0(2131747439, null);
                } else {
                    c02 = org.telegram.messenger.id.c0(i11);
                }
                String str = c02;
                String M0 = org.telegram.messenger.id.M0(2131753850, null);
                z9 = ((org.telegram.ui.ActionBar.f2) f50Var).fragmentBeginToShow;
                m8Var.u(M0, str, z9, 2131232060, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.z8) view).setText(((c50) arrayList.get(i7)).f44224c);
                return;
            case 6:
                org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                m8Var2.n(2131232407, org.telegram.messenger.id.M0(2131752281, null), true);
                m8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n4 n4Var;
        Context context = this.f44822c;
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
                                n4Var = new org.telegram.ui.Cells.m8(23, this.f44822c, this.f44824f.getResourceProvider(), false, true);
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
            n4Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        }
        return new v4.d1(n4Var);
    }
}
