package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class a9 implements org.telegram.ui.Components.fb {
    public final int f32490a;
    public final Object f32491b;

    public a9(Object obj, int i10) {
        this.f32490a = i10;
        this.f32491b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f32490a) {
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
        switch (this.f32490a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.nb nbVar = icVar.e;
                xn xnVar = (xn) this.f32491b;
                pg.b c3 = xnVar.G.c(nbVar, null, true);
                qg.d dVar = new qg.d(xnVar.f39968ba);
                dVar.e = new al0(29);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f43063f = dpf2;
                dVar.h = dpf22;
                c3.n(dVar);
                c3.p(AndroidUtilities.dp(16.0f));
                nbVar.setCustomBackground(c3);
                return;
            case 3:
                return;
            case 4:
                oy oyVar = (oy) this.f32491b;
                UndoView undoView = oyVar.f37110v0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    oyVar.f37110v0[0].e(2, true);
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
        switch (this.f32490a) {
            case 0:
                l9 l9Var = (l9) this.f32491b;
                l9Var.S = Math.max(0.0f, (f10 - l9Var.T) - l9Var.R);
                l9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f32491b;
                contactsActivity.m0 = Math.max(0.0f, (f10 - contactsActivity.f31552n0) - contactsActivity.f31550l0);
                contactsActivity.i0();
                return;
            case 4:
                oy oyVar = (oy) this.f32491b;
                UndoView undoView = oyVar.f37110v0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    oyVar.f37091r1 = Math.max(0.0f, (f10 - oyVar.f37023d4) - oyVar.f37039g4);
                    oyVar.X4();
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
        int i10 = this.f32490a;
    }

    @Override
    public final boolean e() {
        switch (this.f32490a) {
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
                if (((ProfileActivity) this.f32491b).f32138p5 == null) {
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
        hu0 hu0Var;
        switch (this.f32490a) {
            case 0:
                l9 l9Var = (l9) this.f32491b;
                i11 = l9Var.T;
                i12 = l9Var.R;
                break;
            case 1:
                return ((bd) this.f32491b).L.getMeasuredHeight();
            case 2:
                xn xnVar = (xn) this.f32491b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(xnVar.P.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + xnVar.W8(org.telegram.ui.Components.s21.f28616c) + xnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f32491b;
                i11 = contactsActivity.f31552n0;
                i12 = contactsActivity.f31550l0;
                break;
            case 4:
                oy oyVar = (oy) this.f32491b;
                if (oyVar.U2 != 0) {
                    return AndroidUtilities.dp(60.0f) + oyVar.f37023d4;
                }
                return oyVar.n3();
            case 5:
                i12 = ((vg0) this.f32491b).I;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((bu0) this.f32491b).B0;
                int i13 = 0;
                if (photoViewer.O4) {
                    fs0 fs0Var = photoViewer.R1;
                    if (fs0Var != null) {
                        i13 = fs0Var.I.f41748l;
                        if (fs0Var.getVisibility() == 0 && ((hu0Var = photoViewer.d) == null || !hu0Var.A())) {
                            i13 = org.telegram.messenger.y3.C(12.0f, photoViewer.R1.getEditTextHeight(), i13);
                        }
                    }
                    dg.s1 s1Var = photoViewer.M0;
                    if (s1Var != null && s1Var.getVisibility() == 0) {
                        fs0 fs0Var2 = photoViewer.R1;
                        if (fs0Var2 == null || !fs0Var2.I.c()) {
                            return i13 + photoViewer.M0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                dh.d dVar = photoViewer.f31741f0;
                if (dVar != null && dVar.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f31741f0.getAlpha() * photoViewer.f31741f0.getHeight()) + 0);
                }
                org.telegram.ui.Components.x30 x30Var = photoViewer.f31769i1;
                if (x30Var != null && x30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f31705b0.getMeasuredHeight() > photoViewer.f31705b0.getMeasuredWidth()) {
                        return (int) ((photoViewer.f31769i1.getAlpha() * photoViewer.f31769i1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f32491b).f31966l0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f32491b;
                if (profileActivity.f32138p5 == null) {
                    return profileActivity.f32091i6 + profileActivity.f32084h6;
                }
                return profileActivity.f32091i6 + profileActivity.f32084h6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f32138p5.getTranslationY()) - (profileActivity.f32145q5[1].getTranslationY() * profileActivity.L.g0(9, false))) - (profileActivity.f32145q5[0].getTranslationY() * profileActivity.L.g0(8, true))));
            default:
                kf1 kf1Var = (kf1) this.f32491b;
                a51 a51Var = kf1Var.f35693l0;
                if (a51Var != null && a51Var.getVisibility() == 0) {
                    return kf1Var.f35693l0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f32490a) {
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
        switch (this.f32490a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                xn xnVar = (xn) this.f32491b;
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
                max2 = (int) Math.max(0.0f, xnVar.f40154q9);
                break;
            case 3:
                return 0;
            case 4:
                oy oyVar = (oy) this.f32491b;
                kVar4 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                nw nwVar = oyVar.f37115w0;
                if (nwVar != null && nwVar.getVisibility() == 0) {
                    i13 = oyVar.f37115w0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.js jsVar = oyVar.G1;
                if (jsVar != null) {
                    i14 = jsVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                gx gxVar = oyVar.B0;
                if (gxVar != null && oyVar.D0) {
                    i15 = (int) ((1.0f - gxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((bu0) this.f32491b).B0;
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
