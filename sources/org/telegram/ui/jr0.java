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
public final class jr0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f38577a;
    public final ViewGroup.LayoutParams f38578b;
    public final float f38579c;
    public final gs0 d;
    public final float e;
    public final es0 f38580f;
    public final ArrayList h;
    public final Integer f38581n;
    public final PhotoViewer f38582r;

    public jr0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, gs0 gs0Var, float f10, es0 es0Var, ArrayList arrayList, Integer num) {
        this.f38582r = photoViewer;
        this.f38577a = clippingImageViewArr;
        this.f38578b = layoutParams;
        this.f38579c = f7;
        this.d = gs0Var;
        this.e = f10;
        this.f38580f = es0Var;
        this.h = arrayList;
        this.f38581n = num;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        int i11;
        int i12;
        float g10;
        float f7;
        float f10;
        int i13;
        boolean z10;
        int i14;
        float f11;
        int i15;
        int i16;
        PhotoViewer photoViewer = this.f38582r;
        Rect rect = photoViewer.f33595s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f33527k4;
        ClippingImageView[] clippingImageViewArr = this.f38577a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f33487g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = photoViewer.f33454c2;
        ViewGroup.LayoutParams layoutParams = this.f38578b;
        if (i17 == 1) {
            if (!photoViewer.f33592s) {
                i15 = org.telegram.messenger.i0.f16020m;
            } else {
                i15 = 0;
            }
            float f12 = i15;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - org.telegram.messenger.i0.L(64.0f)) - f12;
            i10 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (org.telegram.messenger.i0.L(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f13 = (measuredHeight / 2.0f) + f12;
            float f14 = min / 2.0f;
            float f15 = f13 - f14;
            float f16 = (f13 + f14) - f15;
            f7 = Math.max(((measuredWidth + f14) - (measuredWidth - f14)) / layoutParams.width, f16 / layoutParams.height);
            g10 = ((f16 - (layoutParams.height * f7)) / 2.0f) + f15;
            int measuredWidth2 = photoViewer.f33487g0.getMeasuredWidth();
            f10 = c3.i0.g(layoutParams.width, f7, (measuredWidth2 - i16) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float measuredWidth3 = photoViewer.f33487g0.getMeasuredWidth() / layoutParams.width;
            Point point = org.telegram.messenger.i0.f16026q;
            int i18 = point.y;
            if (!photoViewer.f33592s) {
                i11 = org.telegram.messenger.i0.f16020m;
            } else {
                i11 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i18 + i11) / layoutParams.height);
            if (photoViewer.f33454c2 == 11) {
                min2 = photoViewer.u2(true) * min2;
            }
            int i19 = point.y;
            if (!photoViewer.f33592s) {
                i12 = org.telegram.messenger.i0.f16020m;
            } else {
                i12 = 0;
            }
            g10 = c3.i0.g(layoutParams.height, min2, i19 + i12, 2.0f);
            float g11 = c3.i0.g(layoutParams.width, min2, photoViewer.f33487g0.getMeasuredWidth(), 2.0f);
            photoViewer.f33448b6 = 0.0f;
            photoViewer.f33485f6 = 0.0f;
            f7 = min2;
            f10 = g11;
        }
        gs0 gs0Var = this.d;
        int abs = (int) Math.abs(this.f38579c - gs0Var.f37627a.K0);
        float f17 = gs0Var.f37627a.L0;
        float f18 = this.e;
        int abs2 = (int) Math.abs(f18 - f17);
        if (gs0Var.f37627a.R0) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i20 = 2;
        gs0Var.d.getLocationInWindow(iArr);
        float f19 = gs0Var.f37629c + f18;
        int i21 = (int) ((iArr[1] - f19) + gs0Var.f37633j);
        if (i21 < 0) {
            i21 = i10;
        }
        int height = (int) (((f19 + layoutParams.height) - (gs0Var.d.getHeight() + i13)) + gs0Var.f37632i);
        if (height < 0) {
            height = i10;
        }
        int max = Math.max(i21, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i10][i10] = photoViewer.f33496h0.getScaleX();
        fArr[i10][1] = photoViewer.f33496h0.getScaleY();
        fArr[i10][2] = photoViewer.f33496h0.getTranslationX();
        fArr[i10][3] = photoViewer.f33496h0.getTranslationY();
        float[] fArr2 = fArr[i10];
        float f20 = abs;
        float f21 = gs0Var.f37634k;
        int i22 = 3;
        fArr2[4] = f20 * f21;
        fArr2[5] = max * f21;
        char c10 = 6;
        fArr2[6] = max2 * f21;
        int[] radius = photoViewer.f33496h0.getRadius();
        int i23 = i10;
        while (i23 < 4) {
            float[] fArr3 = fArr[i10];
            int i24 = i23 + 7;
            char c11 = c10;
            if (radius != null) {
                f11 = radius[i23];
            } else {
                f11 = 0.0f;
            }
            fArr3[i24] = f11;
            i23++;
            c10 = c11;
        }
        float[] fArr4 = fArr[i10];
        float f22 = gs0Var.f37634k;
        fArr4[11] = abs2 * f22;
        fArr4[12] = f20 * f22;
        float[] fArr5 = fArr[1];
        fArr5[i10] = f7;
        fArr5[1] = f7;
        fArr5[2] = f10;
        fArr5[3] = g10;
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
        photoViewer.f33470e0.setAlpha(0.0f);
        photoViewer.f33514j0.setAlpha(0.0f);
        m90 m90Var = new m90(this, clippingImageViewArr, this.h, this.f38581n, this.f38580f, 12);
        photoViewer.f33570p4 = m90Var;
        if (!photoViewer.f33533l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f33454c2 != 1) {
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i26], org.telegram.ui.Components.i6.f26890f, fArr6);
                if (i26 == 0) {
                    ofFloat.addUpdateListener(new a3(this, 21));
                }
                arrayList.add(ofFloat);
                i26++;
                i20 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33496h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.i6.d, 0, 255));
            as0 as0Var = photoViewer.f33470e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(as0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33514j0, property, 0.0f, 1.0f));
            if (photoViewer.f33454c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new org.telegram.ui.Components.voip.h2(this, 27));
            photoViewer.f33470e0.setLayerType(2, null);
            photoViewer.B2(false);
            photoViewer.f33561o4 = System.currentTimeMillis();
            org.telegram.messenger.i0.g3(new uf0(28, this, animatorSet));
        } else {
            m90Var.run();
            photoViewer.f33570p4 = null;
            photoViewer.f33470e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.f33454c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new uf0(29, this, gs0Var);
        un unVar = photoViewer.l4;
        if (unVar != null && unVar.getFragmentView() != null) {
            un unVar2 = photoViewer.l4;
            unVar2.Y7();
            UndoView undoView = unVar2.M3;
            if (undoView != null) {
                z10 = true;
                undoView.d(1, false);
            } else {
                z10 = true;
            }
            photoViewer.l4.getFragmentView().invalidate();
            return z10;
        }
        return true;
    }
}
