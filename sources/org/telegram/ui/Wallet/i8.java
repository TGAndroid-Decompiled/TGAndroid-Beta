package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bs;
import org.telegram.ui.dg;
public final class i8 extends FrameLayout {
    public final ImageView f34330a;
    public final m3 f34331b;
    public float f34332c;
    public float d;
    public float e;
    public float f34333f;
    public int h;
    public float f34334n;
    public float f34335r;
    public boolean f34336s;
    public ValueAnimator v;
    public o1.k f34337w;

    public i8(Context context) {
        super(context);
        this.e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f34330a = imageView;
        imageView.setImageResource(R.drawable.mini_gram_72);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, w7.z5.c(-1.0f, -1));
        m3 m3Var = new m3(this, context, new n(this, 11));
        this.f34331b = m3Var;
        addView(m3Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(float f7) {
        if (this.f34337w == null) {
            o1.k kVar = new o1.k(new o1.j(this.e));
            this.f34337w = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f17559u = lVar;
            this.f34337w.e(0.001f);
            this.f34337w.b(new a3(this, 1));
        }
        this.f34337w.g(f7);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f34333f = (float) Math.IEEEremainder((this.f34333f + this.f34332c) - c(), 6.283185307179586d);
        this.f34336s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = ofFloat;
        ofFloat.setDuration(350L);
        this.v.setInterpolator(bs.h);
        this.v.addUpdateListener(new dg(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.v.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34333f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34331b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34331b.setPaused(true);
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o1.k kVar = this.f34337w;
        if (kVar != null) {
            kVar.c();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m3 m3Var = this.f34331b;
        int i10 = 0;
        if (m3Var.f47183n && m3Var.getVisibility() == 0) {
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
                                this.f34334n = motionEvent.getX(i10);
                                this.f34335r = motionEvent.getY(i10);
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
                            float radians = ((float) Math.toRadians(0.800000011920929d)) / AndroidUtilities.density;
                            this.f34332c = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getX(findPointerIndex), this.f34334n, radians, this.f34332c);
                            this.d = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getY(findPointerIndex), this.f34335r, radians, this.d);
                            this.f34334n = motionEvent.getX(findPointerIndex);
                            this.f34335r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f34336s && this.e <= 1.001f) {
                this.f34332c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            this.f34336s = false;
            this.h = motionEvent.getPointerId(0);
            this.f34334n = motionEvent.getX();
            this.f34335r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
