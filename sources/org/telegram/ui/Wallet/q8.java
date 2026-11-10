package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.wq;
import org.telegram.ui.sf;
public final class q8 extends FrameLayout {
    public final ImageView f43074a;
    public final c4 f43075b;
    public float f43076c;
    public float d;
    public float f43077e;
    public float f43078f;
    public int h;
    public float f43079n;
    public float f43080r;
    public boolean f43081s;
    public ValueAnimator f43082w;
    public r1.g f43083x;

    public q8(Context context) {
        super(context);
        this.f43077e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f43074a = imageView;
        imageView.setImageResource(2131231957);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, c8.ha.c(-1.0f, -1));
        c4 c4Var = new c4(this, context, new l(this, 11));
        this.f43075b = c4Var;
        addView(c4Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(float f10) {
        if (this.f43083x == null) {
            r1.g gVar = new r1.g(new r1.f(this.f43077e));
            this.f43083x = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f54279m = hVar;
            this.f43083x.f(0.001f);
            this.f43083x.b(new q3(this, 1));
        }
        this.f43083x.c(f10);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f43078f = (float) Math.IEEEremainder((this.f43078f + this.f43076c) - c(), 6.283185307179586d);
        this.f43081s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43082w = ofFloat;
        ofFloat.setDuration(350L);
        this.f43082w.setInterpolator(wq.h);
        this.f43082w.addUpdateListener(new sf(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.f43082w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f43078f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43075b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f43075b.setPaused(true);
        ValueAnimator valueAnimator = this.f43082w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        r1.g gVar = this.f43083x;
        if (gVar != null) {
            gVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c4 c4Var = this.f43075b;
        int i7 = 0;
        if (c4Var.f57503n && c4Var.getVisibility() == 0) {
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
                                this.f43079n = motionEvent.getX(i7);
                                this.f43080r = motionEvent.getY(i7);
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
                            float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.f22566p;
                            this.f43076c = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), this.f43079n, radians, this.f43076c);
                            this.d = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), this.f43080r, radians, this.d);
                            this.f43079n = motionEvent.getX(findPointerIndex);
                            this.f43080r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f43081s && this.f43077e <= 1.001f) {
                this.f43076c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.f43082w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f43082w = null;
            }
            this.f43081s = false;
            this.h = motionEvent.getPointerId(0);
            this.f43079n = motionEvent.getX();
            this.f43080r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
