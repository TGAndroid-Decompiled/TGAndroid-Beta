package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
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
import org.telegram.ui.id1;
import org.telegram.ui.kd1;
public final class d60 implements Runnable {
    public final int f27350a;
    public final boolean f27351b;
    public final Object f27352c;

    public d60(int i10, Object obj, boolean z10) {
        this.f27350a = i10;
        this.f27352c = obj;
        this.f27351b = z10;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        String str2;
        long j11;
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z10;
        int i11 = this.f27350a;
        yh.e eVar = null;
        int i12 = 8;
        int i13 = 0;
        boolean z11 = this.f27351b;
        Object obj = this.f27352c;
        switch (i11) {
            case 0:
                p60 p60Var = ((h60) obj).H0;
                if (!p60Var.f31488k0) {
                    try {
                        p60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(p60Var.h.getParentActivity());
                    if (z11) {
                        j10 = p60Var.f31486j0;
                    } else {
                        j10 = 0;
                    }
                    p60Var.f31482h0 = j10;
                    p60Var.f31480g0 = System.currentTimeMillis();
                    p60Var.f31484i0 = true;
                    p60Var.w();
                    p60Var.invalidate();
                    NotificationCenter.getInstance(p60Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(p60Var.U), Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                bn0 bn0Var = (bn0) obj;
                bn0Var.getClass();
                if (z11) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                bn0Var.r(str, false);
                return;
            case 2:
                org.telegram.ui.ActionBar.r2 r2Var = ((do0) obj).G;
                if (z11) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                r2Var.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
            case 3:
                bw0 bw0Var = (bw0) obj;
                if (!z11) {
                    bw0Var.f26968o0.setVisibility(8);
                    return;
                } else {
                    bw0Var.getClass();
                    return;
                }
            case 4:
                ws0 ws0Var = (ws0) obj;
                if (!z11) {
                    ws0Var.W.f26979s0.setVisibility(0);
                    return;
                } else {
                    ws0Var.getClass();
                    return;
                }
            case 5:
                at0 at0Var = (at0) obj;
                if (!z11) {
                    at0Var.f26662w.f26979s0.setVisibility(0);
                    return;
                } else {
                    at0Var.getClass();
                    return;
                }
            case 6:
                ww0 ww0Var = (ww0) obj;
                ArrayList arrayList = ww0Var.f34595r;
                vw0 vw0Var = ww0Var.f34594n;
                if (vw0Var != null) {
                    vw0Var.I(ww0Var.f34588f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((vw0) arrayList.get(i13)).I(ww0Var.f34588f, z11);
                    i13++;
                }
                return;
            case 7:
                xw0 xw0Var = (xw0) obj;
                ArrayList arrayList2 = xw0Var.f34595r;
                vw0 vw0Var2 = xw0Var.f34594n;
                if (vw0Var2 != null) {
                    vw0Var2.I(xw0Var.f34862n0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((vw0) arrayList2.get(i13)).I(xw0Var.f34862n0, z11);
                    i13++;
                }
                return;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 9:
                ((k71) obj).Q(z11);
                return;
            case 10:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj;
                Activity parentActivity = eyVar.getParentActivity();
                if (z11) {
                    j11 = eyVar.getUserConfig().getClientUserId();
                } else {
                    j11 = -1;
                }
                g5.L(parentActivity, j11, new org.telegram.ui.ix(eyVar), eyVar.getResourceProvider());
                return;
            case 11:
                org.telegram.ui.oz ozVar = (org.telegram.ui.oz) obj;
                ozVar.a0(ozVar.O, z11);
                return;
            case 12:
                org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) obj;
                if (!z11) {
                    rc0Var.f42923b.setVisibility(8);
                    return;
                } else {
                    rc0Var.getClass();
                    return;
                }
            case 13:
                org.telegram.ui.ig0 ig0Var = (org.telegram.ui.ig0) obj;
                if (!z11) {
                    ig0Var.W.setVisibility(8);
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
                int i14 = ProfileActivity.R6;
                ((ProfileActivity) obj).p5(z11, true);
                return;
            case 16:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (z11) {
                    i13 = 4;
                }
                frameLayout.setVisibility(i13);
                return;
            case 17:
                Activity parentActivity2 = ((org.telegram.ui.l01) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                qf.d.r(parentActivity2, LocaleController.getString(i10));
                return;
            case 18:
                kd1 kd1Var = (kd1) obj;
                AndroidUtilities.runOnUIThread(new bd1(kd1Var, 1));
                org.telegram.ui.Cells.s1 s1Var = kd1Var.K;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.s1 s1Var2 = kd1Var.K;
                        int O2 = s1Var2.O2(kd1Var.O);
                        id1 id1Var = kd1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = s1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && id1Var != null && (checkBoxBaseArr = id1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f26090p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f26090p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f26091q, true);
                        }
                    }
                    org.telegram.ui.Cells.s1 s1Var3 = kd1Var.K;
                    s1Var3.K7 = -1;
                    s1Var3.invalidate();
                }
                org.telegram.ui.sm smVar = kd1Var.f40743c0;
                if (smVar != null) {
                    AndroidUtilities.runOnUIThread(smVar);
                    kd1Var.f40743c0 = null;
                    return;
                }
                return;
            case 19:
                View view = (View) obj;
                if (z11) {
                    i12 = 0;
                }
                view.setVisibility(i12);
                return;
            case 20:
                vi.j jVar = (vi.j) obj;
                jVar.P = z11;
                jVar.Q = jVar.F();
                jVar.R = 0;
                jVar.S = 0;
                jVar.f50463j.b("torch requested: enabled=" + z11 + ", available=" + jVar.F() + ", cameraId=" + jVar.f50476o + ", facing=" + jVar.G);
                jVar.g();
                return;
            default:
                yh.k kVar = (yh.k) obj;
                ArrayList arrayList3 = kVar.f52670c;
                boolean isEmpty = TextUtils.isEmpty(kVar.f52684t);
                String str3 = kVar.f52684t;
                kVar.f52686w = true;
                kVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) ic.a.g(1, arrayList3);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z11) {
                    eVar = new yh.e(kVar, 1);
                }
                yh.e eVar2 = eVar;
                if (isEmpty) {
                    AndroidUtilities.runOnUIThread(eVar2, 300L);
                }
                kVar.v = kVar.f52673i.getImporters(kVar.f52674j, str3, tL_chatInviteImporter, kVar.d, new bi.s4(kVar, isEmpty, eVar2, str3, z10));
                return;
        }
    }
}
