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
import org.telegram.messenger.r20;
import org.telegram.ui.Components.gr;
public final class x7 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f23586a;
    public final org.telegram.ui.Components.f6 f23587b;
    public final org.telegram.ui.Components.f6 f23588c;
    public final org.telegram.ui.Components.f6 d;
    public final h0 e;
    public int f23589f;
    public int h;
    public r20 f23590n;
    public w7 f23591r;
    public CharSequence f23592s;
    public float f23593w;
    public float f23594x;
    public ValueAnimator f23595y;

    public x7(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f23594x = -1.0f;
        this.f23586a = p6Var;
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, true);
        this.f23587b = f6Var;
        gr grVar = gr.h;
        f6Var.b(0.3f, 220L, grVar);
        f6Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
        int i10 = org.telegram.ui.ActionBar.t6.f21312y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i10, p6Var);
        f6Var.setGravity(3);
        f6Var.setEmojiCacheType(19);
        f6Var.setEmojiColor(-1);
        f6Var.setImportantForAccessibility(2);
        addView(f6Var, w7.b6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, false, true, true);
        this.f23588c = f6Var2;
        f6Var2.b(0.3f, 220L, grVar);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var2.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.I6, p6Var);
        f6Var2.setEmojiColor(-1);
        f6Var2.setEmojiCacheType(19);
        f6Var2.setImportantForAccessibility(2);
        addView(f6Var2, w7.b6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var3 = new org.telegram.ui.Components.f6(context, true, true, true);
        this.d = f6Var3;
        f6Var3.b(0.3f, 220L, grVar);
        f6Var3.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var3.setGravity(5);
        f6Var3.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        f6Var3.setEmojiColor(-1);
        f6Var3.setEmojiCacheType(19);
        f6Var3.setImportantForAccessibility(2);
        addView(f6Var3, w7.b6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        h0 h0Var = new h0(2, context, p6Var, false);
        this.e = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new n2.u(this, 8));
        addView(h0Var, w7.b6.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int[] iArr, int i10) {
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
        w7 w7Var;
        int i11;
        if (this.f23591r.f23409c != null) {
            int i12 = 1;
            while (true) {
                int[] iArr = this.f23591r.f23409c;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12 - 1];
                int i14 = iArr[i12];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * w7Var.d) / this.f23591r.d) + i11);
                }
                i12++;
            }
        }
        return Utilities.l((i10 - this.f23591r.b()) / (this.f23591r.a() - this.f23591r.b()));
    }

    public final int c(int i10) {
        if (this.f23591r.f23409c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f23591r.f23409c;
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

    public final void d(int i10, w7 w7Var, r20 r20Var) {
        this.f23589f = i10;
        this.f23591r = w7Var;
        this.f23590n = r20Var;
        this.e.e(false, b(i10));
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        int i11;
        float f7;
        w7 w7Var = this.f23591r;
        if (w7Var != null && w7Var.e != null) {
            org.telegram.ui.Components.f6 f6Var = this.f23587b;
            f6Var.a();
            org.telegram.ui.Components.f6 f6Var2 = this.d;
            f6Var2.a();
            org.telegram.ui.Components.f6 f6Var3 = this.f23588c;
            f6Var3.a();
            f6Var3.c((CharSequence) this.f23591r.e.d(0, Integer.valueOf(i10)), z10, true);
            f6Var.c((CharSequence) this.f23591r.e.d(-1, Integer.valueOf(this.f23591r.b())), z10, true);
            f6Var2.c((CharSequence) this.f23591r.e.d(1, Integer.valueOf(this.f23591r.a())), z10, true);
            if (i10 >= this.f23591r.a()) {
                i11 = org.telegram.ui.ActionBar.t6.I6;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.f21312y6;
            }
            f6Var2.f26082c.v(org.telegram.ui.ActionBar.t6.w0(i11, this.f23586a), z10);
            f6Var2.invalidate();
            if (i10 >= this.f23591r.a()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (Math.abs(this.f23594x - f7) >= 0.01f) {
                ValueAnimator valueAnimator = this.f23595y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f23595y = null;
                }
                this.f23594x = f7;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f23593w, f7);
                    this.f23595y = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f23595y.addListener(new org.telegram.ui.ActionBar.v0(this, f7, 3));
                    this.f23595y.setDuration(240L);
                    this.f23595y.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.f23593w = f7;
                colorMatrix.setSaturation(f7);
                if (org.telegram.ui.ActionBar.t6.I.q()) {
                    org.telegram.messenger.i0.h(colorMatrix, (1.0f - this.f23593w) * (-0.3f));
                }
                f6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, org.telegram.messenger.i0.L(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - org.telegram.messenger.i0.L(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.f23592s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f23589f < i10) {
            this.f23589f = i10;
        }
        if (this.f23591r == null) {
            return;
        }
        this.e.setMinProgress(b(i10));
        e(this.f23589f, false);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.f6 f6Var;
        int i10;
        try {
            w7 w7Var = this.f23591r;
            if (w7Var != null && (f6Var = this.d) != null) {
                if (this.f23589f >= w7Var.a()) {
                    i10 = org.telegram.ui.ActionBar.t6.I6;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.f21312y6;
                }
                f6Var.f26082c.v(org.telegram.ui.ActionBar.t6.w0(i10, this.f23586a), false);
                f6Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
