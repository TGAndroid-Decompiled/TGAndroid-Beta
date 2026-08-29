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
public final class g00 extends FrameLayout {
    public final int f28691a = 0;
    public boolean f28692b;
    public final Object f28693c;
    public Object d;
    public final KeyEvent.Callback f28694e;

    public g00(j00 j00Var, Activity activity) {
        super(activity);
        this.f28694e = j00Var;
        this.f28693c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((t70) this.f28694e).A = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(jr.f29801g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new zz(this, 3));
        animatorSet.start();
    }

    @Override
    public void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f28691a) {
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
        switch (this.f28691a) {
            case 0:
                j00 j00Var = (j00) this.f28694e;
                if (motionEvent.getAction() == 0 && j00Var.h != 0 && motionEvent.getY() < j00Var.h) {
                    j00Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f28691a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                j00.F((j00) this.f28694e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f9;
        switch (this.f28691a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                j00 j00Var = (j00) this.f28694e;
                jh.e1 e1Var = j00Var.f29513b;
                boolean z10 = true;
                j00Var.f29517n = true;
                setPadding(j00.v(j00Var), AndroidUtilities.statusBarHeight, j00.B(j00Var), 0);
                j00Var.f29517n = false;
                int dp = AndroidUtilities.dp(48.0f);
                int dp2 = AndroidUtilities.dp(48.0f);
                int D = j00.D(j00Var) + (j00Var.f29514c.h() * dp2) + dp + AndroidUtilities.statusBarHeight;
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
                    i12 = j00.E(j00Var);
                }
                if (e1Var.getPaddingTop() != i12) {
                    j00Var.f29517n = true;
                    e1Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    j00Var.f29517n = false;
                }
                if (D < size) {
                    z10 = false;
                }
                this.f28692b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size), 1073741824));
                return;
            case 1:
                if (this.f28692b) {
                    f9 = 80.0f;
                } else {
                    f9 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.f28693c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f28692b = true;
                h5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                h5Var.setVisibility(0);
                h5Var.getLayoutParams().width = getMeasuredWidth();
                this.f28692b = false;
                ((org.telegram.ui.x70) this.f28694e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28691a) {
            case 0:
                if (!((j00) this.f28694e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f28691a) {
            case 0:
                if (!((j00) this.f28694e).f29517n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f28692b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public g00(t70 t70Var, Context context, boolean z10) {
        super(context);
        this.f28694e = t70Var;
        this.d = new TextView[2];
        this.f28692b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f28693c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        }
        addView(view, i7.f6.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f28692b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f28692b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], i7.f6.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public g00(org.telegram.ui.x70 x70Var, Context context) {
        super(context);
        this.f28694e = x70Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f28693c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
        addView(h5Var, i7.f6.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        h9 h9Var = new h9(context, false);
        this.d = h9Var;
        h9Var.f29141a.f28823a = true;
        h9Var.setStyle(11);
        h9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(h9Var, i7.f6.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 0, 4));
    }
}
