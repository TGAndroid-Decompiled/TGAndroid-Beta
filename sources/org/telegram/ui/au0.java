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
public final class au0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f34912a;
    public final ViewGroup.LayoutParams f34913b;
    public final float f34914c;
    public final yu0 d;
    public final float f34915e;
    public final wu0 f34916f;
    public final ArrayList h;
    public final Integer f34917n;
    public final PhotoViewer f34918r;

    public au0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, yu0 yu0Var, float f10, wu0 wu0Var, ArrayList arrayList, Integer num) {
        this.f34918r = photoViewer;
        this.f34912a = clippingImageViewArr;
        this.f34913b = layoutParams;
        this.f34914c = f7;
        this.d = yu0Var;
        this.f34915e = f10;
        this.f34916f = wu0Var;
        this.h = arrayList;
        this.f34917n = num;
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
        PhotoViewer photoViewer = this.f34918r;
        Rect rect = photoViewer.f34018s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f33950k4;
        ClippingImageView[] clippingImageViewArr = this.f34912a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f33911g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i16 = photoViewer.f33877c2;
        ViewGroup.LayoutParams layoutParams = this.f34913b;
        if (i16 == 1) {
            if (!photoViewer.f34015s) {
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
            int measuredWidth2 = photoViewer.f33911g0.getMeasuredWidth();
            v9 = com.google.android.gms.internal.vision.e2.v(layoutParams.width, f7, (measuredWidth2 - i15) - rect.right, 2.0f) + rect.left;
        } else {
            c10 = 0;
            float measuredWidth3 = photoViewer.f33911g0.getMeasuredWidth() / layoutParams.width;
            int i17 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f34015s) {
                i10 = AndroidUtilities.statusBarHeight;
            } else {
                i10 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i17 + i10) / layoutParams.height);
            if (photoViewer.f33877c2 == 11) {
                f7 = photoViewer.r2(true) * min2;
            } else {
                f7 = min2;
            }
            int i18 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f34015s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            v = com.google.android.gms.internal.vision.e2.v(layoutParams.height, f7, i18 + i11, 2.0f);
            v9 = com.google.android.gms.internal.vision.e2.v(layoutParams.width, f7, photoViewer.f33911g0.getMeasuredWidth(), 2.0f);
            photoViewer.f33871b6 = 0.0f;
            photoViewer.f33909f6 = 0.0f;
        }
        yu0 yu0Var = this.d;
        int abs = (int) Math.abs(this.f34914c - yu0Var.f43619a.getImageX());
        float imageY = yu0Var.f43619a.getImageY();
        float f16 = this.f34915e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (yu0Var.f43619a.isAspectFit()) {
            abs = 0;
        }
        int[] iArr = new int[2];
        yu0Var.d.getLocationInWindow(iArr);
        float f17 = yu0Var.f43621c + f16;
        int i19 = (int) ((iArr[1] - f17) + yu0Var.f43626j);
        if (i19 < 0) {
            i19 = 0;
        }
        int height = (int) (((f17 + layoutParams.height) - (yu0Var.d.getHeight() + i12)) + yu0Var.f43625i);
        if (height < 0) {
            height = 0;
        }
        int max = Math.max(i19, abs2);
        int max2 = Math.max(height, abs2);
        fArr[c10][c10] = photoViewer.f33920h0.getScaleX();
        fArr[c10][1] = photoViewer.f33920h0.getScaleY();
        fArr[c10][2] = photoViewer.f33920h0.getTranslationX();
        fArr[c10][3] = photoViewer.f33920h0.getTranslationY();
        float[] fArr2 = fArr[c10];
        float f18 = abs;
        float f19 = yu0Var.f43627k;
        int i20 = 3;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        fArr2[6] = max2 * f19;
        int[] radius = photoViewer.f33920h0.getRadius();
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
        float f20 = yu0Var.f43627k;
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
        photoViewer.f33894e0.setAlpha(0.0f);
        photoViewer.f33938j0.setAlpha(0.0f);
        f90 f90Var = new f90(this, clippingImageViewArr, this.h, this.f34917n, this.f34916f, 15);
        photoViewer.f33993p4 = f90Var;
        if (!photoViewer.f33956l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f33877c2 != 1) {
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i23], org.telegram.ui.Components.s6.f30633f, 0.0f, 1.0f);
                if (i23 == 0) {
                    ofFloat.addUpdateListener(new c3(this, 22));
                }
                arrayList.add(ofFloat);
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33920h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.s6.d, 0, 255));
            qu0 qu0Var = photoViewer.f33894e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(qu0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33938j0, property, 0.0f, 1.0f));
            if (photoViewer.f33877c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new ap0(this, 8));
            photoViewer.f33894e0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f33984o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new wj0(22, this, animatorSet));
        } else {
            f90Var.run();
            photoViewer.f33993p4 = null;
            photoViewer.f33894e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView3 : clippingImageViewArr) {
                clippingImageView3.setAnimationProgress(1.0f);
            }
            if (photoViewer.f33877c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new wj0(23, this, yu0Var);
        yn ynVar = photoViewer.l4;
        if (ynVar != null && ynVar.getFragmentView() != null) {
            yn ynVar2 = photoViewer.l4;
            ynVar2.Q7();
            UndoView undoView = ynVar2.f43541w3;
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
