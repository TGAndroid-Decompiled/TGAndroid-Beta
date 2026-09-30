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
public final class si0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public tr F;
    public hd0 G;
    public hd0 H;
    public org.telegram.ui.kc0 I;
    public qi0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public pi0 P;
    public org.telegram.ui.mc0 Q;
    public VelocityTracker f28264a;
    public int f28265b;
    public int f28266c;
    public int d;
    public boolean e;
    public boolean f28267f;
    public AnimatorSet h;
    public Rect f28268n;
    public boolean f28269r;
    public AnimatorSet f28270s;
    public oi0 v;
    public boolean f28271w;
    public int f28272x;
    public int f28273y;

    public final void a() {
        oi0 oi0Var = this.v;
        if (this.f28269r) {
            return;
        }
        this.f28269r = true;
        AnimatorSet animatorSet = this.f28270s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f28270s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28270s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(oi0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + oi0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = oi0Var.getMeasuredHeight();
            this.f28270s.setDuration(Math.max(60, (int) (((measuredHeight - oi0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f28270s.setDuration(250L);
        }
        this.f28270s.setInterpolator(tr.f28636f);
        this.f28270s.addListener(new ri0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f28270s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        oi0 oi0Var = this.v;
        if (!this.f28269r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f28267f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f28265b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f28266c = y3;
                if (y3 >= oi0Var.getTop() && this.f28265b >= oi0Var.getLeft() && this.f28265b <= oi0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f28264a;
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
                    if (this.f28264a == null) {
                        this.f28264a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f28265b));
                    float y10 = ((int) motionEvent.getY()) - this.f28266c;
                    this.f28264a.addMovement(motionEvent);
                    if (this.e && !this.f28267f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f28273y) {
                        this.f28266c = (int) motionEvent.getY();
                        this.e = false;
                        this.f28267f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f28267f) {
                        float translationY2 = oi0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        oi0Var.setTranslationY(f7);
                        this.f28266c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f28264a == null) {
                        this.f28264a = VelocityTracker.obtain();
                    }
                    this.f28264a.computeCurrentVelocity(1000);
                    float translationY3 = oi0Var.getTranslationY();
                    if (!this.f28267f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f28267f = false;
                    } else {
                        float xVelocity = this.f28264a.getXVelocity();
                        float yVelocity = this.f28264a.getYVelocity();
                        if ((oi0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(oi0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(tr.f28637g);
                            this.h.addListener(new ri0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f28267f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f28264a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f28264a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f28267f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f28269r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28269r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f28268n);
        setMeasuredDimension(size, size2);
        oi0 oi0Var = this.v;
        oi0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f28272x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != oi0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28269r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f28267f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
