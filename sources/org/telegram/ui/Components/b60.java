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
import org.telegram.ui.cd1;
import org.telegram.ui.ed1;
import org.telegram.ui.vc1;
public final class b60 implements Runnable {
    public final int f24962a;
    public final boolean f24963b;
    public final Object f24964c;

    public b60(int i10, Object obj, boolean z10) {
        this.f24962a = i10;
        this.f24964c = obj;
        this.f24963b = z10;
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
        int i11 = this.f24962a;
        xh.e eVar = null;
        int i12 = 8;
        int i13 = 0;
        boolean z11 = this.f24963b;
        Object obj = this.f24964c;
        switch (i11) {
            case 0:
                n60 n60Var = ((f60) obj).H0;
                if (!n60Var.f28867l0) {
                    try {
                        n60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(n60Var.f28868n.getParentActivity());
                    if (z11) {
                        j10 = n60Var.f28865k0;
                    } else {
                        j10 = 0;
                    }
                    n60Var.f28861i0 = j10;
                    n60Var.f28859h0 = System.currentTimeMillis();
                    n60Var.f28863j0 = true;
                    n60Var.v();
                    n60Var.invalidate();
                    NotificationCenter.getInstance(n60Var.f28854f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(n60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                xa0 xa0Var = (xa0) obj;
                if (z11) {
                    xa0Var.G.setVisibility(8);
                    return;
                } else {
                    xa0Var.getClass();
                    return;
                }
            case 2:
                org.telegram.ui.ActionBar.o2 o2Var = ((xn0) obj).G;
                if (z11) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                o2Var.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            case 3:
                xv0 xv0Var = (xv0) obj;
                if (!z11) {
                    xv0Var.m0.setVisibility(8);
                    return;
                } else {
                    xv0Var.getClass();
                    return;
                }
            case 4:
                ns0 ns0Var = (ns0) obj;
                if (!z11) {
                    ns0Var.V.f32698q0.setVisibility(0);
                    return;
                } else {
                    ns0Var.getClass();
                    return;
                }
            case 5:
                ss0 ss0Var = (ss0) obj;
                if (!z11) {
                    ss0Var.H.f32698q0.setVisibility(0);
                    return;
                } else {
                    ss0Var.getClass();
                    return;
                }
            case 6:
                ow0 ow0Var = (ow0) obj;
                ArrayList arrayList = ow0Var.f29348r;
                nw0 nw0Var = ow0Var.f29343n;
                if (nw0Var != null) {
                    nw0Var.G(ow0Var.f29335f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((nw0) arrayList.get(i13)).G(ow0Var.f29335f, z11);
                    i13++;
                }
                return;
            case 7:
                pw0 pw0Var = (pw0) obj;
                ArrayList arrayList2 = pw0Var.f29348r;
                nw0 nw0Var2 = pw0Var.f29343n;
                if (nw0Var2 != null) {
                    nw0Var2.G(pw0Var.f29687y0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((nw0) arrayList2.get(i13)).G(pw0Var.f29687y0, z11);
                    i13++;
                }
                return;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 9:
                ((b71) obj).P(z11);
                return;
            case 10:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj;
                Activity parentActivity = eyVar.getParentActivity();
                if (z11) {
                    j11 = eyVar.getUserConfig().getClientUserId();
                } else {
                    j11 = -1;
                }
                f5.M(parentActivity, j11, new org.telegram.ui.lx(eyVar), eyVar.getResourceProvider());
                return;
            case 11:
                org.telegram.ui.oz ozVar = (org.telegram.ui.oz) obj;
                ozVar.Z(ozVar.Q, z11);
                return;
            case 12:
                org.telegram.ui.ig0 ig0Var = (org.telegram.ui.ig0) obj;
                if (!z11) {
                    ig0Var.W.setVisibility(8);
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
                ((ProfileActivity) obj).i5(z11, true);
                return;
            case 15:
                Activity parentActivity2 = ((org.telegram.ui.f01) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                pf.d.r(parentActivity2, LocaleController.getString(i10));
                return;
            case 16:
                ed1 ed1Var = (ed1) obj;
                AndroidUtilities.runOnUIThread(new vc1(ed1Var, 1));
                org.telegram.ui.Cells.t1 t1Var = ed1Var.K;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.t1 t1Var2 = ed1Var.K;
                        int N2 = t1Var2.N2(ed1Var.O);
                        cd1 cd1Var = ed1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = t1Var2.R8;
                        if (checkBoxBaseArr2 != null && N2 >= 0 && N2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[N2]) != null && cd1Var != null && (checkBoxBaseArr = cd1Var.R8) != null && N2 >= 0 && N2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[N2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f24295p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f24295p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f24296q, true);
                        }
                    }
                    org.telegram.ui.Cells.t1 t1Var3 = ed1Var.K;
                    t1Var3.K7 = -1;
                    t1Var3.invalidate();
                }
                org.telegram.ui.om omVar = ed1Var.f36931c0;
                if (omVar != null) {
                    AndroidUtilities.runOnUIThread(omVar);
                    ed1Var.f36931c0 = null;
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
                jVar.f47086j.b("torch requested: enabled=" + z11 + ", available=" + jVar.F() + ", cameraId=" + jVar.f47099o + ", facing=" + jVar.G);
                jVar.g();
                return;
            default:
                xh.k kVar = (xh.k) obj;
                ArrayList arrayList3 = kVar.f50309c;
                boolean isEmpty = TextUtils.isEmpty(kVar.f50323t);
                String str2 = kVar.f50323t;
                kVar.f50325w = true;
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
                kVar.v = kVar.f50312i.getImporters(kVar.f50313j, str2, tL_chatInviteImporter, kVar.d, new ai.x4(kVar, isEmpty, eVar2, str2, z10));
                return;
        }
    }
}
