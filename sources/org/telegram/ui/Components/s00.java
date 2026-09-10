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
public final class s00 extends FrameLayout {
    public final int f26888a = 1;
    public boolean f26889b;
    public final Object f26890c;
    public Object d;
    public final KeyEvent.Callback e;

    public s00(u00 u00Var, Activity activity) {
        super(activity);
        this.e = u00Var;
        this.f26890c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((f80) this.e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(wr.f28820g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new rm(this, 15));
        animatorSet.start();
    }

    @Override
    public void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f26888a) {
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
        switch (this.f26888a) {
            case 0:
                u00 u00Var = (u00) this.e;
                if (motionEvent.getAction() == 0 && u00Var.h != 0 && motionEvent.getY() < u00Var.h) {
                    u00Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f26888a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                u00.F((u00) this.e);
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
        switch (this.f26888a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                u00 u00Var = (u00) this.e;
                bi.y1 y1Var = u00Var.f27534b;
                boolean z10 = true;
                u00Var.f27537n = true;
                setPadding(u00.v(u00Var), AndroidUtilities.statusBarHeight, u00.A(u00Var), 0);
                u00Var.f27537n = false;
                int dp = AndroidUtilities.dp(48.0f);
                int dp2 = AndroidUtilities.dp(48.0f);
                int D = u00.D(u00Var) + (u00Var.f27535c.h() * dp2) + dp + AndroidUtilities.statusBarHeight;
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
                    i12 = u00.E(u00Var);
                }
                if (y1Var.getPaddingTop() != i12) {
                    u00Var.f27537n = true;
                    y1Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    u00Var.f27537n = false;
                }
                if (D < size) {
                    z10 = false;
                }
                this.f26889b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size), 1073741824));
                return;
            case 1:
                if (this.f26889b) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.f26890c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f26889b = true;
                l5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                l5Var.setVisibility(0);
                l5Var.getLayoutParams().width = getMeasuredWidth();
                this.f26889b = false;
                ((org.telegram.ui.p80) this.e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f26888a) {
            case 0:
                if (!((u00) this.e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f26888a) {
            case 0:
                if (!((u00) this.e).f27537n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f26889b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public s00(f80 f80Var, Context context, boolean z10) {
        super(context);
        this.e = f80Var;
        this.d = new TextView[2];
        this.f26889b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f26890c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.Oh));
        }
        addView(view, w7.a6.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f26889b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f26889b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.a6.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public s00(org.telegram.ui.p80 p80Var, Context context) {
        super(context);
        this.e = p80Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f26890c = l5Var;
        l5Var.setTextSize(16);
        l5Var.setEllipsizeByGradient(true);
        l5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
        addView(l5Var, w7.a6.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        j9 j9Var = new j9(context, false);
        this.d = j9Var;
        j9Var.f24315a.f23935a = true;
        j9Var.setStyle(11);
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(j9Var, w7.a6.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 0, 4));
    }
}
