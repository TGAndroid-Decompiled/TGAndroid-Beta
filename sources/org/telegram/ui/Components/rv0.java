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
import org.telegram.ui.kd1;
import org.telegram.ui.sd1;
import org.telegram.ui.ud1;
public final class rv0 implements Runnable {
    public final int f30883a;
    public final boolean f30884b;
    public final Object f30885c;

    public rv0(int i10, Object obj, boolean z4) {
        this.f30883a = i10;
        this.f30885c = obj;
        this.f30884b = z4;
    }

    @Override
    public final void run() {
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i11 = this.f30883a;
        int i12 = 0;
        boolean z4 = this.f30884b;
        Object obj = this.f30885c;
        switch (i11) {
            case 0:
                sv0 sv0Var = (sv0) obj;
                ArrayList arrayList = sv0Var.f30509r;
                pv0 pv0Var = sv0Var.f30504n;
                if (pv0Var != null) {
                    pv0Var.G(sv0Var.f31186v0, z4);
                }
                while (i12 < arrayList.size()) {
                    ((pv0) arrayList.get(i12)).G(sv0Var.f31186v0, z4);
                    i12++;
                }
                return;
            case 1:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z4));
                return;
            case 2:
                ((x51) obj).P(z4);
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
                Activity parentActivity = ((org.telegram.ui.i01) obj).f37715e.getParentActivity();
                if (z4) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                af.g.s(parentActivity, LocaleController.getString(i10));
                return;
            case 8:
                org.telegram.ui.n21 n21Var = (org.telegram.ui.n21) obj;
                org.telegram.ui.o21 o21Var = n21Var.P;
                kp kpVar = n21Var.f39270b;
                if (kpVar != null && kpVar.d != null) {
                    n21Var.a(z4, true);
                    if (n21Var.H != null) {
                        n21Var.N = true;
                        o21Var.H = z4;
                        o21Var.d0(o21Var.L, o21Var.G, false);
                    }
                    if (kpVar.d != null) {
                        while (i12 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i12)).f28798c = z4 ? 1 : 0;
                            ((lp) kpVar.d.get(i12)).f28799e = o21Var.b0(((lp) kpVar.d.get(i12)).f28796a, z4);
                            i12++;
                        }
                        o21Var.f39571r = null;
                        kpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ud1 ud1Var = (ud1) obj;
                AndroidUtilities.runOnUIThread(new kd1(ud1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = ud1Var.H;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z4) {
                        org.telegram.ui.Cells.t1 t1Var2 = ud1Var.H;
                        int O2 = t1Var2.O2(ud1Var.L);
                        sd1 sd1Var = ud1Var.F;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.O8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && sd1Var != null && (checkBoxBaseArr = sd1Var.O8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f24808p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f24808p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f24809q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = ud1Var.H;
                    t1Var3.H7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.um umVar = ud1Var.Z;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    ud1Var.Z = null;
                    return;
                }
                return;
            case 10:
                ph.l lVar = (ph.l) obj;
                or0 or0Var = lVar.T;
                if (z4) {
                    new ph.o(or0Var.f44406a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new org.telegram.ui.web.d1(or0Var, 2)).show();
                    return;
                } else {
                    or0Var.b(lVar.f44391a.E);
                    return;
                }
            case 11:
                qh.x2 x2Var = (qh.x2) obj;
                if (!z4) {
                    x2Var.F.setVisibility(8);
                    return;
                } else {
                    x2Var.getClass();
                    return;
                }
            case 12:
                qh.j3 j3Var = ((qh.k3) obj).f45553b;
                if (!z4) {
                    i12 = 8;
                }
                j3Var.setVisibility(i12);
                return;
            case 13:
                qh.b5 b5Var = (qh.b5) obj;
                if (!z4) {
                    b5Var.U0.setVisibility(8);
                    return;
                } else {
                    b5Var.getClass();
                    return;
                }
            case 14:
                qh.l6 l6Var = (qh.l6) obj;
                if (!z4) {
                    l6Var.setVisibility(8);
                    return;
                } else {
                    l6Var.getClass();
                    return;
                }
            case 15:
                qh.f9 f9Var = (qh.f9) obj;
                if (!z4) {
                    f9Var.f45335x2.f45097g1.setVisibility(8);
                    return;
                } else {
                    f9Var.getClass();
                    return;
                }
            default:
                ((th.n0) obj).f(z4, false);
                return;
        }
    }
}
