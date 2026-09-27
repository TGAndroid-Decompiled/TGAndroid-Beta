package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class c9 implements org.telegram.ui.Components.ob {
    public final int f32634a;
    public final Object f32635b;

    public c9(Object obj, int i10) {
        this.f32634a = i10;
        this.f32635b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f32634a) {
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
        switch (this.f32634a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                xn xnVar = (xn) this.f32635b;
                ch.d c10 = xnVar.J.c(ubVar, null, true);
                dh.e eVar = new dh.e(xnVar.f39750ea);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f7726f = dpf2;
                eVar.h = dpf22;
                c10.u(eVar);
                c10.w(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                ty tyVar = (ty) this.f32635b;
                UndoView undoView = tyVar.f38076y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    tyVar.f38076y0[0].e(2, true);
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
        switch (this.f32634a) {
            case 0:
                n9 n9Var = (n9) this.f32635b;
                n9Var.V = Math.max(0.0f, (f7 - n9Var.W) - n9Var.U);
                n9Var.i0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f32635b;
                contactsActivity.f31041p0 = Math.max(0.0f, (f7 - contactsActivity.f31042q0) - contactsActivity.f31040o0);
                contactsActivity.i0();
                return;
            case 4:
                ty tyVar = (ty) this.f32635b;
                UndoView undoView = tyVar.f38076y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    tyVar.f38057u1 = Math.max(0.0f, (f7 - tyVar.f37986f4) - tyVar.f38001i4);
                    tyVar.g5();
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
        int i10 = this.f32634a;
    }

    @Override
    public final boolean e() {
        switch (this.f32634a) {
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
                if (((ProfileActivity) this.f32635b).f31657s5 == null) {
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
        wu0 wu0Var;
        switch (this.f32634a) {
            case 0:
                n9 n9Var = (n9) this.f32635b;
                i11 = n9Var.W;
                i12 = n9Var.U;
                break;
            case 1:
                return ((cd) this.f32635b).O.getMeasuredHeight();
            case 2:
                xn xnVar = (xn) this.f32635b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(xnVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + xnVar.W8(org.telegram.ui.Components.i31.f25014c) + xnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f32635b;
                i11 = contactsActivity.f31042q0;
                i12 = contactsActivity.f31040o0;
                break;
            case 4:
                ty tyVar = (ty) this.f32635b;
                if (tyVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + tyVar.f37986f4;
                }
                return tyVar.w3();
            case 5:
                i12 = ((bh0) this.f32635b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((qu0) this.f32635b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    ws0 ws0Var = photoViewer.U1;
                    if (ws0Var != null) {
                        i13 = ws0Var.L.f4784l;
                        if (ws0Var.getVisibility() == 0 && ((wu0Var = photoViewer.d) == null || !wu0Var.A())) {
                            i13 = org.telegram.messenger.l0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    v5 v5Var = photoViewer.P0;
                    if (v5Var != null && v5Var.getVisibility() == 0) {
                        ws0 ws0Var2 = photoViewer.U1;
                        if (ws0Var2 == null || !ws0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ai.w5 w5Var = photoViewer.f31260i0;
                if (w5Var != null && w5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f31260i0.getAlpha() * photoViewer.f31260i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.y30 y30Var = photoViewer.l1;
                if (y30Var != null && y30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f31225e0.getMeasuredHeight() > photoViewer.f31225e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f32635b).f31461o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f32635b;
                if (profileActivity.f31657s5 == null) {
                    return profileActivity.f31609l6 + profileActivity.f31604k6;
                }
                return profileActivity.f31609l6 + profileActivity.f31604k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f31657s5.getTranslationY()) - (profileActivity.f31664t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f31664t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                wf1 wf1Var = (wf1) this.f32635b;
                n41 n41Var = wf1Var.f39317o0;
                if (n41Var != null && n41Var.getVisibility() == 0) {
                    return wf1Var.f39317o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f32634a) {
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
        org.telegram.ui.ActionBar.l lVar;
        int i11;
        int max;
        int max2;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.l lVar5;
        switch (this.f32634a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                xn xnVar = (xn) this.f32635b;
                lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                    int measuredHeight = lVar2.getMeasuredHeight();
                    lVar3 = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                    i11 = lVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, xnVar.f39935t9);
                break;
            case 3:
                return 0;
            case 4:
                ty tyVar = (ty) this.f32635b;
                lVar4 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                int i15 = 0;
                if (lVar4 != null) {
                    lVar5 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                    i12 = lVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                iy iyVar = tyVar.f38079z0;
                if (iyVar != null && iyVar.getVisibility() == 0) {
                    i13 = tyVar.f38079z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ms msVar = tyVar.J1;
                if (msVar != null) {
                    i14 = msVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                hx hxVar = tyVar.E0;
                if (hxVar != null && tyVar.G0) {
                    i15 = (int) ((1.0f - hxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((qu0) this.f32635b).E0;
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (photoViewer.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = AndroidUtilities.statusBarHeight;
                max = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
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
