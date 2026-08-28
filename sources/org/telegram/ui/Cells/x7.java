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
import org.telegram.ui.Components.gr;
public final class x7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 f25947a;
    public final org.telegram.ui.Components.j6 f25948b;
    public final org.telegram.ui.Components.j6 f25949c;
    public final org.telegram.ui.Components.j6 d;
    public final j0 f25950e;
    public int f25951f;
    public int h;
    public Utilities.Callback f25952n;
    public w7 f25953r;
    public CharSequence f25954s;
    public float v;
    public float f25955w;
    public ValueAnimator f25956x;

    public x7(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f25955w = -1.0f;
        this.f25947a = b6Var;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f25948b = j6Var;
        gr grVar = gr.h;
        j6Var.b(0.3f, 220L, grVar);
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i9 = org.telegram.ui.ActionBar.f6.f23369y6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        j6Var.setGravity(3);
        j6Var.setEmojiCacheType(19);
        j6Var.setEmojiColor(-1);
        j6Var.setImportantForAccessibility(2);
        addView(j6Var, g7.e6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f25949c = j6Var2;
        j6Var2.b(0.3f, 220L, grVar);
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setGravity(17);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I6, b6Var));
        j6Var2.setEmojiColor(-1);
        j6Var2.setEmojiCacheType(19);
        j6Var2.setImportantForAccessibility(2);
        addView(j6Var2, g7.e6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.d = j6Var3;
        j6Var3.b(0.3f, 220L, grVar);
        j6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var3.setGravity(5);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        j6Var3.setEmojiColor(-1);
        j6Var3.setEmojiCacheType(19);
        j6Var3.setImportantForAccessibility(2);
        addView(j6Var3, g7.e6.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        j0 j0Var = new j0(2, context, b6Var, false);
        this.f25950e = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new v7(this));
        addView(j0Var, g7.e6.d(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
    }

    public static int[] a(int i9, int[] iArr) {
        boolean z10 = false;
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 <= i9) {
                i10++;
                if (i11 == i9) {
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
            if (i13 <= i9) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        if (!z10) {
            iArr2[i12] = i9;
        }
        return iArr2;
    }

    public final float b(int i9) {
        w7 w7Var;
        int i10;
        if (this.f25953r.f25909c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f25953r.f25909c;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11 - 1];
                int i13 = iArr[i11];
                if (i9 >= i12 && i9 <= i13) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i9 - i12) / (i13 - i12)) * w7Var.d) / this.f25953r.d) + i10);
                }
                i11++;
            }
        }
        return Utilities.clamp01((i9 - this.f25953r.b()) / (this.f25953r.a() - this.f25953r.b()));
    }

    public final int c(int i9) {
        if (this.f25953r.f25909c != null) {
            int i10 = 1;
            while (true) {
                int[] iArr = this.f25953r.f25909c;
                if (i10 >= iArr.length) {
                    break;
                }
                int i11 = i10 - 1;
                int i12 = iArr[i11];
                int i13 = iArr[i10];
                if (i9 >= i12 && i9 <= i13) {
                    return i11;
                }
                i10++;
            }
        }
        return i9;
    }

    public final void d(int i9, w7 w7Var, Utilities.Callback callback) {
        this.f25951f = i9;
        this.f25953r = w7Var;
        this.f25952n = callback;
        this.f25950e.e(b(i9), false);
        e(i9, false);
    }

    public final void e(int i9, boolean z10) {
        int i10;
        float f10;
        w7 w7Var = this.f25953r;
        if (w7Var != null && w7Var.f25910e != null) {
            org.telegram.ui.Components.j6 j6Var = this.f25948b;
            j6Var.a();
            org.telegram.ui.Components.j6 j6Var2 = this.d;
            j6Var2.a();
            org.telegram.ui.Components.j6 j6Var3 = this.f25949c;
            j6Var3.a();
            j6Var3.c((CharSequence) this.f25953r.f25910e.run(0, Integer.valueOf(i9)), z10, true);
            j6Var.c((CharSequence) this.f25953r.f25910e.run(-1, Integer.valueOf(this.f25953r.b())), z10, true);
            j6Var2.c((CharSequence) this.f25953r.f25910e.run(1, Integer.valueOf(this.f25953r.a())), z10, true);
            if (i9 >= this.f25953r.a()) {
                i10 = org.telegram.ui.ActionBar.f6.I6;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.f23369y6;
            }
            j6Var2.f29647c.s(org.telegram.ui.ActionBar.f6.v0(i10, this.f25947a), z10);
            j6Var2.invalidate();
            if (i9 >= this.f25953r.a()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (Math.abs(this.f25955w - f10) >= 0.01f) {
                ValueAnimator valueAnimator = this.f25956x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f25956x = null;
                }
                this.f25955w = f10;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f10);
                    this.f25956x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f25956x.addListener(new org.telegram.ui.ActionBar.a1(this, f10, 3));
                    this.f25956x.setDuration(240L);
                    this.f25956x.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.v = f10;
                colorMatrix.setSaturation(f10);
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
                }
                j6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(75.0f), 1073741824));
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, 0, AndroidUtilities.dp(80.0f), getMeasuredHeight()), new Rect(getMeasuredWidth() - AndroidUtilities.dp(80.0f), 0, getMeasuredWidth(), getMeasuredHeight())));
        }
    }

    public void setLabel(CharSequence charSequence) {
        this.f25954s = charSequence;
    }

    public void setMinValueAllowed(int i9) {
        this.h = i9;
        if (this.f25951f < i9) {
            this.f25951f = i9;
        }
        if (this.f25953r == null) {
            return;
        }
        this.f25950e.setMinProgress(b(i9));
        e(this.f25951f, false);
        invalidate();
    }
}
