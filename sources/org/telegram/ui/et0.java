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

public final class et0 implements ViewTreeObserver.OnPreDrawListener {

    public final ClippingImageView[] f37834a;

    public final ViewGroup.LayoutParams f37835b;

    public final float f37836c;
    public final cu0 d;

    public final float f37837e;

    public final au0 f37838f;
    public final ArrayList h;

    public final Integer f37839n;

    public final PhotoViewer f37840r;

    public et0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, cu0 cu0Var, float f11, au0 au0Var, ArrayList arrayList, Integer num) {
        this.f37840r = photoViewer;
        this.f37834a = clippingImageViewArr;
        this.f37835b = layoutParams;
        this.f37836c = f10;
        this.d = cu0Var;
        this.f37837e = f11;
        this.f37838f = au0Var;
        this.h = arrayList;
        this.f37839n = num;
    }

    @Override
    public final boolean onPreDraw() {
        char c10;
        float fR2;
        float fW;
        float fW2;
        boolean z10;
        PhotoViewer photoViewer = this.f37840r;
        Rect rect = photoViewer.f35712o2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.H0;
        float[][] fArr = photoViewer.f35643g4;
        ClippingImageView[] clippingImageViewArr = this.f37834a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f35601c0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i10 = photoViewer.Y1;
        ViewGroup.LayoutParams layoutParams = this.f37835b;
        if (i10 == 1) {
            float f10 = !photoViewer.f35745s ? AndroidUtilities.statusBarHeight : 0;
            float measuredHeight = (photoViewer.f35802y1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f10;
            c10 = 0;
            float fMin = Math.min(photoViewer.f35802y1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.f35802y1.getMeasuredWidth() / 2.0f;
            float f11 = (measuredHeight / 2.0f) + f10;
            float f12 = fMin / 2.0f;
            float f13 = f11 - f12;
            float f14 = (f11 + f12) - f13;
            fR2 = Math.max(((measuredWidth + f12) - (measuredWidth - f12)) / layoutParams.width, f14 / layoutParams.height);
            fW = ((f14 - (layoutParams.height * fR2)) / 2.0f) + f13;
            int measuredWidth2 = photoViewer.f35601c0.getMeasuredWidth();
            int i11 = rect.left;
            fW2 = com.google.android.recaptcha.internal.a.w(layoutParams.width, fR2, (measuredWidth2 - i11) - rect.right, 2.0f) + i11;
        } else {
            c10 = 0;
            float fMin2 = Math.min(photoViewer.f35601c0.getMeasuredWidth() / layoutParams.width, (AndroidUtilities.displaySize.y + (!photoViewer.f35745s ? AndroidUtilities.statusBarHeight : 0)) / layoutParams.height);
            fR2 = photoViewer.Y1 == 11 ? photoViewer.r2(true) * fMin2 : fMin2;
            fW = com.google.android.recaptcha.internal.a.w(layoutParams.height, fR2, AndroidUtilities.displaySize.y + (!photoViewer.f35745s ? AndroidUtilities.statusBarHeight : 0), 2.0f);
            fW2 = com.google.android.recaptcha.internal.a.w(layoutParams.width, fR2, photoViewer.f35601c0.getMeasuredWidth(), 2.0f);
            photoViewer.X5 = 0.0f;
            photoViewer.f35597b6 = 0.0f;
        }
        cu0 cu0Var = this.d;
        int iAbs = (int) Math.abs(this.f37836c - cu0Var.f37153a.getImageX());
        float imageY = cu0Var.f37153a.getImageY();
        float f15 = this.f37837e;
        int iAbs2 = (int) Math.abs(f15 - imageY);
        if (cu0Var.f37153a.isAspectFit()) {
            iAbs = 0;
        }
        int[] iArr = new int[2];
        cu0Var.d.getLocationInWindow(iArr);
        int i12 = iArr[1];
        float f16 = cu0Var.f37155c + f15;
        int i13 = (int) ((i12 - f16) + cu0Var.f37160j);
        if (i13 < 0) {
            i13 = 0;
        }
        int height = (int) (((f16 + layoutParams.height) - (cu0Var.d.getHeight() + i12)) + cu0Var.f37159i);
        if (height < 0) {
            height = 0;
        }
        int iMax = Math.max(i13, iAbs2);
        int iMax2 = Math.max(height, iAbs2);
        fArr[c10][c10] = photoViewer.f35610d0.getScaleX();
        fArr[c10][1] = photoViewer.f35610d0.getScaleY();
        fArr[c10][2] = photoViewer.f35610d0.getTranslationX();
        fArr[c10][3] = photoViewer.f35610d0.getTranslationY();
        float[] fArr2 = fArr[c10];
        float f17 = iAbs;
        float f18 = cu0Var.f37161k;
        fArr2[4] = f17 * f18;
        fArr2[5] = iMax * f18;
        fArr2[6] = iMax2 * f18;
        int[] radius = photoViewer.f35610d0.getRadius();
        for (int i14 = 0; i14 < 4; i14++) {
            fArr[c10][i14 + 7] = radius != null ? radius[i14] : 0.0f;
        }
        float[] fArr3 = fArr[c10];
        float f19 = cu0Var.f37161k;
        fArr3[11] = iAbs2 * f19;
        fArr3[12] = f17 * f19;
        float[] fArr4 = fArr[1];
        fArr4[c10] = fR2;
        fArr4[1] = fR2;
        fArr4[2] = fW2;
        fArr4[3] = fW;
        fArr4[4] = 0.0f;
        fArr4[5] = 0.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 0.0f;
        fArr4[8] = 0.0f;
        fArr4[9] = 0.0f;
        fArr4[10] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[12] = 0.0f;
        for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
            clippingImageView2.setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(0);
        photoViewer.f35583a0.setAlpha(0.0f);
        photoViewer.f35630f0.setAlpha(0.0f);
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(this, clippingImageViewArr, this.h, this.f37839n, this.f37838f, 23);
        photoViewer.f35687l4 = l20Var;
        if (photoViewer.f35650h2) {
            l20Var.run();
            photoViewer.f35687l4 = null;
            photoViewer.f35583a0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.Y1 == 1) {
                photoViewer.f35802y1.setAlpha(1.0f);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList((photoViewer.Y1 != 1 ? 2 : 3) + clippingImageViewArr.length + (clippingImageViewArr.length > 1 ? 1 : 0));
            for (int i15 = 0; i15 < clippingImageViewArr.length; i15++) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i15], org.telegram.ui.Components.m6.f30582f, 0.0f, 1.0f);
                if (i15 == 0) {
                    objectAnimatorOfFloat.addUpdateListener(new g3(this, 23));
                }
                arrayList.add(objectAnimatorOfFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35610d0, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.m6.d, 0, 255));
            ut0 ut0Var = photoViewer.f35583a0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(ut0Var, (Property<ut0, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35630f0, (Property<View, Float>) property, 0.0f, 1.0f));
            if (photoViewer.Y1 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f35802y1, (Property<org.telegram.ui.Components.ge0, Float>) property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new f50(this, 15));
            photoViewer.f35583a0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f35679k4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new zs0(1, this, animatorSet));
        }
        backgroundDrawable.d = new zs0(2, this, cu0Var);
        rn rnVar = photoViewer.f35652h4;
        if (rnVar == null || rnVar.getFragmentView() == null) {
            return true;
        }
        rn rnVar2 = photoViewer.f35652h4;
        rnVar2.Q7();
        UndoView undoView = rnVar2.f42229u3;
        if (undoView != null) {
            z10 = true;
            undoView.e(1, false);
        } else {
            z10 = true;
        }
        photoViewer.f35652h4.getFragmentView().invalidate();
        return z10;
    }
}
