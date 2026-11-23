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
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kr;
public final class t7 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f31929a;
    public final org.telegram.ui.Components.n6 f31930b;
    public final org.telegram.ui.Components.n6 f31931c;
    public final org.telegram.ui.Components.n6 d;
    public final i0 f31932e;
    public int f31933f;
    public int h;
    public w10 f31934n;
    public s7 f31935r;
    public CharSequence f31936s;
    public float f31937w;
    public float f31938x;
    public ValueAnimator f31939y;

    public t7(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f31938x = -1.0f;
        this.f31929a = i6Var;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
        this.f31930b = n6Var;
        kr krVar = kr.h;
        n6Var.b(0.3f, 220L, krVar);
        n6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i7 = org.telegram.ui.ActionBar.n6.f29843y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, i6Var);
        n6Var.setGravity(3);
        n6Var.setEmojiCacheType(19);
        n6Var.setEmojiColor(-1);
        n6Var.setImportantForAccessibility(2);
        addView(n6Var, c8.na.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, false, true, true);
        this.f31931c = n6Var2;
        n6Var2.b(0.3f, 220L, krVar);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        n6Var2.setGravity(17);
        org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.I6, i6Var);
        n6Var2.setEmojiColor(-1);
        n6Var2.setEmojiCacheType(19);
        n6Var2.setImportantForAccessibility(2);
        addView(n6Var2, c8.na.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.d = n6Var3;
        n6Var3.b(0.3f, 220L, krVar);
        n6Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        n6Var3.setGravity(5);
        n6Var3.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        n6Var3.setEmojiColor(-1);
        n6Var3.setEmojiCacheType(19);
        n6Var3.setImportantForAccessibility(2);
        addView(n6Var3, c8.na.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        i0 i0Var = new i0(2, context, i6Var, false);
        this.f31932e = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new j6.r(this, 24));
        addView(i0Var, c8.na.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
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
        s7 s7Var;
        int i10;
        if (this.f31935r.f31865c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f31935r.f31865c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11 - 1];
                int i13 = iArr[i11];
                if (i7 >= i12 && i7 <= i13) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i7 - i12) / (i13 - i12)) * s7Var.d) / this.f31935r.d) + i10);
                }
                i11++;
            }
        }
        return Utilities.l((i7 - this.f31935r.b()) / (this.f31935r.a() - this.f31935r.b()));
    }

    public final int c(int i7) {
        if (this.f31935r.f31865c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.f31935r.f31865c;
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

    public final void d(int i7, s7 s7Var, w10 w10Var) {
        this.f31933f = i7;
        this.f31935r = s7Var;
        this.f31934n = w10Var;
        this.f31932e.e(false, b(i7));
        e(i7, false);
    }

    public final void e(int i7, boolean z10) {
        int i10;
        float f10;
        s7 s7Var = this.f31935r;
        if (s7Var != null && s7Var.f31866e != null) {
            org.telegram.ui.Components.n6 n6Var = this.f31930b;
            n6Var.a();
            org.telegram.ui.Components.n6 n6Var2 = this.d;
            n6Var2.a();
            org.telegram.ui.Components.n6 n6Var3 = this.f31931c;
            n6Var3.a();
            n6Var3.c((CharSequence) this.f31935r.f31866e.d(0, Integer.valueOf(i7)), z10, true);
            n6Var.c((CharSequence) this.f31935r.f31866e.d(-1, Integer.valueOf(this.f31935r.b())), z10, true);
            n6Var2.c((CharSequence) this.f31935r.f31866e.d(1, Integer.valueOf(this.f31935r.a())), z10, true);
            if (i7 >= this.f31935r.a()) {
                i10 = org.telegram.ui.ActionBar.n6.I6;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.f29843y6;
            }
            n6Var2.f37682c.v(org.telegram.ui.ActionBar.n6.w0(i10, this.f31929a), z10);
            n6Var2.invalidate();
            if (i7 >= this.f31935r.a()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (Math.abs(this.f31938x - f10) >= 0.01f) {
                ValueAnimator valueAnimator = this.f31939y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f31939y = null;
                }
                this.f31938x = f10;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31937w, f10);
                    this.f31939y = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f31939y.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 3));
                    this.f31939y.setDuration(240L);
                    this.f31939y.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.f31937w = f10;
                colorMatrix.setSaturation(f10);
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - this.f31937w) * (-0.3f));
                }
                n6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
        this.f31936s = charSequence;
    }

    public void setMinValueAllowed(int i7) {
        this.h = i7;
        if (this.f31933f < i7) {
            this.f31933f = i7;
        }
        if (this.f31935r == null) {
            return;
        }
        this.f31932e.setMinProgress(b(i7));
        e(this.f31933f, false);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.n6 n6Var;
        int i7;
        try {
            s7 s7Var = this.f31935r;
            if (s7Var != null && (n6Var = this.d) != null) {
                if (this.f31933f >= s7Var.a()) {
                    i7 = org.telegram.ui.ActionBar.n6.I6;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.f29843y6;
                }
                n6Var.f37682c.v(org.telegram.ui.ActionBar.n6.w0(i7, this.f31929a), false);
                n6Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
