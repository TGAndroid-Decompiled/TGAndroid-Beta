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
public final class c10 extends FrameLayout {
    public final int f25126a = 0;
    public boolean f25127b;
    public final Object f25128c;
    public Object d;
    public final KeyEvent.Callback f25129e;

    public c10(e10 e10Var, Activity activity) {
        super(activity);
        this.f25129e = e10Var;
        this.f25128c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((z80) this.f25129e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(is.f27444g);
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
        switch (this.f25126a) {
            case 0:
                RectF rectF = (RectF) this.f25128c;
                e10 e10Var = (e10) this.f25129e;
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int I = ((e10Var.h - e10.I(e10Var)) - AndroidUtilities.dp(8.0f)) + AndroidUtilities.statusBarHeight;
                boolean z12 = false;
                if (this.f25127b) {
                    int o9 = e10.o(e10Var) + I;
                    int i11 = AndroidUtilities.statusBarHeight;
                    int i12 = i11 * 2;
                    if (o9 < i12) {
                        I -= Math.min(i11, (i12 - I) - e10.p(e10Var));
                        f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f7 = 1.0f;
                    }
                    int q6 = e10.q(e10Var) + I;
                    int i13 = AndroidUtilities.statusBarHeight;
                    if (q6 < i13) {
                        i10 = Math.min(i13, (i13 - I) - e10.r(e10Var));
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                    f7 = 1.0f;
                }
                e10.s(e10Var).setBounds(0, I, getMeasuredWidth(), getMeasuredHeight());
                e10.t(e10Var).draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.i6.f21090t0.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false));
                    rectF.set(e10.u(e10Var), e10.v(e10Var) + I, getMeasuredWidth() - e10.w(e10Var), AndroidUtilities.dp(24.0f) + e10.y(e10Var) + I);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.i6.f21090t0);
                }
                if (i10 > 0) {
                    org.telegram.ui.ActionBar.i6.f21090t0.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false));
                    canvas.drawRect(e10.z(e10Var), AndroidUtilities.statusBarHeight - i10, getMeasuredWidth() - e10.B(e10Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.i6.f21090t0);
                }
                if (i10 > AndroidUtilities.statusBarHeight / 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.d;
                if (bool == null || bool.booleanValue() != z10) {
                    if (AndroidUtilities.computePerceivedBrightness(e10Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v(e10Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21079s8), 855638016)) > 0.721f) {
                        z12 = true;
                    }
                    this.d = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(e10Var.getWindow(), z11);
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
        switch (this.f25126a) {
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
        switch (this.f25126a) {
            case 0:
                e10 e10Var = (e10) this.f25129e;
                if (motionEvent.getAction() == 0 && e10Var.h != 0 && motionEvent.getY() < e10Var.h) {
                    e10Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f25126a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                e10.H((e10) this.f25129e);
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
        switch (this.f25126a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                e10 e10Var = (e10) this.f25129e;
                ai.w0 w0Var = e10Var.f25850b;
                boolean z10 = true;
                e10Var.f25854n = true;
                setPadding(e10.x(e10Var), AndroidUtilities.statusBarHeight, e10.D(e10Var), 0);
                e10Var.f25854n = false;
                int F = e10.F(e10Var) + (e10Var.f25851c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f) + AndroidUtilities.statusBarHeight;
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
                    i12 = e10.G(e10Var);
                }
                if (w0Var.getPaddingTop() != i12) {
                    e10Var.f25854n = true;
                    w0Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    e10Var.f25854n = false;
                }
                if (F < size) {
                    z10 = false;
                }
                this.f25127b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(F, size), 1073741824));
                return;
            case 1:
                if (this.f25127b) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f25128c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f25127b = true;
                j5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                j5Var.setVisibility(0);
                j5Var.getLayoutParams().width = getMeasuredWidth();
                this.f25127b = false;
                ((org.telegram.ui.p80) this.f25129e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25126a) {
            case 0:
                if (!((e10) this.f25129e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f25126a) {
            case 0:
                if (!((e10) this.f25129e).f25854n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f25127b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public c10(z80 z80Var, Context context, boolean z10) {
        super(context);
        this.f25129e = z80Var;
        this.d = new TextView[2];
        this.f25127b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f25128c = view;
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
            if (this.f25127b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f25127b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.x5.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, 17));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public c10(org.telegram.ui.p80 p80Var, Context context) {
        super(context);
        this.f25129e = p80Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f25128c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false));
        addView(j5Var, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, 0, 19));
        m9 m9Var = new m9(context, false);
        this.d = m9Var;
        m9Var.f28724a.f28249a = true;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(m9Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 56, 21));
        setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20892i6, false), 0, 4));
    }
}
