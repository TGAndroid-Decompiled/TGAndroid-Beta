package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class c9 implements org.telegram.ui.Components.fb {
    public final int f33045a;
    public final Object f33046b;

    public c9(Object obj, int i10) {
        this.f33045a = i10;
        this.f33046b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f33045a) {
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
        switch (this.f33045a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.nb nbVar = icVar.e;
                zn znVar = (zn) this.f33046b;
                pg.b c3 = znVar.G.c(nbVar, null, true);
                qg.d dVar = new qg.d(znVar.f40534ba);
                dVar.e = new cl0(29);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f43087f = dpf2;
                dVar.h = dpf22;
                c3.n(dVar);
                c3.p(AndroidUtilities.dp(16.0f));
                nbVar.setCustomBackground(c3);
                return;
            case 3:
                return;
            case 4:
                qy qyVar = (qy) this.f33046b;
                UndoView undoView = qyVar.f37628v0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    qyVar.f37628v0[0].e(2, true);
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
        switch (this.f33045a) {
            case 0:
                n9 n9Var = (n9) this.f33046b;
                n9Var.S = Math.max(0.0f, (f10 - n9Var.T) - n9Var.R);
                n9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f33046b;
                contactsActivity.m0 = Math.max(0.0f, (f10 - contactsActivity.f31526n0) - contactsActivity.f31524l0);
                contactsActivity.i0();
                return;
            case 4:
                qy qyVar = (qy) this.f33046b;
                UndoView undoView = qyVar.f37628v0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    qyVar.f37609r1 = Math.max(0.0f, (f10 - qyVar.f37541d4) - qyVar.f37557g4);
                    qyVar.X4();
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
        int i10 = this.f33045a;
    }

    @Override
    public final boolean e() {
        switch (this.f33045a) {
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
                if (((ProfileActivity) this.f33046b).f32112p5 == null) {
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
        ou0 ou0Var;
        switch (this.f33045a) {
            case 0:
                n9 n9Var = (n9) this.f33046b;
                i11 = n9Var.T;
                i12 = n9Var.R;
                break;
            case 1:
                return ((dd) this.f33046b).L.getMeasuredHeight();
            case 2:
                zn znVar = (zn) this.f33046b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(znVar.P.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + znVar.W8(org.telegram.ui.Components.s21.f28657c) + znVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f33046b;
                i11 = contactsActivity.f31526n0;
                i12 = contactsActivity.f31524l0;
                break;
            case 4:
                qy qyVar = (qy) this.f33046b;
                if (qyVar.U2 != 0) {
                    return AndroidUtilities.dp(60.0f) + qyVar.f37541d4;
                }
                return qyVar.n3();
            case 5:
                i12 = ((xg0) this.f33046b).I;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((iu0) this.f33046b).B0;
                int i13 = 0;
                if (photoViewer.O4) {
                    ms0 ms0Var = photoViewer.R1;
                    if (ms0Var != null) {
                        i13 = ms0Var.I.f41779l;
                        if (ms0Var.getVisibility() == 0 && ((ou0Var = photoViewer.d) == null || !ou0Var.A())) {
                            i13 = org.telegram.messenger.y3.C(12.0f, photoViewer.R1.getEditTextHeight(), i13);
                        }
                    }
                    dg.s1 s1Var = photoViewer.M0;
                    if (s1Var != null && s1Var.getVisibility() == 0) {
                        ms0 ms0Var2 = photoViewer.R1;
                        if (ms0Var2 == null || !ms0Var2.I.c()) {
                            return i13 + photoViewer.M0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                dh.d dVar = photoViewer.f31715f0;
                if (dVar != null && dVar.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f31715f0.getAlpha() * photoViewer.f31715f0.getHeight()) + 0);
                }
                org.telegram.ui.Components.y30 y30Var = photoViewer.f31743i1;
                if (y30Var != null && y30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f31679b0.getMeasuredHeight() > photoViewer.f31679b0.getMeasuredWidth()) {
                        return (int) ((photoViewer.f31743i1.getAlpha() * photoViewer.f31743i1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f33046b).f31940l0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f33046b;
                if (profileActivity.f32112p5 == null) {
                    return profileActivity.f32065i6 + profileActivity.f32058h6;
                }
                return profileActivity.f32065i6 + profileActivity.f32058h6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f32112p5.getTranslationY()) - (profileActivity.f32119q5[1].getTranslationY() * profileActivity.L.g0(9, false))) - (profileActivity.f32119q5[0].getTranslationY() * profileActivity.L.g0(8, true))));
            default:
                sf1 sf1Var = (sf1) this.f33046b;
                h51 h51Var = sf1Var.f38200l0;
                if (h51Var != null && h51Var.getVisibility() == 0) {
                    return sf1Var.f38200l0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f33045a) {
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
        switch (this.f33045a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                zn znVar = (zn) this.f33046b;
                kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, znVar.f40720q9);
                break;
            case 3:
                return 0;
            case 4:
                qy qyVar = (qy) this.f33046b;
                kVar4 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                pw pwVar = qyVar.f37633w0;
                if (pwVar != null && pwVar.getVisibility() == 0) {
                    i13 = qyVar.f37633w0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.is isVar = qyVar.G1;
                if (isVar != null) {
                    i14 = isVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                ix ixVar = qyVar.B0;
                if (ixVar != null && qyVar.D0) {
                    i15 = (int) ((1.0f - ixVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((iu0) this.f33046b).B0;
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
