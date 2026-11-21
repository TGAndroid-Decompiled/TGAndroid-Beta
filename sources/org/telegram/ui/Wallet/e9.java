package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.nr;
import org.telegram.ui.rf;
public final class e9 extends FrameLayout {
    public final ImageView f44178a;
    public final l4 f44179b;
    public float f44180c;
    public float d;
    public float f44181e;
    public float f44182f;
    public int h;
    public float f44183n;
    public float f44184r;
    public boolean f44185s;
    public ValueAnimator f44186w;
    public r1.g f44187x;

    public e9(Context context) {
        super(context);
        this.f44181e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f44178a = imageView;
        imageView.setImageResource(2131231958);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, c8.ma.c(-1.0f, -1));
        l4 l4Var = new l4(this, context, new m(this, 11));
        this.f44179b = l4Var;
        addView(l4Var, c8.ma.c(-1.0f, -1));
    }

    public final void a(float f10) {
        if (this.f44187x == null) {
            r1.g gVar = new r1.g(new r1.f(this.f44181e));
            this.f44187x = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f56364m = hVar;
            this.f44187x.f(0.001f);
            this.f44187x.b(new y3(this, 1));
        }
        this.f44187x.c(f10);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f44182f = (float) Math.IEEEremainder((this.f44182f + this.f44180c) - c(), 6.283185307179586d);
        this.f44185s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44186w = ofFloat;
        ofFloat.setDuration(350L);
        this.f44186w.setInterpolator(nr.h);
        this.f44186w.addUpdateListener(new rf(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 8));
        this.f44186w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f44182f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44179b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f44179b.setPaused(true);
        ValueAnimator valueAnimator = this.f44186w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        r1.g gVar = this.f44187x;
        if (gVar != null) {
            gVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l4 l4Var = this.f44179b;
        int i7 = 0;
        if (l4Var.f59585n && l4Var.getVisibility() == 0) {
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
                                this.f44183n = motionEvent.getX(i7);
                                this.f44184r = motionEvent.getY(i7);
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
                            float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.g0.f24145p;
                            this.f44180c = com.google.android.gms.internal.vision.e2.z(motionEvent.getX(findPointerIndex), this.f44183n, radians, this.f44180c);
                            this.d = com.google.android.gms.internal.vision.e2.z(motionEvent.getY(findPointerIndex), this.f44184r, radians, this.d);
                            this.f44183n = motionEvent.getX(findPointerIndex);
                            this.f44184r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f44185s && this.f44181e <= 1.001f) {
                this.f44180c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.f44186w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f44186w = null;
            }
            this.f44185s = false;
            this.h = motionEvent.getPointerId(0);
            this.f44183n = motionEvent.getX();
            this.f44184r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
