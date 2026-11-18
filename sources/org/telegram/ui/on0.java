package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class on0 implements org.telegram.messenger.x10 {
    public final int f50638a;
    public final PhotoViewer f50639b;

    public on0(PhotoViewer photoViewer, int i7) {
        this.f50638a = i7;
        this.f50639b = photoViewer;
    }

    @Override
    public final void a(Object obj) {
        Bitmap b10;
        float f10;
        int i7;
        float f11;
        float f12;
        float f13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean z14 = true;
        switch (this.f50638a) {
            case 0:
                PhotoViewer photoViewer = this.f50639b;
                tg.b2 b2Var = (tg.b2) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((org.telegram.messenger.xe) photoViewer.f43224g7.get(photoViewer.P4)).f27854i);
                    tg.e2 e2Var = photoViewer.f43297p5;
                    e2Var.M = true;
                    e2Var.F = b2Var;
                    Bitmap n10 = photoViewer.C4.n();
                    int i11 = photoViewer.C4.V;
                    tg.b2 b2Var2 = e2Var.F;
                    if (b2Var2 == null) {
                        b10 = e2Var.J;
                    } else if (!isEmpty && n10 != null) {
                        b10 = e2Var.e(n10);
                    } else {
                        b10 = b2Var2.b();
                    }
                    photoViewer.C4.v0(b10);
                    photoViewer.f43334t5.setUndoCutState(true);
                    photoViewer.Y2(true, true);
                    photoViewer.f43334t5.post(new hn0(photoViewer, 9));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f50639b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (surfaceTexture != null) {
                    TextureView textureView = photoViewer2.C2;
                    if (textureView != null) {
                        if (photoViewer2.L3) {
                            photoViewer2.G3 = 2;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        photoViewer2.C2.setVisibility(0);
                        photoViewer2.F3 = false;
                        photoViewer2.f43208f0.invalidate();
                        org.telegram.messenger.g0.h3(new hn0(photoViewer2, 17), 64L);
                        return;
                    }
                    return;
                }
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                return;
            case 2:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.lc.F(this.f50639b.f43208f0, true).j();
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f50639b;
                photoViewer3.M1.R1 = photoViewer3.L1.c();
                photoViewer3.f43208f0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer3.M1.T1);
                if ((photoViewer3.M1.C0 instanceof tg.m2) && max > 0) {
                    f10 = ((org.telegram.messenger.g0.f24121q.y - max) - org.telegram.messenger.g0.L(80.0f)) - photoViewer3.M1.getSelectedEntityBottom();
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer3.f43327s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer3.f43327s7 = null;
                }
                if (photoViewer3.f43341u4 != 3) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer3.Z5, f10);
                photoViewer3.f43327s7 = ofFloat;
                ofFloat.addUpdateListener(new gn0(photoViewer3, 9));
                photoViewer3.f43327s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer3.f43327s7;
                org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
                valueAnimator2.setInterpolator(lrVar);
                photoViewer3.f43327s7.start();
                AnimatorSet animatorSet = photoViewer3.K1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new gn0(photoViewer3, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer3.K1 = animatorSet2;
                tg.m1 m1Var = photoViewer3.M1.V0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m1Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer3.M1.M0, property, Math.min(0, org.telegram.messenger.g0.L(40.0f) + i7));
                hi.x4 x4Var = photoViewer3.M1.P0;
                Property property2 = View.ALPHA;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(x4Var, property2, f11);
                tg.v0 v0Var = photoViewer3.M1.f57860k0;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(v0Var, property2, f12);
                tg.z0 z0Var = photoViewer3.M1.f57862l0;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(z0Var, property2, f13), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(lrVar);
                animatorSet2.start();
                vp0 vp0Var = photoViewer3.M1;
                tg.e1 e1Var = vp0Var.f57854e1;
                if (e1Var != null) {
                    if (vp0Var.R1) {
                        e1Var.a(2131231513);
                    } else if (vp0Var.Q1) {
                        e1Var.a(2131231505);
                    } else {
                        e1Var.a(2131232044);
                    }
                }
                TextView textView = vp0Var.f57858i1;
                if (!vp0Var.R1 && !vp0Var.Q1) {
                    z10 = true;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                }
                org.telegram.messenger.g0.S3(1.0f, textView, z10, z11);
                ImageView imageView = vp0Var.f57856g1;
                if (!vp0Var.R1 && !vp0Var.Q1) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                org.telegram.messenger.g0.S3(1.0f, imageView, z12, z11);
                TextView textView2 = vp0Var.f57861k1;
                if (!vp0Var.R1 && !vp0Var.Q1) {
                    z13 = z11;
                } else {
                    z13 = true;
                }
                org.telegram.messenger.g0.S3(1.0f, textView2, z13, z11);
                TextView textView3 = vp0Var.f57859j1;
                if (!vp0Var.R1 && !vp0Var.Q1) {
                    z14 = z11;
                }
                org.telegram.messenger.g0.S3(1.0f, textView3, z14, z11);
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f50639b;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (!photoViewer4.f43306q5.f34682b.R && (i10 = photoViewer4.P4) >= 0 && i10 < photoViewer4.f43224g7.size() && (photoViewer4.f43224g7.get(photoViewer4.P4) instanceof org.telegram.messenger.ef)) {
                    org.telegram.ui.Components.ee0 ee0Var = photoViewer4.f43306q5;
                    hi.i3 i3Var = ee0Var.h;
                    if (i3Var != null) {
                        i3Var.dismiss();
                        ee0Var.h = null;
                    }
                    photoViewer4.f43306q5.f34682b.setLoading(true);
                    Utilities.f22782e.c(new jg0((org.telegram.messenger.fs) photoViewer4, (Object) efVar, (Object) ((org.telegram.messenger.ef) photoViewer4.f43224g7.get(photoViewer4.P4)), PhotoViewer.v1(), 4));
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f50639b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer5.f43224g7.get(photoViewer5.P4);
                if (obj2 instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj2).f27868x = num.intValue();
                } else if (obj2 instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj2).f27868x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer5.d.x(photoViewer5.P4)) {
                    photoViewer5.K2();
                }
                photoViewer5.W1.setTimer(num.intValue());
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f50639b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer6.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer6.R7.setTranslationY(photoViewer6.Q0.getTranslationY() - (photoViewer6.V1.getAlpha() * i5.c.d(46.0f, photoViewer6.V1.getEditTextHeight(), 0)));
                }
                photoViewer6.f43209f1.setTranslationY(photoViewer6.V1.getAlpha() * (-i5.c.d(46.0f, num2.intValue(), 0)));
                photoViewer6.f43218g1.setTranslationY(photoViewer6.V1.getAlpha() * (-i5.c.d(46.0f, num2.intValue(), 0)));
                photoViewer6.f43227h1.setTranslationY(photoViewer6.V1.getAlpha() * (-i5.c.d(46.0f, num2.intValue(), 0)));
                hi.i iVar = photoViewer6.V1.N;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer7 = this.f50639b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer7.f43224g7.get(photoViewer7.P4);
                if (obj3 instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj3).f27868x = num3.intValue();
                } else if (obj3 instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj3).f27868x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer7.d.x(photoViewer7.P4)) {
                    photoViewer7.K2();
                }
                photoViewer7.V1.setTimer(num3.intValue());
                return;
            case 8:
                Integer num4 = (Integer) obj;
                hi.i iVar2 = this.f50639b.W1.N;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 9:
                PhotoViewer photoViewer8 = this.f50639b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer8.u0(0, false);
                return;
            default:
                PhotoViewer photoViewer9 = this.f50639b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                photoViewer9.u0(0, false);
                return;
        }
    }
}
