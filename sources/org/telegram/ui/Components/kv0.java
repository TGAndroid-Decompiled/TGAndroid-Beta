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
import org.telegram.ui.id1;
import org.telegram.ui.pd1;
import org.telegram.ui.rd1;
public final class kv0 implements Runnable {
    public final int f26390a;
    public final boolean f26391b;
    public final Object f26392c;

    public kv0(int i10, Object obj, boolean z4) {
        this.f26390a = i10;
        this.f26392c = obj;
        this.f26391b = z4;
    }

    @Override
    public final void run() {
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i11 = this.f26390a;
        int i12 = 0;
        boolean z4 = this.f26391b;
        Object obj = this.f26392c;
        switch (i11) {
            case 0:
                qv0 qv0Var = (qv0) obj;
                ArrayList arrayList = qv0Var.f28290r;
                pv0 pv0Var = qv0Var.f28285n;
                if (pv0Var != null) {
                    pv0Var.G(qv0Var.f28277f, z4);
                }
                while (i12 < arrayList.size()) {
                    ((pv0) arrayList.get(i12)).G(qv0Var.f28277f, z4);
                    i12++;
                }
                return;
            case 1:
                rv0 rv0Var = (rv0) obj;
                ArrayList arrayList2 = rv0Var.f28290r;
                pv0 pv0Var2 = rv0Var.f28285n;
                if (pv0Var2 != null) {
                    pv0Var2.G(rv0Var.f28543v0, z4);
                }
                while (i12 < arrayList2.size()) {
                    ((pv0) arrayList2.get(i12)).G(rv0Var.f28543v0, z4);
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
                org.telegram.ui.yz yzVar = (org.telegram.ui.yz) obj;
                yzVar.Z(yzVar.M, z4);
                return;
            case 5:
                org.telegram.ui.ng0 ng0Var = (org.telegram.ui.ng0) obj;
                if (!z4) {
                    ng0Var.T.setVisibility(8);
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
                Activity parentActivity = ((org.telegram.ui.g01) obj).e.getParentActivity();
                if (z4) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                af.g.s(parentActivity, LocaleController.getString(i10));
                return;
            case 9:
                org.telegram.ui.l21 l21Var = (org.telegram.ui.l21) obj;
                org.telegram.ui.m21 m21Var = l21Var.P;
                ip ipVar = l21Var.f35890b;
                if (ipVar != null && ipVar.d != null) {
                    l21Var.a(z4, true);
                    if (l21Var.H != null) {
                        l21Var.N = true;
                        m21Var.H = z4;
                        m21Var.d0(m21Var.L, m21Var.G, false);
                    }
                    if (ipVar.d != null) {
                        while (i12 < ipVar.d.size()) {
                            ((jp) ipVar.d.get(i12)).f26017c = z4 ? 1 : 0;
                            ((jp) ipVar.d.get(i12)).e = m21Var.b0(((jp) ipVar.d.get(i12)).f26015a, z4);
                            i12++;
                        }
                        m21Var.f36174r = null;
                        ipVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                rd1 rd1Var = (rd1) obj;
                AndroidUtilities.runOnUIThread(new id1(rd1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = rd1Var.H;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z4) {
                        org.telegram.ui.Cells.t1 t1Var2 = rd1Var.H;
                        int O2 = t1Var2.O2(rd1Var.L);
                        pd1 pd1Var = rd1Var.F;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.O8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && pd1Var != null && (checkBoxBaseArr = pd1Var.O8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f22964p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f22964p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f22965q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = rd1Var.H;
                    t1Var3.H7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.um umVar = rd1Var.Z;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    rd1Var.Z = null;
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
                ph.j3 j3Var = ((ph.k3) obj).f41844b;
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
                ph.n6 n6Var = (ph.n6) obj;
                if (!z4) {
                    n6Var.setVisibility(8);
                    return;
                } else {
                    n6Var.getClass();
                    return;
                }
            case 15:
                ph.h9 h9Var = (ph.h9) obj;
                if (!z4) {
                    h9Var.f41720x2.f41494g1.setVisibility(8);
                    return;
                } else {
                    h9Var.getClass();
                    return;
                }
            default:
                ((sh.o0) obj).f(z4, false);
                return;
        }
    }
}
