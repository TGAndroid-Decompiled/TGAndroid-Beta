package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
public final class aq0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f45665a;
    public final ViewGroup.LayoutParams f45666b;
    public final float f45667c;
    public final wq0 d;
    public final float f45668e;
    public final uq0 f45669f;
    public final ArrayList h;
    public final Integer f45670n;
    public final PhotoViewer f45671r;

    public aq0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, wq0 wq0Var, float f11, uq0 uq0Var, ArrayList arrayList, Integer num) {
        this.f45671r = photoViewer;
        this.f45665a = clippingImageViewArr;
        this.f45666b = layoutParams;
        this.f45667c = f10;
        this.d = wq0Var;
        this.f45668e = f11;
        this.f45669f = uq0Var;
        this.h = arrayList;
        this.f45670n = num;
    }

    @Override
    public final boolean onPreDraw() {
        int i7;
        int i10;
        int i11;
        float w10;
        float f10;
        float f11;
        int i12;
        boolean z10;
        int i13;
        float f12;
        int i14;
        int i15;
        PhotoViewer photoViewer = this.f45671r;
        Rect rect = photoViewer.f43376t2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.M0;
        float[][] fArr = photoViewer.f43299k4;
        ClippingImageView[] clippingImageViewArr = this.f45665a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f43271h0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i16 = photoViewer.d2;
        ViewGroup.LayoutParams layoutParams = this.f45666b;
        if (i16 == 1) {
            if (!photoViewer.f43365s) {
                i14 = org.telegram.messenger.g0.f24040m;
            } else {
                i14 = 0;
            }
            float f13 = i14;
            float measuredHeight = (photoViewer.D1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - f13;
            i7 = 0;
            float min = Math.min(photoViewer.D1.getMeasuredWidth(), measuredHeight) - (org.telegram.messenger.g0.L(16.0f) * 2);
            float measuredWidth = photoViewer.D1.getMeasuredWidth() / 2.0f;
            float f14 = (measuredHeight / 2.0f) + f13;
            float f15 = min / 2.0f;
            float f16 = f14 - f15;
            float f17 = (f14 + f15) - f16;
            f10 = Math.max(((measuredWidth + f15) - (measuredWidth - f15)) / layoutParams.width, f17 / layoutParams.height);
            w10 = ((f17 - (layoutParams.height * f10)) / 2.0f) + f16;
            int measuredWidth2 = photoViewer.f43271h0.getMeasuredWidth();
            f11 = com.google.android.gms.internal.vision.e2.w(layoutParams.width, f10, (measuredWidth2 - i15) - rect.right, 2.0f) + rect.left;
        } else {
            i7 = 0;
            float measuredWidth3 = photoViewer.f43271h0.getMeasuredWidth() / layoutParams.width;
            Point point = org.telegram.messenger.g0.f24046q;
            int i17 = point.y;
            if (!photoViewer.f43365s) {
                i10 = org.telegram.messenger.g0.f24040m;
            } else {
                i10 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i17 + i10) / layoutParams.height);
            if (photoViewer.d2 == 11) {
                min2 = photoViewer.p2(true) * min2;
            }
            int i18 = point.y;
            if (!photoViewer.f43365s) {
                i11 = org.telegram.messenger.g0.f24040m;
            } else {
                i11 = 0;
            }
            w10 = com.google.android.gms.internal.vision.e2.w(layoutParams.height, min2, i18 + i11, 2.0f);
            float w11 = com.google.android.gms.internal.vision.e2.w(layoutParams.width, min2, photoViewer.f43271h0.getMeasuredWidth(), 2.0f);
            photoViewer.f43221b6 = 0.0f;
            photoViewer.f43259f6 = 0.0f;
            f10 = min2;
            f11 = w11;
        }
        wq0 wq0Var = this.d;
        int abs = (int) Math.abs(this.f45667c - wq0Var.f53497a.L0);
        float f18 = wq0Var.f53497a.M0;
        float f19 = this.f45668e;
        int abs2 = (int) Math.abs(f19 - f18);
        if (wq0Var.f53497a.S0) {
            abs = i7;
        }
        int[] iArr = new int[2];
        int i19 = 2;
        wq0Var.d.getLocationInWindow(iArr);
        float f20 = wq0Var.f53499c + f19;
        int i20 = (int) ((iArr[1] - f20) + wq0Var.f53504j);
        if (i20 < 0) {
            i20 = i7;
        }
        int height = (int) (((f20 + layoutParams.height) - (wq0Var.d.getHeight() + i12)) + wq0Var.f53503i);
        if (height < 0) {
            height = i7;
        }
        int max = Math.max(i20, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i7][i7] = photoViewer.f43279i0.getScaleX();
        fArr[i7][1] = photoViewer.f43279i0.getScaleY();
        fArr[i7][2] = photoViewer.f43279i0.getTranslationX();
        fArr[i7][3] = photoViewer.f43279i0.getTranslationY();
        float[] fArr2 = fArr[i7];
        float f21 = abs;
        float f22 = wq0Var.f53505k;
        int i21 = 3;
        fArr2[4] = f21 * f22;
        fArr2[5] = max * f22;
        char c10 = 6;
        fArr2[6] = max2 * f22;
        int[] radius = photoViewer.f43279i0.getRadius();
        int i22 = i7;
        while (i22 < 4) {
            float[] fArr3 = fArr[i7];
            int i23 = i22 + 7;
            char c11 = c10;
            if (radius != null) {
                f12 = radius[i22];
            } else {
                f12 = 0.0f;
            }
            fArr3[i23] = f12;
            i22++;
            c10 = c11;
        }
        float[] fArr4 = fArr[i7];
        float f23 = wq0Var.f53505k;
        fArr4[11] = abs2 * f23;
        fArr4[12] = f21 * f23;
        float[] fArr5 = fArr[1];
        fArr5[i7] = f10;
        fArr5[1] = f10;
        fArr5[2] = f11;
        fArr5[3] = w10;
        fArr5[4] = 0.0f;
        fArr5[5] = 0.0f;
        fArr5[c10] = 0.0f;
        fArr5[7] = 0.0f;
        fArr5[8] = 0.0f;
        fArr5[9] = 0.0f;
        fArr5[10] = 0.0f;
        fArr5[11] = 0.0f;
        fArr5[12] = 0.0f;
        for (int i24 = i7; i24 < clippingImageViewArr.length; i24++) {
            clippingImageViewArr[i24].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i7);
        photoViewer.f43253f0.setAlpha(0.0f);
        photoViewer.f43295k0.setAlpha(0.0f);
        wn wnVar = new wn(this, clippingImageViewArr, this.h, this.f45670n, this.f45669f, 27);
        photoViewer.f43341p4 = wnVar;
        if (!photoViewer.f43313m2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.d2 != 1) {
                i21 = 2;
            }
            int length = i21 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i13);
            int i25 = 0;
            while (i25 < clippingImageViewArr.length) {
                float[] fArr6 = new float[i19];
                
                fArr6[0] = 0.0f;
                fArr6[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i25], org.telegram.ui.Components.r6.f39097f, fArr6);
                if (i25 == 0) {
                    ofFloat.addUpdateListener(new a3(this, 21));
                }
                arrayList.add(ofFloat);
                i25++;
                i19 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f43279i0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.r6.d, 0, 255));
            qq0 qq0Var = photoViewer.f43253f0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(qq0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f43295k0, property, 0.0f, 1.0f));
            if (photoViewer.d2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.D1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new ay(this, 17));
            photoViewer.f43253f0.setLayerType(2, null);
            photoViewer.w2(false);
            photoViewer.o4 = System.currentTimeMillis();
            org.telegram.messenger.g0.g3(new fe0(28, this, animatorSet));
        } else {
            wnVar.run();
            photoViewer.f43341p4 = null;
            photoViewer.f43253f0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.d2 == 1) {
                photoViewer.D1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new fe0(29, this, wq0Var);
        bn bnVar = photoViewer.f43307l4;
        if (bnVar != null && bnVar.getFragmentView() != null) {
            bn bnVar2 = photoViewer.f43307l4;
            bnVar2.h8();
            UndoView undoView = bnVar2.N3;
            if (undoView != null) {
                z10 = true;
                undoView.d(1, false);
            } else {
                z10 = true;
            }
            photoViewer.f43307l4.getFragmentView().invalidate();
            return z10;
        }
        return true;
    }
}
