package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
public final class zj implements View.OnTouchListener {
    public final int f40992a;
    public final Object f40993b;

    public zj(Object obj, int i7) {
        this.f40992a = i7;
        this.f40993b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        l2.i0 i0Var;
        float f11;
        f60 f60Var;
        switch (this.f40992a) {
            case 0:
                ik ikVar = (ik) this.f40993b;
                ikVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    ikVar.e0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f40993b).f17103b;
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
                n40 n40Var = (n40) this.f40993b;
                boolean z9 = false;
                if (n40Var.O == null || n40Var.Q == null) {
                    return false;
                }
                float f12 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = n40Var.f36159a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    n40Var.B0 = false;
                    n40Var.f36191z0 = motionEvent.getPointerId(0);
                    n40Var.A0 = -1;
                    int i7 = n40Var.Q.f58046a;
                    if (i7 == 5) {
                        ImageView imageView = n40Var.H;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && i7 == 5) {
                            boolean z10 = n40Var.f36169i0;
                            n40Var.f36169i0 = !z10;
                            wi.t0.u();
                            if (t0Var.Z == 5 && (i0Var = t0Var.V) != null) {
                                if (!z10) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = 1.0f;
                                }
                                i0Var.T(f11);
                            }
                            org.telegram.messenger.j20 j20Var = n40Var.T;
                            if (j20Var != null) {
                                j20Var.f23462t = n40Var.f36169i0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (n40Var.f36169i0) {
                                f12 = 1.0f;
                            }
                            org.telegram.messenger.camera.q.k(animate, f12, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        wi.s0 s0Var = n40Var.Q;
                        if (s0Var.f58046a == 3 && !s0Var.f58050f) {
                            n40Var.f36191z0 = motionEvent.getPointerId(0);
                            n40Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            n40Var.f36188x0 = hypot;
                            if (hypot > 0.0f) {
                                z9 = true;
                            }
                            n40Var.B0 = z9;
                            n40Var.f36190y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && n40Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(n40Var.f36191z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(n40Var.A0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / n40Var.f36188x0;
                            wi.l0 l0Var = n40Var.R;
                            if (l0Var == null) {
                                f10 = 1.0f;
                            } else {
                                f10 = l0Var.f57987c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f10 > 1.0f) {
                                f12 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f10 - 1.0f)));
                            }
                            n40Var.f36190y0 = f12;
                            n40Var.O.x(f12);
                        } else {
                            n40Var.u();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && n40Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == n40Var.f36191z0 || pointerId == n40Var.A0) {
                            n40Var.u();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && n40Var.B0) {
                        n40Var.u();
                    }
                }
                return true;
            case 3:
                k60 k60Var = (k60) ((WeakReference) this.f40993b).get();
                if (k60Var != null && (f60Var = k60Var.f35170m) != null && f60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        k60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        k60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = k60Var.f35176p0;
                        if (view2 != null) {
                            k60Var.f35176p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        k60Var.f35174o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = k60Var.f35176p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            k60Var.f35176p0 = null;
                        }
                        view.setOnTouchListener(null);
                        k60Var.f35174o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                g90 g90Var = (g90) this.f40993b;
                g90Var.getClass();
                return org.telegram.ui.ks.p().r(motionEvent, g90Var.getListView(), g90Var.f33868x, null, g90Var.f33859a);
            case 5:
                ca0 ca0Var = (ca0) this.f40993b;
                ca0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ca0Var.f32507c0.a(true);
                }
                return true;
            default:
                yv0 yv0Var = (yv0) this.f40993b;
                if (yv0Var.I1) {
                    return false;
                }
                return org.telegram.ui.ks.p().r(motionEvent, yv0Var.f40749j1, yv0Var.f40766y1, yv0Var.d2, yv0Var.I0);
        }
    }
}
