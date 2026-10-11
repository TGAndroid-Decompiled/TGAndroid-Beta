package org.telegram.ui.Components.voip;

import ai.cb;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ea;
import org.telegram.ui.Components.k91;
import w7.x5;
public class w2 extends FrameLayout {
    public String E;
    public int F;
    public boolean G;
    public int H;
    public final Paint I;
    public final Paint J;
    public float K;
    public boolean L;
    public float M;
    public org.telegram.ui.Cells.z N;
    public boolean O;
    public boolean P;
    public float Q;
    public int R;
    public int S;
    public final float T;
    public ValueAnimator U;
    public ValueAnimator V;
    public float W;
    public final Paint f32385a;
    public boolean f32386b;
    public boolean f32387c;
    public boolean d;
    public final Drawable[] f32388e;
    public final FrameLayout f32389f;
    public final TextView[] h;
    public int f32390n;
    public int f32391r;
    public float f32392s;
    public ValueAnimator v;
    public int f32393w;
    public int f32394x;
    public int f32395y;

    public w2(Context context, float f7) {
        super(context);
        this.f32385a = new Paint(1);
        this.f32386b = true;
        this.f32387c = true;
        this.f32388e = new Drawable[2];
        this.h = new TextView[2];
        this.I = new Paint(1);
        this.J = new Paint(1);
        this.W = 1.0f;
        this.T = f7;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32389f = frameLayout;
        addView(frameLayout);
        for (int i10 = 0; i10 < 2; i10++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f32389f.addView(textView, x5.a(-2.0f, 0.0f, f7 + 6.0f, 0.0f, 0.0f, -1, 0));
            this.h[i10] = textView;
        }
        this.h[1].setVisibility(8);
        this.J.setColor(-16777216);
        this.J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.J.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.I.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.I.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i10, int i11) {
        this.R = i10;
        this.S = i11;
        this.f32390n = i0.a.d(this.Q, i10, i11);
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.P != z10) {
            this.P = z10;
            if (this.O) {
                float f7 = 0.0f;
                if (z11) {
                    ValueAnimator valueAnimator = this.U;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.U.cancel();
                    }
                    float f10 = this.Q;
                    if (this.P) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.U = ofFloat;
                    ofFloat.addUpdateListener(new v2(this, 0));
                    this.U.addListener(new k91(this, 10));
                    this.U.setDuration(150L);
                    this.U.start();
                    return;
                }
                if (z10) {
                    f7 = 1.0f;
                }
                this.Q = f7;
                a(this.R, this.S);
            }
        }
    }

    public final void c(int i10, int i11, int i12, float f7, boolean z10, String str, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        float f10;
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z12 = false;
        }
        if (this.f32393w == i10 && this.f32394x == i11 && ((this.O || this.f32395y == i12) && (str2 = this.E) != null && str2.equals(str) && z11 == this.L)) {
            return;
        }
        if (this.N == null || z10) {
            int alpha = Color.alpha(i12);
            float f11 = this.T;
            if (alpha == 255 && AndroidUtilities.computePerceivedBrightness(i12) > 0.5d) {
                org.telegram.ui.Cells.z i02 = h6.i0(AndroidUtilities.dp(f11), 0, i0.a.k(-16777216, (int) (f7 * 25.5f)));
                this.N = i02;
                i02.setCallback(this);
            } else {
                org.telegram.ui.Cells.z i03 = h6.i0(AndroidUtilities.dp(f11), 0, i0.a.k(-1, (int) (f7 * 76.5f)));
                this.N = i03;
                i03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f32395y != i12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.d = z13;
        if (this.f32393w == i10) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.G = z14;
        if (z14) {
            this.H = this.f32394x;
        }
        this.f32393w = i10;
        this.f32394x = i11;
        this.f32395y = i12;
        this.E = str;
        this.L = z11;
        Drawable[] drawableArr = this.f32388e;
        TextView[] textViewArr = this.h;
        if (!z12) {
            if (i10 != 0) {
                Drawable mutate = getContext().getDrawable(i10).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
            this.I.setColor(i11);
            if (!this.O) {
                this.f32390n = i12;
            }
            textViewArr[0].setText(str);
            if (this.L) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.K = f10;
            this.G = false;
            this.f32392s = 0.0f;
            invalidate();
            return;
        }
        if (!z14 && i10 != 0) {
            Drawable mutate2 = getContext().getDrawable(i10).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.O) {
            this.f32391r = i12;
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
        this.v = ofFloat;
        ofFloat.addUpdateListener(new cb(8, this, z15));
        this.v.addListener(new ea(25, this, z15));
        this.v.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        float f7 = 0.0f;
        FrameLayout frameLayout = this.f32389f;
        if (z11) {
            if (z10) {
                f7 = 1.0f;
            }
            if (frameLayout.getAlpha() != f7) {
                frameLayout.animate().alpha(f7).start();
                return;
            }
            return;
        }
        frameLayout.animate().cancel();
        if (z10) {
            f7 = 1.0f;
        }
        frameLayout.setAlpha(f7);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.N;
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
        org.telegram.ui.Cells.z zVar = this.N;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.w2.onDraw(android.graphics.Canvas):void");
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

    public void setCheckable(boolean z10) {
        this.O = z10;
    }

    public void setCrossOffset(float f7) {
        this.M = f7;
    }

    public void setDrawBackground(boolean z10) {
        this.f32386b = z10;
    }

    public void setDrawRipple(boolean z10) {
        this.f32387c = z10;
    }

    public void setPressedBtn(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.W;
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.V = ofFloat;
        ofFloat.addUpdateListener(new v2(this, 1));
        this.V.setDuration(150L);
        this.V.start();
    }

    public void setTextSize(int i10) {
        for (int i11 = 0; i11 < 2; i11++) {
            this.h[i11].setTextSize(1, i10);
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
