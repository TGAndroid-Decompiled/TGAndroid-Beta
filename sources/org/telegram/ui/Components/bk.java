package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
public final class bk implements View.OnTouchListener {
    public final int f24848a;
    public final Object f24849b;

    public bk(Object obj, int i10) {
        this.f24848a = i10;
        this.f24849b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.i0 i0Var;
        float f10;
        u60 u60Var;
        switch (this.f24848a) {
            case 0:
                kk kkVar = (kk) this.f24849b;
                kkVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    kkVar.c0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.k1 k1Var = (org.telegram.ui.ActionBar.k1) ((k.a) this.f24849b).f10474b;
                if (motionEvent.getActionMasked() == 1 && k1Var != null && k1Var.isShowing()) {
                    Rect rect = org.telegram.messenger.i0.Q;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        k1Var.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 2:
                d50 d50Var = (d50) this.f24849b;
                boolean z10 = false;
                if (d50Var.O == null || d50Var.Q == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = d50Var.f25379a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    d50Var.B0 = false;
                    d50Var.f25410z0 = motionEvent.getPointerId(0);
                    d50Var.A0 = -1;
                    int i10 = d50Var.Q.f12299a;
                    if (i10 == 5) {
                        ImageView imageView = d50Var.H;
                        li.x0 x0Var = d50Var.O;
                        if (x0Var != null && i10 == 5) {
                            boolean z11 = d50Var.f25388i0;
                            d50Var.f25388i0 = !z11;
                            li.x0.u();
                            if (x0Var.Z == 5 && (i0Var = x0Var.V) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                i0Var.S(f10);
                            }
                            org.telegram.messenger.y20 y20Var = d50Var.T;
                            if (y20Var != null) {
                                y20Var.f19544t = d50Var.f25388i0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (d50Var.f25388i0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.a30.l(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        li.w0 w0Var = d50Var.Q;
                        if (w0Var.f12299a == 3 && !w0Var.f12302f) {
                            d50Var.f25410z0 = motionEvent.getPointerId(0);
                            d50Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            d50Var.f25407x0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            d50Var.B0 = z10;
                            d50Var.f25409y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && d50Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(d50Var.f25410z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(d50Var.A0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / d50Var.f25407x0;
                            li.p0 p0Var = d50Var.R;
                            if (p0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = p0Var.f12227c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            d50Var.f25409y0 = f11;
                            d50Var.O.x(f11);
                        } else {
                            d50Var.u();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && d50Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == d50Var.f25410z0 || pointerId == d50Var.A0) {
                            d50Var.u();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && d50Var.B0) {
                        d50Var.u();
                    }
                }
                return true;
            case 3:
                z60 z60Var = (z60) ((WeakReference) this.f24849b).get();
                if (z60Var != null && (u60Var = z60Var.f33034m) != null && u60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        z60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        z60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = z60Var.f33040p0;
                        if (view2 != null) {
                            z60Var.f33040p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        z60Var.f33038o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = z60Var.f33040p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            z60Var.f33040p0 = null;
                        }
                        view.setOnTouchListener(null);
                        z60Var.f33038o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                y90 y90Var = (y90) this.f24849b;
                y90Var.getClass();
                return org.telegram.ui.kt.p().r(motionEvent, y90Var.getListView(), y90Var.f32788x, null, y90Var.f32780a);
            case 5:
                ua0 ua0Var = (ua0) this.f24849b;
                ua0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ua0Var.f30915c0.a(true);
                }
                return true;
            default:
                dx0 dx0Var = (dx0) this.f24849b;
                if (dx0Var.I1) {
                    return false;
                }
                return org.telegram.ui.kt.p().r(motionEvent, dx0Var.f25619j1, dx0Var.f25637y1, dx0Var.f25612d2, dx0Var.I0);
        }
    }
}
