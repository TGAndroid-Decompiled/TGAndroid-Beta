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
public final class cq0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f44772a;
    public final ViewGroup.LayoutParams f44773b;
    public final float f44774c;
    public final zq0 d;
    public final float f44775e;
    public final xq0 f44776f;
    public final ArrayList h;
    public final Integer f44777n;
    public final PhotoViewer f44778r;

    public cq0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, zq0 zq0Var, float f11, xq0 xq0Var, ArrayList arrayList, Integer num) {
        this.f44778r = photoViewer;
        this.f44772a = clippingImageViewArr;
        this.f44773b = layoutParams;
        this.f44774c = f10;
        this.d = zq0Var;
        this.f44775e = f11;
        this.f44776f = xq0Var;
        this.h = arrayList;
        this.f44777n = num;
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
        boolean z9;
        int i13;
        float f12;
        int i14;
        int i15;
        PhotoViewer photoViewer = this.f44778r;
        Rect rect = photoViewer.f41507s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f41429j4;
        ClippingImageView[] clippingImageViewArr = this.f44772a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f41401g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i16 = photoViewer.f41366c2;
        ViewGroup.LayoutParams layoutParams = this.f44773b;
        if (i16 == 1) {
            if (!photoViewer.f41504s) {
                i14 = org.telegram.messenger.g0.f22561m;
            } else {
                i14 = 0;
            }
            float f13 = i14;
            float measuredHeight = (photoViewer.C1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - f13;
            i7 = 0;
            float min = Math.min(photoViewer.C1.getMeasuredWidth(), measuredHeight) - (org.telegram.messenger.g0.L(16.0f) * 2);
            float measuredWidth = photoViewer.C1.getMeasuredWidth() / 2.0f;
            float f14 = (measuredHeight / 2.0f) + f13;
            float f15 = min / 2.0f;
            float f16 = f14 - f15;
            float f17 = (f14 + f15) - f16;
            f10 = Math.max(((measuredWidth + f15) - (measuredWidth - f15)) / layoutParams.width, f17 / layoutParams.height);
            w10 = ((f17 - (layoutParams.height * f10)) / 2.0f) + f16;
            int measuredWidth2 = photoViewer.f41401g0.getMeasuredWidth();
            f11 = com.google.android.recaptcha.internal.a.w(layoutParams.width, f10, (measuredWidth2 - i15) - rect.right, 2.0f) + rect.left;
        } else {
            i7 = 0;
            float measuredWidth3 = photoViewer.f41401g0.getMeasuredWidth() / layoutParams.width;
            Point point = org.telegram.messenger.g0.f22567q;
            int i17 = point.y;
            if (!photoViewer.f41504s) {
                i10 = org.telegram.messenger.g0.f22561m;
            } else {
                i10 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i17 + i10) / layoutParams.height);
            if (photoViewer.f41366c2 == 11) {
                min2 = photoViewer.o2(true) * min2;
            }
            int i18 = point.y;
            if (!photoViewer.f41504s) {
                i11 = org.telegram.messenger.g0.f22561m;
            } else {
                i11 = 0;
            }
            w10 = com.google.android.recaptcha.internal.a.w(layoutParams.height, min2, i18 + i11, 2.0f);
            float w11 = com.google.android.recaptcha.internal.a.w(layoutParams.width, min2, photoViewer.f41401g0.getMeasuredWidth(), 2.0f);
            photoViewer.f41350a6 = 0.0f;
            photoViewer.f41388e6 = 0.0f;
            f10 = min2;
            f11 = w11;
        }
        zq0 zq0Var = this.d;
        int abs = (int) Math.abs(this.f44774c - zq0Var.f52503a.K0);
        float f18 = zq0Var.f52503a.L0;
        float f19 = this.f44775e;
        int abs2 = (int) Math.abs(f19 - f18);
        if (zq0Var.f52503a.R0) {
            abs = i7;
        }
        int[] iArr = new int[2];
        int i19 = 2;
        zq0Var.d.getLocationInWindow(iArr);
        float f20 = zq0Var.f52505c + f19;
        int i20 = (int) ((iArr[1] - f20) + zq0Var.f52510j);
        if (i20 < 0) {
            i20 = i7;
        }
        int height = (int) (((f20 + layoutParams.height) - (zq0Var.d.getHeight() + i12)) + zq0Var.f52509i);
        if (height < 0) {
            height = i7;
        }
        int max = Math.max(i20, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i7][i7] = photoViewer.f41410h0.getScaleX();
        fArr[i7][1] = photoViewer.f41410h0.getScaleY();
        fArr[i7][2] = photoViewer.f41410h0.getTranslationX();
        fArr[i7][3] = photoViewer.f41410h0.getTranslationY();
        float[] fArr2 = fArr[i7];
        float f21 = abs;
        float f22 = zq0Var.f52511k;
        int i21 = 3;
        int i22 = 4;
        fArr2[4] = f21 * f22;
        fArr2[5] = max * f22;
        fArr2[6] = max2 * f22;
        int[] radius = photoViewer.f41410h0.getRadius();
        int i23 = i7;
        while (i23 < i22) {
            float[] fArr3 = fArr[i7];
            int i24 = i23 + 7;
            int i25 = i22;
            if (radius != null) {
                f12 = radius[i23];
            } else {
                f12 = 0.0f;
            }
            fArr3[i24] = f12;
            i23++;
            i22 = i25;
        }
        float[] fArr4 = fArr[i7];
        float f23 = zq0Var.f52511k;
        fArr4[11] = abs2 * f23;
        fArr4[12] = f21 * f23;
        float[] fArr5 = fArr[1];
        fArr5[i7] = f10;
        fArr5[1] = f10;
        fArr5[2] = f11;
        fArr5[3] = w10;
        fArr5[i22] = 0.0f;
        fArr5[5] = 0.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 0.0f;
        fArr5[8] = 0.0f;
        fArr5[9] = 0.0f;
        fArr5[10] = 0.0f;
        fArr5[11] = 0.0f;
        fArr5[12] = 0.0f;
        for (int i26 = i7; i26 < clippingImageViewArr.length; i26++) {
            clippingImageViewArr[i26].setAnimationProgress(0.0f);
        }
        backgroundDrawable.setAlpha(i7);
        photoViewer.f41382e0.setAlpha(0.0f);
        photoViewer.f41426j0.setAlpha(0.0f);
        org.telegram.ui.Components.n10 n10Var = new org.telegram.ui.Components.n10(this, clippingImageViewArr, this.h, this.f44777n, this.f44776f, 23);
        photoViewer.o4 = n10Var;
        if (!photoViewer.f41444l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f41366c2 != 1) {
                i21 = 2;
            }
            int length = i21 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i13);
            int i27 = 0;
            while (i27 < clippingImageViewArr.length) {
                float[] fArr6 = new float[i19];
                
                fArr6[0] = 0.0f;
                fArr6[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i27], org.telegram.ui.Components.l6.f35552f, fArr6);
                if (i27 == 0) {
                    ofFloat.addUpdateListener(new a3(this, 21));
                }
                arrayList.add(ofFloat);
                i27++;
                i19 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f41410h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.l6.d, 0, 255));
            sq0 sq0Var = photoViewer.f41382e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(sq0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f41426j0, property, 0.0f, 1.0f));
            if (photoViewer.f41366c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new g30(this, 16));
            photoViewer.f41382e0.setLayerType(2, null);
            photoViewer.v2(false);
            photoViewer.f41463n4 = System.currentTimeMillis();
            org.telegram.messenger.g0.h3(new tn0(6, this, animatorSet));
        } else {
            n10Var.run();
            photoViewer.o4 = null;
            photoViewer.f41382e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.f41366c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new tn0(7, this, zq0Var);
        cn cnVar = photoViewer.f41438k4;
        if (cnVar != null && cnVar.getFragmentView() != null) {
            cn cnVar2 = photoViewer.f41438k4;
            cnVar2.g8();
            UndoView undoView = cnVar2.M3;
            if (undoView != null) {
                z9 = true;
                undoView.d(1, false);
            } else {
                z9 = true;
            }
            photoViewer.f41438k4.getFragmentView().invalidate();
            return z9;
        }
        return true;
    }
}
