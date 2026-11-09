package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.xq;
import org.telegram.ui.sf;
public final class n8 extends FrameLayout {
    public final ImageView f42898a;
    public final a4 f42899b;
    public float f42900c;
    public float d;
    public float f42901e;
    public float f42902f;
    public int h;
    public float f42903n;
    public float f42904r;
    public boolean f42905s;
    public ValueAnimator f42906w;
    public r1.g f42907x;

    public n8(Context context) {
        super(context);
        this.f42901e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f42898a = imageView;
        imageView.setImageResource(2131231957);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, c8.ha.c(-1.0f, -1));
        a4 a4Var = new a4(this, context, new l(this, 11));
        this.f42899b = a4Var;
        addView(a4Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(float f10) {
        if (this.f42907x == null) {
            r1.g gVar = new r1.g(new r1.f(this.f42901e));
            this.f42907x = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f54280m = hVar;
            this.f42907x.f(0.001f);
            this.f42907x.b(new o3(this, 1));
        }
        this.f42907x.c(f10);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f42902f = (float) Math.IEEEremainder((this.f42902f + this.f42900c) - c(), 6.283185307179586d);
        this.f42905s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42906w = ofFloat;
        ofFloat.setDuration(350L);
        this.f42906w.setInterpolator(xq.h);
        this.f42906w.addUpdateListener(new sf(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.f42906w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f42902f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42899b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f42899b.setPaused(true);
        ValueAnimator valueAnimator = this.f42906w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        r1.g gVar = this.f42907x;
        if (gVar != null) {
            gVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a4 a4Var = this.f42899b;
        int i7 = 0;
        if (a4Var.f57507n && a4Var.getVisibility() == 0) {
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
                                this.f42903n = motionEvent.getX(i7);
                                this.f42904r = motionEvent.getY(i7);
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
                            this.f42900c = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), this.f42903n, radians, this.f42900c);
                            this.d = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), this.f42904r, radians, this.d);
                            this.f42903n = motionEvent.getX(findPointerIndex);
                            this.f42904r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f42905s && this.f42901e <= 1.001f) {
                this.f42900c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.f42906w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f42906w = null;
            }
            this.f42905s = false;
            this.h = motionEvent.getPointerId(0);
            this.f42903n = motionEvent.getX();
            this.f42904r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
