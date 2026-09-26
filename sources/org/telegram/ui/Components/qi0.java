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
public final class qi0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public sr F;
    public fd0 G;
    public fd0 H;
    public org.telegram.ui.kc0 I;
    public oi0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public ni0 P;
    public org.telegram.ui.mc0 Q;
    public VelocityTracker f27682a;
    public int f27683b;
    public int f27684c;
    public int d;
    public boolean e;
    public boolean f27685f;
    public AnimatorSet h;
    public Rect f27686n;
    public boolean f27687r;
    public AnimatorSet f27688s;
    public mi0 v;
    public boolean f27689w;
    public int f27690x;
    public int f27691y;

    public final void a() {
        mi0 mi0Var = this.v;
        if (this.f27687r) {
            return;
        }
        this.f27687r = true;
        AnimatorSet animatorSet = this.f27688s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f27688s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27688s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(mi0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + mi0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = mi0Var.getMeasuredHeight();
            this.f27688s.setDuration(Math.max(60, (int) (((measuredHeight - mi0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f27688s.setDuration(250L);
        }
        this.f27688s.setInterpolator(sr.f28339f);
        this.f27688s.addListener(new pi0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f27688s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        mi0 mi0Var = this.v;
        if (!this.f27687r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f27685f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f27683b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f27684c = y3;
                if (y3 >= mi0Var.getTop() && this.f27683b >= mi0Var.getLeft() && this.f27683b <= mi0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f27682a;
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
                    if (this.f27682a == null) {
                        this.f27682a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f27683b));
                    float y10 = ((int) motionEvent.getY()) - this.f27684c;
                    this.f27682a.addMovement(motionEvent);
                    if (this.e && !this.f27685f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f27691y) {
                        this.f27684c = (int) motionEvent.getY();
                        this.e = false;
                        this.f27685f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f27685f) {
                        float translationY2 = mi0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        mi0Var.setTranslationY(f7);
                        this.f27684c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f27682a == null) {
                        this.f27682a = VelocityTracker.obtain();
                    }
                    this.f27682a.computeCurrentVelocity(1000);
                    float translationY3 = mi0Var.getTranslationY();
                    if (!this.f27685f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f27685f = false;
                    } else {
                        float xVelocity = this.f27682a.getXVelocity();
                        float yVelocity = this.f27682a.getYVelocity();
                        if ((mi0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(mi0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(sr.f28340g);
                            this.h.addListener(new pi0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f27685f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f27682a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f27682a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f27685f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f27687r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27687r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f27686n);
        setMeasuredDimension(size, size2);
        mi0 mi0Var = this.v;
        mi0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f27690x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != mi0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27687r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f27685f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
