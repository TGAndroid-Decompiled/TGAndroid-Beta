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
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;
public final class s7 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f31418a;
    public final org.telegram.ui.Components.h6 f31419b;
    public final org.telegram.ui.Components.h6 f31420c;
    public final org.telegram.ui.Components.h6 d;
    public final h0 f31421e;
    public int f31422f;
    public int h;
    public z10 f31423n;
    public r7 f31424r;
    public CharSequence f31425s;
    public float f31426w;
    public float f31427x;
    public ValueAnimator f31428y;

    public s7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f31427x = -1.0f;
        this.f31418a = e6Var;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, true);
        this.f31419b = h6Var;
        er erVar = er.h;
        h6Var.b(0.3f, 220L, erVar);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i7 = org.telegram.ui.ActionBar.j6.f29241y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i7, e6Var);
        h6Var.setGravity(3);
        h6Var.setEmojiCacheType(19);
        h6Var.setEmojiColor(-1);
        h6Var.setImportantForAccessibility(2);
        addView(h6Var, c8.ja.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, true, true);
        this.f31420c = h6Var2;
        h6Var2.b(0.3f, 220L, erVar);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setGravity(17);
        org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.I6, e6Var);
        h6Var2.setEmojiColor(-1);
        h6Var2.setEmojiCacheType(19);
        h6Var2.setImportantForAccessibility(2);
        addView(h6Var2, c8.ja.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.d = h6Var3;
        h6Var3.b(0.3f, 220L, erVar);
        h6Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var3.setGravity(5);
        h6Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        h6Var3.setEmojiColor(-1);
        h6Var3.setEmojiCacheType(19);
        h6Var3.setImportantForAccessibility(2);
        addView(h6Var3, c8.ja.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        h0 h0Var = new h0(2, context, e6Var, false);
        this.f31421e = h0Var;
        h0Var.setReportChanges(true);
        h0Var.setDelegate(new hi.l0(this, 28));
        addView(h0Var, c8.ja.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
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
        r7 r7Var;
        int i10;
        if (this.f31424r.f31358c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f31424r.f31358c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11 - 1];
                int i13 = iArr[i11];
                if (i7 >= i12 && i7 <= i13) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i7 - i12) / (i13 - i12)) * r7Var.d) / this.f31424r.d) + i10);
                }
                i11++;
            }
        }
        return Utilities.l((i7 - this.f31424r.b()) / (this.f31424r.a() - this.f31424r.b()));
    }

    public final int c(int i7) {
        if (this.f31424r.f31358c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.f31424r.f31358c;
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

    public final void d(int i7, r7 r7Var, z10 z10Var) {
        this.f31422f = i7;
        this.f31424r = r7Var;
        this.f31423n = z10Var;
        this.f31421e.e(false, b(i7));
        e(i7, false);
    }

    public final void e(int i7, boolean z10) {
        int i10;
        float f10;
        r7 r7Var = this.f31424r;
        if (r7Var != null && r7Var.f31359e != null) {
            org.telegram.ui.Components.h6 h6Var = this.f31419b;
            h6Var.a();
            org.telegram.ui.Components.h6 h6Var2 = this.d;
            h6Var2.a();
            org.telegram.ui.Components.h6 h6Var3 = this.f31420c;
            h6Var3.a();
            h6Var3.c((CharSequence) this.f31424r.f31359e.d(0, Integer.valueOf(i7)), z10, true);
            h6Var.c((CharSequence) this.f31424r.f31359e.d(-1, Integer.valueOf(this.f31424r.b())), z10, true);
            h6Var2.c((CharSequence) this.f31424r.f31359e.d(1, Integer.valueOf(this.f31424r.a())), z10, true);
            if (i7 >= this.f31424r.a()) {
                i10 = org.telegram.ui.ActionBar.j6.I6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f29241y6;
            }
            h6Var2.f35175c.v(org.telegram.ui.ActionBar.j6.w0(i10, this.f31418a), z10);
            h6Var2.invalidate();
            if (i7 >= this.f31424r.a()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (Math.abs(this.f31427x - f10) >= 0.01f) {
                ValueAnimator valueAnimator = this.f31428y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f31428y = null;
                }
                this.f31427x = f10;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f31426w, f10);
                    this.f31428y = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f31428y.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 3));
                    this.f31428y.setDuration(240L);
                    this.f31428y.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.f31426w = f10;
                colorMatrix.setSaturation(f10);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - this.f31426w) * (-0.3f));
                }
                h6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
        this.f31425s = charSequence;
    }

    public void setMinValueAllowed(int i7) {
        this.h = i7;
        if (this.f31422f < i7) {
            this.f31422f = i7;
        }
        if (this.f31424r == null) {
            return;
        }
        this.f31421e.setMinProgress(b(i7));
        e(this.f31422f, false);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.h6 h6Var;
        int i7;
        try {
            r7 r7Var = this.f31424r;
            if (r7Var != null && (h6Var = this.d) != null) {
                if (this.f31422f >= r7Var.a()) {
                    i7 = org.telegram.ui.ActionBar.j6.I6;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.f29241y6;
                }
                h6Var.f35175c.v(org.telegram.ui.ActionBar.j6.w0(i7, this.f31418a), false);
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
