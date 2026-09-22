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
import org.telegram.ui.je1;
import org.telegram.ui.le1;
public final class sr0 implements Runnable {
    public final int f27958a;
    public final boolean f27959b;
    public final Object f27960c;

    public sr0(int i10, Object obj, boolean z10) {
        this.f27958a = i10;
        this.f27960c = obj;
        this.f27959b = z10;
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
        int i12 = this.f27958a;
        wh.e eVar = null;
        int i13 = 0;
        boolean z11 = this.f27959b;
        Object obj = this.f27960c;
        switch (i12) {
            case 0:
                tr0 tr0Var = (tr0) obj;
                if (!z11) {
                    tr0Var.H.f30376q0.setVisibility(0);
                    return;
                } else {
                    tr0Var.getClass();
                    return;
                }
            case 1:
                pv0 pv0Var = (pv0) obj;
                ArrayList arrayList = pv0Var.f27176r;
                ov0 ov0Var = pv0Var.f27171n;
                if (ov0Var != null) {
                    ov0Var.H(pv0Var.f27163f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((ov0) arrayList.get(i13)).H(pv0Var.f27163f, z11);
                    i13++;
                }
                return;
            case 2:
                qv0 qv0Var = (qv0) obj;
                ArrayList arrayList2 = qv0Var.f27176r;
                ov0 ov0Var2 = qv0Var.f27171n;
                if (ov0Var2 != null) {
                    ov0Var2.H(qv0Var.f27457y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((ov0) arrayList2.get(i13)).H(qv0Var.f27457y0, z11);
                    i13++;
                }
                return;
            case 3:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 4:
                ((w51) obj).P(z11);
                return;
            case 5:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.Z(c00Var.P, z11);
                return;
            case 6:
                org.telegram.ui.wg0 wg0Var = (org.telegram.ui.wg0) obj;
                if (!z11) {
                    wg0Var.W.setVisibility(8);
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
                Activity parentActivity = ((org.telegram.ui.a11) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                nf.f.s(parentActivity, LocaleController.getString(i10));
                return;
            case 10:
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) obj;
                org.telegram.ui.f31 f31Var = e31Var.S;
                kp kpVar = e31Var.f33157b;
                if (kpVar != null && kpVar.d != null) {
                    e31Var.a(z11, true);
                    if (e31Var.K != null) {
                        e31Var.Q = true;
                        f31Var.K = z11;
                        f31Var.d0(f31Var.O, f31Var.J, false);
                    }
                    if (kpVar.d != null) {
                        while (i13 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i13)).f25999c = z11 ? 1 : 0;
                            ((lp) kpVar.d.get(i13)).e = f31Var.b0(((lp) kpVar.d.get(i13)).f25997a, z11);
                            i13++;
                        }
                        f31Var.f33479r = null;
                        kpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                le1 le1Var = (le1) obj;
                AndroidUtilities.runOnUIThread(new ce1(le1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = le1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.t1 t1Var2 = le1Var.K;
                        int O2 = t1Var2.O2(le1Var.O);
                        je1 je1Var = le1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && je1Var != null && (checkBoxBaseArr = je1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f21968p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f21968p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f21969q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = le1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.ym ymVar = le1Var.f35453c0;
                if (ymVar != null) {
                    AndroidUtilities.runOnUIThread(ymVar);
                    le1Var.f35453c0 = null;
                    return;
                }
                return;
            case 12:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.f45109c;
                boolean isEmpty = TextUtils.isEmpty(nVar.f45123t);
                String str = nVar.f45123t;
                nVar.f45125w = true;
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
                nVar.v = nVar.f45112i.getImporters(nVar.f45113j, str, tL_chatInviteImporter, nVar.d, new wh.f(nVar, isEmpty, eVar2, str, z10));
                return;
            case 13:
                yh.s0 s0Var = (yh.s0) obj;
                if (!z11) {
                    s0Var.f47709q0.setVisibility(8);
                    return;
                } else {
                    s0Var.getClass();
                    return;
                }
            case 14:
                yh.z3 z3Var = (yh.z3) obj;
                z3Var.getClass();
                if (z11) {
                    i11 = R.string.Gift2ActionWearDone;
                } else {
                    i11 = R.string.Gift2ActionWearOffDone;
                }
                z3Var.o2(z3Var.f48016c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, z3Var.C1())), true);
                return;
            case 15:
                yh.z3 z3Var2 = ((yh.i2) obj).T;
                TL_stars.SavedStarGift H1 = z3Var2.H1(z11);
                if (H1 != null) {
                    z3Var2.f48014b1 = true;
                    z3Var2.j2(H1, z3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = z3Var2.I1(z11);
                    if (I1 != null) {
                        z3Var2.f48014b1 = true;
                        z3Var2.h2(I1.slug, I1, z3Var2.D0);
                    }
                }
                z3Var2.R0 = -1;
                oc ocVar = oc.f26744w;
                if (ocVar != null) {
                    ocVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.n nVar2 = (zg.n) obj;
                if (z11) {
                    ((zg.q) nVar2.f49084x.f47842c).f49129w.setVisibility(4);
                    return;
                } else {
                    nVar2.getClass();
                    return;
                }
        }
    }
}
