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
import org.telegram.ui.ie1;
import org.telegram.ui.ke1;
public final class sr0 implements Runnable {
    public final int f27961a;
    public final boolean f27962b;
    public final Object f27963c;

    public sr0(int i10, Object obj, boolean z10) {
        this.f27961a = i10;
        this.f27963c = obj;
        this.f27962b = z10;
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
        int i12 = this.f27961a;
        wh.e eVar = null;
        int i13 = 0;
        boolean z11 = this.f27962b;
        Object obj = this.f27963c;
        switch (i12) {
            case 0:
                tr0 tr0Var = (tr0) obj;
                if (!z11) {
                    tr0Var.H.f30379q0.setVisibility(0);
                    return;
                } else {
                    tr0Var.getClass();
                    return;
                }
            case 1:
                pv0 pv0Var = (pv0) obj;
                ArrayList arrayList = pv0Var.f27179r;
                ov0 ov0Var = pv0Var.f27174n;
                if (ov0Var != null) {
                    ov0Var.H(pv0Var.f27166f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((ov0) arrayList.get(i13)).H(pv0Var.f27166f, z11);
                    i13++;
                }
                return;
            case 2:
                qv0 qv0Var = (qv0) obj;
                ArrayList arrayList2 = qv0Var.f27179r;
                ov0 ov0Var2 = qv0Var.f27174n;
                if (ov0Var2 != null) {
                    ov0Var2.H(qv0Var.f27460y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((ov0) arrayList2.get(i13)).H(qv0Var.f27460y0, z11);
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
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.getClass();
                return;
            case 8:
                ((ProfileActivity) obj).e5(z11, true);
                return;
            case 9:
                Activity parentActivity = ((org.telegram.ui.z01) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                nf.f.s(parentActivity, LocaleController.getString(i10));
                return;
            case 10:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) obj;
                org.telegram.ui.e31 e31Var = d31Var.S;
                kp kpVar = d31Var.f32906b;
                if (kpVar != null && kpVar.d != null) {
                    d31Var.a(z11, true);
                    if (d31Var.K != null) {
                        d31Var.Q = true;
                        e31Var.K = z11;
                        e31Var.d0(e31Var.O, e31Var.J, false);
                    }
                    if (kpVar.d != null) {
                        while (i13 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i13)).f25996c = z11 ? 1 : 0;
                            ((lp) kpVar.d.get(i13)).e = e31Var.b0(((lp) kpVar.d.get(i13)).f25994a, z11);
                            i13++;
                        }
                        e31Var.f33204r = null;
                        kpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ke1 ke1Var = (ke1) obj;
                AndroidUtilities.runOnUIThread(new be1(ke1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = ke1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.t1 t1Var2 = ke1Var.K;
                        int O2 = t1Var2.O2(ke1Var.O);
                        ie1 ie1Var = ke1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && ie1Var != null && (checkBoxBaseArr = ie1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f21971p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f21971p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f21972q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = ke1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.ym ymVar = ke1Var.f35130c0;
                if (ymVar != null) {
                    AndroidUtilities.runOnUIThread(ymVar);
                    ke1Var.f35130c0 = null;
                    return;
                }
                return;
            case 12:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.f45113c;
                boolean isEmpty = TextUtils.isEmpty(nVar.f45127t);
                String str = nVar.f45127t;
                nVar.f45129w = true;
                nVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) hg.k0.h(1, arrayList3);
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
                nVar.v = nVar.f45116i.getImporters(nVar.f45117j, str, tL_chatInviteImporter, nVar.d, new wh.f(nVar, isEmpty, eVar2, str, z10));
                return;
            case 13:
                yh.s0 s0Var = (yh.s0) obj;
                if (!z11) {
                    s0Var.f47752q0.setVisibility(8);
                    return;
                } else {
                    s0Var.getClass();
                    return;
                }
            case 14:
                yh.a4 a4Var = (yh.a4) obj;
                a4Var.getClass();
                if (z11) {
                    i11 = R.string.Gift2ActionWearDone;
                } else {
                    i11 = R.string.Gift2ActionWearOffDone;
                }
                a4Var.o2(a4Var.f46950c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, a4Var.C1())), true);
                return;
            case 15:
                yh.a4 a4Var2 = ((yh.j2) obj).T;
                TL_stars.SavedStarGift H1 = a4Var2.H1(z11);
                if (H1 != null) {
                    a4Var2.f46948b1 = true;
                    a4Var2.j2(H1, a4Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = a4Var2.I1(z11);
                    if (I1 != null) {
                        a4Var2.f46948b1 = true;
                        a4Var2.h2(I1.slug, I1, a4Var2.D0);
                    }
                }
                a4Var2.R0 = -1;
                oc ocVar = oc.f26747w;
                if (ocVar != null) {
                    ocVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.n nVar2 = (zg.n) obj;
                if (z11) {
                    ((zg.q) nVar2.f49091x.f47936c).f49136w.setVisibility(4);
                    return;
                } else {
                    nVar2.getClass();
                    return;
                }
        }
    }
}
