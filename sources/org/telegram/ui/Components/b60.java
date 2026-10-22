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
import org.telegram.ui.pc1;
import org.telegram.ui.wc1;
import org.telegram.ui.yc1;
public final class b60 implements Runnable {
    public final int f24815a;
    public final boolean f24816b;
    public final Object f24817c;

    public b60(int i10, Object obj, boolean z10) {
        this.f24815a = i10;
        this.f24817c = obj;
        this.f24816b = z10;
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
        int i11 = this.f24815a;
        xh.e eVar = null;
        int i12 = 8;
        int i13 = 0;
        boolean z11 = this.f24816b;
        Object obj = this.f24817c;
        switch (i11) {
            case 0:
                m60 m60Var = ((f60) obj).H0;
                if (!m60Var.f28423l0) {
                    try {
                        m60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(m60Var.f28424n.getParentActivity());
                    if (z11) {
                        j10 = m60Var.f28421k0;
                    } else {
                        j10 = 0;
                    }
                    m60Var.f28417i0 = j10;
                    m60Var.f28415h0 = System.currentTimeMillis();
                    m60Var.f28419j0 = true;
                    m60Var.v();
                    m60Var.invalidate();
                    NotificationCenter.getInstance(m60Var.f28410f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(m60Var.V), Boolean.FALSE);
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
                org.telegram.ui.ActionBar.n2 n2Var = ((un0) obj).G;
                if (z11) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 3:
                uv0 uv0Var = (uv0) obj;
                if (!z11) {
                    uv0Var.m0.setVisibility(8);
                    return;
                } else {
                    uv0Var.getClass();
                    return;
                }
            case 4:
                ks0 ks0Var = (ks0) obj;
                if (!z11) {
                    ks0Var.U.f31061q0.setVisibility(0);
                    return;
                } else {
                    ks0Var.getClass();
                    return;
                }
            case 5:
                ps0 ps0Var = (ps0) obj;
                if (!z11) {
                    ps0Var.H.f31061q0.setVisibility(0);
                    return;
                } else {
                    ps0Var.getClass();
                    return;
                }
            case 6:
                lw0 lw0Var = (lw0) obj;
                ArrayList arrayList = lw0Var.f28312r;
                kw0 kw0Var = lw0Var.f28307n;
                if (kw0Var != null) {
                    kw0Var.G(lw0Var.f28299f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((kw0) arrayList.get(i13)).G(lw0Var.f28299f, z11);
                    i13++;
                }
                return;
            case 7:
                mw0 mw0Var = (mw0) obj;
                ArrayList arrayList2 = mw0Var.f28312r;
                kw0 kw0Var2 = mw0Var.f28307n;
                if (kw0Var2 != null) {
                    kw0Var2.G(mw0Var.f28620y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((kw0) arrayList2.get(i13)).G(mw0Var.f28620y0, z11);
                    i13++;
                }
                return;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 9:
                ((u61) obj).P(z11);
                return;
            case 10:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj;
                Activity parentActivity = cyVar.getParentActivity();
                if (z11) {
                    j11 = cyVar.getUserConfig().getClientUserId();
                } else {
                    j11 = -1;
                }
                f5.L(parentActivity, j11, new org.telegram.ui.jx(cyVar), cyVar.getResourceProvider());
                return;
            case 11:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) obj;
                lzVar.Z(lzVar.P, z11);
                return;
            case 12:
                org.telegram.ui.dg0 dg0Var = (org.telegram.ui.dg0) obj;
                if (!z11) {
                    dg0Var.W.setVisibility(8);
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
                Activity parentActivity2 = ((org.telegram.ui.b01) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                pf.d.r(parentActivity2, LocaleController.getString(i10));
                return;
            case 16:
                yc1 yc1Var = (yc1) obj;
                AndroidUtilities.runOnUIThread(new pc1(yc1Var, 1));
                org.telegram.ui.Cells.u1 u1Var = yc1Var.K;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.u1 u1Var2 = yc1Var.K;
                        int O2 = u1Var2.O2(yc1Var.O);
                        wc1 wc1Var = yc1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = u1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && wc1Var != null && (checkBoxBaseArr = wc1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f24153p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f24153p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f24154q, true);
                        }
                    }
                    org.telegram.ui.Cells.u1 u1Var3 = yc1Var.K;
                    u1Var3.K7 = -1;
                    u1Var3.invalidate();
                }
                org.telegram.ui.nm nmVar = yc1Var.f43456c0;
                if (nmVar != null) {
                    AndroidUtilities.runOnUIThread(nmVar);
                    yc1Var.f43456c0 = null;
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
                si.j jVar = (si.j) obj;
                jVar.P = z11;
                jVar.Q = jVar.F();
                jVar.R = 0;
                jVar.S = 0;
                jVar.f46652j.b("torch requested: enabled=" + z11 + ", available=" + jVar.F() + ", cameraId=" + jVar.f46665o + ", facing=" + jVar.G);
                jVar.g();
                return;
            default:
                xh.k kVar = (xh.k) obj;
                ArrayList arrayList3 = kVar.f49868c;
                boolean isEmpty = TextUtils.isEmpty(kVar.f49882t);
                String str2 = kVar.f49882t;
                kVar.f49884w = true;
                kVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) i2.e.h(1, arrayList3);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z11) {
                    eVar = new xh.e(kVar, 1);
                }
                xh.e eVar2 = eVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                }
                kVar.v = kVar.f49871i.getImporters(kVar.f49872j, str2, tL_chatInviteImporter, kVar.d, new ai.x4(kVar, isEmpty, eVar2, str2, z10));
                return;
        }
    }
}
