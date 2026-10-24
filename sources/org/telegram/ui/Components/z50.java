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
import org.telegram.ui.bd1;
import org.telegram.ui.dd1;
import org.telegram.ui.uc1;
public final class z50 implements Runnable {
    public final int f33156a;
    public final boolean f33157b;
    public final Object f33158c;

    public z50(int i10, Object obj, boolean z10) {
        this.f33156a = i10;
        this.f33158c = obj;
        this.f33157b = z10;
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
        int i11 = this.f33156a;
        xh.e eVar = null;
        int i12 = 8;
        int i13 = 0;
        boolean z11 = this.f33157b;
        Object obj = this.f33158c;
        switch (i11) {
            case 0:
                l60 l60Var = ((d60) obj).H0;
                if (!l60Var.f28201l0) {
                    try {
                        l60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(l60Var.f28202n.getParentActivity());
                    if (z11) {
                        j10 = l60Var.f28199k0;
                    } else {
                        j10 = 0;
                    }
                    l60Var.f28195i0 = j10;
                    l60Var.f28193h0 = System.currentTimeMillis();
                    l60Var.f28197j0 = true;
                    l60Var.v();
                    l60Var.invalidate();
                    NotificationCenter.getInstance(l60Var.f28188f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(l60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                va0 va0Var = (va0) obj;
                if (z11) {
                    va0Var.G.setVisibility(8);
                    return;
                } else {
                    va0Var.getClass();
                    return;
                }
            case 2:
                org.telegram.ui.ActionBar.o2 o2Var = ((wn0) obj).G;
                if (z11) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                o2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 3:
                wv0 wv0Var = (wv0) obj;
                if (!z11) {
                    wv0Var.m0.setVisibility(8);
                    return;
                } else {
                    wv0Var.getClass();
                    return;
                }
            case 4:
                ms0 ms0Var = (ms0) obj;
                if (!z11) {
                    ms0Var.V.f32397q0.setVisibility(0);
                    return;
                } else {
                    ms0Var.getClass();
                    return;
                }
            case 5:
                rs0 rs0Var = (rs0) obj;
                if (!z11) {
                    rs0Var.H.f32397q0.setVisibility(0);
                    return;
                } else {
                    rs0Var.getClass();
                    return;
                }
            case 6:
                nw0 nw0Var = (nw0) obj;
                ArrayList arrayList = nw0Var.f29067r;
                mw0 mw0Var = nw0Var.f29062n;
                if (mw0Var != null) {
                    mw0Var.G(nw0Var.f29054f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((mw0) arrayList.get(i13)).G(nw0Var.f29054f, z11);
                    i13++;
                }
                return;
            case 7:
                ow0 ow0Var = (ow0) obj;
                ArrayList arrayList2 = ow0Var.f29067r;
                mw0 mw0Var2 = ow0Var.f29062n;
                if (mw0Var2 != null) {
                    mw0Var2.G(ow0Var.f29419y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((mw0) arrayList2.get(i13)).G(ow0Var.f29419y0, z11);
                    i13++;
                }
                return;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 9:
                ((a71) obj).P(z11);
                return;
            case 10:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj;
                Activity parentActivity = eyVar.getParentActivity();
                if (z11) {
                    j11 = eyVar.getUserConfig().getClientUserId();
                } else {
                    j11 = -1;
                }
                d5.L(parentActivity, j11, new org.telegram.ui.lx(eyVar), eyVar.getResourceProvider());
                return;
            case 11:
                org.telegram.ui.oz ozVar = (org.telegram.ui.oz) obj;
                ozVar.Z(ozVar.Q, z11);
                return;
            case 12:
                org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) obj;
                if (!z11) {
                    rc0Var.f41094b.setVisibility(8);
                    return;
                } else {
                    rc0Var.getClass();
                    return;
                }
            case 13:
                org.telegram.ui.hg0 hg0Var = (org.telegram.ui.hg0) obj;
                if (!z11) {
                    hg0Var.W.setVisibility(8);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z11) {
                    photoViewer.V0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                return;
            case 15:
                ((ProfileActivity) obj).i5(z11, true);
                return;
            case 16:
                Activity parentActivity2 = ((org.telegram.ui.e01) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                pf.d.r(parentActivity2, LocaleController.getString(i10));
                return;
            case 17:
                dd1 dd1Var = (dd1) obj;
                AndroidUtilities.runOnUIThread(new uc1(dd1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = dd1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.t1 t1Var2 = dd1Var.K;
                        int N2 = t1Var2.N2(dd1Var.O);
                        bd1 bd1Var = dd1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
                        if (checkBoxBaseArr2 != null && N2 >= 0 && N2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[N2]) != null && bd1Var != null && (checkBoxBaseArr = bd1Var.R8) != null && N2 >= 0 && N2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[N2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f24296p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f24296p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f24297q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = dd1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.om omVar = dd1Var.f36593c0;
                if (omVar != null) {
                    AndroidUtilities.runOnUIThread(omVar);
                    dd1Var.f36593c0 = null;
                    return;
                }
                return;
            case 18:
                View view = (View) obj;
                if (z11) {
                    i12 = 0;
                }
                view.setVisibility(i12);
                return;
            case 19:
                si.j jVar = (si.j) obj;
                jVar.P = z11;
                jVar.Q = jVar.F();
                jVar.R = 0;
                jVar.S = 0;
                jVar.f47085j.b("torch requested: enabled=" + z11 + ", available=" + jVar.F() + ", cameraId=" + jVar.f47098o + ", facing=" + jVar.G);
                jVar.g();
                return;
            default:
                xh.k kVar = (xh.k) obj;
                ArrayList arrayList3 = kVar.f50308c;
                boolean isEmpty = TextUtils.isEmpty(kVar.f50322t);
                String str2 = kVar.f50322t;
                kVar.f50324w = true;
                kVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) i2.o1.i(1, arrayList3);
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
                kVar.v = kVar.f50311i.getImporters(kVar.f50312j, str2, tL_chatInviteImporter, kVar.d, new ai.x4(kVar, isEmpty, eVar2, str2, z10));
                return;
        }
    }
}
