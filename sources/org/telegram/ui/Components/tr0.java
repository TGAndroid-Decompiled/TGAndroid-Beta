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
import org.telegram.ui.de1;
import org.telegram.ui.ke1;
import org.telegram.ui.me1;
public final class tr0 implements Runnable {
    public final int f28196a;
    public final boolean f28197b;
    public final Object f28198c;

    public tr0(int i10, Object obj, boolean z10) {
        this.f28196a = i10;
        this.f28198c = obj;
        this.f28197b = z10;
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
        int i12 = this.f28196a;
        wh.e eVar = null;
        int i13 = 0;
        boolean z11 = this.f28197b;
        Object obj = this.f28198c;
        switch (i12) {
            case 0:
                ur0 ur0Var = (ur0) obj;
                if (!z11) {
                    ur0Var.H.f30646q0.setVisibility(0);
                    return;
                } else {
                    ur0Var.getClass();
                    return;
                }
            case 1:
                qv0 qv0Var = (qv0) obj;
                ArrayList arrayList = qv0Var.f27435r;
                pv0 pv0Var = qv0Var.f27430n;
                if (pv0Var != null) {
                    pv0Var.H(qv0Var.f27422f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((pv0) arrayList.get(i13)).H(qv0Var.f27422f, z11);
                    i13++;
                }
                return;
            case 2:
                rv0 rv0Var = (rv0) obj;
                ArrayList arrayList2 = rv0Var.f27435r;
                pv0 pv0Var2 = rv0Var.f27430n;
                if (pv0Var2 != null) {
                    pv0Var2.H(rv0Var.f27707y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((pv0) arrayList2.get(i13)).H(rv0Var.f27707y0, z11);
                    i13++;
                }
                return;
            case 3:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 4:
                ((x51) obj).P(z11);
                return;
            case 5:
                org.telegram.ui.e00 e00Var = (org.telegram.ui.e00) obj;
                e00Var.Z(e00Var.P, z11);
                return;
            case 6:
                org.telegram.ui.yg0 yg0Var = (org.telegram.ui.yg0) obj;
                if (!z11) {
                    yg0Var.W.setVisibility(8);
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
                Activity parentActivity = ((org.telegram.ui.b11) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                nf.f.s(parentActivity, LocaleController.getString(i10));
                return;
            case 10:
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) obj;
                org.telegram.ui.g31 g31Var = f31Var.S;
                kp kpVar = f31Var.f33532b;
                if (kpVar != null && kpVar.d != null) {
                    f31Var.a(z11, true);
                    if (f31Var.K != null) {
                        f31Var.Q = true;
                        g31Var.K = z11;
                        g31Var.d0(g31Var.O, g31Var.J, false);
                    }
                    if (kpVar.d != null) {
                        while (i13 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i13)).f25959c = z11 ? 1 : 0;
                            ((lp) kpVar.d.get(i13)).e = g31Var.b0(((lp) kpVar.d.get(i13)).f25957a, z11);
                            i13++;
                        }
                        g31Var.f33837r = null;
                        kpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                me1 me1Var = (me1) obj;
                AndroidUtilities.runOnUIThread(new de1(me1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = me1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.t1 t1Var2 = me1Var.K;
                        int O2 = t1Var2.O2(me1Var.O);
                        ke1 ke1Var = me1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && ke1Var != null && (checkBoxBaseArr = ke1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f21984p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f21984p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f21985q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = me1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.ym ymVar = me1Var.f35783c0;
                if (ymVar != null) {
                    AndroidUtilities.runOnUIThread(ymVar);
                    me1Var.f35783c0 = null;
                    return;
                }
                return;
            case 12:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.f45141c;
                boolean isEmpty = TextUtils.isEmpty(nVar.f45155t);
                String str = nVar.f45155t;
                nVar.f45157w = true;
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
                nVar.v = nVar.f45144i.getImporters(nVar.f45145j, str, tL_chatInviteImporter, nVar.d, new wh.f(nVar, isEmpty, eVar2, str, z10));
                return;
            case 13:
                yh.s0 s0Var = (yh.s0) obj;
                if (!z11) {
                    s0Var.f47780q0.setVisibility(8);
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
                a4Var.o2(a4Var.f46978c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, a4Var.C1())), true);
                return;
            case 15:
                yh.a4 a4Var2 = ((yh.j2) obj).U;
                TL_stars.SavedStarGift H1 = a4Var2.H1(z11);
                if (H1 != null) {
                    a4Var2.f46976b1 = true;
                    a4Var2.j2(H1, a4Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = a4Var2.I1(z11);
                    if (I1 != null) {
                        a4Var2.f46976b1 = true;
                        a4Var2.h2(I1.slug, I1, a4Var2.D0);
                    }
                }
                a4Var2.R0 = -1;
                oc ocVar = oc.f26698w;
                if (ocVar != null) {
                    ocVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.n nVar2 = (zg.n) obj;
                if (z11) {
                    ((zg.q) nVar2.f49119x.f47964c).f49164w.setVisibility(4);
                    return;
                } else {
                    nVar2.getClass();
                    return;
                }
        }
    }
}
