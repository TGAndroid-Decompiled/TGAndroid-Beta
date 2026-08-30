package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
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
public final class k00 extends FrameLayout {
    public final int f26079a = 0;
    public boolean f26080b;
    public final Object f26081c;
    public Object d;
    public final KeyEvent.Callback e;

    public k00(n00 n00Var, Activity activity) {
        super(activity);
        this.e = n00Var;
        this.f26081c = new RectF();
    }

    public void a(String str, boolean z4) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z4) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((y70) this.e).B = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(nr.f27347g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new a9(this, 24));
        animatorSet.start();
    }

    @Override
    public void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f26079a) {
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
        switch (this.f26079a) {
            case 0:
                n00 n00Var = (n00) this.e;
                if (motionEvent.getAction() == 0 && n00Var.h != 0 && motionEvent.getY() < n00Var.h) {
                    n00Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f26079a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                n00.F((n00) this.e);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f10;
        switch (this.f26079a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                n00 n00Var = (n00) this.e;
                lh.e1 e1Var = n00Var.f27148b;
                boolean z4 = true;
                n00Var.f27151n = true;
                setPadding(n00.v(n00Var), AndroidUtilities.statusBarHeight, n00.B(n00Var), 0);
                n00Var.f27151n = false;
                int dp = AndroidUtilities.dp(48.0f);
                int dp2 = AndroidUtilities.dp(48.0f);
                int D = n00.D(n00Var) + (n00Var.f27149c.h() * dp2) + dp + AndroidUtilities.statusBarHeight;
                int i13 = size / 5;
                if (D < i13 * 3.2d) {
                    i12 = 0;
                } else {
                    i12 = i13 * 2;
                }
                if (i12 != 0 && D < size) {
                    i12 -= size - D;
                }
                if (i12 == 0) {
                    i12 = n00.E(n00Var);
                }
                if (e1Var.getPaddingTop() != i12) {
                    n00Var.f27151n = true;
                    e1Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    n00Var.f27151n = false;
                }
                if (D < size) {
                    z4 = false;
                }
                this.f26080b = z4;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size), 1073741824));
                return;
            case 1:
                if (this.f26080b) {
                    f10 = 80.0f;
                } else {
                    f10 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.f26081c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f26080b = true;
                k5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                k5Var.setVisibility(0);
                k5Var.getLayoutParams().width = getMeasuredWidth();
                this.f26080b = false;
                ((org.telegram.ui.g80) this.e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26079a) {
            case 0:
                if (!((n00) this.e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f26079a) {
            case 0:
                if (!((n00) this.e).f27151n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f26080b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public k00(y70 y70Var, Context context, boolean z4) {
        super(context);
        this.e = y70Var;
        this.d = new TextView[2];
        this.f26080b = !z4;
        setBackground(null);
        View view = new View(context);
        this.f26081c = view;
        if (!z4) {
            view.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
        }
        addView(view, k7.b6.d(-1, -1.0f, 0, 16.0f, z4 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f26080b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f26080b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], k7.b6.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public k00(org.telegram.ui.g80 g80Var, Context context) {
        super(context);
        this.e = g80Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f26081c = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
        addView(k5Var, k7.b6.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        d9 d9Var = new d9(context, false);
        this.d = d9Var;
        d9Var.f24206a.f23922a = true;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(d9Var, k7.b6.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false), 0, 4));
    }
}
