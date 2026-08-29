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
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.z9;
public class x2 extends FrameLayout {
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
    public final Paint f34116a;
    public boolean f34117b;
    public boolean f34118c;
    public boolean d;
    public final Drawable[] f34119e;
    public final FrameLayout f34120f;
    public final TextView[] h;
    public int f34121n;
    public int f34122r;
    public float f34123s;
    public ValueAnimator v;
    public int f34124w;
    public int f34125x;
    public int f34126y;

    public x2(Context context, float f9) {
        super(context);
        this.f34116a = new Paint(1);
        this.f34117b = true;
        this.f34118c = true;
        this.f34119e = new Drawable[2];
        this.h = new TextView[2];
        this.E = new Paint(1);
        this.F = new Paint(1);
        this.S = 1.0f;
        this.P = f9;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34120f = frameLayout;
        addView(frameLayout);
        for (int i10 = 0; i10 < 2; i10++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f34120f.addView(textView, f6.d(-1, -2.0f, 0, 0.0f, f9 + 6.0f, 0.0f, 0.0f));
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
        this.f34121n = i0.a.d(this.M, i10, i11);
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.L != z10) {
            this.L = z10;
            if (this.K) {
                float f9 = 0.0f;
                if (z11) {
                    ValueAnimator valueAnimator = this.Q;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.Q.cancel();
                    }
                    float f10 = this.M;
                    if (this.L) {
                        f9 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
                    this.Q = ofFloat;
                    ofFloat.addUpdateListener(new w2(this, 0));
                    this.Q.addListener(new p11(this, 17));
                    this.Q.setDuration(150L);
                    this.Q.start();
                    return;
                }
                if (z10) {
                    f9 = 1.0f;
                }
                this.M = f9;
                a(this.N, this.O);
            }
        }
    }

    public final void c(int i10, int i11, int i12, float f9, boolean z10, String str, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        float f10;
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z12 = false;
        }
        if (this.f34124w == i10 && this.f34125x == i11 && ((this.K || this.f34126y == i12) && (str2 = this.A) != null && str2.equals(str) && z11 == this.H)) {
            return;
        }
        if (this.J == null || z10) {
            int alpha = Color.alpha(i12);
            float f11 = this.P;
            if (alpha == 255 && AndroidUtilities.computePerceivedBrightness(i12) > 0.5d) {
                org.telegram.ui.Cells.z h02 = g6.h0(AndroidUtilities.dp(f11), 0, i0.a.k(-16777216, (int) (f9 * 25.5f)));
                this.J = h02;
                h02.setCallback(this);
            } else {
                org.telegram.ui.Cells.z h03 = g6.h0(AndroidUtilities.dp(f11), 0, i0.a.k(-1, (int) (f9 * 76.5f)));
                this.J = h03;
                h03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f34126y != i12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.d = z13;
        if (this.f34124w == i10) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.C = z14;
        if (z14) {
            this.D = this.f34125x;
        }
        this.f34124w = i10;
        this.f34125x = i11;
        this.f34126y = i12;
        this.A = str;
        this.H = z11;
        Drawable[] drawableArr = this.f34119e;
        TextView[] textViewArr = this.h;
        if (!z12) {
            if (i10 != 0) {
                Drawable mutate = getContext().getDrawable(i10).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
            this.E.setColor(i11);
            if (!this.K) {
                this.f34121n = i12;
            }
            textViewArr[0].setText(str);
            if (this.H) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.G = f10;
            this.C = false;
            this.f34123s = 0.0f;
            invalidate();
            return;
        }
        if (!z14 && i10 != 0) {
            Drawable mutate2 = getContext().getDrawable(i10).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.K) {
            this.f34122r = i12;
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
        ofFloat.addUpdateListener(new bg.c1(10, this, z15));
        this.v.addListener(new z9(25, this, z15));
        this.v.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        float f9 = 0.0f;
        FrameLayout frameLayout = this.f34120f;
        if (z11) {
            if (z10) {
                f9 = 1.0f;
            }
            if (frameLayout.getAlpha() != f9) {
                frameLayout.animate().alpha(f9).start();
                return;
            }
            return;
        }
        frameLayout.animate().cancel();
        if (z10) {
            f9 = 1.0f;
        }
        frameLayout.setAlpha(f9);
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
    public final void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.x2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A);
        if (this.K) {
            accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.L);
            return;
        }
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setCheckable(boolean z10) {
        this.K = z10;
    }

    public void setCrossOffset(float f9) {
        this.I = f9;
    }

    public void setDrawBackground(boolean z10) {
        this.f34117b = z10;
    }

    public void setDrawRipple(boolean z10) {
        this.f34118c = z10;
    }

    public void setPressedBtn(boolean z10) {
        float f9;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.S;
        if (z10) {
            f9 = 0.8f;
        } else {
            f9 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.R = ofFloat;
        ofFloat.addUpdateListener(new w2(this, 1));
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
        if (this.J != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
