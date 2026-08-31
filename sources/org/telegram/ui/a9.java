package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class a9 implements org.telegram.ui.Components.fb {
    public final int f35064a;
    public final Object f35065b;

    public a9(Object obj, int i10) {
        this.f35064a = i10;
        this.f35065b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f35064a) {
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
    public final void b(org.telegram.ui.Components.ic icVar) {
        switch (this.f35064a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.nb nbVar = icVar.f27741e;
                xn xnVar = (xn) this.f35065b;
                qg.b c3 = xnVar.G.c(nbVar, null, true);
                rg.d dVar = new rg.d(xnVar.f43136ba);
                dVar.f46811e = new s0.b(21);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f46812f = dpf2;
                dVar.h = dpf22;
                c3.n(dVar);
                c3.p(AndroidUtilities.dp(16.0f));
                nbVar.setCustomBackground(c3);
                return;
            case 3:
                return;
            case 4:
                py pyVar = (py) this.f35065b;
                UndoView undoView = pyVar.f40287v0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    pyVar.f40287v0[0].e(2, true);
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
    public final void c(float f10) {
        switch (this.f35064a) {
            case 0:
                l9 l9Var = (l9) this.f35065b;
                l9Var.S = Math.max(0.0f, (f10 - l9Var.T) - l9Var.R);
                l9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f35065b;
                contactsActivity.m0 = Math.max(0.0f, (f10 - contactsActivity.f34069n0) - contactsActivity.f34067l0);
                contactsActivity.i0();
                return;
            case 4:
                py pyVar = (py) this.f35065b;
                UndoView undoView = pyVar.f40287v0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    pyVar.f40268r1 = Math.max(0.0f, (f10 - pyVar.f40199d4) - pyVar.f40216g4);
                    pyVar.X4();
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
    public final void d(org.telegram.ui.Components.ic icVar) {
        int i10 = this.f35064a;
    }

    @Override
    public final boolean e() {
        switch (this.f35064a) {
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
                if (((ProfileActivity) this.f35065b).f34671p5 == null) {
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
        ju0 ju0Var;
        switch (this.f35064a) {
            case 0:
                l9 l9Var = (l9) this.f35065b;
                i11 = l9Var.T;
                i12 = l9Var.R;
                break;
            case 1:
                return ((bd) this.f35065b).L.getMeasuredHeight();
            case 2:
                xn xnVar = (xn) this.f35065b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(xnVar.P.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + xnVar.W8(org.telegram.ui.Components.t21.f31255c) + xnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f35065b;
                i11 = contactsActivity.f34069n0;
                i12 = contactsActivity.f34067l0;
                break;
            case 4:
                py pyVar = (py) this.f35065b;
                if (pyVar.U2 != 0) {
                    return AndroidUtilities.dp(60.0f) + pyVar.f40199d4;
                }
                return pyVar.n3();
            case 5:
                i12 = ((wg0) this.f35065b).I;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((du0) this.f35065b).B0;
                int i13 = 0;
                if (photoViewer.O4) {
                    hs0 hs0Var = photoViewer.R1;
                    if (hs0Var != null) {
                        i13 = hs0Var.I.f45418l;
                        if (hs0Var.getVisibility() == 0 && ((ju0Var = photoViewer.d) == null || !ju0Var.A())) {
                            i13 = org.telegram.messenger.y3.C(12.0f, photoViewer.R1.getEditTextHeight(), i13);
                        }
                    }
                    eg.q1 q1Var = photoViewer.M0;
                    if (q1Var != null && q1Var.getVisibility() == 0) {
                        hs0 hs0Var2 = photoViewer.R1;
                        if (hs0Var2 == null || !hs0Var2.I.c()) {
                            return i13 + photoViewer.M0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                eh.d dVar = photoViewer.f34267f0;
                if (dVar != null && dVar.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f34267f0.getAlpha() * photoViewer.f34267f0.getHeight()) + 0);
                }
                org.telegram.ui.Components.z30 z30Var = photoViewer.f34295i1;
                if (z30Var != null && z30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f34230b0.getMeasuredHeight() > photoViewer.f34230b0.getMeasuredWidth()) {
                        return (int) ((photoViewer.f34295i1.getAlpha() * photoViewer.f34295i1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f35065b).f34496l0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f35065b;
                if (profileActivity.f34671p5 == null) {
                    return profileActivity.f34624i6 + profileActivity.f34617h6;
                }
                return profileActivity.f34624i6 + profileActivity.f34617h6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f34671p5.getTranslationY()) - (profileActivity.f34678q5[1].getTranslationY() * profileActivity.L.g0(9, false))) - (profileActivity.f34678q5[0].getTranslationY() * profileActivity.L.g0(8, true))));
            default:
                mf1 mf1Var = (mf1) this.f35065b;
                c51 c51Var = mf1Var.f39128l0;
                if (c51Var != null && c51Var.getVisibility() == 0) {
                    return mf1Var.f39128l0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f35064a) {
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
        switch (this.f35064a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                xn xnVar = (xn) this.f35065b;
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, xnVar.f43323q9);
                break;
            case 3:
                return 0;
            case 4:
                py pyVar = (py) this.f35065b;
                kVar4 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                ow owVar = pyVar.f40292w0;
                if (owVar != null && owVar.getVisibility() == 0) {
                    i13 = pyVar.f40292w0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ls lsVar = pyVar.G1;
                if (lsVar != null) {
                    i14 = lsVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                hx hxVar = pyVar.B0;
                if (hxVar != null && pyVar.D0) {
                    i15 = (int) ((1.0f - hxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((du0) this.f35065b).B0;
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (photoViewer.S1.getAlpha() * photoViewer.S1.getEditTextHeight()));
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

    private final void A(org.telegram.ui.Components.ic icVar) {
    }

    private final void B(org.telegram.ui.Components.ic icVar) {
    }

    private final void C(org.telegram.ui.Components.ic icVar) {
    }

    private final void D(org.telegram.ui.Components.ic icVar) {
    }

    private final void E(org.telegram.ui.Components.ic icVar) {
    }

    private final void F(org.telegram.ui.Components.ic icVar) {
    }

    private final void G(org.telegram.ui.Components.ic icVar) {
    }

    private final void i(float f10) {
    }

    private final void j(float f10) {
    }

    private final void k(float f10) {
    }

    private final void l(float f10) {
    }

    private final void m(float f10) {
    }

    private final void n(float f10) {
    }

    private final void o(float f10) {
    }

    private final void p(org.telegram.ui.Components.ic icVar) {
    }

    private final void q(org.telegram.ui.Components.ic icVar) {
    }

    private final void r(org.telegram.ui.Components.ic icVar) {
    }

    private final void s(org.telegram.ui.Components.ic icVar) {
    }

    private final void t(org.telegram.ui.Components.ic icVar) {
    }

    private final void u(org.telegram.ui.Components.ic icVar) {
    }

    private final void v(org.telegram.ui.Components.ic icVar) {
    }

    private final void w(org.telegram.ui.Components.ic icVar) {
    }

    private final void x(org.telegram.ui.Components.ic icVar) {
    }

    private final void y(org.telegram.ui.Components.ic icVar) {
    }

    private final void z(org.telegram.ui.Components.ic icVar) {
    }
}
