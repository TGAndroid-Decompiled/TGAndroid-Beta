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
import org.telegram.ui.Components.wr;
public final class a8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f18879a;
    public final org.telegram.ui.Components.o6 f18880b;
    public final org.telegram.ui.Components.o6 f18881c;
    public final org.telegram.ui.Components.o6 d;
    public final j0 e;
    public int f18882f;
    public int h;
    public Utilities.Callback f18883n;
    public z7 f18884r;
    public CharSequence f18885s;
    public float v;
    public float f18886w;
    public ValueAnimator f18887x;

    public a8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f18886w = -1.0f;
        this.f18879a = f6Var;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f18880b = o6Var;
        wr wrVar = wr.h;
        o6Var.b(0.3f, 220L, wrVar);
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.j6.f18306y6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        o6Var.setGravity(3);
        o6Var.setEmojiCacheType(19);
        o6Var.setEmojiColor(-1);
        o6Var.setImportantForAccessibility(2);
        addView(o6Var, w7.a6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, true, true);
        this.f18881c = o6Var2;
        o6Var2.b(0.3f, 220L, wrVar);
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setGravity(17);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var));
        o6Var2.setEmojiColor(-1);
        o6Var2.setEmojiCacheType(19);
        o6Var2.setImportantForAccessibility(2);
        addView(o6Var2, w7.a6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.d = o6Var3;
        o6Var3.b(0.3f, 220L, wrVar);
        o6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var3.setGravity(5);
        o6Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        o6Var3.setEmojiColor(-1);
        o6Var3.setEmojiCacheType(19);
        o6Var3.setImportantForAccessibility(2);
        addView(o6Var3, w7.a6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        j0 j0Var = new j0(2, context, f6Var, false);
        this.e = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new y7(this));
        addView(j0Var, w7.a6.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
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
        z7 z7Var;
        int i11;
        if (this.f18884r.f20792c != null) {
            int i12 = 1;
            while (true) {
                int[] iArr = this.f18884r.f20792c;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12 - 1];
                int i14 = iArr[i12];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * z7Var.d) / this.f18884r.d) + i11);
                }
                i12++;
            }
        }
        return Utilities.clamp01((i10 - this.f18884r.b()) / (this.f18884r.a() - this.f18884r.b()));
    }

    public final int c(int i10) {
        if (this.f18884r.f20792c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f18884r.f20792c;
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

    public final void d(int i10, z7 z7Var, Utilities.Callback callback) {
        this.f18882f = i10;
        this.f18884r = z7Var;
        this.f18883n = callback;
        this.e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        int i11;
        float f7;
        z7 z7Var = this.f18884r;
        if (z7Var != null && z7Var.e != null) {
            org.telegram.ui.Components.o6 o6Var = this.f18880b;
            o6Var.a();
            org.telegram.ui.Components.o6 o6Var2 = this.d;
            o6Var2.a();
            org.telegram.ui.Components.o6 o6Var3 = this.f18881c;
            o6Var3.a();
            o6Var3.c((CharSequence) this.f18884r.e.run(0, Integer.valueOf(i10)), z10, true);
            o6Var.c((CharSequence) this.f18884r.e.run(-1, Integer.valueOf(this.f18884r.b())), z10, true);
            o6Var2.c((CharSequence) this.f18884r.e.run(1, Integer.valueOf(this.f18884r.a())), z10, true);
            if (i10 >= this.f18884r.a()) {
                i11 = org.telegram.ui.ActionBar.j6.I6;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f18306y6;
            }
            o6Var2.f25680c.s(org.telegram.ui.ActionBar.j6.v0(i11, this.f18879a), z10);
            o6Var2.invalidate();
            if (i10 >= this.f18884r.a()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (Math.abs(this.f18886w - f7) >= 0.01f) {
                ValueAnimator valueAnimator = this.f18887x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f18887x = null;
                }
                this.f18886w = f7;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f7);
                    this.f18887x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f18887x.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 3));
                    this.f18887x.setDuration(240L);
                    this.f18887x.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.v = f7;
                colorMatrix.setSaturation(f7);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
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
        this.f18885s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f18882f < i10) {
            this.f18882f = i10;
        }
        if (this.f18884r == null) {
            return;
        }
        this.e.setMinProgress(b(i10));
        e(this.f18882f, false);
        invalidate();
    }
}
