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
public final class gu0 implements ViewTreeObserver.OnPreDrawListener {
    public final ClippingImageView[] f38110a;
    public final ViewGroup.LayoutParams f38111b;
    public final float f38112c;
    public final ev0 d;
    public final float f38113e;
    public final cv0 f38114f;
    public final ArrayList h;
    public final Integer f38115n;
    public final PhotoViewer f38116r;

    public gu0(PhotoViewer photoViewer, ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f7, ev0 ev0Var, float f10, cv0 cv0Var, ArrayList arrayList, Integer num) {
        this.f38116r = photoViewer;
        this.f38110a = clippingImageViewArr;
        this.f38111b = layoutParams;
        this.f38112c = f7;
        this.d = ev0Var;
        this.f38113e = f10;
        this.f38114f = cv0Var;
        this.h = arrayList;
        this.f38115n = num;
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
        PhotoViewer photoViewer = this.f38116r;
        Rect rect = photoViewer.f34028s2;
        PhotoViewer.BackgroundDrawable backgroundDrawable = photoViewer.L0;
        float[][] fArr = photoViewer.f33960k4;
        ClippingImageView[] clippingImageViewArr = this.f38110a;
        if (clippingImageViewArr.length > 1) {
            clippingImageViewArr[1].setAlpha(1.0f);
            clippingImageViewArr[1].setAdditionalTranslationX(-rect.left);
        }
        ClippingImageView clippingImageView = clippingImageViewArr[0];
        clippingImageView.setTranslationX(clippingImageView.getTranslationX() + rect.left);
        photoViewer.f33921g0.getViewTreeObserver().removeOnPreDrawListener(this);
        int i18 = photoViewer.f33887c2;
        ViewGroup.LayoutParams layoutParams = this.f38111b;
        if (i18 == 1) {
            if (!photoViewer.f34025s) {
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
            int measuredWidth2 = photoViewer.f33921g0.getMeasuredWidth();
            u11 = com.google.android.gms.internal.vision.e2.u(layoutParams.width, f7, (measuredWidth2 - i17) - rect.right, 2.0f) + rect.left;
        } else {
            i10 = 0;
            float measuredWidth3 = photoViewer.f33921g0.getMeasuredWidth() / layoutParams.width;
            int i19 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f34025s) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            float min2 = Math.min(measuredWidth3, (i19 + i11) / layoutParams.height);
            if (photoViewer.f33887c2 == 11) {
                f7 = photoViewer.r2(true) * min2;
            } else {
                f7 = min2;
            }
            int i20 = AndroidUtilities.displaySize.y;
            if (!photoViewer.f34025s) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            u10 = com.google.android.gms.internal.vision.e2.u(layoutParams.height, f7, i20 + i12, 2.0f);
            u11 = com.google.android.gms.internal.vision.e2.u(layoutParams.width, f7, photoViewer.f33921g0.getMeasuredWidth(), 2.0f);
            photoViewer.f33881b6 = 0.0f;
            photoViewer.f33919f6 = 0.0f;
        }
        ev0 ev0Var = this.d;
        int abs = (int) Math.abs(this.f38112c - ev0Var.f37356a.getImageX());
        float imageY = ev0Var.f37356a.getImageY();
        float f16 = this.f38113e;
        int abs2 = (int) Math.abs(f16 - imageY);
        if (ev0Var.f37356a.isAspectFit()) {
            abs = i10;
        }
        int[] iArr = new int[2];
        int i21 = 2;
        ev0Var.d.getLocationInWindow(iArr);
        float f17 = ev0Var.f37358c + f16;
        int i22 = (int) ((iArr[1] - f17) + ev0Var.f37363j);
        if (i22 < 0) {
            i22 = i10;
        }
        int height = (int) (((f17 + layoutParams.height) - (ev0Var.d.getHeight() + i13)) + ev0Var.f37362i);
        if (height < 0) {
            height = i10;
        }
        int max = Math.max(i22, abs2);
        int max2 = Math.max(height, abs2);
        fArr[i10][i10] = photoViewer.f33930h0.getScaleX();
        fArr[i10][1] = photoViewer.f33930h0.getScaleY();
        fArr[i10][2] = photoViewer.f33930h0.getTranslationX();
        fArr[i10][3] = photoViewer.f33930h0.getTranslationY();
        float[] fArr2 = fArr[i10];
        float f18 = abs;
        float f19 = ev0Var.f37364k;
        fArr2[4] = f18 * f19;
        fArr2[5] = max * f19;
        char c10 = 6;
        fArr2[6] = max2 * f19;
        int[] radius = photoViewer.f33930h0.getRadius();
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
        float f20 = ev0Var.f37364k;
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
        photoViewer.f33904e0.setAlpha(0.0f);
        photoViewer.f33948j0.setAlpha(0.0f);
        g90 g90Var = new g90(this, clippingImageViewArr, this.h, this.f38115n, this.f38114f, 15);
        photoViewer.f34003p4 = g90Var;
        if (!photoViewer.f33966l2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (photoViewer.f33887c2 == 1) {
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i26], org.telegram.ui.Components.u6.f31382f, fArr6);
                if (i26 == 0) {
                    ofFloat.addUpdateListener(new c3(this, 23));
                }
                arrayList.add(ofFloat);
                i26++;
                i21 = 2;
            }
            if (clippingImageViewArr.length > 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33930h0, View.ALPHA, 0.0f, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofInt(backgroundDrawable, org.telegram.ui.Components.u6.d, 0, 255));
            wu0 wu0Var = photoViewer.f33904e0;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(wu0Var, property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(photoViewer.f33948j0, property, 0.0f, 1.0f));
            if (photoViewer.f33887c2 == 1) {
                arrayList.add(ObjectAnimator.ofFloat(photoViewer.C1, property, 0.0f, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new ep0(this, 8));
            photoViewer.f33904e0.setLayerType(2, null);
            photoViewer.y2(false);
            photoViewer.f33994o4 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(new rt0(3, this, animatorSet));
        } else {
            g90Var.run();
            photoViewer.f34003p4 = null;
            photoViewer.f33904e0.setAlpha(1.0f);
            backgroundDrawable.setAlpha(255);
            for (ClippingImageView clippingImageView2 : clippingImageViewArr) {
                clippingImageView2.setAnimationProgress(1.0f);
            }
            if (photoViewer.f33887c2 == 1) {
                photoViewer.C1.setAlpha(1.0f);
            }
        }
        backgroundDrawable.d = new rt0(4, this, ev0Var);
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
