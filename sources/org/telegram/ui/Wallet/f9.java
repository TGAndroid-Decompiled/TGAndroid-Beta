package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.kr;
import org.telegram.ui.rf;
public final class f9 extends FrameLayout {
    public final ImageView f44311a;
    public final m4 f44312b;
    public float f44313c;
    public float d;
    public float f44314e;
    public float f44315f;
    public int h;
    public float f44316n;
    public float f44317r;
    public boolean f44318s;
    public ValueAnimator f44319w;
    public r1.g f44320x;

    public f9(Context context) {
        super(context);
        this.f44314e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f44311a = imageView;
        imageView.setImageResource(2131231961);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, c8.na.c(-1.0f, -1));
        m4 m4Var = new m4(this, context, new m(this, 11));
        this.f44312b = m4Var;
        addView(m4Var, c8.na.c(-1.0f, -1));
    }

    public final void a(float f10) {
        if (this.f44320x == null) {
            r1.g gVar = new r1.g(new r1.f(this.f44314e));
            this.f44320x = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f56446m = hVar;
            this.f44320x.f(0.001f);
            this.f44320x.b(new z3(this, 1));
        }
        this.f44320x.c(f10);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f44315f = (float) Math.IEEEremainder((this.f44315f + this.f44313c) - c(), 6.283185307179586d);
        this.f44318s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44319w = ofFloat;
        ofFloat.setDuration(350L);
        this.f44319w.setInterpolator(kr.h);
        this.f44319w.addUpdateListener(new rf(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 8));
        this.f44319w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f44315f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44312b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f44312b.setPaused(true);
        ValueAnimator valueAnimator = this.f44319w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        r1.g gVar = this.f44320x;
        if (gVar != null) {
            gVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m4 m4Var = this.f44312b;
        int i7 = 0;
        if (m4Var.f59674n && m4Var.getVisibility() == 0) {
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
                                this.f44316n = motionEvent.getX(i7);
                                this.f44317r = motionEvent.getY(i7);
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
                            float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.f24225p;
                            this.f44313c = com.google.android.gms.internal.vision.e2.z(motionEvent.getX(findPointerIndex), this.f44316n, radians, this.f44313c);
                            this.d = com.google.android.gms.internal.vision.e2.z(motionEvent.getY(findPointerIndex), this.f44317r, radians, this.d);
                            this.f44316n = motionEvent.getX(findPointerIndex);
                            this.f44317r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f44318s && this.f44314e <= 1.001f) {
                this.f44313c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.f44319w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f44319w = null;
            }
            this.f44318s = false;
            this.h = motionEvent.getPointerId(0);
            this.f44316n = motionEvent.getX();
            this.f44317r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
