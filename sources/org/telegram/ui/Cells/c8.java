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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public final class c8 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f23933a;
    public final org.telegram.ui.Components.s6 f23934b;
    public final org.telegram.ui.Components.s6 f23935c;
    public final org.telegram.ui.Components.s6 d;
    public final i0 e;
    public int f23936f;
    public int h;
    public Utilities.Callback f23937n;
    public b8 f23938r;
    public CharSequence f23939s;
    public float v;
    public float f23940w;
    public ValueAnimator f23941x;

    public c8(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = Integer.MIN_VALUE;
        this.f23940w = -1.0f;
        this.f23933a = u6Var;
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, true, true);
        this.f23934b = s6Var;
        ds dsVar = ds.h;
        s6Var.b(0.3f, 220L, dsVar);
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        int i10 = org.telegram.ui.ActionBar.y6.f23746y6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i10, u6Var);
        s6Var.setGravity(3);
        s6Var.setEmojiCacheType(19);
        s6Var.setEmojiColor(-1);
        s6Var.setImportantForAccessibility(2);
        addView(s6Var, gb1.h(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, true, true);
        this.f23935c = s6Var2;
        s6Var2.b(0.3f, 220L, dsVar);
        s6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var2.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(s6Var2, org.telegram.ui.ActionBar.y6.I6, u6Var);
        s6Var2.setEmojiColor(-1);
        s6Var2.setEmojiCacheType(19);
        s6Var2.setImportantForAccessibility(2);
        addView(s6Var2, gb1.h(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.d = s6Var3;
        s6Var3.b(0.3f, 220L, dsVar);
        s6Var3.setTextSize(AndroidUtilities.dp(13.0f));
        s6Var3.setGravity(5);
        s6Var3.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        s6Var3.setEmojiColor(-1);
        s6Var3.setEmojiCacheType(19);
        s6Var3.setImportantForAccessibility(2);
        addView(s6Var3, gb1.h(-1, 25.0f, 48, 22.0f, 13.0f, 22.0f, 0.0f));
        i0 i0Var = new i0(2, context, u6Var, false);
        this.e = i0Var;
        i0Var.setReportChanges(true);
        i0Var.setDelegate(new a8(this));
        addView(i0Var, gb1.h(-1, 38.0f, 55, 6.0f, 30.0f, 6.0f, 0.0f));
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
        b8 b8Var;
        int i11;
        if (this.f23938r.f23906c != null) {
            int i12 = 1;
            while (true) {
                int[] iArr = this.f23938r.f23906c;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12 - 1];
                int i14 = iArr[i12];
                if (i10 >= i13 && i10 <= i14) {
                    return (1.0f / (iArr.length - 1)) * ((Math.round(((i10 - i13) / (i14 - i13)) * b8Var.d) / this.f23938r.d) + i11);
                }
                i12++;
            }
        }
        return Utilities.clamp01((i10 - this.f23938r.b()) / (this.f23938r.a() - this.f23938r.b()));
    }

    public final int c(int i10) {
        if (this.f23938r.f23906c != null) {
            int i11 = 1;
            while (true) {
                int[] iArr = this.f23938r.f23906c;
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

    public final void d(int i10, b8 b8Var, Utilities.Callback callback) {
        this.f23936f = i10;
        this.f23938r = b8Var;
        this.f23937n = callback;
        this.e.e(b(i10), false);
        e(i10, false);
    }

    public final void e(int i10, boolean z10) {
        int i11;
        float f7;
        b8 b8Var = this.f23938r;
        if (b8Var != null && b8Var.e != null) {
            org.telegram.ui.Components.s6 s6Var = this.f23934b;
            s6Var.a();
            org.telegram.ui.Components.s6 s6Var2 = this.d;
            s6Var2.a();
            org.telegram.ui.Components.s6 s6Var3 = this.f23935c;
            s6Var3.a();
            s6Var3.c((CharSequence) this.f23938r.e.run(0, Integer.valueOf(i10)), z10, true);
            s6Var.c((CharSequence) this.f23938r.e.run(-1, Integer.valueOf(this.f23938r.b())), z10, true);
            s6Var2.c((CharSequence) this.f23938r.e.run(1, Integer.valueOf(this.f23938r.a())), z10, true);
            if (i10 >= this.f23938r.a()) {
                i11 = org.telegram.ui.ActionBar.y6.I6;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.f23746y6;
            }
            s6Var2.f32440c.v(org.telegram.ui.ActionBar.y6.w0(i11, this.f23933a), z10);
            s6Var2.invalidate();
            if (i10 >= this.f23938r.a()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (Math.abs(this.f23940w - f7) >= 0.01f) {
                ValueAnimator valueAnimator = this.f23941x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f23941x = null;
                }
                this.f23940w = f7;
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, f7);
                    this.f23941x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 7));
                    this.f23941x.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 3));
                    this.f23941x.setDuration(240L);
                    this.f23941x.start();
                    return;
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                this.v = f7;
                colorMatrix.setSaturation(f7);
                if (org.telegram.ui.ActionBar.y6.I.q()) {
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
        this.f23939s = charSequence;
    }

    public void setMinValueAllowed(int i10) {
        this.h = i10;
        if (this.f23936f < i10) {
            this.f23936f = i10;
        }
        if (this.f23938r == null) {
            return;
        }
        this.e.setMinProgress(b(i10));
        e(this.f23936f, false);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.s6 s6Var;
        int i10;
        try {
            b8 b8Var = this.f23938r;
            if (b8Var != null && (s6Var = this.d) != null) {
                if (this.f23936f >= b8Var.a()) {
                    i10 = org.telegram.ui.ActionBar.y6.I6;
                } else {
                    i10 = org.telegram.ui.ActionBar.y6.f23746y6;
                }
                s6Var.f32440c.v(org.telegram.ui.ActionBar.y6.w0(i10, this.f23933a), false);
                s6Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
