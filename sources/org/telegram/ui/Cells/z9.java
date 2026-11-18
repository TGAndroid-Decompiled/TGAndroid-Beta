package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.ri;
import org.telegram.ui.k71;
public final class z9 extends GestureDetector.SimpleOnGestureListener {
    public final int f32525a;
    public final View f32526b;

    public z9(int i7, View view) {
        this.f32525a = i7;
        this.f32526b = view;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f32525a) {
            case 0:
                aa aaVar = (aa) this.f32526b;
                int i7 = aaVar.f31330a6;
                boolean z10 = false;
                if (aaVar.Cd == 2 && ri.d0(i7).S() != null) {
                    boolean H5 = aaVar.getMessageObject().H5(ch.p0.b(ri.d0(i7).S()), false);
                    aaVar.y3(aaVar.getMessageObject(), null, false, false, false, false);
                    aaVar.requestLayout();
                    ch.l0.b(false);
                    z10 = true;
                    if (H5) {
                        ba baVar = aaVar.Dd;
                        ch.l0.d(baVar.f30467x, null, baVar.f30463n[1], null, motionEvent.getX(), motionEvent.getY(), ch.p0.b(ri.d0(i7).S()), aaVar.f31330a6, 0);
                        ch.l0.f();
                    }
                    aaVar.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.i1(this, 1));
                }
                return z10;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f32525a) {
            case 1:
                vg.e eVar = (vg.e) this.f32526b;
                eVar.f59419n = true;
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
        switch (this.f32525a) {
            case 1:
                vg.f fVar = ((vg.e) this.f32526b).f59414a;
                fVar.d -= f10 * 0.5f;
                fVar.f59431i -= f11 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i7 = this.f32525a;
        View view = this.f32526b;
        switch (i7) {
            case 1:
                vg.e eVar = (vg.e) view;
                vg.f fVar = eVar.f59414a;
                if (Math.abs(fVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, eVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y10 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    eVar.b();
                    float f10 = fVar.d;
                    float f11 = fVar.f59431i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    eVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    eVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    eVar.d.addUpdateListener(new hi.h6(this, f10, x10, f11, y10, 2));
                    eVar.d.addListener(new k71(this, 21));
                    eVar.d.start();
                    return true;
                }
                return true;
            case 2:
                zh.j jVar = (zh.j) view;
                if (!jVar.f61997e.f62000c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (jVar.f61997e.f62002f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= jVar.f61997e.f62002f.getRight() || jVar.f61997e.f62002f.getTop() >= motionEvent.getY() || motionEvent.getY() >= jVar.f61997e.f62002f.getBottom())) {
                    jVar.f61997e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
