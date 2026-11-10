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
import org.telegram.ui.b81;
import org.telegram.ui.g81;
import org.telegram.ui.i81;
public final class tp0 implements Runnable {
    public final int f38359a;
    public final boolean f38360b;
    public final Object f38361c;

    public tp0(int i7, Object obj, boolean z9) {
        this.f38359a = i7;
        this.f38361c = obj;
        this.f38360b = z9;
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
        int i10 = this.f38359a;
        yh.e eVar = null;
        int i11 = 8;
        int i12 = 0;
        boolean z10 = this.f38360b;
        Object obj = this.f38361c;
        switch (i10) {
            case 0:
                up0 up0Var = (up0) obj;
                if (!z10) {
                    up0Var.V.f40706s0.setVisibility(8);
                    return;
                } else {
                    up0Var.getClass();
                    return;
                }
            case 1:
                yp0 yp0Var = (yp0) obj;
                if (!z10) {
                    yp0Var.f40632x.f40706s0.setVisibility(8);
                    return;
                } else {
                    yp0Var.getClass();
                    return;
                }
            case 2:
                st0 st0Var = (st0) obj;
                ArrayList arrayList = st0Var.f38071r;
                rt0 rt0Var = st0Var.f38070n;
                if (rt0Var != null) {
                    rt0Var.K(st0Var.f38069f, z10);
                }
                while (i12 < arrayList.size()) {
                    ((rt0) arrayList.get(i12)).K(st0Var.f38069f, z10);
                    i12++;
                }
                return;
            case 3:
                tt0 tt0Var = (tt0) obj;
                ArrayList arrayList2 = tt0Var.f38071r;
                rt0 rt0Var2 = tt0Var.f38070n;
                if (rt0Var2 != null) {
                    rt0Var2.K(tt0Var.f38399h0, z10);
                }
                while (i12 < arrayList2.size()) {
                    ((rt0) arrayList2.get(i12)).K(tt0Var.f38399h0, z10);
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
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) obj;
                Activity parentActivity = zwVar.getParentActivity();
                if (z10) {
                    j3 = zwVar.getUserConfig().e();
                } else {
                    j3 = -1;
                }
                u4.J(parentActivity, j3, new org.telegram.ui.gv(zwVar), zwVar.getResourceProvider());
                return;
            case 7:
                org.telegram.ui.jy jyVar = (org.telegram.ui.jy) obj;
                jyVar.e0(jyVar.O, z10);
                return;
            case 8:
                org.telegram.ui.sa0 sa0Var = (org.telegram.ui.sa0) obj;
                if (!z10) {
                    sa0Var.f49769b.setVisibility(8);
                    return;
                } else {
                    sa0Var.getClass();
                    return;
                }
            case 9:
                org.telegram.ui.fe0 fe0Var = (org.telegram.ui.fe0) obj;
                if (!z10) {
                    fe0Var.W.setVisibility(8);
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
                Activity parentActivity2 = ((org.telegram.ui.mw0) obj).f48065e.getParentActivity();
                if (z10) {
                    i7 = 2131746704;
                } else {
                    i7 = 2131746706;
                }
                vf.c.t(parentActivity2, org.telegram.messenger.id.M0(i7, null));
                return;
            case 14:
                i81 i81Var = (i81) obj;
                org.telegram.messenger.g0.h3(new b81(i81Var, 1));
                org.telegram.ui.Cells.q1 q1Var = i81Var.K;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.q1 q1Var2 = i81Var.K;
                        int b22 = q1Var2.b2(i81Var.O);
                        g81 g81Var = i81Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.f29844e7;
                        if (checkBoxBaseArr2 != null && b22 >= 0 && b22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[b22]) != null && g81Var != null && (checkBoxBaseArr = g81Var.f29844e7) != null && b22 >= 0 && b22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[b22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f31278p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f31278p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f31279q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = i81Var.K;
                    q1Var3.f29804b6 = -1;
                    q1Var3.invalidate();
                }
                org.telegram.ui.vl vlVar = i81Var.f46563c0;
                if (vlVar != null) {
                    org.telegram.messenger.g0.h3(vlVar);
                    i81Var.f46563c0 = null;
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
                kVar.f58040j.b("torch requested: enabled=" + z10 + ", available=" + kVar.F() + ", cameraId=" + kVar.f58052o + ", facing=" + kVar.F);
                kVar.f();
                return;
            default:
                yh.m mVar = (yh.m) obj;
                ArrayList arrayList3 = mVar.f59552c;
                boolean isEmpty = TextUtils.isEmpty(mVar.f59567t);
                String str = mVar.f59567t;
                mVar.f59569w = true;
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
                mVar.v = mVar.f59556i.a(mVar.f59557j, str, tL_chatInviteImporter, mVar.d, new bi.t4(mVar, isEmpty, eVar2, str, z9));
                return;
        }
    }
}
