package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class b9 implements org.telegram.ui.Components.ob {
    public final int f35542a;
    public final Object f35543b;

    public b9(Object obj, int i10) {
        this.f35542a = i10;
        this.f35543b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f35542a) {
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
        switch (this.f35542a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                qn qnVar = (qn) this.f35543b;
                dh.d c10 = qnVar.J.c(ubVar, null, true);
                eh.e eVar = new eh.e(qnVar.f40677ea);
                eVar.e = new ci.i1(20);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8660f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                cy cyVar = (cy) this.f35543b;
                UndoView undoView = cyVar.f36199y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    cyVar.f36199y0[0].e(2, true);
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
        switch (this.f35542a) {
            case 0:
                m9 m9Var = (m9) this.f35543b;
                m9Var.V = Math.max(0.0f, (f7 - m9Var.W) - m9Var.U);
                m9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f35543b;
                contactsActivity.f33099p0 = Math.max(0.0f, (f7 - contactsActivity.f33100q0) - contactsActivity.f33098o0);
                contactsActivity.i0();
                return;
            case 4:
                cy cyVar = (cy) this.f35543b;
                UndoView undoView = cyVar.f36199y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    cyVar.f36178u1 = Math.max(0.0f, (f7 - cyVar.f36111g4) - cyVar.f36126j4);
                    cyVar.V4();
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
        int i10 = this.f35542a;
    }

    @Override
    public final boolean e() {
        switch (this.f35542a) {
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
                if (((ProfileActivity) this.f35543b).f33731u5 == null) {
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
        int dp;
        float f7;
        int[] iArr;
        int[] iArr2;
        switch (this.f35542a) {
            case 0:
                m9 m9Var = (m9) this.f35543b;
                i11 = m9Var.W;
                i12 = m9Var.U;
                break;
            case 1:
                return ((bd) this.f35543b).O.getMeasuredHeight();
            case 2:
                qn qnVar = (qn) this.f35543b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(qnVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + qnVar.b9(org.telegram.ui.Components.n31.f28685c) + qnVar.v.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f35543b;
                i11 = contactsActivity.f33100q0;
                i12 = contactsActivity.f33098o0;
                break;
            case 4:
                cy cyVar = (cy) this.f35543b;
                if (cyVar.Y2 != 0) {
                    return AndroidUtilities.dp(60.0f) + cyVar.f36111g4;
                }
                return cyVar.k3();
            case 5:
                i12 = ((ng0) this.f35543b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((bu0) this.f35543b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    hs0 hs0Var = photoViewer.U1;
                    if (hs0Var != null) {
                        i13 = hs0Var.L.f8784l;
                        if (hs0Var.getVisibility() == 0 && ((hu0Var = photoViewer.d) == null || !hu0Var.A())) {
                            i13 = org.telegram.messenger.g0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    ai.o5 o5Var = photoViewer.P0;
                    if (o5Var != null && o5Var.getVisibility() == 0) {
                        hs0 hs0Var2 = photoViewer.U1;
                        if (hs0Var2 == null || !hs0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ci.i4 i4Var = photoViewer.f33318i0;
                if (i4Var != null && i4Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f33318i0.getAlpha() * photoViewer.f33318i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.e40 e40Var = photoViewer.l1;
                if (e40Var != null && e40Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f33283e0.getMeasuredHeight() > photoViewer.f33283e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f35543b).f33520o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f35543b;
                int i14 = 0;
                if (profileActivity.f33731u5 == null) {
                    dp = profileActivity.f33696p6 + profileActivity.f33690o6;
                } else {
                    dp = ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f33731u5.getTranslationY()) - (profileActivity.f33738v5[1].getTranslationY() * profileActivity.O.h0(9, false))) - (profileActivity.f33738v5[0].getTranslationY() * profileActivity.O.h0(8, true)))) + profileActivity.f33696p6 + profileActivity.f33690o6;
                }
                nz0 nz0Var = profileActivity.O;
                if (nz0Var != null && nz0Var.V != null) {
                    f7 = nz0Var.h0(14, false);
                } else {
                    f7 = 0.0f;
                }
                if (f7 > 0.0f) {
                    org.telegram.ui.Components.ks0 ks0Var = profileActivity.O.V;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = ks0Var.f50472r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i14 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return AndroidUtilities.lerp(dp, Math.max(dp, i14), Math.min(1.0f, f7));
                }
                return dp;
            default:
                re1 re1Var = (re1) this.f35543b;
                j41 j41Var = re1Var.f41182o0;
                if (j41Var != null && j41Var.getVisibility() == 0) {
                    return re1Var.f41182o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f35542a) {
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
        switch (this.f35542a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                qn qnVar = (qn) this.f35543b;
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, qnVar.f40862t9);
                break;
            case 3:
                return 0;
            case 4:
                cy cyVar = (cy) this.f35543b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                aw awVar = cyVar.f36202z0;
                if (awVar != null && awVar.getVisibility() == 0) {
                    i13 = cyVar.f36202z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.us usVar = cyVar.J1;
                if (usVar != null) {
                    i14 = usVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                tw twVar = cyVar.E0;
                if (twVar != null && cyVar.G0) {
                    i15 = (int) ((1.0f - twVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((bu0) this.f35543b).E0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
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
