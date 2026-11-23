package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
public final class ok implements View.OnTouchListener {
    public final int f38168a;
    public final Object f38169b;

    public ok(Object obj, int i7) {
        this.f38168a = i7;
        this.f38169b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        l2.g0 g0Var;
        float f11;
        q60 q60Var;
        switch (this.f38168a) {
            case 0:
                xk xkVar = (xk) this.f38169b;
                xkVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    xkVar.e0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f38169b).f18155b;
                if (motionEvent.getActionMasked() == 1 && g1Var != null && g1Var.isShowing()) {
                    Rect rect = org.telegram.messenger.g0.Q;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g1Var.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 2:
                y40 y40Var = (y40) this.f38169b;
                boolean z10 = false;
                if (y40Var.P == null || y40Var.R == null) {
                    return false;
                }
                float f12 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = y40Var.f42324c0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    y40Var.D0 = false;
                    y40Var.B0 = motionEvent.getPointerId(0);
                    y40Var.C0 = -1;
                    int i7 = y40Var.R.f62433a;
                    if (i7 == 5) {
                        ImageView imageView = y40Var.I;
                        zi.u0 u0Var = y40Var.P;
                        if (u0Var != null && i7 == 5) {
                            boolean z11 = y40Var.f42334k0;
                            y40Var.f42334k0 = !z11;
                            zi.u0.v();
                            if (u0Var.f62440a0 == 5 && (g0Var = u0Var.W) != null) {
                                if (!z11) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = 1.0f;
                                }
                                g0Var.U(f11);
                            }
                            org.telegram.messenger.d20 d20Var = y40Var.U;
                            if (d20Var != null) {
                                d20Var.f23606t = y40Var.f42334k0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (y40Var.f42334k0) {
                                f12 = 1.0f;
                            }
                            org.telegram.messenger.m10.n(animate, f12, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        zi.t0 t0Var = y40Var.R;
                        if (t0Var.f62433a == 3 && !t0Var.f62437f) {
                            y40Var.B0 = motionEvent.getPointerId(0);
                            y40Var.C0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            y40Var.f42354z0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            y40Var.D0 = z10;
                            y40Var.A0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && y40Var.D0) {
                        int findPointerIndex = motionEvent.findPointerIndex(y40Var.B0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(y40Var.C0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / y40Var.f42354z0;
                            zi.m0 m0Var = y40Var.S;
                            if (m0Var == null) {
                                f10 = 1.0f;
                            } else {
                                f10 = m0Var.f62330c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f10 > 1.0f) {
                                f12 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f10 - 1.0f)));
                            }
                            y40Var.A0 = f12;
                            y40Var.P.y(f12);
                        } else {
                            y40Var.v();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && y40Var.D0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == y40Var.B0 || pointerId == y40Var.C0) {
                            y40Var.v();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && y40Var.D0) {
                        y40Var.v();
                    }
                }
                return true;
            case 3:
                x60 x60Var = (x60) ((WeakReference) this.f38169b).get();
                if (x60Var != null && (q60Var = x60Var.f41881m) != null && q60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        x60Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        x60Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = x60Var.f41893s0;
                        if (view2 != null) {
                            x60Var.f41893s0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        x60Var.f41891r0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = x60Var.f41893s0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            x60Var.f41893s0 = null;
                        }
                        view.setOnTouchListener(null);
                        x60Var.f41891r0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                s90 s90Var = (s90) this.f38169b;
                s90Var.getClass();
                return org.telegram.ui.ns.p().r(motionEvent, s90Var.getListView(), s90Var.f39543x, null, s90Var.f39534a);
            case 5:
                na0 na0Var = (na0) this.f38169b;
                na0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    na0Var.f37742d0.a(true);
                }
                return true;
            default:
                jw0 jw0Var = (jw0) this.f38169b;
                if (jw0Var.M1) {
                    return false;
                }
                return org.telegram.ui.ns.p().r(motionEvent, jw0Var.n1, jw0Var.C1, jw0Var.f36533h2, jw0Var.J0);
        }
    }
}
