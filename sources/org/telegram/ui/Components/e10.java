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
public final class e10 extends FrameLayout {
    public final int f25541a = 1;
    public boolean f25542b;
    public final Object f25543c;
    public Object d;
    public final KeyEvent.Callback f25544e;

    public e10(g10 g10Var, Activity activity) {
        super(activity);
        this.f25544e = g10Var;
        this.f25543c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((c90) this.f25544e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(js.f27635g);
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
        switch (this.f25541a) {
            case 0:
                RectF rectF = (RectF) this.f25543c;
                g10 g10Var = (g10) this.f25544e;
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int I = ((g10Var.h - g10.I(g10Var)) - AndroidUtilities.dp(8.0f)) + AndroidUtilities.statusBarHeight;
                boolean z12 = false;
                if (this.f25542b) {
                    int o9 = g10.o(g10Var) + I;
                    int i11 = AndroidUtilities.statusBarHeight;
                    int i12 = i11 * 2;
                    if (o9 < i12) {
                        I -= Math.min(i11, (i12 - I) - g10.p(g10Var));
                        f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f7 = 1.0f;
                    }
                    int q6 = g10.q(g10Var) + I;
                    int i13 = AndroidUtilities.statusBarHeight;
                    if (q6 < i13) {
                        i10 = Math.min(i13, (i13 - I) - g10.r(g10Var));
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                    f7 = 1.0f;
                }
                g10.s(g10Var).setBounds(0, I, getMeasuredWidth(), getMeasuredHeight());
                g10.t(g10Var).draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.h6.f20851t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20631h5, false));
                    rectF.set(g10.u(g10Var), g10.v(g10Var) + I, getMeasuredWidth() - g10.w(g10Var), AndroidUtilities.dp(24.0f) + g10.y(g10Var) + I);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f20851t0);
                }
                if (i10 > 0) {
                    org.telegram.ui.ActionBar.h6.f20851t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20631h5, false));
                    canvas.drawRect(g10.z(g10Var), AndroidUtilities.statusBarHeight - i10, getMeasuredWidth() - g10.A(g10Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.h6.f20851t0);
                }
                if (i10 > AndroidUtilities.statusBarHeight / 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.d;
                if (bool == null || bool.booleanValue() != z10) {
                    if (AndroidUtilities.computePerceivedBrightness(g10Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(g10Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20840s8), 855638016)) > 0.721f) {
                        z12 = true;
                    }
                    this.d = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(g10Var.getWindow(), z11);
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
        switch (this.f25541a) {
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
        switch (this.f25541a) {
            case 0:
                g10 g10Var = (g10) this.f25544e;
                if (motionEvent.getAction() == 0 && g10Var.h != 0 && motionEvent.getY() < g10Var.h) {
                    g10Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f25541a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                g10.H((g10) this.f25544e);
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
        switch (this.f25541a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                g10 g10Var = (g10) this.f25544e;
                ai.w0 w0Var = g10Var.f26211b;
                boolean z10 = true;
                g10Var.f26215n = true;
                setPadding(g10.x(g10Var), AndroidUtilities.statusBarHeight, g10.D(g10Var), 0);
                g10Var.f26215n = false;
                int F = g10.F(g10Var) + (g10Var.f26212c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f) + AndroidUtilities.statusBarHeight;
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
                    i12 = g10.G(g10Var);
                }
                if (w0Var.getPaddingTop() != i12) {
                    g10Var.f26215n = true;
                    w0Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    g10Var.f26215n = false;
                }
                if (F < size) {
                    z10 = false;
                }
                this.f25542b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(F, size), 1073741824));
                return;
            case 1:
                if (this.f25542b) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.f25543c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f25542b = true;
                h5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                h5Var.setVisibility(0);
                h5Var.getLayoutParams().width = getMeasuredWidth();
                this.f25542b = false;
                ((org.telegram.ui.r80) this.f25544e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25541a) {
            case 0:
                if (!((g10) this.f25544e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f25541a) {
            case 0:
                if (!((g10) this.f25544e).f26215n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f25542b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public e10(c90 c90Var, Context context, boolean z10) {
        super(context);
        this.f25544e = c90Var;
        this.d = new TextView[2];
        this.f25542b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f25543c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
        }
        addView(view, w7.w5.a(-1.0f, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f, -1, 0));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f25542b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f25542b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.w5.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, 17));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public e10(org.telegram.ui.r80 r80Var, Context context) {
        super(context);
        this.f25544e = r80Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25543c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20668j5, false));
        addView(h5Var, w7.w5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, 0, 19));
        m9 m9Var = new m9(context, false);
        this.d = m9Var;
        m9Var.f28440a.f28094a = true;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(m9Var, w7.w5.a(-1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 56, 21));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20651i6, false), 0, 4));
    }
}
