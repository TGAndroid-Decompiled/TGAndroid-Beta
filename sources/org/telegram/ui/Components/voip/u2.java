package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f11;
import org.telegram.ui.go;

public class u2 extends FrameLayout {
    public String A;
    public int B;
    public boolean C;
    public int D;
    public final Paint E;
    public final Paint F;
    public float G;
    public boolean H;
    public float I;
    public org.telegram.ui.Cells.z J;
    public boolean K;
    public boolean L;
    public float M;
    public int N;
    public int O;
    public final float P;
    public ValueAnimator Q;
    public ValueAnimator R;
    public float S;

    public final Paint f33935a;

    public boolean f33936b;

    public boolean f33937c;
    public boolean d;

    public final Drawable[] f33938e;

    public final FrameLayout f33939f;
    public final TextView[] h;

    public int f33940n;

    public int f33941r;

    public float f33942s;
    public ValueAnimator v;

    public int f33943w;

    public int f33944x;

    public int f33945y;

    public u2(Context context, float f10) {
        super(context);
        this.f33935a = new Paint(1);
        this.f33936b = true;
        this.f33937c = true;
        this.f33938e = new Drawable[2];
        this.h = new TextView[2];
        this.E = new Paint(1);
        this.F = new Paint(1);
        this.S = 1.0f;
        this.P = f10;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33939f = frameLayout;
        addView(frameLayout);
        for (int i10 = 0; i10 < 2; i10++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f33939f.addView(textView, z5.d(-1, -2.0f, 0, 0.0f, f10 + 6.0f, 0.0f, 0.0f));
            this.h[i10] = textView;
        }
        this.h[1].setVisibility(8);
        this.F.setColor(-16777216);
        this.F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.F.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.E.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.E.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i10, int i11) {
        this.N = i10;
        this.O = i11;
        this.f33940n = i0.b.d(this.M, i10, i11);
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.L == z10) {
            return;
        }
        this.L = z10;
        if (this.K) {
            if (!z11) {
                this.M = z10 ? 1.0f : 0.0f;
                a(this.N, this.O);
                return;
            }
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Q.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.M, this.L ? 1.0f : 0.0f);
            this.Q = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new t2(this, 0));
            this.Q.addListener(new f11(this, 17));
            this.Q.setDuration(150L);
            this.Q.start();
        }
    }

    public final void c(int i10, int i11, int i12, float f10, boolean z10, String str, boolean z11, boolean z12) {
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z12 = false;
        }
        if (this.f33943w == i10 && this.f33944x == i11 && ((this.K || this.f33945y == i12) && (str2 = this.A) != null && str2.equals(str) && z11 == this.H)) {
            return;
        }
        if (this.J == null || z10) {
            int iAlpha = Color.alpha(i12);
            float f11 = this.P;
            if (iAlpha != 255 || AndroidUtilities.computePerceivedBrightness(i12) <= 0.5d) {
                org.telegram.ui.Cells.z zVarH0 = g6.h0(AndroidUtilities.dp(f11), 0, i0.b.k(-1, (int) (f10 * 76.5f)));
                this.J = zVarH0;
                zVarH0.setCallback(this);
            } else {
                org.telegram.ui.Cells.z zVarH1 = g6.h0(AndroidUtilities.dp(f11), 0, i0.b.k(-16777216, (int) (f10 * 25.5f)));
                this.J = zVarH1;
                zVarH1.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = this.f33945y != i12;
        boolean z13 = this.f33943w == i10;
        this.C = z13;
        if (z13) {
            this.D = this.f33944x;
        }
        this.f33943w = i10;
        this.f33944x = i11;
        this.f33945y = i12;
        this.A = str;
        this.H = z11;
        Drawable[] drawableArr = this.f33938e;
        TextView[] textViewArr = this.h;
        if (!z12) {
            if (i10 != 0) {
                Drawable drawableMutate = getContext().getDrawable(i10).mutate();
                drawableArr[0] = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
            this.E.setColor(i11);
            if (!this.K) {
                this.f33940n = i12;
            }
            textViewArr[0].setText(str);
            this.G = this.H ? 1.0f : 0.0f;
            this.C = false;
            this.f33942s = 0.0f;
            invalidate();
            return;
        }
        if (!z13 && i10 != 0) {
            Drawable drawableMutate2 = getContext().getDrawable(i10).mutate();
            drawableArr[1] = drawableMutate2;
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.K) {
            this.f33941r = i12;
        }
        boolean zEquals = textViewArr[0].getText().toString().equals(str);
        boolean z14 = !zEquals;
        if (zEquals) {
            textViewArr[0].setText(str);
        } else {
            textViewArr[1].setText(str);
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(0.0f);
            textViewArr[1].setScaleX(0.0f);
            textViewArr[1].setScaleY(0.0f);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ig.y(9, this, z14));
        this.v.addListener(new go(26, this, z14));
        this.v.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        FrameLayout frameLayout = this.f33939f;
        if (!z11) {
            frameLayout.animate().cancel();
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
        } else {
            float f10 = z10 ? 1.0f : 0.0f;
            if (frameLayout.getAlpha() != f10) {
                frameLayout.animate().alpha(f10).start();
            }
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.J;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    public View getTextView() {
        return this.h[0];
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.J;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        canvas.save();
        float f11 = this.S;
        float f12 = 2.0f;
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        boolean z10 = this.d;
        Paint paint = this.f33935a;
        if (z10) {
            float f13 = this.f33942s;
            if (f13 != 0.0f) {
                paint.setColor(i0.b.d(f13, this.f33940n, this.f33941r));
            } else {
                paint.setColor(this.f33940n);
            }
        } else {
            paint.setColor(this.f33940n);
        }
        float width = getWidth() / 2.0f;
        float f14 = this.P;
        float fDp = AndroidUtilities.dp(f14) / 2.0f;
        float fDp2 = AndroidUtilities.dp(f14) / 2.0f;
        if (this.f33936b) {
            canvas.drawCircle(width, fDp, fDp2, paint);
        }
        if (this.J == null) {
            org.telegram.ui.Cells.z zVarH0 = g6.h0(AndroidUtilities.dp(f14), 0, -16777216);
            this.J = zVarH0;
            zVarH0.setCallback(this);
        }
        if (this.f33937c) {
            this.J.setBounds((int) (width - fDp2), (int) (fDp - fDp2), (int) (width + fDp2), (int) (fDp2 + fDp));
            this.J.draw(canvas);
        }
        if (this.f33943w != 0) {
            boolean z11 = this.H;
            Paint paint2 = this.E;
            Drawable[] drawableArr = this.f33938e;
            if (!z11 && this.G == 0.0f) {
                int i10 = 0;
                while (true) {
                    if (i10 >= ((this.f33942s == 0.0f || this.C) ? 1 : 2)) {
                        break;
                    }
                    if (drawableArr[i10] != null) {
                        canvas.save();
                        float f15 = this.f33942s;
                        if (f15 == 0.0f || this.C || drawableArr[0] == null || drawableArr[1] == null) {
                            if (this.C) {
                                int iD = i0.b.d(f15, this.D, this.f33944x);
                                drawableArr[i10].setColorFilter(new PorterDuffColorFilter(iD, PorterDuff.Mode.MULTIPLY));
                                paint2.setColor(iD);
                            }
                            drawableArr[i10].setAlpha(255);
                        } else {
                            if (i10 == 0) {
                                f15 = 1.0f - f15;
                            }
                            canvas.scale(f15, f15, width, fDp);
                            drawableArr[i10].setAlpha((int) (f15 * 255.0f));
                        }
                        Drawable drawable = drawableArr[i10];
                        drawable.setBounds((int) (width - (drawable.getIntrinsicWidth() / f12)), (int) (fDp - (drawableArr[i10].getIntrinsicHeight() / f12)), (int) ((drawableArr[i10].getIntrinsicWidth() / f12) + width), (int) ((drawableArr[i10].getIntrinsicHeight() / 2.0f) + fDp));
                        drawableArr[i10].draw(canvas);
                        canvas.restore();
                    }
                    i10++;
                    f12 = 2.0f;
                }
            } else {
                if (this.C) {
                    int iD2 = i0.b.d(this.f33942s, this.D, this.f33944x);
                    drawableArr[0].setColorFilter(new PorterDuffColorFilter(iD2, PorterDuff.Mode.MULTIPLY));
                    paint2.setColor(iD2);
                }
                drawableArr[0].setAlpha(255);
                float f16 = this.f33942s;
                if (f16 != 0.0f && this.C) {
                    int iD3 = i0.b.d(f16, this.D, this.f33944x);
                    drawableArr[0].setColorFilter(new PorterDuffColorFilter(iD3, PorterDuff.Mode.MULTIPLY));
                    paint2.setColor(iD3);
                }
                drawableArr[0].setAlpha(255);
                boolean z12 = this.H;
                if (z12) {
                    float f17 = this.G;
                    if (f17 < 1.0f) {
                        float f18 = f17 + 0.08f;
                        this.G = f18;
                        if (f18 > 1.0f) {
                            this.G = 1.0f;
                        } else {
                            invalidate();
                        }
                    } else if (!z12) {
                        f10 = this.G - 0.08f;
                        this.G = f10;
                        if (f10 < 0.0f) {
                            this.G = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                } else if (!z12) {
                    f10 = this.G - 0.08f;
                    this.G = f10;
                    if (f10 < 0.0f) {
                        this.G = 0.0f;
                    } else {
                        invalidate();
                    }
                }
                if (this.G > 0.0f) {
                    int intrinsicWidth = (int) (width - (drawableArr[0].getIntrinsicWidth() / 2.0f));
                    int intrinsicHeight = (int) (fDp - (drawableArr[0].getIntrinsicHeight() / 2.0f));
                    float fDpf2 = AndroidUtilities.dpf2(8.0f) + intrinsicWidth + this.I;
                    float fDpf3 = AndroidUtilities.dpf2(8.0f) + intrinsicHeight;
                    float fDp3 = fDpf2 - AndroidUtilities.dp(1.0f);
                    float fDp4 = AndroidUtilities.dp(17.0f);
                    er erVar = er.f28122f;
                    float interpolation = (erVar.getInterpolation(this.G) * fDp4) + fDp3;
                    float interpolation2 = (erVar.getInterpolation(this.G) * AndroidUtilities.dp(17.0f)) + fDpf3;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    Drawable drawable2 = drawableArr[0];
                    drawable2.setBounds((int) (width - (drawable2.getIntrinsicWidth() / 2.0f)), (int) (fDp - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + fDp));
                    drawableArr[0].draw(canvas);
                    canvas.drawLine(fDpf2, fDpf3 - AndroidUtilities.dp(2.0f), interpolation, interpolation2 - AndroidUtilities.dp(2.0f), this.F);
                    canvas.drawLine(fDpf2, fDpf3, interpolation, interpolation2, paint2);
                    canvas.restore();
                } else {
                    Drawable drawable3 = drawableArr[0];
                    drawable3.setBounds((int) (width - (drawable3.getIntrinsicWidth() / 2.0f)), (int) (fDp - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + fDp));
                    drawableArr[0].draw(canvas);
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A);
        if (!this.K) {
            accessibilityNodeInfo.setClassName(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.L);
    }

    public void setCheckable(boolean z10) {
        this.K = z10;
    }

    public void setCrossOffset(float f10) {
        this.I = f10;
    }

    public void setDrawBackground(boolean z10) {
        this.f33936b = z10;
    }

    public void setDrawRipple(boolean z10) {
        this.f33937c = z10;
    }

    public void setPressedBtn(boolean z10) {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.S, z10 ? 0.8f : 1.0f);
        this.R = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new t2(this, 1));
        this.R.setDuration(150L);
        this.R.start();
    }

    public void setTextSize(int i10) {
        for (int i11 = 0; i11 < 2; i11++) {
            this.h[i11].setTextSize(1, i10);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.J == drawable || super.verifyDrawable(drawable);
    }
}
