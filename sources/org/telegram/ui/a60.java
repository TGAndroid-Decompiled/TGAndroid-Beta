package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class a60 extends org.telegram.ui.Components.sk0 {
    public final Context f35571c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final c60 f35572f;

    public a60(c60 c60Var, Context context) {
        this.f35572f = c60Var;
        this.f35571c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        if (c1Var.f47901f == 2) {
            ((org.telegram.ui.Cells.j4) c1Var.f47898a).f22074a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 3 && i10 != 4) {
            if (i10 != 6 || !this.f35572f.Q) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.e.size();
    }

    @Override
    public final int d(int i10) {
        return ((z50) this.e.get(i10)).f7680a;
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new hg.b(0, true));
        c60 c60Var = this.f35572f;
        if (c60Var.P == 5) {
            arrayList.add(new hg.b(6, true));
            arrayList.add(new z50(org.telegram.messenger.cd.L0(2131750589, null)));
        } else {
            arrayList.add(new hg.b(4, true));
            arrayList.add(new z50(org.telegram.messenger.cd.L0(2131749464, null)));
        }
        if (c60Var.T != null) {
            arrayList.add(new hg.b(1, true));
            arrayList.add(new hg.b(3, true));
            arrayList.add(new hg.b(0, true));
        }
        if (c60Var.K.size() > 0) {
            arrayList.add(new hg.b(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < c60Var.K.size(); i10++) {
                arrayList.add(new hg.b(2, true));
            }
            arrayList.add(new hg.b(7, true));
        }
        super.f();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        String c02;
        boolean z10;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        ArrayList arrayList = this.e;
        boolean z11 = false;
        c60 c60Var = this.f35572f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (c60Var.T != null && i10 == 1) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131753961, null));
                    return;
                } else {
                    p4Var.setText(org.telegram.messenger.cd.G(c60Var.K.size(), "Members", new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                j4Var.d(c60Var.getMessagesController().Z1((Long) c60Var.K.get(i10 - this.d)), null, null);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                }
                j4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.x9) view).b(c60Var.T, false);
                return;
            case 4:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                int i12 = c60Var.W;
                if (i12 == 0) {
                    c02 = org.telegram.messenger.cd.L0(2131747455, null);
                } else {
                    c02 = org.telegram.messenger.cd.c0(i12);
                }
                String str = c02;
                String L0 = org.telegram.messenger.cd.L0(2131753850, null);
                z10 = ((org.telegram.ui.ActionBar.k2) c60Var).fragmentBeginToShow;
                p8Var.u(L0, str, z10, 2131232059, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.b9) view).setText(((z50) arrayList.get(i10)).f44020c);
                return;
            case 6:
                org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                p8Var2.n(2131232406, org.telegram.messenger.cd.L0(2131752281, null), true);
                p8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.p4 p4Var;
        Context context = this.f35571c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    p4Var = new org.telegram.ui.Cells.x9(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    p4Var = view;
                                }
                            } else {
                                p4Var = new org.telegram.ui.Cells.p8(23, this.f35571c, this.f35572f.getResourceProvider(), false, true);
                            }
                        } else {
                            p4Var = new org.telegram.ui.Cells.b9(context);
                        }
                    } else {
                        p4Var = new org.telegram.ui.Cells.p8(context);
                    }
                } else {
                    p4Var = new org.telegram.ui.Cells.j4(context, 0, 3, false);
                }
            } else {
                org.telegram.ui.Cells.p4 p4Var2 = new org.telegram.ui.Cells.p4(context);
                p4Var2.setHeight(46);
                p4Var = p4Var2;
            }
        } else {
            p4Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        }
        return new s4.c1(p4Var);
    }
}
