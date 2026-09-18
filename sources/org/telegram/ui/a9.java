package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class a9 implements org.telegram.ui.Components.ob {
    public final int f31976a;
    public final Object f31977b;

    public a9(Object obj, int i10) {
        this.f31976a = i10;
        this.f31977b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f31976a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(org.telegram.ui.Components.qc qcVar) {
        switch (this.f31976a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                zn znVar = (zn) this.f31977b;
                ch.d c10 = znVar.J.c(ubVar, null, true);
                dh.e eVar = new dh.e(znVar.f40261ea);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f7741f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                uy uyVar = (uy) this.f31977b;
                UndoView undoView = uyVar.f38250y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    uyVar.f38250y0[0].e(2, true);
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return;
        }
    }

    @Override
    public final void c(float f7) {
        switch (this.f31976a) {
            case 0:
                l9 l9Var = (l9) this.f31977b;
                l9Var.V = Math.max(0.0f, (f7 - l9Var.W) - l9Var.U);
                l9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f31977b;
                contactsActivity.f30997p0 = Math.max(0.0f, (f7 - contactsActivity.f30998q0) - contactsActivity.f30996o0);
                contactsActivity.i0();
                return;
            case 4:
                uy uyVar = (uy) this.f31977b;
                UndoView undoView = uyVar.f38250y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    uyVar.f38230u1 = Math.max(0.0f, (f7 - uyVar.f38159f4) - uyVar.f38174i4);
                    uyVar.X4();
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return;
        }
    }

    @Override
    public final void d(org.telegram.ui.Components.qc qcVar) {
        int i10 = this.f31976a;
    }

    @Override
    public final boolean e() {
        switch (this.f31976a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                if (((ProfileActivity) this.f31977b).f31613s5 == null) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i10) {
        int i11;
        int i12;
        bv0 bv0Var;
        switch (this.f31976a) {
            case 0:
                l9 l9Var = (l9) this.f31977b;
                i11 = l9Var.W;
                i12 = l9Var.U;
                break;
            case 1:
                return ((bd) this.f31977b).O.getMeasuredHeight();
            case 2:
                zn znVar = (zn) this.f31977b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(znVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + znVar.W8(org.telegram.ui.Components.i31.f24833c) + znVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f31977b;
                i11 = contactsActivity.f30998q0;
                i12 = contactsActivity.f30996o0;
                break;
            case 4:
                uy uyVar = (uy) this.f31977b;
                if (uyVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + uyVar.f38159f4;
                }
                return uyVar.n3();
            case 5:
                i12 = ((fh0) this.f31977b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((vu0) this.f31977b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    bt0 bt0Var = photoViewer.U1;
                    if (bt0Var != null) {
                        i13 = bt0Var.L.f4848l;
                        if (bt0Var.getVisibility() == 0 && ((bv0Var = photoViewer.d) == null || !bv0Var.A())) {
                            i13 = org.telegram.messenger.q.D(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    t5 t5Var = photoViewer.P0;
                    if (t5Var != null && t5Var.getVisibility() == 0) {
                        bt0 bt0Var2 = photoViewer.U1;
                        if (bt0Var2 == null || !bt0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ai.x5 x5Var = photoViewer.f31216i0;
                if (x5Var != null && x5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f31216i0.getAlpha() * photoViewer.f31216i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.v30 v30Var = photoViewer.l1;
                if (v30Var != null && v30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f31181e0.getMeasuredHeight() > photoViewer.f31181e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f31977b).f31417o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f31977b;
                if (profileActivity.f31613s5 == null) {
                    return profileActivity.f31565l6 + profileActivity.f31560k6;
                }
                return profileActivity.f31565l6 + profileActivity.f31560k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f31613s5.getTranslationY()) - (profileActivity.f31620t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f31620t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                dg1 dg1Var = (dg1) this.f31977b;
                r41 r41Var = dg1Var.f33000o0;
                if (r41Var != null && r41Var.getVisibility() == 0) {
                    return dg1Var.f33000o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f31976a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            case 7:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        int i11;
        int max;
        int max2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.k kVar5;
        switch (this.f31976a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                zn znVar = (zn) this.f31977b;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, znVar.f40446t9);
                break;
            case 3:
                return 0;
            case 4:
                uy uyVar = (uy) this.f31977b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                sw swVar = uyVar.f38253z0;
                if (swVar != null && swVar.getVisibility() == 0) {
                    i13 = uyVar.f38253z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ks ksVar = uyVar.J1;
                if (ksVar != null) {
                    i14 = ksVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                lx lxVar = uyVar.E0;
                if (lxVar != null && uyVar.G0) {
                    i15 = (int) ((1.0f - lxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((vu0) this.f31977b).E0;
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (photoViewer.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = AndroidUtilities.statusBarHeight;
                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(org.telegram.ui.Components.qc qcVar) {
    }

    private final void B(org.telegram.ui.Components.qc qcVar) {
    }

    private final void C(org.telegram.ui.Components.qc qcVar) {
    }

    private final void D(org.telegram.ui.Components.qc qcVar) {
    }

    private final void E(org.telegram.ui.Components.qc qcVar) {
    }

    private final void F(org.telegram.ui.Components.qc qcVar) {
    }

    private final void G(org.telegram.ui.Components.qc qcVar) {
    }

    private final void i(float f7) {
    }

    private final void j(float f7) {
    }

    private final void k(float f7) {
    }

    private final void l(float f7) {
    }

    private final void m(float f7) {
    }

    private final void n(float f7) {
    }

    private final void o(float f7) {
    }

    private final void p(org.telegram.ui.Components.qc qcVar) {
    }

    private final void q(org.telegram.ui.Components.qc qcVar) {
    }

    private final void r(org.telegram.ui.Components.qc qcVar) {
    }

    private final void s(org.telegram.ui.Components.qc qcVar) {
    }

    private final void t(org.telegram.ui.Components.qc qcVar) {
    }

    private final void u(org.telegram.ui.Components.qc qcVar) {
    }

    private final void v(org.telegram.ui.Components.qc qcVar) {
    }

    private final void w(org.telegram.ui.Components.qc qcVar) {
    }

    private final void x(org.telegram.ui.Components.qc qcVar) {
    }

    private final void y(org.telegram.ui.Components.qc qcVar) {
    }

    private final void z(org.telegram.ui.Components.qc qcVar) {
    }
}
