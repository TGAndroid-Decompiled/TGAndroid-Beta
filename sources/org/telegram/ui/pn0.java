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
public final class pn0 implements org.telegram.messenger.w10 {
    public final int f51083a;
    public final PhotoViewer f51084b;

    public pn0(PhotoViewer photoViewer, int i7) {
        this.f51083a = i7;
        this.f51084b = photoViewer;
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
        switch (this.f51083a) {
            case 0:
                PhotoViewer photoViewer = this.f51084b;
                tg.f2 f2Var = (tg.f2) obj;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((org.telegram.messenger.xe) photoViewer.f43350g7.get(photoViewer.P4)).f27968i);
                    tg.i2 i2Var = photoViewer.f43423p5;
                    i2Var.M = true;
                    i2Var.F = f2Var;
                    Bitmap n10 = photoViewer.C4.n();
                    int i11 = photoViewer.C4.V;
                    tg.f2 f2Var2 = i2Var.F;
                    if (f2Var2 == null) {
                        b10 = i2Var.J;
                    } else if (!isEmpty && n10 != null) {
                        b10 = i2Var.e(n10);
                    } else {
                        b10 = f2Var2.b();
                    }
                    photoViewer.C4.w0(b10);
                    photoViewer.f43460t5.setUndoCutState(true);
                    photoViewer.Z2(true, true);
                    photoViewer.f43460t5.post(new kn0(photoViewer, 9));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f51084b;
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
                        photoViewer2.f43334f0.invalidate();
                        org.telegram.messenger.g0.h3(new kn0(photoViewer2, 12), 64L);
                        return;
                    }
                    return;
                }
                Drawable[] drawableArr2 = PhotoViewer.f43272f9;
                return;
            case 2:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.kc.F(this.f51084b.f43334f0, true).j();
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f51084b;
                photoViewer3.M1.V1 = photoViewer3.L1.c();
                photoViewer3.f43334f0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer3.M1.X1);
                if ((photoViewer3.M1.C0 instanceof tg.q2) && max > 0) {
                    f10 = ((org.telegram.messenger.g0.f24226q.y - max) - org.telegram.messenger.g0.L(80.0f)) - photoViewer3.M1.getSelectedEntityBottom();
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer3.f43509y7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer3.f43509y7 = null;
                }
                if (photoViewer3.f43467u4 != 3) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer3.Z5, f10);
                photoViewer3.f43509y7 = ofFloat;
                ofFloat.addUpdateListener(new en0(photoViewer3, 10));
                photoViewer3.f43509y7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer3.f43509y7;
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
                valueAnimator2.setInterpolator(krVar);
                photoViewer3.f43509y7.start();
                AnimatorSet animatorSet = photoViewer3.K1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new en0(photoViewer3, 9));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer3.K1 = animatorSet2;
                tg.r1 r1Var = photoViewer3.M1.V0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r1Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer3.M1.M0, property, Math.min(0, org.telegram.messenger.g0.L(40.0f) + i7));
                hi.i5 i5Var = photoViewer3.M1.P0;
                Property property2 = View.ALPHA;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(i5Var, property2, f11);
                tg.a1 a1Var = photoViewer3.M1.f58034k0;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(a1Var, property2, f12);
                tg.e1 e1Var = photoViewer3.M1.f58036l0;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(e1Var, property2, f13), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(krVar);
                animatorSet2.start();
                vp0 vp0Var = photoViewer3.M1;
                tg.j1 j1Var = vp0Var.f58028e1;
                if (j1Var != null) {
                    if (vp0Var.V1) {
                        j1Var.a(2131231516);
                    } else if (vp0Var.U1) {
                        j1Var.a(2131231508);
                    } else {
                        j1Var.a(2131232047);
                    }
                }
                TextView textView = vp0Var.f58032i1;
                if (!vp0Var.V1 && !vp0Var.U1) {
                    z10 = true;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                }
                org.telegram.messenger.g0.S3(1.0f, textView, z10, z11);
                ImageView imageView = vp0Var.f58030g1;
                if (!vp0Var.V1 && !vp0Var.U1) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                org.telegram.messenger.g0.S3(1.0f, imageView, z12, z11);
                TextView textView2 = vp0Var.f58035k1;
                if (!vp0Var.V1 && !vp0Var.U1) {
                    z13 = z11;
                } else {
                    z13 = true;
                }
                org.telegram.messenger.g0.S3(1.0f, textView2, z13, z11);
                TextView textView3 = vp0Var.f58033j1;
                if (!vp0Var.V1 && !vp0Var.U1) {
                    z14 = z11;
                }
                org.telegram.messenger.g0.S3(1.0f, textView3, z14, z11);
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f51084b;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (!photoViewer4.f43432q5.f34696b.R && (i10 = photoViewer4.P4) >= 0 && i10 < photoViewer4.f43350g7.size() && (photoViewer4.f43350g7.get(photoViewer4.P4) instanceof org.telegram.messenger.ef)) {
                    org.telegram.ui.Components.ee0 ee0Var = photoViewer4.f43432q5;
                    hi.q3 q3Var = ee0Var.h;
                    if (q3Var != null) {
                        q3Var.dismiss();
                        ee0Var.h = null;
                    }
                    photoViewer4.f43432q5.f34696b.setLoading(true);
                    Utilities.f22877e.c(new yd0(photoViewer4, efVar, (org.telegram.messenger.ef) photoViewer4.f43350g7.get(photoViewer4.P4), PhotoViewer.v1(), 5));
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f51084b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer5.f43350g7.get(photoViewer5.P4);
                if (obj2 instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj2).f27982x = num.intValue();
                } else if (obj2 instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj2).f27982x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer5.d.x(photoViewer5.P4)) {
                    photoViewer5.L2();
                }
                photoViewer5.W1.setTimer(num.intValue());
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f51084b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer6.X7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer6.X7.setTranslationY(photoViewer6.Q0.getTranslationY() - (photoViewer6.V1.getAlpha() * i5.c.d(46.0f, photoViewer6.V1.getEditTextHeight(), 0)));
                }
                photoViewer6.f43335f1.setTranslationY(photoViewer6.V1.getAlpha() * (-i5.c.d(46.0f, num2.intValue(), 0)));
                photoViewer6.f43344g1.setTranslationY(photoViewer6.V1.getAlpha() * (-i5.c.d(46.0f, num2.intValue(), 0)));
                photoViewer6.f43353h1.setTranslationY(photoViewer6.V1.getAlpha() * (-i5.c.d(46.0f, num2.intValue(), 0)));
                hi.j jVar = photoViewer6.V1.N;
                if (jVar != null) {
                    jVar.setTranslationY((-num2.intValue()) - org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer7 = this.f51084b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer7.f43350g7.get(photoViewer7.P4);
                if (obj3 instanceof org.telegram.messenger.ef) {
                    ((org.telegram.messenger.ef) obj3).f27982x = num3.intValue();
                } else if (obj3 instanceof org.telegram.messenger.hf) {
                    ((org.telegram.messenger.hf) obj3).f27982x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer7.d.x(photoViewer7.P4)) {
                    photoViewer7.L2();
                }
                photoViewer7.V1.setTimer(num3.intValue());
                return;
            case 8:
                Integer num4 = (Integer) obj;
                hi.j jVar2 = this.f51084b.W1.N;
                if (jVar2 != null) {
                    jVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 9:
                PhotoViewer photoViewer8 = this.f51084b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.f43272f9;
                photoViewer8.u0(0, false);
                return;
            default:
                PhotoViewer photoViewer9 = this.f51084b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr4 = PhotoViewer.f43272f9;
                photoViewer9.u0(0, false);
                return;
        }
    }
}
