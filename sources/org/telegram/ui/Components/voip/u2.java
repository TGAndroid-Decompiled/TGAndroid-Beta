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
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.y11;
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
    public final Paint f33885a;
    public boolean f33886b;
    public boolean f33887c;
    public boolean d;
    public final Drawable[] f33888e;
    public final FrameLayout f33889f;
    public final TextView[] h;
    public int f33890n;
    public int f33891r;
    public float f33892s;
    public ValueAnimator v;
    public int f33893w;
    public int f33894x;
    public int f33895y;

    public u2(Context context, float f10) {
        super(context);
        this.f33885a = new Paint(1);
        this.f33886b = true;
        this.f33887c = true;
        this.f33888e = new Drawable[2];
        this.h = new TextView[2];
        this.E = new Paint(1);
        this.F = new Paint(1);
        this.S = 1.0f;
        this.P = f10;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33889f = frameLayout;
        addView(frameLayout);
        for (int i9 = 0; i9 < 2; i9++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f33889f.addView(textView, e6.d(-1, -2.0f, 0, 0.0f, f10 + 6.0f, 0.0f, 0.0f));
            this.h[i9] = textView;
        }
        this.h[1].setVisibility(8);
        this.F.setColor(-16777216);
        this.F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.F.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.E.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.E.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i9, int i10) {
        this.N = i9;
        this.O = i10;
        this.f33890n = i0.a.d(this.M, i9, i10);
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.L != z10) {
            this.L = z10;
            if (this.K) {
                float f10 = 0.0f;
                if (z11) {
                    ValueAnimator valueAnimator = this.Q;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.Q.cancel();
                    }
                    float f11 = this.M;
                    if (this.L) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.Q = ofFloat;
                    ofFloat.addUpdateListener(new t2(this, 0));
                    this.Q.addListener(new y11(this, 15));
                    this.Q.setDuration(150L);
                    this.Q.start();
                    return;
                }
                if (z10) {
                    f10 = 1.0f;
                }
                this.M = f10;
                a(this.N, this.O);
            }
        }
    }

    public final void c(int i9, int i10, int i11, float f10, boolean z10, String str, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        float f11;
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z12 = false;
        }
        if (this.f33893w == i9 && this.f33894x == i10 && ((this.K || this.f33895y == i11) && (str2 = this.A) != null && str2.equals(str) && z11 == this.H)) {
            return;
        }
        if (this.J == null || z10) {
            int alpha = Color.alpha(i11);
            float f12 = this.P;
            if (alpha == 255 && AndroidUtilities.computePerceivedBrightness(i11) > 0.5d) {
                org.telegram.ui.Cells.z h02 = f6.h0(AndroidUtilities.dp(f12), 0, i0.a.k(-16777216, (int) (f10 * 25.5f)));
                this.J = h02;
                h02.setCallback(this);
            } else {
                org.telegram.ui.Cells.z h03 = f6.h0(AndroidUtilities.dp(f12), 0, i0.a.k(-1, (int) (f10 * 76.5f)));
                this.J = h03;
                h03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f33895y != i11) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.d = z13;
        if (this.f33893w == i9) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.C = z14;
        if (z14) {
            this.D = this.f33894x;
        }
        this.f33893w = i9;
        this.f33894x = i10;
        this.f33895y = i11;
        this.A = str;
        this.H = z11;
        Drawable[] drawableArr = this.f33888e;
        TextView[] textViewArr = this.h;
        if (!z12) {
            if (i9 != 0) {
                Drawable mutate = getContext().getDrawable(i9).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
            this.E.setColor(i10);
            if (!this.K) {
                this.f33890n = i11;
            }
            textViewArr[0].setText(str);
            if (this.H) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            this.G = f11;
            this.C = false;
            this.f33892s = 0.0f;
            invalidate();
            return;
        }
        if (!z14 && i9 != 0) {
            Drawable mutate2 = getContext().getDrawable(i9).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.K) {
            this.f33891r = i11;
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
        ofFloat.addUpdateListener(new hg.y(9, this, z15));
        this.v.addListener(new u9(25, this, z15));
        this.v.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        float f10 = 0.0f;
        FrameLayout frameLayout = this.f33889f;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u2.onDraw(android.graphics.Canvas):void");
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

    public void setCrossOffset(float f10) {
        this.I = f10;
    }

    public void setDrawBackground(boolean z10) {
        this.f33886b = z10;
    }

    public void setDrawRipple(boolean z10) {
        this.f33887c = z10;
    }

    public void setPressedBtn(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.S;
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.R = ofFloat;
        ofFloat.addUpdateListener(new t2(this, 1));
        this.R.setDuration(150L);
        this.R.start();
    }

    public void setTextSize(int i9) {
        for (int i10 = 0; i10 < 2; i10++) {
            this.h[i10].setTextSize(1, i9);
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
