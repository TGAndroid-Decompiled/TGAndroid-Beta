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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.x20;
public class w2 extends FrameLayout {
    public String B;
    public int C;
    public boolean D;
    public int E;
    public final Paint F;
    public final Paint G;
    public float H;
    public boolean I;
    public float J;
    public org.telegram.ui.Cells.z K;
    public boolean L;
    public boolean M;
    public float N;
    public int O;
    public int P;
    public final float Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public float T;
    public final Paint f32443a;
    public boolean f32444b;
    public boolean f32445c;
    public boolean d;
    public final Drawable[] f32446e;
    public final FrameLayout f32447f;
    public final TextView[] h;
    public int f32448n;
    public int f32449r;
    public float f32450s;
    public ValueAnimator v;
    public int f32451w;
    public int f32452x;
    public int f32453y;

    public w2(Context context, float f10) {
        super(context);
        this.f32443a = new Paint(1);
        this.f32444b = true;
        this.f32445c = true;
        this.f32446e = new Drawable[2];
        this.h = new TextView[2];
        this.F = new Paint(1);
        this.G = new Paint(1);
        this.T = 1.0f;
        this.Q = f10;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32447f = frameLayout;
        addView(frameLayout);
        for (int i10 = 0; i10 < 2; i10++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f32447f.addView(textView, c6.d(-1, -2.0f, 0, 0.0f, f10 + 6.0f, 0.0f, 0.0f));
            this.h[i10] = textView;
        }
        this.h[1].setVisibility(8);
        this.G.setColor(-16777216);
        this.G.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.G.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.F.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.F.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i10, int i11) {
        this.O = i10;
        this.P = i11;
        this.f32448n = i0.a.d(this.N, i10, i11);
        invalidate();
    }

    public final void b(boolean z4, boolean z10) {
        if (this.M != z4) {
            this.M = z4;
            if (this.L) {
                float f10 = 0.0f;
                if (z10) {
                    ValueAnimator valueAnimator = this.R;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.R.cancel();
                    }
                    float f11 = this.N;
                    if (this.M) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.R = ofFloat;
                    ofFloat.addUpdateListener(new v2(this, 0));
                    this.R.addListener(new g91(this, 8));
                    this.R.setDuration(150L);
                    this.R.start();
                    return;
                }
                if (z4) {
                    f10 = 1.0f;
                }
                this.N = f10;
                a(this.O, this.P);
            }
        }
    }

    public final void c(int i10, int i11, int i12, float f10, boolean z4, String str, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        float f11;
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z11 = false;
        }
        if (this.f32451w == i10 && this.f32452x == i11 && ((this.L || this.f32453y == i12) && (str2 = this.B) != null && str2.equals(str) && z10 == this.I)) {
            return;
        }
        if (this.K == null || z4) {
            int alpha = Color.alpha(i12);
            float f12 = this.Q;
            if (alpha == 255 && AndroidUtilities.computePerceivedBrightness(i12) > 0.5d) {
                org.telegram.ui.Cells.z h02 = k6.h0(AndroidUtilities.dp(f12), 0, i0.a.k(-16777216, (int) (f10 * 25.5f)));
                this.K = h02;
                h02.setCallback(this);
            } else {
                org.telegram.ui.Cells.z h03 = k6.h0(AndroidUtilities.dp(f12), 0, i0.a.k(-1, (int) (f10 * 76.5f)));
                this.K = h03;
                h03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f32453y != i12) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = z12;
        if (this.f32451w == i10) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.D = z13;
        if (z13) {
            this.E = this.f32452x;
        }
        this.f32451w = i10;
        this.f32452x = i11;
        this.f32453y = i12;
        this.B = str;
        this.I = z10;
        Drawable[] drawableArr = this.f32446e;
        TextView[] textViewArr = this.h;
        if (!z11) {
            if (i10 != 0) {
                Drawable mutate = getContext().getDrawable(i10).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
            this.F.setColor(i11);
            if (!this.L) {
                this.f32448n = i12;
            }
            textViewArr[0].setText(str);
            if (this.I) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            this.H = f11;
            this.D = false;
            this.f32450s = 0.0f;
            invalidate();
            return;
        }
        if (!z13 && i10 != 0) {
            Drawable mutate2 = getContext().getDrawable(i10).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.L) {
            this.f32449r = i12;
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
        this.v = ofFloat;
        ofFloat.addUpdateListener(new eg.z0(9, this, z14));
        this.v.addListener(new x20(15, this, z14));
        this.v.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z4, boolean z10) {
        float f10 = 0.0f;
        FrameLayout frameLayout = this.f32447f;
        if (z10) {
            if (z4) {
                f10 = 1.0f;
            }
            if (frameLayout.getAlpha() != f10) {
                frameLayout.animate().alpha(f10).start();
                return;
            }
            return;
        }
        frameLayout.animate().cancel();
        if (z4) {
            f10 = 1.0f;
        }
        frameLayout.setAlpha(f10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.K;
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
        org.telegram.ui.Cells.z zVar = this.K;
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
        accessibilityNodeInfo.setText(this.B);
        if (this.L) {
            accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.M);
            return;
        }
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setCheckable(boolean z4) {
        this.L = z4;
    }

    public void setCrossOffset(float f10) {
        this.J = f10;
    }

    public void setDrawBackground(boolean z4) {
        this.f32444b = z4;
    }

    public void setDrawRipple(boolean z4) {
        this.f32445c = z4;
    }

    public void setPressedBtn(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.T;
        if (z4) {
            f10 = 0.8f;
        } else {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new v2(this, 1));
        this.S.setDuration(150L);
        this.S.start();
    }

    public void setTextSize(int i10) {
        for (int i11 = 0; i11 < 2; i11++) {
            this.h[i11].setTextSize(1, i10);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.K != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
