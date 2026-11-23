package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.ri;
import org.telegram.ui.i71;
public final class y9 extends GestureDetector.SimpleOnGestureListener {
    public final int f32575a;
    public final View f32576b;

    public y9(int i7, View view) {
        this.f32575a = i7;
        this.f32576b = view;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f32575a) {
            case 0:
                z9 z9Var = (z9) this.f32576b;
                int i7 = z9Var.f31411a6;
                boolean z10 = false;
                if (z9Var.Cd == 2 && ri.d0(i7).S() != null) {
                    boolean H5 = z9Var.getMessageObject().H5(ch.p0.b(ri.d0(i7).S()), false);
                    z9Var.y3(z9Var.getMessageObject(), null, false, false, false, false);
                    z9Var.requestLayout();
                    ch.l0.b(false);
                    z10 = true;
                    if (H5) {
                        ba baVar = z9Var.Dd;
                        ch.l0.d(baVar.f30549x, null, baVar.f30545n[1], null, motionEvent.getX(), motionEvent.getY(), ch.p0.b(ri.d0(i7).S()), z9Var.f31411a6, 0);
                        ch.l0.f();
                    }
                    z9Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 1));
                }
                return z10;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f32575a) {
            case 1:
                vg.e eVar = (vg.e) this.f32576b;
                eVar.f59546n = true;
                eVar.b();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f32575a) {
            case 1:
                vg.f fVar = ((vg.e) this.f32576b).f59541a;
                fVar.d -= f10 * 0.5f;
                fVar.f59558i -= f11 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i7 = this.f32575a;
        View view = this.f32576b;
        switch (i7) {
            case 1:
                vg.e eVar = (vg.e) view;
                vg.f fVar = eVar.f59541a;
                if (Math.abs(fVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, eVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y10 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    eVar.b();
                    float f10 = fVar.d;
                    float f11 = fVar.f59558i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    eVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    eVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    eVar.d.addUpdateListener(new hi.q6(this, f10, x10, f11, y10, 2));
                    eVar.d.addListener(new i71(this, 21));
                    eVar.d.start();
                    return true;
                }
                return true;
            case 2:
                zh.j jVar = (zh.j) view;
                if (!jVar.f62125e.f62128c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (jVar.f62125e.f62130f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= jVar.f62125e.f62130f.getRight() || jVar.f62125e.f62130f.getTop() >= motionEvent.getY() || motionEvent.getY() >= jVar.f62125e.f62130f.getBottom())) {
                    jVar.f62125e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
