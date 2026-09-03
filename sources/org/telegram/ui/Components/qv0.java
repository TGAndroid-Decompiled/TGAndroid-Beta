package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pd1;
import org.telegram.ui.xd1;
import org.telegram.ui.zd1;
public final class qv0 implements Runnable {
    public final int f30542a;
    public final boolean f30543b;
    public final Object f30544c;

    public qv0(int i10, Object obj, boolean z4) {
        this.f30542a = i10;
        this.f30544c = obj;
        this.f30543b = z4;
    }

    @Override
    public final void run() {
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i11 = this.f30542a;
        int i12 = 0;
        boolean z4 = this.f30543b;
        Object obj = this.f30544c;
        switch (i11) {
            case 0:
                rv0 rv0Var = (rv0) obj;
                ArrayList arrayList = rv0Var.f30218r;
                ov0 ov0Var = rv0Var.f30213n;
                if (ov0Var != null) {
                    ov0Var.G(rv0Var.f30913v0, z4);
                }
                while (i12 < arrayList.size()) {
                    ((ov0) arrayList.get(i12)).G(rv0Var.f30913v0, z4);
                    i12++;
                }
                return;
            case 1:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z4));
                return;
            case 2:
                ((w51) obj).P(z4);
                return;
            case 3:
                org.telegram.ui.zz zzVar = (org.telegram.ui.zz) obj;
                zzVar.Z(zzVar.M, z4);
                return;
            case 4:
                org.telegram.ui.og0 og0Var = (org.telegram.ui.og0) obj;
                if (!z4) {
                    og0Var.T.setVisibility(8);
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z4) {
                    photoViewer.S0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.getClass();
                return;
            case 6:
                ((ProfileActivity) obj).e5(z4, true);
                return;
            case 7:
                Activity parentActivity = ((org.telegram.ui.n01) obj).f39152e.getParentActivity();
                if (z4) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                af.g.s(parentActivity, LocaleController.getString(i10));
                return;
            case 8:
                org.telegram.ui.t21 t21Var = (org.telegram.ui.t21) obj;
                org.telegram.ui.u21 u21Var = t21Var.P;
                kp kpVar = t21Var.f41390b;
                if (kpVar != null && kpVar.d != null) {
                    t21Var.a(z4, true);
                    if (t21Var.H != null) {
                        t21Var.N = true;
                        u21Var.H = z4;
                        u21Var.d0(u21Var.L, u21Var.G, false);
                    }
                    if (kpVar.d != null) {
                        while (i12 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i12)).f28821c = z4 ? 1 : 0;
                            ((lp) kpVar.d.get(i12)).f28822e = u21Var.b0(((lp) kpVar.d.get(i12)).f28819a, z4);
                            i12++;
                        }
                        u21Var.f41710r = null;
                        kpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                zd1 zd1Var = (zd1) obj;
                AndroidUtilities.runOnUIThread(new pd1(zd1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = zd1Var.H;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z4) {
                        org.telegram.ui.Cells.t1 t1Var2 = zd1Var.H;
                        int O2 = t1Var2.O2(zd1Var.L);
                        xd1 xd1Var = zd1Var.F;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.O8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && xd1Var != null && (checkBoxBaseArr = xd1Var.O8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f24810p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f24810p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f24811q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = zd1Var.H;
                    t1Var3.H7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.um umVar = zd1Var.Z;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    zd1Var.Z = null;
                    return;
                }
                return;
            case 10:
                ph.l lVar = (ph.l) obj;
                nr0 nr0Var = lVar.T;
                if (z4) {
                    new ph.o(nr0Var.f44437a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new org.telegram.ui.web.d1(nr0Var, 2)).show();
                    return;
                } else {
                    nr0Var.b(lVar.f44422a.E);
                    return;
                }
            case 11:
                qh.w2 w2Var = (qh.w2) obj;
                if (!z4) {
                    w2Var.F.setVisibility(8);
                    return;
                } else {
                    w2Var.getClass();
                    return;
                }
            case 12:
                qh.i3 i3Var = ((qh.j3) obj).f45521b;
                if (!z4) {
                    i12 = 8;
                }
                i3Var.setVisibility(i12);
                return;
            case 13:
                qh.a5 a5Var = (qh.a5) obj;
                if (!z4) {
                    a5Var.U0.setVisibility(8);
                    return;
                } else {
                    a5Var.getClass();
                    return;
                }
            case 14:
                qh.j6 j6Var = (qh.j6) obj;
                if (!z4) {
                    j6Var.setVisibility(8);
                    return;
                } else {
                    j6Var.getClass();
                    return;
                }
            case 15:
                qh.e9 e9Var = (qh.e9) obj;
                if (!z4) {
                    e9Var.f45309x2.f45063g1.setVisibility(8);
                    return;
                } else {
                    e9Var.getClass();
                    return;
                }
            default:
                ((th.n0) obj).f(z4, false);
                return;
        }
    }
}
