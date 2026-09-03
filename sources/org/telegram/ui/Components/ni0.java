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
public final class ni0 extends FrameLayout {
    public static final int O = 0;
    public boolean B;
    public pr C;
    public yc0 D;
    public yc0 E;
    public org.telegram.ui.ic0 F;
    public li0 G;
    public TextView H;
    public boolean I;
    public TLRPC.User J;
    public int K;
    public boolean L;
    public ki0 M;
    public org.telegram.ui.kc0 N;
    public VelocityTracker f29489a;
    public int f29490b;
    public int f29491c;
    public int d;
    public boolean f29492e;
    public boolean f29493f;
    public AnimatorSet h;
    public Rect f29494n;
    public boolean f29495r;
    public AnimatorSet f29496s;
    public ji0 v;
    public boolean f29497w;
    public int f29498x;
    public int f29499y;

    public final void a() {
        ji0 ji0Var = this.v;
        if (this.f29495r) {
            return;
        }
        this.f29495r = true;
        AnimatorSet animatorSet = this.f29496s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f29496s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f29496s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ji0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + ji0Var.getMeasuredHeight()));
        if (this.B) {
            float measuredHeight = ji0Var.getMeasuredHeight();
            this.f29496s.setDuration(Math.max(60, (int) (((measuredHeight - ji0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.B = false;
        } else {
            this.f29496s.setDuration(250L);
        }
        this.f29496s.setInterpolator(pr.f30168f);
        this.f29496s.addListener(new mi0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f29496s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        float translationY;
        ji0 ji0Var = this.v;
        if (!this.f29495r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f29493f && !this.f29492e && motionEvent.getPointerCount() == 1)) {
                this.f29490b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f29491c = y10;
                if (y10 >= ji0Var.getTop() && this.f29490b >= ji0Var.getLeft() && this.f29490b <= ji0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f29492e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f29489a;
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
                    if (this.f29489a == null) {
                        this.f29489a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f29490b));
                    float y11 = ((int) motionEvent.getY()) - this.f29491c;
                    this.f29489a.addMovement(motionEvent);
                    if (this.f29492e && !this.f29493f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.f29499y) {
                        this.f29491c = (int) motionEvent.getY();
                        this.f29492e = false;
                        this.f29493f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f29493f) {
                        float translationY2 = ji0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        ji0Var.setTranslationY(f10);
                        this.f29491c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f29489a == null) {
                        this.f29489a = VelocityTracker.obtain();
                    }
                    this.f29489a.computeCurrentVelocity(1000);
                    float translationY3 = ji0Var.getTranslationY();
                    if (!this.f29493f && translationY3 == 0.0f) {
                        this.f29492e = false;
                        this.f29493f = false;
                    } else {
                        float xVelocity = this.f29489a.getXVelocity();
                        float yVelocity = this.f29489a.getYVelocity();
                        if ((ji0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ji0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(pr.f30169g);
                            this.h.addListener(new mi0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.B = true;
                            a();
                        }
                        this.f29493f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f29489a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f29489a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z4 && this.f29492e) || this.f29493f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f29495r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f29495r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f29494n);
        setMeasuredDimension(size, size2);
        ji0 ji0Var = this.v;
        ji0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f29498x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != ji0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29495r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        if (this.f29492e && !this.f29493f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
