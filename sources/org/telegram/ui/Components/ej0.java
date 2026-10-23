package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ej0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public bs F;
    public qd0 G;
    public qd0 H;
    public org.telegram.ui.zb0 I;
    public cj0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public bj0 P;
    public org.telegram.ui.bc0 Q;
    public VelocityTracker f25984a;
    public int f25985b;
    public int f25986c;
    public int d;
    public boolean e;
    public boolean f25987f;
    public AnimatorSet h;
    public Rect f25988n;
    public boolean f25989r;
    public AnimatorSet f25990s;
    public aj0 v;
    public boolean f25991w;
    public int f25992x;
    public int f25993y;

    public final void a() {
        aj0 aj0Var = this.v;
        if (this.f25989r) {
            return;
        }
        this.f25989r = true;
        AnimatorSet animatorSet = this.f25990s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f25990s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f25990s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + aj0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = aj0Var.getMeasuredHeight();
            this.f25990s.setDuration(Math.max(60, (int) (((measuredHeight - aj0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f25990s.setDuration(250L);
        }
        this.f25990s.setInterpolator(bs.f25133f);
        this.f25990s.addListener(new dj0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f25990s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        aj0 aj0Var = this.v;
        if (!this.f25989r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f25987f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f25985b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f25986c = y3;
                if (y3 >= aj0Var.getTop() && this.f25985b >= aj0Var.getLeft() && this.f25985b <= aj0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f25984a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else {
                    requestDisallowInterceptTouchEvent(true);
                    a();
                    return true;
                }
            } else {
                float f7 = 0.0f;
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.f25984a == null) {
                        this.f25984a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f25985b));
                    float y10 = ((int) motionEvent.getY()) - this.f25986c;
                    this.f25984a.addMovement(motionEvent);
                    if (this.e && !this.f25987f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f25993y) {
                        this.f25986c = (int) motionEvent.getY();
                        this.e = false;
                        this.f25987f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f25987f) {
                        float translationY2 = aj0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        aj0Var.setTranslationY(f7);
                        this.f25986c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f25984a == null) {
                        this.f25984a = VelocityTracker.obtain();
                    }
                    this.f25984a.computeCurrentVelocity(1000);
                    float translationY3 = aj0Var.getTranslationY();
                    if (!this.f25987f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f25987f = false;
                    } else {
                        float xVelocity = this.f25984a.getXVelocity();
                        float yVelocity = this.f25984a.getYVelocity();
                        if ((aj0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(bs.f25134g);
                            this.h.addListener(new dj0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f25987f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f25984a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f25984a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f25987f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ej0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f25989r) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.P;
    }

    public boolean getRadiusSet() {
        return this.L;
    }

    public float getValue() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ej0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f25989r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ej0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f25988n);
        setMeasuredDimension(size, size2);
        aj0 aj0Var = this.v;
        aj0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f25992x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != aj0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f25989r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f25987f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
