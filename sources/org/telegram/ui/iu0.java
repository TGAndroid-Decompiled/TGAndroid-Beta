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
public final class iu0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f39000a;
    public final ViewGroup.LayoutParams f39001b;
    public final float f39002c;
    public final gv0 d;
    public final float f39003e;
    public final ev0 f39004f;
    public final ArrayList h;
    public final Integer f39005n;
    public final PhotoViewer f39006r;

    public iu0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, gv0 gv0Var, float f10, ev0 ev0Var, ArrayList arrayList, Integer num) {
        this.f39006r = photoViewer;
        this.f39000a = clippingImageViewArr;
        this.f39001b = layoutParams;
        this.f39002c = f7;
        this.d = gv0Var;
        this.f39003e = f10;
        this.f39004f = ev0Var;
        this.h = arrayList;
        this.f39005n = num;
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
        ?? r11;
        int i14;
        float f10;
        int i15;
        int i16;
        PhotoViewer photoViewer = this.f39006r;
        Rect rect = photoViewer.f33865s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f33797k4;
        ClippingImageView[] clippingImageViewArr = this.f39000a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f33758g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = photoViewer.f33724c2;
        ViewGroup.LayoutParams layoutParams = this.f39001b;
        if (i17 == 1) {
            if (!photoViewer.f33862s) {
                i15 = AndroidUtilities.statusBarHeight;
            } else {
                i15 = 0;
            }
            float f11 = i15;
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
            int measuredWidth2 = photoViewer.f33758g0.getMeasuredWidth();
            u11 = com.google.android.gms.internal.vision.e2.u(layoutParams.width, f7, (measuredWidth2 - i16) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float measuredWidth3 = photoViewer.f33758g0.getMeasuredWidth() / layoutParams.width;
            int i18 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f33862s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i18 + i11) / layoutParams.height);
            if (photoViewer.f33724c2 == 11) {
                f7 = photoViewer.r2(true) * min2;
            } else {
                f7 = min2;
            }
            int i19 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f33862s) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            u10 = com.google.android.gms.internal.vision.e2.u(layoutParams.height, f7, i19 + i12, 2.0f);
            u11 = com.google.android.gms.internal.vision.e2.u(layoutParams.width, f7, photoViewer.f33758g0.getMeasuredWidth(), 2.0f);
            photoViewer.f33718b6 = 0.0f;
            photoViewer.f33756f6 = 0.0f;
        }
        gv0 gv0Var = this.d;
        int abs = (int) Math.abs(this.f39002c - gv0Var.f38147a.getImageX());
        float imageY = gv0Var.f38147a.getImageY();
        float f16 = this.f39003e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (gv0Var.f38147a.isAspectFit()) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i20 = 2;
        gv0Var.d.getLocationInWindow(iArr);
        float f17 = gv0Var.f38149c + f16;
        int i21 = (int) ((iArr[1] - f17) + gv0Var.f38154j);
        if (i21 < 0) {
            i21 = i10;
        }
        int height = (int) (((f17 + layoutParams.height) - (gv0Var.d.getHeight() + i13)) + gv0Var.f38153i);
        if (height < 0) {
            height = i10;
        }
        int max = Math.max(i21, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i10][i10] = photoViewer.f33767h0.getScaleX();
        fArr[i10][1] = photoViewer.f33767h0.getScaleY();
        fArr[i10][2] = photoViewer.f33767h0.getTranslationX();
        fArr[i10][3] = photoViewer.f33767h0.getTranslationY();
        float[] fArr2 = fArr[i10];
        float f18 = abs;
        float f19 = gv0Var.f38155k;
        int i22 = 3;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        char c10 = 6;
        fArr2[6] = max2 * f19;
        int[] radius = photoViewer.f33767h0.getRadius();
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
        float f20 = gv0Var.f38155k;
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
        photoViewer.f33741e0.setAlpha(0.0f);
        photoViewer.f33785j0.setAlpha(0.0f);
        i90 i90Var = new i90(this, clippingImageViewArr, this.h, this.f39005n, this.f39004f, 15);
        photoViewer.f33840p4 = i90Var;
        if (!photoViewer.f33803l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f33724c2 != 1) {
                i22 = 2;
            }
            int length = i22 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i14);
            int i26 = 0;
            while (i26 < clippingImageViewArr.length) {
                float[] fArr6 = new float[i20];
                
                fArr6[0] = 0.0f;
                fArr6[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i26], org.telegram.ui.Components.u6.f31063f, fArr6);
                if (i26 == 0) {
                    ofFloat.addUpdateListener(new c3(this, 23));
                }
                arrayList.add(ofFloat);
                i26++;
                i20 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33767h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.u6.d, 0, 255));
            yu0 yu0Var = photoViewer.f33741e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(yu0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33785j0, property, 0.0f, 1.0f));
            if (photoViewer.f33724c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new gp0(this, 8));
            photoViewer.f33741e0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f33831o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new hu0(0, this, animatorSet));
            r11 = 1;
        } else {
            i90Var.run();
            photoViewer.f33840p4 = null;
            photoViewer.f33741e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            r11 = 1;
            r11 = 1;
            if (photoViewer.f33724c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new hu0(r11, this, gv0Var);
        eo eoVar = photoViewer.l4;
        if (eoVar != null && eoVar.getFragmentView() != null) {
            eo eoVar2 = photoViewer.l4;
            eoVar2.T7();
            UndoView undoView = eoVar2.y3;
            if (undoView != 0) {
                undoView.e(r11, false);
            }
            photoViewer.l4.getFragmentView().invalidate();
        }
        return r11;
    }
}
