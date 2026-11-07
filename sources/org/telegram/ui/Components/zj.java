package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
public final class zj implements View.OnTouchListener {
    public final int f41012a;
    public final Object f41013b;

    public zj(Object obj, int i7) {
        this.f41012a = i7;
        this.f41013b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        l2.i0 i0Var;
        float f11;
        f60 f60Var;
        switch (this.f41012a) {
            case 0:
                ik ikVar = (ik) this.f41013b;
                ikVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    ikVar.e0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f41013b).f17103b;
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
                n40 n40Var = (n40) this.f41013b;
                boolean z9 = false;
                if (n40Var.O == null || n40Var.Q == null) {
                    return false;
                }
                float f12 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = n40Var.f36195b0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    n40Var.C0 = false;
                    n40Var.A0 = motionEvent.getPointerId(0);
                    n40Var.B0 = -1;
                    int i7 = n40Var.Q.f58049a;
                    if (i7 == 5) {
                        ImageView imageView = n40Var.H;
                        wi.u0 u0Var = n40Var.O;
                        if (u0Var != null && i7 == 5) {
                            boolean z10 = n40Var.f36205j0;
                            n40Var.f36205j0 = !z10;
                            wi.u0.v();
                            if (u0Var.f58103a0 == 5 && (i0Var = u0Var.W) != null) {
                                if (!z10) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = 1.0f;
                                }
                                i0Var.T(f11);
                            }
                            org.telegram.messenger.j20 j20Var = n40Var.T;
                            if (j20Var != null) {
                                j20Var.f23469t = n40Var.f36205j0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (n40Var.f36205j0) {
                                f12 = 1.0f;
                            }
                            org.telegram.messenger.camera.q.k(animate, f12, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        wi.t0 t0Var = n40Var.Q;
                        if (t0Var.f58049a == 3 && !t0Var.f58053f) {
                            n40Var.A0 = motionEvent.getPointerId(0);
                            n40Var.B0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            n40Var.f36225y0 = hypot;
                            if (hypot > 0.0f) {
                                z9 = true;
                            }
                            n40Var.C0 = z9;
                            n40Var.f36226z0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && n40Var.C0) {
                        int findPointerIndex = motionEvent.findPointerIndex(n40Var.A0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(n40Var.B0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / n40Var.f36225y0;
                            wi.m0 m0Var = n40Var.R;
                            if (m0Var == null) {
                                f10 = 1.0f;
                            } else {
                                f10 = m0Var.f57990c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f10 > 1.0f) {
                                f12 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f10 - 1.0f)));
                            }
                            n40Var.f36226z0 = f12;
                            n40Var.O.y(f12);
                        } else {
                            n40Var.v();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && n40Var.C0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == n40Var.A0 || pointerId == n40Var.B0) {
                            n40Var.v();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && n40Var.C0) {
                        n40Var.v();
                    }
                }
                return true;
            case 3:
                k60 k60Var = (k60) ((WeakReference) this.f41013b).get();
                if (k60Var != null && (f60Var = k60Var.f35195m) != null && f60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        k60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        k60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = k60Var.f35201p0;
                        if (view2 != null) {
                            k60Var.f35201p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        k60Var.f35199o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = k60Var.f35201p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            k60Var.f35201p0 = null;
                        }
                        view.setOnTouchListener(null);
                        k60Var.f35199o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                g90 g90Var = (g90) this.f41013b;
                g90Var.getClass();
                return org.telegram.ui.ks.p().r(motionEvent, g90Var.getListView(), g90Var.f33876x, null, g90Var.f33867a);
            case 5:
                ca0 ca0Var = (ca0) this.f41013b;
                ca0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ca0Var.f32494c0.a(true);
                }
                return true;
            default:
                yv0 yv0Var = (yv0) this.f41013b;
                if (yv0Var.I1) {
                    return false;
                }
                return org.telegram.ui.ks.p().r(motionEvent, yv0Var.f40761j1, yv0Var.f40778y1, yv0Var.d2, yv0Var.I0);
        }
    }
}
