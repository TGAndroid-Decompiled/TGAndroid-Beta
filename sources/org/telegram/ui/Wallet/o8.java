package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.xq;
import org.telegram.ui.sf;
public final class o8 extends FrameLayout {
    public final ImageView f42980a;
    public final b4 f42981b;
    public float f42982c;
    public float d;
    public float f42983e;
    public float f42984f;
    public int h;
    public float f42985n;
    public float f42986r;
    public boolean f42987s;
    public ValueAnimator f42988w;
    public r1.g f42989x;

    public o8(Context context) {
        super(context);
        this.f42983e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f42980a = imageView;
        imageView.setImageResource(2131231957);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, c8.ha.c(-1.0f, -1));
        b4 b4Var = new b4(this, context, new l(this, 11));
        this.f42981b = b4Var;
        addView(b4Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(float f10) {
        if (this.f42989x == null) {
            r1.g gVar = new r1.g(new r1.f(this.f42983e));
            this.f42989x = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f54267m = hVar;
            this.f42989x.f(0.001f);
            this.f42989x.b(new p3(this, 1));
        }
        this.f42989x.c(f10);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f42984f = (float) Math.IEEEremainder((this.f42984f + this.f42982c) - c(), 6.283185307179586d);
        this.f42987s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42988w = ofFloat;
        ofFloat.setDuration(350L);
        this.f42988w.setInterpolator(xq.h);
        this.f42988w.addUpdateListener(new sf(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.f42988w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f42984f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42981b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f42981b.setPaused(true);
        ValueAnimator valueAnimator = this.f42988w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        r1.g gVar = this.f42989x;
        if (gVar != null) {
            gVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b4 b4Var = this.f42981b;
        int i7 = 0;
        if (b4Var.f57494n && b4Var.getVisibility() == 0) {
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
                                this.f42985n = motionEvent.getX(i7);
                                this.f42986r = motionEvent.getY(i7);
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
                            float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.f22562p;
                            this.f42982c = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), this.f42985n, radians, this.f42982c);
                            this.d = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), this.f42986r, radians, this.d);
                            this.f42985n = motionEvent.getX(findPointerIndex);
                            this.f42986r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f42987s && this.f42983e <= 1.001f) {
                this.f42982c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.f42988w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f42988w = null;
            }
            this.f42987s = false;
            this.h = motionEvent.getPointerId(0);
            this.f42985n = motionEvent.getX();
            this.f42986r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
