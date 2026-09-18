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
public final class hu0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f34352a;
    public final ViewGroup.LayoutParams f34353b;
    public final float f34354c;
    public final fv0 d;
    public final float e;
    public final dv0 f34355f;
    public final ArrayList h;
    public final Integer f34356n;
    public final PhotoViewer f34357r;

    public hu0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, fv0 fv0Var, float f10, dv0 dv0Var, ArrayList arrayList, Integer num) {
        this.f34357r = photoViewer;
        this.f34352a = clippingImageViewArr;
        this.f34353b = layoutParams;
        this.f34354c = f7;
        this.d = fv0Var;
        this.e = f10;
        this.f34355f = dv0Var;
        this.h = arrayList;
        this.f34356n = num;
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
        PhotoViewer photoViewer = this.f34357r;
        Rect rect = photoViewer.f31078s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f31010k4;
        ClippingImageView[] clippingImageViewArr = this.f34352a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f30971g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i16 = photoViewer.f30938c2;
        ViewGroup.LayoutParams layoutParams = this.f34353b;
        if (i16 == 1) {
            if (!photoViewer.f31075s) {
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
            int measuredWidth2 = photoViewer.f30971g0.getMeasuredWidth();
            v9 = com.google.android.gms.internal.vision.e2.v(layoutParams.width, f7, (measuredWidth2 - i15) - rect.right, 2.0f) + rect.left;
        } else {
            c10 = 0;
            float measuredWidth3 = photoViewer.f30971g0.getMeasuredWidth() / layoutParams.width;
            int i17 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f31075s) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i17 + i10) / layoutParams.height);
            if (photoViewer.f30938c2 == 11) {
                f7 = photoViewer.q2(true) * min2;
            } else {
                f7 = min2;
            }
            int i18 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f31075s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            v = com.google.android.gms.internal.vision.e2.v(layoutParams.height, f7, i18 + i11, 2.0f);
            v9 = com.google.android.gms.internal.vision.e2.v(layoutParams.width, f7, photoViewer.f30971g0.getMeasuredWidth(), 2.0f);
            photoViewer.f30932b6 = 0.0f;
            photoViewer.f30969f6 = 0.0f;
        }
        fv0 fv0Var = this.d;
        int abs = (int) Math.abs(this.f34354c - fv0Var.f33767a.getImageX());
        float imageY = fv0Var.f33767a.getImageY();
        float f16 = this.e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (fv0Var.f33767a.isAspectFit()) {
            abs = 0;
        }
        int[] iArr = new int[2];
        fv0Var.d.getLocationInWindow(iArr);
        float f17 = fv0Var.f33769c + f16;
        int i19 = (int) ((iArr[1] - f17) + fv0Var.f33773j);
        if (i19 < 0) {
            i19 = 0;
        }
        int height = (int) (((f17 + layoutParams.height) - (fv0Var.d.getHeight() + i12)) + fv0Var.f33772i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i19, abs2);
        int max2 = Math.max(height, abs2);
        fArr[c10][c10] = photoViewer.f30980h0.getScaleX();
        fArr[c10][1] = photoViewer.f30980h0.getScaleY();
        fArr[c10][2] = photoViewer.f30980h0.getTranslationX();
        fArr[c10][3] = photoViewer.f30980h0.getTranslationY();
        float[] fArr2 = fArr[c10];
        float f18 = abs;
        float f19 = fv0Var.f33774k;
        int i20 = 3;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        fArr2[6] = max2 * f19;
        int[] radius = photoViewer.f30980h0.getRadius();
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
        float f20 = fv0Var.f33774k;
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
        photoViewer.f30954e0.setAlpha(0.0f);
        photoViewer.f30998j0.setAlpha(0.0f);
        i90 i90Var = new i90(this, clippingImageViewArr, this.h, this.f34356n, this.f34355f, 15);
        photoViewer.f31053p4 = i90Var;
        if (!photoViewer.f31016l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f30938c2 != 1) {
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i23], org.telegram.ui.Components.q6.f27227f, 0.0f, 1.0f);
                if (i23 == 0) {
                    ofFloat.addUpdateListener(new b3(this, 22));
                }
                arrayList.add(ofFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f30980h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.q6.d, 0, 255));
            xu0 xu0Var = photoViewer.f30954e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(xu0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f30998j0, property, 0.0f, 1.0f));
            if (photoViewer.f30938c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new er0(this, 7));
            photoViewer.f30954e0.setLayerType(2, null);
            photoViewer.x2(false);
            photoViewer.f31044o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new pl0(19, this, animatorSet));
        } else {
            i90Var.run();
            photoViewer.f31053p4 = null;
            photoViewer.f30954e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.f30938c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new pl0(20, this, fv0Var);
        bo boVar = photoViewer.l4;
        if (boVar != null && boVar.getFragmentView() != null) {
            bo boVar2 = photoViewer.l4;
            boVar2.Q7();
            UndoView undoView = boVar2.y3;
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
