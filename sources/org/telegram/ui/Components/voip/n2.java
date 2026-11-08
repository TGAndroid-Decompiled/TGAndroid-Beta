package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.content.Context;
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
import c8.ha;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.va;
public class n2 extends FrameLayout {
    public int D;
    public String E;
    public int F;
    public boolean G;
    public int H;
    public final Paint I;
    public final Paint J;
    public float K;
    public boolean L;
    public float M;
    public org.telegram.ui.Cells.y N;
    public boolean O;
    public boolean P;
    public float Q;
    public int R;
    public int S;
    public final float T;
    public ValueAnimator U;
    public ValueAnimator V;
    public float W;
    public final Paint f39416a;
    public boolean f39417b;
    public boolean f39418c;
    public boolean d;
    public final Drawable[] f39419e;
    public final FrameLayout f39420f;
    public final TextView[] h;
    public int f39421n;
    public int f39422r;
    public float f39423s;
    public ValueAnimator f39424w;
    public int f39425x;
    public int f39426y;

    public n2(Context context, float f10) {
        super(context);
        this.f39416a = new Paint(1);
        this.f39417b = true;
        this.f39418c = true;
        this.f39419e = new Drawable[2];
        this.h = new TextView[2];
        this.I = new Paint(1);
        this.J = new Paint(1);
        this.W = 1.0f;
        this.T = f10;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39420f = frameLayout;
        addView(frameLayout);
        for (int i7 = 0; i7 < 2; i7++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f39420f.addView(textView, ha.d(-1, -2.0f, 0, 0.0f, f10 + 6.0f, 0.0f, 0.0f));
            this.h[i7] = textView;
        }
        this.h[1].setVisibility(8);
        this.J.setColor(-16777216);
        this.J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.J.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        this.I.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.I.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i7, int i10) {
        this.R = i7;
        this.S = i10;
        this.f39421n = i0.a.f(this.Q, i7, i10);
        invalidate();
    }

    public final void b(boolean z9, boolean z10) {
        if (this.P != z9) {
            this.P = z9;
            if (this.O) {
                float f10 = 0.0f;
                if (z10) {
                    ValueAnimator valueAnimator = this.U;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.U.cancel();
                    }
                    float f11 = this.Q;
                    if (this.P) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.U = ofFloat;
                    ofFloat.addUpdateListener(new m2(this, 0));
                    this.U.addListener(new va(this, 17));
                    this.U.setDuration(150L);
                    this.U.start();
                    return;
                }
                if (z9) {
                    f10 = 1.0f;
                }
                this.Q = f10;
                a(this.R, this.S);
            }
        }
    }

    public final void c(int i7, int i10, int i11, float f10, boolean z9, String str, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        float f11;
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z11 = false;
        }
        if (this.f39425x == i7 && this.f39426y == i10 && ((this.O || this.D == i11) && (str2 = this.E) != null && str2.equals(str) && z10 == this.L)) {
            return;
        }
        if (this.N == null || z9) {
            int alpha = Color.alpha(i11);
            float f12 = this.T;
            if (alpha == 255 && org.telegram.messenger.g0.B(i11) > 0.5d) {
                org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(f12), 0, i0.a.o(-16777216, (int) (f10 * 25.5f)));
                this.N = j02;
                j02.setCallback(this);
            } else {
                org.telegram.ui.Cells.y j03 = k6.j0(org.telegram.messenger.g0.L(f12), 0, i0.a.o(-1, (int) (f10 * 76.5f)));
                this.N = j03;
                j03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.f39424w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.D != i11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = z12;
        if (this.f39425x == i7) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.G = z13;
        if (z13) {
            this.H = this.f39426y;
        }
        this.f39425x = i7;
        this.f39426y = i10;
        this.D = i11;
        this.E = str;
        this.L = z10;
        Drawable[] drawableArr = this.f39419e;
        TextView[] textViewArr = this.h;
        if (!z11) {
            if (i7 != 0) {
                Drawable mutate = getContext().getDrawable(i7).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
            this.I.setColor(i10);
            if (!this.O) {
                this.f39421n = i11;
            }
            textViewArr[0].setText(str);
            if (this.L) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            this.K = f11;
            this.G = false;
            this.f39423s = 0.0f;
            invalidate();
            return;
        }
        if (!z13 && i7 != 0) {
            Drawable mutate2 = getContext().getDrawable(i7).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.O) {
            this.f39422r = i11;
        }
        boolean equals = textViewArr[0].getText().toString().equals(str);
        boolean z14 = !equals;
        if (equals) {
            textViewArr[0].setText(str);
        } else {
            textViewArr[1].setText(str);
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(0.0f);
            textViewArr[1].setScaleX(0.0f);
            textViewArr[1].setScaleY(0.0f);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39424w = ofFloat;
        ofFloat.addUpdateListener(new ch.u(9, this, z14));
        this.f39424w.addListener(new t9(26, this, z14));
        this.f39424w.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z9, boolean z10) {
        float f10 = 0.0f;
        FrameLayout frameLayout = this.f39420f;
        if (z10) {
            if (z9) {
                f10 = 1.0f;
            }
            if (frameLayout.getAlpha() != f10) {
                frameLayout.animate().alpha(f10).start();
                return;
            }
            return;
        }
        frameLayout.animate().cancel();
        if (z9) {
            f10 = 1.0f;
        }
        frameLayout.setAlpha(f10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.N;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    public View getTextView() {
        return this.h[0];
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.N;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.n2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.E);
        if (this.O) {
            accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.P);
            return;
        }
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setCheckable(boolean z9) {
        this.O = z9;
    }

    public void setCrossOffset(float f10) {
        this.M = f10;
    }

    public void setDrawBackground(boolean z9) {
        this.f39417b = z9;
    }

    public void setDrawRipple(boolean z9) {
        this.f39418c = z9;
    }

    public void setPressedBtn(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.W;
        if (z9) {
            f10 = 0.8f;
        } else {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.V = ofFloat;
        ofFloat.addUpdateListener(new m2(this, 1));
        this.V.setDuration(150L);
        this.V.start();
    }

    public void setTextSize(int i7) {
        for (int i10 = 0; i10 < 2; i10++) {
            this.h[i10].setTextSize(1, i7);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.N != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
