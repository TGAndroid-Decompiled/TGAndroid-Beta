package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xq;
public final class s7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f30342a;
    public final org.telegram.ui.Components.h6 f30343b;
    public final org.telegram.ui.Components.h6 f30344c;
    public final org.telegram.ui.Components.h6 d;
    public final h0 f30345e;
    public int f30346f;
    public int h;
    public u10 f30347n;
    public r7 f30348r;
    public CharSequence f30349s;
    public float f30350w;
    public float f30351x;
    public ValueAnimator f30352y;

    public s7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f30351x = -1.0f;
        this.f30342a = e6Var;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, true);
        this.f30343b = h6Var;
        xq xqVar = xq.h;
        h6Var.b(0.3f, 220L, xqVar);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, e6Var);
        h6Var.setGravity(3);
        h6Var.setEmojiCacheType(19);
        h6Var.setEmojiColor(-1);
        h6Var.setImportantForAccessibility(2);
        addView(h6Var, mf.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, true, true);
        this.f30344c = h6Var2;
        h6Var2.b(0.3f, 220L, xqVar);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.I6, e6Var);
        h6Var2.setEmojiColor(-1);
        h6Var2.setEmojiCacheType(19);
        h6Var2.setImportantForAccessibility(2);
        addView(h6Var2, mf.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.d = h6Var3;
        h6Var3.b(0.3f, 220L, xqVar);
        h6Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var3.setGravity(5);
        h6Var3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        h6Var3.setEmojiColor(-1);
        h6Var3.setEmojiCacheType(19);
        h6Var3.setImportantForAccessibility(2);
        addView(h6Var3, mf.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        h0 h0Var = new h0(2, context, e6Var, false);
        this.f30345e = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new gi.v5(this, 27));
        addView(h0Var, mf.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int[] iArr, int i3) {
        boolean z10 = false;
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 <= i3) {
                i10++;
                if (i11 == i3) {
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
            if (i13 <= i3) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        if (!z10) {
            iArr2[i12] = i3;
        }
        return iArr2;
    }

    public final float b(int i3) {
        r7 r7Var;
        int i10;
        if (this.f30348r.f30282c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f30348r.f30282c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11 - 1];
                int i13 = iArr[i11];
                if (i3 >= i12 && i3 <= i13) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i3 - i12) / (i13 - i12)) * r7Var.d) / this.f30348r.d) + i10);
                }
                i11++;
            }
        }
        return Utilities.l((i3 - this.f30348r.b()) / (this.f30348r.a() - this.f30348r.b()));
    }

    public final int c(int i3) {
        if (this.f30348r.f30282c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.f30348r.f30282c;
                if (i10 >= iArr.length) {
                    break;
                }
                int i11 = i10 - 1;
                int i12 = iArr[i11];
                int i13 = iArr[i10];
                if (i3 >= i12 && i3 <= i13) {
                    return i11;
                }
                i10++;
            }
        }
        return i3;
    }

    public final void d(int i3, r7 r7Var, u10 u10Var) {
        this.f30346f = i3;
        this.f30348r = r7Var;
        this.f30347n = u10Var;
        this.f30345e.e(false, b(i3));
        e(i3, false);
    }

    public final void e(int i3, boolean z10) {
        int i10;
        float f10;
        r7 r7Var = this.f30348r;
        if (r7Var != null && r7Var.f30283e != null) {
            org.telegram.ui.Components.h6 h6Var = this.f30343b;
            h6Var.a();
            org.telegram.ui.Components.h6 h6Var2 = this.d;
            h6Var2.a();
            org.telegram.ui.Components.h6 h6Var3 = this.f30344c;
            h6Var3.a();
            h6Var3.c((CharSequence) this.f30348r.f30283e.d(0, Integer.valueOf(i3)), z10, true);
            h6Var.c((CharSequence) this.f30348r.f30283e.d(-1, Integer.valueOf(this.f30348r.b())), z10, true);
            h6Var2.c((CharSequence) this.f30348r.f30283e.d(1, Integer.valueOf(this.f30348r.a())), z10, true);
            if (i3 >= this.f30348r.a()) {
                i10 = org.telegram.ui.ActionBar.k6.I6;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28273y6;
            }
            h6Var2.f34307c.v(org.telegram.ui.ActionBar.k6.w0(i10, this.f30342a), z10);
            h6Var2.invalidate();
            if (i3 >= this.f30348r.a()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (Math.abs(this.f30351x - f10) >= 0.01f) {
                ValueAnimator valueAnimator = this.f30352y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f30352y = null;
                }
                this.f30351x = f10;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30350w, f10);
                    this.f30352y = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f30352y.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 3));
                    this.f30352y.setDuration(240L);
                    this.f30352y.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.f30350w = f10;
                colorMatrix.setSaturation(f10);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - this.f30350w) * (-0.3f));
                }
                h6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, org.telegram.messenger.g0.L(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - org.telegram.messenger.g0.L(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.f30349s = charSequence;
    }

    public void setMinValueAllowed(int i3) {
        this.h = i3;
        if (this.f30346f < i3) {
            this.f30346f = i3;
        }
        if (this.f30348r == null) {
            return;
        }
        this.f30345e.setMinProgress(b(i3));
        e(this.f30346f, false);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.h6 h6Var;
        int i3;
        try {
            r7 r7Var = this.f30348r;
            if (r7Var != null && (h6Var = this.d) != null) {
                if (this.f30346f >= r7Var.a()) {
                    i3 = org.telegram.ui.ActionBar.k6.I6;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.f28273y6;
                }
                h6Var.f34307c.v(org.telegram.ui.ActionBar.k6.w0(i3, this.f30342a), false);
                h6Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
