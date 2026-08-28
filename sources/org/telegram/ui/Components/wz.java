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
public final class wz extends FrameLayout {
    public final int f34474a = 1;
    public boolean f34475b;
    public final Object f34476c;
    public Object d;
    public final KeyEvent.Callback f34477e;

    public wz(yz yzVar, Activity activity) {
        super(activity);
        this.f34477e = yzVar;
        this.f34476c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((g70) this.f34477e).A = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(gr.f28845g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new r60(this, 1));
        animatorSet.start();
    }

    @Override
    public void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wz.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f34474a) {
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
        switch (this.f34474a) {
            case 0:
                yz yzVar = (yz) this.f34477e;
                if (motionEvent.getAction() == 0 && yzVar.h != 0 && motionEvent.getY() < yzVar.h) {
                    yzVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f34474a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                yz.F((yz) this.f34477e);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        float f10;
        switch (this.f34474a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                yz yzVar = (yz) this.f34477e;
                gh.f1 f1Var = yzVar.f35111b;
                boolean z10 = true;
                yzVar.f35115n = true;
                setPadding(yz.v(yzVar), AndroidUtilities.statusBarHeight, yz.A(yzVar), 0);
                yzVar.f35115n = false;
                int dp = AndroidUtilities.dp(48.0f);
                int dp2 = AndroidUtilities.dp(48.0f);
                int D = yz.D(yzVar) + (yzVar.f35112c.h() * dp2) + dp + AndroidUtilities.statusBarHeight;
                int i12 = size / 5;
                if (D < i12 * 3.2d) {
                    i11 = 0;
                } else {
                    i11 = i12 * 2;
                }
                if (i11 != 0 && D < size) {
                    i11 -= size - D;
                }
                if (i11 == 0) {
                    i11 = yz.E(yzVar);
                }
                if (f1Var.getPaddingTop() != i11) {
                    yzVar.f35115n = true;
                    f1Var.setPadding(AndroidUtilities.dp(10.0f), i11, AndroidUtilities.dp(10.0f), 0);
                    yzVar.f35115n = false;
                }
                if (D < size) {
                    z10 = false;
                }
                this.f34475b = z10;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.min(D, size), 1073741824));
                return;
            case 1:
                if (this.f34475b) {
                    f10 = 80.0f;
                } else {
                    f10 = 50.0f;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.f34476c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i9 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f34475b = true;
                h5Var.setVisibility(8);
                super.onMeasure(i9, i10);
                h5Var.setVisibility(0);
                h5Var.getLayoutParams().width = getMeasuredWidth();
                this.f34475b = false;
                ((org.telegram.ui.u70) this.f34477e).f();
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34474a) {
            case 0:
                if (!((yz) this.f34477e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f34474a) {
            case 0:
                if (!((yz) this.f34477e).f35115n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f34475b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public wz(g70 g70Var, Context context, boolean z10) {
        super(context);
        this.f34477e = g70Var;
        this.d = new TextView[2];
        this.f34475b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f34476c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.f6.Oh));
        }
        addView(view, g7.e6.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i9 = 0; i9 < 2; i9++) {
            ((TextView[]) this.d)[i9] = new TextView(context);
            ((TextView[]) this.d)[i9].setFocusable(false);
            ((TextView[]) this.d)[i9].setLines(1);
            ((TextView[]) this.d)[i9].setSingleLine(true);
            ((TextView[]) this.d)[i9].setGravity(1);
            ((TextView[]) this.d)[i9].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i9].setGravity(17);
            if (this.f34475b) {
                ((TextView[]) this.d)[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                ((TextView[]) this.d)[i9].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i9].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false));
            }
            ((TextView[]) this.d)[i9].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i9].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i9].setPadding(0, 0, 0, this.f34475b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i9], g7.e6.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i9 == 1) {
                ((TextView[]) this.d)[i9].setAlpha(0.0f);
            }
        }
    }

    public wz(org.telegram.ui.u70 u70Var, Context context) {
        super(context);
        this.f34477e = u70Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f34476c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        addView(h5Var, g7.e6.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        c9 c9Var = new c9(context, false);
        this.d = c9Var;
        c9Var.f27425a.f27074a = true;
        c9Var.setStyle(11);
        c9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(c9Var, g7.e6.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 0, 4));
    }
}
