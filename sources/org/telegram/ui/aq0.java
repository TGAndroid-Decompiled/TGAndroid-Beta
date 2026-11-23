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
    public final ClippingImageView[] f45791a;
    public final ViewGroup.LayoutParams f45792b;
    public final float f45793c;
    public final wq0 d;
    public final float f45794e;
    public final uq0 f45795f;
    public final ArrayList h;
    public final Integer f45796n;
    public final PhotoViewer f45797r;

    public aq0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f10, wq0 wq0Var, float f11, uq0 uq0Var, ArrayList arrayList, Integer num) {
        this.f45797r = photoViewer;
        this.f45791a = clippingImageViewArr;
        this.f45792b = layoutParams;
        this.f45793c = f10;
        this.d = wq0Var;
        this.f45794e = f11;
        this.f45795f = uq0Var;
        this.h = arrayList;
        this.f45796n = num;
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
        int i14;
        float f12;
        int i15;
        int i16;
        PhotoViewer photoViewer = this.f45797r;
        Rect rect = photoViewer.f43457t2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.M0;
        float[][] fArr = photoViewer.f43380k4;
        ClippingImageView[] clippingImageViewArr = this.f45791a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f43352h0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = photoViewer.d2;
        ViewGroup.LayoutParams layoutParams = this.f45792b;
        if (i17 == 1) {
            if (!photoViewer.f43446s) {
                i15 = org.telegram.messenger.g0.f24220m;
            } else {
                i15 = 0;
            }
            float f13 = i15;
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
            int measuredWidth2 = photoViewer.f43352h0.getMeasuredWidth();
            f11 = com.google.android.gms.internal.vision.e2.w(layoutParams.width, f10, (measuredWidth2 - i16) - rect.right, 2.0f) + rect.left;
        } else {
            i7 = 0;
            float measuredWidth3 = photoViewer.f43352h0.getMeasuredWidth() / layoutParams.width;
            Point point = org.telegram.messenger.g0.f24226q;
            int i18 = point.y;
            if (!photoViewer.f43446s) {
                i10 = org.telegram.messenger.g0.f24220m;
            } else {
                i10 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i18 + i10) / layoutParams.height);
            if (photoViewer.d2 == 11) {
                min2 = photoViewer.q2(true) * min2;
            }
            int i19 = point.y;
            if (!photoViewer.f43446s) {
                i11 = org.telegram.messenger.g0.f24220m;
            } else {
                i11 = 0;
            }
            w10 = com.google.android.gms.internal.vision.e2.w(layoutParams.height, min2, i19 + i11, 2.0f);
            float w11 = com.google.android.gms.internal.vision.e2.w(layoutParams.width, min2, photoViewer.f43352h0.getMeasuredWidth(), 2.0f);
            photoViewer.f43298b6 = 0.0f;
            photoViewer.f43340f6 = 0.0f;
            f10 = min2;
            f11 = w11;
        }
        wq0 wq0Var = this.d;
        int abs = (int) Math.abs(this.f45793c - wq0Var.f53726a.L0);
        float f18 = wq0Var.f53726a.M0;
        float f19 = this.f45794e;
        int abs2 = (int) Math.abs(f19 - f18);
        if (wq0Var.f53726a.S0) {
            abs = i7;
        }
        int[] iArr = new int[2];
        int i20 = 2;
        wq0Var.d.getLocationInWindow(iArr);
        float f20 = wq0Var.f53728c + f19;
        int i21 = (int) ((iArr[1] - f20) + wq0Var.f53733j);
        if (i21 < 0) {
            i21 = i7;
        }
        int height = (int) (((f20 + layoutParams.height) - (wq0Var.d.getHeight() + i12)) + wq0Var.f53732i);
        if (height < 0) {
            height = i7;
        }
        int max = Math.max(i21, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i7][i7] = photoViewer.f43360i0.getScaleX();
        fArr[i7][1] = photoViewer.f43360i0.getScaleY();
        fArr[i7][2] = photoViewer.f43360i0.getTranslationX();
        fArr[i7][3] = photoViewer.f43360i0.getTranslationY();
        float[] fArr2 = fArr[i7];
        float f21 = abs;
        float f22 = wq0Var.f53734k;
        fArr2[4] = f21 * f22;
        fArr2[5] = max * f22;
        char c10 = 6;
        fArr2[6] = max2 * f22;
        int[] radius = photoViewer.f43360i0.getRadius();
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
        float f23 = wq0Var.f53734k;
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
        photoViewer.f43334f0.setAlpha(0.0f);
        photoViewer.f43376k0.setAlpha(0.0f);
        ip ipVar = new ip(this, clippingImageViewArr, this.h, this.f45796n, this.f45795f, 26);
        photoViewer.f43422p4 = ipVar;
        if (!photoViewer.f43394m2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.d2 == 1) {
                i13 = 3;
            } else {
                i13 = 2;
            }
            int length = i13 + clippingImageViewArr.length;
            if (clippingImageViewArr.length > 1) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            ArrayList arrayList = new ArrayList(length + i14);
            int i25 = 0;
            while (i25 < clippingImageViewArr.length) {
                float[] fArr6 = new float[i20];
                
                fArr6[0] = 0.0f;
                fArr6[1] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i25], org.telegram.ui.Components.q6.f38714f, fArr6);
                if (i25 == 0) {
                    ofFloat.addUpdateListener(new a3(this, 21));
                }
                arrayList.add(ofFloat);
                i25++;
                i20 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f43360i0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.q6.d, 0, 255));
            qq0 qq0Var = photoViewer.f43334f0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(qq0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f43376k0, property, 0.0f, 1.0f));
            if (photoViewer.d2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.D1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new zx(this, 17));
            photoViewer.f43334f0.setLayerType(2, null);
            photoViewer.x2(false);
            photoViewer.o4 = System.currentTimeMillis();
            org.telegram.messenger.g0.g3(new mp0(2, this, animatorSet));
        } else {
            ipVar.run();
            photoViewer.f43422p4 = null;
            photoViewer.f43334f0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.d2 == 1) {
                photoViewer.D1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new mp0(3, this, wq0Var);
        bn bnVar = photoViewer.f43388l4;
        if (bnVar != null && bnVar.getFragmentView() != null) {
            bn bnVar2 = photoViewer.f43388l4;
            bnVar2.h8();
            UndoView undoView = bnVar2.N3;
            if (undoView != null) {
                z10 = true;
                undoView.d(1, false);
            } else {
                z10 = true;
            }
            photoViewer.f43388l4.getFragmentView().invalidate();
            return z10;
        }
        return true;
    }
}
