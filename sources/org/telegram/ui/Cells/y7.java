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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zr;
public final class y7 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f23983a;
    public final org.telegram.ui.Components.o6 f23984b;
    public final org.telegram.ui.Components.o6 f23985c;
    public final org.telegram.ui.Components.o6 d;
    public final i0 e;
    public int f23986f;
    public int h;
    public Utilities.Callback f23987n;
    public x7 f23988r;
    public CharSequence f23989s;
    public float v;
    public float f23990w;
    public ValueAnimator f23991x;

    public y7(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f23990w = -1.0f;
        this.f23983a = g6Var;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f23984b = o6Var;
        zr zrVar = zr.h;
        o6Var.b(0.3f, 220L, zrVar);
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.k6.f21572y6;
        org.telegram.ui.ActionBar.r6.a0(o6Var, i10, g6Var);
        o6Var.setGravity(3);
        o6Var.setEmojiCacheType(19);
        o6Var.setEmojiColor(-1);
        o6Var.setImportantForAccessibility(2);
        addView(o6Var, w7.z5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, true, true);
        this.f23985c = o6Var2;
        o6Var2.b(0.3f, 220L, zrVar);
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setGravity(17);
        org.telegram.ui.ActionBar.r6.a0(o6Var2, org.telegram.ui.ActionBar.k6.I6, g6Var);
        o6Var2.setEmojiColor(-1);
        o6Var2.setEmojiCacheType(19);
        o6Var2.setImportantForAccessibility(2);
        addView(o6Var2, w7.z5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.d = o6Var3;
        o6Var3.b(0.3f, 220L, zrVar);
        o6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var3.setGravity(5);
        o6Var3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        o6Var3.setEmojiColor(-1);
        o6Var3.setEmojiCacheType(19);
        o6Var3.setImportantForAccessibility(2);
        addView(o6Var3, w7.z5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        i0 i0Var = new i0(2, context, g6Var, false);
        this.e = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new w7(this));
        addView(i0Var, w7.z5.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
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
        x7 x7Var;
        int i11;
        if (this.f23988r.f23956c != null) {
            int i12 = 1;
            while (true) {
                int[] iArr = this.f23988r.f23956c;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12 - 1];
                int i14 = iArr[i12];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * x7Var.d) / this.f23988r.d) + i11);
                }
                i12++;
            }
        }
        return Utilities.clamp01((i10 - this.f23988r.b()) / (this.f23988r.a() - this.f23988r.b()));
    }

    public final int c(int i10) {
        if (this.f23988r.f23956c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f23988r.f23956c;
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

    public final void d(int i10, x7 x7Var, Utilities.Callback callback) {
        this.f23986f = i10;
        this.f23988r = x7Var;
        this.f23987n = callback;
        this.e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        int i11;
        float f7;
        x7 x7Var = this.f23988r;
        if (x7Var != null && x7Var.e != null) {
            org.telegram.ui.Components.o6 o6Var = this.f23984b;
            o6Var.a();
            org.telegram.ui.Components.o6 o6Var2 = this.d;
            o6Var2.a();
            org.telegram.ui.Components.o6 o6Var3 = this.f23985c;
            o6Var3.a();
            o6Var3.c((CharSequence) this.f23988r.e.run(0, Integer.valueOf(i10)), z10, true);
            o6Var.c((CharSequence) this.f23988r.e.run(-1, Integer.valueOf(this.f23988r.b())), z10, true);
            o6Var2.c((CharSequence) this.f23988r.e.run(1, Integer.valueOf(this.f23988r.a())), z10, true);
            if (i10 >= this.f23988r.a()) {
                i11 = org.telegram.ui.ActionBar.k6.I6;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.f21572y6;
            }
            o6Var2.f29155c.v(org.telegram.ui.ActionBar.k6.w0(i11, this.f23983a), z10);
            o6Var2.invalidate();
            if (i10 >= this.f23988r.a()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (Math.abs(this.f23990w - f7) >= 0.01f) {
                ValueAnimator valueAnimator = this.f23991x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f23991x = null;
                }
                this.f23990w = f7;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f7);
                    this.f23991x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f23991x.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 3));
                    this.f23991x.setDuration(240L);
                    this.f23991x.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.v = f7;
                colorMatrix.setSaturation(f7);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
                }
                o6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
        this.f23989s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f23986f < i10) {
            this.f23986f = i10;
        }
        if (this.f23988r == null) {
            return;
        }
        this.e.setMinProgress(b(i10));
        e(this.f23986f, false);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.o6 o6Var;
        int i10;
        try {
            x7 x7Var = this.f23988r;
            if (x7Var != null && (o6Var = this.d) != null) {
                if (this.f23986f >= x7Var.a()) {
                    i10 = org.telegram.ui.ActionBar.k6.I6;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f21572y6;
                }
                o6Var.f29155c.v(org.telegram.ui.ActionBar.k6.w0(i10, this.f23983a), false);
                o6Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
