package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
public final class bt0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f36906a;
    public final ViewGroup.LayoutParams f36907b;
    public final float f36908c;
    public final zt0 d;
    public final float f36909e;
    public final xt0 f36910f;
    public final ArrayList h;
    public final Integer f36911n;
    public final PhotoViewer f36912r;

    public bt0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f9, zt0 zt0Var, float f10, xt0 xt0Var, ArrayList arrayList, Integer num) {
        this.f36912r = photoViewer;
        this.f36906a = clippingImageViewArr;
        this.f36907b = layoutParams;
        this.f36908c = f9;
        this.d = zt0Var;
        this.f36909e = f10;
        this.f36910f = xt0Var;
        this.h = arrayList;
        this.f36911n = num;
    }

    @Override
    public final boolean onPreDraw() {
        char c3;
        int i10;
        float f9;
        int i11;
        float w10;
        float w11;
        int i12;
        boolean z10;
        int i13;
        float f10;
        int i14;
        int i15;
        PhotoViewer photoViewer = this.f36912r;
        Rect rect = photoViewer.f35775o2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.H0;
        float[][] fArr = photoViewer.f35706g4;
        ClippingImageView[] clippingImageViewArr = this.f36906a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f35666c0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i16 = photoViewer.Y1;
        ViewGroup.LayoutParams layoutParams = this.f36907b;
        if (i16 == 1) {
            if (!photoViewer.f35808s) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            float f11 = i14;
            float measuredHeight = (photoViewer.f35866y1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f11;
            c3 = 0;
            float min = Math.min(photoViewer.f35866y1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.f35866y1.getMeasuredWidth() / 2.0f;
            float f12 = (measuredHeight / 2.0f) + f11;
            float f13 = min / 2.0f;
            float f14 = f12 - f13;
            float f15 = (f12 + f13) - f14;
            f9 = Math.max(((measuredWidth + f13) - (measuredWidth - f13)) / layoutParams.width, f15 / layoutParams.height);
            w10 = ((f15 - (layoutParams.height * f9)) / 2.0f) + f14;
            int measuredWidth2 = photoViewer.f35666c0.getMeasuredWidth();
            w11 = com.google.android.recaptcha.internal.a.w(layoutParams.width, f9, (measuredWidth2 - i15) - rect.right, 2.0f) + rect.left;
        } else {
            c3 = 0;
            float measuredWidth3 = photoViewer.f35666c0.getMeasuredWidth() / layoutParams.width;
            int i17 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f35808s) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i17 + i10) / layoutParams.height);
            if (photoViewer.Y1 == 11) {
                f9 = photoViewer.r2(true) * min2;
            } else {
                f9 = min2;
            }
            int i18 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f35808s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            w10 = com.google.android.recaptcha.internal.a.w(layoutParams.height, f9, i18 + i11, 2.0f);
            w11 = com.google.android.recaptcha.internal.a.w(layoutParams.width, f9, photoViewer.f35666c0.getMeasuredWidth(), 2.0f);
            photoViewer.X5 = 0.0f;
            photoViewer.f35662b6 = 0.0f;
        }
        zt0 zt0Var = this.d;
        int abs = (int) Math.abs(this.f36908c - zt0Var.f45316a.getImageX());
        float imageY = zt0Var.f45316a.getImageY();
        float f16 = this.f36909e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (zt0Var.f45316a.isAspectFit()) {
            abs = 0;
        }
        int[] iArr = new int[2];
        zt0Var.d.getLocationInWindow(iArr);
        float f17 = zt0Var.f45318c + f16;
        int i19 = (int) ((iArr[1] - f17) + zt0Var.f45323j);
        if (i19 < 0) {
            i19 = 0;
        }
        int height = (int) (((f17 + layoutParams.height) - (zt0Var.d.getHeight() + i12)) + zt0Var.f45322i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i19, abs2);
        int max2 = Math.max(height, abs2);
        fArr[c3][c3] = photoViewer.f35673d0.getScaleX();
        fArr[c3][1] = photoViewer.f35673d0.getScaleY();
        fArr[c3][2] = photoViewer.f35673d0.getTranslationX();
        fArr[c3][3] = photoViewer.f35673d0.getTranslationY();
        float[] fArr2 = fArr[c3];
        float f18 = abs;
        float f19 = zt0Var.f45324k;
        int i20 = 3;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        fArr2[6] = max2 * f19;
        int[] radius = photoViewer.f35673d0.getRadius();
        for (int i21 = 0; i21 < 4; i21++) {
            float[] fArr3 = fArr[c3];
            int i22 = i21 + 7;
            if (radius != null) {
                f10 = radius[i21];
            } else {
                f10 = 0.0f;
            }
            fArr3[i22] = f10;
        }
        float[] fArr4 = fArr[c3];
        float f20 = zt0Var.f45324k;
        fArr4[11] = abs2 * f20;
        fArr4[12] = f18 * f20;
        float[] fArr5 = fArr[1];
        fArr5[c3] = f9;
        fArr5[1] = f9;
        fArr5[2] = w11;
        fArr5[3] = w10;
        fArr5[4] = 0.0f;
        fArr5[5] = 0.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 0.0f;
        fArr5[8] = 0.0f;
        fArr5[9] = 0.0f;
        fArr5[10] = 0.0f;
        fArr5[11] = 0.0f;
        fArr5[12] = 0.0f;
        for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
            clippingImageView2.setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(0);
        photoViewer.f35647a0.setAlpha(0.0f);
        photoViewer.f35693f0.setAlpha(0.0f);
        org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(this, clippingImageViewArr, this.h, this.f36911n, this.f36910f, 23);
        photoViewer.f35750l4 = u20Var;
        if (!photoViewer.f35713h2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.Y1 != 1) {
                i20 = 2;
            }
            int length = i20 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i13);
            for (int i23 = 0; i23 < clippingImageViewArr.length; i23++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i23], org.telegram.ui.Components.r6.f32224f, 0.0f, 1.0f);
                if (i23 == 0) {
                    ofFloat.addUpdateListener(new g3(this, 23));
                }
                arrayList.add(ofFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35673d0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.r6.d, 0, 255));
            rt0 rt0Var = photoViewer.f35647a0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(rt0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35693f0, property, 0.0f, 1.0f));
            if (photoViewer.Y1 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35866y1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new e50(this, 15));
            photoViewer.f35647a0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f35742k4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new lf0(28, this, animatorSet));
        } else {
            u20Var.run();
            photoViewer.f35750l4 = null;
            photoViewer.f35647a0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.Y1 == 1) {
                photoViewer.f35866y1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new lf0(29, this, zt0Var);
        tn tnVar = photoViewer.f35715h4;
        if (tnVar != null && tnVar.getFragmentView() != null) {
            tn tnVar2 = photoViewer.f35715h4;
            tnVar2.Q7();
            UndoView undoView = tnVar2.f42989u3;
            if (undoView != null) {
                z10 = true;
                undoView.e(1, false);
            } else {
                z10 = true;
            }
            photoViewer.f35715h4.getFragmentView().invalidate();
            return z10;
        }
        return true;
    }
}
