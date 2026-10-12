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
public final class mu0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f38349a;
    public final ViewGroup.LayoutParams f38350b;
    public final float f38351c;
    public final kv0 d;
    public final float e;
    public final iv0 f38352f;
    public final ArrayList h;
    public final Integer f38353n;
    public final PhotoViewer f38354r;

    public mu0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, kv0 kv0Var, float f10, iv0 iv0Var, ArrayList arrayList, Integer num) {
        this.f38354r = photoViewer;
        this.f38349a = clippingImageViewArr;
        this.f38350b = layoutParams;
        this.f38351c = f7;
        this.d = kv0Var;
        this.e = f10;
        this.f38352f = iv0Var;
        this.h = arrayList;
        this.f38353n = num;
    }

    @Override
    public final boolean onPreDraw() {
        int i10;
        int i11;
        float f7;
        int i12;
        float c10;
        float c11;
        int i13;
        boolean z10;
        int i14;
        float f10;
        int i15;
        int i16;
        PhotoViewer photoViewer = this.f38354r;
        Rect rect = photoViewer.f32351s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f32283k4;
        ClippingImageView[] clippingImageViewArr = this.f38349a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f32243g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = photoViewer.f32210c2;
        ViewGroup.LayoutParams layoutParams = this.f38350b;
        if (i17 == 1) {
            if (!photoViewer.f32348s) {
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
            c10 = ((f15 - (layoutParams.height * f7)) / 2.0f) + f14;
            int measuredWidth2 = photoViewer.f32243g0.getMeasuredWidth();
            c11 = com.google.android.gms.internal.play_billing.k3.c(layoutParams.width, f7, (measuredWidth2 - i16) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float measuredWidth3 = photoViewer.f32243g0.getMeasuredWidth() / layoutParams.width;
            int i18 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f32348s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i18 + i11) / layoutParams.height);
            if (photoViewer.f32210c2 == 11) {
                f7 = photoViewer.r2(true) * min2;
            } else {
                f7 = min2;
            }
            int i19 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f32348s) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            c10 = com.google.android.gms.internal.play_billing.k3.c(layoutParams.height, f7, i19 + i12, 2.0f);
            c11 = com.google.android.gms.internal.play_billing.k3.c(layoutParams.width, f7, photoViewer.f32243g0.getMeasuredWidth(), 2.0f);
            photoViewer.f32204b6 = 0.0f;
            photoViewer.f32241f6 = 0.0f;
        }
        kv0 kv0Var = this.d;
        int abs = (int) Math.abs(this.f38351c - kv0Var.f37751a.getImageX());
        float imageY = kv0Var.f37751a.getImageY();
        float f16 = this.e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (kv0Var.f37751a.isAspectFit()) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i20 = 2;
        kv0Var.d.getLocationInWindow(iArr);
        float f17 = kv0Var.f37753c + f16;
        int i21 = (int) ((iArr[1] - f17) + kv0Var.f37757j);
        if (i21 < 0) {
            i21 = i10;
        }
        int height = (int) (((f17 + layoutParams.height) - (kv0Var.d.getHeight() + i13)) + kv0Var.f37756i);
        if (height < 0) {
            height = i10;
        }
        int max = Math.max(i21, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i10][i10] = photoViewer.f32252h0.getScaleX();
        fArr[i10][1] = photoViewer.f32252h0.getScaleY();
        fArr[i10][2] = photoViewer.f32252h0.getTranslationX();
        fArr[i10][3] = photoViewer.f32252h0.getTranslationY();
        float[] fArr2 = fArr[i10];
        float f18 = abs;
        float f19 = kv0Var.f37758k;
        int i22 = 3;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        char c12 = 6;
        fArr2[6] = max2 * f19;
        int[] radius = photoViewer.f32252h0.getRadius();
        int i23 = i10;
        while (i23 < 4) {
            float[] fArr3 = fArr[i10];
            int i24 = i23 + 7;
            char c13 = c12;
            if (radius != null) {
                f10 = radius[i23];
            } else {
                f10 = 0.0f;
            }
            fArr3[i24] = f10;
            i23++;
            c12 = c13;
        }
        char c14 = c12;
        float[] fArr4 = fArr[i10];
        float f20 = abs2;
        float f21 = kv0Var.f37758k;
        fArr4[11] = f20 * f21;
        fArr4[12] = f18 * f21;
        float[] fArr5 = fArr[1];
        fArr5[i10] = f7;
        fArr5[1] = f7;
        fArr5[2] = c11;
        fArr5[3] = c10;
        fArr5[4] = 0.0f;
        fArr5[5] = 0.0f;
        fArr5[c14] = 0.0f;
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
        photoViewer.f32226e0.setAlpha(0.0f);
        photoViewer.f32270j0.setAlpha(0.0f);
        l90 l90Var = new l90(this, clippingImageViewArr, this.h, this.f38353n, this.f38352f, 15);
        photoViewer.f32326p4 = l90Var;
        if (!photoViewer.f32289l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f32210c2 != 1) {
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i26], org.telegram.ui.Components.v6.f29902f, fArr6);
                if (i26 == 0) {
                    ofFloat.addUpdateListener(new e3(this, 23));
                }
                arrayList.add(ofFloat);
                i26++;
                i20 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f32252h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.v6.d, 0, 255));
            cv0 cv0Var = photoViewer.f32226e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(cv0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f32270j0, property, 0.0f, 1.0f));
            if (photoViewer.f32210c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new lj0(this, 11));
            photoViewer.f32226e0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f32317o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new on0(14, this, animatorSet));
        } else {
            l90Var.run();
            photoViewer.f32326p4 = null;
            photoViewer.f32226e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.f32210c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new on0(15, this, kv0Var);
        fo foVar = photoViewer.l4;
        if (foVar != null && foVar.getFragmentView() != null) {
            fo foVar2 = photoViewer.l4;
            foVar2.T7();
            UndoView undoView = foVar2.y3;
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
