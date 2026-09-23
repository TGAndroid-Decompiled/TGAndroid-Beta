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
public final class fi0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public rr F;
    public tc0 G;
    public tc0 H;
    public org.telegram.ui.lc0 I;
    public di0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public ci0 P;
    public org.telegram.ui.nc0 Q;
    public VelocityTracker f23984a;
    public int f23985b;
    public int f23986c;
    public int d;
    public boolean e;
    public boolean f23987f;
    public AnimatorSet h;
    public Rect f23988n;
    public boolean f23989r;
    public AnimatorSet f23990s;
    public bi0 v;
    public boolean f23991w;
    public int f23992x;
    public int f23993y;

    public final void a() {
        bi0 bi0Var = this.v;
        if (this.f23989r) {
            return;
        }
        this.f23989r = true;
        AnimatorSet animatorSet = this.f23990s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f23990s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23990s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(bi0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + bi0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = bi0Var.getMeasuredHeight();
            this.f23990s.setDuration(Math.max(60, (int) (((measuredHeight - bi0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f23990s.setDuration(250L);
        }
        this.f23990s.setInterpolator(rr.f27701f);
        this.f23990s.addListener(new ei0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f23990s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        bi0 bi0Var = this.v;
        if (!this.f23989r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f23987f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f23985b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f23986c = y3;
                if (y3 >= bi0Var.getTop() && this.f23985b >= bi0Var.getLeft() && this.f23985b <= bi0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f23984a;
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
                    if (this.f23984a == null) {
                        this.f23984a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f23985b));
                    float y10 = ((int) motionEvent.getY()) - this.f23986c;
                    this.f23984a.addMovement(motionEvent);
                    if (this.e && !this.f23987f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f23993y) {
                        this.f23986c = (int) motionEvent.getY();
                        this.e = false;
                        this.f23987f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f23987f) {
                        float translationY2 = bi0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        bi0Var.setTranslationY(f7);
                        this.f23986c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f23984a == null) {
                        this.f23984a = VelocityTracker.obtain();
                    }
                    this.f23984a.computeCurrentVelocity(1000);
                    float translationY3 = bi0Var.getTranslationY();
                    if (!this.f23987f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f23987f = false;
                    } else {
                        float xVelocity = this.f23984a.getXVelocity();
                        float yVelocity = this.f23984a.getYVelocity();
                        if ((bi0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(bi0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(rr.f27702g);
                            this.h.addListener(new ei0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f23987f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f23984a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f23984a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f23987f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fi0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f23989r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fi0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23989r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fi0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f23988n);
        setMeasuredDimension(size, size2);
        bi0 bi0Var = this.v;
        bi0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f23992x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != bi0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23989r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f23987f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
