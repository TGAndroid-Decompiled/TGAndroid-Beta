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
import c8.ma;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.on;
public class q2 extends FrameLayout {
    public int E;
    public String F;
    public int G;
    public boolean H;
    public int I;
    public final Paint J;
    public final Paint K;
    public float L;
    public boolean M;
    public float N;
    public org.telegram.ui.Cells.y O;
    public boolean P;
    public boolean Q;
    public float R;
    public int S;
    public int T;
    public final float U;
    public ValueAnimator V;
    public ValueAnimator W;
    public final Paint f41296a;
    public float f41297a0;
    public boolean f41298b;
    public boolean f41299c;
    public boolean d;
    public final Drawable[] f41300e;
    public final FrameLayout f41301f;
    public final TextView[] h;
    public int f41302n;
    public int f41303r;
    public float f41304s;
    public ValueAnimator f41305w;
    public int f41306x;
    public int f41307y;

    public q2(Context context, float f10) {
        super(context);
        this.f41296a = new Paint(1);
        this.f41298b = true;
        this.f41299c = true;
        this.f41300e = new Drawable[2];
        this.h = new TextView[2];
        this.J = new Paint(1);
        this.K = new Paint(1);
        this.f41297a0 = 1.0f;
        this.U = f10;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41301f = frameLayout;
        addView(frameLayout);
        for (int i7 = 0; i7 < 2; i7++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f41301f.addView(textView, ma.d(-1, -2.0f, 0, 0.0f, f10 + 6.0f, 0.0f, 0.0f));
            this.h[i7] = textView;
        }
        this.h[1].setVisibility(8);
        this.K.setColor(-16777216);
        this.K.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.K.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        this.J.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.J.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i7, int i10) {
        this.S = i7;
        this.T = i10;
        this.f41302n = i0.a.f(this.R, i7, i10);
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.Q != z10) {
            this.Q = z10;
            if (this.P) {
                float f10 = 0.0f;
                if (z11) {
                    ValueAnimator valueAnimator = this.V;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.V.cancel();
                    }
                    float f11 = this.R;
                    if (this.Q) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.V = ofFloat;
                    ofFloat.addUpdateListener(new p2(this, 0));
                    this.V.addListener(new y9(this, 18));
                    this.V.setDuration(150L);
                    this.V.start();
                    return;
                }
                if (z10) {
                    f10 = 1.0f;
                }
                this.R = f10;
                a(this.S, this.T);
            }
        }
    }

    public final void c(int i7, int i10, int i11, float f10, boolean z10, String str, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        float f11;
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z12 = false;
        }
        if (this.f41306x == i7 && this.f41307y == i10 && ((this.P || this.E == i11) && (str2 = this.F) != null && str2.equals(str) && z11 == this.M)) {
            return;
        }
        if (this.O == null || z10) {
            int alpha = Color.alpha(i11);
            float f12 = this.U;
            if (alpha == 255 && org.telegram.messenger.g0.B(i11) > 0.5d) {
                org.telegram.ui.Cells.y j02 = m6.j0(org.telegram.messenger.g0.L(f12), 0, i0.a.o(-16777216, (int) (f10 * 25.5f)));
                this.O = j02;
                j02.setCallback(this);
            } else {
                org.telegram.ui.Cells.y j03 = m6.j0(org.telegram.messenger.g0.L(f12), 0, i0.a.o(-1, (int) (f10 * 76.5f)));
                this.O = j03;
                j03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.f41305w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.E != i11) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.d = z13;
        if (this.f41306x == i7) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.H = z14;
        if (z14) {
            this.I = this.f41307y;
        }
        this.f41306x = i7;
        this.f41307y = i10;
        this.E = i11;
        this.F = str;
        this.M = z11;
        Drawable[] drawableArr = this.f41300e;
        TextView[] textViewArr = this.h;
        if (!z12) {
            if (i7 != 0) {
                Drawable mutate = getContext().getDrawable(i7).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
            this.J.setColor(i10);
            if (!this.P) {
                this.f41302n = i11;
            }
            textViewArr[0].setText(str);
            if (this.M) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            this.L = f11;
            this.H = false;
            this.f41304s = 0.0f;
            invalidate();
            return;
        }
        if (!z14 && i7 != 0) {
            Drawable mutate2 = getContext().getDrawable(i7).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.P) {
            this.f41303r = i11;
        }
        boolean equals = textViewArr[0].getText().toString().equals(str);
        boolean z15 = !equals;
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
        this.f41305w = ofFloat;
        ofFloat.addUpdateListener(new ch.v(9, this, z15));
        this.f41305w.addListener(new on(27, this, z15));
        this.f41305w.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        float f10 = 0.0f;
        FrameLayout frameLayout = this.f41301f;
        if (z11) {
            if (z10) {
                f10 = 1.0f;
            }
            if (frameLayout.getAlpha() != f10) {
                frameLayout.animate().alpha(f10).start();
                return;
            }
            return;
        }
        frameLayout.animate().cancel();
        if (z10) {
            f10 = 1.0f;
        }
        frameLayout.setAlpha(f10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.O;
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
        org.telegram.ui.Cells.y yVar = this.O;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.q2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.F);
        if (this.P) {
            accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.Q);
            return;
        }
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setCheckable(boolean z10) {
        this.P = z10;
    }

    public void setCrossOffset(float f10) {
        this.N = f10;
    }

    public void setDrawBackground(boolean z10) {
        this.f41298b = z10;
    }

    public void setDrawRipple(boolean z10) {
        this.f41299c = z10;
    }

    public void setPressedBtn(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f41297a0;
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new p2(this, 1));
        this.W.setDuration(150L);
        this.W.start();
    }

    public void setTextSize(int i7) {
        for (int i10 = 0; i10 < 2; i10++) {
            this.h[i10].setTextSize(1, i7);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.O != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
