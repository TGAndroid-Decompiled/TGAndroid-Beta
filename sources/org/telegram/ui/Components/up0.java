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
import org.telegram.ui.p71;
import org.telegram.ui.u71;
import org.telegram.ui.w71;
public final class up0 implements Runnable {
    public final int f38837a;
    public final boolean f38838b;
    public final Object f38839c;

    public up0(int i3, Object obj, boolean z10) {
        this.f38837a = i3;
        this.f38839c = obj;
        this.f38838b = z10;
    }

    @Override
    public final void run() {
        long j10;
        int i3;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        boolean z10;
        int i10 = this.f38837a;
        int i11 = 8;
        zh.e eVar = null;
        int i12 = 0;
        boolean z11 = this.f38838b;
        Object obj = this.f38839c;
        switch (i10) {
            case 0:
                vp0 vp0Var = (vp0) obj;
                if (!z11) {
                    vp0Var.W.f40128t0.setVisibility(0);
                    return;
                } else {
                    vp0Var.getClass();
                    return;
                }
            case 1:
                yp0 yp0Var = (yp0) obj;
                if (!z11) {
                    yp0Var.f40802x.f40128t0.setVisibility(0);
                    return;
                } else {
                    yp0Var.getClass();
                    return;
                }
            case 2:
                qt0 qt0Var = (qt0) obj;
                ArrayList arrayList = qt0Var.f37537r;
                pt0 pt0Var = qt0Var.f37536n;
                if (pt0Var != null) {
                    pt0Var.K(qt0Var.f37535f, z11);
                }
                while (i12 < arrayList.size()) {
                    ((pt0) arrayList.get(i12)).K(qt0Var.f37535f, z11);
                    i12++;
                }
                return;
            case 3:
                rt0 rt0Var = (rt0) obj;
                ArrayList arrayList2 = rt0Var.f37537r;
                pt0 pt0Var2 = rt0Var.f37536n;
                if (pt0Var2 != null) {
                    pt0Var2.K(rt0Var.f37799i0, z11);
                }
                while (i12 < arrayList2.size()) {
                    ((pt0) arrayList2.get(i12)).K(rt0Var.f37799i0, z11);
                    i12++;
                }
                return;
            case 4:
                ((org.telegram.messenger.n10) obj).a(null, Boolean.valueOf(z11));
                return;
            case 5:
                ((f41) obj).Q(z11);
                return;
            case 6:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj;
                Activity parentActivity = uwVar.getParentActivity();
                if (z11) {
                    j10 = uwVar.getUserConfig().e();
                } else {
                    j10 = -1;
                }
                t4.L(parentActivity, j10, new org.telegram.ui.av(uwVar), uwVar.getResourceProvider());
                return;
            case 7:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj;
                cyVar.e0(cyVar.P, z11);
                return;
            case 8:
                org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) obj;
                if (!z11) {
                    la0Var.f47241b.setVisibility(8);
                    return;
                } else {
                    la0Var.getClass();
                    return;
                }
            case 9:
                org.telegram.ui.xd0 xd0Var = (org.telegram.ui.xd0) obj;
                if (!z11) {
                    xd0Var.X.setVisibility(8);
                    return;
                }
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z11) {
                    photoViewer.W0.setVisibility(8);
                    return;
                }
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.getClass();
                return;
            case 11:
                RectF rectF = ProfileActivity.T6;
                ((ProfileActivity) obj).D5(z11, true);
                return;
            case 12:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (z11) {
                    i12 = 4;
                }
                frameLayout.setVisibility(i12);
                return;
            case 13:
                Activity parentActivity2 = ((org.telegram.ui.bw0) obj).f44157e.getParentActivity();
                if (z11) {
                    i3 = 2131746712;
                } else {
                    i3 = 2131746714;
                }
                sf.c.t(parentActivity2, org.telegram.messenger.bd.M0(i3, null));
                return;
            case 14:
                w71 w71Var = (w71) obj;
                org.telegram.messenger.g0.h3(new p71(w71Var, 1));
                org.telegram.ui.Cells.q1 q1Var = w71Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z11) {
                        org.telegram.ui.Cells.q1 q1Var2 = w71Var.L;
                        int b22 = q1Var2.b2(w71Var.P);
                        u71 u71Var = w71Var.J;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.f29901e7;
                        if (checkBoxBaseArr2 != null && b22 >= 0 && b22 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[b22]) != null && u71Var != null && (checkBoxBaseArr = u71Var.f29901e7) != null && b22 >= 0 && b22 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[b22]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f31333p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f31333p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f31334q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = w71Var.L;
                    q1Var3.f29860b6 = -1;
                    q1Var3.invalidate();
                }
                org.telegram.ui.pl plVar = w71Var.f50737d0;
                if (plVar != null) {
                    org.telegram.messenger.g0.h3(plVar);
                    w71Var.f50737d0 = null;
                    return;
                }
                return;
            case 15:
                View view = (View) obj;
                if (z11) {
                    i11 = 0;
                }
                view.setVisibility(i11);
                return;
            case 16:
                wi.j jVar = (wi.j) obj;
                jVar.P = z11;
                jVar.Q = jVar.F();
                jVar.R = 0;
                jVar.S = 0;
                jVar.f57884j.b("torch requested: enabled=" + z11 + ", available=" + jVar.F() + ", cameraId=" + jVar.f57896o + ", facing=" + jVar.G);
                jVar.g();
                return;
            default:
                zh.k kVar = (zh.k) obj;
                ArrayList arrayList3 = kVar.f60582c;
                boolean isEmpty = TextUtils.isEmpty(kVar.f60597t);
                String str = kVar.f60597t;
                kVar.f60599w = true;
                kVar.A = false;
                if (isEmpty && !arrayList3.isEmpty()) {
                    tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) k2.p1.h(1, arrayList3);
                } else {
                    tL_chatInviteImporter = null;
                }
                if (tL_chatInviteImporter == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (isEmpty && z10 && z11) {
                    eVar = new zh.e(kVar, 1);
                }
                zh.e eVar2 = eVar;
                if (isEmpty) {
                    org.telegram.messenger.g0.i3(eVar2, 300L);
                }
                kVar.v = kVar.f60586i.a(kVar.f60587j, str, tL_chatInviteImporter, kVar.d, new ci.d4(kVar, isEmpty, eVar2, str, z10));
                return;
        }
    }
}
