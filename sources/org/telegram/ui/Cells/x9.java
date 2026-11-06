package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.ui;
import org.telegram.ui.r81;
public final class x9 extends GestureDetector.SimpleOnGestureListener {
    public final int f30905a;
    public final View f30906b;

    public x9(int i7, View view) {
        this.f30905a = i7;
        this.f30906b = view;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f30905a) {
            case 0:
                y9 y9Var = (y9) this.f30906b;
                int i7 = y9Var.Z5;
                boolean z9 = false;
                if (y9Var.f30936nd == 2 && ui.b0(i7).Q() != null) {
                    boolean I5 = y9Var.getMessageObject().I5(ch.o0.b(ui.b0(i7).Q()), false);
                    y9Var.v3(y9Var.getMessageObject(), null, false, false, false, false);
                    y9Var.requestLayout();
                    ch.k0.b(false);
                    z9 = true;
                    if (I5) {
                        z9 z9Var = y9Var.f30937od;
                        ch.k0.d(z9Var.f30996x, null, z9Var.f30992n[1], null, motionEvent.getX(), motionEvent.getY(), ch.o0.b(ui.b0(i7).Q()), y9Var.Z5, 0);
                        ch.k0.f();
                    }
                    y9Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 1));
                }
                return z9;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f30905a) {
            case 1:
                vg.e eVar = (vg.e) this.f30906b;
                eVar.f57276n = true;
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
        switch (this.f30905a) {
            case 1:
                vg.f fVar = ((vg.e) this.f30906b).f57271a;
                fVar.d -= f10 * 0.5f;
                fVar.f57288i -= f11 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i7 = this.f30905a;
        View view = this.f30906b;
        switch (i7) {
            case 1:
                vg.e eVar = (vg.e) view;
                vg.f fVar = eVar.f57271a;
                if (Math.abs(fVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, eVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y10 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    eVar.b();
                    float f10 = fVar.d;
                    float f11 = fVar.f57288i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    eVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    eVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    eVar.d.addUpdateListener(new fi.j6(this, f10, x10, f11, y10, 2));
                    eVar.d.addListener(new r81(this, 20));
                    eVar.d.start();
                    return true;
                }
                return true;
            case 2:
                yh.k kVar = (yh.k) view;
                if (!kVar.f59433e.f59436c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (kVar.f59433e.f59438f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= kVar.f59433e.f59438f.getRight() || kVar.f59433e.f59438f.getTop() >= motionEvent.getY() || motionEvent.getY() >= kVar.f59433e.f59438f.getBottom())) {
                    kVar.f59433e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
