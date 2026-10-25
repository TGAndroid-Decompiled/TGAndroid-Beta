package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.dg;
public final class i8 extends FrameLayout {
    public final ImageView f36680a;
    public final l3 f36681b;
    public float f36682c;
    public float d;
    public float e;
    public float f36683f;
    public int h;
    public float f36684n;
    public float f36685r;
    public boolean f36686s;
    public ValueAnimator v;
    public o1.j f36687w;

    public i8(Context context) {
        super(context);
        this.e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f36680a = imageView;
        imageView.setImageResource(R.drawable.mini_gram_72);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, gb1.g(-1.0f, -1));
        l3 l3Var = new l3(this, context, new m(this, 11));
        this.f36681b = l3Var;
        addView(l3Var, gb1.g(-1.0f, -1));
    }

    public final void a(float f7) {
        if (this.f36687w == null) {
            o1.j jVar = new o1.j(new ac.a(this.e));
            this.f36687w = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.f18969u = kVar;
            this.f36687w.e(0.001f);
            this.f36687w.b(new z2(this, 1));
        }
        this.f36687w.g(f7);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f36683f = (float) Math.IEEEremainder((this.f36683f + this.f36682c) - c(), 6.283185307179586d);
        this.f36686s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = ofFloat;
        ofFloat.setDuration(350L);
        this.v.setInterpolator(ds.h);
        this.v.addUpdateListener(new dg(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.v.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f36683f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36681b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f36681b.setPaused(true);
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o1.j jVar = this.f36687w;
        if (jVar != null) {
            jVar.c();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l3 l3Var = this.f36681b;
        int i10 = 0;
        if (l3Var.f49891n && l3Var.getVisibility() == 0) {
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
                                this.f36684n = motionEvent.getX(i10);
                                this.f36685r = motionEvent.getY(i10);
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
                            this.f36682c = c3.h0.z(motionEvent.getX(findPointerIndex), this.f36684n, radians, this.f36682c);
                            this.d = c3.h0.z(motionEvent.getY(findPointerIndex), this.f36685r, radians, this.d);
                            this.f36684n = motionEvent.getX(findPointerIndex);
                            this.f36685r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f36686s && this.e <= 1.001f) {
                this.f36682c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            this.f36686s = false;
            this.h = motionEvent.getPointerId(0);
            this.f36684n = motionEvent.getX();
            this.f36685r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
