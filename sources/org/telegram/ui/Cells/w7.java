package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
public final class w7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f22504a;
    public final org.telegram.ui.Components.k6 f22505b;
    public final org.telegram.ui.Components.k6 f22506c;
    public final org.telegram.ui.Components.k6 d;
    public final j0 e;
    public int f22507f;
    public int h;
    public Utilities.Callback f22508n;
    public v7 f22509r;
    public CharSequence f22510s;
    public float v;
    public float f22511w;
    public ValueAnimator f22512x;

    public w7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f22511w = -1.0f;
        this.f22504a = f6Var;
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
        this.f22505b = k6Var;
        mr mrVar = mr.h;
        k6Var.b(0.3f, 220L, mrVar);
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.j6.f20256y6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        k6Var.setGravity(3);
        k6Var.setEmojiCacheType(19);
        k6Var.setEmojiColor(-1);
        k6Var.setImportantForAccessibility(2);
        addView(k6Var, k7.b6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, true, true);
        this.f22506c = k6Var2;
        k6Var2.b(0.3f, 220L, mrVar);
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setGravity(17);
        k6Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var));
        k6Var2.setEmojiColor(-1);
        k6Var2.setEmojiCacheType(19);
        k6Var2.setImportantForAccessibility(2);
        addView(k6Var2, k7.b6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var3 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.d = k6Var3;
        k6Var3.b(0.3f, 220L, mrVar);
        k6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var3.setGravity(5);
        k6Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        k6Var3.setEmojiColor(-1);
        k6Var3.setEmojiCacheType(19);
        k6Var3.setImportantForAccessibility(2);
        addView(k6Var3, k7.b6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        j0 j0Var = new j0(2, context, f6Var, false);
        this.e = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new u7(this));
        addView(j0Var, k7.b6.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int i10, int[] iArr) {
        boolean z4 = false;
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 <= i10) {
                i11++;
                if (i12 == i10) {
                    z4 = true;
                }
            }
        }
        if (!z4) {
            i11++;
        }
        if (i11 == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i11];
        int i13 = 0;
        for (int i14 : iArr) {
            if (i14 <= i10) {
                iArr2[i13] = i14;
                i13++;
            }
        }
        if (!z4) {
            iArr2[i13] = i10;
        }
        return iArr2;
    }

    public final float b(int i10) {
        v7 v7Var;
        int i11;
        if (this.f22509r.f22476c != null) {
            int i12 = 1;
            while (true) {
                int[] iArr = this.f22509r.f22476c;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12 - 1];
                int i14 = iArr[i12];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * v7Var.d) / this.f22509r.d) + i11);
                }
                i12++;
            }
        }
        return Utilities.clamp01((i10 - this.f22509r.b()) / (this.f22509r.a() - this.f22509r.b()));
    }

    public final int c(int i10) {
        if (this.f22509r.f22476c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f22509r.f22476c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = i11 - 1;
                int i13 = iArr[i12];
                int i14 = iArr[i11];
                if (i10 >= i13 && i10 <= i14) {
                    return i12;
                }
                i11++;
            }
        }
        return i10;
    }

    public final void d(int i10, v7 v7Var, Utilities.Callback callback) {
        this.f22507f = i10;
        this.f22509r = v7Var;
        this.f22508n = callback;
        this.e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z4) {
        int i11;
        float f10;
        v7 v7Var = this.f22509r;
        if (v7Var != null && v7Var.e != null) {
            org.telegram.ui.Components.k6 k6Var = this.f22505b;
            k6Var.a();
            org.telegram.ui.Components.k6 k6Var2 = this.d;
            k6Var2.a();
            org.telegram.ui.Components.k6 k6Var3 = this.f22506c;
            k6Var3.a();
            k6Var3.c((CharSequence) this.f22509r.e.run(0, Integer.valueOf(i10)), z4, true);
            k6Var.c((CharSequence) this.f22509r.e.run(-1, Integer.valueOf(this.f22509r.b())), z4, true);
            k6Var2.c((CharSequence) this.f22509r.e.run(1, Integer.valueOf(this.f22509r.a())), z4, true);
            if (i10 >= this.f22509r.a()) {
                i11 = org.telegram.ui.ActionBar.j6.I6;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f20256y6;
            }
            k6Var2.f26171c.s(org.telegram.ui.ActionBar.j6.v0(i11, this.f22504a), z4);
            k6Var2.invalidate();
            if (i10 >= this.f22509r.a()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (Math.abs(this.f22511w - f10) >= 0.01f) {
                ValueAnimator valueAnimator = this.f22512x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f22512x = null;
                }
                this.f22511w = f10;
                if (z4) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f10);
                    this.f22512x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f22512x.addListener(new org.telegram.ui.ActionBar.a1(this, f10, 3));
                    this.f22512x.setDuration(240L);
                    this.f22512x.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.v = f10;
                colorMatrix.setSaturation(f10);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
                }
                k6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, AndroidUtilities.dp(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - AndroidUtilities.dp(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.f22510s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f22507f < i10) {
            this.f22507f = i10;
        }
        if (this.f22509r == null) {
            return;
        }
        this.e.setMinProgress(b(i10));
        e(this.f22507f, false);
        invalidate();
    }
}
