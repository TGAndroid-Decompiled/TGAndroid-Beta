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
public final class qh0 extends FrameLayout {
    public static final int N = 0;
    public boolean A;
    public gr B;
    public bc0 C;
    public bc0 D;
    public org.telegram.ui.vb0 E;
    public oh0 F;
    public TextView G;
    public boolean H;
    public TLRPC.User I;
    public int J;
    public boolean K;
    public nh0 L;
    public org.telegram.ui.xb0 M;
    public VelocityTracker f31942a;
    public int f31943b;
    public int f31944c;
    public int d;
    public boolean f31945e;
    public boolean f31946f;
    public AnimatorSet h;
    public Rect f31947n;
    public boolean f31948r;
    public AnimatorSet f31949s;
    public mh0 v;
    public boolean f31950w;
    public int f31951x;
    public int f31952y;

    public final void a() {
        mh0 mh0Var = this.v;
        if (this.f31948r) {
            return;
        }
        this.f31948r = true;
        AnimatorSet animatorSet = this.f31949s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f31949s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31949s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(mh0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + mh0Var.getMeasuredHeight()));
        if (this.A) {
            float measuredHeight = mh0Var.getMeasuredHeight();
            this.f31949s.setDuration(Math.max(60, (int) (((measuredHeight - mh0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.A = false;
        } else {
            this.f31949s.setDuration(250L);
        }
        this.f31949s.setInterpolator(gr.f28844f);
        this.f31949s.addListener(new ph0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f31949s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        mh0 mh0Var = this.v;
        if (!this.f31948r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f31946f && !this.f31945e && motionEvent.getPointerCount() == 1)) {
                this.f31943b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f31944c = y10;
                if (y10 >= mh0Var.getTop() && this.f31943b >= mh0Var.getLeft() && this.f31943b <= mh0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f31945e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f31942a;
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
                    if (this.f31942a == null) {
                        this.f31942a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f31943b));
                    float y11 = ((int) motionEvent.getY()) - this.f31944c;
                    this.f31942a.addMovement(motionEvent);
                    if (this.f31945e && !this.f31946f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.f31952y) {
                        this.f31944c = (int) motionEvent.getY();
                        this.f31945e = false;
                        this.f31946f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f31946f) {
                        float translationY2 = mh0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        mh0Var.setTranslationY(f10);
                        this.f31944c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f31942a == null) {
                        this.f31942a = VelocityTracker.obtain();
                    }
                    this.f31942a.computeCurrentVelocity(1000);
                    float translationY3 = mh0Var.getTranslationY();
                    if (!this.f31946f && translationY3 == 0.0f) {
                        this.f31945e = false;
                        this.f31946f = false;
                    } else {
                        float xVelocity = this.f31942a.getXVelocity();
                        float yVelocity = this.f31942a.getYVelocity();
                        if ((mh0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(mh0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(gr.f28845g);
                            this.h.addListener(new ph0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.A = true;
                            a();
                        }
                        this.f31946f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f31942a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f31942a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f31945e) || this.f31946f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qh0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f31948r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qh0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31948r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qh0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        getRootView();
        getWindowVisibleDisplayFrame(this.f31947n);
        setMeasuredDimension(size, size2);
        mh0 mh0Var = this.v;
        mh0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f31951x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != mh0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31948r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f31945e && !this.f31946f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
