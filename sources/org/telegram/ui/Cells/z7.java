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
import org.telegram.ui.Components.es;
public final class z7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 f22511a;
    public final org.telegram.ui.Components.s6 f22512b;
    public final org.telegram.ui.Components.s6 f22513c;
    public final org.telegram.ui.Components.s6 d;
    public final j0 e;
    public int f22514f;
    public int h;
    public Utilities.Callback f22515n;
    public y7 f22516r;
    public CharSequence f22517s;
    public float v;
    public float f22518w;
    public ValueAnimator f22519x;

    public z7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f22518w = -1.0f;
        this.f22511a = c6Var;
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, true, true);
        this.f22512b = s6Var;
        es esVar = es.h;
        s6Var.b(0.3f, 220L, esVar);
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.g6.f19988y6;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        s6Var.setGravity(3);
        s6Var.setEmojiCacheType(19);
        s6Var.setEmojiColor(-1);
        s6Var.setImportantForAccessibility(2);
        addView(s6Var, w7.z5.a(25.0f, 22.0f, 13.0f, 22.0f, 0.0f, -1, 48));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, true, true);
        this.f22513c = s6Var2;
        s6Var2.b(0.3f, 220L, esVar);
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setGravity(17);
        s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.I6, c6Var));
        s6Var2.setEmojiColor(-1);
        s6Var2.setEmojiCacheType(19);
        s6Var2.setImportantForAccessibility(2);
        addView(s6Var2, w7.z5.a(25.0f, 22.0f, 13.0f, 22.0f, 0.0f, -1, 48));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.d = s6Var3;
        s6Var3.b(0.3f, 220L, esVar);
        s6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var3.setGravity(5);
        s6Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        s6Var3.setEmojiColor(-1);
        s6Var3.setEmojiCacheType(19);
        s6Var3.setImportantForAccessibility(2);
        addView(s6Var3, w7.z5.a(25.0f, 22.0f, 13.0f, 22.0f, 0.0f, -1, 48));
        j0 j0Var = new j0(2, context, c6Var, false);
        this.e = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new x7(this));
        addView(j0Var, w7.z5.a(38.0f, 6.0f, 30.0f, 6.0f, 0.0f, -1, 55));
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
        if (this.f22516r.f22485c != null) {
            int i12 = 1;
            while (true) {
                int[] iArr = this.f22516r.f22485c;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12 - 1];
                int i14 = iArr[i12];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * y7Var.d) / this.f22516r.d) + i11);
                }
                i12++;
            }
        }
        return Utilities.clamp01((i10 - this.f22516r.b()) / (this.f22516r.a() - this.f22516r.b()));
    }

    public final int c(int i10) {
        if (this.f22516r.f22485c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f22516r.f22485c;
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
        this.f22514f = i10;
        this.f22516r = y7Var;
        this.f22515n = callback;
        this.e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        int i11;
        float f7;
        y7 y7Var = this.f22516r;
        if (y7Var != null && y7Var.e != null) {
            org.telegram.ui.Components.s6 s6Var = this.f22512b;
            s6Var.a();
            org.telegram.ui.Components.s6 s6Var2 = this.d;
            s6Var2.a();
            org.telegram.ui.Components.s6 s6Var3 = this.f22513c;
            s6Var3.a();
            s6Var3.c((CharSequence) this.f22516r.e.run(0, Integer.valueOf(i10)), z10, true);
            s6Var.c((CharSequence) this.f22516r.e.run(-1, Integer.valueOf(this.f22516r.b())), z10, true);
            s6Var2.c((CharSequence) this.f22516r.e.run(1, Integer.valueOf(this.f22516r.a())), z10, true);
            if (i10 >= this.f22516r.a()) {
                i11 = org.telegram.ui.ActionBar.g6.I6;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.f19988y6;
            }
            s6Var2.f28752c.v(org.telegram.ui.ActionBar.g6.w0(i11, this.f22511a), z10);
            s6Var2.invalidate();
            if (i10 >= this.f22516r.a()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (Math.abs(this.f22518w - f7) >= 0.01f) {
                ValueAnimator valueAnimator = this.f22519x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f22519x = null;
                }
                this.f22518w = f7;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f7);
                    this.f22519x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f22519x.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 3));
                    this.f22519x.setDuration(240L);
                    this.f22519x.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.v = f7;
                colorMatrix.setSaturation(f7);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
                }
                s6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
        this.f22517s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f22514f < i10) {
            this.f22514f = i10;
        }
        if (this.f22516r == null) {
            return;
        }
        this.e.setMinProgress(b(i10));
        e(this.f22514f, false);
        invalidate();
    }
}
