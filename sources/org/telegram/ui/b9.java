package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class b9 implements org.telegram.ui.Components.qb {
    public final int f36110a;
    public final Object f36111b;

    public b9(Object obj, int i10) {
        this.f36110a = i10;
        this.f36111b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f36110a) {
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
        switch (this.f36110a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.wb wbVar = scVar.f30532e;
                eo eoVar = (eo) this.f36111b;
                ch.d c10 = eoVar.J.c(wbVar, null, true);
                dh.e eVar = new dh.e(eoVar.f37256ea);
                eVar.f8363e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8364f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                wbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                vy vyVar = (vy) this.f36111b;
                UndoView undoView = vyVar.f43006y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    vyVar.f43006y0[0].e(2, true);
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
        switch (this.f36110a) {
            case 0:
                m9 m9Var = (m9) this.f36111b;
                m9Var.V = Math.max(0.0f, (f7 - m9Var.W) - m9Var.U);
                m9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f36111b;
                contactsActivity.f33550p0 = Math.max(0.0f, (f7 - contactsActivity.f33551q0) - contactsActivity.f33549o0);
                contactsActivity.i0();
                return;
            case 4:
                vy vyVar = (vy) this.f36111b;
                UndoView undoView = vyVar.f43006y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    vyVar.f42986u1 = Math.max(0.0f, (f7 - vyVar.f42915f4) - vyVar.f42930i4);
                    vyVar.U4();
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
        int i10 = this.f36110a;
    }

    @Override
    public final boolean e() {
        switch (this.f36110a) {
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
                if (((ProfileActivity) this.f36111b).f34182s5 == null) {
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
        ev0 ev0Var;
        switch (this.f36110a) {
            case 0:
                m9 m9Var = (m9) this.f36111b;
                i11 = m9Var.W;
                i12 = m9Var.U;
                break;
            case 1:
                return ((fd) this.f36111b).O.getMeasuredHeight();
            case 2:
                eo eoVar = (eo) this.f36111b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(eoVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + eoVar.b9(org.telegram.ui.Components.d41.f25232c) + eoVar.v.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f36111b;
                i11 = contactsActivity.f33551q0;
                i12 = contactsActivity.f33549o0;
                break;
            case 4:
                vy vyVar = (vy) this.f36111b;
                if (vyVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + vyVar.f42915f4;
                }
                return vyVar.k3();
            case 5:
                i12 = ((gh0) this.f36111b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((yu0) this.f36111b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    dt0 dt0Var = photoViewer.U1;
                    if (dt0Var != null) {
                        i13 = dt0Var.L.f5165l;
                        if (dt0Var.getVisibility() == 0 && ((ev0Var = photoViewer.d) == null || !ev0Var.A())) {
                            i13 = org.telegram.messenger.v0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    w5 w5Var = photoViewer.P0;
                    if (w5Var != null && w5Var.getVisibility() == 0) {
                        dt0 dt0Var2 = photoViewer.U1;
                        if (dt0Var2 == null || !dt0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ai.x5 x5Var = photoViewer.f33778i0;
                if (x5Var != null && x5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f33778i0.getAlpha() * photoViewer.f33778i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.p40 p40Var = photoViewer.l1;
                if (p40Var != null && p40Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f33743e0.getMeasuredHeight() > photoViewer.f33743e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f36111b).f33983o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f36111b;
                if (profileActivity.f34182s5 == null) {
                    return profileActivity.f34134l6 + profileActivity.f34129k6;
                }
                return profileActivity.f34134l6 + profileActivity.f34129k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f34182s5.getTranslationY()) - (profileActivity.f34189t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f34189t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                hg1 hg1Var = (hg1) this.f36111b;
                z51 z51Var = hg1Var.f38407o0;
                if (z51Var != null && z51Var.getVisibility() == 0) {
                    return hg1Var.f38407o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f36110a) {
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
        switch (this.f36110a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                eo eoVar = (eo) this.f36111b;
                kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, eoVar.f37440t9);
                break;
            case 3:
                return 0;
            case 4:
                vy vyVar = (vy) this.f36111b;
                kVar4 = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                sw swVar = vyVar.f43009z0;
                if (swVar != null && swVar.getVisibility() == 0) {
                    i13 = vyVar.f43009z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ct ctVar = vyVar.J1;
                if (ctVar != null) {
                    i14 = ctVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                mx mxVar = vyVar.E0;
                if (mxVar != null && vyVar.G0) {
                    i15 = (int) ((1.0f - mxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((yu0) this.f36111b).E0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
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
