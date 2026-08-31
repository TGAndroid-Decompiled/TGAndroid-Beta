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
    public VelocityTracker f29511a;
    public int f29512b;
    public int f29513c;
    public int d;
    public boolean f29514e;
    public boolean f29515f;
    public AnimatorSet h;
    public Rect f29516n;
    public boolean f29517r;
    public AnimatorSet f29518s;
    public ji0 v;
    public boolean f29519w;
    public int f29520x;
    public int f29521y;

    public final void a() {
        ji0 ji0Var = this.v;
        if (this.f29517r) {
            return;
        }
        this.f29517r = true;
        AnimatorSet animatorSet = this.f29518s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f29518s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f29518s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(ji0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + ji0Var.getMeasuredHeight()));
        if (this.B) {
            float measuredHeight = ji0Var.getMeasuredHeight();
            this.f29518s.setDuration(Math.max(60, (int) (((measuredHeight - ji0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.B = false;
        } else {
            this.f29518s.setDuration(250L);
        }
        this.f29518s.setInterpolator(pr.f30183f);
        this.f29518s.addListener(new mi0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f29518s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z4) {
        float translationY;
        ji0 ji0Var = this.v;
        if (!this.f29517r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f29515f && !this.f29514e && motionEvent.getPointerCount() == 1)) {
                this.f29512b = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.f29513c = y10;
                if (y10 >= ji0Var.getTop() && this.f29512b >= ji0Var.getLeft() && this.f29512b <= ji0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.f29514e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f29511a;
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
                    if (this.f29511a == null) {
                        this.f29511a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f29512b));
                    float y11 = ((int) motionEvent.getY()) - this.f29513c;
                    this.f29511a.addMovement(motionEvent);
                    if (this.f29514e && !this.f29515f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= this.f29521y) {
                        this.f29513c = (int) motionEvent.getY();
                        this.f29514e = false;
                        this.f29515f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f29515f) {
                        float translationY2 = ji0Var.getTranslationY() + y11;
                        if (translationY2 >= 0.0f) {
                            f10 = translationY2;
                        }
                        ji0Var.setTranslationY(f10);
                        this.f29513c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f29511a == null) {
                        this.f29511a = VelocityTracker.obtain();
                    }
                    this.f29511a.computeCurrentVelocity(1000);
                    float translationY3 = ji0Var.getTranslationY();
                    if (!this.f29515f && translationY3 == 0.0f) {
                        this.f29514e = false;
                        this.f29515f = false;
                    } else {
                        float xVelocity = this.f29511a.getXVelocity();
                        float yVelocity = this.f29511a.getYVelocity();
                        if ((ji0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(ji0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(pr.f30184g);
                            this.h.addListener(new mi0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.B = true;
                            a();
                        }
                        this.f29515f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f29511a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f29511a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z4 && this.f29514e) || this.f29515f) {
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
        if (this.f29517r) {
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
        if (this.f29517r || b(motionEvent, true)) {
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
        getWindowVisibleDisplayFrame(this.f29516n);
        setMeasuredDimension(size, size2);
        ji0 ji0Var = this.v;
        ji0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f29520x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        if (!this.f29517r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        if (this.f29514e && !this.f29515f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
