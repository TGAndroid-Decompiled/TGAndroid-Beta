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
public final class jn0 implements org.telegram.messenger.c20 {
    public final int f47011a;
    public final PhotoViewer f47012b;

    public jn0(PhotoViewer photoViewer, int i7) {
        this.f47011a = i7;
        this.f47012b = photoViewer;
    }

    @Override
    public final void a(Object obj) {
        Bitmap b10;
        float f10;
        int i7;
        float f11;
        float f12;
        float f13;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13 = true;
        switch (this.f47011a) {
            case 0:
                PhotoViewer photoViewer = this.f47012b;
                tg.z1 z1Var = (tg.z1) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((org.telegram.messenger.ze) photoViewer.f41397f7.get(photoViewer.O4)).f26829i);
                    tg.c2 c2Var = photoViewer.f41470o5;
                    c2Var.L = true;
                    c2Var.E = z1Var;
                    Bitmap n10 = photoViewer.B4.n();
                    int i11 = photoViewer.B4.U;
                    tg.z1 z1Var2 = c2Var.E;
                    if (z1Var2 == null) {
                        b10 = c2Var.I;
                    } else if (!isEmpty && n10 != null) {
                        b10 = c2Var.e(n10);
                    } else {
                        b10 = z1Var2.b();
                    }
                    photoViewer.B4.v0(b10);
                    photoViewer.s5.setUndoCutState(true);
                    photoViewer.X2(true, true);
                    photoViewer.s5.post(new cn0(photoViewer, 9));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f47012b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (surfaceTexture != null) {
                    TextureView textureView = photoViewer2.B2;
                    if (textureView != null) {
                        if (photoViewer2.K3) {
                            photoViewer2.F3 = 2;
                        }
                        textureView.setSurfaceTexture(surfaceTexture);
                        photoViewer2.B2.setVisibility(0);
                        photoViewer2.E3 = false;
                        photoViewer2.f41380e0.invalidate();
                        org.telegram.messenger.g0.i3(new cn0(photoViewer2, 17), 64L);
                        return;
                    }
                    return;
                }
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                return;
            case 2:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.hc.F(this.f47012b.f41380e0, true).j();
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f47012b;
                photoViewer3.L1.Q1 = photoViewer3.K1.c();
                photoViewer3.f41380e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer3.L1.S1);
                if ((photoViewer3.L1.B0 instanceof tg.k2) && max > 0) {
                    f10 = ((org.telegram.messenger.g0.f22544q.y - max) - org.telegram.messenger.g0.L(80.0f)) - photoViewer3.L1.getSelectedEntityBottom();
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer3.f41500r7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer3.f41500r7 = null;
                }
                if (photoViewer3.f41515t4 != 3) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer3.Y5, f10);
                photoViewer3.f41500r7 = ofFloat;
                ofFloat.addUpdateListener(new bn0(photoViewer3, 9));
                photoViewer3.f41500r7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer3.f41500r7;
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                valueAnimator2.setInterpolator(xqVar);
                photoViewer3.f41500r7.start();
                AnimatorSet animatorSet = photoViewer3.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new bn0(photoViewer3, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer3.J1 = animatorSet2;
                tg.m1 m1Var = photoViewer3.L1.U0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m1Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer3.L1.L0, property, Math.min(0, org.telegram.messenger.g0.L(40.0f) + i7));
                fi.a5 a5Var = photoViewer3.L1.O0;
                Property property2 = View.ALPHA;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(a5Var, property2, f11);
                tg.v0 v0Var = photoViewer3.L1.f55582j0;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(v0Var, property2, f12);
                tg.z0 z0Var = photoViewer3.L1.f55584k0;
                if (max > org.telegram.messenger.g0.L(20.0f)) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(z0Var, property2, f13), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(xqVar);
                animatorSet2.start();
                up0 up0Var = photoViewer3.L1;
                tg.e1 e1Var = up0Var.f55576d1;
                if (e1Var != null) {
                    if (up0Var.Q1) {
                        e1Var.a(2131231512);
                    } else if (up0Var.P1) {
                        e1Var.a(2131231504);
                    } else {
                        e1Var.a(2131232042);
                    }
                }
                TextView textView = up0Var.f55580h1;
                if (!up0Var.Q1 && !up0Var.P1) {
                    z9 = true;
                    z10 = false;
                } else {
                    z9 = false;
                    z10 = false;
                }
                org.telegram.messenger.g0.U3(1.0f, textView, z9, z10);
                ImageView imageView = up0Var.f55578f1;
                if (!up0Var.Q1 && !up0Var.P1) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                org.telegram.messenger.g0.U3(1.0f, imageView, z11, z10);
                TextView textView2 = up0Var.f55583j1;
                if (!up0Var.Q1 && !up0Var.P1) {
                    z12 = z10;
                } else {
                    z12 = true;
                }
                org.telegram.messenger.g0.U3(1.0f, textView2, z12, z10);
                TextView textView3 = up0Var.f55581i1;
                if (!up0Var.Q1 && !up0Var.P1) {
                    z13 = z10;
                }
                org.telegram.messenger.g0.U3(1.0f, textView3, z13, z10);
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f47012b;
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                if (!photoViewer4.f41479p5.f38599b.Q && (i10 = photoViewer4.O4) >= 0 && i10 < photoViewer4.f41397f7.size() && (photoViewer4.f41397f7.get(photoViewer4.O4) instanceof org.telegram.messenger.gf)) {
                    org.telegram.ui.Components.ud0 ud0Var = photoViewer4.f41479p5;
                    fi.j3 j3Var = ud0Var.h;
                    if (j3Var != null) {
                        j3Var.dismiss();
                        ud0Var.h = null;
                    }
                    photoViewer4.f41479p5.f38599b.setLoading(true);
                    Utilities.f21333e.c(new org.telegram.ui.Components.kn0(photoViewer4, gfVar, (org.telegram.messenger.gf) photoViewer4.f41397f7.get(photoViewer4.O4), PhotoViewer.v1(), 27));
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f47012b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer5.f41397f7.get(photoViewer5.O4);
                if (obj2 instanceof org.telegram.messenger.gf) {
                    ((org.telegram.messenger.gf) obj2).f26843x = num.intValue();
                } else if (obj2 instanceof org.telegram.messenger.kf) {
                    ((org.telegram.messenger.kf) obj2).f26843x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer5.d.x(photoViewer5.O4)) {
                    photoViewer5.J2();
                }
                photoViewer5.V1.setTimer(num.intValue());
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f47012b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer6.Q7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer6.Q7.setTranslationY(photoViewer6.P0.getTranslationY() - (photoViewer6.U1.getAlpha() * jg.g.e(46.0f, photoViewer6.U1.getEditTextHeight(), 0)));
                }
                photoViewer6.f41381e1.setTranslationY(photoViewer6.U1.getAlpha() * (-jg.g.e(46.0f, num2.intValue(), 0)));
                photoViewer6.f41391f1.setTranslationY(photoViewer6.U1.getAlpha() * (-jg.g.e(46.0f, num2.intValue(), 0)));
                photoViewer6.f41400g1.setTranslationY(photoViewer6.U1.getAlpha() * (-jg.g.e(46.0f, num2.intValue(), 0)));
                fi.i iVar = photoViewer6.U1.M;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - org.telegram.messenger.g0.L(14.0f));
                    return;
                }
                return;
            case 7:
                PhotoViewer photoViewer7 = this.f47012b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer7.f41397f7.get(photoViewer7.O4);
                if (obj3 instanceof org.telegram.messenger.gf) {
                    ((org.telegram.messenger.gf) obj3).f26843x = num3.intValue();
                } else if (obj3 instanceof org.telegram.messenger.kf) {
                    ((org.telegram.messenger.kf) obj3).f26843x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer7.d.x(photoViewer7.O4)) {
                    photoViewer7.J2();
                }
                photoViewer7.U1.setTimer(num3.intValue());
                return;
            case 8:
                Integer num4 = (Integer) obj;
                fi.i iVar2 = this.f47012b.V1.M;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 9:
                PhotoViewer photoViewer8 = this.f47012b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer8.u0(0, false);
                return;
            default:
                PhotoViewer photoViewer9 = this.f47012b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer9.u0(0, false);
                return;
        }
    }
}
