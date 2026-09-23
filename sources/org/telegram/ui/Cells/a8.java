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
import org.telegram.ui.Components.rr;
public final class a8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 f19763a;
    public final org.telegram.ui.Components.p6 f19764b;
    public final org.telegram.ui.Components.p6 f19765c;
    public final org.telegram.ui.Components.p6 d;
    public final j0 e;
    public int f19766f;
    public int h;
    public Utilities.Callback f19767n;
    public z7 f19768r;
    public CharSequence f19769s;
    public float v;
    public float f19770w;
    public ValueAnimator f19771x;

    public a8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f19770w = -1.0f;
        this.f19763a = d6Var;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, true);
        this.f19764b = p6Var;
        rr rrVar = rr.h;
        p6Var.b(0.3f, 220L, rrVar);
        p6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.h6.f19170y6;
        p6Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        p6Var.setGravity(3);
        p6Var.setEmojiCacheType(19);
        p6Var.setEmojiColor(-1);
        p6Var.setImportantForAccessibility(2);
        addView(p6Var, w7.x5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, false, true, true);
        this.f19765c = p6Var2;
        p6Var2.b(0.3f, 220L, rrVar);
        p6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var2.setGravity(17);
        p6Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I6, d6Var));
        p6Var2.setEmojiColor(-1);
        p6Var2.setEmojiCacheType(19);
        p6Var2.setImportantForAccessibility(2);
        addView(p6Var2, w7.x5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(context, true, true, true);
        this.d = p6Var3;
        p6Var3.b(0.3f, 220L, rrVar);
        p6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        p6Var3.setGravity(5);
        p6Var3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        p6Var3.setEmojiColor(-1);
        p6Var3.setEmojiCacheType(19);
        p6Var3.setImportantForAccessibility(2);
        addView(p6Var3, w7.x5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        j0 j0Var = new j0(2, context, d6Var, false);
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
        z7 z7Var;
        int i11;
        if (this.f19768r.f21680c != null) {
            int i12 = 1;
            while (true) {
                int[] iArr = this.f19768r.f21680c;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12 - 1];
                int i14 = iArr[i12];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * z7Var.d) / this.f19768r.d) + i11);
                }
                i12++;
            }
        }
        return Utilities.clamp01((i10 - this.f19768r.b()) / (this.f19768r.a() - this.f19768r.b()));
    }

    public final int c(int i10) {
        if (this.f19768r.f21680c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f19768r.f21680c;
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
        this.f19766f = i10;
        this.f19768r = z7Var;
        this.f19767n = callback;
        this.e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        int i11;
        float f7;
        z7 z7Var = this.f19768r;
        if (z7Var != null && z7Var.e != null) {
            org.telegram.ui.Components.p6 p6Var = this.f19764b;
            p6Var.a();
            org.telegram.ui.Components.p6 p6Var2 = this.d;
            p6Var2.a();
            org.telegram.ui.Components.p6 p6Var3 = this.f19765c;
            p6Var3.a();
            p6Var3.c((CharSequence) this.f19768r.e.run(0, Integer.valueOf(i10)), z10, true);
            p6Var.c((CharSequence) this.f19768r.e.run(-1, Integer.valueOf(this.f19768r.b())), z10, true);
            p6Var2.c((CharSequence) this.f19768r.e.run(1, Integer.valueOf(this.f19768r.a())), z10, true);
            if (i10 >= this.f19768r.a()) {
                i11 = org.telegram.ui.ActionBar.h6.I6;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.f19170y6;
            }
            p6Var2.f26940c.s(org.telegram.ui.ActionBar.h6.v0(i11, this.f19763a), z10);
            p6Var2.invalidate();
            if (i10 >= this.f19768r.a()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (Math.abs(this.f19770w - f7) >= 0.01f) {
                ValueAnimator valueAnimator = this.f19771x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f19771x = null;
                }
                this.f19770w = f7;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f7);
                    this.f19771x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f19771x.addListener(new org.telegram.ui.ActionBar.z0(this, f7, 3));
                    this.f19771x.setDuration(240L);
                    this.f19771x.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.v = f7;
                colorMatrix.setSaturation(f7);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
                }
                p6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
        this.f19769s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f19766f < i10) {
            this.f19766f = i10;
        }
        if (this.f19768r == null) {
            return;
        }
        this.e.setMinProgress(b(i10));
        e(this.f19766f, false);
        invalidate();
    }
}
