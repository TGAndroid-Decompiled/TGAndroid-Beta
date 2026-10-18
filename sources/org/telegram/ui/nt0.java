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
public final class nt0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f39568a;
    public final ViewGroup.LayoutParams f39569b;
    public final float f39570c;
    public final lu0 d;
    public final float e;
    public final ju0 f39571f;
    public final ArrayList h;
    public final Integer f39572n;
    public final PhotoViewer f39573r;

    public nt0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, lu0 lu0Var, float f10, ju0 ju0Var, ArrayList arrayList, Integer num) {
        this.f39573r = photoViewer;
        this.f39568a = clippingImageViewArr;
        this.f39569b = layoutParams;
        this.f39570c = f7;
        this.d = lu0Var;
        this.e = f10;
        this.f39571f = ju0Var;
        this.h = arrayList;
        this.f39572n = num;
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
        PhotoViewer photoViewer = this.f39573r;
        Rect rect = photoViewer.f33398s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f33330k4;
        ClippingImageView[] clippingImageViewArr = this.f39568a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f33290g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = photoViewer.f33257c2;
        ViewGroup.LayoutParams layoutParams = this.f39569b;
        if (i17 == 1) {
            if (!photoViewer.f33395s) {
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
            int measuredWidth2 = photoViewer.f33290g0.getMeasuredWidth();
            c11 = com.google.android.gms.internal.play_billing.k3.c(layoutParams.width, f7, (measuredWidth2 - i16) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float measuredWidth3 = photoViewer.f33290g0.getMeasuredWidth() / layoutParams.width;
            int i18 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f33395s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i18 + i11) / layoutParams.height);
            if (photoViewer.f33257c2 == 11) {
                f7 = photoViewer.r2(true) * min2;
            } else {
                f7 = min2;
            }
            int i19 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f33395s) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            c10 = com.google.android.gms.internal.play_billing.k3.c(layoutParams.height, f7, i19 + i12, 2.0f);
            c11 = com.google.android.gms.internal.play_billing.k3.c(layoutParams.width, f7, photoViewer.f33290g0.getMeasuredWidth(), 2.0f);
            photoViewer.f33251b6 = 0.0f;
            photoViewer.f33288f6 = 0.0f;
        }
        lu0 lu0Var = this.d;
        int abs = (int) Math.abs(this.f39570c - lu0Var.f38961a.getImageX());
        float imageY = lu0Var.f38961a.getImageY();
        float f16 = this.e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (lu0Var.f38961a.isAspectFit()) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i20 = 2;
        lu0Var.d.getLocationInWindow(iArr);
        float f17 = lu0Var.f38963c + f16;
        int i21 = (int) ((iArr[1] - f17) + lu0Var.f38967j);
        if (i21 < 0) {
            i21 = i10;
        }
        int height = (int) (((f17 + layoutParams.height) - (lu0Var.d.getHeight() + i13)) + lu0Var.f38966i);
        if (height < 0) {
            height = i10;
        }
        int max = Math.max(i21, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i10][i10] = photoViewer.f33299h0.getScaleX();
        fArr[i10][1] = photoViewer.f33299h0.getScaleY();
        fArr[i10][2] = photoViewer.f33299h0.getTranslationX();
        fArr[i10][3] = photoViewer.f33299h0.getTranslationY();
        float[] fArr2 = fArr[i10];
        float f18 = abs;
        float f19 = lu0Var.f38968k;
        int i22 = 3;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        char c12 = 6;
        fArr2[6] = max2 * f19;
        int[] radius = photoViewer.f33299h0.getRadius();
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
        float[] fArr4 = fArr[i10];
        float f20 = lu0Var.f38968k;
        fArr4[11] = abs2 * f20;
        fArr4[12] = f18 * f20;
        float[] fArr5 = fArr[1];
        fArr5[i10] = f7;
        fArr5[1] = f7;
        fArr5[2] = c11;
        fArr5[3] = c10;
        fArr5[4] = 0.0f;
        fArr5[5] = 0.0f;
        fArr5[c12] = 0.0f;
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
        photoViewer.f33273e0.setAlpha(0.0f);
        photoViewer.f33317j0.setAlpha(0.0f);
        org.telegram.ui.Components.g30 g30Var = new org.telegram.ui.Components.g30(this, clippingImageViewArr, this.h, this.f39572n, this.f39571f, 23);
        photoViewer.f33373p4 = g30Var;
        if (!photoViewer.f33336l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f33257c2 != 1) {
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i26], org.telegram.ui.Components.t6.f30481f, fArr6);
                if (i26 == 0) {
                    ofFloat.addUpdateListener(new e3(this, 23));
                }
                arrayList.add(ofFloat);
                i26++;
                i20 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33299h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.t6.d, 0, 255));
            du0 du0Var = photoViewer.f33273e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(du0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33317j0, property, 0.0f, 1.0f));
            if (photoViewer.f33257c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new bc0(this, 13));
            photoViewer.f33273e0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f33364o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new zg0(27, this, animatorSet));
        } else {
            g30Var.run();
            photoViewer.f33373p4 = null;
            photoViewer.f33273e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.f33257c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new zg0(28, this, lu0Var);
        sn snVar = photoViewer.l4;
        if (snVar != null && snVar.getFragmentView() != null) {
            sn snVar2 = photoViewer.l4;
            snVar2.T7();
            UndoView undoView = snVar2.y3;
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
