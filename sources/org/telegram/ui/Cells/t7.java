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
import org.telegram.messenger.c20;
import org.telegram.ui.Components.wq;
public final class t7 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f30543a;
    public final org.telegram.ui.Components.i6 f30544b;
    public final org.telegram.ui.Components.i6 f30545c;
    public final org.telegram.ui.Components.i6 d;
    public final h0 f30546e;
    public int f30547f;
    public int h;
    public c20 f30548n;
    public s7 f30549r;
    public CharSequence f30550s;
    public float f30551w;
    public float f30552x;
    public ValueAnimator f30553y;

    public t7(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f30552x = -1.0f;
        this.f30543a = h6Var;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, true, true);
        this.f30544b = i6Var;
        wq wqVar = wq.h;
        i6Var.b(0.3f, 220L, wqVar);
        i6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i7 = org.telegram.ui.ActionBar.m6.f28282y6;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i7, h6Var);
        i6Var.setGravity(3);
        i6Var.setEmojiCacheType(19);
        i6Var.setEmojiColor(-1);
        i6Var.setImportantForAccessibility(2);
        addView(i6Var, c8.ha.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(context, false, true, true);
        this.f30545c = i6Var2;
        i6Var2.b(0.3f, 220L, wqVar);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        i6Var2.setGravity(17);
        org.telegram.ui.ActionBar.t6.Y(i6Var2, org.telegram.ui.ActionBar.m6.I6, h6Var);
        i6Var2.setEmojiColor(-1);
        i6Var2.setEmojiCacheType(19);
        i6Var2.setImportantForAccessibility(2);
        addView(i6Var2, c8.ha.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(context, true, true, true);
        this.d = i6Var3;
        i6Var3.b(0.3f, 220L, wqVar);
        i6Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        i6Var3.setGravity(5);
        i6Var3.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        i6Var3.setEmojiColor(-1);
        i6Var3.setEmojiCacheType(19);
        i6Var3.setImportantForAccessibility(2);
        addView(i6Var3, c8.ha.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        h0 h0Var = new h0(2, context, h6Var, false);
        this.f30546e = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new gf.g(this, 27));
        addView(h0Var, c8.ha.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int[] iArr, int i7) {
        boolean z9 = false;
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 <= i7) {
                i10++;
                if (i11 == i7) {
                    z9 = true;
                }
            }
        }
        if (!z9) {
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
        if (!z9) {
            iArr2[i12] = i7;
        }
        return iArr2;
    }

    public final float b(int i7) {
        s7 s7Var;
        int i10;
        if (this.f30549r.f30295c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f30549r.f30295c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11 - 1];
                int i13 = iArr[i11];
                if (i7 >= i12 && i7 <= i13) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i7 - i12) / (i13 - i12)) * s7Var.d) / this.f30549r.d) + i10);
                }
                i11++;
            }
        }
        return Utilities.l((i7 - this.f30549r.b()) / (this.f30549r.a() - this.f30549r.b()));
    }

    public final int c(int i7) {
        if (this.f30549r.f30295c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.f30549r.f30295c;
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

    public final void d(int i7, s7 s7Var, c20 c20Var) {
        this.f30547f = i7;
        this.f30549r = s7Var;
        this.f30548n = c20Var;
        this.f30546e.e(false, b(i7));
        e(i7, false);
    }

    public final void e(int i7, boolean z9) {
        int i10;
        float f10;
        s7 s7Var = this.f30549r;
        if (s7Var != null && s7Var.f30296e != null) {
            org.telegram.ui.Components.i6 i6Var = this.f30544b;
            i6Var.a();
            org.telegram.ui.Components.i6 i6Var2 = this.d;
            i6Var2.a();
            org.telegram.ui.Components.i6 i6Var3 = this.f30545c;
            i6Var3.a();
            i6Var3.c((CharSequence) this.f30549r.f30296e.d(0, Integer.valueOf(i7)), z9, true);
            i6Var.c((CharSequence) this.f30549r.f30296e.d(-1, Integer.valueOf(this.f30549r.b())), z9, true);
            i6Var2.c((CharSequence) this.f30549r.f30296e.d(1, Integer.valueOf(this.f30549r.a())), z9, true);
            if (i7 >= this.f30549r.a()) {
                i10 = org.telegram.ui.ActionBar.m6.I6;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.f28282y6;
            }
            i6Var2.f34543c.v(org.telegram.ui.ActionBar.m6.w0(i10, this.f30543a), z9);
            i6Var2.invalidate();
            if (i7 >= this.f30549r.a()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (Math.abs(this.f30552x - f10) >= 0.01f) {
                ValueAnimator valueAnimator = this.f30553y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f30553y = null;
                }
                this.f30552x = f10;
                if (z9) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30551w, f10);
                    this.f30553y = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f30553y.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 3));
                    this.f30553y.setDuration(240L);
                    this.f30553y.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.f30551w = f10;
                colorMatrix.setSaturation(f10);
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - this.f30551w) * (-0.3f));
                }
                i6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
        this.f30550s = charSequence;
    }

    public void setMinValueAllowed(int i7) {
        this.h = i7;
        if (this.f30547f < i7) {
            this.f30547f = i7;
        }
        if (this.f30549r == null) {
            return;
        }
        this.f30546e.setMinProgress(b(i7));
        e(this.f30547f, false);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.i6 i6Var;
        int i7;
        try {
            s7 s7Var = this.f30549r;
            if (s7Var != null && (i6Var = this.d) != null) {
                if (this.f30547f >= s7Var.a()) {
                    i7 = org.telegram.ui.ActionBar.m6.I6;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f28282y6;
                }
                i6Var.f34543c.v(org.telegram.ui.ActionBar.m6.w0(i7, this.f30543a), false);
                i6Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
