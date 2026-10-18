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
public final class t00 extends FrameLayout {
    public final int f30425a = 1;
    public boolean f30426b;
    public final Object f30427c;
    public Object d;
    public final KeyEvent.Callback e;

    public t00(v00 v00Var, Activity activity) {
        super(activity);
        this.e = v00Var;
        this.f30427c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((r80) this.e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(bs.f25038g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new c80(this, 1));
        animatorSet.start();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        int min;
        switch (this.f30425a) {
            case 0:
                RectF rectF = (RectF) this.f30427c;
                v00 v00Var = (v00) this.e;
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int I = ((v00Var.h - v00.I(v00Var)) - AndroidUtilities.dp(8.0f)) + AndroidUtilities.statusBarHeight;
                boolean z12 = false;
                if (this.f30426b) {
                    int n10 = v00.n(v00Var) + I;
                    int i11 = AndroidUtilities.statusBarHeight;
                    int i12 = i11 * 2;
                    if (n10 < i12) {
                        I -= Math.min(i11, (i12 - I) - v00.o(v00Var));
                        f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f7 = 1.0f;
                    }
                    int p5 = v00.p(v00Var) + I;
                    int i13 = AndroidUtilities.statusBarHeight;
                    if (p5 < i13) {
                        i10 = Math.min(i13, (i13 - I) - v00.q(v00Var));
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                    f7 = 1.0f;
                }
                v00.r(v00Var).setBounds(0, I, getMeasuredWidth(), getMeasuredHeight());
                v00.s(v00Var).draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.h6.f21283t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21064h5, false));
                    rectF.set(v00.t(v00Var), v00.v(v00Var) + I, getMeasuredWidth() - v00.w(v00Var), AndroidUtilities.dp(24.0f) + v00.y(v00Var) + I);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f21283t0);
                }
                if (i10 > 0) {
                    org.telegram.ui.ActionBar.h6.f21283t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21064h5, false));
                    canvas.drawRect(v00.z(v00Var), AndroidUtilities.statusBarHeight - i10, getMeasuredWidth() - v00.A(v00Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.h6.f21283t0);
                }
                if (i10 > AndroidUtilities.statusBarHeight / 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.d;
                if (bool == null || bool.booleanValue() != z10) {
                    if (AndroidUtilities.computePerceivedBrightness(v00Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21064h5)) > 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(v00Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21272s8), 855638016)) > 0.721f) {
                        z12 = true;
                    }
                    this.d = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(v00Var.getWindow(), z11);
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
        switch (this.f30425a) {
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
        switch (this.f30425a) {
            case 0:
                v00 v00Var = (v00) this.e;
                if (motionEvent.getAction() == 0 && v00Var.h != 0 && motionEvent.getY() < v00Var.h) {
                    v00Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f30425a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                v00.H((v00) this.e);
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
        switch (this.f30425a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                v00 v00Var = (v00) this.e;
                ai.u1 u1Var = v00Var.f31128b;
                boolean z10 = true;
                v00Var.f31131n = true;
                setPadding(v00.x(v00Var), AndroidUtilities.statusBarHeight, v00.C(v00Var), 0);
                v00Var.f31131n = false;
                int F = v00.F(v00Var) + (v00Var.f31129c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f) + AndroidUtilities.statusBarHeight;
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
                    i12 = v00.G(v00Var);
                }
                if (u1Var.getPaddingTop() != i12) {
                    v00Var.f31131n = true;
                    u1Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    v00Var.f31131n = false;
                }
                if (F < size) {
                    z10 = false;
                }
                this.f30426b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(F, size), 1073741824));
                return;
            case 1:
                if (this.f30426b) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f30427c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f30426b = true;
                j5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                j5Var.setVisibility(0);
                j5Var.getLayoutParams().width = getMeasuredWidth();
                this.f30426b = false;
                ((org.telegram.ui.x70) this.e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30425a) {
            case 0:
                if (!((v00) this.e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f30425a) {
            case 0:
                if (!((v00) this.e).f31131n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f30426b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public t00(r80 r80Var, Context context, boolean z10) {
        super(context);
        this.e = r80Var;
        this.d = new TextView[2];
        this.f30426b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f30427c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
        }
        addView(view, w7.z5.a(-1.0f, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f, -1, 0));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f30426b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f30426b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.z5.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, 17));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public t00(org.telegram.ui.x70 x70Var, Context context) {
        super(context);
        this.e = x70Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f30427c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21099j5, false));
        addView(j5Var, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, 0, 19));
        k9 k9Var = new k9(context, false);
        this.d = k9Var;
        k9Var.f27808a.f27456a = true;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(k9Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 56, 21));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21082i6, false), 0, 4));
    }
}
