package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.li;
import org.telegram.ui.i81;
public final class x9 extends GestureDetector.SimpleOnGestureListener {
    public final int f30970a;
    public final View f30971b;

    public x9(int i3, View view) {
        this.f30970a = i3;
        this.f30971b = view;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.f30970a) {
            case 0:
                y9 y9Var = (y9) this.f30971b;
                int i3 = y9Var.Z5;
                boolean z10 = false;
                if (y9Var.f31015nd == 2 && li.b0(i3).Q() != null) {
                    boolean I5 = y9Var.getMessageObject().I5(dh.n0.b(li.b0(i3).Q()), false);
                    y9Var.u3(y9Var.getMessageObject(), null, false, false, false, false);
                    y9Var.requestLayout();
                    dh.j0.b(false);
                    z10 = true;
                    if (I5) {
                        z9 z9Var = y9Var.f31016od;
                        dh.j0.d(z9Var.f31070x, null, z9Var.f31066n[1], null, motionEvent.getX(), motionEvent.getY(), dh.n0.b(li.b0(i3).Q()), y9Var.Z5, 0);
                        dh.j0.f();
                    }
                    y9Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.g1(this, 1));
                }
                return z10;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f30970a) {
            case 1:
                wg.e eVar = (wg.e) this.f30971b;
                eVar.f57622n = true;
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
        switch (this.f30970a) {
            case 1:
                wg.f fVar = ((wg.e) this.f30971b).f57617a;
                fVar.d -= f10 * 0.5f;
                fVar.f57634i -= f11 * 0.05f;
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        int i3 = this.f30970a;
        View view = this.f30971b;
        switch (i3) {
            case 1:
                wg.e eVar = (wg.e) view;
                wg.f fVar = eVar.f57617a;
                if (Math.abs(fVar.d) <= 10.0f) {
                    float max = Math.max(1.0f, eVar.getWidth() / 2.0f);
                    float x10 = ((max - motionEvent.getX()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    float y9 = ((max - motionEvent.getY()) * ((((float) Math.random()) * 30.0f) + 40.0f)) / max;
                    eVar.b();
                    float f10 = fVar.d;
                    float f11 = fVar.f57634i;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    eVar.d = ofFloat;
                    ofFloat.setDuration(220L);
                    eVar.d.setInterpolator(new PathInterpolator(0.23f, 1.0f, 0.32f, 1.0f));
                    eVar.d.addUpdateListener(new gi.k6(this, f10, x10, f11, y9, 2));
                    eVar.d.addListener(new i81(this, 20));
                    eVar.d.start();
                    return true;
                }
                return true;
            case 2:
                zh.i iVar = (zh.i) view;
                if (!iVar.f60568e.f60571c.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (iVar.f60568e.f60573f.getLeft() >= motionEvent.getX() || motionEvent.getX() >= iVar.f60568e.f60573f.getRight() || iVar.f60568e.f60573f.getTop() >= motionEvent.getY() || motionEvent.getY() >= iVar.f60568e.f60573f.getBottom())) {
                    iVar.f60568e.e(false);
                }
                return super.onSingleTapUp(motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
