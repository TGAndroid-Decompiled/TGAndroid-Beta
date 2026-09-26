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
public final class pi0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public rr F;
    public ed0 G;
    public ed0 H;
    public org.telegram.ui.kc0 I;
    public ni0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public mi0 P;
    public org.telegram.ui.mc0 Q;
    public VelocityTracker f27350a;
    public int f27351b;
    public int f27352c;
    public int d;
    public boolean e;
    public boolean f27353f;
    public AnimatorSet h;
    public Rect f27354n;
    public boolean f27355r;
    public AnimatorSet f27356s;
    public li0 v;
    public boolean f27357w;
    public int f27358x;
    public int f27359y;

    public final void a() {
        li0 li0Var = this.v;
        if (this.f27355r) {
            return;
        }
        this.f27355r = true;
        AnimatorSet animatorSet = this.f27356s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f27356s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f27356s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(li0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + li0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = li0Var.getMeasuredHeight();
            this.f27356s.setDuration(Math.max(60, (int) (((measuredHeight - li0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f27356s.setDuration(250L);
        }
        this.f27356s.setInterpolator(rr.f28030f);
        this.f27356s.addListener(new oi0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f27356s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        li0 li0Var = this.v;
        if (!this.f27355r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f27353f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f27351b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f27352c = y3;
                if (y3 >= li0Var.getTop() && this.f27351b >= li0Var.getLeft() && this.f27351b <= li0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f27350a;
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
                    if (this.f27350a == null) {
                        this.f27350a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f27351b));
                    float y10 = ((int) motionEvent.getY()) - this.f27352c;
                    this.f27350a.addMovement(motionEvent);
                    if (this.e && !this.f27353f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f27359y) {
                        this.f27352c = (int) motionEvent.getY();
                        this.e = false;
                        this.f27353f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f27353f) {
                        float translationY2 = li0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        li0Var.setTranslationY(f7);
                        this.f27352c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f27350a == null) {
                        this.f27350a = VelocityTracker.obtain();
                    }
                    this.f27350a.computeCurrentVelocity(1000);
                    float translationY3 = li0Var.getTranslationY();
                    if (!this.f27353f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f27353f = false;
                    } else {
                        float xVelocity = this.f27350a.getXVelocity();
                        float yVelocity = this.f27350a.getYVelocity();
                        if ((li0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(li0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(rr.f28031g);
                            this.h.addListener(new oi0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f27353f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f27350a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f27350a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f27353f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pi0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f27355r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pi0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27355r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pi0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f27354n);
        setMeasuredDimension(size, size2);
        li0 li0Var = this.v;
        li0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f27358x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != li0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f27355r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f27353f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
