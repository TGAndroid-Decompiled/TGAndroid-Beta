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
public final class ds0 implements Runnable {
    public final int f23635a;
    public final boolean f23636b;
    public final Object f23637c;

    public ds0(int i10, Object obj, boolean z10) {
        this.f23635a = i10;
        this.f23637c = obj;
        this.f23636b = z10;
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
        int i12 = this.f23635a;
        wh.e eVar = null;
        int i13 = 0;
        boolean z11 = this.f23636b;
        Object obj = this.f23637c;
        switch (i12) {
            case 0:
                es0 es0Var = (es0) obj;
                if (!z11) {
                    es0Var.H.f25515q0.setVisibility(0);
                    return;
                } else {
                    es0Var.getClass();
                    return;
                }
            case 1:
                aw0 aw0Var = (aw0) obj;
                ArrayList arrayList = aw0Var.f22802r;
                zv0 zv0Var = aw0Var.f22797n;
                if (zv0Var != null) {
                    zv0Var.H(aw0Var.f22789f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((zv0) arrayList.get(i13)).H(aw0Var.f22789f, z11);
                    i13++;
                }
                return;
            case 2:
                bw0 bw0Var = (bw0) obj;
                ArrayList arrayList2 = bw0Var.f22802r;
                zv0 zv0Var2 = bw0Var.f22797n;
                if (zv0Var2 != null) {
                    zv0Var2.H(bw0Var.f23072y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((zv0) arrayList2.get(i13)).H(bw0Var.f23072y0, z11);
                    i13++;
                }
                return;
            case 3:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 4:
                ((k61) obj).P(z11);
                return;
            case 5:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.Z(c00Var.P, z11);
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
                Activity parentActivity = ((org.telegram.ui.z01) obj).e.getParentActivity();
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
                kp kpVar = e31Var.f33210b;
                if (kpVar != null && kpVar.d != null) {
                    e31Var.a(z11, true);
                    if (e31Var.K != null) {
                        e31Var.Q = true;
                        f31Var.K = z11;
                        f31Var.d0(f31Var.O, f31Var.J, false);
                    }
                    if (kpVar.d != null) {
                        while (i13 < kpVar.d.size()) {
                            ((lp) kpVar.d.get(i13)).f26221c = z11 ? 1 : 0;
                            ((lp) kpVar.d.get(i13)).e = f31Var.b0(((lp) kpVar.d.get(i13)).f26219a, z11);
                            i13++;
                        }
                        f31Var.f33472r = null;
                        kpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                me1 me1Var = (me1) obj;
                AndroidUtilities.runOnUIThread(new de1(me1Var, 1));
                org.telegram.ui.Cells.u1 u1Var = me1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.u1 u1Var2 = me1Var.K;
                        int O2 = u1Var2.O2(me1Var.O);
                        ke1 ke1Var = me1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && ke1Var != null && (checkBoxBaseArr = ke1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f22192p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f22192p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f22193q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = me1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.wm wmVar = me1Var.f35701c0;
                if (wmVar != null) {
                    AndroidUtilities.runOnUIThread(wmVar);
                    me1Var.f35701c0 = null;
                    return;
                }
                return;
            case 12:
                wh.n nVar = (wh.n) obj;
                ArrayList arrayList3 = nVar.f45408c;
                boolean isEmpty = TextUtils.isEmpty(nVar.f45422t);
                String str = nVar.f45422t;
                nVar.f45424w = true;
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
                nVar.v = nVar.f45411i.getImporters(nVar.f45412j, str, tL_chatInviteImporter, nVar.d, new wh.f(nVar, isEmpty, eVar2, str, z10));
                return;
            case 13:
                yh.s0 s0Var = (yh.s0) obj;
                if (!z11) {
                    s0Var.f48022q0.setVisibility(8);
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
                y3Var.o2(y3Var.f48304c1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, y3Var.C1())), true);
                return;
            case 15:
                yh.y3 y3Var2 = ((yh.h2) obj).U;
                TL_stars.SavedStarGift H1 = y3Var2.H1(z11);
                if (H1 != null) {
                    y3Var2.f48302b1 = true;
                    y3Var2.j2(H1, y3Var2.D0);
                } else {
                    TL_stars.TL_starGiftUnique I1 = y3Var2.I1(z11);
                    if (I1 != null) {
                        y3Var2.f48302b1 = true;
                        y3Var2.h2(I1.slug, I1, y3Var2.D0);
                    }
                }
                y3Var2.R0 = -1;
                pc pcVar = pc.f27245w;
                if (pcVar != null) {
                    pcVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.n nVar2 = (zg.n) obj;
                if (z11) {
                    ((zg.q) nVar2.f49418x.f48107c).f49459w.setVisibility(4);
                    return;
                } else {
                    nVar2.getClass();
                    return;
                }
        }
    }
}
