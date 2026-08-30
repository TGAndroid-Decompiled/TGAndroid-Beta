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
public final class li0 extends FrameLayout {
    public static final int O = 0;
    public boolean B;
    public nr C;
    public wc0 D;
    public wc0 E;
    public org.telegram.ui.hc0 F;
    public ji0 G;
    public TextView H;
    public boolean I;
    public TLRPC.User J;
    public int K;
    public boolean L;
    public ii0 M;
    public org.telegram.ui.jc0 N;
    public VelocityTracker f26766a;
    public int f26767b;
    public int f26768c;
    public int d;
    public boolean e;
    public boolean f26769f;
    public AnimatorSet h;
    public Rect f26770n;
    public boolean f26771r;
    public AnimatorSet f26772s;
    public hi0 v;
    public boolean f26773w;
    public int f26774x;
    public int f26775y;

    public final void a() {
        hi0 hi0Var = this.v;
        if (this.f26771r) {
            return;
        }
        this.f26771r = true;
        AnimatorSet animatorSet = this.f26772s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26772s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26772s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(hi0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + hi0Var.getMeasuredHeight()));
        if (this.B) {
            float measuredHeight = hi0Var.getMeasuredHeight();
            this.f26772s.setDuration(Math.max(60, (int) (((measuredHeight - hi0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.B = false;
        } else {
            this.f26772s.setDuration(250L);
        }
        this.f26772s.setInterpolator(nr.f27346f);
        this.f26772s.addListener(new ki0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f26772s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        float translationY;
        hi0 hi0Var = this.v;
        if (!this.f26771r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f26769f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f26767b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f26768c = y10;
                if (y10 >= hi0Var.getTop() && this.f26767b >= hi0Var.getLeft() && this.f26767b <= hi0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f26766a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else {
                    requestDisallowInterceptTouchEvent(true);
                    a();
                    return true;
                }
            } else {
                float f10 = 0.0f;
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.f26766a == null) {
                        this.f26766a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f26767b));
                    float y11 = ((int) motionEvent.getY()) - this.f26768c;
                    this.f26766a.addMovement(motionEvent);
                    if (this.e && !this.f26769f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.f26775y) {
                        this.f26768c = (int) motionEvent.getY();
                        this.e = false;
                        this.f26769f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f26769f) {
                        float translationY2 = hi0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        hi0Var.setTranslationY(f10);
                        this.f26768c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f26766a == null) {
                        this.f26766a = VelocityTracker.obtain();
                    }
                    this.f26766a.computeCurrentVelocity(1000);
                    float translationY3 = hi0Var.getTranslationY();
                    if (!this.f26769f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f26769f = false;
                    } else {
                        float xVelocity = this.f26766a.getXVelocity();
                        float yVelocity = this.f26766a.getYVelocity();
                        if ((hi0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(hi0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(nr.f27347g);
                            this.h.addListener(new ki0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.B = true;
                            a();
                        }
                        this.f26769f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f26766a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f26766a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z4 && this.e) || this.f26769f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f26771r) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.M;
    }

    public boolean getRadiusSet() {
        return this.I;
    }

    public float getValue() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26771r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f26770n);
        setMeasuredDimension(size, size2);
        hi0 hi0Var = this.v;
        hi0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f26774x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != hi0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26771r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        if (this.e && !this.f26769f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
