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
import org.telegram.ui.Components.is;
public final class z7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f23812a;
    public final org.telegram.ui.Components.r6 f23813b;
    public final org.telegram.ui.Components.r6 f23814c;
    public final org.telegram.ui.Components.r6 d;
    public final j0 f23815e;
    public int f23816f;
    public int h;
    public Utilities.Callback f23817n;
    public y7 f23818r;
    public CharSequence f23819s;
    public float v;
    public float f23820w;
    public ValueAnimator f23821x;

    public z7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f23820w = -1.0f;
        this.f23812a = e6Var;
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, true, true);
        this.f23813b = r6Var;
        is isVar = is.h;
        r6Var.b(0.3f, 220L, isVar);
        r6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.i6.f21185y6;
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        r6Var.setGravity(3);
        r6Var.setEmojiCacheType(19);
        r6Var.setEmojiColor(-1);
        r6Var.setImportantForAccessibility(2);
        addView(r6Var, w7.x5.a(25.0f, 22.0f, 13.0f, 22.0f, 0.0f, -1, 48));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, false, true, true);
        this.f23814c = r6Var2;
        r6Var2.b(0.3f, 220L, isVar);
        r6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        r6Var2.setGravity(17);
        r6Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I6, e6Var));
        r6Var2.setEmojiColor(-1);
        r6Var2.setEmojiCacheType(19);
        r6Var2.setImportantForAccessibility(2);
        addView(r6Var2, w7.x5.a(25.0f, 22.0f, 13.0f, 22.0f, 0.0f, -1, 48));
        org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(context, true, true, true);
        this.d = r6Var3;
        r6Var3.b(0.3f, 220L, isVar);
        r6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        r6Var3.setGravity(5);
        r6Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        r6Var3.setEmojiColor(-1);
        r6Var3.setEmojiCacheType(19);
        r6Var3.setImportantForAccessibility(2);
        addView(r6Var3, w7.x5.a(25.0f, 22.0f, 13.0f, 22.0f, 0.0f, -1, 48));
        j0 j0Var = new j0(2, context, e6Var, false);
        this.f23815e = j0Var;
        j0Var.setReportChanges(true);
        j0Var.setDelegate(new x7(this));
        addView(j0Var, w7.x5.a(38.0f, 6.0f, 30.0f, 6.0f, 0.0f, -1, 55));
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
        if (this.f23818r.f23785c != null) {
            int i12 = 1;
            while (true) {
                int[] iArr = this.f23818r.f23785c;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12 - 1];
                int i14 = iArr[i12];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * y7Var.d) / this.f23818r.d) + i11);
                }
                i12++;
            }
        }
        return Utilities.clamp01((i10 - this.f23818r.b()) / (this.f23818r.a() - this.f23818r.b()));
    }

    public final int c(int i10) {
        if (this.f23818r.f23785c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f23818r.f23785c;
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
        this.f23816f = i10;
        this.f23818r = y7Var;
        this.f23817n = callback;
        this.f23815e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        int i11;
        float f7;
        y7 y7Var = this.f23818r;
        if (y7Var != null && y7Var.f23786e != null) {
            org.telegram.ui.Components.r6 r6Var = this.f23813b;
            r6Var.a();
            org.telegram.ui.Components.r6 r6Var2 = this.d;
            r6Var2.a();
            org.telegram.ui.Components.r6 r6Var3 = this.f23814c;
            r6Var3.a();
            r6Var3.c((CharSequence) this.f23818r.f23786e.run(0, Integer.valueOf(i10)), z10, true);
            r6Var.c((CharSequence) this.f23818r.f23786e.run(-1, Integer.valueOf(this.f23818r.b())), z10, true);
            r6Var2.c((CharSequence) this.f23818r.f23786e.run(1, Integer.valueOf(this.f23818r.a())), z10, true);
            if (i10 >= this.f23818r.a()) {
                i11 = org.telegram.ui.ActionBar.i6.I6;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f21185y6;
            }
            r6Var2.f30396c.v(org.telegram.ui.ActionBar.i6.w0(i11, this.f23812a), z10);
            r6Var2.invalidate();
            if (i10 >= this.f23818r.a()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (Math.abs(this.f23820w - f7) >= 0.01f) {
                ValueAnimator valueAnimator = this.f23821x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f23821x = null;
                }
                this.f23820w = f7;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f7);
                    this.f23821x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 6));
                    this.f23821x.addListener(new org.telegram.ui.ActionBar.z0(this, f7, 3));
                    this.f23821x.setDuration(240L);
                    this.f23821x.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.v = f7;
                colorMatrix.setSaturation(f7);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - this.v) * (-0.3f));
                }
                r6Var2.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
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
        this.f23819s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f23816f < i10) {
            this.f23816f = i10;
        }
        if (this.f23818r == null) {
            return;
        }
        this.f23815e.setMinProgress(b(i10));
        e(this.f23816f, false);
        invalidate();
    }
}
