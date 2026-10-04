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
import org.telegram.ui.ee1;
import org.telegram.ui.ge1;
import org.telegram.ui.xd1;
public final class es0 implements Runnable {
    public final int f26127a;
    public final boolean f26128b;
    public final Object f26129c;

    public es0(int i10, Object obj, boolean z10) {
        this.f26127a = i10;
        this.f26129c = obj;
        this.f26128b = z10;
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
        int i12 = this.f26127a;
        wh.e eVar = null;
        int i13 = 0;
        boolean z11 = this.f26128b;
        Object obj = this.f26129c;
        switch (i12) {
            case 0:
                fs0 fs0Var = (fs0) obj;
                if (!z11) {
                    fs0Var.U.f29793q0.setVisibility(0);
                    return;
                } else {
                    fs0Var.getClass();
                    return;
                }
            case 1:
                ks0 ks0Var = (ks0) obj;
                if (!z11) {
                    ks0Var.H.f29793q0.setVisibility(0);
                    return;
                } else {
                    ks0Var.getClass();
                    return;
                }
            case 2:
                lw0 lw0Var = (lw0) obj;
                ArrayList arrayList = lw0Var.f28469r;
                kw0 kw0Var = lw0Var.f28464n;
                if (kw0Var != null) {
                    kw0Var.F(lw0Var.f28456f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((kw0) arrayList.get(i13)).F(lw0Var.f28456f, z11);
                    i13++;
                }
                return;
            case 3:
                mw0 mw0Var = (mw0) obj;
                ArrayList arrayList2 = mw0Var.f28469r;
                kw0 kw0Var2 = mw0Var.f28464n;
                if (kw0Var2 != null) {
                    kw0Var2.F(mw0Var.f28746y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((kw0) arrayList2.get(i13)).F(mw0Var.f28746y0, z11);
                    i13++;
                }
                return;
            case 4:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 5:
                ((u61) obj).P(z11);
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
                Activity parentActivity = ((org.telegram.ui.s01) obj).f40323e.getParentActivity();
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
                np npVar = x21Var.f42732b;
                if (npVar != null && npVar.d != null) {
                    x21Var.a(z11, true);
                    if (x21Var.K != null) {
                        x21Var.Q = true;
                        y21Var.K = z11;
                        y21Var.d0(y21Var.O, y21Var.J, false);
                    }
                    if (npVar.d != null) {
                        while (i13 < npVar.d.size()) {
                            ((op) npVar.d.get(i13)).f29430c = z11 ? 1 : 0;
                            ((op) npVar.d.get(i13)).f29431e = y21Var.b0(((op) npVar.d.get(i13)).f29428a, z11);
                            i13++;
                        }
                        y21Var.f43030r = null;
                        npVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ge1 ge1Var = (ge1) obj;
                AndroidUtilities.runOnUIThread(new xd1(ge1Var, 1));
                org.telegram.ui.Cells.u1 u1Var = ge1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.u1 u1Var2 = ge1Var.K;
                        int O2 = u1Var2.O2(ge1Var.O);
                        ee1 ee1Var = ge1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && ee1Var != null && (checkBoxBaseArr = ee1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f24097p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f24097p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f24098q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = ge1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.um umVar = ge1Var.f36615c0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    ge1Var.f36615c0 = null;
                    return;
                }
                return;
            case 13:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.f49145c;
                boolean isEmpty = TextUtils.isEmpty(nVar.f49160t);
                String str = nVar.f49160t;
                nVar.f49162w = true;
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
                nVar.v = nVar.f49149i.getImporters(nVar.f49150j, str, tL_chatInviteImporter, nVar.d, new wh.f(nVar, isEmpty, eVar2, str, z10));
                return;
            case 14:
                yh.s0 s0Var = (yh.s0) obj;
                if (!z11) {
                    s0Var.f51949q0.setVisibility(8);
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
                x3Var.o2(x3Var.f52217c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, x3Var.C1())), true);
                return;
            case 16:
                yh.x3 x3Var2 = ((yh.g2) obj).V;
                TL_stars.SavedStarGift H1 = x3Var2.H1(z11);
                if (H1 != null) {
                    x3Var2.f52215b1 = true;
                    x3Var2.j2(H1, x3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = x3Var2.I1(z11);
                    if (I1 != null) {
                        x3Var2.f52215b1 = true;
                        x3Var2.h2(I1.slug, I1, x3Var2.D0);
                    }
                }
                x3Var2.R0 = -1;
                rc rcVar = rc.f30337w;
                if (rcVar != null) {
                    rcVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.n nVar2 = (zg.n) obj;
                if (z11) {
                    ((zg.q) nVar2.f53479x.f52012c).f53523w.setVisibility(4);
                    return;
                } else {
                    nVar2.getClass();
                    return;
                }
        }
    }
}
