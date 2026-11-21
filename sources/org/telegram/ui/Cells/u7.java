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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.nr;
public final class u7 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f32057a;
    public final org.telegram.ui.Components.o6 f32058b;
    public final org.telegram.ui.Components.o6 f32059c;
    public final org.telegram.ui.Components.o6 d;
    public final i0 f32060e;
    public int f32061f;
    public int h;
    public x10 f32062n;
    public t7 f32063r;
    public CharSequence f32064s;
    public float f32065w;
    public float f32066x;
    public ValueAnimator f32067y;

    public u7(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f32066x = -1.0f;
        this.f32057a = h6Var;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f32058b = o6Var;
        nr nrVar = nr.h;
        o6Var.b(0.3f, 220L, nrVar);
        o6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i7 = org.telegram.ui.ActionBar.m6.f29770y6;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i7, h6Var);
        o6Var.setGravity(3);
        o6Var.setEmojiCacheType(19);
        o6Var.setEmojiColor(-1);
        o6Var.setImportantForAccessibility(2);
        addView(o6Var, c8.ma.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, true, true);
        this.f32059c = o6Var2;
        o6Var2.b(0.3f, 220L, nrVar);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        o6Var2.setGravity(17);
        org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.I6, h6Var);
        o6Var2.setEmojiColor(-1);
        o6Var2.setEmojiCacheType(19);
        o6Var2.setImportantForAccessibility(2);
        addView(o6Var2, c8.ma.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.d = o6Var3;
        o6Var3.b(0.3f, 220L, nrVar);
        o6Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        o6Var3.setGravity(5);
        o6Var3.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        o6Var3.setEmojiColor(-1);
        o6Var3.setEmojiCacheType(19);
        o6Var3.setImportantForAccessibility(2);
        addView(o6Var3, c8.ma.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        i0 i0Var = new i0(2, context, h6Var, false);
        this.f32060e = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new h9.g1(this, 27));
        addView(i0Var, c8.ma.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int[] iArr, int i7) {
        boolean z10 = false;
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 <= i7) {
                i10++;
                if (i11 == i7) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            i10++;
        }
        if (i10 == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i10];
        int i12 = 0;
        for (int i13 : iArr) {
            if (i13 <= i7) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        if (!z10) {
            iArr2[i12] = i7;
        }
        return iArr2;
    }

    public final float b(int i7) {
        t7 t7Var;
        int i10;
        if (this.f32063r.f31875c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f32063r.f31875c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11 - 1];
                int i13 = iArr[i11];
                if (i7 >= i12 && i7 <= i13) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i7 - i12) / (i13 - i12)) * t7Var.d) / this.f32063r.d) + i10);
                }
                i11++;
            }
        }
        return Utilities.l((i7 - this.f32063r.b()) / (this.f32063r.a() - this.f32063r.b()));
    }

    public final int c(int i7) {
        if (this.f32063r.f31875c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.f32063r.f31875c;
                if (i10 >= iArr.length) {
                    break;
                }
                int i11 = i10 - 1;
                int i12 = iArr[i11];
                int i13 = iArr[i10];
                if (i7 >= i12 && i7 <= i13) {
                    return i11;
                }
                i10++;
            }
        }
        return i7;
    }

    public final void d(int i7, t7 t7Var, x10 x10Var) {
        this.f32061f = i7;
        this.f32063r = t7Var;
        this.f32062n = x10Var;
        this.f32060e.e(false, b(i7));
        e(i7, false);
    }

    public final void e(int i7, boolean z10) {
        int i10;
        float f10;
        t7 t7Var = this.f32063r;
        if (t7Var != null && t7Var.f31876e != null) {
            org.telegram.ui.Components.o6 o6Var = this.f32058b;
            o6Var.a();
            org.telegram.ui.Components.o6 o6Var2 = this.d;
            o6Var2.a();
            org.telegram.ui.Components.o6 o6Var3 = this.f32059c;
            o6Var3.a();
            o6Var3.c((CharSequence) this.f32063r.f31876e.g(0, Integer.valueOf(i7)), z10, true);
            o6Var.c((CharSequence) this.f32063r.f31876e.g(-1, Integer.valueOf(this.f32063r.b())), z10, true);
            o6Var2.c((CharSequence) this.f32063r.f31876e.g(1, Integer.valueOf(this.f32063r.a())), z10, true);
            if (i7 >= this.f32063r.a()) {
                i10 = org.telegram.ui.ActionBar.m6.I6;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.f29770y6;
            }
            o6Var2.f38122c.v(org.telegram.ui.ActionBar.m6.w0(i10, this.f32057a), z10);
            o6Var2.invalidate();
            if (i7 >= this.f32063r.a()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (Math.abs(this.f32066x - f10) >= 0.01f) {
                ValueAnimator valueAnimator = this.f32067y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f32067y = null;
                }
                this.f32066x = f10;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f32065w, f10);
                    this.f32067y = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f32067y.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 3));
                    this.f32067y.setDuration(240L);
                    this.f32067y.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.f32065w = f10;
                colorMatrix.setSaturation(f10);
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - this.f32065w) * (-0.3f));
                }
                o6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, org.telegram.messenger.g0.L(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - org.telegram.messenger.g0.L(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.f32064s = charSequence;
    }

    public void setMinValueAllowed(int i7) {
        this.h = i7;
        if (this.f32061f < i7) {
            this.f32061f = i7;
        }
        if (this.f32063r == null) {
            return;
        }
        this.f32060e.setMinProgress(b(i7));
        e(this.f32061f, false);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.o6 o6Var;
        int i7;
        try {
            t7 t7Var = this.f32063r;
            if (t7Var != null && (o6Var = this.d) != null) {
                if (this.f32061f >= t7Var.a()) {
                    i7 = org.telegram.ui.ActionBar.m6.I6;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f29770y6;
                }
                o6Var.f38122c.v(org.telegram.ui.ActionBar.m6.w0(i7, this.f32057a), false);
                o6Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
