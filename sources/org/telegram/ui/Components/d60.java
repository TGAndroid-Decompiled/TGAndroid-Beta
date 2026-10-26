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
import org.telegram.ui.gd1;
import org.telegram.ui.id1;
import org.telegram.ui.yc1;
public final class d60 implements Runnable {
    public final int f27409a;
    public final boolean f27410b;
    public final Object f27411c;

    public d60(int i10, Object obj, boolean z10) {
        this.f27409a = i10;
        this.f27411c = obj;
        this.f27410b = z10;
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
        int i11 = this.f27409a;
        yh.e eVar = null;
        int i12 = 8;
        int i13 = 0;
        boolean z11 = this.f27410b;
        Object obj = this.f27411c;
        switch (i11) {
            case 0:
                o60 o60Var = ((h60) obj).H0;
                if (!o60Var.f31191l0) {
                    try {
                        o60Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.lockOrientation(o60Var.f31192n.getParentActivity());
                    if (z11) {
                        j10 = o60Var.f31189k0;
                    } else {
                        j10 = 0;
                    }
                    o60Var.f31185i0 = j10;
                    o60Var.f31183h0 = System.currentTimeMillis();
                    o60Var.f31187j0 = true;
                    o60Var.v();
                    o60Var.invalidate();
                    NotificationCenter.getInstance(o60Var.f31178f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(o60Var.V), Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                an0 an0Var = (an0) obj;
                an0Var.getClass();
                if (z11) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                an0Var.m(str, false);
                return;
            case 2:
                org.telegram.ui.ActionBar.r2 r2Var = ((co0) obj).G;
                if (z11) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                r2Var.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
            case 3:
                aw0 aw0Var = (aw0) obj;
                if (!z11) {
                    aw0Var.f26680o0.setVisibility(8);
                    return;
                } else {
                    aw0Var.getClass();
                    return;
                }
            case 4:
                vs0 vs0Var = (vs0) obj;
                if (!z11) {
                    vs0Var.W.f26691s0.setVisibility(0);
                    return;
                } else {
                    vs0Var.getClass();
                    return;
                }
            case 5:
                zs0 zs0Var = (zs0) obj;
                if (!z11) {
                    zs0Var.f35400w.f26691s0.setVisibility(0);
                    return;
                } else {
                    zs0Var.getClass();
                    return;
                }
            case 6:
                vw0 vw0Var = (vw0) obj;
                ArrayList arrayList = vw0Var.f34290r;
                uw0 uw0Var = vw0Var.f34289n;
                if (uw0Var != null) {
                    uw0Var.I(vw0Var.f34283f, z11);
                }
                while (i13 < arrayList.size()) {
                    ((uw0) arrayList.get(i13)).I(vw0Var.f34283f, z11);
                    i13++;
                }
                return;
            case 7:
                ww0 ww0Var = (ww0) obj;
                ArrayList arrayList2 = ww0Var.f34290r;
                uw0 uw0Var2 = ww0Var.f34289n;
                if (uw0Var2 != null) {
                    uw0Var2.I(ww0Var.f34544n0, z11);
                }
                while (i13 < arrayList2.size()) {
                    ((uw0) arrayList2.get(i13)).I(ww0Var.f34544n0, z11);
                    i13++;
                }
                return;
            case 8:
                ((Utilities.Callback2) obj).run(null, Boolean.valueOf(z11));
                return;
            case 9:
                ((j71) obj).Q(z11);
                return;
            case 10:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj;
                Activity parentActivity = cyVar.getParentActivity();
                if (z11) {
                    j11 = cyVar.getUserConfig().getClientUserId();
                } else {
                    j11 = -1;
                }
                g5.L(parentActivity, j11, new org.telegram.ui.fx(cyVar), cyVar.getResourceProvider());
                return;
            case 11:
                org.telegram.ui.lz lzVar = (org.telegram.ui.lz) obj;
                lzVar.a0(lzVar.O, z11);
                return;
            case 12:
                org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) obj;
                if (!z11) {
                    pc0Var.f42430b.setVisibility(8);
                    return;
                } else {
                    pc0Var.getClass();
                    return;
                }
            case 13:
                org.telegram.ui.gg0 gg0Var = (org.telegram.ui.gg0) obj;
                if (!z11) {
                    gg0Var.W.setVisibility(8);
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
                Activity parentActivity2 = ((org.telegram.ui.j01) obj).e.getParentActivity();
                if (z11) {
                    i10 = R.string.ProfileBotOpenAppInfoOwnerLink;
                } else {
                    i10 = R.string.ProfileBotOpenAppInfoLink;
                }
                qf.d.r(parentActivity2, LocaleController.getString(i10));
                return;
            case 18:
                id1 id1Var = (id1) obj;
                AndroidUtilities.runOnUIThread(new yc1(id1Var, 1));
                org.telegram.ui.Cells.s1 s1Var = id1Var.K;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.s1 s1Var2 = id1Var.K;
                        int O2 = s1Var2.O2(id1Var.O);
                        gd1 gd1Var = id1Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = s1Var2.R8;
                        if (checkBoxBaseArr2 != null && O2 >= 0 && O2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[O2]) != null && gd1Var != null && (checkBoxBaseArr = gd1Var.R8) != null && O2 >= 0 && O2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[O2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f26088p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f26088p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f26089q, true);
                        }
                    }
                    org.telegram.ui.Cells.s1 s1Var3 = id1Var.K;
                    s1Var3.K7 = -1;
                    s1Var3.invalidate();
                }
                org.telegram.ui.qm qmVar = id1Var.f40220c0;
                if (qmVar != null) {
                    AndroidUtilities.runOnUIThread(qmVar);
                    id1Var.f40220c0 = null;
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
                jVar.f50428j.b("torch requested: enabled=" + z11 + ", available=" + jVar.F() + ", cameraId=" + jVar.f50441o + ", facing=" + jVar.G);
                jVar.g();
                return;
            default:
                yh.k kVar = (yh.k) obj;
                ArrayList arrayList3 = kVar.f52612c;
                boolean isEmpty = TextUtils.isEmpty(kVar.f52626t);
                String str3 = kVar.f52626t;
                kVar.f52628w = true;
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
                kVar.v = kVar.f52615i.getImporters(kVar.f52616j, str3, tL_chatInviteImporter, kVar.d, new bi.s4(kVar, isEmpty, eVar2, str3, z10));
                return;
        }
    }
}
