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
import java.util.HashSet;
public class Switch extends View implements org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public Drawable F;
    public int G;
    public boolean H;
    public org.telegram.ui.Cells.y I;
    public final int[] J;
    public int K;
    public boolean L;
    public Bitmap[] M;
    public Canvas[] N;
    public Bitmap O;
    public Canvas P;
    public float Q;
    public float R;
    public float S;
    public Paint T;
    public Paint U;
    public final org.telegram.ui.ActionBar.f6 V;
    public int W;
    public final te.a f31550a;
    public final RectF f31551b;
    public float f31552c;
    public ObjectAnimator d;
    public ObjectAnimator f31553e;
    public boolean f31554f;
    public boolean h;
    public final Paint f31555n;
    public final Paint f31556r;
    public int f31557s;
    public float f31558w;
    public int f31559x;
    public int f31560y;

    public Switch(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f31550a = new te.a(0, new org.telegram.ui.ActionBar.m3(this, 19), xq.h, 380L, true);
        this.f31558w = 1.0f;
        this.f31559x = org.telegram.ui.ActionBar.k6.f28108r7;
        this.f31560y = org.telegram.ui.ActionBar.k6.V6;
        int i7 = org.telegram.ui.ActionBar.k6.f27848d6;
        this.D = i7;
        this.E = i7;
        this.J = new int[]{16842910, 16842919};
        this.V = f6Var;
        this.f31551b = new RectF();
        this.f31555n = new Paint(1);
        Paint paint = new Paint(1);
        this.f31556r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i7, boolean z9, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        float f12 = 0.0f;
        if (z9 != this.h) {
            this.h = z9;
            if (this.f31554f && z10) {
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f11);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new vw0(this, 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                setProgress(f10);
            }
        }
        if (this.f31557s != i7) {
            this.f31557s = i7;
            if (this.f31554f && z10) {
                if (i7 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", f12);
                this.f31553e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.f31553e.addListener(new vw0(this, 1));
                this.f31553e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.f31553e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.f31553e = null;
            }
            if (i7 == 0) {
                f12 = 1.0f;
            }
            setIconProgress(f12);
        }
    }

    public final void c(boolean z9, boolean z10) {
        b(this.f31557s, z9, z10);
    }

    public final void d(int i7, int i10, int i11, int i12) {
        this.f31559x = i7;
        this.f31560y = i10;
        this.D = i11;
        this.E = i12;
    }

    public float getIconProgress() {
        return this.f31558w;
    }

    public float getProgress() {
        return this.f31552c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31554f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31554f = false;
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

    public void setDrawIconType(int i7) {
        this.f31557s = i7;
    }

    public void setDrawRipple(boolean z9) {
        int[] iArr;
        float L;
        int i7;
        int i10 = Build.VERSION.SDK_INT;
        if (z9 == this.H) {
            return;
        }
        this.H = z9;
        int i11 = 1;
        if (this.I == null) {
            new Paint(1).setColor(-1);
            ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, null);
            this.I = rippleDrawable;
            rippleDrawable.setRadius(org.telegram.messenger.g0.L(18.0f));
            this.I.setCallback(this);
        }
        boolean z10 = this.h;
        if ((z10 && this.K != 2) || (!z10 && this.K != 1)) {
            if (z10) {
                i7 = org.telegram.ui.ActionBar.k6.T6;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.S6;
            }
            this.I.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.k6.w0(i7, this.V))}));
            if (this.h) {
                i11 = 2;
            }
            this.K = i11;
        }
        if (i10 >= 28 && z9) {
            org.telegram.ui.Cells.y yVar = this.I;
            if (this.h) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(100.0f);
            }
            yVar.setHotspot(L, org.telegram.messenger.g0.L(18.0f));
        }
        org.telegram.ui.Cells.y yVar2 = this.I;
        if (z9) {
            iArr = this.J;
        } else {
            iArr = StateSet.NOTHING;
        }
        yVar2.setState(iArr);
        invalidate();
    }

    public void setIcon(int i7) {
        int i10;
        if (i7 != 0) {
            Drawable mutate = getResources().getDrawable(i7).mutate();
            this.F = mutate;
            if (mutate != null) {
                if (this.h) {
                    i10 = this.f31560y;
                } else {
                    i10 = this.f31559x;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.V);
                this.G = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.F = null;
        }
        invalidate();
    }

    public void setIconProgress(float f10) {
        if (this.f31558w == f10) {
            return;
        }
        this.f31558w = f10;
        invalidate();
    }

    public void setOverrideColor(int i7) {
        if (this.W != i7) {
            if (this.M == null) {
                try {
                    this.M = new Bitmap[2];
                    this.N = new Canvas[2];
                    for (int i10 = 0; i10 < 2; i10++) {
                        this.M[i10] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        this.N[i10] = new Canvas(this.M[i10]);
                    }
                    this.O = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.P = new Canvas(this.O);
                    Paint paint = new Paint(1);
                    this.T = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    this.U = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.L = true;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (!this.L) {
                return;
            }
            this.W = i7;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f31552c == f10) {
            return;
        }
        this.f31552c = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        this.K = 0;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            org.telegram.ui.Cells.y yVar = this.I;
            if (yVar == null || drawable != yVar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int a(int i7) {
        return i7;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnCheckedChangeListener(ww0 ww0Var) {
    }
}
