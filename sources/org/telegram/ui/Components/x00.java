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
public final class x00 extends FrameLayout {
    public final int f31093a = 1;
    public boolean f31094b;
    public final Object f31095c;
    public Object d;
    public final KeyEvent.Callback e;

    public x00(z00 z00Var, Activity activity) {
        super(activity);
        this.e = z00Var;
        this.f31095c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((w80) this.e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(es.f24772g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new l6(this, 29));
        animatorSet.start();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        int min;
        switch (this.f31093a) {
            case 0:
                RectF rectF = (RectF) this.f31095c;
                z00 z00Var = (z00) this.e;
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int I = ((z00Var.h - z00.I(z00Var)) - AndroidUtilities.dp(8.0f)) + AndroidUtilities.statusBarHeight;
                boolean z12 = false;
                if (this.f31094b) {
                    int n10 = z00.n(z00Var) + I;
                    int i11 = AndroidUtilities.statusBarHeight;
                    int i12 = i11 * 2;
                    if (n10 < i12) {
                        I -= Math.min(i11, (i12 - I) - z00.o(z00Var));
                        f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f7 = 1.0f;
                    }
                    int q6 = z00.q(z00Var) + I;
                    int i13 = AndroidUtilities.statusBarHeight;
                    if (q6 < i13) {
                        i10 = Math.min(i13, (i13 - I) - z00.r(z00Var));
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                    f7 = 1.0f;
                }
                z00.s(z00Var).setBounds(0, I, getMeasuredWidth(), getMeasuredHeight());
                z00.t(z00Var).draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.g6.f20191t0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false));
                    rectF.set(z00.u(z00Var), z00.v(z00Var) + I, getMeasuredWidth() - z00.w(z00Var), AndroidUtilities.dp(24.0f) + z00.y(z00Var) + I);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.g6.f20191t0);
                }
                if (i10 > 0) {
                    org.telegram.ui.ActionBar.g6.f20191t0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false));
                    canvas.drawRect(z00.z(z00Var), AndroidUtilities.statusBarHeight - i10, getMeasuredWidth() - z00.A(z00Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f20191t0);
                }
                if (i10 > AndroidUtilities.statusBarHeight / 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.d;
                if (bool == null || bool.booleanValue() != z10) {
                    if (AndroidUtilities.computePerceivedBrightness(z00Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(z00Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20180s8), 855638016)) > 0.721f) {
                        z12 = true;
                    }
                    this.d = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(z00Var.getWindow(), z11);
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
        switch (this.f31093a) {
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
        switch (this.f31093a) {
            case 0:
                z00 z00Var = (z00) this.e;
                if (motionEvent.getAction() == 0 && z00Var.h != 0 && motionEvent.getY() < z00Var.h) {
                    z00Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f31093a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                z00.H((z00) this.e);
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
        switch (this.f31093a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                z00 z00Var = (z00) this.e;
                bi.o0 o0Var = z00Var.f31712b;
                boolean z10 = true;
                z00Var.f31715n = true;
                setPadding(z00.x(z00Var), AndroidUtilities.statusBarHeight, z00.D(z00Var), 0);
                z00Var.f31715n = false;
                int F = z00.F(z00Var) + (z00Var.f31713c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f) + AndroidUtilities.statusBarHeight;
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
                    i12 = z00.G(z00Var);
                }
                if (o0Var.getPaddingTop() != i12) {
                    z00Var.f31715n = true;
                    o0Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    z00Var.f31715n = false;
                }
                if (F < size) {
                    z10 = false;
                }
                this.f31094b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(F, size), 1073741824));
                return;
            case 1:
                if (this.f31094b) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.f31095c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f31094b = true;
                h5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                h5Var.setVisibility(0);
                h5Var.getLayoutParams().width = getMeasuredWidth();
                this.f31094b = false;
                ((org.telegram.ui.t80) this.e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f31093a) {
            case 0:
                if (!((z00) this.e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f31093a) {
            case 0:
                if (!((z00) this.e).f31715n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f31094b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public x00(w80 w80Var, Context context, boolean z10) {
        super(context);
        this.e = w80Var;
        this.d = new TextView[2];
        this.f31094b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f31095c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        }
        addView(view, w7.a6.a(-1.0f, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f, -1, 0));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f31094b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f31094b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.a6.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, 17));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public x00(org.telegram.ui.t80 t80Var, Context context) {
        super(context);
        this.e = t80Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f31095c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007j5, false));
        addView(h5Var, w7.a6.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, 0, 19));
        n9 n9Var = new n9(context, false);
        this.d = n9Var;
        n9Var.f27627a.f27306a = true;
        n9Var.setStyle(11);
        n9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(n9Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 56, 21));
        setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false), 0, 4));
    }
}
