package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class b9 implements org.telegram.ui.Components.mb {
    public final int f32072a;
    public final Object f32073b;

    public b9(Object obj, int i10) {
        this.f32072a = i10;
        this.f32073b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f32072a) {
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
    public final void b(org.telegram.ui.Components.oc ocVar) {
        switch (this.f32072a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.sb sbVar = ocVar.e;
                bo boVar = (bo) this.f32073b;
                ch.d c10 = boVar.J.c(sbVar, null, true);
                dh.e eVar = new dh.e(boVar.f32275ea);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f7742f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                sbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                wy wyVar = (wy) this.f32073b;
                UndoView undoView = wyVar.f39317y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    wyVar.f39317y0[0].e(2, true);
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
        switch (this.f32072a) {
            case 0:
                m9 m9Var = (m9) this.f32073b;
                m9Var.V = Math.max(0.0f, (f7 - m9Var.W) - m9Var.U);
                m9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f32073b;
                contactsActivity.f30767p0 = Math.max(0.0f, (f7 - contactsActivity.f30768q0) - contactsActivity.f30766o0);
                contactsActivity.i0();
                return;
            case 4:
                wy wyVar = (wy) this.f32073b;
                UndoView undoView = wyVar.f39317y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    wyVar.f39296u1 = Math.max(0.0f, (f7 - wyVar.f39230g4) - wyVar.f39244j4);
                    wyVar.X4();
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
    public final void d(org.telegram.ui.Components.oc ocVar) {
        int i10 = this.f32072a;
    }

    @Override
    public final boolean e() {
        switch (this.f32072a) {
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
                if (((ProfileActivity) this.f32073b).f31382s5 == null) {
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
        dv0 dv0Var;
        switch (this.f32072a) {
            case 0:
                m9 m9Var = (m9) this.f32073b;
                i11 = m9Var.W;
                i12 = m9Var.U;
                break;
            case 1:
                return ((cd) this.f32073b).O.getMeasuredHeight();
            case 2:
                bo boVar = (bo) this.f32073b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(boVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + boVar.W8(org.telegram.ui.Components.u21.f28262c) + boVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f32073b;
                i11 = contactsActivity.f30768q0;
                i12 = contactsActivity.f30766o0;
                break;
            case 4:
                wy wyVar = (wy) this.f32073b;
                if (wyVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + wyVar.f39230g4;
                }
                return wyVar.n3();
            case 5:
                i12 = ((gh0) this.f32073b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((xu0) this.f32073b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    dt0 dt0Var = photoViewer.U1;
                    if (dt0Var != null) {
                        i13 = dt0Var.L.f4848l;
                        if (dt0Var.getVisibility() == 0 && ((dv0Var = photoViewer.d) == null || !dv0Var.A())) {
                            i13 = org.telegram.messenger.w1.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    t5 t5Var = photoViewer.P0;
                    if (t5Var != null && t5Var.getVisibility() == 0) {
                        dt0 dt0Var2 = photoViewer.U1;
                        if (dt0Var2 == null || !dt0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ai.x5 x5Var = photoViewer.f30985i0;
                if (x5Var != null && x5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f30985i0.getAlpha() * photoViewer.f30985i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.v30 v30Var = photoViewer.l1;
                if (v30Var != null && v30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f30950e0.getMeasuredHeight() > photoViewer.f30950e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f32073b).f31186o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f32073b;
                if (profileActivity.f31382s5 == null) {
                    return profileActivity.f31334l6 + profileActivity.f31329k6;
                }
                return profileActivity.f31334l6 + profileActivity.f31329k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f31382s5.getTranslationY()) - (profileActivity.f31389t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f31389t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                fg1 fg1Var = (fg1) this.f32073b;
                t41 t41Var = fg1Var.f33666o0;
                if (t41Var != null && t41Var.getVisibility() == 0) {
                    return fg1Var.f33666o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f32072a) {
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
        switch (this.f32072a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                bo boVar = (bo) this.f32073b;
                kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, boVar.f32460t9);
                break;
            case 3:
                return 0;
            case 4:
                wy wyVar = (wy) this.f32073b;
                kVar4 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                uw uwVar = wyVar.f39320z0;
                if (uwVar != null && uwVar.getVisibility() == 0) {
                    i13 = wyVar.f39320z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ks ksVar = wyVar.J1;
                if (ksVar != null) {
                    i14 = ksVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                nx nxVar = wyVar.E0;
                if (nxVar != null && wyVar.G0) {
                    i15 = (int) ((1.0f - nxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((xu0) this.f32073b).E0;
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

    private final void A(org.telegram.ui.Components.oc ocVar) {
    }

    private final void B(org.telegram.ui.Components.oc ocVar) {
    }

    private final void C(org.telegram.ui.Components.oc ocVar) {
    }

    private final void D(org.telegram.ui.Components.oc ocVar) {
    }

    private final void E(org.telegram.ui.Components.oc ocVar) {
    }

    private final void F(org.telegram.ui.Components.oc ocVar) {
    }

    private final void G(org.telegram.ui.Components.oc ocVar) {
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

    private final void p(org.telegram.ui.Components.oc ocVar) {
    }

    private final void q(org.telegram.ui.Components.oc ocVar) {
    }

    private final void r(org.telegram.ui.Components.oc ocVar) {
    }

    private final void s(org.telegram.ui.Components.oc ocVar) {
    }

    private final void t(org.telegram.ui.Components.oc ocVar) {
    }

    private final void u(org.telegram.ui.Components.oc ocVar) {
    }

    private final void v(org.telegram.ui.Components.oc ocVar) {
    }

    private final void w(org.telegram.ui.Components.oc ocVar) {
    }

    private final void x(org.telegram.ui.Components.oc ocVar) {
    }

    private final void y(org.telegram.ui.Components.oc ocVar) {
    }

    private final void z(org.telegram.ui.Components.oc ocVar) {
    }
}
