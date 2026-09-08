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
import org.telegram.ui.Components.pr;
public final class z7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f23646a;
    public final org.telegram.ui.Components.q6 f23647b;
    public final org.telegram.ui.Components.q6 f23648c;
    public final org.telegram.ui.Components.q6 d;
    public final j0 f23649e;
    public int f23650f;
    public int h;
    public Utilities.Callback f23651n;
    public y7 f23652r;
    public CharSequence f23653s;
    public float v;
    public float f23654w;
    public ValueAnimator f23655x;

    public z7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f23654w = -1.0f;
        this.f23646a = f6Var;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, true, true);
        this.f23647b = q6Var;
        pr prVar = pr.h;
        q6Var.b(0.3f, 220L, prVar);
        q6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.j6.f21069y6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        q6Var.setGravity(3);
        q6Var.setEmojiCacheType(19);
        q6Var.setEmojiColor(-1);
        q6Var.setImportantForAccessibility(2);
        addView(q6Var, w7.x5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, false, true, true);
        this.f23648c = q6Var2;
        q6Var2.b(0.3f, 220L, prVar);
        q6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var2.setGravity(17);
        q6Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var));
        q6Var2.setEmojiColor(-1);
        q6Var2.setEmojiCacheType(19);
        q6Var2.setImportantForAccessibility(2);
        addView(q6Var2, w7.x5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var3 = new org.telegram.ui.Components.q6(context, true, true, true);
        this.d = q6Var3;
        q6Var3.b(0.3f, 220L, prVar);
        q6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        q6Var3.setGravity(5);
        q6Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        q6Var3.setEmojiColor(-1);
        q6Var3.setEmojiCacheType(19);
        q6Var3.setImportantForAccessibility(2);
        addView(q6Var3, w7.x5.d(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        j0 j0Var = new j0(2, context, f6Var, false);
        this.f23649e = j0Var;
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
        if (this.f23652r.f23599c != null) {
            int i12 = 1;
            while (true) {
                int[] iArr = this.f23652r.f23599c;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12 - 1];
                int i14 = iArr[i12];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * y7Var.d) / this.f23652r.d) + i11);
                }
                i12++;
            }
        }
        return Utilities.clamp01((i10 - this.f23652r.b()) / (this.f23652r.a() - this.f23652r.b()));
    }

    public final int c(int i10) {
        if (this.f23652r.f23599c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f23652r.f23599c;
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
        this.f23650f = i10;
        this.f23652r = y7Var;
        this.f23651n = callback;
        this.f23649e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        int i11;
        float f7;
        y7 y7Var = this.f23652r;
        if (y7Var != null && y7Var.f23600e != null) {
            org.telegram.ui.Components.q6 q6Var = this.f23647b;
            q6Var.a();
            org.telegram.ui.Components.q6 q6Var2 = this.d;
            q6Var2.a();
            org.telegram.ui.Components.q6 q6Var3 = this.f23648c;
            q6Var3.a();
            q6Var3.c((CharSequence) this.f23652r.f23600e.run(0, Integer.valueOf(i10)), z10, true);
            q6Var.c((CharSequence) this.f23652r.f23600e.run(-1, Integer.valueOf(this.f23652r.b())), z10, true);
            q6Var2.c((CharSequence) this.f23652r.f23600e.run(1, Integer.valueOf(this.f23652r.a())), z10, true);
            if (i10 >= this.f23652r.a()) {
                i11 = org.telegram.ui.ActionBar.j6.I6;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f21069y6;
            }
            q6Var2.f29624c.s(org.telegram.ui.ActionBar.j6.v0(i11, this.f23646a), z10);
            q6Var2.invalidate();
            if (i10 >= this.f23652r.a()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (Math.abs(this.f23654w - f7) >= 0.01f) {
                ValueAnimator valueAnimator = this.f23655x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f23655x = null;
                }
                this.f23654w = f7;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f7);
                    this.f23655x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f23655x.addListener(new org.telegram.ui.ActionBar.z0(this, f7, 3));
                    this.f23655x.setDuration(240L);
                    this.f23655x.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.v = f7;
                colorMatrix.setSaturation(f7);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
                }
                q6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
        this.f23653s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f23650f < i10) {
            this.f23650f = i10;
        }
        if (this.f23652r == null) {
            return;
        }
        this.f23649e.setMinProgress(b(i10));
        e(this.f23650f, false);
        invalidate();
    }
}
