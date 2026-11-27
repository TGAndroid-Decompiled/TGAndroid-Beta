package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
public class Switch extends View implements snb {
    public int E;
    public int F;
    public Drawable G;
    public int H;
    public boolean I;
    public hf0 J;
    public final int[] K;
    public byte L;
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
    public final vnb W;
    public final fm0 a;
    public int a0;
    public final RectF b;
    public float c;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public boolean f;
    public boolean h;
    public final Paint n;
    public final Paint r;
    public int s;
    public float w;
    public int x;
    public int y;

    public Switch(Context context, vnb vnbVar) {
        super(context);
        this.a = new fm0(0, new tg0(this, (byte) 2), k43.h, 380L, true);
        this.w = 1.0f;
        this.x = aob.r7;
        this.y = aob.V6;
        int i = aob.d6;
        this.E = i;
        this.F = i;
        this.K = new int[]{16842910, 16842919};
        this.W = vnbVar;
        this.b = new RectF();
        this.n = new Paint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.L(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i, boolean z, boolean z2) {
        boolean z3;
        float f;
        float f2;
        float f3 = 0.0f;
        if (z != this.h) {
            this.h = z;
            if (this.f && z2) {
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f2);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new mgb(this, (byte) 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                setProgress(f);
            }
        }
        if (this.s != i) {
            this.s = i;
            if (this.f && z2) {
                if (i == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f3 = 1.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", f3);
                this.e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.e.addListener(new mgb(this, (byte) 1));
                this.e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.e = null;
            }
            if (i == 0) {
                f3 = 1.0f;
            }
            setIconProgress(f3);
        }
    }

    public final void c(boolean z, boolean z2) {
        b(this.s, z, z2);
    }

    public final void d(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.E = i3;
        this.F = i4;
    }

    public float getIconProgress() {
        return this.w;
    }

    public float getProgress() {
        return this.c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f = false;
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

    public void setDrawIconType(int i) {
        this.s = i;
    }

    public void setDrawRipple(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Switch.setDrawRipple(boolean):void");
    }

    public void setIcon(int i) {
        int i2;
        if (i != 0) {
            Drawable mutate = getResources().getDrawable(i).mutate();
            this.G = mutate;
            if (mutate != null) {
                if (this.h) {
                    i2 = this.y;
                } else {
                    i2 = this.x;
                }
                int v0 = aob.v0(i2, this.W);
                this.H = v0;
                mutate.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.G = null;
        }
        invalidate();
    }

    public void setIconProgress(float f) {
        if (this.w == f) {
            return;
        }
        this.w = f;
        invalidate();
    }

    public void setOverrideColor(int i) {
        if (this.a0 != i) {
            if (this.N == null) {
                try {
                    this.N = new Bitmap[2];
                    this.O = new Canvas[2];
                    for (int i2 = 0; i2 < 2; i2++) {
                        this.N[i2] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        this.O[i2] = new Canvas(this.N[i2]);
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
            this.a0 = i;
            this.R = 0.0f;
            this.S = 0.0f;
            this.T = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f) {
        if (this.c == f) {
            return;
        }
        this.c = f;
        invalidate();
    }

    @Override
    public final void updateColors() {
        this.L = (byte) 0;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            hf0 hf0Var = this.J;
            if (hf0Var == null || drawable != hf0Var) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int a(int i) {
        return i;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnCheckedChangeListener(ngb ngbVar) {
    }
}
