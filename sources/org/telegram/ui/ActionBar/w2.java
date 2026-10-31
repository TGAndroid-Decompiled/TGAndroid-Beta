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
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
public abstract class w2 extends FrameLayout implements k6 {
    public float D;
    public boolean E;
    public final Paint F;
    public final z2 G;
    public VelocityTracker f21432a;
    public int f21433b;
    public int f21434c;
    public int d;
    public boolean e;
    public boolean f21435f;
    public AnimatorSet h;
    public final ac.g f21436n;
    public final Rect f21437r;
    public final Paint f21438s;
    public boolean f21439w;
    public int f21440x;
    public float f21441y;

    public w2(z2 z2Var, Context context) {
        super(context);
        this.G = z2Var;
        this.f21432a = null;
        this.d = -1;
        this.e = false;
        this.f21435f = false;
        this.h = null;
        this.f21437r = new Rect();
        this.f21438s = new Paint();
        this.f21441y = 0.0f;
        this.D = 0.0f;
        this.F = new Paint(1);
        this.f21436n = new Object();
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
        this.G.F(hashSet);
    }

    public final void b(float f7, float f10) {
        z2 z2Var = this.G;
        float translationY = z2Var.f21586b.getTranslationY();
        if ((translationY < org.telegram.messenger.i0.a1(false, 0.8f) && (f10 < 3500.0f || Math.abs(f10) < Math.abs(f7))) || (f10 < 0.0f && Math.abs(f10) >= 3500.0f)) {
            this.e = false;
            this.h = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new u2(this, 1));
            this.h.playTogether(ObjectAnimator.ofFloat(z2Var.f21586b, "translationY", 0.0f), ofFloat);
            this.h.setDuration((int) ((Math.max(0.0f, translationY) / org.telegram.messenger.i0.a1(false, 0.8f)) * 250.0f));
            this.h.setInterpolator(gr.f26495f);
            this.h.addListener(new v2(this, 0));
            zs.e().k(zs.f19633j1, 512);
            this.h.start();
            return;
        }
        boolean z10 = z2Var.f21592d0;
        z2Var.f21592d0 = false;
        z2Var.dismiss();
        z2Var.f21592d0 = z10;
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        float max;
        int left;
        int i11 = Build.VERSION.SDK_INT;
        Paint paint = this.f21438s;
        z2 z2Var = this.G;
        if (i11 >= 26) {
            int i12 = z2Var.F0;
            if (i12 >= 0) {
                paint.setColor(t6.w0(i12, z2Var.I0));
            } else {
                paint.setColor(z2Var.G0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!z2Var.V0 || z2Var.f21586b.getVisibility() == 0) {
            boolean z10 = z2Var.f21606n;
            float f10 = 0.0f;
            if ((z10 && z2Var.R != 0) || z2Var.E0 != 0.0f) {
                if (z10) {
                    i10 = z2Var.R();
                } else {
                    i10 = 0;
                }
                if (!z2Var.f21618w && (i11 < 29 || z2.D(z2Var) <= 0)) {
                    max = 0.0f;
                } else if (z2Var.f21613s) {
                    max = Math.max(0.0f, Math.min(i10 - z2Var.E0, z2Var.f21586b.getTranslationY()));
                } else {
                    max = Math.max(0.0f, z2Var.R() - (z2Var.f21586b.getMeasuredHeight() - z2Var.f21586b.getTranslationY()));
                }
                int alpha = paint.getAlpha();
                if (z2Var.V0) {
                    f7 *= z2Var.f21586b.getAlpha();
                }
                if (z2Var.V0) {
                    left = (int) z2Var.f21586b.getX();
                } else {
                    left = z2Var.f21586b.getLeft();
                }
                int i13 = left;
                int i14 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i14 < 0) {
                    paint.setAlpha((int) (alpha * f7));
                }
                canvas.drawRect(z2Var.f21615t0 + i13, ((getMeasuredHeight() - i10) + max) - z2Var.E0, z2Var.f21586b.getRight() - z2Var.f21615t0, getMeasuredHeight() + max, paint);
                paint.setAlpha(alpha);
                int i15 = z2Var.f21593d1;
                if (i15 != 0) {
                    paint.setColor(i15);
                    int alpha2 = paint.getAlpha();
                    float R0 = org.telegram.messenger.i0.R0(i10);
                    if (i14 < 0) {
                        paint.setAlpha((int) (alpha2 * f7 * R0));
                    } else {
                        f10 = max;
                    }
                    if (paint.getAlpha() > 0) {
                        canvas.drawRect(i13 + z2Var.f21615t0, ((getMeasuredHeight() - i10) + f10) - z2Var.E0, z2Var.f21586b.getRight() - z2Var.f21615t0, getMeasuredHeight() + f10, paint);
                    }
                    paint.setAlpha(alpha2);
                }
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        z2 z2Var = this.G;
        p2 p2Var = z2Var.f21589c;
        int i10 = z2Var.f21602i0;
        if (!z2Var.I) {
            if (!z2Var.f0(motionEvent)) {
                if (!z2Var.J(motionEvent) && !this.E) {
                    if (z2Var.I() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f21435f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.f21433b = (int) motionEvent.getX();
                        int y3 = (int) motionEvent.getY();
                        this.f21434c = y3;
                        if (z2Var.Y(this.f21433b, y3)) {
                            z2Var.o0();
                            return true;
                        }
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                        VelocityTracker velocityTracker = this.f21432a;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    } else if (z2Var.H() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        if (this.f21432a == null) {
                            this.f21432a = VelocityTracker.obtain();
                        }
                        float abs = Math.abs((int) (motionEvent.getX() - this.f21433b));
                        float y10 = ((int) motionEvent.getY()) - this.f21434c;
                        this.f21432a.addMovement(motionEvent);
                        if (!z2Var.D0 && this.e && !this.f21435f && y10 > 0.0f && y10 / 3.0f > Math.abs(abs) && Math.abs(y10) >= i10) {
                            this.f21434c = (int) motionEvent.getY();
                            this.e = false;
                            this.f21435f = true;
                            requestDisallowInterceptTouchEvent(true);
                        } else if (this.f21435f) {
                            float f7 = this.f21441y + y10;
                            this.f21441y = f7;
                            float max = Math.max(f7, 0.0f);
                            this.f21441y = max;
                            z2Var.f21586b.setTranslationY(Math.max(max, 0.0f));
                            z2Var.h0();
                            this.f21434c = (int) motionEvent.getY();
                            p2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.f21432a == null) {
                            this.f21432a = VelocityTracker.obtain();
                        }
                        this.f21432a.computeCurrentVelocity(1000);
                        if (!this.f21435f && this.f21441y <= 0.0f) {
                            this.e = false;
                        } else {
                            b(this.f21432a.getXVelocity(), this.f21432a.getYVelocity());
                        }
                        this.f21435f = false;
                        VelocityTracker velocityTracker2 = this.f21432a;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.f21432a = null;
                        }
                        this.d = -1;
                    }
                } else if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f21435f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.E = true;
                    this.f21433b = (int) motionEvent.getX();
                    this.f21434c = (int) motionEvent.getY();
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    float x10 = motionEvent.getX() - this.f21433b;
                    float y11 = motionEvent.getY() - this.f21434c;
                    if (this.f21432a == null) {
                        this.f21432a = VelocityTracker.obtain();
                    }
                    this.f21432a.addMovement(motionEvent);
                    if (!z2Var.D0 && this.e && !this.f21435f && x10 > 0.0f && x10 / 3.0f > Math.abs(y11) && Math.abs(x10) >= i10) {
                        this.f21433b = (int) motionEvent.getX();
                        this.e = false;
                        this.f21435f = true;
                    } else if (this.f21435f) {
                        float f10 = this.D + x10;
                        this.D = f10;
                        z2Var.f21586b.setTranslationX(Math.max(f10, 0.0f));
                        this.f21433b = (int) motionEvent.getX();
                        p2Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.f21432a == null) {
                        this.f21432a = VelocityTracker.obtain();
                    }
                    float xVelocity = this.f21432a.getXVelocity();
                    float yVelocity = this.f21432a.getYVelocity();
                    if (this.D < z2Var.f21586b.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float max2 = Math.max(this.D, 0.0f);
                        this.D = max2;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 0.0f);
                        ofFloat.addUpdateListener(new u2(this, 2));
                        ofFloat.addListener(new v2(this, 1));
                        ofFloat.setInterpolator(gr.f26495f);
                        ofFloat.setDuration(220L);
                        ofFloat.start();
                    } else {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.D, getMeasuredWidth());
                        ofFloat2.addUpdateListener(new u2(this, 3));
                        ofFloat2.addListener(new v2(this, 2));
                        gr grVar = gr.h;
                        ofFloat2.setInterpolator(grVar);
                        ofFloat2.setDuration(320L);
                        ofFloat2.start();
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat3.addUpdateListener(new u2(this, 4));
                        ofFloat3.setInterpolator(grVar);
                        ofFloat3.setDuration(320L);
                        ofFloat3.start();
                    }
                    this.e = false;
                    this.f21435f = false;
                    this.d = -1;
                    this.E = false;
                }
                if ((z10 || !this.e) && !this.f21435f && (z2Var.H() || z2Var.J(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof CameraView) {
            if (this.G.H0()) {
                c(canvas, 1.0f);
            }
            return super.drawChild(canvas, view, j10);
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public int getNestedScrollAxes() {
        return this.f21436n.b();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        int i10;
        int i11;
        int i12;
        Paint paint = this.f21438s;
        int alpha = paint.getAlpha();
        z2 z2Var = this.G;
        int i13 = 0;
        if (alpha < 255 && z2Var.f21606n) {
            float f7 = 0.0f;
            if (z2Var.f21618w || (Build.VERSION.SDK_INT >= 29 && z2.D(z2Var) > 0)) {
                f7 = Math.max(0.0f, z2Var.R() - (z2Var.f21586b.getMeasuredHeight() - z2Var.f21586b.getTranslationY()));
            }
            if (z2Var.f21606n) {
                i12 = z2Var.R();
            } else {
                i12 = 0;
            }
            canvas.save();
            canvas.clipRect(z2Var.f21586b.getLeft() + z2Var.f21615t0, ((getMeasuredHeight() - i12) + f7) - z2Var.E0, z2Var.f21586b.getRight() - z2Var.f21615t0, getMeasuredHeight() + f7, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        } else {
            canvas2 = canvas;
            z10 = false;
        }
        super.onDraw(canvas2);
        if (z2Var.f21606n && z2Var.h != null && z2Var.f21596f != 0) {
            int i14 = z2Var.f21584a0;
            if (i14 >= 0) {
                i10 = t6.w0(i14, z2Var.I0);
            } else {
                i10 = 0;
            }
            paint.setColor(i10);
            float left = z2Var.f21586b.getLeft() + z2Var.f21615t0;
            int measuredHeight = getMeasuredHeight() - z2Var.f21596f;
            if (z2Var.f21606n) {
                i11 = z2Var.R();
            } else {
                i11 = 0;
            }
            float f10 = measuredHeight - i11;
            float right = z2Var.f21586b.getRight() - z2Var.f21615t0;
            int measuredHeight2 = getMeasuredHeight();
            if (z2Var.f21606n) {
                i13 = z2Var.R();
            }
            canvas2.drawRect(left, f10, right, measuredHeight2 - i13, paint);
        }
        z2Var.d0();
        if (z10) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.G;
        if (!z2Var.H() && !z2Var.J(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return d(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        z2 z2Var = this.G;
        if (!z2Var.I && z2Var.f21610q0) {
            a();
            float translationY = z2Var.f21586b.getTranslationY();
            float f7 = 0.0f;
            if (translationY > 0.0f && i11 > 0) {
                float f10 = translationY - i11;
                iArr[1] = i11;
                if (f10 >= 0.0f) {
                    f7 = f10;
                }
                z2Var.f21586b.setTranslationY(f7);
                z2Var.h0();
                z2Var.f21589c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        z2 z2Var = this.G;
        if (!z2Var.I && z2Var.f21610q0) {
            a();
            if (i13 != 0) {
                float translationY = z2Var.f21586b.getTranslationY() - i13;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                z2Var.f21586b.setTranslationY(translationY);
                z2Var.h0();
                z2Var.f21589c.invalidate();
            }
        }
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f21436n.f385a = i10;
        z2 z2Var = this.G;
        if (!z2Var.I && z2Var.f21610q0) {
            a();
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        z2 z2Var = this.G;
        if (!z2Var.I && z2Var.f21610q0 && i10 == 2 && !z2Var.H()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onStopNestedScroll(View view) {
        this.f21436n.f385a = 0;
        z2 z2Var = this.G;
        if (!z2Var.I && z2Var.f21610q0) {
            b(0.0f, 0.0f);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f21435f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override
    public final void updateColors() {
        z2 z2Var = this.G;
        try {
            z2.B(z2Var);
        } catch (Exception e) {
            f8.g(e, true);
        }
        z2Var.s0();
    }
}
