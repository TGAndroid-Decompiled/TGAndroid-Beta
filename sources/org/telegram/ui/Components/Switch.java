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
    public int E;
    public Drawable F;
    public int G;
    public boolean H;
    public org.telegram.ui.Cells.z I;
    public Paint J;
    public final int[] K;
    public int L;
    public boolean M;
    public Bitmap[] N;
    public Canvas[] O;
    public Bitmap P;
    public Canvas Q;
    public float R;
    public float S;
    public float T;
    public Paint U;
    public Paint V;
    public final org.telegram.ui.ActionBar.f6 W;
    public final le.b f21282a;
    public int f21283a0;
    public final RectF f21284b;
    public float f21285c;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public boolean f21286f;
    public boolean h;
    public final Paint f21287n;
    public final Paint f21288r;
    public int f21289s;
    public float v;
    public int f21290w;
    public int f21291x;
    public int f21292y;

    public Switch(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21282a = new le.b(0, new hi.y1(this, 23), wr.h, 380L, true);
        this.v = 1.0f;
        this.f21290w = org.telegram.ui.ActionBar.j6.f18181r7;
        this.f21291x = org.telegram.ui.ActionBar.j6.V6;
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        this.f21292y = i10;
        this.E = i10;
        this.K = new int[]{16842910, 16842919};
        this.W = f6Var;
        this.f21284b = new RectF();
        this.f21287n = new Paint(1);
        Paint paint = new Paint(1);
        this.f21288r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float f11 = 0.0f;
        if (z10 != this.h) {
            this.h = z10;
            if (this.f21286f && z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new gz0(this, 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                setProgress(f7);
            }
        }
        if (this.f21289s != i10) {
            this.f21289s = i10;
            if (this.f21286f && z11) {
                if (i10 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", f11);
                this.e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.e.addListener(new gz0(this, 1));
                this.e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.e = null;
            }
            if (i10 == 0) {
                f11 = 1.0f;
            }
            setIconProgress(f11);
        }
    }

    public final void c(boolean z10, boolean z11) {
        b(this.f21289s, z10, z11);
    }

    public final void d(int i10, int i11, int i12, int i13) {
        this.f21290w = i10;
        this.f21291x = i11;
        this.f21292y = i12;
        this.E = i13;
    }

    public float getIconProgress() {
        return this.v;
    }

    public float getProgress() {
        return this.f21285c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21286f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21286f = false;
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
        this.f21289s = i10;
    }

    public void setDrawRipple(boolean z10) {
        int[] iArr;
        float dp;
        int i10;
        bi.w4 w4Var;
        int i11 = Build.VERSION.SDK_INT;
        if (z10 == this.H) {
            return;
        }
        this.H = z10;
        int i12 = 1;
        if (this.I == null) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setColor(-1);
            if (i11 >= 23) {
                w4Var = null;
            } else {
                w4Var = new bi.w4(this, 5);
            }
            ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, w4Var);
            this.I = rippleDrawable;
            if (i11 >= 23) {
                rippleDrawable.setRadius(AndroidUtilities.dp(18.0f));
            }
            this.I.setCallback(this);
        }
        boolean z11 = this.h;
        if ((z11 && this.L != 2) || (!z11 && this.L != 1)) {
            if (z11) {
                i10 = org.telegram.ui.ActionBar.j6.T6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.S6;
            }
            this.I.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.j6.v0(i10, this.W))}));
            if (this.h) {
                i12 = 2;
            }
            this.L = i12;
        }
        if (i11 >= 28 && z10) {
            org.telegram.ui.Cells.z zVar = this.I;
            if (this.h) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(100.0f);
            }
            zVar.setHotspot(dp, AndroidUtilities.dp(18.0f));
        }
        org.telegram.ui.Cells.z zVar2 = this.I;
        if (z10) {
            iArr = this.K;
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
            this.F = mutate;
            if (mutate != null) {
                if (this.h) {
                    i11 = this.f21291x;
                } else {
                    i11 = this.f21290w;
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, this.W);
                this.G = v02;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.F = null;
        }
        invalidate();
    }

    public void setIconProgress(float f7) {
        if (this.v == f7) {
            return;
        }
        this.v = f7;
        invalidate();
    }

    public void setOverrideColor(int i10) {
        if (this.f21283a0 != i10) {
            if (this.N == null) {
                try {
                    this.N = new Bitmap[2];
                    this.O = new Canvas[2];
                    for (int i11 = 0; i11 < 2; i11++) {
                        this.N[i11] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        this.O[i11] = new Canvas(this.N[i11]);
                    }
                    this.P = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.Q = new Canvas(this.P);
                    Paint paint = new Paint(1);
                    this.U = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    this.V = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.M = true;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (!this.M) {
                return;
            }
            this.f21283a0 = i10;
            this.R = 0.0f;
            this.S = 0.0f;
            this.T = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f21285c == f7) {
            return;
        }
        this.f21285c = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            org.telegram.ui.Cells.z zVar = this.I;
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

    public void setOnCheckedChangeListener(hz0 hz0Var) {
    }
}
