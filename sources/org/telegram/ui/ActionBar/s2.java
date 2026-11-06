package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.xq;
public abstract class s2 extends FrameLayout implements a6 {
    public float D;
    public boolean E;
    public final Paint F;
    public final v2 G;
    public VelocityTracker f28482a;
    public int f28483b;
    public int f28484c;
    public int d;
    public boolean f28485e;
    public boolean f28486f;
    public AnimatorSet h;
    public final e2.r0 f28487n;
    public final Rect f28488r;
    public final Paint f28489s;
    public boolean f28490w;
    public int f28491x;
    public float f28492y;

    public s2(v2 v2Var, Context context) {
        super(context);
        this.G = v2Var;
        this.f28482a = null;
        this.d = -1;
        this.f28485e = false;
        this.f28486f = false;
        this.h = null;
        this.f28488r = new Rect();
        this.f28489s = new Paint();
        this.f28492y = 0.0f;
        this.D = 0.0f;
        this.F = new Paint(1);
        this.f28487n = new Object();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.G.r0();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        this.G.D(hashSet);
    }

    public final void b(float f10, float f11) {
        v2 v2Var = this.G;
        float translationY = v2Var.f28615b.getTranslationY();
        if ((translationY < org.telegram.messenger.g0.a1(false, 0.8f) && (f11 < 3500.0f || Math.abs(f11) < Math.abs(f10))) || (f11 < 0.0f && Math.abs(f11) >= 3500.0f)) {
            this.f28485e = false;
            this.h = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new q2(this, 1));
            this.h.playTogether(ObjectAnimator.ofFloat(v2Var.f28615b, "translationY", 0.0f), ofFloat);
            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.g0.a1(false, 0.8f)) * 250.0f));
            this.h.setInterpolator(xq.f40329f);
            this.h.addListener(new r2(this, 0));
            qs.e().k(qs.f25004j1, 512);
            this.h.start();
            return;
        }
        boolean z9 = v2Var.f28621d0;
        v2Var.f28621d0 = false;
        v2Var.dismiss();
        v2Var.f28621d0 = z9;
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        float max;
        int left;
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.f28489s;
        v2 v2Var = this.G;
        if (i10 >= 26) {
            int i11 = v2Var.F0;
            if (i11 >= 0) {
                paint.setColor(k6.w0(i11, v2Var.I0));
            } else {
                paint.setColor(v2Var.G0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!v2Var.V0 || v2Var.f28615b.getVisibility() == 0) {
            boolean z9 = v2Var.f28636n;
            float f11 = 0.0f;
            if ((z9 && v2Var.R != 0) || v2Var.E0 != 0.0f) {
                if (z9) {
                    i7 = v2Var.Q();
                } else {
                    i7 = 0;
                }
                if (!v2Var.f28648w && (i10 < 29 || v2.B(v2Var) <= 0)) {
                    max = 0.0f;
                } else if (v2Var.f28643s) {
                    max = Math.max(0.0f, Math.min(i7 - v2Var.E0, v2Var.f28615b.getTranslationY()));
                } else {
                    max = Math.max(0.0f, v2Var.Q() - (v2Var.f28615b.getMeasuredHeight() - v2Var.f28615b.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (v2Var.V0) {
                    f10 *= v2Var.f28615b.getAlpha();
                }
                if (v2Var.V0) {
                    left = (int) v2Var.f28615b.getX();
                } else {
                    left = v2Var.f28615b.getLeft();
                }
                int i12 = left;
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 < 0) {
                    paint.setAlpha((int) (alpha * f10));
                }
                canvas.drawRect(v2Var.f28645t0 + i12, ((getMeasuredHeight() - i7) + max) - v2Var.E0, v2Var.f28615b.getRight() - v2Var.f28645t0, getMeasuredHeight() + max, paint);
                paint.setAlpha(alpha);
                int i14 = v2Var.f28622d1;
                if (i14 != 0) {
                    paint.setColor(i14);
                    int alpha2 = paint.getAlpha();
                    float R0 = org.telegram.messenger.g0.R0(i7);
                    if (i13 < 0) {
                        paint.setAlpha((int) (alpha2 * f10 * R0));
                    } else {
                        f11 = max;
                    }
                    if (paint.getAlpha() > 0) {
                        canvas.drawRect(i12 + v2Var.f28645t0, ((getMeasuredHeight() - i7) + f11) - v2Var.E0, v2Var.f28615b.getRight() - v2Var.f28645t0, getMeasuredHeight() + f11, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z9) {
        v2 v2Var = this.G;
        l2 l2Var = v2Var.f28618c;
        int i7 = v2Var.f28632i0;
        if (!v2Var.I) {
            if (!v2Var.f0(motionEvent)) {
                if (!v2Var.I(motionEvent) && !this.E) {
                    if (v2Var.H() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f28486f && !this.f28485e && motionEvent.getPointerCount() == 1)) {
                        this.f28483b = (int) motionEvent.getX();
                        int y10 = (int) motionEvent.getY();
                        this.f28484c = y10;
                        if (v2Var.X(this.f28483b, y10)) {
                            v2Var.o0();
                            return true;
                        }
                        this.d = motionEvent.getPointerId(0);
                        this.f28485e = true;
                        a();
                        VelocityTracker velocityTracker = this.f28482a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (v2Var.G() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f28482a == null) {
                            this.f28482a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f28483b));
                        float y11 = ((int) motionEvent.getY()) - this.f28484c;
                        this.f28482a.addMovement(motionEvent);
                        if (!v2Var.D0 && this.f28485e && !this.f28486f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= i7) {
                            this.f28484c = (int) motionEvent.getY();
                            this.f28485e = false;
                            this.f28486f = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.f28486f) {
                            float f10 = this.f28492y + y11;
                            this.f28492y = f10;
                            float max = Math.max(f10, 0.0f);
                            this.f28492y = max;
                            v2Var.f28615b.setTranslationY(Math.max(max, 0.0f));
                            v2Var.h0();
                            this.f28484c = (int) motionEvent.getY();
                            l2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f28482a == null) {
                            this.f28482a = VelocityTracker.obtain();
                        }
                        this.f28482a.computeCurrentVelocity(1000);
                        if (!this.f28486f && this.f28492y <= 0.0f) {
                            this.f28485e = false;
                        } else {
                            b(this.f28482a.getXVelocity(), this.f28482a.getYVelocity());
                        }
                        this.f28486f = false;
                        VelocityTracker velocityTracker2 = this.f28482a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f28482a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f28486f && !this.f28485e && motionEvent.getPointerCount() == 1)) {
                    this.E = true;
                    this.f28483b = (int) motionEvent.getX();
                    this.f28484c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.f28485e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f28483b;
                    float y12 = motionEvent.getY() - this.f28484c;
                    if (this.f28482a == null) {
                        this.f28482a = VelocityTracker.obtain();
                    }
                    this.f28482a.addMovement(motionEvent);
                    if (!v2Var.D0 && this.f28485e && !this.f28486f && x10 > 0.0f && x10 / 3.0f > Math.abs(y12) && Math.abs(x10) >= i7) {
                        this.f28483b = (int) motionEvent.getX();
                        this.f28485e = false;
                        this.f28486f = true;
                    } else if (this.f28486f) {
                        float f11 = this.D + x10;
                        this.D = f11;
                        v2Var.f28615b.setTranslationX(Math.max(f11, 0.0f));
                        this.f28483b = (int) motionEvent.getX();
                        l2Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f28482a == null) {
                        this.f28482a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f28482a.getXVelocity();
                    float yVelocity = this.f28482a.getYVelocity();
                    if (this.D < v2Var.f28615b.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max2 = Math.max(this.D, 0.0f);
                        this.D = max2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 0.0f);
                        ofFloat.addUpdateListener(new q2(this, 2));
                        ofFloat.addListener(new r2(this, 1));
                        ofFloat.setInterpolator(xq.f40329f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.D, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new q2(this, 3));
                        ofFloat2.addListener(new r2(this, 2));
                        xq xqVar = xq.h;
                        ofFloat2.setInterpolator(xqVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new q2(this, 4));
                        ofFloat3.setInterpolator(xqVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.f28485e = false;
                    this.f28486f = false;
                    this.d = -1;
                    this.E = false;
                }
                if ((z9 || !this.f28485e) && !this.f28486f && (v2Var.G() || v2Var.I(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof CameraView) {
            if (this.G.H0()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j3);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f28487n.b();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9;
        int i7;
        int i10;
        int i11;
        Paint paint = this.f28489s;
        int alpha = paint.getAlpha();
        v2 v2Var = this.G;
        int i12 = 0;
        if (alpha < 255 && v2Var.f28636n) {
            float f10 = 0.0f;
            if (v2Var.f28648w || (Build.VERSION.SDK_INT >= 29 && v2.B(v2Var) > 0)) {
                f10 = Math.max(0.0f, v2Var.Q() - (v2Var.f28615b.getMeasuredHeight() - v2Var.f28615b.getTranslationY()));
            }
            if (v2Var.f28636n) {
                i11 = v2Var.Q();
            } else {
                i11 = 0;
            }
            canvas.save();
            canvas.clipRect(v2Var.f28615b.getLeft() + v2Var.f28645t0, ((getMeasuredHeight() - i11) + f10) - v2Var.E0, v2Var.f28615b.getRight() - v2Var.f28645t0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z9 = true;
        } else {
            canvas2 = canvas;
            z9 = false;
        }
        super.onDraw(canvas2);
        if (v2Var.f28636n && v2Var.h != null && v2Var.f28626f != 0) {
            int i13 = v2Var.f28613a0;
            if (i13 >= 0) {
                i7 = k6.w0(i13, v2Var.I0);
            } else {
                i7 = 0;
            }
            paint.setColor(i7);
            float left = v2Var.f28615b.getLeft() + v2Var.f28645t0;
            int measuredHeight = getMeasuredHeight() - v2Var.f28626f;
            if (v2Var.f28636n) {
                i10 = v2Var.Q();
            } else {
                i10 = 0;
            }
            float f11 = measuredHeight - i10;
            float right = v2Var.f28615b.getRight() - v2Var.f28645t0;
            int measuredHeight2 = getMeasuredHeight();
            if (v2Var.f28636n) {
                i12 = v2Var.Q();
            }
            canvas2.drawRect(left, f11, right, measuredHeight2 - i12, paint);
        }
        v2Var.d0();
        if (z9) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        v2 v2Var = this.G;
        if (!v2Var.G() && !v2Var.I(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.s2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        v2 v2Var = this.G;
        if (!v2Var.I && v2Var.f28640q0) {
            a();
            float translationY = v2Var.f28615b.getTranslationY();
            float f10 = 0.0f;
            if (translationY > 0.0f && i10 > 0) {
                float f11 = translationY - i10;
                iArr[1] = i10;
                if (f11 >= 0.0f) {
                    f10 = f11;
                }
                v2Var.f28615b.setTranslationY(f10);
                v2Var.h0();
                v2Var.f28618c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        v2 v2Var = this.G;
        if (!v2Var.I && v2Var.f28640q0) {
            a();
            if (i12 != 0) {
                float translationY = v2Var.f28615b.getTranslationY() - i12;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                v2Var.f28615b.setTranslationY(translationY);
                v2Var.h0();
                v2Var.f28618c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f28487n.f10533a = i7;
        v2 v2Var = this.G;
        if (!v2Var.I && v2Var.f28640q0) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        v2 v2Var = this.G;
        if (!v2Var.I && v2Var.f28640q0 && i7 == 2 && !v2Var.G()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f28487n.f10533a = 0;
        v2 v2Var = this.G;
        if (!v2Var.I && v2Var.f28640q0) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        if (this.f28485e && !this.f28486f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override
    public final void updateColors() {
        v2 v2Var = this.G;
        try {
            v2.A(v2Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        v2Var.s0();
    }
}
