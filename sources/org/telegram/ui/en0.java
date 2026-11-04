package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class en0 implements org.telegram.messenger.u10 {
    public final int f45008a;
    public final PhotoViewer f45009b;

    public en0(PhotoViewer photoViewer, int i3) {
        this.f45008a = i3;
        this.f45009b = photoViewer;
    }

    @Override
    public final void a(Object obj) {
        Bitmap b10;
        float f10;
        int i3;
        float f11;
        float f12;
        float f13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean z14 = true;
        switch (this.f45008a) {
            case 0:
                PhotoViewer photoViewer = this.f45009b;
                ug.z1 z1Var = (ug.z1) obj;
                Drawable[] drawableArr = PhotoViewer.V8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((org.telegram.messenger.se) photoViewer.h7.get(photoViewer.Q4)).f25315i);
                    ug.c2 c2Var = photoViewer.f41518q5;
                    c2Var.M = true;
                    c2Var.F = z1Var;
                    Bitmap n4 = photoViewer.D4.n();
                    int i11 = photoViewer.D4.V;
                    ug.z1 z1Var2 = c2Var.F;
                    if (z1Var2 == null) {
                        b10 = c2Var.J;
                    } else if (!isEmpty && n4 != null) {
                        b10 = c2Var.e(n4);
                    } else {
                        b10 = z1Var2.b();
                    }
                    photoViewer.D4.v0(b10);
                    photoViewer.f41554u5.setUndoCutState(true);
                    photoViewer.d3(true, true);
                    photoViewer.f41554u5.post(new xm0(photoViewer, 9));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.fc.F(this.f45009b.f41420f0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f45009b;
                photoViewer2.M1.R1 = photoViewer2.L1.c();
                photoViewer2.f41420f0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.M1.T1);
                if ((photoViewer2.M1.C0 instanceof ug.l2) && max > 0) {
                    f10 = ((org.telegram.messenger.g0.f22608q.y - max) - org.telegram.messenger.g0.L(80.0f)) - photoViewer2.M1.getSelectedEntityBottom();
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f41547t7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f41547t7 = null;
                }
                if (photoViewer2.f41562v4 != 3) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.f41378a6, f10);
                photoViewer2.f41547t7 = ofFloat;
                ofFloat.addUpdateListener(new wm0(photoViewer2, 9));
                photoViewer2.f41547t7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f41547t7;
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                valueAnimator2.setInterpolator(xqVar);
                photoViewer2.f41547t7.start();
                AnimatorSet animatorSet = photoViewer2.K1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new wm0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.K1 = animatorSet2;
                ug.l1 l1Var = photoViewer2.M1.V0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l1Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.M1.M0, property, Math.min(0, org.telegram.messenger.g0.L(40.0f) + i3));
                gi.y4 y4Var = photoViewer2.M1.P0;
                Property property2 = View.ALPHA;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(y4Var, property2, f11);
                ug.u0 u0Var = photoViewer2.M1.f55974k0;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(u0Var, property2, f12);
                ug.y0 y0Var = photoViewer2.M1.f55975l0;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(y0Var, property2, f13), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(xqVar);
                animatorSet2.start();
                lp0 lp0Var = photoViewer2.M1;
                ug.d1 d1Var = lp0Var.f55968e1;
                if (d1Var != null) {
                    if (lp0Var.R1) {
                        d1Var.a(2131231512);
                    } else if (lp0Var.Q1) {
                        d1Var.a(2131231504);
                    } else {
                        d1Var.a(2131232042);
                    }
                }
                TextView textView = lp0Var.f55972i1;
                if (!lp0Var.R1 && !lp0Var.Q1) {
                    z10 = true;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                }
                org.telegram.messenger.g0.U3(1.0f, textView, z10, z11);
                ImageView imageView = lp0Var.f55970g1;
                if (!lp0Var.R1 && !lp0Var.Q1) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                org.telegram.messenger.g0.U3(1.0f, imageView, z12, z11);
                TextView textView2 = lp0Var.k1;
                if (!lp0Var.R1 && !lp0Var.Q1) {
                    z13 = z11;
                } else {
                    z13 = true;
                }
                org.telegram.messenger.g0.U3(1.0f, textView2, z13, z11);
                TextView textView3 = lp0Var.f55973j1;
                if (!lp0Var.R1 && !lp0Var.Q1) {
                    z14 = z11;
                }
                org.telegram.messenger.g0.U3(1.0f, textView3, z14, z11);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f45009b;
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                if (!photoViewer3.r5.f36807b.R && (i10 = photoViewer3.Q4) >= 0 && i10 < photoViewer3.h7.size() && (photoViewer3.h7.get(photoViewer3.Q4) instanceof org.telegram.messenger.ye)) {
                    org.telegram.ui.Components.od0 od0Var = photoViewer3.r5;
                    gi.h3 h3Var = od0Var.h;
                    if (h3Var != null) {
                        h3Var.dismiss();
                        od0Var.h = null;
                    }
                    photoViewer3.r5.f36807b.setLoading(true);
                    Utilities.f21387e.c(new ih0(photoViewer3, yeVar, (org.telegram.messenger.ye) photoViewer3.h7.get(photoViewer3.Q4), PhotoViewer.A1(), 3));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f45009b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.h7.get(photoViewer4.Q4);
                if (obj2 instanceof org.telegram.messenger.ye) {
                    ((org.telegram.messenger.ye) obj2).f25329x = num.intValue();
                } else if (obj2 instanceof org.telegram.messenger.bf) {
                    ((org.telegram.messenger.bf) obj2).f25329x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.Q4)) {
                    photoViewer4.P2();
                }
                photoViewer4.W1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f45009b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.S7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.S7.setTranslationY(photoViewer5.Q0.getTranslationY() - (photoViewer5.V1.getAlpha() * k2.p1.d(46.0f, photoViewer5.V1.getEditTextHeight(), 0)));
                }
                photoViewer5.f41421f1.setTranslationY(photoViewer5.V1.getAlpha() * (-k2.p1.d(46.0f, num2.intValue(), 0)));
                photoViewer5.f41430g1.setTranslationY(photoViewer5.V1.getAlpha() * (-k2.p1.d(46.0f, num2.intValue(), 0)));
                photoViewer5.f41438h1.setTranslationY(photoViewer5.V1.getAlpha() * (-k2.p1.d(46.0f, num2.intValue(), 0)));
                gi.i iVar = photoViewer5.V1.N;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f45009b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.h7.get(photoViewer6.Q4);
                if (obj3 instanceof org.telegram.messenger.ye) {
                    ((org.telegram.messenger.ye) obj3).f25329x = num3.intValue();
                } else if (obj3 instanceof org.telegram.messenger.bf) {
                    ((org.telegram.messenger.bf) obj3).f25329x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.Q4)) {
                    photoViewer6.P2();
                }
                photoViewer6.V1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                gi.i iVar2 = this.f45009b.W1.N;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f45009b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer7.C0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f45009b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer8.C0(0, false);
                return;
        }
    }
}
