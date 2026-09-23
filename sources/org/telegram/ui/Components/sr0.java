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
import org.telegram.ui.be1;
import org.telegram.ui.de1;
import org.telegram.ui.ud1;
public final class sr0 implements Runnable {
    public final int f27974a;
    public final boolean f27975b;
    public final Object f27976c;

    public sr0(int i10, Object obj, boolean z10) {
        this.f27974a = i10;
        this.f27976c = obj;
        this.f27975b = z10;
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
        int i12 = this.f27974a;
        wh.e eVar = null;
        int i13 = 0;
        boolean z11 = this.f27975b;
        Object obj = this.f27976c;
        switch (i12) {
            case 0:
                tr0 tr0Var = (tr0) obj;
                if (!z11) {
                    tr0Var.H.f30437q0.setVisibility(0);
                    return;
                } else {
                    tr0Var.getClass();
                    return;
                }
            case 1:
                pv0 pv0Var = (pv0) obj;
                ArrayList arrayList = pv0Var.f27163r;
                ov0 ov0Var = pv0Var.f27158n;
                if (ov0Var != null) {
                    ov0Var.H(pv0Var.f27150f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((ov0) arrayList.get(i13)).H(pv0Var.f27150f, z11);
                    i13++;
                }
                return;
            case 2:
                qv0 qv0Var = (qv0) obj;
                ArrayList arrayList2 = qv0Var.f27163r;
                ov0 ov0Var2 = qv0Var.f27158n;
                if (ov0Var2 != null) {
                    ov0Var2.H(qv0Var.f27469y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((ov0) arrayList2.get(i13)).H(qv0Var.f27469y0, z11);
                    i13++;
                }
                return;
            case 3:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 4:
                ((v51) obj).P(z11);
                return;
            case 5:
                org.telegram.ui.zz zzVar = (org.telegram.ui.zz) obj;
                zzVar.Z(zzVar.P, z11);
                return;
            case 6:
                org.telegram.ui.rg0 rg0Var = (org.telegram.ui.rg0) obj;
                if (!z11) {
                    rg0Var.W.setVisibility(8);
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z11) {
                    photoViewer.V0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                return;
            case 8:
                ((ProfileActivity) obj).e5(z11, true);
                return;
            case 9:
                Activity parentActivity = ((org.telegram.ui.s01) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                nf.f.s(parentActivity, LocaleController.getString(i10));
                return;
            case 10:
                org.telegram.ui.w21 w21Var = (org.telegram.ui.w21) obj;
                org.telegram.ui.x21 x21Var = w21Var.S;
                lp lpVar = w21Var.f38516b;
                if (lpVar != null && lpVar.d != null) {
                    w21Var.a(z11, true);
                    if (w21Var.K != null) {
                        w21Var.Q = true;
                        x21Var.K = z11;
                        x21Var.d0(x21Var.O, x21Var.J, false);
                    }
                    if (lpVar.d != null) {
                        while (i13 < lpVar.d.size()) {
                            ((mp) lpVar.d.get(i13)).f26255c = z11 ? 1 : 0;
                            ((mp) lpVar.d.get(i13)).e = x21Var.b0(((mp) lpVar.d.get(i13)).f26253a, z11);
                            i13++;
                        }
                        x21Var.f39174r = null;
                        lpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                de1 de1Var = (de1) obj;
                AndroidUtilities.runOnUIThread(new ud1(de1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = de1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.t1 t1Var2 = de1Var.K;
                        int O2 = t1Var2.O2(de1Var.O);
                        be1 be1Var = de1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && be1Var != null && (checkBoxBaseArr = be1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f21942p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f21942p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f21943q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = de1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.um umVar = de1Var.f32626c0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    de1Var.f32626c0 = null;
                    return;
                }
                return;
            case 12:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.f45063c;
                boolean isEmpty = TextUtils.isEmpty(nVar.f45077t);
                String str = nVar.f45077t;
                nVar.f45079w = true;
                nVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) hg.c.h(1, arrayList3);
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
                nVar.v = nVar.f45066i.getImporters(nVar.f45067j, str, tL_chatInviteImporter, nVar.d, new wh.f(nVar, isEmpty, eVar2, str, z10));
                return;
            case 13:
                yh.s0 s0Var = (yh.s0) obj;
                if (!z11) {
                    s0Var.f47669q0.setVisibility(8);
                    return;
                } else {
                    s0Var.getClass();
                    return;
                }
            case 14:
                yh.y3 y3Var = (yh.y3) obj;
                y3Var.getClass();
                if (z11) {
                    i11 = R.string.Gift2ActionWearDone;
                } else {
                    i11 = R.string.Gift2ActionWearOffDone;
                }
                y3Var.o2(y3Var.f47951c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, y3Var.C1())), true);
                return;
            case 15:
                yh.y3 y3Var2 = ((yh.h2) obj).T;
                TL_stars.SavedStarGift H1 = y3Var2.H1(z11);
                if (H1 != null) {
                    y3Var2.f47949b1 = true;
                    y3Var2.j2(H1, y3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = y3Var2.I1(z11);
                    if (I1 != null) {
                        y3Var2.f47949b1 = true;
                        y3Var2.h2(I1.slug, I1, y3Var2.D0);
                    }
                }
                y3Var2.R0 = -1;
                qc qcVar = qc.f27299w;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.n nVar2 = (zg.n) obj;
                if (z11) {
                    ((zg.q) nVar2.f49035x.f47774c).f49080w.setVisibility(4);
                    return;
                } else {
                    nVar2.getClass();
                    return;
                }
        }
    }
}
