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
public final class fu0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f37806a;
    public final ViewGroup.LayoutParams f37807b;
    public final float f37808c;
    public final dv0 d;
    public final float f37809e;
    public final bv0 f37810f;
    public final ArrayList h;
    public final Integer f37811n;
    public final PhotoViewer f37812r;

    public fu0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, dv0 dv0Var, float f10, bv0 bv0Var, ArrayList arrayList, Integer num) {
        this.f37812r = photoViewer;
        this.f37806a = clippingImageViewArr;
        this.f37807b = layoutParams;
        this.f37808c = f7;
        this.d = dv0Var;
        this.f37809e = f10;
        this.f37810f = bv0Var;
        this.h = arrayList;
        this.f37811n = num;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        int i11;
        float f7;
        int i12;
        float u10;
        float u11;
        int i13;
        boolean z10;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        PhotoViewer photoViewer = this.f37812r;
        Rect rect = photoViewer.f34090s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f34022k4;
        ClippingImageView[] clippingImageViewArr = this.f37806a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f33983g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i18 = photoViewer.f33949c2;
        ViewGroup.LayoutParams layoutParams = this.f37807b;
        if (i18 == 1) {
            if (!photoViewer.f34087s) {
                i16 = AndroidUtilities.statusBarHeight;
            } else {
                i16 = 0;
            }
            float f11 = i16;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f11;
            i10 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f12 = (measuredHeight / 2.0f) + f11;
            float f13 = min / 2.0f;
            float f14 = f12 - f13;
            float f15 = (f12 + f13) - f14;
            f7 = Math.max(((measuredWidth + f13) - (measuredWidth - f13)) / layoutParams.width, f15 / layoutParams.height);
            u10 = ((f15 - (layoutParams.height * f7)) / 2.0f) + f14;
            int measuredWidth2 = photoViewer.f33983g0.getMeasuredWidth();
            u11 = com.google.android.gms.internal.vision.e2.u(layoutParams.width, f7, (measuredWidth2 - i17) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float measuredWidth3 = photoViewer.f33983g0.getMeasuredWidth() / layoutParams.width;
            int i19 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f34087s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i19 + i11) / layoutParams.height);
            if (photoViewer.f33949c2 == 11) {
                f7 = photoViewer.r2(true) * min2;
            } else {
                f7 = min2;
            }
            int i20 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f34087s) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            u10 = com.google.android.gms.internal.vision.e2.u(layoutParams.height, f7, i20 + i12, 2.0f);
            u11 = com.google.android.gms.internal.vision.e2.u(layoutParams.width, f7, photoViewer.f33983g0.getMeasuredWidth(), 2.0f);
            photoViewer.f33943b6 = 0.0f;
            photoViewer.f33981f6 = 0.0f;
        }
        dv0 dv0Var = this.d;
        int abs = (int) Math.abs(this.f37808c - dv0Var.f37147a.getImageX());
        float imageY = dv0Var.f37147a.getImageY();
        float f16 = this.f37809e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (dv0Var.f37147a.isAspectFit()) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i21 = 2;
        dv0Var.d.getLocationInWindow(iArr);
        float f17 = dv0Var.f37149c + f16;
        int i22 = (int) ((iArr[1] - f17) + dv0Var.f37154j);
        if (i22 < 0) {
            i22 = i10;
        }
        int height = (int) (((f17 + layoutParams.height) - (dv0Var.d.getHeight() + i13)) + dv0Var.f37153i);
        if (height < 0) {
            height = i10;
        }
        int max = Math.max(i22, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i10][i10] = photoViewer.f33992h0.getScaleX();
        fArr[i10][1] = photoViewer.f33992h0.getScaleY();
        fArr[i10][2] = photoViewer.f33992h0.getTranslationX();
        fArr[i10][3] = photoViewer.f33992h0.getTranslationY();
        float[] fArr2 = fArr[i10];
        float f18 = abs;
        float f19 = dv0Var.f37155k;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        char c10 = 6;
        fArr2[6] = max2 * f19;
        int[] radius = photoViewer.f33992h0.getRadius();
        int i23 = i10;
        while (i23 < 4) {
            float[] fArr3 = fArr[i10];
            int i24 = i23 + 7;
            char c11 = c10;
            if (radius != null) {
                f10 = radius[i23];
            } else {
                f10 = 0.0f;
            }
            fArr3[i24] = f10;
            i23++;
            c10 = c11;
        }
        float[] fArr4 = fArr[i10];
        float f20 = dv0Var.f37155k;
        fArr4[11] = abs2 * f20;
        fArr4[12] = f18 * f20;
        float[] fArr5 = fArr[1];
        fArr5[i10] = f7;
        fArr5[1] = f7;
        fArr5[2] = u11;
        fArr5[3] = u10;
        fArr5[4] = 0.0f;
        fArr5[5] = 0.0f;
        fArr5[c10] = 0.0f;
        fArr5[7] = 0.0f;
        fArr5[8] = 0.0f;
        fArr5[9] = 0.0f;
        fArr5[10] = 0.0f;
        fArr5[11] = 0.0f;
        fArr5[12] = 0.0f;
        for (int i25 = i10; i25 < clippingImageViewArr.length; i25++) {
            clippingImageViewArr[i25].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i10);
        photoViewer.f33966e0.setAlpha(0.0f);
        photoViewer.f34010j0.setAlpha(0.0f);
        f90 f90Var = new f90(this, clippingImageViewArr, this.h, this.f37811n, this.f37810f, 15);
        photoViewer.f34065p4 = f90Var;
        if (!photoViewer.f34028l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f33949c2 == 1) {
                i14 = 3;
            } else {
                i14 = 2;
            }
            int length = i14 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i15);
            int i26 = 0;
            while (i26 < clippingImageViewArr.length) {
                float[] fArr6 = new float[i21];
                
                fArr6[0] = 0.0f;
                fArr6[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i26], org.telegram.ui.Components.u6.f31452f, fArr6);
                if (i26 == 0) {
                    ofFloat.addUpdateListener(new b3(this, 23));
                }
                arrayList.add(ofFloat);
                i26++;
                i21 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33992h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.u6.d, 0, 255));
            vu0 vu0Var = photoViewer.f33966e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(vu0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f34010j0, property, 0.0f, 1.0f));
            if (photoViewer.f33949c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new dp0(this, 8));
            photoViewer.f33966e0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f34056o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new tt0(2, this, animatorSet));
        } else {
            f90Var.run();
            photoViewer.f34065p4 = null;
            photoViewer.f33966e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.f33949c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new tt0(3, this, dv0Var);
        zn znVar = photoViewer.l4;
        if (znVar != null && znVar.getFragmentView() != null) {
            zn znVar2 = photoViewer.l4;
            znVar2.T7();
            UndoView undoView = znVar2.y3;
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
