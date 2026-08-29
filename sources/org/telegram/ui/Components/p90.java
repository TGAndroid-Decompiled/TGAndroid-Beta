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
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dd1;
import org.telegram.ui.fd1;
import org.telegram.ui.wc1;
public final class p90 implements Runnable {
    public final int f31618a;
    public final boolean f31619b;
    public final Object f31620c;

    public p90(int i10, Object obj, boolean z10) {
        this.f31618a = i10;
        this.f31620c = obj;
        this.f31619b = z10;
    }

    @Override
    public final void run() {
        String str;
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i11 = this.f31618a;
        int i12 = 0;
        boolean z10 = this.f31619b;
        Object obj = this.f31620c;
        switch (i11) {
            case 0:
                y90 y90Var = (y90) obj;
                if (z10) {
                    y90Var.C.setVisibility(8);
                    return;
                } else {
                    y90Var.getClass();
                    return;
                }
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = ((tm0) obj).C;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                o2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 2:
                qu0 qu0Var = (qu0) obj;
                if (!z10) {
                    qu0Var.f32074i0.setVisibility(8);
                    return;
                } else {
                    qu0Var.getClass();
                    return;
                }
            case 3:
                gr0 gr0Var = (gr0) obj;
                if (!z10) {
                    gr0Var.Q.m0.setVisibility(0);
                    return;
                } else {
                    gr0Var.getClass();
                    return;
                }
            case 4:
                kr0 kr0Var = (kr0) obj;
                if (!z10) {
                    kr0Var.D.m0.setVisibility(0);
                    return;
                } else {
                    kr0Var.getClass();
                    return;
                }
            case 5:
                hv0 hv0Var = (hv0) obj;
                ArrayList arrayList = hv0Var.f29257r;
                gv0 gv0Var = hv0Var.f29253n;
                if (gv0Var != null) {
                    gv0Var.G(hv0Var.f29245f, z10);
                }
                while (i12 < arrayList.size()) {
                    ((gv0) arrayList.get(i12)).G(hv0Var.f29245f, z10);
                    i12++;
                }
                return;
            case 6:
                iv0 iv0Var = (iv0) obj;
                ArrayList arrayList2 = iv0Var.f29257r;
                gv0 gv0Var2 = iv0Var.f29253n;
                if (gv0Var2 != null) {
                    gv0Var2.G(iv0Var.f29488u0, z10);
                }
                while (i12 < arrayList2.size()) {
                    ((gv0) arrayList2.get(i12)).G(iv0Var.f29488u0, z10);
                    i12++;
                }
                return;
            case 7:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                return;
            case 8:
                ((k51) obj).P(z10);
                return;
            case 9:
                org.telegram.ui.nz nzVar = (org.telegram.ui.nz) obj;
                nzVar.Z(nzVar.L, z10);
                return;
            case 10:
                org.telegram.ui.fg0 fg0Var = (org.telegram.ui.fg0) obj;
                if (!z10) {
                    fg0Var.S.setVisibility(8);
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.R0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                return;
            case 12:
                ((ProfileActivity) obj).e5(z10, true);
                return;
            case 13:
                Activity parentActivity = ((org.telegram.ui.vz0) obj).f43803e.getParentActivity();
                if (z10) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                ye.d.s(parentActivity, LocaleController.getString(i10));
                return;
            case 14:
                org.telegram.ui.z11 z11Var = (org.telegram.ui.z11) obj;
                org.telegram.ui.a21 a21Var = z11Var.O;
                ep epVar = z11Var.f45025b;
                if (epVar != null && epVar.d != null) {
                    z11Var.a(z10, true);
                    if (z11Var.G != null) {
                        z11Var.M = true;
                        a21Var.G = z10;
                        a21Var.d0(a21Var.K, a21Var.F, false);
                    }
                    if (epVar.d != null) {
                        while (i12 < epVar.d.size()) {
                            ((fp) epVar.d.get(i12)).f28514c = z10 ? 1 : 0;
                            ((fp) epVar.d.get(i12)).f28515e = a21Var.b0(((fp) epVar.d.get(i12)).f28512a, z10);
                            i12++;
                        }
                        a21Var.f36409r = null;
                        epVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                fd1 fd1Var = (fd1) obj;
                AndroidUtilities.runOnUIThread(new wc1(fd1Var, 1));
                org.telegram.ui.Cells.s1 s1Var = fd1Var.G;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.s1 s1Var2 = fd1Var.G;
                        int O2 = s1Var2.O2(fd1Var.K);
                        dd1 dd1Var = fd1Var.E;
                        CheckBoxBase[] checkBoxBaseArr2 = s1Var2.N8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && dd1Var != null && (checkBoxBaseArr = dd1Var.N8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f26323p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f26323p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f26324q, true);
                        }
                    }
                    org.telegram.ui.Cells.s1 s1Var3 = fd1Var.G;
                    s1Var3.G7 = -1;
                    s1Var3.invalidate();
                }
                org.telegram.ui.pm pmVar = fd1Var.Y;
                if (pmVar != null) {
                    AndroidUtilities.runOnUIThread(pmVar);
                    fd1Var.Y = null;
                    return;
                }
                return;
            default:
                ((qh.o0) obj).f(z10, false);
                return;
        }
    }
}
