package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ie1;
import org.telegram.ui.pe1;
import org.telegram.ui.re1;
public final class zr0 implements Runnable {
    public final int f31678a;
    public final boolean f31679b;
    public final Object f31680c;

    public zr0(int i10, Object obj, boolean z10) {
        this.f31678a = i10;
        this.f31680c = obj;
        this.f31679b = z10;
    }

    @Override
    public final void run() {
        long j10;
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z10;
        int i11;
        int i12 = this.f31678a;
        xh.e eVar = null;
        int i13 = 8;
        int i14 = 0;
        boolean z11 = this.f31679b;
        Object obj = this.f31680c;
        switch (i12) {
            case 0:
                xv0 xv0Var = (xv0) obj;
                if (!z11) {
                    xv0Var.m0.setVisibility(8);
                    return;
                } else {
                    xv0Var.getClass();
                    return;
                }
            case 1:
                ns0 ns0Var = (ns0) obj;
                if (!z11) {
                    ns0Var.U.f31056q0.setVisibility(0);
                    return;
                } else {
                    ns0Var.getClass();
                    return;
                }
            case 2:
                ss0 ss0Var = (ss0) obj;
                if (!z11) {
                    ss0Var.H.f31056q0.setVisibility(0);
                    return;
                } else {
                    ss0Var.getClass();
                    return;
                }
            case 3:
                ow0 ow0Var = (ow0) obj;
                ArrayList arrayList = ow0Var.f27785r;
                nw0 nw0Var = ow0Var.f27780n;
                if (nw0Var != null) {
                    nw0Var.H(ow0Var.f27772f, z11);
                }
                while (i14 < arrayList.size()) {
                    ((nw0) arrayList.get(i14)).H(ow0Var.f27772f, z11);
                    i14++;
                }
                return;
            case 4:
                pw0 pw0Var = (pw0) obj;
                ArrayList arrayList2 = pw0Var.f27785r;
                nw0 nw0Var2 = pw0Var.f27780n;
                if (nw0Var2 != null) {
                    nw0Var2.H(pw0Var.f28124y0, z11);
                }
                while (i14 < arrayList2.size()) {
                    ((nw0) arrayList2.get(i14)).H(pw0Var.f28124y0, z11);
                    i14++;
                }
                return;
            case 5:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 6:
                ((a71) obj).P(z11);
                return;
            case 7:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) obj;
                Activity parentActivity = yyVar.getParentActivity();
                if (z11) {
                    j10 = yyVar.getUserConfig().getClientUserId();
                } else {
                    j10 = -1;
                }
                g5.L(parentActivity, j10, new org.telegram.ui.gy(yyVar), yyVar.getResourceProvider());
                return;
            case 8:
                org.telegram.ui.h00 h00Var = (org.telegram.ui.h00) obj;
                h00Var.Z(h00Var.P, z11);
                return;
            case 9:
                org.telegram.ui.ah0 ah0Var = (org.telegram.ui.ah0) obj;
                if (!z11) {
                    ah0Var.W.setVisibility(8);
                    return;
                }
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z11) {
                    photoViewer.V0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                return;
            case 11:
                ((ProfileActivity) obj).e5(z11, true);
                return;
            case 12:
                Activity parentActivity2 = ((org.telegram.ui.e11) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                pf.d.r(parentActivity2, LocaleController.getString(i10));
                return;
            case 13:
                org.telegram.ui.k31 k31Var = (org.telegram.ui.k31) obj;
                org.telegram.ui.l31 l31Var = k31Var.S;
                xp xpVar = k31Var.f37225b;
                if (xpVar != null && xpVar.d != null) {
                    k31Var.a(z11, true);
                    if (k31Var.K != null) {
                        k31Var.Q = true;
                        l31Var.K = z11;
                        l31Var.c0(l31Var.O, l31Var.J, false);
                    }
                    if (xpVar.d != null) {
                        while (i14 < xpVar.d.size()) {
                            ((yp) xpVar.d.get(i14)).f31347c = z11 ? 1 : 0;
                            ((yp) xpVar.d.get(i14)).e = l31Var.a0(((yp) xpVar.d.get(i14)).f31345a, z11);
                            i14++;
                        }
                        l31Var.f37597r = null;
                        xpVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                re1 re1Var = (re1) obj;
                AndroidUtilities.runOnUIThread(new ie1(re1Var, 1));
                org.telegram.ui.Cells.u1 u1Var = re1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.u1 u1Var2 = re1Var.K;
                        int O2 = u1Var2.O2(re1Var.O);
                        pe1 pe1Var = re1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && pe1Var != null && (checkBoxBaseArr = pe1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f22791p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f22791p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f22792q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = re1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.bn bnVar = re1Var.f39492c0;
                if (bnVar != null) {
                    AndroidUtilities.runOnUIThread(bnVar);
                    re1Var.f39492c0 = null;
                    return;
                }
                return;
            case 15:
                View view = (View) obj;
                if (z11) {
                    i13 = 0;
                }
                view.setVisibility(i13);
                return;
            case 16:
                ri.j jVar = (ri.j) obj;
                jVar.P = z11;
                jVar.Q = jVar.F();
                jVar.R = 0;
                jVar.S = 0;
                jVar.f44574j.b("torch requested: enabled=" + z11 + ", available=" + jVar.F() + ", cameraId=" + jVar.f44587o + ", facing=" + jVar.G);
                jVar.g();
                return;
            case 17:
                xh.l lVar = (xh.l) obj;
                ArrayList arrayList3 = lVar.f48476c;
                boolean isEmpty = TextUtils.isEmpty(lVar.f48490t);
                String str = lVar.f48490t;
                lVar.f48492w = true;
                lVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) i2.d.h(1, arrayList3);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z11) {
                    eVar = new xh.e(lVar, 1);
                }
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar, 300L);
                }
                lVar.v = lVar.f48479i.getImporters(lVar.f48480j, str, tL_chatInviteImporter, lVar.d, new xh.f(lVar, isEmpty, eVar, str, z10));
                return;
            case 18:
                zh.r0 r0Var = (zh.r0) obj;
                if (!z11) {
                    r0Var.f51049q0.setVisibility(8);
                    return;
                } else {
                    r0Var.getClass();
                    return;
                }
            case 19:
                zh.r3 r3Var = (zh.r3) obj;
                r3Var.getClass();
                if (z11) {
                    i11 = R.string.Gift2ActionWearDone;
                } else {
                    i11 = R.string.Gift2ActionWearOffDone;
                }
                r3Var.q2(r3Var.f51076d1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, r3Var.D1())), true);
                return;
            default:
                zh.r3 r3Var2 = ((zh.c2) obj).T;
                TL_stars.SavedStarGift I1 = r3Var2.I1(z11);
                if (I1 != null) {
                    r3Var2.f51074c1 = true;
                    r3Var2.l2(I1, r3Var2.E0);
                } else {
                    TL_stars.TL_starGiftUnique J1 = r3Var2.J1(z11);
                    if (J1 != null) {
                        r3Var2.f51074c1 = true;
                        r3Var2.j2(J1.slug, J1, r3Var2.E0);
                    }
                }
                r3Var2.S0 = -1;
                sc scVar = sc.f28798w;
                if (scVar != null) {
                    scVar.c(0L, false);
                    return;
                }
                return;
        }
    }
}
