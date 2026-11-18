package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
public final class ok implements View.OnTouchListener {
    public final int f38118a;
    public final Object f38119b;

    public ok(Object obj, int i7) {
        this.f38118a = i7;
        this.f38119b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        l2.f0 f0Var;
        float f11;
        r60 r60Var;
        switch (this.f38118a) {
            case 0:
                xk xkVar = (xk) this.f38119b;
                xkVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    xkVar.e0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) ((k.a) this.f38119b).f18056b;
                if (motionEvent.getActionMasked() == 1 && h1Var != null && h1Var.isShowing()) {
                    Rect rect = org.telegram.messenger.g0.Q;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        h1Var.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 2:
                y40 y40Var = (y40) this.f38119b;
                boolean z10 = false;
                if (y40Var.P == null || y40Var.R == null) {
                    return false;
                }
                float f12 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = y40Var.f42296c0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    y40Var.D0 = false;
                    y40Var.B0 = motionEvent.getPointerId(0);
                    y40Var.C0 = -1;
                    int i7 = y40Var.R.f62303a;
                    if (i7 == 5) {
                        ImageView imageView = y40Var.I;
                        zi.u0 u0Var = y40Var.P;
                        if (u0Var != null && i7 == 5) {
                            boolean z11 = y40Var.f42306k0;
                            y40Var.f42306k0 = !z11;
                            zi.u0.v();
                            if (u0Var.f62310a0 == 5 && (f0Var = u0Var.W) != null) {
                                if (!z11) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = 1.0f;
                                }
                                f0Var.T(f11);
                            }
                            org.telegram.messenger.e20 e20Var = y40Var.U;
                            if (e20Var != null) {
                                e20Var.f23653t = y40Var.f42306k0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (y40Var.f42306k0) {
                                f12 = 1.0f;
                            }
                            org.telegram.messenger.n10.n(animate, f12, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        zi.t0 t0Var = y40Var.R;
                        if (t0Var.f62303a == 3 && !t0Var.f62307f) {
                            y40Var.B0 = motionEvent.getPointerId(0);
                            y40Var.C0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            y40Var.f42326z0 = hypot;
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
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / y40Var.f42326z0;
                            zi.m0 m0Var = y40Var.S;
                            if (m0Var == null) {
                                f10 = 1.0f;
                            } else {
                                f10 = m0Var.f62200c;
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
                y60 y60Var = (y60) ((WeakReference) this.f38119b).get();
                if (y60Var != null && (r60Var = y60Var.f42364m) != null && r60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        y60Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        y60Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = y60Var.f42376s0;
                        if (view2 != null) {
                            y60Var.f42376s0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        y60Var.f42374r0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = y60Var.f42376s0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            y60Var.f42376s0 = null;
                        }
                        view.setOnTouchListener(null);
                        y60Var.f42374r0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                t90 t90Var = (t90) this.f38119b;
                t90Var.getClass();
                return org.telegram.ui.ns.p().r(motionEvent, t90Var.getListView(), t90Var.f39954x, null, t90Var.f39945a);
            case 5:
                oa0 oa0Var = (oa0) this.f38119b;
                oa0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    oa0Var.f38045d0.a(true);
                }
                return true;
            default:
                iw0 iw0Var = (iw0) this.f38119b;
                if (iw0Var.M1) {
                    return false;
                }
                return org.telegram.ui.ns.p().r(motionEvent, iw0Var.n1, iw0Var.C1, iw0Var.f36239h2, iw0Var.J0);
        }
    }
}
