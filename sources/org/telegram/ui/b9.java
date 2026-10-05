package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class b9 implements org.telegram.ui.Components.pb {
    public final int f35087a;
    public final Object f35088b;

    public b9(Object obj, int i10) {
        this.f35087a = i10;
        this.f35088b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f35087a) {
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
    public final void b(org.telegram.ui.Components.rc rcVar) {
        switch (this.f35087a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.vb vbVar = rcVar.f30423e;
                yn ynVar = (yn) this.f35088b;
                ch.d c10 = ynVar.H.c(vbVar, null, true);
                dh.e eVar = new dh.e(ynVar.f43300ca);
                eVar.f8354e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8355f = dpf2;
                eVar.h = dpf22;
                c10.w(eVar);
                c10.y(AndroidUtilities.dp(16.0f));
                vbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                uy uyVar = (uy) this.f35088b;
                UndoView undoView = uyVar.f41535y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    uyVar.f41535y0[0].e(2, true);
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
        switch (this.f35087a) {
            case 0:
                m9 m9Var = (m9) this.f35088b;
                m9Var.V = Math.max(0.0f, (f7 - m9Var.W) - m9Var.U);
                m9Var.b0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f35088b;
                contactsActivity.f33721p0 = Math.max(0.0f, (f7 - contactsActivity.f33722q0) - contactsActivity.f33720o0);
                contactsActivity.i0();
                return;
            case 4:
                uy uyVar = (uy) this.f35088b;
                UndoView undoView = uyVar.f41535y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    uyVar.f41516u1 = Math.max(0.0f, (f7 - uyVar.f41445f4) - uyVar.f41460i4);
                    uyVar.g5();
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
    public final void d(org.telegram.ui.Components.rc rcVar) {
        int i10 = this.f35087a;
    }

    @Override
    public final boolean e() {
        switch (this.f35087a) {
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
                if (((ProfileActivity) this.f35088b).f34353s5 == null) {
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
        switch (this.f35087a) {
            case 0:
                m9 m9Var = (m9) this.f35088b;
                i11 = m9Var.W;
                i12 = m9Var.U;
                break;
            case 1:
                return ((cd) this.f35088b).O.getMeasuredHeight();
            case 2:
                yn ynVar = (yn) this.f35088b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(ynVar.Q.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + ynVar.X8(org.telegram.ui.Components.s31.f30679c) + ynVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f35088b;
                i11 = contactsActivity.f33722q0;
                i12 = contactsActivity.f33720o0;
                break;
            case 4:
                uy uyVar = (uy) this.f35088b;
                if (uyVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + uyVar.f41445f4;
                }
                return uyVar.w3();
            case 5:
                i12 = ((ch0) this.f35088b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((qu0) this.f35088b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    ws0 ws0Var = photoViewer.U1;
                    if (ws0Var != null) {
                        i13 = ws0Var.L.f5168l;
                        if (ws0Var.getVisibility() == 0 && ((wu0Var = photoViewer.d) == null || !wu0Var.A())) {
                            i13 = org.telegram.messenger.q.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    u5 u5Var = photoViewer.P0;
                    if (u5Var != null && u5Var.getVisibility() == 0) {
                        ws0 ws0Var2 = photoViewer.U1;
                        if (ws0Var2 == null || !ws0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ai.w5 w5Var = photoViewer.f33949i0;
                if (w5Var != null && w5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f33949i0.getAlpha() * photoViewer.f33949i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.z30 z30Var = photoViewer.l1;
                if (z30Var != null && z30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f33914e0.getMeasuredHeight() > photoViewer.f33914e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f35088b).f34154o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f35088b;
                if (profileActivity.f34353s5 == null) {
                    return profileActivity.f34305l6 + profileActivity.f34300k6;
                }
                return profileActivity.f34305l6 + profileActivity.f34300k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f34353s5.getTranslationY()) - (profileActivity.f34360t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f34360t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                wf1 wf1Var = (wf1) this.f35088b;
                l41 l41Var = wf1Var.f42498o0;
                if (l41Var != null && l41Var.getVisibility() == 0) {
                    return wf1Var.f42498o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f35087a) {
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
        switch (this.f35087a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                yn ynVar = (yn) this.f35088b;
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, ynVar.f43483r9);
                break;
            case 3:
                return 0;
            case 4:
                uy uyVar = (uy) this.f35088b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                ky kyVar = uyVar.f41538z0;
                if (kyVar != null && kyVar.getVisibility() == 0) {
                    i13 = uyVar.f41538z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ns nsVar = uyVar.J1;
                if (nsVar != null) {
                    i14 = nsVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                jx jxVar = uyVar.E0;
                if (jxVar != null && uyVar.G0) {
                    i15 = (int) ((1.0f - jxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((qu0) this.f35088b).E0;
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

    private final void A(org.telegram.ui.Components.rc rcVar) {
    }

    private final void B(org.telegram.ui.Components.rc rcVar) {
    }

    private final void C(org.telegram.ui.Components.rc rcVar) {
    }

    private final void D(org.telegram.ui.Components.rc rcVar) {
    }

    private final void E(org.telegram.ui.Components.rc rcVar) {
    }

    private final void F(org.telegram.ui.Components.rc rcVar) {
    }

    private final void G(org.telegram.ui.Components.rc rcVar) {
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

    private final void p(org.telegram.ui.Components.rc rcVar) {
    }

    private final void q(org.telegram.ui.Components.rc rcVar) {
    }

    private final void r(org.telegram.ui.Components.rc rcVar) {
    }

    private final void s(org.telegram.ui.Components.rc rcVar) {
    }

    private final void t(org.telegram.ui.Components.rc rcVar) {
    }

    private final void u(org.telegram.ui.Components.rc rcVar) {
    }

    private final void v(org.telegram.ui.Components.rc rcVar) {
    }

    private final void w(org.telegram.ui.Components.rc rcVar) {
    }

    private final void x(org.telegram.ui.Components.rc rcVar) {
    }

    private final void y(org.telegram.ui.Components.rc rcVar) {
    }

    private final void z(org.telegram.ui.Components.rc rcVar) {
    }
}
