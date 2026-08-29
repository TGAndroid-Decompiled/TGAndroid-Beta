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
public final class ai0 extends FrameLayout {
    public static final int N = 0;
    public boolean A;
    public jr B;
    public qc0 C;
    public qc0 D;
    public org.telegram.ui.xb0 E;
    public yh0 F;
    public TextView G;
    public boolean H;
    public TLRPC.User I;
    public int J;
    public boolean K;
    public xh0 L;
    public org.telegram.ui.zb0 M;
    public VelocityTracker f26774a;
    public int f26775b;
    public int f26776c;
    public int d;
    public boolean f26777e;
    public boolean f26778f;
    public AnimatorSet h;
    public Rect f26779n;
    public boolean f26780r;
    public AnimatorSet f26781s;
    public wh0 v;
    public boolean f26782w;
    public int f26783x;
    public int f26784y;

    public final void a() {
        wh0 wh0Var = this.v;
        if (this.f26780r) {
            return;
        }
        this.f26780r = true;
        AnimatorSet animatorSet = this.f26781s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26781s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26781s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + wh0Var.getMeasuredHeight()));
        if (this.A) {
            float measuredHeight = wh0Var.getMeasuredHeight();
            this.f26781s.setDuration(Math.max(60, (int) (((measuredHeight - wh0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.A = false;
        } else {
            this.f26781s.setDuration(250L);
        }
        this.f26781s.setInterpolator(jr.f29800f);
        this.f26781s.addListener(new zh0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f26781s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        wh0 wh0Var = this.v;
        if (!this.f26780r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f26778f && !this.f26777e && motionEvent.getPointerCount() == 1)) {
                this.f26775b = (int) motionEvent.getX();
                int y8 = (int) motionEvent.getY();
                this.f26776c = y8;
                if (y8 >= wh0Var.getTop() && this.f26775b >= wh0Var.getLeft() && this.f26775b <= wh0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f26777e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f26774a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else {
                    requestDisallowInterceptTouchEvent(true);
                    a();
                    return true;
                }
            } else {
                float f9 = 0.0f;
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.f26774a == null) {
                        this.f26774a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f26775b));
                    float y10 = ((int) motionEvent.getY()) - this.f26776c;
                    this.f26774a.addMovement(motionEvent);
                    if (this.f26777e && !this.f26778f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f26784y) {
                        this.f26776c = (int) motionEvent.getY();
                        this.f26777e = false;
                        this.f26778f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f26778f) {
                        float translationY2 = wh0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f9 = translationY2;
                        }
                        wh0Var.setTranslationY(f9);
                        this.f26776c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f26774a == null) {
                        this.f26774a = VelocityTracker.obtain();
                    }
                    this.f26774a.computeCurrentVelocity(1000);
                    float translationY3 = wh0Var.getTranslationY();
                    if (!this.f26778f && translationY3 == 0.0f) {
                        this.f26777e = false;
                        this.f26778f = false;
                    } else {
                        float xVelocity = this.f26774a.getXVelocity();
                        float yVelocity = this.f26774a.getYVelocity();
                        if ((wh0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(wh0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(jr.f29801g);
                            this.h.addListener(new zh0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.A = true;
                            a();
                        }
                        this.f26778f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f26774a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f26774a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f26777e) || this.f26778f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ai0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f26780r) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.L;
    }

    public boolean getRadiusSet() {
        return this.H;
    }

    public float getValue() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ai0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26780r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ai0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f26779n);
        setMeasuredDimension(size, size2);
        wh0 wh0Var = this.v;
        wh0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f26783x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != wh0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26780r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f26777e && !this.f26778f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
