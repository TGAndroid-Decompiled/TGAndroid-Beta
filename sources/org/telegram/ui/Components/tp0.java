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
import org.telegram.ui.d81;
import org.telegram.ui.f81;
import org.telegram.ui.y71;
public final class tp0 implements Runnable {
    public final int f38381a;
    public final boolean f38382b;
    public final Object f38383c;

    public tp0(int i7, Object obj, boolean z9) {
        this.f38381a = i7;
        this.f38383c = obj;
        this.f38382b = z9;
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
        int i10 = this.f38381a;
        int i11 = 8;
        yh.e eVar = null;
        int i12 = 0;
        boolean z10 = this.f38382b;
        Object obj = this.f38383c;
        switch (i10) {
            case 0:
                up0 up0Var = (up0) obj;
                if (!z10) {
                    up0Var.V.f40427s0.setVisibility(0);
                    return;
                } else {
                    up0Var.getClass();
                    return;
                }
            case 1:
                yp0 yp0Var = (yp0) obj;
                if (!z10) {
                    yp0Var.f40705x.f40427s0.setVisibility(0);
                    return;
                } else {
                    yp0Var.getClass();
                    return;
                }
            case 2:
                rt0 rt0Var = (rt0) obj;
                ArrayList arrayList = rt0Var.f37750r;
                qt0 qt0Var = rt0Var.f37749n;
                if (qt0Var != null) {
                    qt0Var.K(rt0Var.f37748f, z10);
                }
                while (i12 < arrayList.size()) {
                    ((qt0) arrayList.get(i12)).K(rt0Var.f37748f, z10);
                    i12++;
                }
                return;
            case 3:
                st0 st0Var = (st0) obj;
                ArrayList arrayList2 = st0Var.f37750r;
                qt0 qt0Var2 = st0Var.f37749n;
                if (qt0Var2 != null) {
                    qt0Var2.K(st0Var.f38121h0, z10);
                }
                while (i12 < arrayList2.size()) {
                    ((qt0) arrayList2.get(i12)).K(st0Var.f38121h0, z10);
                    i12++;
                }
                return;
            case 4:
                ((org.telegram.messenger.v10) obj).a(null, Boolean.valueOf(z10));
                return;
            case 5:
                ((l41) obj).Q(z10);
                return;
            case 6:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj;
                Activity parentActivity = wwVar.getParentActivity();
                if (z10) {
                    j3 = wwVar.getUserConfig().e();
                } else {
                    j3 = -1;
                }
                v4.J(parentActivity, j3, new org.telegram.ui.dv(wwVar), wwVar.getResourceProvider());
                return;
            case 7:
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) obj;
                gyVar.e0(gyVar.O, z10);
                return;
            case 8:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) obj;
                if (!z10) {
                    pa0Var.f48730b.setVisibility(8);
                    return;
                } else {
                    pa0Var.getClass();
                    return;
                }
            case 9:
                org.telegram.ui.ce0 ce0Var = (org.telegram.ui.ce0) obj;
                if (!z10) {
                    ce0Var.W.setVisibility(8);
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
                RectF rectF = ProfileActivity.S6;
                ((ProfileActivity) obj).D5(z10, true);
                return;
            case 12:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (z10) {
                    i12 = 4;
                }
                frameLayout.setVisibility(i12);
                return;
            case 13:
                Activity parentActivity2 = ((org.telegram.ui.jw0) obj).f47049e.getParentActivity();
                if (z10) {
                    i7 = 2131746703;
                } else {
                    i7 = 2131746705;
                }
                vf.c.t(parentActivity2, org.telegram.messenger.hd.M0(i7, null));
                return;
            case 14:
                f81 f81Var = (f81) obj;
                org.telegram.messenger.g0.h3(new y71(f81Var, 1));
                org.telegram.ui.Cells.q1 q1Var = f81Var.K;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.q1 q1Var2 = f81Var.K;
                        int b22 = q1Var2.b2(f81Var.O);
                        d81 d81Var = f81Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.f29826e7;
                        if (checkBoxBaseArr2 != null && b22 >= 0 && b22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[b22]) != null && d81Var != null && (checkBoxBaseArr = d81Var.f29826e7) != null && b22 >= 0 && b22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[b22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f31258p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f31258p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f31259q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = f81Var.K;
                    q1Var3.f29786b6 = -1;
                    q1Var3.invalidate();
                }
                org.telegram.ui.tl tlVar = f81Var.f45560c0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    f81Var.f45560c0 = null;
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
                wi.j jVar = (wi.j) obj;
                jVar.P = z10;
                jVar.Q = jVar.F();
                jVar.R = 0;
                jVar.S = 0;
                jVar.f57925j.b("torch requested: enabled=" + z10 + ", available=" + jVar.F() + ", cameraId=" + jVar.f57937o + ", facing=" + jVar.G);
                jVar.g();
                return;
            default:
                yh.m mVar = (yh.m) obj;
                ArrayList arrayList3 = mVar.f59446c;
                boolean isEmpty = TextUtils.isEmpty(mVar.f59461t);
                String str = mVar.f59461t;
                mVar.f59463w = true;
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
                mVar.v = mVar.f59450i.a(mVar.f59451j, str, tL_chatInviteImporter, mVar.d, new bi.t4(mVar, isEmpty, eVar2, str, z9));
                return;
        }
    }
}
