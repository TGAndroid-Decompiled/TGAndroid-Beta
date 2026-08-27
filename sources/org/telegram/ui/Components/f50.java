package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd1;
import org.telegram.ui.dd1;
import org.telegram.ui.uc1;

public final class f50 implements Runnable {

    public final int f28258a;

    public final boolean f28259b;

    public final Object f28260c;

    public f50(int i10, Object obj, boolean z10) {
        this.f28258a = i10;
        this.f28260c = obj;
        this.f28259b = z10;
    }

    @Override
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i10 = this.f28258a;
        int i11 = 0;
        int i12 = 1;
        boolean z10 = this.f28259b;
        Object obj = this.f28260c;
        switch (i10) {
            case 0:
                k50 k50Var = ((j50) obj).D0;
                if (!k50Var.f29972c0) {
                    try {
                        k50Var.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(k50Var.f29971c.getParentActivity());
                    k50Var.W = z10 ? k50Var.f29970b0 : 0L;
                    k50Var.V = System.currentTimeMillis();
                    k50Var.f29968a0 = true;
                    k50Var.r();
                    k50Var.invalidate();
                    NotificationCenter.getInstance(k50Var.f29967a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(k50Var.M), Boolean.FALSE);
                    break;
                }
                break;
            case 1:
                o90 o90Var = (o90) obj;
                if (!z10) {
                    o90Var.getClass();
                } else {
                    o90Var.C.setVisibility(8);
                }
                break;
            case 2:
                ((jm0) obj).C.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 3:
                hu0 hu0Var = (hu0) obj;
                if (!z10) {
                    hu0Var.f29126i0.setVisibility(8);
                } else {
                    hu0Var.getClass();
                }
                break;
            case 4:
                wq0 wq0Var = (wq0) obj;
                if (!z10) {
                    wq0Var.Q.m0.setVisibility(0);
                } else {
                    wq0Var.getClass();
                }
                break;
            case 5:
                ar0 ar0Var = (ar0) obj;
                if (!z10) {
                    ar0Var.D.m0.setVisibility(0);
                } else {
                    ar0Var.getClass();
                }
                break;
            case 6:
                zu0 zu0Var = (zu0) obj;
                ArrayList arrayList = zu0Var.f35387r;
                yu0 yu0Var = zu0Var.f35383n;
                if (yu0Var != null) {
                    yu0Var.H(zu0Var.f35375f, z10);
                }
                while (i11 < arrayList.size()) {
                    ((yu0) arrayList.get(i11)).H(zu0Var.f35375f, z10);
                    i11++;
                }
                break;
            case 7:
                av0 av0Var = (av0) obj;
                ArrayList arrayList2 = av0Var.f35387r;
                yu0 yu0Var2 = av0Var.f35383n;
                if (yu0Var2 != null) {
                    yu0Var2.H(av0Var.f26830u0, z10);
                }
                while (i11 < arrayList2.size()) {
                    ((yu0) arrayList2.get(i11)).H(av0Var.f26830u0, z10);
                    i11++;
                }
                break;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                break;
            case 9:
                ((b51) obj).P(z10);
                break;
            case 10:
                org.telegram.ui.oz ozVar = (org.telegram.ui.oz) obj;
                ozVar.Z(ozVar.L, z10);
                break;
            case 11:
                org.telegram.ui.ig0 ig0Var = (org.telegram.ui.ig0) obj;
                if (!z10) {
                    ig0Var.S.setVisibility(8);
                }
                break;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.R0.setVisibility(8);
                } else {
                    Drawable[] drawableArr = PhotoViewer.P8;
                    photoViewer.getClass();
                }
                break;
            case 13:
                ((ProfileActivity) obj).e5(z10, true);
                break;
            case 14:
                we.e.s(((org.telegram.ui.vz0) obj).f43554e.getParentActivity(), LocaleController.getString(z10 ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
                break;
            case 15:
                org.telegram.ui.x11 x11Var = (org.telegram.ui.x11) obj;
                org.telegram.ui.y11 y11Var = x11Var.O;
                yo yoVar = x11Var.f44248b;
                if (yoVar != null && yoVar.d != null) {
                    x11Var.a(z10, true);
                    if (x11Var.G != null) {
                        x11Var.M = true;
                        y11Var.G = z10;
                        y11Var.d0(y11Var.K, y11Var.F, false);
                    }
                    if (yoVar.d != null) {
                        while (i11 < yoVar.d.size()) {
                            ((zo) yoVar.d.get(i11)).f35318c = z10 ? 1 : 0;
                            ((zo) yoVar.d.get(i11)).f35319e = y11Var.b0(((zo) yoVar.d.get(i11)).f35316a, z10);
                            i11++;
                        }
                        y11Var.f44672r = null;
                        yoVar.l();
                    }
                    break;
                }
                break;
            default:
                dd1 dd1Var = (dd1) obj;
                AndroidUtilities.runOnUIThread(new uc1(dd1Var, i12));
                org.telegram.ui.Cells.s1 s1Var = dd1Var.G;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.s1 s1Var2 = dd1Var.G;
                        int iN2 = s1Var2.N2(dd1Var.K);
                        bd1 bd1Var = dd1Var.E;
                        CheckBoxBase[] checkBoxBaseArr2 = s1Var2.N8;
                        if (checkBoxBaseArr2 != null && iN2 >= 0 && iN2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[iN2]) != null && bd1Var != null && (checkBoxBaseArr = bd1Var.N8) != null && iN2 >= 0 && iN2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[iN2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f26308p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f26308p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f26309q, true);
                        }
                    }
                    org.telegram.ui.Cells.s1 s1Var3 = dd1Var.G;
                    s1Var3.G7 = -1;
                    s1Var3.invalidate();
                }
                org.telegram.ui.om omVar = dd1Var.Y;
                if (omVar != null) {
                    AndroidUtilities.runOnUIThread(omVar);
                    dd1Var.Y = null;
                }
                break;
        }
    }
}
