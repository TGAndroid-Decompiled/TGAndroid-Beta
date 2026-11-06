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
    public final ImageView f43018a;
    public final c4 f43019b;
    public float f43020c;
    public float d;
    public float f43021e;
    public float f43022f;
    public int h;
    public float f43023n;
    public float f43024r;
    public boolean f43025s;
    public ValueAnimator f43026w;
    public r1.g f43027x;

    public p8(Context context) {
        super(context);
        this.f43021e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f43018a = imageView;
        imageView.setImageResource(2131231957);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, c8.ha.c(-1.0f, -1));
        c4 c4Var = new c4(this, context, new l(this, 11));
        this.f43019b = c4Var;
        addView(c4Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(float f10) {
        if (this.f43027x == null) {
            r1.g gVar = new r1.g(new r1.f(this.f43021e));
            this.f43027x = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f54174m = hVar;
            this.f43027x.f(0.001f);
            this.f43027x.b(new q3(this, 1));
        }
        this.f43027x.c(f10);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f43022f = (float) Math.IEEEremainder((this.f43022f + this.f43020c) - c(), 6.283185307179586d);
        this.f43025s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43026w = ofFloat;
        ofFloat.setDuration(350L);
        this.f43026w.setInterpolator(xq.h);
        this.f43026w.addUpdateListener(new sf(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.f43026w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f43022f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43019b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f43019b.setPaused(true);
        ValueAnimator valueAnimator = this.f43026w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        r1.g gVar = this.f43027x;
        if (gVar != null) {
            gVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c4 c4Var = this.f43019b;
        int i7 = 0;
        if (c4Var.f57402n && c4Var.getVisibility() == 0) {
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
                                this.f43023n = motionEvent.getX(i7);
                                this.f43024r = motionEvent.getY(i7);
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
                            float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.f22543p;
                            this.f43020c = com.google.android.recaptcha.internal.a.z(motionEvent.getX(findPointerIndex), this.f43023n, radians, this.f43020c);
                            this.d = com.google.android.recaptcha.internal.a.z(motionEvent.getY(findPointerIndex), this.f43024r, radians, this.d);
                            this.f43023n = motionEvent.getX(findPointerIndex);
                            this.f43024r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f43025s && this.f43021e <= 1.001f) {
                this.f43020c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.f43026w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f43026w = null;
            }
            this.f43025s = false;
            this.h = motionEvent.getPointerId(0);
            this.f43023n = motionEvent.getX();
            this.f43024r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
