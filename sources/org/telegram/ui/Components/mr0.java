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
public final class mr0 implements Runnable {
    public final int f28530a;
    public final boolean f28531b;
    public final Object f28532c;

    public mr0(int i10, Object obj, boolean z10) {
        this.f28530a = i10;
        this.f28532c = obj;
        this.f28531b = z10;
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
        int i12 = this.f28530a;
        xh.e eVar = null;
        int i13 = 0;
        boolean z11 = this.f28531b;
        Object obj = this.f28532c;
        switch (i12) {
            case 0:
                nr0 nr0Var = (nr0) obj;
                if (!z11) {
                    nr0Var.U.f32740q0.setVisibility(0);
                    return;
                } else {
                    nr0Var.getClass();
                    return;
                }
            case 1:
                sr0 sr0Var = (sr0) obj;
                if (!z11) {
                    sr0Var.H.f32740q0.setVisibility(0);
                    return;
                } else {
                    sr0Var.getClass();
                    return;
                }
            case 2:
                ov0 ov0Var = (ov0) obj;
                ArrayList arrayList = ov0Var.f29246r;
                nv0 nv0Var = ov0Var.f29241n;
                if (nv0Var != null) {
                    nv0Var.H(ov0Var.f29233f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((nv0) arrayList.get(i13)).H(ov0Var.f29233f, z11);
                    i13++;
                }
                return;
            case 3:
                pv0 pv0Var = (pv0) obj;
                ArrayList arrayList2 = pv0Var.f29246r;
                nv0 nv0Var2 = pv0Var.f29241n;
                if (nv0Var2 != null) {
                    nv0Var2.H(pv0Var.f29532y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((nv0) arrayList2.get(i13)).H(pv0Var.f29532y0, z11);
                    i13++;
                }
                return;
            case 4:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 5:
                ((v51) obj).P(z11);
                return;
            case 6:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.Z(c00Var.P, z11);
                return;
            case 7:
                org.telegram.ui.wg0 wg0Var = (org.telegram.ui.wg0) obj;
                if (!z11) {
                    wg0Var.W.setVisibility(8);
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z11) {
                    photoViewer.V0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.getClass();
                return;
            case 9:
                ((ProfileActivity) obj).e5(z11, true);
                return;
            case 10:
                Activity parentActivity = ((org.telegram.ui.a11) obj).f34318e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                of.f.s(parentActivity, LocaleController.getString(i10));
                return;
            case 11:
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) obj;
                org.telegram.ui.g31 g31Var = f31Var.S;
                jp jpVar = f31Var.f36278b;
                if (jpVar != null && jpVar.d != null) {
                    f31Var.a(z11, true);
                    if (f31Var.K != null) {
                        f31Var.Q = true;
                        g31Var.K = z11;
                        g31Var.d0(g31Var.O, g31Var.J, false);
                    }
                    if (jpVar.d != null) {
                        while (i13 < jpVar.d.size()) {
                            ((kp) jpVar.d.get(i13)).f27911c = z11 ? 1 : 0;
                            ((kp) jpVar.d.get(i13)).f27912e = g31Var.b0(((kp) jpVar.d.get(i13)).f27909a, z11);
                            i13++;
                        }
                        g31Var.f36571r = null;
                        jpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 12:
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
                            ObjectAnimator objectAnimator = checkBoxBase.f23933p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f23933p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f23934q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = le1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.zm zmVar = le1Var.f38347c0;
                if (zmVar != null) {
                    AndroidUtilities.runOnUIThread(zmVar);
                    le1Var.f38347c0 = null;
                    return;
                }
                return;
            case 13:
                xh.n nVar = (xh.n) obj;
                ArrayList arrayList3 = nVar.f49473c;
                boolean isEmpty = TextUtils.isEmpty(nVar.f49488t);
                String str = nVar.f49488t;
                nVar.f49490w = true;
                nVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) i2.g.h(1, arrayList3);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z11) {
                    eVar = new xh.e(nVar, 1);
                }
                xh.e eVar2 = eVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                }
                nVar.v = nVar.f49477i.getImporters(nVar.f49478j, str, tL_chatInviteImporter, nVar.d, new xh.f(nVar, isEmpty, eVar2, str, z10));
                return;
            case 14:
                zh.s0 s0Var = (zh.s0) obj;
                if (!z11) {
                    s0Var.f52576q0.setVisibility(8);
                    return;
                } else {
                    s0Var.getClass();
                    return;
                }
            case 15:
                zh.w3 w3Var = (zh.w3) obj;
                w3Var.getClass();
                if (z11) {
                    i11 = R.string.Gift2ActionWearDone;
                } else {
                    i11 = R.string.Gift2ActionWearOffDone;
                }
                w3Var.o2(w3Var.f52791c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, w3Var.C1())), true);
                return;
            default:
                zh.w3 w3Var2 = ((zh.g2) obj).T;
                TL_stars.SavedStarGift H1 = w3Var2.H1(z11);
                if (H1 != null) {
                    w3Var2.f52789b1 = true;
                    w3Var2.j2(H1, w3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = w3Var2.I1(z11);
                    if (I1 != null) {
                        w3Var2.f52789b1 = true;
                        w3Var2.h2(I1.slug, I1, w3Var2.D0);
                    }
                }
                w3Var2.R0 = -1;
                qc qcVar = qc.f29698w;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    return;
                }
                return;
        }
    }
}
