package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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

    public final ud.a f26538a;

    public final RectF f26539b;

    public float f26540c;
    public ObjectAnimator d;

    public ObjectAnimator f26541e;

    public boolean f26542f;
    public boolean h;

    public final Paint f26543n;

    public final Paint f26544r;

    public int f26545s;
    public float v;

    public int f26546w;

    public int f26547x;

    public int f26548y;

    public Switch(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26538a = new ud.a(0, new t0.c(this, 3), er.h, 380L, true);
        this.v = 1.0f;
        this.f26546w = org.telegram.ui.ActionBar.g6.f23302r7;
        this.f26547x = org.telegram.ui.ActionBar.g6.V6;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        this.f26548y = i10;
        this.A = i10;
        this.G = new int[]{16842910, 16842919};
        this.S = c6Var;
        this.f26539b = new RectF();
        this.f26543n = new Paint(1);
        Paint paint = new Paint(1);
        this.f26544r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        if (z10 != this.h) {
            this.h = z10;
            if (this.f26542f && z11) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
                this.d = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(200L);
                this.d.addListener(new dy0(this, 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                setProgress(z10 ? 1.0f : 0.0f);
            }
        }
        if (this.f26545s != i10) {
            this.f26545s = i10;
            if (this.f26542f && z11) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", i10 == 0 ? 1.0f : 0.0f);
                this.f26541e = objectAnimatorOfFloat2;
                objectAnimatorOfFloat2.setDuration(200L);
                this.f26541e.addListener(new dy0(this, 1));
                this.f26541e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.f26541e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.f26541e = null;
            }
            setIconProgress(i10 == 0 ? 1.0f : 0.0f);
        }
    }

    public final void c(boolean z10, boolean z11) {
        b(this.f26545s, z10, z11);
    }

    public final void d(int i10, int i11, int i12, int i13) {
        this.f26546w = i10;
        this.f26547x = i11;
        this.f26548y = i12;
        this.A = i13;
    }

    public float getIconProgress() {
        return this.v;
    }

    public float getProgress() {
        return this.f26540c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26542f = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26542f = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        Paint paint;
        Paint paint2;
        float f10;
        Paint paint3;
        Canvas canvas2;
        Paint paint4;
        org.telegram.ui.Cells.z zVar;
        Drawable drawable;
        if (getVisibility() != 0) {
            return;
        }
        int iDp = AndroidUtilities.dp(31.0f);
        AndroidUtilities.dp(20.0f);
        int i10 = 2;
        int measuredWidth = (getMeasuredWidth() - iDp) / 2;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dpf2(14.0f)) / 2.0f;
        int iDp2 = AndroidUtilities.dp(7.0f) + measuredWidth + ((int) (AndroidUtilities.dp(17.0f) * this.f26540c));
        int measuredHeight2 = getMeasuredHeight() / 2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            c6Var = this.S;
            paint = this.f26544r;
            float f11 = 1.0f;
            paint2 = this.f26543n;
            if (i12 >= i10) {
                break;
            }
            if (i12 == 1 && this.T == 0) {
                iDp = iDp;
            } else {
                Canvas canvas3 = i12 == 0 ? canvas : this.K[i11];
                if (i12 == 1) {
                    this.J[i11].eraseColor(i11);
                    paint2.setColor(-16777216);
                    this.M.drawRect(0.0f, 0.0f, this.L.getWidth(), this.L.getHeight(), paint2);
                    paint4 = paint2;
                    this.M.drawCircle(this.N - getX(), this.O - getY(), this.P, this.Q);
                } else {
                    paint4 = paint2;
                }
                int i13 = this.T;
                if (i13 == 1) {
                    if (i12 == 0) {
                        f11 = 0.0f;
                    }
                } else if (i13 != 2) {
                    f11 = this.f26540c;
                } else if (i12 != 0) {
                    f11 = 0.0f;
                }
                int iA = a(org.telegram.ui.ActionBar.g6.v0(this.f26546w, c6Var));
                int iA2 = a(org.telegram.ui.ActionBar.g6.v0(this.f26547x, c6Var));
                if (i12 == 0 && (drawable = this.B) != null) {
                    if (this.C != (this.h ? iA2 : iA)) {
                        int i14 = this.h ? iA2 : iA;
                        this.C = i14;
                        drawable.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.MULTIPLY));
                    }
                }
                int iRed = Color.red(iA);
                int iRed2 = Color.red(iA2);
                int iGreen = Color.green(iA);
                int iGreen2 = Color.green(iA2);
                int iBlue = Color.blue(iA);
                int iBlue2 = Color.blue(iA2);
                int iAlpha = Color.alpha(iA);
                int iAlpha2 = (((int) (((iBlue2 - iBlue) * f11) + iBlue)) & 255) | ((((int) (((Color.alpha(iA2) - iAlpha) * f11) + iAlpha)) & 255) << 24) | ((((int) (((iRed2 - iRed) * f11) + iRed)) & 255) << 16) | ((((int) (((iGreen2 - iGreen) * f11) + iGreen)) & 255) << 8);
                paint4.setColor(iAlpha2);
                paint.setColor(iAlpha2);
                float fDpf2 = AndroidUtilities.dpf2(14.0f) + measuredHeight;
                RectF rectF = this.f26539b;
                rectF.set(measuredWidth, measuredHeight, measuredWidth + iDp, fDpf2);
                canvas3.drawRoundRect(rectF, AndroidUtilities.dpf2(7.0f), AndroidUtilities.dpf2(7.0f), paint4);
                canvas3.drawCircle(iDp2, measuredHeight2, AndroidUtilities.dpf2(10.0f), paint4);
                if (i12 == 0 && (zVar = this.E) != null) {
                    zVar.setBounds(iDp2 - AndroidUtilities.dp(18.0f), measuredHeight2 - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f) + iDp2, AndroidUtilities.dp(18.0f) + measuredHeight2);
                    this.E.draw(canvas3);
                } else if (i12 == 1) {
                    canvas3.drawBitmap(this.L, 0.0f, 0.0f, this.R);
                }
            }
            i12++;
            iDp = iDp;
            i10 = 2;
            i11 = 0;
        }
        Paint paint5 = paint2;
        if (this.T != 0) {
            canvas.drawBitmap(this.J[0], 0.0f, 0.0f, (Paint) null);
        }
        int i15 = 0;
        while (i15 < 2) {
            if (i15 == 1 && this.T == 0) {
                paint5 = paint5;
                paint3 = paint;
            } else {
                Canvas canvas4 = i15 == 0 ? canvas : this.K[1];
                if (i15 == 1) {
                    this.J[1].eraseColor(0);
                }
                int i16 = this.T;
                if (i16 == 1) {
                    if (i15 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                } else if (i16 != 2) {
                    f10 = this.f26540c;
                } else if (i15 == 0) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                int iV0 = org.telegram.ui.ActionBar.g6.v0(this.f26548y, c6Var);
                int iA3 = a(org.telegram.ui.ActionBar.g6.v0(this.A, c6Var));
                int iRed3 = Color.red(iV0);
                int iRed4 = Color.red(iA3);
                int iGreen3 = Color.green(iV0);
                int iGreen4 = Color.green(iA3);
                int iBlue3 = Color.blue(iV0);
                int iBlue4 = Color.blue(iA3);
                int iAlpha3 = Color.alpha(iV0);
                float f12 = f10;
                paint5.setColor((((int) (((iBlue4 - iBlue3) * f12) + iBlue3)) & 255) | ((((int) (((iRed4 - iRed3) * f12) + iRed3)) & 255) << 16) | ((((int) (((Color.alpha(iA3) - iAlpha3) * f12) + iAlpha3)) & 255) << 24) | ((((int) (((iGreen4 - iGreen3) * f12) + iGreen3)) & 255) << 8));
                float f13 = iDp2;
                float f14 = measuredHeight2;
                canvas4.drawCircle(f13, f14, AndroidUtilities.dp(8.0f), paint5);
                if (i15 != 0) {
                    paint3 = paint;
                    canvas2 = canvas4;
                } else if (this.B != null) {
                    float f15 = this.f26538a.f48497e;
                    if (f15 > 0.0f) {
                        boolean z10 = f15 < 1.0f;
                        if (z10) {
                            canvas.save();
                            canvas.scale(f15, f15, f13, f14);
                        }
                        Drawable drawable2 = this.B;
                        drawable2.setBounds(org.telegram.messenger.rl.v(2, iDp2, drawable2), org.telegram.messenger.rl.e(2, measuredHeight2, this.B), org.telegram.messenger.rl.A(2, iDp2, this.B), org.telegram.messenger.rl.y(2, measuredHeight2, this.B));
                        this.B.draw(canvas4);
                        if (z10) {
                            canvas.restore();
                        }
                    }
                    paint3 = paint;
                    canvas2 = canvas4;
                } else {
                    int i17 = this.f26545s;
                    if (i17 == 1) {
                        iDp2 = (int) (f13 - (AndroidUtilities.dp(10.8f) - (AndroidUtilities.dp(1.3f) * this.f26540c)));
                        measuredHeight2 = (int) (f14 - (AndroidUtilities.dp(8.5f) - (AndroidUtilities.dp(0.5f) * this.f26540c)));
                        int iDpf2 = ((int) AndroidUtilities.dpf2(4.6f)) + iDp2;
                        int iDpf3 = (int) (AndroidUtilities.dpf2(9.5f) + measuredHeight2);
                        int iDp3 = AndroidUtilities.dp(2.0f) + iDpf2;
                        int iDp4 = AndroidUtilities.dp(2.0f) + iDpf3;
                        int iDpf4 = ((int) AndroidUtilities.dpf2(7.5f)) + iDp2;
                        int iDpf5 = ((int) AndroidUtilities.dpf2(5.4f)) + measuredHeight2;
                        int iDp5 = AndroidUtilities.dp(7.0f) + iDpf4;
                        int iDp6 = AndroidUtilities.dp(7.0f) + iDpf5;
                        float f16 = this.f26540c;
                        paint3 = paint;
                        canvas2 = canvas4;
                        canvas2.drawLine((int) (((iDpf2 - iDpf4) * f16) + iDpf4), (int) (((iDpf3 - iDpf5) * f16) + iDpf5), (int) (((iDp3 - iDp5) * f16) + iDp5), (int) (((iDp4 - iDp6) * f16) + iDp6), paint3);
                        int iDpf6 = ((int) AndroidUtilities.dpf2(7.5f)) + iDp2;
                        int iDpf7 = ((int) AndroidUtilities.dpf2(12.5f)) + measuredHeight2;
                        canvas2.drawLine(iDpf6, iDpf7, AndroidUtilities.dp(7.0f) + iDpf6, iDpf7 - AndroidUtilities.dp(7.0f), paint3);
                    } else {
                        paint5 = paint5;
                        Paint paint6 = paint;
                        canvas2 = canvas4;
                        if (i17 == 2 || this.f26541e != null) {
                            paint6.setAlpha((int) ((1.0f - this.v) * 255.0f));
                            paint3 = paint6;
                            canvas2.drawLine(f13, f14, f13, measuredHeight2 - AndroidUtilities.dp(5.0f), paint3);
                            canvas2.save();
                            canvas2.rotate(this.v * (-90.0f), f13, f14);
                            canvas2.drawLine(f13, f14, AndroidUtilities.dp(4.0f) + iDp2, f14, paint3);
                            canvas2.restore();
                        } else {
                            paint3 = paint6;
                        }
                    }
                }
                if (i15 == 1) {
                    canvas2.drawBitmap(this.L, 0.0f, 0.0f, this.R);
                }
                i15++;
                paint = paint3;
                paint5 = paint5;
            }
            i15++;
            paint = paint3;
            paint5 = paint5;
        }
        if (this.T != 0) {
            canvas.drawBitmap(this.J[1], 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.h);
    }

    public void setDrawIconType(int i10) {
        this.f26545s = i10;
    }

    public void setDrawRipple(boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (z10 == this.D) {
            return;
        }
        this.D = z10;
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setColor(-1);
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, i10 >= 23 ? null : new lh.v3(this, 5));
            this.E = zVar;
            if (i10 >= 23) {
                zVar.setRadius(AndroidUtilities.dp(18.0f));
            }
            this.E.setCallback(this);
        }
        boolean z11 = this.h;
        if ((z11 && this.H != 2) || (!z11 && this.H != 1)) {
            this.E.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.g6.v0(z11 ? org.telegram.ui.ActionBar.g6.T6 : org.telegram.ui.ActionBar.g6.S6, this.S))}));
            this.H = this.h ? 2 : 1;
        }
        if (i10 >= 28 && z10) {
            this.E.setHotspot(this.h ? 0.0f : AndroidUtilities.dp(100.0f), AndroidUtilities.dp(18.0f));
        }
        this.E.setState(z10 ? this.G : StateSet.NOTHING);
        invalidate();
    }

    public void setIcon(int i10) {
        if (i10 != 0) {
            Drawable drawableMutate = getResources().getDrawable(i10).mutate();
            this.B = drawableMutate;
            if (drawableMutate != null) {
                int iV0 = org.telegram.ui.ActionBar.g6.v0(this.h ? this.f26547x : this.f26546w, this.S);
                this.C = iV0;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.MULTIPLY));
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

    public void setOverrideColor(int i10) {
        if (this.T == i10) {
            return;
        }
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
        if (this.I) {
            this.T = i10;
            this.N = 0.0f;
            this.O = 0.0f;
            this.P = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f26540c == f10) {
            return;
        }
        this.f26540c = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        org.telegram.ui.Cells.z zVar = this.E;
        return zVar != null && drawable == zVar;
    }

    public int a(int i10) {
        return i10;
    }

    public void setOnCheckedChangeListener(ey0 ey0Var) {
    }
}
