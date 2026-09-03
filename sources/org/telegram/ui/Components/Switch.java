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
    public int B;
    public Drawable C;
    public int D;
    public boolean E;
    public org.telegram.ui.Cells.z F;
    public Paint G;
    public final int[] H;
    public int I;
    public boolean J;
    public Bitmap[] K;
    public Canvas[] L;
    public Bitmap M;
    public Canvas N;
    public float O;
    public float P;
    public float Q;
    public Paint R;
    public Paint S;
    public final org.telegram.ui.ActionBar.f6 T;
    public int U;
    public final xd.a f23155a;
    public final RectF f23156b;
    public float f23157c;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public boolean f23158f;
    public boolean h;
    public final Paint f23159n;
    public final Paint f23160r;
    public int f23161s;
    public float v;
    public int f23162w;
    public int f23163x;
    public int f23164y;

    public Switch(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23155a = new xd.a(0, new ph.z8(this, 22), mr.h, 380L, true);
        this.v = 1.0f;
        this.f23162w = org.telegram.ui.ActionBar.j6.f20133r7;
        this.f23163x = org.telegram.ui.ActionBar.j6.V6;
        int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        this.f23164y = i10;
        this.B = i10;
        this.H = new int[]{16842910, 16842919};
        this.T = f6Var;
        this.f23156b = new RectF();
        this.f23159n = new Paint(1);
        Paint paint = new Paint(1);
        this.f23160r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i10, boolean z4, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        float f12 = 0.0f;
        if (z4 != this.h) {
            this.h = z4;
            if (this.f23158f && z10) {
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", f11);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new xy0(this, 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                setProgress(f10);
            }
        }
        if (this.f23161s != i10) {
            this.f23161s = i10;
            if (this.f23158f && z10) {
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f12 = 1.0f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", f12);
                this.e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.e.addListener(new xy0(this, 1));
                this.e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.e = null;
            }
            if (i10 == 0) {
                f12 = 1.0f;
            }
            setIconProgress(f12);
        }
    }

    public final void c(boolean z4, boolean z10) {
        b(this.f23161s, z4, z10);
    }

    public final void d(int i10, int i11, int i12, int i13) {
        this.f23162w = i10;
        this.f23163x = i11;
        this.f23164y = i12;
        this.B = i13;
    }

    public float getIconProgress() {
        return this.v;
    }

    public float getProgress() {
        return this.f23157c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23158f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23158f = false;
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
        this.f23161s = i10;
    }

    public void setDrawRipple(boolean z4) {
        int[] iArr;
        float dp;
        int i10;
        dg.k1 k1Var;
        int i11 = Build.VERSION.SDK_INT;
        if (z4 == this.E) {
            return;
        }
        this.E = z4;
        int i12 = 1;
        if (this.F == null) {
            Paint paint = new Paint(1);
            this.G = paint;
            paint.setColor(-1);
            if (i11 >= 23) {
                k1Var = null;
            } else {
                k1Var = new dg.k1(this, 5);
            }
            ?? rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, k1Var);
            this.F = rippleDrawable;
            if (i11 >= 23) {
                rippleDrawable.setRadius(AndroidUtilities.dp(18.0f));
            }
            this.F.setCallback(this);
        }
        boolean z10 = this.h;
        if ((z10 && this.I != 2) || (!z10 && this.I != 1)) {
            if (z10) {
                i10 = org.telegram.ui.ActionBar.j6.T6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.S6;
            }
            this.F.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.j6.v0(i10, this.T))}));
            if (this.h) {
                i12 = 2;
            }
            this.I = i12;
        }
        if (i11 >= 28 && z4) {
            org.telegram.ui.Cells.z zVar = this.F;
            if (this.h) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(100.0f);
            }
            zVar.setHotspot(dp, AndroidUtilities.dp(18.0f));
        }
        org.telegram.ui.Cells.z zVar2 = this.F;
        if (z4) {
            iArr = this.H;
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
            this.C = mutate;
            if (mutate != null) {
                if (this.h) {
                    i11 = this.f23163x;
                } else {
                    i11 = this.f23162w;
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, this.T);
                this.D = v02;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.C = null;
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

    public void setOverrideColor(int i10) {
        if (this.U != i10) {
            if (this.K == null) {
                try {
                    this.K = new Bitmap[2];
                    this.L = new Canvas[2];
                    for (int i11 = 0; i11 < 2; i11++) {
                        this.K[i11] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        this.L[i11] = new Canvas(this.K[i11]);
                    }
                    this.M = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.N = new Canvas(this.M);
                    Paint paint = new Paint(1);
                    this.R = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    this.S = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.J = true;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (!this.J) {
                return;
            }
            this.U = i10;
            this.O = 0.0f;
            this.P = 0.0f;
            this.Q = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f23157c == f10) {
            return;
        }
        this.f23157c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            org.telegram.ui.Cells.z zVar = this.F;
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

    public void setOnCheckedChangeListener(yy0 yy0Var) {
    }
}
