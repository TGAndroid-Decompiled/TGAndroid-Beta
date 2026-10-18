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
public final class aj0 extends FrameLayout {
    public static final int R = 0;
    public boolean E;
    public bs F;
    public od0 G;
    public od0 H;
    public org.telegram.ui.vb0 I;
    public yi0 J;
    public TextView K;
    public boolean L;
    public TLRPC.User M;
    public int N;
    public boolean O;
    public xi0 P;
    public org.telegram.ui.xb0 Q;
    public VelocityTracker f24602a;
    public int f24603b;
    public int f24604c;
    public int d;
    public boolean e;
    public boolean f24605f;
    public AnimatorSet h;
    public Rect f24606n;
    public boolean f24607r;
    public AnimatorSet f24608s;
    public wi0 v;
    public boolean f24609w;
    public int f24610x;
    public int f24611y;

    public final void a() {
        wi0 wi0Var = this.v;
        if (this.f24607r) {
            return;
        }
        this.f24607r = true;
        AnimatorSet animatorSet = this.f24608s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24608s = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24608s = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(wi0Var, View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + wi0Var.getMeasuredHeight()));
        if (this.E) {
            float measuredHeight = wi0Var.getMeasuredHeight();
            this.f24608s.setDuration(Math.max(60, (int) (((measuredHeight - wi0Var.getTranslationY()) * 250.0f) / measuredHeight)));
            this.E = false;
        } else {
            this.f24608s.setDuration(250L);
        }
        this.f24608s.setInterpolator(bs.f25030f);
        this.f24608s.addListener(new zi0(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.f24608s.start();
    }

    public final boolean b(MotionEvent motionEvent, boolean z10) {
        float translationY;
        wi0 wi0Var = this.v;
        if (!this.f24607r) {
            if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f24605f && !this.e && motionEvent.getPointerCount() == 1)) {
                this.f24603b = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                this.f24604c = y3;
                if (y3 >= wi0Var.getTop() && this.f24603b >= wi0Var.getLeft() && this.f24603b <= wi0Var.getRight()) {
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    AnimatorSet animatorSet = this.h;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.h = null;
                    }
                    VelocityTracker velocityTracker = this.f24602a;
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
                    if (this.f24602a == null) {
                        this.f24602a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.f24603b));
                    float y10 = ((int) motionEvent.getY()) - this.f24604c;
                    this.f24602a.addMovement(motionEvent);
                    if (this.e && !this.f24605f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= this.f24611y) {
                        this.f24604c = (int) motionEvent.getY();
                        this.e = false;
                        this.f24605f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f24605f) {
                        float translationY2 = wi0Var.getTranslationY() + y10;
                        if (translationY2 >= 0.0f) {
                            f7 = translationY2;
                        }
                        wi0Var.setTranslationY(f7);
                        this.f24604c = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f24602a == null) {
                        this.f24602a = VelocityTracker.obtain();
                    }
                    this.f24602a.computeCurrentVelocity(1000);
                    float translationY3 = wi0Var.getTranslationY();
                    if (!this.f24605f && translationY3 == 0.0f) {
                        this.e = false;
                        this.f24605f = false;
                    } else {
                        float xVelocity = this.f24602a.getXVelocity();
                        float yVelocity = this.f24602a.getYVelocity();
                        if ((wi0Var.getTranslationY() < AndroidUtilities.getPixelsInCM(0.8f, false) && (yVelocity < 3500.0f || Math.abs(yVelocity) < Math.abs(xVelocity))) || (yVelocity < 0.0f && Math.abs(yVelocity) >= 3500.0f)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.h = animatorSet2;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(wi0Var, View.TRANSLATION_Y, 0.0f));
                            this.h.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.h.setInterpolator(bs.f25031g);
                            this.h.addListener(new zi0(this, 0));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.h.start();
                        } else {
                            this.E = true;
                            a();
                        }
                        this.f24605f = false;
                    }
                    VelocityTracker velocityTracker2 = this.f24602a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f24602a = null;
                    }
                    this.d = -1;
                }
            }
            if ((!z10 && this.e) || this.f24605f) {
                return true;
            }
        }
        return false;
    }

    public final void c(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj0.c(boolean):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f24607r) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj0.getValue():float");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f24607r || b(motionEvent, true)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aj0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        getRootView();
        getWindowVisibleDisplayFrame(this.f24606n);
        setMeasuredDimension(size, size2);
        wi0 wi0Var = this.v;
        wi0Var.measure(View.MeasureSpec.makeMeasureSpec((this.f24610x * 2) + size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != wi0Var) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f24607r && !b(motionEvent, false)) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f24605f) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
