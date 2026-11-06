package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.xq;
import org.telegram.ui.sf;
public final class p8 extends FrameLayout {
    public final ImageView f43019a;
    public final c4 f43020b;
    public float f43021c;
    public float d;
    public float f43022e;
    public float f43023f;
    public int h;
    public float f43024n;
    public float f43025r;
    public boolean f43026s;
    public ValueAnimator f43027w;
    public r1.g f43028x;

    public p8(Context context) {
        super(context);
        this.f43022e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f43019a = imageView;
        imageView.setImageResource(2131231957);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, c8.ha.c(-1.0f, -1));
        c4 c4Var = new c4(this, context, new l(this, 11));
        this.f43020b = c4Var;
        addView(c4Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(float f10) {
        if (this.f43028x == null) {
            r1.g gVar = new r1.g(new r1.f(this.f43022e));
            this.f43028x = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f54175m = hVar;
            this.f43028x.f(0.001f);
            this.f43028x.b(new q3(this, 1));
        }
        this.f43028x.c(f10);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f43023f = (float) Math.IEEEremainder((this.f43023f + this.f43021c) - c(), 6.283185307179586d);
        this.f43026s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43027w = ofFloat;
        ofFloat.setDuration(350L);
        this.f43027w.setInterpolator(xq.h);
        this.f43027w.addUpdateListener(new sf(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.f43027w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f43023f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43020b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f43020b.setPaused(true);
        ValueAnimator valueAnimator = this.f43027w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        r1.g gVar = this.f43028x;
        if (gVar != null) {
            gVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c4 c4Var = this.f43020b;
        int i7 = 0;
        if (c4Var.f57403n && c4Var.getVisibility() == 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                if (this.h != -1) {
                                }
                            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == this.h) {
                                if (motionEvent.getActionIndex() == 0) {
                                    i7 = 1;
                                }
                                this.h = motionEvent.getPointerId(i7);
                                this.f43024n = motionEvent.getX(i7);
                                this.f43025r = motionEvent.getY(i7);
                                return true;
                            }
                            return true;
                        }
                    } else {
                        int i10 = this.h;
                        if (i10 != -1) {
                            int findPointerIndex = motionEvent.findPointerIndex(i10);
                            if (findPointerIndex < 0) {
                                b();
                                return true;
                            }
                            float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.f22536p;
                            this.f43021c = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), this.f43024n, radians, this.f43021c);
                            this.d = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), this.f43025r, radians, this.d);
                            this.f43024n = motionEvent.getX(findPointerIndex);
                            this.f43025r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f43026s && this.f43022e <= 1.001f) {
                this.f43021c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.f43027w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f43027w = null;
            }
            this.f43026s = false;
            this.h = motionEvent.getPointerId(0);
            this.f43024n = motionEvent.getX();
            this.f43025r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
