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
public class Switch extends View implements org.telegram.ui.ActionBar.k6 {
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
    public final org.telegram.ui.ActionBar.p6 V;
    public int W;
    public final fe.b f24197a;
    public final RectF f24198b;
    public float f24199c;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public boolean f24200f;
    public boolean h;
    public final Paint f24201n;
    public final Paint f24202r;
    public int f24203s;
    public float f24204w;
    public int f24205x;
    public int f24206y;

    public Switch(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f24197a = new fe.b(0, new a1.c(this, 22), gr.h, 380L, true);
        this.f24204w = 1.0f;
        this.f24205x = org.telegram.ui.ActionBar.t6.f21187r7;
        this.f24206y = org.telegram.ui.ActionBar.t6.V6;
        int i10 = org.telegram.ui.ActionBar.t6.f20929d6;
        this.D = i10;
        this.E = i10;
        this.J = new int[]{16842910, 16842919};
        this.V = p6Var;
        this.f24198b = new RectF();
        this.f24201n = new Paint(1);
        Paint paint = new Paint(1);
        this.f24202r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        float f10;
        float f11 = 0.0f;
        if (z10 != this.h) {
            this.h = z10;
            if (this.f24200f && z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new zx0(this, 0));
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
        if (this.f24203s != i10) {
            this.f24203s = i10;
            if (this.f24200f && z11) {
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
                this.e.addListener(new zx0(this, 1));
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
        b(this.f24203s, z10, z11);
    }

    public final void d(int i10, int i11, int i12, int i13) {
        this.f24205x = i10;
        this.f24206y = i11;
        this.D = i12;
        this.E = i13;
    }

    public float getIconProgress() {
        return this.f24204w;
    }

    public float getProgress() {
        return this.f24199c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24200f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24200f = false;
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
        this.f24203s = i10;
    }

    public void setDrawRipple(boolean z10) {
        int[] iArr;
        float L;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (z10 == this.H) {
            return;
        }
        this.H = z10;
        int i12 = 1;
        if (this.I == null) {
            new Paint(1).setColor(-1);
            ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, null);
            this.I = rippleDrawable;
            rippleDrawable.setRadius(org.telegram.messenger.i0.L(18.0f));
            this.I.setCallback(this);
        }
        boolean z11 = this.h;
        if ((z11 && this.K != 2) || (!z11 && this.K != 1)) {
            if (z11) {
                i10 = org.telegram.ui.ActionBar.t6.T6;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.S6;
            }
            this.I.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.t6.w0(i10, this.V))}));
            if (this.h) {
                i12 = 2;
            }
            this.K = i12;
        }
        if (i11 >= 28 && z10) {
            org.telegram.ui.Cells.y yVar = this.I;
            if (this.h) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(100.0f);
            }
            yVar.setHotspot(L, org.telegram.messenger.i0.L(18.0f));
        }
        org.telegram.ui.Cells.y yVar2 = this.I;
        if (z10) {
            iArr = this.J;
        } else {
            iArr = StateSet.NOTHING;
        }
        yVar2.setState(iArr);
        invalidate();
    }

    public void setIcon(int i10) {
        int i11;
        if (i10 != 0) {
            Drawable mutate = getResources().getDrawable(i10).mutate();
            this.F = mutate;
            if (mutate != null) {
                if (this.h) {
                    i11 = this.f24206y;
                } else {
                    i11 = this.f24205x;
                }
                int w02 = org.telegram.ui.ActionBar.t6.w0(i11, this.V);
                this.G = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.F = null;
        }
        invalidate();
    }

    public void setIconProgress(float f7) {
        if (this.f24204w == f7) {
            return;
        }
        this.f24204w = f7;
        invalidate();
    }

    public void setOverrideColor(int i10) {
        if (this.W != i10) {
            if (this.M == null) {
                try {
                    this.M = new Bitmap[2];
                    this.N = new Canvas[2];
                    for (int i11 = 0; i11 < 2; i11++) {
                        this.M[i11] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        this.N[i11] = new Canvas(this.M[i11]);
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
            this.W = i10;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f24199c == f7) {
            return;
        }
        this.f24199c = f7;
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

    public int a(int i10) {
        return i10;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnCheckedChangeListener(ay0 ay0Var) {
    }
}
