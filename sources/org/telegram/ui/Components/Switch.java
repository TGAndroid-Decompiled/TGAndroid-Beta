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
    public final org.telegram.ui.ActionBar.c6 V;
    public int W;
    public final me.b f24115a;
    public final RectF f24116b;
    public float f24117c;
    public ObjectAnimator d;
    public ObjectAnimator f24118e;
    public boolean f24119f;
    public boolean h;
    public final Paint f24120n;
    public final Paint f24121r;
    public int f24122s;
    public float v;
    public int f24123w;
    public int f24124x;
    public int f24125y;

    public Switch(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24115a = new me.b(0, new m4.x(this, 6), js.h, 380L, true);
        this.v = 1.0f;
        this.f24123w = org.telegram.ui.ActionBar.h6.f20820r7;
        this.f24124x = org.telegram.ui.ActionBar.h6.V6;
        int i10 = org.telegram.ui.ActionBar.h6.f20560d6;
        this.f24125y = i10;
        this.E = i10;
        this.J = new int[]{16842910, 16842919};
        this.V = c6Var;
        this.f24116b = new RectF();
        this.f24120n = new Paint(1);
        Paint paint = new Paint(1);
        this.f24121r = paint;
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
            if (this.f24119f && z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f10);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new b01(this, 0));
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
        if (this.f24122s != i10) {
            this.f24122s = i10;
            if (this.f24119f && z11) {
                if (i10 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", f11);
                this.f24118e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.f24118e.addListener(new b01(this, 1));
                this.f24118e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.f24118e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.f24118e = null;
            }
            if (i10 == 0) {
                f11 = 1.0f;
            }
            setIconProgress(f11);
        }
    }

    public final void c(boolean z10, boolean z11) {
        b(this.f24122s, z10, z11);
    }

    public final void d(int i10, int i11, int i12, int i13) {
        this.f24123w = i10;
        this.f24124x = i11;
        this.f24125y = i12;
        this.E = i13;
    }

    public float getIconProgress() {
        return this.v;
    }

    public float getProgress() {
        return this.f24117c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24119f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24119f = false;
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
        this.f24122s = i10;
    }

    public void setDrawRipple(boolean z10) {
        int[] iArr;
        float dp;
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
            rippleDrawable.setRadius(AndroidUtilities.dp(18.0f));
            this.I.setCallback(this);
        }
        boolean z11 = this.h;
        if ((z11 && this.K != 2) || (!z11 && this.K != 1)) {
            if (z11) {
                i10 = org.telegram.ui.ActionBar.h6.T6;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.S6;
            }
            this.I.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.h6.w0(i10, this.V))}));
            if (this.h) {
                i12 = 2;
            }
            this.K = i12;
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
            iArr = this.J;
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
                    i11 = this.f24124x;
                } else {
                    i11 = this.f24123w;
                }
                int w02 = org.telegram.ui.ActionBar.h6.w0(i11, this.V);
                this.G = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
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
        if (this.f24117c == f7) {
            return;
        }
        this.f24117c = f7;
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

    public void setOnCheckedChangeListener(c01 c01Var) {
    }
}
