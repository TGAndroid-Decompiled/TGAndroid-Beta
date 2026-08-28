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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class mq0 implements Utilities.Callback {
    public final int f40504a;
    public final PhotoViewer f40505b;

    public mq0(PhotoViewer photoViewer, int i9) {
        this.f40504a = i9;
        this.f40505b = photoViewer;
    }

    @Override
    public final void run(Object obj) {
        Bitmap b10;
        float f10;
        float f11;
        float f12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i9;
        switch (this.f40504a) {
            case 0:
                PhotoViewer photoViewer = this.f40505b;
                yf.j2 j2Var = (yf.j2) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.f35605c7.get(photoViewer.L4)).filterPath);
                    yf.m2 m2Var = photoViewer.f35685l5;
                    m2Var.H = true;
                    m2Var.A = j2Var;
                    Bitmap bitmap = photoViewer.f35802y4.getBitmap();
                    photoViewer.f35802y4.getOrientation();
                    yf.j2 j2Var2 = m2Var.A;
                    if (j2Var2 == null) {
                        b10 = m2Var.E;
                    } else if (!isEmpty && bitmap != null) {
                        b10 = m2Var.e(bitmap);
                    } else {
                        b10 = j2Var2.b();
                    }
                    photoViewer.f35802y4.setImageBitmap(b10);
                    photoViewer.f35720p5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.f35720p5.post(new gq0(photoViewer, 9));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.oc.F(this.f40505b.f35580a0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f40505b;
                photoViewer2.H1.f49933d2 = photoViewer2.G1.c();
                photoViewer2.f35580a0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.H1.f49937f2);
                if ((photoViewer2.H1.O0 instanceof yf.v2) && max > 0) {
                    f10 = ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.H1.getSelectedEntityBottom();
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f35713o7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f35713o7 = null;
                }
                if (photoViewer2.f35727q4 != 3) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.V5, f10);
                photoViewer2.f35713o7 = ofFloat;
                ofFloat.addUpdateListener(new fq0(photoViewer2, 9));
                photoViewer2.f35713o7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f35713o7;
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                valueAnimator2.setInterpolator(grVar);
                photoViewer2.f35713o7.start();
                AnimatorSet animatorSet = photoViewer2.F1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new fq0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.F1 = animatorSet2;
                yf.w1 w1Var = photoViewer2.H1.f49940h1;
                Property property = View.TRANSLATION_Y;
                int i10 = -max;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w1Var, property, i10 / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.H1.Y0, property, Math.min(0, AndroidUtilities.dp(40.0f) + i10));
                kh.n5 n5Var = photoViewer2.H1.f49928b1;
                Property property2 = View.ALPHA;
                float f13 = 1.0f;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(n5Var, property2, f11);
                yf.f1 f1Var = photoViewer2.H1.f49957w0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(f1Var, property2, f12);
                yf.j1 j1Var = photoViewer2.H1.f49959x0;
                if (max > AndroidUtilities.dp(20.0f)) {
                    f13 = 0.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(j1Var, property2, f13), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(grVar);
                animatorSet2.start();
                xs0 xs0Var = photoViewer2.H1;
                yf.o1 o1Var = xs0Var.f49951q1;
                if (o1Var != null) {
                    if (xs0Var.f49933d2) {
                        o1Var.a(R.drawable.input_smile);
                    } else if (xs0Var.f49931c2) {
                        o1Var.a(R.drawable.input_keyboard);
                    } else {
                        o1Var.a(R.drawable.msg_add);
                    }
                }
                TextView textView = xs0Var.f49955u1;
                if (!xs0Var.f49933d2 && !xs0Var.f49931c2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AndroidUtilities.updateViewShow(textView, z10, false, 1.0f, true, null);
                ImageView imageView = xs0Var.f49953s1;
                if (!xs0Var.f49933d2 && !xs0Var.f49931c2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AndroidUtilities.updateViewShow(imageView, z11, false, 1.0f, true, null);
                TextView textView2 = xs0Var.f49958w1;
                if (!xs0Var.f49933d2 && !xs0Var.f49931c2) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                AndroidUtilities.updateViewShow(textView2, z12, false, 1.0f, true, null);
                TextView textView3 = xs0Var.f49956v1;
                if (!xs0Var.f49933d2 && !xs0Var.f49931c2) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AndroidUtilities.updateViewShow(textView3, z13, false, 1.0f, true, null);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f40505b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.f35693m5.f32147b.J && (i9 = photoViewer3.L4) >= 0 && i9 < photoViewer3.f35605c7.size() && (photoViewer3.f35605c7.get(photoViewer3.L4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.re0 re0Var = photoViewer3.f35693m5;
                    kh.u3 u3Var = re0Var.h;
                    if (u3Var != null) {
                        u3Var.dismiss();
                        re0Var.h = null;
                    }
                    photoViewer3.f35693m5.f32147b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.no0(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.f35605c7.get(photoViewer3.L4), PhotoViewer.y1(), 27));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f40505b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f35605c7.get(photoViewer4.L4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.L4)) {
                    photoViewer4.M2();
                }
                photoViewer4.R1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f40505b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.M7.setTranslationY(photoViewer5.L0.getTranslationY() - (photoViewer5.Q1.getAlpha() * org.telegram.messenger.l0.b(46.0f, photoViewer5.Q1.getEditTextHeight(), 0)));
                }
                photoViewer5.f35581a1.setTranslationY(photoViewer5.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, num2.intValue(), 0)));
                photoViewer5.f35589b1.setTranslationY(photoViewer5.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, num2.intValue(), 0)));
                photoViewer5.f35599c1.setTranslationY(photoViewer5.Q1.getAlpha() * (-org.telegram.messenger.l0.b(46.0f, num2.intValue(), 0)));
                kh.i iVar = photoViewer5.Q1.I;
                if (iVar != null) {
                    iVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f40505b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f35605c7.get(photoViewer6.L4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.L4)) {
                    photoViewer6.M2();
                }
                photoViewer6.Q1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                kh.i iVar2 = this.f40505b.R1.I;
                if (iVar2 != null) {
                    iVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f40505b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer7.A0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f40505b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer8.A0(0, false);
                return;
        }
    }
}
