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
import org.telegram.ui.de1;
import org.telegram.ui.ke1;
import org.telegram.ui.me1;
public final class es0 implements Runnable {
    public final int f26162a;
    public final boolean f26163b;
    public final Object f26164c;

    public es0(int i10, Object obj, boolean z10) {
        this.f26162a = i10;
        this.f26164c = obj;
        this.f26163b = z10;
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
        int i12 = this.f26162a;
        wh.e eVar = null;
        int i13 = 8;
        int i14 = 0;
        boolean z11 = this.f26163b;
        Object obj = this.f26164c;
        switch (i12) {
            case 0:
                cw0 cw0Var = (cw0) obj;
                if (!z11) {
                    cw0Var.m0.setVisibility(8);
                    return;
                } else {
                    cw0Var.getClass();
                    return;
                }
            case 1:
                ss0 ss0Var = (ss0) obj;
                if (!z11) {
                    ss0Var.U.f25461q0.setVisibility(0);
                    return;
                } else {
                    ss0Var.getClass();
                    return;
                }
            case 2:
                xs0 xs0Var = (xs0) obj;
                if (!z11) {
                    xs0Var.H.f25461q0.setVisibility(0);
                    return;
                } else {
                    xs0Var.getClass();
                    return;
                }
            case 3:
                tw0 tw0Var = (tw0) obj;
                ArrayList arrayList = tw0Var.f31264r;
                sw0 sw0Var = tw0Var.f31259n;
                if (sw0Var != null) {
                    sw0Var.H(tw0Var.f31251f, z11);
                }
                while (i14 < arrayList.size()) {
                    ((sw0) arrayList.get(i14)).H(tw0Var.f31251f, z11);
                    i14++;
                }
                return;
            case 4:
                uw0 uw0Var = (uw0) obj;
                ArrayList arrayList2 = uw0Var.f31264r;
                sw0 sw0Var2 = uw0Var.f31259n;
                if (sw0Var2 != null) {
                    sw0Var2.H(uw0Var.f31655y0, z11);
                }
                while (i14 < arrayList2.size()) {
                    ((sw0) arrayList2.get(i14)).H(uw0Var.f31655y0, z11);
                    i14++;
                }
                return;
            case 5:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 6:
                ((d71) obj).P(z11);
                return;
            case 7:
                org.telegram.ui.c00 c00Var = (org.telegram.ui.c00) obj;
                c00Var.Z(c00Var.P, z11);
                return;
            case 8:
                org.telegram.ui.wg0 wg0Var = (org.telegram.ui.wg0) obj;
                if (!z11) {
                    wg0Var.W.setVisibility(8);
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
                Activity parentActivity = ((org.telegram.ui.y01) obj).f44235e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                of.f.s(parentActivity, LocaleController.getString(i10));
                return;
            case 12:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) obj;
                org.telegram.ui.e31 e31Var = d31Var.S;
                aq aqVar = d31Var.f36867b;
                if (aqVar != null && aqVar.d != null) {
                    d31Var.a(z11, true);
                    if (d31Var.K != null) {
                        d31Var.Q = true;
                        e31Var.K = z11;
                        e31Var.c0(e31Var.O, e31Var.J, false);
                    }
                    if (aqVar.d != null) {
                        while (i14 < aqVar.d.size()) {
                            ((bq) aqVar.d.get(i14)).f25021c = z11 ? 1 : 0;
                            ((bq) aqVar.d.get(i14)).f25022e = e31Var.a0(((bq) aqVar.d.get(i14)).f25019a, z11);
                            i14++;
                        }
                        e31Var.f37185r = null;
                        aqVar.l();
                        return;
                    }
                    return;
                }
                return;
            case 13:
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
                            ObjectAnimator objectAnimator = checkBoxBase.f24100p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f24100p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f24101q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = me1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.wm wmVar = me1Var.f39927c0;
                if (wmVar != null) {
                    AndroidUtilities.runOnUIThread(wmVar);
                    me1Var.f39927c0 = null;
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
                wh.l lVar = (wh.l) obj;
                ArrayList arrayList3 = lVar.f50474c;
                boolean isEmpty = TextUtils.isEmpty(lVar.f50489t);
                String str = lVar.f50489t;
                lVar.f50491w = true;
                lVar.A = false;
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
                    eVar = new wh.e(lVar, 1);
                }
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar, 300L);
                }
                lVar.v = lVar.f50478i.getImporters(lVar.f50479j, str, tL_chatInviteImporter, lVar.d, new wh.f(lVar, isEmpty, eVar, str, z10));
                return;
            case 16:
                yh.r0 r0Var = (yh.r0) obj;
                if (!z11) {
                    r0Var.f53150q0.setVisibility(8);
                    return;
                } else {
                    r0Var.getClass();
                    return;
                }
            case 17:
                yh.s3 s3Var = (yh.s3) obj;
                s3Var.getClass();
                if (z11) {
                    i11 = R.string.Gift2ActionWearDone;
                } else {
                    i11 = R.string.Gift2ActionWearOffDone;
                }
                s3Var.q2(s3Var.f53210d1, AndroidUtilities.replaceTags(LocaleController.formatString(i11, s3Var.D1())), true);
                return;
            case 18:
                yh.s3 s3Var2 = ((yh.d2) obj).T;
                TL_stars.SavedStarGift I1 = s3Var2.I1(z11);
                if (I1 != null) {
                    s3Var2.f53208c1 = true;
                    s3Var2.l2(I1, s3Var2.E0);
                } else {
                    TL_stars.TL_starGiftUnique J1 = s3Var2.J1(z11);
                    if (J1 != null) {
                        s3Var2.f53208c1 = true;
                        s3Var2.j2(J1.slug, J1, s3Var2.E0);
                    }
                }
                s3Var2.S0 = -1;
                tc tcVar = tc.f31088w;
                if (tcVar != null) {
                    tcVar.c(0L, false);
                    return;
                }
                return;
            default:
                zg.n nVar = (zg.n) obj;
                if (z11) {
                    ((zg.q) nVar.f54656x.f51391b).f54699w.setVisibility(4);
                    return;
                } else {
                    nVar.getClass();
                    return;
                }
        }
    }
}
