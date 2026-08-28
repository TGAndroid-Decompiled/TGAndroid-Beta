package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public class Switch extends View {
    public int A;
    public Drawable B;
    public int C;
    public boolean D;
    public org.telegram.ui.Cells.z E;
    public Paint F;
    public final int[] G;
    public int H;
    public boolean I;
    public Bitmap[] J;
    public Canvas[] K;
    public Bitmap L;
    public Canvas M;
    public float N;
    public float O;
    public float P;
    public Paint Q;
    public Paint R;
    public final org.telegram.ui.ActionBar.b6 S;
    public int T;
    public final td.a f26542a;
    public final RectF f26543b;
    public float f26544c;
    public ObjectAnimator d;
    public ObjectAnimator f26545e;
    public boolean f26546f;
    public boolean h;
    public final Paint f26547n;
    public final Paint f26548r;
    public int f26549s;
    public float v;
    public int f26550w;
    public int f26551x;
    public int f26552y;

    public Switch(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f26542a = new td.a(0, new t0.c(this, 1), gr.h, 380L, true);
        this.v = 1.0f;
        this.f26550w = org.telegram.ui.ActionBar.f6.f23249r7;
        this.f26551x = org.telegram.ui.ActionBar.f6.V6;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        this.f26552y = i9;
        this.A = i9;
        this.G = new int[]{16842910, 16842919};
        this.S = b6Var;
        this.f26543b = new RectF();
        this.f26547n = new Paint(1);
        Paint paint = new Paint(1);
        this.f26548r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i9, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        float f12 = 0.0f;
        if (z10 != this.h) {
            this.h = z10;
            if (this.f26546f && z11) {
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f11);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new by0(this, 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                setProgress(f10);
            }
        }
        if (this.f26549s != i9) {
            this.f26549s = i9;
            if (this.f26546f && z11) {
                if (i9 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", f12);
                this.f26545e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.f26545e.addListener(new by0(this, 1));
                this.f26545e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.f26545e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.f26545e = null;
            }
            if (i9 == 0) {
                f12 = 1.0f;
            }
            setIconProgress(f12);
        }
    }

    public final void c(boolean z10, boolean z11) {
        b(this.f26549s, z10, z11);
    }

    public final void d(int i9, int i10, int i11, int i12) {
        this.f26550w = i9;
        this.f26551x = i10;
        this.f26552y = i11;
        this.A = i12;
    }

    public float getIconProgress() {
        return this.v;
    }

    public float getProgress() {
        return this.f26544c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26546f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26546f = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Switch.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.h);
    }

    public void setDrawIconType(int i9) {
        this.f26549s = i9;
    }

    public void setDrawRipple(boolean z10) {
        int[] iArr;
        float dp;
        int i9;
        kh.w3 w3Var;
        int i10 = Build.VERSION.SDK_INT;
        if (z10 == this.D) {
            return;
        }
        this.D = z10;
        int i11 = 1;
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setColor(-1);
            if (i10 >= 23) {
                w3Var = null;
            } else {
                w3Var = new kh.w3(this, 5);
            }
            ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, w3Var);
            this.E = rippleDrawable;
            if (i10 >= 23) {
                rippleDrawable.setRadius(AndroidUtilities.dp(18.0f));
            }
            this.E.setCallback(this);
        }
        boolean z11 = this.h;
        if ((z11 && this.H != 2) || (!z11 && this.H != 1)) {
            if (z11) {
                i9 = org.telegram.ui.ActionBar.f6.T6;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.S6;
            }
            this.E.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.f6.v0(i9, this.S))}));
            if (this.h) {
                i11 = 2;
            }
            this.H = i11;
        }
        if (i10 >= 28 && z10) {
            org.telegram.ui.Cells.z zVar = this.E;
            if (this.h) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(100.0f);
            }
            zVar.setHotspot(dp, AndroidUtilities.dp(18.0f));
        }
        org.telegram.ui.Cells.z zVar2 = this.E;
        if (z10) {
            iArr = this.G;
        } else {
            iArr = StateSet.NOTHING;
        }
        zVar2.setState(iArr);
        invalidate();
    }

    public void setIcon(int i9) {
        int i10;
        if (i9 != 0) {
            Drawable mutate = getResources().getDrawable(i9).mutate();
            this.B = mutate;
            if (mutate != null) {
                if (this.h) {
                    i10 = this.f26551x;
                } else {
                    i10 = this.f26550w;
                }
                int v02 = org.telegram.ui.ActionBar.f6.v0(i10, this.S);
                this.C = v02;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.B = null;
        }
        invalidate();
    }

    public void setIconProgress(float f10) {
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        invalidate();
    }

    public void setOverrideColor(int i9) {
        if (this.T != i9) {
            if (this.J == null) {
                try {
                    this.J = new Bitmap[2];
                    this.K = new Canvas[2];
                    for (int i10 = 0; i10 < 2; i10++) {
                        this.J[i10] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        this.K[i10] = new Canvas(this.J[i10]);
                    }
                    this.L = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.M = new Canvas(this.L);
                    Paint paint = new Paint(1);
                    this.Q = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    this.R = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.I = true;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (!this.I) {
                return;
            }
            this.T = i9;
            this.N = 0.0f;
            this.O = 0.0f;
            this.P = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f26544c == f10) {
            return;
        }
        this.f26544c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            org.telegram.ui.Cells.z zVar = this.E;
            if (zVar == null || drawable != zVar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int a(int i9) {
        return i9;
    }

    public void setOnCheckedChangeListener(cy0 cy0Var) {
    }
}
