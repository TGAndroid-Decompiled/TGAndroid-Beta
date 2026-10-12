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
import org.telegram.ui.fe1;
import org.telegram.ui.me1;
import org.telegram.ui.oe1;
public final class js0 implements Runnable {
    public final int f27644a;
    public final boolean f27645b;
    public final Object f27646c;

    public js0(int i10, Object obj, boolean z10) {
        this.f27644a = i10;
        this.f27646c = obj;
        this.f27645b = z10;
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
        int i12 = this.f27644a;
        wh.e eVar = null;
        int i13 = 8;
        int i14 = 0;
        boolean z11 = this.f27645b;
        Object obj = this.f27646c;
        switch (i12) {
            case 0:
                hw0 hw0Var = (hw0) obj;
                if (!z11) {
                    hw0Var.m0.setVisibility(8);
                    return;
                } else {
                    hw0Var.getClass();
                    return;
                }
            case 1:
                xs0 xs0Var = (xs0) obj;
                if (!z11) {
                    xs0Var.U.f26944q0.setVisibility(0);
                    return;
                } else {
                    xs0Var.getClass();
                    return;
                }
            case 2:
                ct0 ct0Var = (ct0) obj;
                if (!z11) {
                    ct0Var.H.f26944q0.setVisibility(0);
                    return;
                } else {
                    ct0Var.getClass();
                    return;
                }
            case 3:
                yw0 yw0Var = (yw0) obj;
                ArrayList arrayList = yw0Var.f33212r;
                xw0 xw0Var = yw0Var.f33207n;
                if (xw0Var != null) {
                    xw0Var.H(yw0Var.f33199f, z11);
                }
                while (i14 < arrayList.size()) {
                    ((xw0) arrayList.get(i14)).H(yw0Var.f33199f, z11);
                    i14++;
                }
                return;
            case 4:
                zw0 zw0Var = (zw0) obj;
                ArrayList arrayList2 = zw0Var.f33212r;
                xw0 xw0Var2 = zw0Var.f33207n;
                if (xw0Var2 != null) {
                    xw0Var2.H(zw0Var.f33513y0, z11);
                }
                while (i14 < arrayList2.size()) {
                    ((xw0) arrayList2.get(i14)).H(zw0Var.f33513y0, z11);
                    i14++;
                }
                return;
            case 5:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 6:
                ((h71) obj).P(z11);
                return;
            case 7:
                org.telegram.ui.e00 e00Var = (org.telegram.ui.e00) obj;
                e00Var.Z(e00Var.P, z11);
                return;
            case 8:
                org.telegram.ui.xg0 xg0Var = (org.telegram.ui.xg0) obj;
                if (!z11) {
                    xg0Var.W.setVisibility(8);
                    return;
                }
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z11) {
                    photoViewer.V0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                return;
            case 10:
                ((ProfileActivity) obj).e5(z11, true);
                return;
            case 11:
                Activity parentActivity = ((org.telegram.ui.a11) obj).f35666e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                of.f.s(parentActivity, LocaleController.getString(i10));
                return;
            case 12:
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) obj;
                org.telegram.ui.g31 g31Var = f31Var.S;
                cq cqVar = f31Var.f37615b;
                if (cqVar != null && cqVar.d != null) {
                    f31Var.a(z11, true);
                    if (f31Var.K != null) {
                        f31Var.Q = true;
                        g31Var.K = z11;
                        g31Var.c0(g31Var.O, g31Var.J, false);
                    }
                    if (cqVar.d != null) {
                        while (i14 < cqVar.d.size()) {
                            ((dq) cqVar.d.get(i14)).f25451c = z11 ? 1 : 0;
                            ((dq) cqVar.d.get(i14)).f25452e = g31Var.a0(((dq) cqVar.d.get(i14)).f25449a, z11);
                            i14++;
                        }
                        g31Var.f37910r = null;
                        cqVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                oe1 oe1Var = (oe1) obj;
                AndroidUtilities.runOnUIThread(new fe1(oe1Var, 1));
                org.telegram.ui.Cells.u1 u1Var = oe1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.u1 u1Var2 = oe1Var.K;
                        int O2 = u1Var2.O2(oe1Var.O);
                        me1 me1Var = oe1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && me1Var != null && (checkBoxBaseArr = me1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f23874p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f23874p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f23875q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = oe1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.an anVar = oe1Var.f40692c0;
                if (anVar != null) {
                    AndroidUtilities.runOnUIThread(anVar);
                    oe1Var.f40692c0 = null;
                    return;
                }
                return;
            case 14:
                View view = (View) obj;
                if (z11) {
                    i13 = 0;
                }
                view.setVisibility(i13);
                return;
            case 15:
                qi.h hVar = (qi.h) obj;
                hVar.M = z11;
                hVar.N = hVar.q();
                hVar.O = 0;
                hVar.P = 0;
                hVar.f46733j.b("torch requested: enabled=" + z11 + ", available=" + hVar.q() + ", cameraId=" + hVar.f46742o + ", facing=" + hVar.D);
                hVar.a();
                return;
            case 16:
                wh.l lVar = (wh.l) obj;
                ArrayList arrayList3 = lVar.f50667c;
                boolean isEmpty = TextUtils.isEmpty(lVar.f50682t);
                String str = lVar.f50682t;
                lVar.f50684w = true;
                lVar.A = false;
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
                    eVar = new wh.e(lVar, 1);
                }
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar, 300L);
                }
                lVar.v = lVar.f50671i.getImporters(lVar.f50672j, str, tL_chatInviteImporter, lVar.d, new wh.f(lVar, isEmpty, eVar, str, z10));
                return;
            case 17:
                yh.r0 r0Var = (yh.r0) obj;
                if (!z11) {
                    r0Var.f53342q0.setVisibility(8);
                    return;
                } else {
                    r0Var.getClass();
                    return;
                }
            case 18:
                yh.s3 s3Var = (yh.s3) obj;
                s3Var.getClass();
                if (z11) {
                    i11 = R.string.Gift2ActionWearDone;
                } else {
                    i11 = R.string.Gift2ActionWearOffDone;
                }
                s3Var.q2(s3Var.f53402d1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, s3Var.D1())), true);
                return;
            case 19:
                yh.s3 s3Var2 = ((yh.d2) obj).T;
                TL_stars.SavedStarGift I1 = s3Var2.I1(z11);
                if (I1 != null) {
                    s3Var2.f53400c1 = true;
                    s3Var2.l2(I1, s3Var2.E0);
                } else {
                    TL_stars.TL_starGiftUnique J1 = s3Var2.J1(z11);
                    if (J1 != null) {
                        s3Var2.f53400c1 = true;
                        s3Var2.j2(J1.slug, J1, s3Var2.E0);
                    }
                }
                s3Var2.S0 = -1;
                sc scVar = sc.f30528w;
                if (scVar != null) {
                    scVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.n nVar = (zg.n) obj;
                if (z11) {
                    ((zg.q) nVar.f54844x.f51585b).f54887w.setVisibility(4);
                    return;
                } else {
                    nVar.getClass();
                    return;
                }
        }
    }
}
