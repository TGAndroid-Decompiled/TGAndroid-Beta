package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b10 extends FrameLayout {
    public final int f24841a = 0;
    public boolean f24842b;
    public final Object f24843c;
    public Object d;
    public final KeyEvent.Callback f24844e;

    public b10(d10 d10Var, Activity activity) {
        super(activity);
        this.f24844e = d10Var;
        this.f24843c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((y80) this.f24844e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(hs.f27119g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new t8(this, 26));
        animatorSet.start();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        int min;
        switch (this.f24841a) {
            case 0:
                RectF rectF = (RectF) this.f24843c;
                d10 d10Var = (d10) this.f24844e;
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int I = ((d10Var.h - d10.I(d10Var)) - AndroidUtilities.dp(8.0f)) + AndroidUtilities.statusBarHeight;
                boolean z12 = false;
                if (this.f24842b) {
                    int o9 = d10.o(d10Var) + I;
                    int i11 = AndroidUtilities.statusBarHeight;
                    int i12 = i11 * 2;
                    if (o9 < i12) {
                        I -= Math.min(i11, (i12 - I) - d10.p(d10Var));
                        f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f7 = 1.0f;
                    }
                    int q6 = d10.q(d10Var) + I;
                    int i13 = AndroidUtilities.statusBarHeight;
                    if (q6 < i13) {
                        i10 = Math.min(i13, (i13 - I) - d10.r(d10Var));
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                    f7 = 1.0f;
                }
                d10.s(d10Var).setBounds(0, I, getMeasuredWidth(), getMeasuredHeight());
                d10.t(d10Var).draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.i6.f21086t0.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false));
                    rectF.set(d10.u(d10Var), d10.v(d10Var) + I, getMeasuredWidth() - d10.w(d10Var), AndroidUtilities.dp(24.0f) + d10.y(d10Var) + I);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.i6.f21086t0);
                }
                if (i10 > 0) {
                    org.telegram.ui.ActionBar.i6.f21086t0.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false));
                    canvas.drawRect(d10.z(d10Var), AndroidUtilities.statusBarHeight - i10, getMeasuredWidth() - d10.B(d10Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.i6.f21086t0);
                }
                if (i10 > AndroidUtilities.statusBarHeight / 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.d;
                if (bool == null || bool.booleanValue() != z10) {
                    if (AndroidUtilities.computePerceivedBrightness(d10Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v(d10Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21075s8), 855638016)) > 0.721f) {
                        z12 = true;
                    }
                    this.d = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(d10Var.getWindow(), z11);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f24841a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f24841a) {
            case 0:
                d10 d10Var = (d10) this.f24844e;
                if (motionEvent.getAction() == 0 && d10Var.h != 0 && motionEvent.getY() < d10Var.h) {
                    d10Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f24841a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                d10.H((d10) this.f24844e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        switch (this.f24841a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                d10 d10Var = (d10) this.f24844e;
                ai.w0 w0Var = d10Var.f25545b;
                boolean z10 = true;
                d10Var.f25549n = true;
                setPadding(d10.x(d10Var), AndroidUtilities.statusBarHeight, d10.D(d10Var), 0);
                d10Var.f25549n = false;
                int F = d10.F(d10Var) + (d10Var.f25546c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f) + AndroidUtilities.statusBarHeight;
                int i13 = size / 5;
                if (F < i13 * 3.2d) {
                    i12 = 0;
                } else {
                    i12 = i13 * 2;
                }
                if (i12 != 0 && F < size) {
                    i12 -= size - F;
                }
                if (i12 == 0) {
                    i12 = d10.G(d10Var);
                }
                if (w0Var.getPaddingTop() != i12) {
                    d10Var.f25549n = true;
                    w0Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    d10Var.f25549n = false;
                }
                if (F < size) {
                    z10 = false;
                }
                this.f24842b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(F, size), 1073741824));
                return;
            case 1:
                if (this.f24842b) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f24843c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f24842b = true;
                j5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                j5Var.setVisibility(0);
                j5Var.getLayoutParams().width = getMeasuredWidth();
                this.f24842b = false;
                ((org.telegram.ui.p80) this.f24844e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f24841a) {
            case 0:
                if (!((d10) this.f24844e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f24841a) {
            case 0:
                if (!((d10) this.f24844e).f25549n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f24842b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public b10(y80 y80Var, Context context, boolean z10) {
        super(context);
        this.f24844e = y80Var;
        this.d = new TextView[2];
        this.f24842b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f24843c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
        }
        addView(view, w7.x5.a(-1.0f, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f, -1, 0));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f24842b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f24842b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.x5.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, 17));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public b10(org.telegram.ui.p80 p80Var, Context context) {
        super(context);
        this.f24844e = p80Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f24843c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false));
        addView(j5Var, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, 0, 19));
        m9 m9Var = new m9(context, false);
        this.d = m9Var;
        m9Var.f28776a.f28368a = true;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(m9Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 56, 21));
        setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), 0, 4));
    }
}
