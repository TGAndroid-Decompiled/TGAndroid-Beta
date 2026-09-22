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
import org.telegram.ui.Components.qr;
public final class z7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f21691a;
    public final org.telegram.ui.Components.n6 f21692b;
    public final org.telegram.ui.Components.n6 f21693c;
    public final org.telegram.ui.Components.n6 d;
    public final j0 e;
    public int f21694f;
    public int h;
    public Utilities.Callback f21695n;
    public y7 f21696r;
    public CharSequence f21697s;
    public float v;
    public float f21698w;
    public ValueAnimator f21699x;

    public z7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f21698w = -1.0f;
        this.f21691a = e6Var;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
        this.f21692b = n6Var;
        qr qrVar = qr.h;
        n6Var.b(0.3f, 220L, qrVar);
        n6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.i6.f19215y6;
        n6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        n6Var.setGravity(3);
        n6Var.setEmojiCacheType(19);
        n6Var.setEmojiColor(-1);
        n6Var.setImportantForAccessibility(2);
        addView(n6Var, w7.x5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, false, true, true);
        this.f21693c = n6Var2;
        n6Var2.b(0.3f, 220L, qrVar);
        n6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        n6Var2.setGravity(17);
        n6Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I6, e6Var));
        n6Var2.setEmojiColor(-1);
        n6Var2.setEmojiCacheType(19);
        n6Var2.setImportantForAccessibility(2);
        addView(n6Var2, w7.x5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.d = n6Var3;
        n6Var3.b(0.3f, 220L, qrVar);
        n6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        n6Var3.setGravity(5);
        n6Var3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        n6Var3.setEmojiColor(-1);
        n6Var3.setEmojiCacheType(19);
        n6Var3.setImportantForAccessibility(2);
        addView(n6Var3, w7.x5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        j0 j0Var = new j0(2, context, e6Var, false);
        this.e = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new x7(this));
        addView(j0Var, w7.x5.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
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
        y7 y7Var;
        int i11;
        if (this.f21696r.f21659c != null) {
            int i12 = 1;
            while (true) {
                int[] iArr = this.f21696r.f21659c;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12 - 1];
                int i14 = iArr[i12];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * y7Var.d) / this.f21696r.d) + i11);
                }
                i12++;
            }
        }
        return Utilities.clamp01((i10 - this.f21696r.b()) / (this.f21696r.a() - this.f21696r.b()));
    }

    public final int c(int i10) {
        if (this.f21696r.f21659c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f21696r.f21659c;
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

    public final void d(int i10, y7 y7Var, Utilities.Callback callback) {
        this.f21694f = i10;
        this.f21696r = y7Var;
        this.f21695n = callback;
        this.e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        int i11;
        float f7;
        y7 y7Var = this.f21696r;
        if (y7Var != null && y7Var.e != null) {
            org.telegram.ui.Components.n6 n6Var = this.f21692b;
            n6Var.a();
            org.telegram.ui.Components.n6 n6Var2 = this.d;
            n6Var2.a();
            org.telegram.ui.Components.n6 n6Var3 = this.f21693c;
            n6Var3.a();
            n6Var3.c((CharSequence) this.f21696r.e.run(0, Integer.valueOf(i10)), z10, true);
            n6Var.c((CharSequence) this.f21696r.e.run(-1, Integer.valueOf(this.f21696r.b())), z10, true);
            n6Var2.c((CharSequence) this.f21696r.e.run(1, Integer.valueOf(this.f21696r.a())), z10, true);
            if (i10 >= this.f21696r.a()) {
                i11 = org.telegram.ui.ActionBar.i6.I6;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f19215y6;
            }
            n6Var2.f26329c.s(org.telegram.ui.ActionBar.i6.v0(i11, this.f21691a), z10);
            n6Var2.invalidate();
            if (i10 >= this.f21696r.a()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (Math.abs(this.f21698w - f7) >= 0.01f) {
                ValueAnimator valueAnimator = this.f21699x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f21699x = null;
                }
                this.f21698w = f7;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f7);
                    this.f21699x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f21699x.addListener(new org.telegram.ui.ActionBar.z0(this, f7, 3));
                    this.f21699x.setDuration(240L);
                    this.f21699x.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.v = f7;
                colorMatrix.setSaturation(f7);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
                }
                n6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
        this.f21697s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f21694f < i10) {
            this.f21694f = i10;
        }
        if (this.f21696r == null) {
            return;
        }
        this.e.setMinProgress(b(i10));
        e(this.f21694f, false);
        invalidate();
    }
}
