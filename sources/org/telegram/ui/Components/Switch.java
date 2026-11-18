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
public class Switch extends View implements org.telegram.ui.ActionBar.c6 {
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
    public final org.telegram.ui.ActionBar.i6 W;
    public final te.a f33132a;
    public int f33133a0;
    public final RectF f33134b;
    public float f33135c;
    public ObjectAnimator d;
    public ObjectAnimator f33136e;
    public boolean f33137f;
    public boolean h;
    public final Paint f33138n;
    public final Paint f33139r;
    public int f33140s;
    public float f33141w;
    public int f33142x;
    public int f33143y;

    public Switch(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f33132a = new te.a(0, new org.telegram.ui.ActionBar.p(this, 25), lr.h, 380L, true);
        this.f33141w = 1.0f;
        this.f33142x = org.telegram.ui.ActionBar.n6.f29656r7;
        this.f33143y = org.telegram.ui.ActionBar.n6.V6;
        int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
        this.E = i7;
        this.F = i7;
        this.K = new int[]{16842910, 16842919};
        this.W = i6Var;
        this.f33134b = new RectF();
        this.f33138n = new Paint(1);
        Paint paint = new Paint(1);
        this.f33139r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i7, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        float f12 = 0.0f;
        if (z10 != this.h) {
            this.h = z10;
            if (this.f33137f && z11) {
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f11);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new fx0(this, 0));
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
        if (this.f33140s != i7) {
            this.f33140s = i7;
            if (this.f33137f && z11) {
                if (i7 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", f12);
                this.f33136e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.f33136e.addListener(new fx0(this, 1));
                this.f33136e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.f33136e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.f33136e = null;
            }
            if (i7 == 0) {
                f12 = 1.0f;
            }
            setIconProgress(f12);
        }
    }

    public final void c(boolean z10, boolean z11) {
        b(this.f33140s, z10, z11);
    }

    public final void d(int i7, int i10, int i11, int i12) {
        this.f33142x = i7;
        this.f33143y = i10;
        this.E = i11;
        this.F = i12;
    }

    public float getIconProgress() {
        return this.f33141w;
    }

    public float getProgress() {
        return this.f33135c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33137f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33137f = false;
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
        this.f33140s = i7;
    }

    public void setDrawRipple(boolean z10) {
        int[] iArr;
        float L;
        int i7;
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
                i7 = org.telegram.ui.ActionBar.n6.T6;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.S6;
            }
            this.J.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.n6.w0(i7, this.W))}));
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

    public void setIcon(int i7) {
        int i10;
        if (i7 != 0) {
            Drawable mutate = getResources().getDrawable(i7).mutate();
            this.G = mutate;
            if (mutate != null) {
                if (this.h) {
                    i10 = this.f33143y;
                } else {
                    i10 = this.f33142x;
                }
                int w02 = org.telegram.ui.ActionBar.n6.w0(i10, this.W);
                this.H = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.G = null;
        }
        invalidate();
    }

    public void setIconProgress(float f10) {
        if (this.f33141w == f10) {
            return;
        }
        this.f33141w = f10;
        invalidate();
    }

    public void setOverrideColor(int i7) {
        if (this.f33133a0 != i7) {
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
            this.f33133a0 = i7;
            this.R = 0.0f;
            this.S = 0.0f;
            this.T = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f33135c == f10) {
            return;
        }
        this.f33135c = f10;
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

    public int a(int i7) {
        return i7;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnCheckedChangeListener(gx0 gx0Var) {
    }
}
