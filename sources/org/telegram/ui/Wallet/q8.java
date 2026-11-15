package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.er;
import org.telegram.ui.pf;
public final class q8 extends FrameLayout {
    public final ImageView f44395a;
    public final b4 f44396b;
    public float f44397c;
    public float d;
    public float f44398e;
    public float f44399f;
    public int h;
    public float f44400n;
    public float f44401r;
    public boolean f44402s;
    public ValueAnimator f44403w;
    public r1.g f44404x;

    public q8(Context context) {
        super(context);
        this.f44398e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f44395a = imageView;
        imageView.setImageResource(2131231957);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, c8.ja.c(-1.0f, -1));
        b4 b4Var = new b4(this, context, new l(this, 11));
        this.f44396b = b4Var;
        addView(b4Var, c8.ja.c(-1.0f, -1));
    }

    public final void a(float f10) {
        if (this.f44404x == null) {
            r1.g gVar = new r1.g(new r1.f(this.f44398e));
            this.f44404x = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f55748m = hVar;
            this.f44404x.f(0.001f);
            this.f44404x.b(new p3(this, 1));
        }
        this.f44404x.c(f10);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f44399f = (float) Math.IEEEremainder((this.f44399f + this.f44397c) - c(), 6.283185307179586d);
        this.f44402s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44403w = ofFloat;
        ofFloat.setDuration(350L);
        this.f44403w.setInterpolator(er.h);
        this.f44403w.addUpdateListener(new pf(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.f44403w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f44399f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44396b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f44396b.setPaused(true);
        ValueAnimator valueAnimator = this.f44403w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        r1.g gVar = this.f44404x;
        if (gVar != null) {
            gVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b4 b4Var = this.f44396b;
        int i7 = 0;
        if (b4Var.f58979n && b4Var.getVisibility() == 0) {
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
                                this.f44400n = motionEvent.getX(i7);
                                this.f44401r = motionEvent.getY(i7);
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
                            float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.f23608p;
                            this.f44397c = com.google.android.gms.internal.vision.e2.z(motionEvent.getX(findPointerIndex), this.f44400n, radians, this.f44397c);
                            this.d = com.google.android.gms.internal.vision.e2.z(motionEvent.getY(findPointerIndex), this.f44401r, radians, this.d);
                            this.f44400n = motionEvent.getX(findPointerIndex);
                            this.f44401r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f44402s && this.f44398e <= 1.001f) {
                this.f44397c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.f44403w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f44403w = null;
            }
            this.f44402s = false;
            this.h = motionEvent.getPointerId(0);
            this.f44400n = motionEvent.getX();
            this.f44401r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
