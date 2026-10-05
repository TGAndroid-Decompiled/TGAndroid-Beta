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
public final class fs0 implements Runnable {
    public final int f26579a;
    public final boolean f26580b;
    public final Object f26581c;

    public fs0(int i10, Object obj, boolean z10) {
        this.f26579a = i10;
        this.f26581c = obj;
        this.f26580b = z10;
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
        int i12 = this.f26579a;
        wh.e eVar = null;
        int i13 = 0;
        boolean z11 = this.f26580b;
        Object obj = this.f26581c;
        switch (i12) {
            case 0:
                gs0 gs0Var = (gs0) obj;
                if (!z11) {
                    gs0Var.U.f30250q0.setVisibility(0);
                    return;
                } else {
                    gs0Var.getClass();
                    return;
                }
            case 1:
                ls0 ls0Var = (ls0) obj;
                if (!z11) {
                    ls0Var.H.f30250q0.setVisibility(0);
                    return;
                } else {
                    ls0Var.getClass();
                    return;
                }
            case 2:
                mw0 mw0Var = (mw0) obj;
                ArrayList arrayList = mw0Var.f28850r;
                lw0 lw0Var = mw0Var.f28845n;
                if (lw0Var != null) {
                    lw0Var.F(mw0Var.f28837f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((lw0) arrayList.get(i13)).F(mw0Var.f28837f, z11);
                    i13++;
                }
                return;
            case 3:
                nw0 nw0Var = (nw0) obj;
                ArrayList arrayList2 = nw0Var.f28850r;
                lw0 lw0Var2 = nw0Var.f28845n;
                if (lw0Var2 != null) {
                    lw0Var2.F(nw0Var.f29164y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((lw0) arrayList2.get(i13)).F(nw0Var.f29164y0, z11);
                    i13++;
                }
                return;
            case 4:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 5:
                ((w61) obj).P(z11);
                return;
            case 6:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.Y(c00Var.P, z11);
                return;
            case 7:
                org.telegram.ui.ug0 ug0Var = (org.telegram.ui.ug0) obj;
                if (!z11) {
                    ug0Var.W.setVisibility(8);
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
                Activity parentActivity = ((org.telegram.ui.s01) obj).f40298e.getParentActivity();
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
                np npVar = x21Var.f42799b;
                if (npVar != null && npVar.d != null) {
                    x21Var.a(z11, true);
                    if (x21Var.K != null) {
                        x21Var.Q = true;
                        y21Var.K = z11;
                        y21Var.d0(y21Var.O, y21Var.J, false);
                    }
                    if (npVar.d != null) {
                        while (i13 < npVar.d.size()) {
                            ((op) npVar.d.get(i13)).f29530c = z11 ? 1 : 0;
                            ((op) npVar.d.get(i13)).f29531e = y21Var.b0(((op) npVar.d.get(i13)).f29528a, z11);
                            i13++;
                        }
                        y21Var.f43092r = null;
                        npVar.l();
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
                            ObjectAnimator objectAnimator = checkBoxBase.f24100p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f24100p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f24101q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = ee1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.um umVar = ee1Var.f36029c0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    ee1Var.f36029c0 = null;
                    return;
                }
                return;
            case 13:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.f49152c;
                boolean isEmpty = TextUtils.isEmpty(nVar.f49167t);
                String str = nVar.f49167t;
                nVar.f49169w = true;
                nVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) hg.c.g(1, arrayList3);
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
                nVar.v = nVar.f49156i.getImporters(nVar.f49157j, str, tL_chatInviteImporter, nVar.d, new wh.f(nVar, isEmpty, eVar2, str, z10));
                return;
            case 14:
                yh.t0 t0Var = (yh.t0) obj;
                if (!z11) {
                    t0Var.f52001q0.setVisibility(8);
                    return;
                } else {
                    t0Var.getClass();
                    return;
                }
            case 15:
                yh.y3 y3Var = (yh.y3) obj;
                y3Var.getClass();
                if (z11) {
                    i11 = R.string.Gift2ActionWearDone;
                } else {
                    i11 = R.string.Gift2ActionWearOffDone;
                }
                y3Var.o2(y3Var.f52285c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, y3Var.C1())), true);
                return;
            case 16:
                yh.y3 y3Var2 = ((yh.h2) obj).V;
                TL_stars.SavedStarGift H1 = y3Var2.H1(z11);
                if (H1 != null) {
                    y3Var2.f52283b1 = true;
                    y3Var2.j2(H1, y3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = y3Var2.I1(z11);
                    if (I1 != null) {
                        y3Var2.f52283b1 = true;
                        y3Var2.h2(I1.slug, I1, y3Var2.D0);
                    }
                }
                y3Var2.R0 = -1;
                rc rcVar = rc.f30419w;
                if (rcVar != null) {
                    rcVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.k kVar = (zg.k) obj;
                if (z11) {
                    ((zg.o) kVar.f53433x.f52081c).v.setVisibility(4);
                    return;
                } else {
                    kVar.getClass();
                    return;
                }
        }
    }
}
