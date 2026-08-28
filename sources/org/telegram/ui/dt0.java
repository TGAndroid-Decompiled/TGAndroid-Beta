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
public final class dt0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f37594a;
    public final ViewGroup.LayoutParams f37595b;
    public final float f37596c;
    public final bu0 d;
    public final float f37597e;
    public final zt0 f37598f;
    public final ArrayList h;
    public final Integer f37599n;
    public final PhotoViewer f37600r;

    public dt0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, bu0 bu0Var, float f11, zt0 zt0Var, ArrayList arrayList, Integer num) {
        this.f37600r = photoViewer;
        this.f37594a = clippingImageViewArr;
        this.f37595b = layoutParams;
        this.f37596c = f10;
        this.d = bu0Var;
        this.f37597e = f11;
        this.f37598f = zt0Var;
        this.h = arrayList;
        this.f37599n = num;
    }

    @Override
    public final boolean onPreDraw() {
        char c10;
        int i9;
        float f10;
        int i10;
        float d;
        float d9;
        int i11;
        boolean z10;
        int i12;
        float f11;
        int i13;
        int i14;
        PhotoViewer photoViewer = this.f37600r;
        Rect rect = photoViewer.f35709o2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.H0;
        float[][] fArr = photoViewer.f35640g4;
        ClippingImageView[] clippingImageViewArr = this.f37594a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f35598c0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i15 = photoViewer.Y1;
        ViewGroup.LayoutParams layoutParams = this.f37595b;
        if (i15 == 1) {
            if (!photoViewer.f35742s) {
                i13 = AndroidUtilities.statusBarHeight;
            } else {
                i13 = 0;
            }
            float f12 = i13;
            float measuredHeight = (photoViewer.f35799y1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f12;
            c10 = 0;
            float min = Math.min(photoViewer.f35799y1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.f35799y1.getMeasuredWidth() / 2.0f;
            float f13 = (measuredHeight / 2.0f) + f12;
            float f14 = min / 2.0f;
            float f15 = f13 - f14;
            float f16 = (f13 + f14) - f15;
            f10 = Math.max(((measuredWidth + f14) - (measuredWidth - f14)) / layoutParams.width, f16 / layoutParams.height);
            d = ((f16 - (layoutParams.height * f10)) / 2.0f) + f15;
            int measuredWidth2 = photoViewer.f35598c0.getMeasuredWidth();
            d9 = e2.c.d(layoutParams.width, f10, (measuredWidth2 - i14) - rect.right, 2.0f) + rect.left;
        } else {
            c10 = 0;
            float measuredWidth3 = photoViewer.f35598c0.getMeasuredWidth() / layoutParams.width;
            int i16 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f35742s) {
                i9 = AndroidUtilities.statusBarHeight;
            } else {
                i9 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i16 + i9) / layoutParams.height);
            if (photoViewer.Y1 == 11) {
                f10 = photoViewer.r2(true) * min2;
            } else {
                f10 = min2;
            }
            int i17 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f35742s) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            d = e2.c.d(layoutParams.height, f10, i17 + i10, 2.0f);
            d9 = e2.c.d(layoutParams.width, f10, photoViewer.f35598c0.getMeasuredWidth(), 2.0f);
            photoViewer.X5 = 0.0f;
            photoViewer.f35594b6 = 0.0f;
        }
        bu0 bu0Var = this.d;
        int abs = (int) Math.abs(this.f37596c - bu0Var.f36978a.getImageX());
        float imageY = bu0Var.f36978a.getImageY();
        float f17 = this.f37597e;
        int abs2 = (int) Math.abs(f17 - imageY);
        if (bu0Var.f36978a.isAspectFit()) {
            abs = 0;
        }
        int[] iArr = new int[2];
        bu0Var.d.getLocationInWindow(iArr);
        float f18 = bu0Var.f36980c + f17;
        int i18 = (int) ((iArr[1] - f18) + bu0Var.f36985j);
        if (i18 < 0) {
            i18 = 0;
        }
        int height = (int) (((f18 + layoutParams.height) - (bu0Var.d.getHeight() + i11)) + bu0Var.f36984i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i18, abs2);
        int max2 = Math.max(height, abs2);
        fArr[c10][c10] = photoViewer.f35607d0.getScaleX();
        fArr[c10][1] = photoViewer.f35607d0.getScaleY();
        fArr[c10][2] = photoViewer.f35607d0.getTranslationX();
        fArr[c10][3] = photoViewer.f35607d0.getTranslationY();
        float[] fArr2 = fArr[c10];
        float f19 = abs;
        float f20 = bu0Var.f36986k;
        int i19 = 3;
        fArr2[4] = f19 * f20;
        fArr2[5] = max * f20;
        fArr2[6] = max2 * f20;
        int[] radius = photoViewer.f35607d0.getRadius();
        for (int i20 = 0; i20 < 4; i20++) {
            float[] fArr3 = fArr[c10];
            int i21 = i20 + 7;
            if (radius != null) {
                f11 = radius[i20];
            } else {
                f11 = 0.0f;
            }
            fArr3[i21] = f11;
        }
        float[] fArr4 = fArr[c10];
        float f21 = bu0Var.f36986k;
        fArr4[11] = abs2 * f21;
        fArr4[12] = f19 * f21;
        float[] fArr5 = fArr[1];
        fArr5[c10] = f10;
        fArr5[1] = f10;
        fArr5[2] = d9;
        fArr5[3] = d;
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
        photoViewer.f35580a0.setAlpha(0.0f);
        photoViewer.f35627f0.setAlpha(0.0f);
        hr hrVar = new hr(this, clippingImageViewArr, this.h, this.f37599n, this.f37598f);
        photoViewer.f35684l4 = hrVar;
        if (!photoViewer.f35647h2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.Y1 != 1) {
                i19 = 2;
            }
            int length = i19 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i12);
            for (int i22 = 0; i22 < clippingImageViewArr.length; i22++) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i22], org.telegram.ui.Components.m6.f30704f, 0.0f, 1.0f);
                if (i22 == 0) {
                    ofFloat.addUpdateListener(new f3(this, 23));
                }
                arrayList.add(ofFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35607d0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.m6.d, 0, 255));
            tt0 tt0Var = photoViewer.f35580a0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(tt0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35627f0, property, 0.0f, 1.0f));
            if (photoViewer.Y1 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35799y1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new bc0(this, 13));
            photoViewer.f35580a0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f35676k4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new ys0(1, this, animatorSet));
        } else {
            hrVar.run();
            photoViewer.f35684l4 = null;
            photoViewer.f35580a0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.Y1 == 1) {
                photoViewer.f35799y1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new ys0(2, this, bu0Var);
        qn qnVar = photoViewer.f35649h4;
        if (qnVar != null && qnVar.getFragmentView() != null) {
            qn qnVar2 = photoViewer.f35649h4;
            qnVar2.Q7();
            UndoView undoView = qnVar2.f42093u3;
            if (undoView != null) {
                z10 = true;
                undoView.e(1, false);
            } else {
                z10 = true;
            }
            photoViewer.f35649h4.getFragmentView().invalidate();
            return z10;
        }
        return true;
    }
}
