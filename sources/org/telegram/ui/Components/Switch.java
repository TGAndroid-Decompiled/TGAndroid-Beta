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
public class Switch extends View implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public Drawable G;
    public int H;
    public boolean I;
    public org.telegram.ui.Cells.y J;
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
    public final org.telegram.ui.ActionBar.e6 W;
    public final qe.a f31628a;
    public int f31629a0;
    public final RectF f31630b;
    public float f31631c;
    public ObjectAnimator d;
    public ObjectAnimator f31632e;
    public boolean f31633f;
    public boolean h;
    public final Paint f31634n;
    public final Paint f31635r;
    public int f31636s;
    public float f31637w;
    public int f31638x;
    public int f31639y;

    public Switch(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f31628a = new qe.a(0, new org.telegram.ui.ActionBar.e3(this, 8), xq.h, 380L, true);
        this.f31637w = 1.0f;
        this.f31638x = org.telegram.ui.ActionBar.k6.f28141r7;
        this.f31639y = org.telegram.ui.ActionBar.k6.V6;
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        this.E = i3;
        this.F = i3;
        this.K = new int[]{16842910, 16842919};
        this.W = e6Var;
        this.f31630b = new RectF();
        this.f31634n = new Paint(1);
        Paint paint = new Paint(1);
        this.f31635r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i3, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        float f12 = 0.0f;
        if (z10 != this.h) {
            this.h = z10;
            if (this.f31633f && z11) {
                if (z10) {
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
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                setProgress(f10);
            }
        }
        if (this.f31636s != i3) {
            this.f31636s = i3;
            if (this.f31633f && z11) {
                if (i3 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", f12);
                this.f31632e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.f31632e.addListener(new vw0(this, 1));
                this.f31632e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.f31632e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.f31632e = null;
            }
            if (i3 == 0) {
                f12 = 1.0f;
            }
            setIconProgress(f12);
        }
    }

    public final void c(boolean z10, boolean z11) {
        b(this.f31636s, z10, z11);
    }

    public final void d(int i3, int i10, int i11, int i12) {
        this.f31638x = i3;
        this.f31639y = i10;
        this.E = i11;
        this.F = i12;
    }

    public float getIconProgress() {
        return this.f31637w;
    }

    public float getProgress() {
        return this.f31631c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31633f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31633f = false;
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

    public void setDrawIconType(int i3) {
        this.f31636s = i3;
    }

    public void setDrawRipple(boolean z10) {
        int[] iArr;
        float L;
        int i3;
        int i10 = Build.VERSION.SDK_INT;
        if (z10 == this.I) {
            return;
        }
        this.I = z10;
        int i11 = 1;
        if (this.J == null) {
            new Paint(1).setColor(-1);
            ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, null);
            this.J = rippleDrawable;
            rippleDrawable.setRadius(org.telegram.messenger.g0.L(18.0f));
            this.J.setCallback(this);
        }
        boolean z11 = this.h;
        if ((z11 && this.L != 2) || (!z11 && this.L != 1)) {
            if (z11) {
                i3 = org.telegram.ui.ActionBar.k6.T6;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.S6;
            }
            this.J.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.k6.w0(i3, this.W))}));
            if (this.h) {
                i11 = 2;
            }
            this.L = i11;
        }
        if (i10 >= 28 && z10) {
            org.telegram.ui.Cells.y yVar = this.J;
            if (this.h) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(100.0f);
            }
            yVar.setHotspot(L, org.telegram.messenger.g0.L(18.0f));
        }
        org.telegram.ui.Cells.y yVar2 = this.J;
        if (z10) {
            iArr = this.K;
        } else {
            iArr = StateSet.NOTHING;
        }
        yVar2.setState(iArr);
        invalidate();
    }

    public void setIcon(int i3) {
        int i10;
        if (i3 != 0) {
            Drawable mutate = getResources().getDrawable(i3).mutate();
            this.G = mutate;
            if (mutate != null) {
                if (this.h) {
                    i10 = this.f31639y;
                } else {
                    i10 = this.f31638x;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.W);
                this.H = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.G = null;
        }
        invalidate();
    }

    public void setIconProgress(float f10) {
        if (this.f31637w == f10) {
            return;
        }
        this.f31637w = f10;
        invalidate();
    }

    public void setOverrideColor(int i3) {
        if (this.f31629a0 != i3) {
            if (this.N == null) {
                try {
                    this.N = new Bitmap[2];
                    this.O = new Canvas[2];
                    for (int i10 = 0; i10 < 2; i10++) {
                        this.N[i10] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        this.O[i10] = new Canvas(this.N[i10]);
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
            this.f31629a0 = i3;
            this.R = 0.0f;
            this.S = 0.0f;
            this.T = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f31631c == f10) {
            return;
        }
        this.f31631c = f10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        this.L = 0;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            org.telegram.ui.Cells.y yVar = this.J;
            if (yVar == null || drawable != yVar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int a(int i3) {
        return i3;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnCheckedChangeListener(ww0 ww0Var) {
    }
}
