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
public final class mi0 extends FrameLayout {
    public static final int O = 0;
    public boolean B;
    public mr C;
    public xc0 D;
    public xc0 E;
    public org.telegram.ui.jc0 F;
    public ki0 G;
    public TextView H;
    public boolean I;
    public TLRPC.User J;
    public int K;
    public boolean L;
    public ji0 M;
    public org.telegram.ui.lc0 N;
    public VelocityTracker f27063a;
    public int f27064b;
    public int f27065c;
    public int d;
    public boolean e;
    public boolean f27066f;
    public AnimatorSet h;
    public Rect f27067n;
    public boolean f27068r;
    public AnimatorSet f27069s;
    public ii0 v;
    public boolean f27070w;
    public int f27071x;
    public int f27072y;

    public final void a() {
        ii0 ii0Var = this.v;
        if (this.f27068r) {
            return;
        }
        this.f27068r = true;
        AnimatorSet animatorSet = this.f27069s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f27069s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27069s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ii0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + ii0Var.getMeasuredHeight()));
        if (this.B) {
            float measuredHeight = ii0Var.getMeasuredHeight();
            this.f27069s.setDuration(Math.max(60, (int) (((measuredHeight - ii0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.B = false;
        } else {
            this.f27069s.setDuration(250L);
        }
        this.f27069s.setInterpolator(mr.f27122f);
        this.f27069s.addListener(new li0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f27069s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        float translationY;
        ii0 ii0Var = this.v;
        if (!this.f27068r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f27066f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f27064b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f27065c = y10;
                if (y10 >= ii0Var.getTop() && this.f27064b >= ii0Var.getLeft() && this.f27064b <= ii0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f27063a;
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
                    if (this.f27063a == null) {
                        this.f27063a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f27064b));
                    float y11 = ((int) motionEvent.getY()) - this.f27065c;
                    this.f27063a.addMovement(motionEvent);
                    if (this.e && !this.f27066f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.f27072y) {
                        this.f27065c = (int) motionEvent.getY();
                        this.e = false;
                        this.f27066f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f27066f) {
                        float translationY2 = ii0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        ii0Var.setTranslationY(f10);
                        this.f27065c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f27063a == null) {
                        this.f27063a = VelocityTracker.obtain();
                    }
                    this.f27063a.computeCurrentVelocity(1000);
                    float translationY3 = ii0Var.getTranslationY();
                    if (!this.f27066f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f27066f = false;
                    } else {
                        float xVelocity = this.f27063a.getXVelocity();
                        float yVelocity = this.f27063a.getYVelocity();
                        if ((ii0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ii0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(mr.f27123g);
                            this.h.addListener(new li0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.B = true;
                            a();
                        }
                        this.f27066f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f27063a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f27063a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z4 && this.e) || this.f27066f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f27068r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27068r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f27067n);
        setMeasuredDimension(size, size2);
        ii0 ii0Var = this.v;
        ii0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f27071x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != ii0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27068r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        if (this.e && !this.f27066f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
