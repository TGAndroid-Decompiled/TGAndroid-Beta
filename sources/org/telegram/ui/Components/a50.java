package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.app.Activity;
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
public final class a50 implements Runnable {
    public final int f26665a;
    public final boolean f26666b;
    public final Object f26667c;

    public a50(int i9, Object obj, boolean z10) {
        this.f26665a = i9;
        this.f26667c = obj;
        this.f26666b = z10;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        int i9;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i10 = this.f26665a;
        int i11 = 0;
        boolean z10 = this.f26666b;
        Object obj = this.f26667c;
        switch (i10) {
            case 0:
                f50 f50Var = ((e50) obj).D0;
                if (!f50Var.f28277c0) {
                    try {
                        f50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(f50Var.f28276c.getParentActivity());
                    if (z10) {
                        j10 = f50Var.f28275b0;
                    } else {
                        j10 = 0;
                    }
                    f50Var.W = j10;
                    f50Var.V = System.currentTimeMillis();
                    f50Var.f28273a0 = true;
                    f50Var.r();
                    f50Var.invalidate();
                    NotificationCenter.getInstance(f50Var.f28272a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(f50Var.M), Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                k90 k90Var = (k90) obj;
                if (z10) {
                    k90Var.C.setVisibility(8);
                    return;
                } else {
                    k90Var.getClass();
                    return;
                }
            case 2:
                org.telegram.ui.ActionBar.o2 o2Var = ((gm0) obj).C;
                if (z10) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                o2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 3:
                eu0 eu0Var = (eu0) obj;
                if (!z10) {
                    eu0Var.f28141i0.setVisibility(8);
                    return;
                } else {
                    eu0Var.getClass();
                    return;
                }
            case 4:
                vq0 vq0Var = (vq0) obj;
                if (!z10) {
                    vq0Var.Q.m0.setVisibility(0);
                    return;
                } else {
                    vq0Var.getClass();
                    return;
                }
            case 5:
                zq0 zq0Var = (zq0) obj;
                if (!z10) {
                    zq0Var.D.m0.setVisibility(0);
                    return;
                } else {
                    zq0Var.getClass();
                    return;
                }
            case 6:
                xu0 xu0Var = (xu0) obj;
                ArrayList arrayList = xu0Var.f34792r;
                wu0 wu0Var = xu0Var.f34788n;
                if (wu0Var != null) {
                    wu0Var.G(xu0Var.f34780f, z10);
                }
                while (i11 < arrayList.size()) {
                    ((wu0) arrayList.get(i11)).G(xu0Var.f34780f, z10);
                    i11++;
                }
                return;
            case 7:
                yu0 yu0Var = (yu0) obj;
                ArrayList arrayList2 = yu0Var.f34792r;
                wu0 wu0Var2 = yu0Var.f34788n;
                if (wu0Var2 != null) {
                    wu0Var2.G(yu0Var.f35081u0, z10);
                }
                while (i11 < arrayList2.size()) {
                    ((wu0) arrayList2.get(i11)).G(yu0Var.f35081u0, z10);
                    i11++;
                }
                return;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z10));
                return;
            case 9:
                ((z41) obj).P(z10);
                return;
            case 10:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) obj;
                lzVar.Y(lzVar.L, z10);
                return;
            case 11:
                org.telegram.ui.fg0 fg0Var = (org.telegram.ui.fg0) obj;
                if (!z10) {
                    fg0Var.S.setVisibility(8);
                    return;
                }
                return;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.R0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                return;
            case 13:
                ((ProfileActivity) obj).e5(z10, true);
                return;
            case 14:
                Activity parentActivity = ((org.telegram.ui.vz0) obj).f43616e.getParentActivity();
                if (z10) {
                    i9 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i9 = R.string.ProfileBotOpenAppInfoLink;
                }
                ve.e.s(parentActivity, LocaleController.getString(i9));
                return;
            case 15:
                org.telegram.ui.y11 y11Var = (org.telegram.ui.y11) obj;
                org.telegram.ui.z11 z11Var = y11Var.O;
                ap apVar = y11Var.f44675b;
                if (apVar != null && apVar.d != null) {
                    y11Var.a(z10, true);
                    if (y11Var.G != null) {
                        y11Var.M = true;
                        z11Var.G = z10;
                        z11Var.c0(z11Var.K, z11Var.F, false);
                    }
                    if (apVar.d != null) {
                        while (i11 < apVar.d.size()) {
                            ((bp) apVar.d.get(i11)).f27263c = z10 ? 1 : 0;
                            ((bp) apVar.d.get(i11)).f27264e = z11Var.a0(((bp) apVar.d.get(i11)).f27261a, z10);
                            i11++;
                        }
                        z11Var.f45006r = null;
                        apVar.l();
                        return;
                    }
                    return;
                }
                return;
            default:
                dd1 dd1Var = (dd1) obj;
                AndroidUtilities.runOnUIThread(new uc1(dd1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = dd1Var.G;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.t1 t1Var2 = dd1Var.G;
                        int O2 = t1Var2.O2(dd1Var.K);
                        bd1 bd1Var = dd1Var.E;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.N8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && bd1Var != null && (checkBoxBaseArr = bd1Var.N8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f26312p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f26312p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f26313q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = dd1Var.G;
                    t1Var3.G7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.nm nmVar = dd1Var.Y;
                if (nmVar != null) {
                    AndroidUtilities.runOnUIThread(nmVar);
                    dd1Var.Y = null;
                    return;
                }
                return;
        }
    }
}
