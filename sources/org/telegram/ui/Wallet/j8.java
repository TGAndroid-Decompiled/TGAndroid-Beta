package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zr;
import org.telegram.ui.fg;
public final class j8 extends FrameLayout {
    public final ImageView f34651a;
    public final l3 f34652b;
    public float f34653c;
    public float d;
    public float e;
    public float f34654f;
    public int h;
    public float f34655n;
    public float f34656r;
    public boolean f34657s;
    public ValueAnimator v;
    public o1.k f34658w;

    public j8(Context context) {
        super(context);
        this.e = 1.0f;
        this.h = -1;
        setClipChildren(false);
        ImageView imageView = new ImageView(context);
        this.f34651a = imageView;
        imageView.setImageResource(R.drawable.mini_gram_72);
        imageView.setScaleX(0.7407407f);
        imageView.setScaleY(0.7407407f);
        addView(imageView, w7.z5.c(-1.0f, -1));
        l3 l3Var = new l3(this, context, new m(this, 11));
        this.f34652b = l3Var;
        addView(l3Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(float f7) {
        if (this.f34658w == null) {
            o1.k kVar = new o1.k(new o1.j(this.e));
            this.f34658w = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f17622u = lVar;
            this.f34658w.e(0.001f);
            this.f34658w.b(new z2(this, 1));
        }
        this.f34658w.g(f7);
    }

    public final void b() {
        this.h = -1;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.f34654f = (float) Math.IEEEremainder((this.f34654f + this.f34653c) - c(), 6.283185307179586d);
        this.f34657s = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = ofFloat;
        ofFloat.setDuration(350L);
        this.v.setInterpolator(zr.h);
        this.v.addUpdateListener(new fg(this, (float) Math.IEEEremainder(this.d, 6.283185307179586d), 6));
        this.v.start();
        a(1.0f);
    }

    public final float c() {
        return ((float) (((SystemClock.uptimeMillis() / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34654f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34652b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f34652b.setPaused(true);
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        o1.k kVar = this.f34658w;
        if (kVar != null) {
            kVar.c();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l3 l3Var = this.f34652b;
        int i10 = 0;
        if (l3Var.f47626n && l3Var.getVisibility() == 0) {
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
                                this.f34655n = motionEvent.getX(i10);
                                this.f34656r = motionEvent.getY(i10);
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
                            this.f34653c = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getX(findPointerIndex), this.f34655n, radians, this.f34653c);
                            this.d = com.google.android.gms.internal.play_billing.k3.y(motionEvent.getY(findPointerIndex), this.f34656r, radians, this.d);
                            this.f34655n = motionEvent.getX(findPointerIndex);
                            this.f34656r = motionEvent.getY(findPointerIndex);
                            return true;
                        }
                    }
                }
                if (this.h != -1) {
                    b();
                }
                return true;
            }
            if (!this.f34657s && this.e <= 1.001f) {
                this.f34653c = c();
                this.d = 0.0f;
            }
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            this.f34657s = false;
            this.h = motionEvent.getPointerId(0);
            this.f34655n = motionEvent.getX();
            this.f34656r = motionEvent.getY();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            a(3.0f);
            return true;
        }
        return false;
    }
}
