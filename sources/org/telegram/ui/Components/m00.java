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
    public final int f28872a = 1;
    public boolean f28873b;
    public final Object f28874c;
    public Object d;
    public final KeyEvent.Callback f28875e;

    public m00(o00 o00Var, Activity activity) {
        super(activity);
        this.f28875e = o00Var;
        this.f28874c = new RectF();
    }

    public void a(String str, boolean z4) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z4) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((a80) this.f28875e).B = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(pr.f30184g);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f28872a) {
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
        switch (this.f28872a) {
            case 0:
                o00 o00Var = (o00) this.f28875e;
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
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f28872a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                o00.F((o00) this.f28875e);
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
        switch (this.f28872a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                o00 o00Var = (o00) this.f28875e;
                mh.d1 d1Var = o00Var.f29638b;
                boolean z4 = true;
                o00Var.f29642n = true;
                setPadding(o00.v(o00Var), AndroidUtilities.statusBarHeight, o00.B(o00Var), 0);
                o00Var.f29642n = false;
                int dp = AndroidUtilities.dp(48.0f);
                int dp2 = AndroidUtilities.dp(48.0f);
                int D = o00.D(o00Var) + (o00Var.f29639c.h() * dp2) + dp + AndroidUtilities.statusBarHeight;
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
                    i12 = o00.E(o00Var);
                }
                if (d1Var.getPaddingTop() != i12) {
                    o00Var.f29642n = true;
                    d1Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    o00Var.f29642n = false;
                }
                if (D < size) {
                    z4 = false;
                }
                this.f28873b = z4;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size), 1073741824));
                return;
            case 1:
                if (this.f28873b) {
                    f10 = 80.0f;
                } else {
                    f10 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.f28874c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f28873b = true;
                l5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                l5Var.setVisibility(0);
                l5Var.getLayoutParams().width = getMeasuredWidth();
                this.f28873b = false;
                ((org.telegram.ui.h80) this.f28875e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28872a) {
            case 0:
                if (!((o00) this.f28875e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f28872a) {
            case 0:
                if (!((o00) this.f28875e).f29642n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f28873b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public m00(a80 a80Var, Context context, boolean z4) {
        super(context);
        this.f28875e = a80Var;
        this.d = new TextView[2];
        this.f28873b = !z4;
        setBackground(null);
        View view = new View(context);
        this.f28874c = view;
        if (!z4) {
            view.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.Oh));
        }
        addView(view, k7.c6.d(-1, -1.0f, 0, 16.0f, z4 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f28873b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f28873b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], k7.c6.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public m00(org.telegram.ui.h80 h80Var, Context context) {
        super(context);
        this.f28875e = h80Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f28874c = l5Var;
        l5Var.setTextSize(16);
        l5Var.setEllipsizeByGradient(true);
        l5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
        addView(l5Var, k7.c6.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        d9 d9Var = new d9(context, false);
        this.d = d9Var;
        d9Var.f26228a.f25864a = true;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(d9Var, k7.c6.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false), 0, 4));
    }
}
