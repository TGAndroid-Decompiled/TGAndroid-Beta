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
import org.telegram.ui.Components.er;

public final class u7 extends FrameLayout {

    public final org.telegram.ui.ActionBar.c6 f25706a;

    public final org.telegram.ui.Components.j6 f25707b;

    public final org.telegram.ui.Components.j6 f25708c;
    public final org.telegram.ui.Components.j6 d;

    public final j0 f25709e;

    public int f25710f;
    public int h;

    public Utilities.Callback f25711n;

    public t7 f25712r;

    public CharSequence f25713s;
    public float v;

    public float f25714w;

    public ValueAnimator f25715x;

    public u7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f25714w = -1.0f;
        this.f25706a = c6Var;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f25707b = j6Var;
        er erVar = er.h;
        j6Var.b(0.3f, 220L, erVar);
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.g6.f23423y6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        j6Var.setGravity(3);
        j6Var.setEmojiCacheType(19);
        j6Var.setEmojiColor(-1);
        j6Var.setImportantForAccessibility(2);
        addView(j6Var, h7.z5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f25708c = j6Var2;
        j6Var2.b(0.3f, 220L, erVar);
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setGravity(17);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I6, c6Var));
        j6Var2.setEmojiColor(-1);
        j6Var2.setEmojiCacheType(19);
        j6Var2.setImportantForAccessibility(2);
        addView(j6Var2, h7.z5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.d = j6Var3;
        j6Var3.b(0.3f, 220L, erVar);
        j6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var3.setGravity(5);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        j6Var3.setEmojiColor(-1);
        j6Var3.setEmojiCacheType(19);
        j6Var3.setImportantForAccessibility(2);
        addView(j6Var3, h7.z5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        j0 j0Var = new j0(2, context, c6Var, false);
        this.f25709e = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new s7(this));
        addView(j0Var, h7.z5.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int i10, int[] iArr) {
        boolean z10 = false;
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 <= i10) {
                i11++;
                if (i12 == i10) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
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
        if (!z10) {
            iArr2[i13] = i10;
        }
        return iArr2;
    }

    public final float b(int i10) {
        if (this.f25712r.f25681c != null) {
            int i11 = 1;
            while (true) {
                t7 t7Var = this.f25712r;
                int[] iArr = t7Var.f25681c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = i11 - 1;
                int i13 = iArr[i12];
                int i14 = iArr[i11];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * t7Var.d) / this.f25712r.d) + i12);
                }
                i11++;
            }
        }
        return Utilities.clamp01((i10 - this.f25712r.b()) / (this.f25712r.a() - this.f25712r.b()));
    }

    public final int c(int i10) {
        if (this.f25712r.f25681c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f25712r.f25681c;
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

    public final void d(int i10, t7 t7Var, Utilities.Callback callback) {
        this.f25710f = i10;
        this.f25712r = t7Var;
        this.f25711n = callback;
        this.f25709e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        t7 t7Var = this.f25712r;
        if (t7Var == null || t7Var.f25682e == null) {
            return;
        }
        org.telegram.ui.Components.j6 j6Var = this.f25707b;
        j6Var.a();
        org.telegram.ui.Components.j6 j6Var2 = this.d;
        j6Var2.a();
        org.telegram.ui.Components.j6 j6Var3 = this.f25708c;
        j6Var3.a();
        j6Var3.c((CharSequence) this.f25712r.f25682e.run(0, Integer.valueOf(i10)), z10, true);
        j6Var.c((CharSequence) this.f25712r.f25682e.run(-1, Integer.valueOf(this.f25712r.b())), z10, true);
        j6Var2.c((CharSequence) this.f25712r.f25682e.run(1, Integer.valueOf(this.f25712r.a())), z10, true);
        j6Var2.f29632c.s(org.telegram.ui.ActionBar.g6.v0(i10 >= this.f25712r.a() ? org.telegram.ui.ActionBar.g6.I6 : org.telegram.ui.ActionBar.g6.f23423y6, this.f25706a), z10);
        j6Var2.invalidate();
        float f10 = i10 >= this.f25712r.a() ? 1.0f : 0.0f;
        if (Math.abs(this.f25714w - f10) < 0.01f) {
            return;
        }
        ValueAnimator valueAnimator = this.f25715x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f25715x = null;
        }
        this.f25714w = f10;
        if (z10) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.v, f10);
            this.f25715x = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new r(this, 6));
            this.f25715x.addListener(new org.telegram.ui.ActionBar.z0(this, f10, 3));
            this.f25715x.setDuration(240L);
            this.f25715x.start();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        this.v = f10;
        colorMatrix.setSaturation(f10);
        if (org.telegram.ui.ActionBar.g6.I.q()) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
        }
        j6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, AndroidUtilities.dp(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - AndroidUtilities.dp(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.f25713s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f25710f < i10) {
            this.f25710f = i10;
        }
        if (this.f25712r == null) {
            return;
        }
        this.f25709e.setMinProgress(b(i10));
        e(this.f25710f, false);
        invalidate();
    }
}
