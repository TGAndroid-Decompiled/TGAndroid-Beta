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
public final class zr0 implements Runnable {
    public final int f30951a;
    public final boolean f30952b;
    public final Object f30953c;

    public zr0(int i10, Object obj, boolean z10) {
        this.f30951a = i10;
        this.f30953c = obj;
        this.f30952b = z10;
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
        int i12 = this.f30951a;
        wh.e eVar = null;
        int i13 = 0;
        boolean z11 = this.f30952b;
        Object obj = this.f30953c;
        switch (i12) {
            case 0:
                as0 as0Var = (as0) obj;
                if (!z11) {
                    as0Var.U.f25853q0.setVisibility(0);
                    return;
                } else {
                    as0Var.getClass();
                    return;
                }
            case 1:
                fs0 fs0Var = (fs0) obj;
                if (!z11) {
                    fs0Var.H.f25853q0.setVisibility(0);
                    return;
                } else {
                    fs0Var.getClass();
                    return;
                }
            case 2:
                bw0 bw0Var = (bw0) obj;
                ArrayList arrayList = bw0Var.f23140r;
                aw0 aw0Var = bw0Var.f23135n;
                if (aw0Var != null) {
                    aw0Var.H(bw0Var.f23127f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((aw0) arrayList.get(i13)).H(bw0Var.f23127f, z11);
                    i13++;
                }
                return;
            case 3:
                cw0 cw0Var = (cw0) obj;
                ArrayList arrayList2 = cw0Var.f23140r;
                aw0 aw0Var2 = cw0Var.f23135n;
                if (aw0Var2 != null) {
                    aw0Var2.H(cw0Var.f23423y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((aw0) arrayList2.get(i13)).H(cw0Var.f23423y0, z11);
                    i13++;
                }
                return;
            case 4:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 5:
                ((k61) obj).P(z11);
                return;
            case 6:
                org.telegram.ui.yz yzVar = (org.telegram.ui.yz) obj;
                yzVar.Z(yzVar.P, z11);
                return;
            case 7:
                org.telegram.ui.qg0 qg0Var = (org.telegram.ui.qg0) obj;
                if (!z11) {
                    qg0Var.W.setVisibility(8);
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
                Activity parentActivity = ((org.telegram.ui.q01) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                nf.f.s(parentActivity, LocaleController.getString(i10));
                return;
            case 11:
                org.telegram.ui.v21 v21Var = (org.telegram.ui.v21) obj;
                org.telegram.ui.w21 w21Var = v21Var.S;
                mp mpVar = v21Var.f38608b;
                if (mpVar != null && mpVar.d != null) {
                    v21Var.a(z11, true);
                    if (v21Var.K != null) {
                        v21Var.Q = true;
                        w21Var.K = z11;
                        w21Var.d0(w21Var.O, w21Var.J, false);
                    }
                    if (mpVar.d != null) {
                        while (i13 < mpVar.d.size()) {
                            ((np) mpVar.d.get(i13)).f26862c = z11 ? 1 : 0;
                            ((np) mpVar.d.get(i13)).e = w21Var.b0(((np) mpVar.d.get(i13)).f26860a, z11);
                            i13++;
                        }
                        w21Var.f38876r = null;
                        mpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                de1 de1Var = (de1) obj;
                AndroidUtilities.runOnUIThread(new ud1(de1Var, 1));
                org.telegram.ui.Cells.u1 u1Var = de1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.u1 u1Var2 = de1Var.K;
                        int O2 = u1Var2.O2(de1Var.O);
                        be1 be1Var = de1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && be1Var != null && (checkBoxBaseArr = be1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f22193p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f22193p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f22194q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = de1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.tm tmVar = de1Var.f33093c0;
                if (tmVar != null) {
                    AndroidUtilities.runOnUIThread(tmVar);
                    de1Var.f33093c0 = null;
                    return;
                }
                return;
            case 13:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.f45390c;
                boolean isEmpty = TextUtils.isEmpty(nVar.f45404t);
                String str = nVar.f45404t;
                nVar.f45406w = true;
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
                nVar.v = nVar.f45393i.getImporters(nVar.f45394j, str, tL_chatInviteImporter, nVar.d, new wh.f(nVar, isEmpty, eVar2, str, z10));
                return;
            case 14:
                yh.s0 s0Var = (yh.s0) obj;
                if (!z11) {
                    s0Var.f47990q0.setVisibility(8);
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
                x3Var.o2(x3Var.f48232c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, x3Var.C1())), true);
                return;
            case 16:
                yh.x3 x3Var2 = ((yh.g2) obj).T;
                TL_stars.SavedStarGift H1 = x3Var2.H1(z11);
                if (H1 != null) {
                    x3Var2.f48230b1 = true;
                    x3Var2.j2(H1, x3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = x3Var2.I1(z11);
                    if (I1 != null) {
                        x3Var2.f48230b1 = true;
                        x3Var2.h2(I1.slug, I1, x3Var2.D0);
                    }
                }
                x3Var2.R0 = -1;
                qc qcVar = qc.f27628w;
                if (qcVar != null) {
                    qcVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.n nVar2 = (zg.n) obj;
                if (z11) {
                    ((zg.q) nVar2.f49390x.f48053c).f49431w.setVisibility(4);
                    return;
                } else {
                    nVar2.getClass();
                    return;
                }
        }
    }
}
