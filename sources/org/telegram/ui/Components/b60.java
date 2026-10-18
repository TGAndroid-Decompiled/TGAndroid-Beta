package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad1;
import org.telegram.ui.rc1;
import org.telegram.ui.yc1;
public final class b60 implements Runnable {
    public final int f24816a;
    public final boolean f24817b;
    public final Object f24818c;

    public b60(int i10, Object obj, boolean z10) {
        this.f24816a = i10;
        this.f24818c = obj;
        this.f24817b = z10;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        long j11;
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z10;
        int i11 = this.f24816a;
        xh.e eVar = null;
        int i12 = 8;
        int i13 = 0;
        boolean z11 = this.f24817b;
        Object obj = this.f24818c;
        switch (i11) {
            case 0:
                m60 m60Var = ((f60) obj).H0;
                if (!m60Var.f28440l0) {
                    try {
                        m60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(m60Var.f28441n.getParentActivity());
                    if (z11) {
                        j10 = m60Var.f28438k0;
                    } else {
                        j10 = 0;
                    }
                    m60Var.f28434i0 = j10;
                    m60Var.f28432h0 = System.currentTimeMillis();
                    m60Var.f28436j0 = true;
                    m60Var.v();
                    m60Var.invalidate();
                    NotificationCenter.getInstance(m60Var.f28427f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(m60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                wa0 wa0Var = (wa0) obj;
                if (z11) {
                    wa0Var.G.setVisibility(8);
                    return;
                } else {
                    wa0Var.getClass();
                    return;
                }
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var = ((tn0) obj).G;
                if (z11) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 3:
                sv0 sv0Var = (sv0) obj;
                if (!z11) {
                    sv0Var.m0.setVisibility(8);
                    return;
                } else {
                    sv0Var.getClass();
                    return;
                }
            case 4:
                is0 is0Var = (is0) obj;
                if (!z11) {
                    is0Var.U.f30382q0.setVisibility(0);
                    return;
                } else {
                    is0Var.getClass();
                    return;
                }
            case 5:
                ns0 ns0Var = (ns0) obj;
                if (!z11) {
                    ns0Var.H.f30382q0.setVisibility(0);
                    return;
                } else {
                    ns0Var.getClass();
                    return;
                }
            case 6:
                jw0 jw0Var = (jw0) obj;
                ArrayList arrayList = jw0Var.f27639r;
                iw0 iw0Var = jw0Var.f27634n;
                if (iw0Var != null) {
                    iw0Var.H(jw0Var.f27626f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((iw0) arrayList.get(i13)).H(jw0Var.f27626f, z11);
                    i13++;
                }
                return;
            case 7:
                kw0 kw0Var = (kw0) obj;
                ArrayList arrayList2 = kw0Var.f27639r;
                iw0 iw0Var2 = kw0Var.f27634n;
                if (iw0Var2 != null) {
                    iw0Var2.H(kw0Var.f28021y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((iw0) arrayList2.get(i13)).H(kw0Var.f28021y0, z11);
                    i13++;
                }
                return;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 9:
                ((s61) obj).P(z11);
                return;
            case 10:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj;
                Activity parentActivity = eyVar.getParentActivity();
                if (z11) {
                    j11 = eyVar.getUserConfig().getClientUserId();
                } else {
                    j11 = -1;
                }
                f5.L(parentActivity, j11, new org.telegram.ui.lx(eyVar), eyVar.getResourceProvider());
                return;
            case 11:
                org.telegram.ui.nz nzVar = (org.telegram.ui.nz) obj;
                nzVar.Z(nzVar.P, z11);
                return;
            case 12:
                org.telegram.ui.fg0 fg0Var = (org.telegram.ui.fg0) obj;
                if (!z11) {
                    fg0Var.W.setVisibility(8);
                    return;
                }
                return;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z11) {
                    photoViewer.V0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                return;
            case 14:
                ((ProfileActivity) obj).e5(z11, true);
                return;
            case 15:
                Activity parentActivity2 = ((org.telegram.ui.d01) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                pf.d.r(parentActivity2, LocaleController.getString(i10));
                return;
            case 16:
                ad1 ad1Var = (ad1) obj;
                AndroidUtilities.runOnUIThread(new rc1(ad1Var, 1));
                org.telegram.ui.Cells.u1 u1Var = ad1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.u1 u1Var2 = ad1Var.K;
                        int O2 = u1Var2.O2(ad1Var.O);
                        yc1 yc1Var = ad1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && yc1Var != null && (checkBoxBaseArr = yc1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f24153p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f24153p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f24154q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = ad1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.pm pmVar = ad1Var.f35421c0;
                if (pmVar != null) {
                    AndroidUtilities.runOnUIThread(pmVar);
                    ad1Var.f35421c0 = null;
                    return;
                }
                return;
            case 17:
                View view = (View) obj;
                if (z11) {
                    i12 = 0;
                }
                view.setVisibility(i12);
                return;
            case 18:
                si.k kVar = (si.k) obj;
                kVar.P = z11;
                kVar.Q = kVar.F();
                kVar.R = 0;
                kVar.S = 0;
                kVar.f46700j.b("torch requested: enabled=" + z11 + ", available=" + kVar.F() + ", cameraId=" + kVar.f46713o + ", facing=" + kVar.G);
                kVar.g();
                return;
            default:
                xh.k kVar2 = (xh.k) obj;
                ArrayList arrayList3 = kVar2.f49906c;
                boolean isEmpty = TextUtils.isEmpty(kVar2.f49920t);
                String str2 = kVar2.f49920t;
                kVar2.f49922w = true;
                kVar2.A = false;
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
                    eVar = new xh.e(kVar2, 1);
                }
                xh.e eVar2 = eVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                }
                kVar2.v = kVar2.f49909i.getImporters(kVar2.f49910j, str2, tL_chatInviteImporter, kVar2.d, new ai.w4(kVar2, isEmpty, eVar2, str2, z10));
                return;
        }
    }
}
