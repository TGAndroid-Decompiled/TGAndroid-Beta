package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.si;
import org.telegram.ui.g71;
public final class x9 extends GestureDetector.SimpleOnGestureListener {
    public final int f32047a;
    public final View f32048b;

    public x9(int i7, View view) {
        this.f32047a = i7;
        this.f32048b = view;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f32047a) {
            case 0:
                y9 y9Var = (y9) this.f32048b;
                int i7 = y9Var.f30908a6;
                boolean z10 = false;
                if (y9Var.Cd == 2 && si.b0(i7).Q() != null) {
                    boolean H5 = y9Var.getMessageObject().H5(ch.p0.b(si.b0(i7).Q()), false);
                    y9Var.x3(y9Var.getMessageObject(), null, false, false, false, false);
                    y9Var.requestLayout();
                    ch.l0.b(false);
                    z10 = true;
                    if (H5) {
                        z9 z9Var = y9Var.Dd;
                        ch.l0.d(z9Var.f32140x, null, z9Var.f32136n[1], null, motionEvent.getX(), motionEvent.getY(), ch.p0.b(si.b0(i7).Q()), y9Var.f30908a6, 0);
                        ch.l0.f();
                    }
                    y9Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 1));
                }
                return z10;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f32047a) {
            case 1:
                vg.e eVar = (vg.e) this.f32048b;
                eVar.f58849n = true;
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
        switch (this.f32047a) {
            case 1:
                vg.f fVar = ((vg.e) this.f32048b).f58844a;
                fVar.d -= f10 * 0.5f;
                fVar.f58861i -= f11 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i7 = this.f32047a;
        View view = this.f32048b;
        switch (i7) {
            case 1:
                vg.e eVar = (vg.e) view;
                vg.f fVar = eVar.f58844a;
                if (Math.abs(fVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, eVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y10 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    eVar.b();
                    float f10 = fVar.d;
                    float f11 = fVar.f58861i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    eVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    eVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    eVar.d.addUpdateListener(new hi.i6(this, f10, x10, f11, y10, 2));
                    eVar.d.addListener(new g71(this, 21));
                    eVar.d.start();
                    return true;
                }
                return true;
            case 2:
                zh.j jVar = (zh.j) view;
                if (!jVar.f61430e.f61433c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (jVar.f61430e.f61435f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= jVar.f61430e.f61435f.getRight() || jVar.f61430e.f61435f.getTop() >= motionEvent.getY() || motionEvent.getY() >= jVar.f61430e.f61435f.getBottom())) {
                    jVar.f61430e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
