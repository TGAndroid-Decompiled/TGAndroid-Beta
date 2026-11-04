package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.of;
public final class o8 extends FrameLayout {
    public final ImageView f43014a;
    public final a4 f43015b;
    public float f43016c;
    public float d;
    public float f43017e;
    public float f43018f;
    public int h;
    public float f43019n;
    public float f43020r;
    public boolean f43021s;
    public ValueAnimator f43022w;
    public q1.g f43023x;

    public o8(Context context) {
        super(context);
        this.f43017e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f43014a = imageView;
        imageView.setImageResource(2131231957);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, mf.c(-1.0f, -1));
        a4 a4Var = new a4(this, context, new l(this, 11));
        this.f43015b = a4Var;
        addView(a4Var, mf.c(-1.0f, -1));
    }

    public final void a(float f10) {
        if (this.f43023x == null) {
            q1.g gVar = new q1.g(new q1.f(this.f43017e));
            this.f43023x = gVar;
            q1.h hVar = new q1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f53653m = hVar;
            this.f43023x.f(0.001f);
            this.f43023x.b(new o3(this, 1));
        }
        this.f43023x.c(f10);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f43018f = (float) Math.IEEEremainder((this.f43018f + this.f43016c) - c(), 6.283185307179586d);
        this.f43021s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f43022w = ofFloat;
        ofFloat.setDuration(350L);
        this.f43022w.setInterpolator(xq.h);
        this.f43022w.addUpdateListener(new of(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.f43022w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f43018f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43015b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f43015b.setPaused(true);
        ValueAnimator valueAnimator = this.f43022w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        q1.g gVar = this.f43023x;
        if (gVar != null) {
            gVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a4 a4Var = this.f43015b;
        int i3 = 0;
        if (a4Var.f57750n && a4Var.getVisibility() == 0) {
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
                                    i3 = 1;
                                }
                                this.h = motionEvent.getPointerId(i3);
                                this.f43019n = motionEvent.getX(i3);
                                this.f43020r = motionEvent.getY(i3);
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
                            float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.f22607p;
                            this.f43016c = com.google.android.recaptcha.internal.a.y(motionEvent.getX(findPointerIndex), this.f43019n, radians, this.f43016c);
                            this.d = com.google.android.recaptcha.internal.a.y(motionEvent.getY(findPointerIndex), this.f43020r, radians, this.d);
                            this.f43019n = motionEvent.getX(findPointerIndex);
                            this.f43020r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f43021s && this.f43017e <= 1.001f) {
                this.f43016c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.f43022w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f43022w = null;
            }
            this.f43021s = false;
            this.h = motionEvent.getPointerId(0);
            this.f43019n = motionEvent.getX();
            this.f43020r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
