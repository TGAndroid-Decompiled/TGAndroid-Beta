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
import org.telegram.ui.wd1;
import org.telegram.ui.yd1;
public final class kv0 implements Runnable {
    public final int f26402a;
    public final boolean f26403b;
    public final Object f26404c;

    public kv0(int i10, Object obj, boolean z4) {
        this.f26402a = i10;
        this.f26404c = obj;
        this.f26403b = z4;
    }

    @Override
    public final void run() {
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i11 = this.f26402a;
        int i12 = 0;
        boolean z4 = this.f26403b;
        Object obj = this.f26404c;
        switch (i11) {
            case 0:
                qv0 qv0Var = (qv0) obj;
                ArrayList arrayList = qv0Var.f28304r;
                pv0 pv0Var = qv0Var.f28299n;
                if (pv0Var != null) {
                    pv0Var.G(qv0Var.f28291f, z4);
                }
                while (i12 < arrayList.size()) {
                    ((pv0) arrayList.get(i12)).G(qv0Var.f28291f, z4);
                    i12++;
                }
                return;
            case 1:
                rv0 rv0Var = (rv0) obj;
                ArrayList arrayList2 = rv0Var.f28304r;
                pv0 pv0Var2 = rv0Var.f28299n;
                if (pv0Var2 != null) {
                    pv0Var2.G(rv0Var.f28592v0, z4);
                }
                while (i12 < arrayList2.size()) {
                    ((pv0) arrayList2.get(i12)).G(rv0Var.f28592v0, z4);
                    i12++;
                }
                return;
            case 2:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z4));
                return;
            case 3:
                ((w51) obj).P(z4);
                return;
            case 4:
                org.telegram.ui.a00 a00Var = (org.telegram.ui.a00) obj;
                a00Var.Z(a00Var.M, z4);
                return;
            case 5:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) obj;
                if (!z4) {
                    pg0Var.T.setVisibility(8);
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z4) {
                    photoViewer.S0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.getClass();
                return;
            case 7:
                ((ProfileActivity) obj).e5(z4, true);
                return;
            case 8:
                Activity parentActivity = ((org.telegram.ui.n01) obj).e.getParentActivity();
                if (z4) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                ze.d.s(parentActivity, LocaleController.getString(i10));
                return;
            case 9:
                org.telegram.ui.t21 t21Var = (org.telegram.ui.t21) obj;
                org.telegram.ui.u21 u21Var = t21Var.P;
                hp hpVar = t21Var.f38362b;
                if (hpVar != null && hpVar.d != null) {
                    t21Var.a(z4, true);
                    if (t21Var.H != null) {
                        t21Var.N = true;
                        u21Var.H = z4;
                        u21Var.d0(u21Var.L, u21Var.G, false);
                    }
                    if (hpVar.d != null) {
                        while (i12 < hpVar.d.size()) {
                            ((ip) hpVar.d.get(i12)).f25751c = z4 ? 1 : 0;
                            ((ip) hpVar.d.get(i12)).e = u21Var.b0(((ip) hpVar.d.get(i12)).f25749a, z4);
                            i12++;
                        }
                        u21Var.f38679r = null;
                        hpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                yd1 yd1Var = (yd1) obj;
                AndroidUtilities.runOnUIThread(new pd1(yd1Var, 1));
                org.telegram.ui.Cells.s1 s1Var = yd1Var.H;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    if (!z4) {
                        org.telegram.ui.Cells.s1 s1Var2 = yd1Var.H;
                        int O2 = s1Var2.O2(yd1Var.L);
                        wd1 wd1Var = yd1Var.F;
                        CheckBoxBase[] checkBoxBaseArr2 = s1Var2.O8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && wd1Var != null && (checkBoxBaseArr = wd1Var.O8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f22937p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f22937p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f22938q, true);
                        }
                    }
                    org.telegram.ui.Cells.s1 s1Var3 = yd1Var.H;
                    s1Var3.H7 = -1;
                    s1Var3.invalidate();
                }
                org.telegram.ui.wm wmVar = yd1Var.Z;
                if (wmVar != null) {
                    AndroidUtilities.runOnUIThread(wmVar);
                    yd1Var.Z = null;
                    return;
                }
                return;
            case 11:
                ph.x2 x2Var = (ph.x2) obj;
                if (!z4) {
                    x2Var.F.setVisibility(8);
                    return;
                } else {
                    x2Var.getClass();
                    return;
                }
            case 12:
                ph.j3 j3Var = ((ph.k3) obj).f41876b;
                if (!z4) {
                    i12 = 8;
                }
                j3Var.setVisibility(i12);
                return;
            case 13:
                ph.c5 c5Var = (ph.c5) obj;
                if (!z4) {
                    c5Var.U0.setVisibility(8);
                    return;
                } else {
                    c5Var.getClass();
                    return;
                }
            case 14:
                ph.m6 m6Var = (ph.m6) obj;
                if (!z4) {
                    m6Var.setVisibility(8);
                    return;
                } else {
                    m6Var.getClass();
                    return;
                }
            case 15:
                ph.h9 h9Var = (ph.h9) obj;
                if (!z4) {
                    h9Var.f41755x2.f41532g1.setVisibility(8);
                    return;
                } else {
                    h9Var.getClass();
                    return;
                }
            default:
                ((sh.n0) obj).f(z4, false);
                return;
        }
    }
}
