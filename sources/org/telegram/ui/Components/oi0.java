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
public final class oi0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public qr F;
    public cd0 G;
    public cd0 H;
    public org.telegram.ui.sc0 I;
    public mi0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public li0 P;
    public org.telegram.ui.uc0 Q;
    public VelocityTracker f26942a;
    public int f26943b;
    public int f26944c;
    public int d;
    public boolean e;
    public boolean f26945f;
    public AnimatorSet h;
    public Rect f26946n;
    public boolean f26947r;
    public AnimatorSet f26948s;
    public ki0 v;
    public boolean f26949w;
    public int f26950x;
    public int f26951y;

    public final void a() {
        ki0 ki0Var = this.v;
        if (this.f26947r) {
            return;
        }
        this.f26947r = true;
        AnimatorSet animatorSet = this.f26948s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26948s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26948s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ki0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + ki0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = ki0Var.getMeasuredHeight();
            this.f26948s.setDuration(Math.max(60, (int) (((measuredHeight - ki0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f26948s.setDuration(250L);
        }
        this.f26948s.setInterpolator(qr.f27642f);
        this.f26948s.addListener(new ni0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f26948s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        ki0 ki0Var = this.v;
        if (!this.f26947r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f26945f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f26943b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f26944c = y3;
                if (y3 >= ki0Var.getTop() && this.f26943b >= ki0Var.getLeft() && this.f26943b <= ki0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f26942a;
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
                    if (this.f26942a == null) {
                        this.f26942a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f26943b));
                    float y10 = ((int) motionEvent.getY()) - this.f26944c;
                    this.f26942a.addMovement(motionEvent);
                    if (this.e && !this.f26945f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f26951y) {
                        this.f26944c = (int) motionEvent.getY();
                        this.e = false;
                        this.f26945f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f26945f) {
                        float translationY2 = ki0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        ki0Var.setTranslationY(f7);
                        this.f26944c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f26942a == null) {
                        this.f26942a = VelocityTracker.obtain();
                    }
                    this.f26942a.computeCurrentVelocity(1000);
                    float translationY3 = ki0Var.getTranslationY();
                    if (!this.f26945f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f26945f = false;
                    } else {
                        float xVelocity = this.f26942a.getXVelocity();
                        float yVelocity = this.f26942a.getYVelocity();
                        if ((ki0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ki0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(qr.f27643g);
                            this.h.addListener(new ni0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f26945f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f26942a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f26942a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f26945f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oi0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f26947r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oi0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26947r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oi0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f26946n);
        setMeasuredDimension(size, size2);
        ki0 ki0Var = this.v;
        ki0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f26950x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != ki0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26947r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f26945f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
