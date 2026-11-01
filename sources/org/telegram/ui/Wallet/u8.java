package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.eg;
public final class u8 extends FrameLayout {
    public final ImageView f35287a;
    public final c4 f35288b;
    public float f35289c;
    public float d;
    public float e;
    public float f35290f;
    public int h;
    public float f35291n;
    public float f35292r;
    public boolean f35293s;
    public ValueAnimator f35294w;
    public o1.j f35295x;

    public u8(Context context) {
        super(context);
        this.e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f35287a = imageView;
        imageView.setImageResource(2131231956);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, w7.b6.c(-1.0f, -1));
        c4 c4Var = new c4(this, context, new l(this, 11));
        this.f35288b = c4Var;
        addView(c4Var, w7.b6.c(-1.0f, -1));
    }

    public final void a(float f7) {
        if (this.f35295x == null) {
            o1.j jVar = new o1.j(new o1.i(this.e));
            this.f35295x = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.f13958m = kVar;
            this.f35295x.f(0.001f);
            this.f35295x.b(new q3(this, 1));
        }
        this.f35295x.c(f7);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f35290f = (float) Math.IEEEremainder((this.f35290f + this.f35289c) - c(), 6.283185307179586d);
        this.f35293s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35294w = ofFloat;
        ofFloat.setDuration(350L);
        this.f35294w.setInterpolator(gr.h);
        this.f35294w.addUpdateListener(new eg(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.f35294w.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f35290f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35288b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f35288b.setPaused(true);
        ValueAnimator valueAnimator = this.f35294w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o1.j jVar = this.f35295x;
        if (jVar != null) {
            jVar.d();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c4 c4Var = this.f35288b;
        int i10 = 0;
        if (c4Var.f12000n && c4Var.getVisibility() == 0) {
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
                                    i10 = 1;
                                }
                                this.h = motionEvent.getPointerId(i10);
                                this.f35291n = motionEvent.getX(i10);
                                this.f35292r = motionEvent.getY(i10);
                                return true;
                            }
                            return true;
                        }
                    } else {
                        int i11 = this.h;
                        if (i11 != -1) {
                            int findPointerIndex = motionEvent.findPointerIndex(i11);
                            if (findPointerIndex < 0) {
                                b();
                                return true;
                            }
                            float radians = ((float) Math.toRadians(0.800000011920929d)) / org.telegram.messenger.i0.f16171p;
                            this.f35289c = c3.i0.z(motionEvent.getX(findPointerIndex), this.f35291n, radians, this.f35289c);
                            this.d = c3.i0.z(motionEvent.getY(findPointerIndex), this.f35292r, radians, this.d);
                            this.f35291n = motionEvent.getX(findPointerIndex);
                            this.f35292r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f35293s && this.e <= 1.001f) {
                this.f35289c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.f35294w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f35294w = null;
            }
            this.f35293s = false;
            this.h = motionEvent.getPointerId(0);
            this.f35291n = motionEvent.getX();
            this.f35292r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
