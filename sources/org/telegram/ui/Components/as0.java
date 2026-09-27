package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ce1;
import org.telegram.ui.ee1;
import org.telegram.ui.vd1;
public final class as0 implements Runnable {
    public final int f22751a;
    public final boolean f22752b;
    public final Object f22753c;

    public as0(int i10, Object obj, boolean z10) {
        this.f22751a = i10;
        this.f22753c = obj;
        this.f22752b = z10;
    }

    @Override
    public final void run() {
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z10;
        int i11;
        int i12 = this.f22751a;
        wh.e eVar = null;
        int i13 = 0;
        boolean z11 = this.f22752b;
        Object obj = this.f22753c;
        switch (i12) {
            case 0:
                bs0 bs0Var = (bs0) obj;
                if (!z11) {
                    bs0Var.U.f26199q0.setVisibility(0);
                    return;
                } else {
                    bs0Var.getClass();
                    return;
                }
            case 1:
                gs0 gs0Var = (gs0) obj;
                if (!z11) {
                    gs0Var.H.f26199q0.setVisibility(0);
                    return;
                } else {
                    gs0Var.getClass();
                    return;
                }
            case 2:
                cw0 cw0Var = (cw0) obj;
                ArrayList arrayList = cw0Var.f23446r;
                bw0 bw0Var = cw0Var.f23441n;
                if (bw0Var != null) {
                    bw0Var.H(cw0Var.f23433f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((bw0) arrayList.get(i13)).H(cw0Var.f23433f, z11);
                    i13++;
                }
                return;
            case 3:
                dw0 dw0Var = (dw0) obj;
                ArrayList arrayList2 = dw0Var.f23446r;
                bw0 bw0Var2 = dw0Var.f23441n;
                if (bw0Var2 != null) {
                    bw0Var2.H(dw0Var.f23749y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((bw0) arrayList2.get(i13)).H(dw0Var.f23749y0, z11);
                    i13++;
                }
                return;
            case 4:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 5:
                ((l61) obj).P(z11);
                return;
            case 6:
                org.telegram.ui.b00 b00Var = (org.telegram.ui.b00) obj;
                b00Var.Z(b00Var.P, z11);
                return;
            case 7:
                org.telegram.ui.tg0 tg0Var = (org.telegram.ui.tg0) obj;
                if (!z11) {
                    tg0Var.W.setVisibility(8);
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z11) {
                    photoViewer.V0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                return;
            case 9:
                ((ProfileActivity) obj).e5(z11, true);
                return;
            case 10:
                Activity parentActivity = ((org.telegram.ui.s01) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                nf.f.s(parentActivity, LocaleController.getString(i10));
                return;
            case 11:
                org.telegram.ui.x21 x21Var = (org.telegram.ui.x21) obj;
                org.telegram.ui.y21 y21Var = x21Var.S;
                mp mpVar = x21Var.f39502b;
                if (mpVar != null && mpVar.d != null) {
                    x21Var.a(z11, true);
                    if (x21Var.K != null) {
                        x21Var.Q = true;
                        y21Var.K = z11;
                        y21Var.d0(y21Var.O, y21Var.J, false);
                    }
                    if (mpVar.d != null) {
                        while (i13 < mpVar.d.size()) {
                            ((np) mpVar.d.get(i13)).f26879c = z11 ? 1 : 0;
                            ((np) mpVar.d.get(i13)).e = y21Var.b0(((np) mpVar.d.get(i13)).f26877a, z11);
                            i13++;
                        }
                        y21Var.f40117r = null;
                        mpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ee1 ee1Var = (ee1) obj;
                AndroidUtilities.runOnUIThread(new vd1(ee1Var, 1));
                org.telegram.ui.Cells.u1 u1Var = ee1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.u1 u1Var2 = ee1Var.K;
                        int O2 = u1Var2.O2(ee1Var.O);
                        ce1 ce1Var = ee1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && ce1Var != null && (checkBoxBaseArr = ce1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f22196p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f22196p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f22197q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = ee1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.um umVar = ee1Var.f33236c0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    ee1Var.f33236c0 = null;
                    return;
                }
                return;
            case 13:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.f45437c;
                boolean isEmpty = TextUtils.isEmpty(nVar.f45451t);
                String str = nVar.f45451t;
                nVar.f45453w = true;
                nVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) hg.k0.g(1, arrayList3);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z11) {
                    eVar = new wh.e(nVar, 1);
                }
                wh.e eVar2 = eVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                }
                nVar.v = nVar.f45440i.getImporters(nVar.f45441j, str, tL_chatInviteImporter, nVar.d, new wh.f(nVar, isEmpty, eVar2, str, z10));
                return;
            case 14:
                yh.s0 s0Var = (yh.s0) obj;
                if (!z11) {
                    s0Var.f48036q0.setVisibility(8);
                    return;
                } else {
                    s0Var.getClass();
                    return;
                }
            case 15:
                yh.x3 x3Var = (yh.x3) obj;
                x3Var.getClass();
                if (z11) {
                    i11 = R.string.Gift2ActionWearDone;
                } else {
                    i11 = R.string.Gift2ActionWearOffDone;
                }
                x3Var.o2(x3Var.f48282c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, x3Var.C1())), true);
                return;
            case 16:
                yh.x3 x3Var2 = ((yh.g2) obj).U;
                TL_stars.SavedStarGift H1 = x3Var2.H1(z11);
                if (H1 != null) {
                    x3Var2.f48280b1 = true;
                    x3Var2.j2(H1, x3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = x3Var2.I1(z11);
                    if (I1 != null) {
                        x3Var2.f48280b1 = true;
                        x3Var2.h2(I1.slug, I1, x3Var2.D0);
                    }
                }
                x3Var2.R0 = -1;
                qc qcVar = qc.f27684w;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.o oVar = (zg.o) obj;
                if (z11) {
                    ((zg.r) oVar.f49439x.f48102c).f49480w.setVisibility(4);
                    return;
                } else {
                    oVar.getClass();
                    return;
                }
        }
    }
}
