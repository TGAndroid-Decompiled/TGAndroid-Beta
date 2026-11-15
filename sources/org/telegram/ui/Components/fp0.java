package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c81;
import org.telegram.ui.e81;
import org.telegram.ui.x71;
public final class fp0 implements Runnable {
    public final int f34670a;
    public final boolean f34671b;
    public final Object f34672c;

    public fp0(int i7, Object obj, boolean z10) {
        this.f34670a = i7;
        this.f34672c = obj;
        this.f34671b = z10;
    }

    @Override
    public final void run() {
        long j3;
        int i7;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z10;
        int i10 = this.f34670a;
        zh.e eVar = null;
        int i11 = 8;
        int i12 = 0;
        boolean z11 = this.f34671b;
        Object obj = this.f34672c;
        switch (i10) {
            case 0:
                ys0 ys0Var = (ys0) obj;
                if (!z11) {
                    ys0Var.f42124p0.setVisibility(8);
                    return;
                } else {
                    ys0Var.getClass();
                    return;
                }
            case 1:
                wp0 wp0Var = (wp0) obj;
                if (!z11) {
                    wp0Var.W.f42138t0.setVisibility(8);
                    return;
                } else {
                    wp0Var.getClass();
                    return;
                }
            case 2:
                zp0 zp0Var = (zp0) obj;
                if (!z11) {
                    zp0Var.f42413x.f42138t0.setVisibility(8);
                    return;
                } else {
                    zp0Var.getClass();
                    return;
                }
            case 3:
                st0 st0Var = (st0) obj;
                ArrayList arrayList = st0Var.f39419r;
                rt0 rt0Var = st0Var.f39418n;
                if (rt0Var != null) {
                    rt0Var.L(st0Var.f39417f, z11);
                }
                while (i12 < arrayList.size()) {
                    ((rt0) arrayList.get(i12)).L(st0Var.f39417f, z11);
                    i12++;
                }
                return;
            case 4:
                tt0 tt0Var = (tt0) obj;
                ArrayList arrayList2 = tt0Var.f39419r;
                rt0 rt0Var2 = tt0Var.f39418n;
                if (rt0Var2 != null) {
                    rt0Var2.L(tt0Var.f39806i0, z11);
                }
                while (i12 < arrayList2.size()) {
                    ((rt0) arrayList2.get(i12)).L(tt0Var.f39806i0, z11);
                    i12++;
                }
                return;
            case 5:
                ((org.telegram.messenger.s10) obj).a(null, Boolean.valueOf(z11));
                return;
            case 6:
                ((p41) obj).Q(z11);
                return;
            case 7:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj;
                Activity parentActivity = ywVar.getParentActivity();
                if (z11) {
                    j3 = ywVar.getUserConfig().e();
                } else {
                    j3 = -1;
                }
                t4.J(parentActivity, j3, new org.telegram.ui.ev(ywVar), ywVar.getResourceProvider());
                return;
            case 8:
                org.telegram.ui.hy hyVar = (org.telegram.ui.hy) obj;
                hyVar.e0(hyVar.P, z11);
                return;
            case 9:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) obj;
                if (!z11) {
                    pa0Var.f50171b.setVisibility(8);
                    return;
                } else {
                    pa0Var.getClass();
                    return;
                }
            case 10:
                org.telegram.ui.ce0 ce0Var = (org.telegram.ui.ce0) obj;
                if (!z11) {
                    ce0Var.X.setVisibility(8);
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z11) {
                    photoViewer.W0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.getClass();
                return;
            case 12:
                RectF rectF = ProfileActivity.X6;
                ((ProfileActivity) obj).G5(z11, true);
                return;
            case 13:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (z11) {
                    i12 = 4;
                }
                frameLayout.setVisibility(i12);
                return;
            case 14:
                Activity parentActivity2 = ((org.telegram.ui.iw0) obj).f48123e.getParentActivity();
                if (z11) {
                    i7 = 2131746704;
                } else {
                    i7 = 2131746706;
                }
                vf.c.t(parentActivity2, org.telegram.messenger.hd.M0(i7, null));
                return;
            case 15:
                e81 e81Var = (e81) obj;
                org.telegram.messenger.g0.h3(new x71(e81Var, 1));
                org.telegram.ui.Cells.q1 q1Var = e81Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.q1 q1Var2 = e81Var.L;
                        int c22 = q1Var2.c2(e81Var.P);
                        c81 c81Var = e81Var.J;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.f30976f7;
                        if (checkBoxBaseArr2 != null && c22 >= 0 && c22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[c22]) != null && c81Var != null && (checkBoxBaseArr = c81Var.f30976f7) != null && c22 >= 0 && c22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[c22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f32440p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f32440p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f32441q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = e81Var.L;
                    q1Var3.f30935c6 = -1;
                    q1Var3.invalidate();
                }
                org.telegram.ui.tl tlVar = e81Var.f46626d0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    e81Var.f46626d0 = null;
                    return;
                }
                return;
            case 16:
                View view = (View) obj;
                if (z11) {
                    i11 = 0;
                }
                view.setVisibility(i11);
                return;
            case 17:
                zh.l lVar = (zh.l) obj;
                ArrayList arrayList3 = lVar.f61444c;
                boolean isEmpty = TextUtils.isEmpty(lVar.f61459t);
                String str = lVar.f61459t;
                lVar.f61461w = true;
                lVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) i5.c.h(1, arrayList3);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z11) {
                    eVar = new zh.e(lVar, 1);
                }
                zh.e eVar2 = eVar;
                if (isEmpty) {
                    org.telegram.messenger.g0.i3(eVar2, 300L);
                }
                lVar.v = lVar.f61448i.a(lVar.f61449j, str, tL_chatInviteImporter, lVar.d, new di.u3(lVar, isEmpty, eVar2, str, z10));
                return;
            default:
                zi.l lVar2 = (zi.l) obj;
                lVar2.O = z11;
                lVar2.P = lVar2.F();
                lVar2.Q = 0;
                lVar2.R = 0;
                lVar2.f61579j.b("torch requested: enabled=" + z11 + ", available=" + lVar2.F() + ", cameraId=" + lVar2.f61591o + ", facing=" + lVar2.F);
                lVar2.f();
                return;
        }
    }
}
