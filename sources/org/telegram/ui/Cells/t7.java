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
import org.telegram.ui.Components.xq;
public final class t7 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f30523a;
    public final org.telegram.ui.Components.j6 f30524b;
    public final org.telegram.ui.Components.j6 f30525c;
    public final org.telegram.ui.Components.j6 d;
    public final h0 f30526e;
    public int f30527f;
    public int h;
    public c20 f30528n;
    public s7 f30529r;
    public CharSequence f30530s;
    public float f30531w;
    public float f30532x;
    public ValueAnimator f30533y;

    public t7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f30532x = -1.0f;
        this.f30523a = f6Var;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f30524b = j6Var;
        xq xqVar = xq.h;
        j6Var.b(0.3f, 220L, xqVar);
        j6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        int i7 = org.telegram.ui.ActionBar.k6.f28240y6;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i7, f6Var);
        j6Var.setGravity(3);
        j6Var.setEmojiCacheType(19);
        j6Var.setEmojiColor(-1);
        j6Var.setImportantForAccessibility(2);
        addView(j6Var, c8.ha.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f30525c = j6Var2;
        j6Var2.b(0.3f, 220L, xqVar);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        j6Var2.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(j6Var2, org.telegram.ui.ActionBar.k6.I6, f6Var);
        j6Var2.setEmojiColor(-1);
        j6Var2.setEmojiCacheType(19);
        j6Var2.setImportantForAccessibility(2);
        addView(j6Var2, c8.ha.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.d = j6Var3;
        j6Var3.b(0.3f, 220L, xqVar);
        j6Var3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        j6Var3.setGravity(5);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        j6Var3.setEmojiColor(-1);
        j6Var3.setEmojiCacheType(19);
        j6Var3.setImportantForAccessibility(2);
        addView(j6Var3, c8.ha.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        h0 h0Var = new h0(2, context, f6Var, false);
        this.f30526e = h0Var;
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
        if (this.f30529r.f30275c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f30529r.f30275c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11 - 1];
                int i13 = iArr[i11];
                if (i7 >= i12 && i7 <= i13) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i7 - i12) / (i13 - i12)) * s7Var.d) / this.f30529r.d) + i10);
                }
                i11++;
            }
        }
        return Utilities.l((i7 - this.f30529r.b()) / (this.f30529r.a() - this.f30529r.b()));
    }

    public final int c(int i7) {
        if (this.f30529r.f30275c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.f30529r.f30275c;
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
        this.f30527f = i7;
        this.f30529r = s7Var;
        this.f30528n = c20Var;
        this.f30526e.e(false, b(i7));
        e(i7, false);
    }

    public final void e(int i7, boolean z9) {
        int i10;
        float f10;
        s7 s7Var = this.f30529r;
        if (s7Var != null && s7Var.f30276e != null) {
            org.telegram.ui.Components.j6 j6Var = this.f30524b;
            j6Var.a();
            org.telegram.ui.Components.j6 j6Var2 = this.d;
            j6Var2.a();
            org.telegram.ui.Components.j6 j6Var3 = this.f30525c;
            j6Var3.a();
            j6Var3.c((CharSequence) this.f30529r.f30276e.d(0, Integer.valueOf(i7)), z9, true);
            j6Var.c((CharSequence) this.f30529r.f30276e.d(-1, Integer.valueOf(this.f30529r.b())), z9, true);
            j6Var2.c((CharSequence) this.f30529r.f30276e.d(1, Integer.valueOf(this.f30529r.a())), z9, true);
            if (i7 >= this.f30529r.a()) {
                i10 = org.telegram.ui.ActionBar.k6.I6;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.f28240y6;
            }
            j6Var2.f34870c.v(org.telegram.ui.ActionBar.k6.w0(i10, this.f30523a), z9);
            j6Var2.invalidate();
            if (i7 >= this.f30529r.a()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (Math.abs(this.f30532x - f10) >= 0.01f) {
                ValueAnimator valueAnimator = this.f30533y;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f30533y = null;
                }
                this.f30532x = f10;
                if (z9) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30531w, f10);
                    this.f30533y = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f30533y.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 3));
                    this.f30533y.setDuration(240L);
                    this.f30533y.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.f30531w = f10;
                colorMatrix.setSaturation(f10);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - this.f30531w) * (-0.3f));
                }
                j6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
        this.f30530s = charSequence;
    }

    public void setMinValueAllowed(int i7) {
        this.h = i7;
        if (this.f30527f < i7) {
            this.f30527f = i7;
        }
        if (this.f30529r == null) {
            return;
        }
        this.f30526e.setMinProgress(b(i7));
        e(this.f30527f, false);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.j6 j6Var;
        int i7;
        try {
            s7 s7Var = this.f30529r;
            if (s7Var != null && (j6Var = this.d) != null) {
                if (this.f30527f >= s7Var.a()) {
                    i7 = org.telegram.ui.ActionBar.k6.I6;
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.f28240y6;
                }
                j6Var.f34870c.v(org.telegram.ui.ActionBar.k6.w0(i7, this.f30523a), false);
                j6Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
