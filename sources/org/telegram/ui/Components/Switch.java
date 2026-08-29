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
    public final org.telegram.ui.ActionBar.c6 S;
    public int T;
    public final vd.a f26553a;
    public final RectF f26554b;
    public float f26555c;
    public ObjectAnimator d;
    public ObjectAnimator f26556e;
    public boolean f26557f;
    public boolean h;
    public final Paint f26558n;
    public final Paint f26559r;
    public int f26560s;
    public float v;
    public int f26561w;
    public int f26562x;
    public int f26563y;

    public Switch(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26553a = new vd.a(0, new sf.f1(this, 13), jr.h, 380L, true);
        this.v = 1.0f;
        this.f26561w = org.telegram.ui.ActionBar.g6.f23311r7;
        this.f26562x = org.telegram.ui.ActionBar.g6.V6;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        this.f26563y = i10;
        this.A = i10;
        this.G = new int[]{16842910, 16842919};
        this.S = c6Var;
        this.f26554b = new RectF();
        this.f26558n = new Paint(1);
        Paint paint = new Paint(1);
        this.f26559r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f9;
        float f10;
        float f11 = 0.0f;
        if (z10 != this.h) {
            this.h = z10;
            if (this.f26557f && z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new my0(this, 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                setProgress(f9);
            }
        }
        if (this.f26560s != i10) {
            this.f26560s = i10;
            if (this.f26557f && z11) {
                if (i10 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", f11);
                this.f26556e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.f26556e.addListener(new my0(this, 1));
                this.f26556e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.f26556e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.f26556e = null;
            }
            if (i10 == 0) {
                f11 = 1.0f;
            }
            setIconProgress(f11);
        }
    }

    public final void c(boolean z10, boolean z11) {
        b(this.f26560s, z10, z11);
    }

    public final void d(int i10, int i11, int i12, int i13) {
        this.f26561w = i10;
        this.f26562x = i11;
        this.f26563y = i12;
        this.A = i13;
    }

    public float getIconProgress() {
        return this.v;
    }

    public float getProgress() {
        return this.f26555c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26557f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26557f = false;
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

    public void setDrawIconType(int i10) {
        this.f26560s = i10;
    }

    public void setDrawRipple(boolean z10) {
        int[] iArr;
        float dp;
        int i10;
        bg.m1 m1Var;
        int i11 = Build.VERSION.SDK_INT;
        if (z10 == this.D) {
            return;
        }
        this.D = z10;
        int i12 = 1;
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setColor(-1);
            if (i11 >= 23) {
                m1Var = null;
            } else {
                m1Var = new bg.m1(this, 6);
            }
            ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, m1Var);
            this.E = rippleDrawable;
            if (i11 >= 23) {
                rippleDrawable.setRadius(AndroidUtilities.dp(18.0f));
            }
            this.E.setCallback(this);
        }
        boolean z11 = this.h;
        if ((z11 && this.H != 2) || (!z11 && this.H != 1)) {
            if (z11) {
                i10 = org.telegram.ui.ActionBar.g6.T6;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.S6;
            }
            this.E.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.g6.v0(i10, this.S))}));
            if (this.h) {
                i12 = 2;
            }
            this.H = i12;
        }
        if (i11 >= 28 && z10) {
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

    public void setIcon(int i10) {
        int i11;
        if (i10 != 0) {
            Drawable mutate = getResources().getDrawable(i10).mutate();
            this.B = mutate;
            if (mutate != null) {
                if (this.h) {
                    i11 = this.f26562x;
                } else {
                    i11 = this.f26561w;
                }
                int v02 = org.telegram.ui.ActionBar.g6.v0(i11, this.S);
                this.C = v02;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.B = null;
        }
        invalidate();
    }

    public void setIconProgress(float f9) {
        if (this.v == f9) {
            return;
        }
        this.v = f9;
        invalidate();
    }

    public void setOverrideColor(int i10) {
        if (this.T != i10) {
            if (this.J == null) {
                try {
                    this.J = new Bitmap[2];
                    this.K = new Canvas[2];
                    for (int i11 = 0; i11 < 2; i11++) {
                        this.J[i11] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        this.K[i11] = new Canvas(this.J[i11]);
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
            this.T = i10;
            this.N = 0.0f;
            this.O = 0.0f;
            this.P = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f9) {
        if (this.f26555c == f9) {
            return;
        }
        this.f26555c = f9;
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

    public int a(int i10) {
        return i10;
    }

    public void setOnCheckedChangeListener(ny0 ny0Var) {
    }
}
