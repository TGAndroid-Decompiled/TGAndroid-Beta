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
public final class jj0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public hs F;
    public ud0 G;
    public ud0 H;
    public org.telegram.ui.pc0 I;
    public hj0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public gj0 P;
    public org.telegram.ui.rc0 Q;
    public VelocityTracker f27723a;
    public int f27724b;
    public int f27725c;
    public int d;
    public boolean f27726e;
    public boolean f27727f;
    public AnimatorSet h;
    public Rect f27728n;
    public boolean f27729r;
    public AnimatorSet f27730s;
    public fj0 v;
    public boolean f27731w;
    public int f27732x;
    public int f27733y;

    public final void a() {
        fj0 fj0Var = this.v;
        if (this.f27729r) {
            return;
        }
        this.f27729r = true;
        AnimatorSet animatorSet = this.f27730s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f27730s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27730s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(fj0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + fj0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = fj0Var.getMeasuredHeight();
            this.f27730s.setDuration(Math.max(60, (int) (((measuredHeight - fj0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f27730s.setDuration(250L);
        }
        this.f27730s.setInterpolator(hs.f27118f);
        this.f27730s.addListener(new ij0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f27730s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        fj0 fj0Var = this.v;
        if (!this.f27729r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f27727f && !this.f27726e && motionEvent.getPointerCount() == 1)) {
                this.f27724b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f27725c = y3;
                if (y3 >= fj0Var.getTop() && this.f27724b >= fj0Var.getLeft() && this.f27724b <= fj0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f27726e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f27723a;
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
                    if (this.f27723a == null) {
                        this.f27723a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f27724b));
                    float y10 = ((int) motionEvent.getY()) - this.f27725c;
                    this.f27723a.addMovement(motionEvent);
                    if (this.f27726e && !this.f27727f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f27733y) {
                        this.f27725c = (int) motionEvent.getY();
                        this.f27726e = false;
                        this.f27727f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f27727f) {
                        float translationY2 = fj0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        fj0Var.setTranslationY(f7);
                        this.f27725c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f27723a == null) {
                        this.f27723a = VelocityTracker.obtain();
                    }
                    this.f27723a.computeCurrentVelocity(1000);
                    float translationY3 = fj0Var.getTranslationY();
                    if (!this.f27727f && translationY3 == 0.0f) {
                        this.f27726e = false;
                        this.f27727f = false;
                    } else {
                        float xVelocity = this.f27723a.getXVelocity();
                        float yVelocity = this.f27723a.getYVelocity();
                        if ((fj0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(fj0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(hs.f27119g);
                            this.h.addListener(new ij0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f27727f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f27723a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f27723a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.f27726e) || this.f27727f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jj0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f27729r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jj0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27729r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jj0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f27728n);
        setMeasuredDimension(size, size2);
        fj0 fj0Var = this.v;
        fj0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f27732x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != fj0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27729r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f27726e && !this.f27727f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
