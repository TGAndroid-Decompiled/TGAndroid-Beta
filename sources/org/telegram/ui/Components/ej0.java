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
    public ds F;
    public nd0 G;
    public nd0 H;
    public org.telegram.ui.yb0 I;
    public cj0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public bj0 P;
    public org.telegram.ui.zb0 Q;
    public VelocityTracker f27859a;
    public int f27860b;
    public int f27861c;
    public int d;
    public boolean e;
    public boolean f27862f;
    public AnimatorSet h;
    public Rect f27863n;
    public boolean f27864r;
    public AnimatorSet f27865s;
    public aj0 v;
    public boolean f27866w;
    public int f27867x;
    public int f27868y;

    public final void a() {
        aj0 aj0Var = this.v;
        if (this.f27864r) {
            return;
        }
        this.f27864r = true;
        AnimatorSet animatorSet = this.f27865s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f27865s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27865s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + aj0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = aj0Var.getMeasuredHeight();
            this.f27865s.setDuration(Math.max(60, (int) (((measuredHeight - aj0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f27865s.setDuration(250L);
        }
        this.f27865s.setInterpolator(ds.f27530f);
        this.f27865s.addListener(new dj0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f27865s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        aj0 aj0Var = this.v;
        if (!this.f27864r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f27862f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f27860b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f27861c = y3;
                if (y3 >= aj0Var.getTop() && this.f27860b >= aj0Var.getLeft() && this.f27860b <= aj0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f27859a;
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
                    if (this.f27859a == null) {
                        this.f27859a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f27860b));
                    float y10 = ((int) motionEvent.getY()) - this.f27861c;
                    this.f27859a.addMovement(motionEvent);
                    if (this.e && !this.f27862f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f27868y) {
                        this.f27861c = (int) motionEvent.getY();
                        this.e = false;
                        this.f27862f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f27862f) {
                        float translationY2 = aj0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        aj0Var.setTranslationY(f7);
                        this.f27861c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f27859a == null) {
                        this.f27859a = VelocityTracker.obtain();
                    }
                    this.f27859a.computeCurrentVelocity(1000);
                    float translationY3 = aj0Var.getTranslationY();
                    if (!this.f27862f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f27862f = false;
                    } else {
                        float xVelocity = this.f27859a.getXVelocity();
                        float yVelocity = this.f27859a.getYVelocity();
                        if ((aj0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(ds.f27531g);
                            this.h.addListener(new dj0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f27862f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f27859a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f27859a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f27862f) {
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
        if (this.f27864r) {
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
        if (this.f27864r || b(motionEvent, true)) {
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
        getWindowVisibleDisplayFrame(this.f27863n);
        setMeasuredDimension(size, size2);
        aj0 aj0Var = this.v;
        aj0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f27867x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        if (!this.f27864r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f27862f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
