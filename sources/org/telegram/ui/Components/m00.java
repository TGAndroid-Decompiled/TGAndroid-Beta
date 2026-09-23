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
public final class m00 extends FrameLayout {
    public final int f26051a = 0;
    public boolean f26052b;
    public final Object f26053c;
    public Object d;
    public final KeyEvent.Callback e;

    public m00(o00 o00Var, Activity activity) {
        super(activity);
        this.e = o00Var;
        this.f26053c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((x70) this.e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(rr.f27702g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new r8(this, 25));
        animatorSet.start();
    }

    @Override
    public void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f26051a) {
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
        switch (this.f26051a) {
            case 0:
                o00 o00Var = (o00) this.e;
                if (motionEvent.getAction() == 0 && o00Var.h != 0 && motionEvent.getY() < o00Var.h) {
                    o00Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f26051a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                o00.G((o00) this.e);
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
        switch (this.f26051a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                o00 o00Var = (o00) this.e;
                ai.w0 w0Var = o00Var.f26554b;
                boolean z10 = true;
                o00Var.f26557n = true;
                setPadding(o00.v(o00Var), AndroidUtilities.statusBarHeight, o00.A(o00Var), 0);
                o00Var.f26557n = false;
                int dp = AndroidUtilities.dp(48.0f);
                int dp2 = AndroidUtilities.dp(48.0f);
                int E = o00.E(o00Var) + (o00Var.f26555c.h() * dp2) + dp + AndroidUtilities.statusBarHeight;
                int i13 = size / 5;
                if (E < i13 * 3.2d) {
                    i12 = 0;
                } else {
                    i12 = i13 * 2;
                }
                if (i12 != 0 && E < size) {
                    i12 -= size - E;
                }
                if (i12 == 0) {
                    i12 = o00.F(o00Var);
                }
                if (w0Var.getPaddingTop() != i12) {
                    o00Var.f26557n = true;
                    w0Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    o00Var.f26557n = false;
                }
                if (E < size) {
                    z10 = false;
                }
                this.f26052b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(E, size), 1073741824));
                return;
            case 1:
                if (this.f26052b) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.f26053c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f26052b = true;
                i5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                i5Var.setVisibility(0);
                i5Var.getLayoutParams().width = getMeasuredWidth();
                this.f26052b = false;
                ((org.telegram.ui.m80) this.e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26051a) {
            case 0:
                if (!((o00) this.e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f26051a) {
            case 0:
                if (!((o00) this.e).f26557n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f26052b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public m00(x70 x70Var, Context context, boolean z10) {
        super(context);
        this.e = x70Var;
        this.d = new TextView[2];
        this.f26052b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f26053c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
        }
        addView(view, w7.x5.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f26052b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f26052b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.x5.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public m00(org.telegram.ui.m80 m80Var, Context context) {
        super(context);
        this.e = m80Var;
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f26053c = i5Var;
        i5Var.setTextSize(16);
        i5Var.setEllipsizeByGradient(true);
        i5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18895j5, false));
        addView(i5Var, w7.x5.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        k9 k9Var = new k9(context, false);
        this.d = k9Var;
        k9Var.f25558a.f25199a = true;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(k9Var, w7.x5.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), 0, 4));
    }
}
