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
public final class ri0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public qr F;
    public fd0 G;
    public fd0 H;
    public org.telegram.ui.sc0 I;
    public pi0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public oi0 P;
    public org.telegram.ui.uc0 Q;
    public VelocityTracker f27988a;
    public int f27989b;
    public int f27990c;
    public int d;
    public boolean e;
    public boolean f27991f;
    public AnimatorSet h;
    public Rect f27992n;
    public boolean f27993r;
    public AnimatorSet f27994s;
    public ni0 v;
    public boolean f27995w;
    public int f27996x;
    public int f27997y;

    public final void a() {
        ni0 ni0Var = this.v;
        if (this.f27993r) {
            return;
        }
        this.f27993r = true;
        AnimatorSet animatorSet = this.f27994s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f27994s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27994s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ni0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + ni0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = ni0Var.getMeasuredHeight();
            this.f27994s.setDuration(Math.max(60, (int) (((measuredHeight - ni0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f27994s.setDuration(250L);
        }
        this.f27994s.setInterpolator(qr.f27653f);
        this.f27994s.addListener(new qi0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f27994s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        ni0 ni0Var = this.v;
        if (!this.f27993r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f27991f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f27989b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f27990c = y3;
                if (y3 >= ni0Var.getTop() && this.f27989b >= ni0Var.getLeft() && this.f27989b <= ni0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f27988a;
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
                    if (this.f27988a == null) {
                        this.f27988a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f27989b));
                    float y10 = ((int) motionEvent.getY()) - this.f27990c;
                    this.f27988a.addMovement(motionEvent);
                    if (this.e && !this.f27991f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f27997y) {
                        this.f27990c = (int) motionEvent.getY();
                        this.e = false;
                        this.f27991f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f27991f) {
                        float translationY2 = ni0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        ni0Var.setTranslationY(f7);
                        this.f27990c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f27988a == null) {
                        this.f27988a = VelocityTracker.obtain();
                    }
                    this.f27988a.computeCurrentVelocity(1000);
                    float translationY3 = ni0Var.getTranslationY();
                    if (!this.f27991f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f27991f = false;
                    } else {
                        float xVelocity = this.f27988a.getXVelocity();
                        float yVelocity = this.f27988a.getYVelocity();
                        if ((ni0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ni0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(qr.f27654g);
                            this.h.addListener(new qi0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f27991f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f27988a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f27988a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f27991f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f27993r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27993r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f27992n);
        setMeasuredDimension(size, size2);
        ni0 ni0Var = this.v;
        ni0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f27996x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != ni0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27993r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f27991f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
