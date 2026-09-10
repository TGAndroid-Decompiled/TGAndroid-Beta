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
public final class eu0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f32607a;
    public final ViewGroup.LayoutParams f32608b;
    public final float f32609c;
    public final ev0 d;
    public final float e;
    public final cv0 f32610f;
    public final ArrayList h;
    public final Integer f32611n;
    public final PhotoViewer f32612r;

    public eu0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, ev0 ev0Var, float f10, cv0 cv0Var, ArrayList arrayList, Integer num) {
        this.f32612r = photoViewer;
        this.f32607a = clippingImageViewArr;
        this.f32608b = layoutParams;
        this.f32609c = f7;
        this.d = ev0Var;
        this.e = f10;
        this.f32610f = cv0Var;
        this.h = arrayList;
        this.f32611n = num;
    }

    @Override
    public final boolean onPreDraw() {
        char c10;
        int i10;
        float f7;
        int i11;
        float v;
        float v9;
        int i12;
        boolean z10;
        int i13;
        float f10;
        int i14;
        int i15;
        PhotoViewer photoViewer = this.f32612r;
        Rect rect = photoViewer.f30173s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f30105k4;
        ClippingImageView[] clippingImageViewArr = this.f32607a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f30066g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i16 = photoViewer.f30033c2;
        ViewGroup.LayoutParams layoutParams = this.f32608b;
        if (i16 == 1) {
            if (!photoViewer.f30170s) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            float f11 = i14;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f11;
            c10 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f12 = (measuredHeight / 2.0f) + f11;
            float f13 = min / 2.0f;
            float f14 = f12 - f13;
            float f15 = (f12 + f13) - f14;
            f7 = Math.max(((measuredWidth + f13) - (measuredWidth - f13)) / layoutParams.width, f15 / layoutParams.height);
            v = ((f15 - (layoutParams.height * f7)) / 2.0f) + f14;
            int measuredWidth2 = photoViewer.f30066g0.getMeasuredWidth();
            v9 = com.google.android.gms.internal.vision.e2.v(layoutParams.width, f7, (measuredWidth2 - i15) - rect.right, 2.0f) + rect.left;
        } else {
            c10 = 0;
            float measuredWidth3 = photoViewer.f30066g0.getMeasuredWidth() / layoutParams.width;
            int i17 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f30170s) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i17 + i10) / layoutParams.height);
            if (photoViewer.f30033c2 == 11) {
                f7 = photoViewer.r2(true) * min2;
            } else {
                f7 = min2;
            }
            int i18 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f30170s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            v = com.google.android.gms.internal.vision.e2.v(layoutParams.height, f7, i18 + i11, 2.0f);
            v9 = com.google.android.gms.internal.vision.e2.v(layoutParams.width, f7, photoViewer.f30066g0.getMeasuredWidth(), 2.0f);
            photoViewer.f30027b6 = 0.0f;
            photoViewer.f30064f6 = 0.0f;
        }
        ev0 ev0Var = this.d;
        int abs = (int) Math.abs(this.f32609c - ev0Var.f32616a.getImageX());
        float imageY = ev0Var.f32616a.getImageY();
        float f16 = this.e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (ev0Var.f32616a.isAspectFit()) {
            abs = 0;
        }
        int[] iArr = new int[2];
        ev0Var.d.getLocationInWindow(iArr);
        float f17 = ev0Var.f32618c + f16;
        int i19 = (int) ((iArr[1] - f17) + ev0Var.f32622j);
        if (i19 < 0) {
            i19 = 0;
        }
        int height = (int) (((f17 + layoutParams.height) - (ev0Var.d.getHeight() + i12)) + ev0Var.f32621i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i19, abs2);
        int max2 = Math.max(height, abs2);
        fArr[c10][c10] = photoViewer.f30075h0.getScaleX();
        fArr[c10][1] = photoViewer.f30075h0.getScaleY();
        fArr[c10][2] = photoViewer.f30075h0.getTranslationX();
        fArr[c10][3] = photoViewer.f30075h0.getTranslationY();
        float[] fArr2 = fArr[c10];
        float f18 = abs;
        float f19 = ev0Var.f32623k;
        int i20 = 3;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        fArr2[6] = max2 * f19;
        int[] radius = photoViewer.f30075h0.getRadius();
        for (int i21 = 0; i21 < 4; i21++) {
            float[] fArr3 = fArr[c10];
            int i22 = i21 + 7;
            if (radius != null) {
                f10 = radius[i21];
            } else {
                f10 = 0.0f;
            }
            fArr3[i22] = f10;
        }
        float[] fArr4 = fArr[c10];
        float f20 = ev0Var.f32623k;
        fArr4[11] = abs2 * f20;
        fArr4[12] = f18 * f20;
        float[] fArr5 = fArr[1];
        fArr5[c10] = f7;
        fArr5[1] = f7;
        fArr5[2] = v9;
        fArr5[3] = v;
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
        photoViewer.f30049e0.setAlpha(0.0f);
        photoViewer.f30093j0.setAlpha(0.0f);
        ac0 ac0Var = new ac0(this, clippingImageViewArr, this.h, this.f32611n, this.f32610f, 11);
        photoViewer.f30148p4 = ac0Var;
        if (!photoViewer.f30111l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f30033c2 != 1) {
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i23], org.telegram.ui.Components.r6.f26602f, 0.0f, 1.0f);
                if (i23 == 0) {
                    ofFloat.addUpdateListener(new d3(this, 23));
                }
                arrayList.add(ofFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f30075h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.r6.d, 0, 255));
            wu0 wu0Var = photoViewer.f30049e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(wu0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f30093j0, property, 0.0f, 1.0f));
            if (photoViewer.f30033c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new org.telegram.ui.Components.voip.v2(this, 27));
            photoViewer.f30049e0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f30139o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new ak0(22, this, animatorSet));
        } else {
            ac0Var.run();
            photoViewer.f30148p4 = null;
            photoViewer.f30049e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.f30033c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new ak0(23, this, ev0Var);
        eo eoVar = photoViewer.l4;
        if (eoVar != null && eoVar.getFragmentView() != null) {
            eo eoVar2 = photoViewer.l4;
            eoVar2.Q7();
            UndoView undoView = eoVar2.y3;
            if (undoView != null) {
                z10 = true;
                undoView.e(1, false);
            } else {
                z10 = true;
            }
            photoViewer.l4.getFragmentView().invalidate();
            return z10;
        }
        return true;
    }
}
