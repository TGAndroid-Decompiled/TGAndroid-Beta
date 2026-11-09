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
import org.telegram.ui.a81;
import org.telegram.ui.f81;
import org.telegram.ui.h81;
public final class up0 implements Runnable {
    public final int f38765a;
    public final boolean f38766b;
    public final Object f38767c;

    public up0(int i7, Object obj, boolean z9) {
        this.f38765a = i7;
        this.f38767c = obj;
        this.f38766b = z9;
    }

    @Override
    public final void run() {
        long j3;
        int i7;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z9;
        int i10 = this.f38765a;
        yh.e eVar = null;
        int i11 = 8;
        int i12 = 0;
        boolean z10 = this.f38766b;
        Object obj = this.f38767c;
        switch (i10) {
            case 0:
                vp0 vp0Var = (vp0) obj;
                if (!z10) {
                    vp0Var.V.f41114s0.setVisibility(8);
                    return;
                } else {
                    vp0Var.getClass();
                    return;
                }
            case 1:
                zp0 zp0Var = (zp0) obj;
                if (!z10) {
                    zp0Var.f41040x.f41114s0.setVisibility(8);
                    return;
                } else {
                    zp0Var.getClass();
                    return;
                }
            case 2:
                tt0 tt0Var = (tt0) obj;
                ArrayList arrayList = tt0Var.f38499r;
                st0 st0Var = tt0Var.f38498n;
                if (st0Var != null) {
                    st0Var.K(tt0Var.f38497f, z10);
                }
                while (i12 < arrayList.size()) {
                    ((st0) arrayList.get(i12)).K(tt0Var.f38497f, z10);
                    i12++;
                }
                return;
            case 3:
                ut0 ut0Var = (ut0) obj;
                ArrayList arrayList2 = ut0Var.f38499r;
                st0 st0Var2 = ut0Var.f38498n;
                if (st0Var2 != null) {
                    st0Var2.K(ut0Var.f38805h0, z10);
                }
                while (i12 < arrayList2.size()) {
                    ((st0) arrayList2.get(i12)).K(ut0Var.f38805h0, z10);
                    i12++;
                }
                return;
            case 4:
                ((org.telegram.messenger.v10) obj).a(null, Boolean.valueOf(z10));
                return;
            case 5:
                ((m41) obj).Q(z10);
                return;
            case 6:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj;
                Activity parentActivity = ywVar.getParentActivity();
                if (z10) {
                    j3 = ywVar.getUserConfig().e();
                } else {
                    j3 = -1;
                }
                v4.J(parentActivity, j3, new org.telegram.ui.fv(ywVar), ywVar.getResourceProvider());
                return;
            case 7:
                org.telegram.ui.iy iyVar = (org.telegram.ui.iy) obj;
                iyVar.e0(iyVar.O, z10);
                return;
            case 8:
                org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) obj;
                if (!z10) {
                    ra0Var.f49360b.setVisibility(8);
                    return;
                } else {
                    ra0Var.getClass();
                    return;
                }
            case 9:
                org.telegram.ui.ee0 ee0Var = (org.telegram.ui.ee0) obj;
                if (!z10) {
                    ee0Var.W.setVisibility(8);
                    return;
                }
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.V0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.getClass();
                return;
            case 11:
                RectF rectF = ProfileActivity.V6;
                ((ProfileActivity) obj).G5(z10, true);
                return;
            case 12:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (z10) {
                    i12 = 4;
                }
                frameLayout.setVisibility(i12);
                return;
            case 13:
                Activity parentActivity2 = ((org.telegram.ui.lw0) obj).f47690e.getParentActivity();
                if (z10) {
                    i7 = 2131746704;
                } else {
                    i7 = 2131746706;
                }
                vf.c.t(parentActivity2, org.telegram.messenger.id.M0(i7, null));
                return;
            case 14:
                h81 h81Var = (h81) obj;
                org.telegram.messenger.g0.h3(new a81(h81Var, 1));
                org.telegram.ui.Cells.q1 q1Var = h81Var.K;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.q1 q1Var2 = h81Var.K;
                        int b22 = q1Var2.b2(h81Var.O);
                        f81 f81Var = h81Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.f29833e7;
                        if (checkBoxBaseArr2 != null && b22 >= 0 && b22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[b22]) != null && f81Var != null && (checkBoxBaseArr = f81Var.f29833e7) != null && b22 >= 0 && b22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[b22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f31267p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f31267p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f31268q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = h81Var.K;
                    q1Var3.f29793b6 = -1;
                    q1Var3.invalidate();
                }
                org.telegram.ui.vl vlVar = h81Var.f46250c0;
                if (vlVar != null) {
                    org.telegram.messenger.g0.h3(vlVar);
                    h81Var.f46250c0 = null;
                    return;
                }
                return;
            case 15:
                View view = (View) obj;
                if (z10) {
                    i11 = 0;
                }
                view.setVisibility(i11);
                return;
            case 16:
                wi.k kVar = (wi.k) obj;
                kVar.O = z10;
                kVar.P = kVar.F();
                kVar.Q = 0;
                kVar.R = 0;
                kVar.f58036j.b("torch requested: enabled=" + z10 + ", available=" + kVar.F() + ", cameraId=" + kVar.f58048o + ", facing=" + kVar.F);
                kVar.f();
                return;
            default:
                yh.m mVar = (yh.m) obj;
                ArrayList arrayList3 = mVar.f59554c;
                boolean isEmpty = TextUtils.isEmpty(mVar.f59569t);
                String str = mVar.f59569t;
                mVar.f59571w = true;
                mVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) jg.g.i(1, arrayList3);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (isEmpty && z9 && z10) {
                    eVar = new yh.e(mVar, 1);
                }
                yh.e eVar2 = eVar;
                if (isEmpty) {
                    org.telegram.messenger.g0.i3(eVar2, 300L);
                }
                mVar.v = mVar.f59558i.a(mVar.f59559j, str, tL_chatInviteImporter, mVar.d, new bi.t4(mVar, isEmpty, eVar2, str, z9));
                return;
        }
    }
}
