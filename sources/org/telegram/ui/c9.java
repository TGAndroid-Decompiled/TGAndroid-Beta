package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class c9 implements org.telegram.ui.Components.qb {
    public final int f34481a;
    public final Object f34482b;

    public c9(Object obj, int i10) {
        this.f34481a = i10;
        this.f34482b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f34481a) {
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
    public final void b(org.telegram.ui.Components.sc scVar) {
        switch (this.f34481a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.wb wbVar = scVar.e;
                fo foVar = (fo) this.f34482b;
                dh.d c10 = foVar.J.c(wbVar, null, true);
                eh.e eVar = new eh.e(foVar.f35633ea);
                eVar.e = new bi.w2(18);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8782f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                wbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                yy yyVar = (yy) this.f34482b;
                UndoView undoView = yyVar.f42107y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    yyVar.f42107y0[0].e(2, true);
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
        switch (this.f34481a) {
            case 0:
                n9 n9Var = (n9) this.f34482b;
                n9Var.V = Math.max(0.0f, (f7 - n9Var.W) - n9Var.U);
                n9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f34482b;
                contactsActivity.f31744p0 = Math.max(0.0f, (f7 - contactsActivity.f31745q0) - contactsActivity.f31743o0);
                contactsActivity.i0();
                return;
            case 4:
                yy yyVar = (yy) this.f34482b;
                UndoView undoView = yyVar.f42107y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    yyVar.f42086u1 = Math.max(0.0f, (f7 - yyVar.f42019g4) - yyVar.f42034j4);
                    yyVar.V4();
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
    public final void d(org.telegram.ui.Components.sc scVar) {
        int i10 = this.f34481a;
    }

    @Override
    public final boolean e() {
        switch (this.f34481a) {
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
                if (((ProfileActivity) this.f34482b).f32362s5 == null) {
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
        hv0 hv0Var;
        switch (this.f34481a) {
            case 0:
                n9 n9Var = (n9) this.f34482b;
                i11 = n9Var.W;
                i12 = n9Var.U;
                break;
            case 1:
                return ((gd) this.f34482b).O.getMeasuredHeight();
            case 2:
                fo foVar = (fo) this.f34482b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(foVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + foVar.b9(org.telegram.ui.Components.u31.f29249c) + foVar.v.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f34482b;
                i11 = contactsActivity.f31745q0;
                i12 = contactsActivity.f31743o0;
                break;
            case 4:
                yy yyVar = (yy) this.f34482b;
                if (yyVar.Y2 != 0) {
                    return AndroidUtilities.dp(60.0f) + yyVar.f42019g4;
                }
                return yyVar.k3();
            case 5:
                i12 = ((jh0) this.f34482b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((bv0) this.f34482b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    ht0 ht0Var = photoViewer.U1;
                    if (ht0Var != null) {
                        i13 = ht0Var.L.f7003l;
                        if (ht0Var.getVisibility() == 0 && ((hv0Var = photoViewer.d) == null || !hv0Var.A())) {
                            i13 = org.telegram.messenger.g0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    x5 x5Var = photoViewer.P0;
                    if (x5Var != null && x5Var.getVisibility() == 0) {
                        ht0 ht0Var2 = photoViewer.U1;
                        if (ht0Var2 == null || !ht0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                bi.i5 i5Var = photoViewer.f31963i0;
                if (i5Var != null && i5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f31963i0.getAlpha() * photoViewer.f31963i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.i40 i40Var = photoViewer.l1;
                if (i40Var != null && i40Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f31928e0.getMeasuredHeight() > photoViewer.f31928e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f34482b).f32165o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f34482b;
                if (profileActivity.f32362s5 == null) {
                    return profileActivity.f32314l6 + profileActivity.f32309k6;
                }
                return profileActivity.f32314l6 + profileActivity.f32309k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f32362s5.getTranslationY()) - (profileActivity.f32369t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f32369t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                kg1 kg1Var = (kg1) this.f34482b;
                d61 d61Var = kg1Var.f37410o0;
                if (d61Var != null && d61Var.getVisibility() == 0) {
                    return kg1Var.f37410o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f34481a) {
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
        PhotoViewer photoViewer;
        switch (this.f34481a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                fo foVar = (fo) this.f34482b;
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, foVar.f35818t9);
                break;
            case 3:
                return 0;
            case 4:
                yy yyVar = (yy) this.f34482b;
                kVar4 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                ww wwVar = yyVar.f42110z0;
                if (wwVar != null && wwVar.getVisibility() == 0) {
                    i13 = yyVar.f42110z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.xs xsVar = yyVar.J1;
                if (xsVar != null) {
                    i14 = xsVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                px pxVar = yyVar.E0;
                if (pxVar != null && yyVar.G0) {
                    i15 = (int) ((1.0f - pxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((bv0) this.f34482b).E0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
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

    private final void A(org.telegram.ui.Components.sc scVar) {
    }

    private final void B(org.telegram.ui.Components.sc scVar) {
    }

    private final void C(org.telegram.ui.Components.sc scVar) {
    }

    private final void D(org.telegram.ui.Components.sc scVar) {
    }

    private final void E(org.telegram.ui.Components.sc scVar) {
    }

    private final void F(org.telegram.ui.Components.sc scVar) {
    }

    private final void G(org.telegram.ui.Components.sc scVar) {
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

    private final void p(org.telegram.ui.Components.sc scVar) {
    }

    private final void q(org.telegram.ui.Components.sc scVar) {
    }

    private final void r(org.telegram.ui.Components.sc scVar) {
    }

    private final void s(org.telegram.ui.Components.sc scVar) {
    }

    private final void t(org.telegram.ui.Components.sc scVar) {
    }

    private final void u(org.telegram.ui.Components.sc scVar) {
    }

    private final void v(org.telegram.ui.Components.sc scVar) {
    }

    private final void w(org.telegram.ui.Components.sc scVar) {
    }

    private final void x(org.telegram.ui.Components.sc scVar) {
    }

    private final void y(org.telegram.ui.Components.sc scVar) {
    }

    private final void z(org.telegram.ui.Components.sc scVar) {
    }
}
