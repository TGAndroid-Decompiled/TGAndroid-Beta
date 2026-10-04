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
public final class o00 extends FrameLayout {
    public final int f29174a = 1;
    public boolean f29175b;
    public final Object f29176c;
    public Object d;
    public final KeyEvent.Callback f29177e;

    public o00(q00 q00Var, Activity activity) {
        super(activity);
        this.f29177e = q00Var;
        this.f29176c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((k80) this.f29177e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(tr.f31142g);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textViewArr[0], property, 1.0f, 0.0f);
        TextView textView = textViewArr[0];
        float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(textView, property2, fArr), ObjectAnimator.ofFloat(textViewArr[1], property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new r8(this, 26));
        animatorSet.start();
    }

    @Override
    public void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o00.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29174a) {
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
        switch (this.f29174a) {
            case 0:
                q00 q00Var = (q00) this.f29177e;
                if (motionEvent.getAction() == 0 && q00Var.h != 0 && motionEvent.getY() < q00Var.h) {
                    q00Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f29174a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                q00.E((q00) this.f29177e);
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
        switch (this.f29174a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                q00 q00Var = (q00) this.f29177e;
                ai.w0 w0Var = q00Var.f29849b;
                boolean z10 = true;
                q00Var.f29853n = true;
                setPadding(q00.v(q00Var), AndroidUtilities.statusBarHeight, q00.A(q00Var), 0);
                q00Var.f29853n = false;
                int dp = AndroidUtilities.dp(48.0f);
                int dp2 = AndroidUtilities.dp(48.0f);
                int C = q00.C(q00Var) + (q00Var.f29850c.h() * dp2) + dp + AndroidUtilities.statusBarHeight;
                int i13 = size / 5;
                if (C < i13 * 3.2d) {
                    i12 = 0;
                } else {
                    i12 = i13 * 2;
                }
                if (i12 != 0 && C < size) {
                    i12 -= size - C;
                }
                if (i12 == 0) {
                    i12 = q00.D(q00Var);
                }
                if (w0Var.getPaddingTop() != i12) {
                    q00Var.f29853n = true;
                    w0Var.setPadding(AndroidUtilities.dp(10.0f), i12, AndroidUtilities.dp(10.0f), 0);
                    q00Var.f29853n = false;
                }
                if (C < size) {
                    z10 = false;
                }
                this.f29175b = z10;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(C, size), 1073741824));
                return;
            case 1:
                if (this.f29175b) {
                    f7 = 80.0f;
                } else {
                    f7 = 50.0f;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
                return;
            default:
                org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) this.f29176c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
                }
                this.f29175b = true;
                i5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                i5Var.setVisibility(0);
                i5Var.getLayoutParams().width = getMeasuredWidth();
                this.f29175b = false;
                ((org.telegram.ui.o80) this.f29177e).f();
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29174a) {
            case 0:
                if (!((q00) this.f29177e).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f29174a) {
            case 0:
                if (!((q00) this.f29177e).f29853n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
            default:
                super.requestLayout();
                return;
            case 2:
                if (!this.f29175b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public o00(k80 k80Var, Context context, boolean z10) {
        super(context);
        this.f29177e = k80Var;
        this.d = new TextView[2];
        this.f29175b = !z10;
        setBackground(null);
        View view = new View(context);
        this.f29176c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.Oh));
        }
        addView(view, w7.z5.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.f29175b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.f29175b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.z5.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    public o00(org.telegram.ui.o80 o80Var, Context context) {
        super(context);
        this.f29177e = o80Var;
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f29176c = i5Var;
        i5Var.setTextSize(16);
        i5Var.setEllipsizeByGradient(true);
        i5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20926j5, false));
        addView(i5Var, w7.z5.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        k9 k9Var = new k9(context, false);
        this.d = k9Var;
        k9Var.f28026a.f27661a = true;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(k9Var, w7.z5.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20909i6, false), 0, 4));
    }
}
