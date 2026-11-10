package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
public final class yj implements View.OnTouchListener {
    public final int f40584a;
    public final Object f40585b;

    public yj(Object obj, int i7) {
        this.f40584a = i7;
        this.f40585b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        l2.i0 i0Var;
        float f11;
        f60 f60Var;
        switch (this.f40584a) {
            case 0:
                hk hkVar = (hk) this.f40585b;
                hkVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    hkVar.e0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f40585b).f17106b;
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
                n40 n40Var = (n40) this.f40585b;
                boolean z9 = false;
                if (n40Var.O == null || n40Var.Q == null) {
                    return false;
                }
                float f12 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = n40Var.f36209b0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    n40Var.C0 = false;
                    n40Var.A0 = motionEvent.getPointerId(0);
                    n40Var.B0 = -1;
                    int i7 = n40Var.Q.f58152a;
                    if (i7 == 5) {
                        ImageView imageView = n40Var.H;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && i7 == 5) {
                            boolean z10 = n40Var.f36219j0;
                            n40Var.f36219j0 = !z10;
                            wi.t0.v();
                            if (t0Var.f58206a0 == 5 && (i0Var = t0Var.W) != null) {
                                if (!z10) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = 1.0f;
                                }
                                i0Var.T(f11);
                            }
                            org.telegram.messenger.j20 j20Var = n40Var.T;
                            if (j20Var != null) {
                                j20Var.f23494t = n40Var.f36219j0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (n40Var.f36219j0) {
                                f12 = 1.0f;
                            }
                            org.telegram.messenger.camera.q.k(animate, f12, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        wi.s0 s0Var = n40Var.Q;
                        if (s0Var.f58152a == 3 && !s0Var.f58156f) {
                            n40Var.A0 = motionEvent.getPointerId(0);
                            n40Var.B0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            n40Var.f36239y0 = hypot;
                            if (hypot > 0.0f) {
                                z9 = true;
                            }
                            n40Var.C0 = z9;
                            n40Var.f36240z0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && n40Var.C0) {
                        int findPointerIndex = motionEvent.findPointerIndex(n40Var.A0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(n40Var.B0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / n40Var.f36239y0;
                            wi.l0 l0Var = n40Var.R;
                            if (l0Var == null) {
                                f10 = 1.0f;
                            } else {
                                f10 = l0Var.f58094c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f10 > 1.0f) {
                                f12 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f10 - 1.0f)));
                            }
                            n40Var.f36240z0 = f12;
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
                k60 k60Var = (k60) ((WeakReference) this.f40585b).get();
                if (k60Var != null && (f60Var = k60Var.f35209m) != null && f60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        k60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        k60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = k60Var.f35215p0;
                        if (view2 != null) {
                            k60Var.f35215p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        k60Var.f35213o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = k60Var.f35215p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            k60Var.f35215p0 = null;
                        }
                        view.setOnTouchListener(null);
                        k60Var.f35213o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                g90 g90Var = (g90) this.f40585b;
                g90Var.getClass();
                return org.telegram.ui.ns.p().r(motionEvent, g90Var.getListView(), g90Var.f33855x, null, g90Var.f33846a);
            case 5:
                ca0 ca0Var = (ca0) this.f40585b;
                ca0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ca0Var.f32524c0.a(true);
                }
                return true;
            default:
                yv0 yv0Var = (yv0) this.f40585b;
                if (yv0Var.L1) {
                    return false;
                }
                return org.telegram.ui.ns.p().r(motionEvent, yv0Var.f40747m1, yv0Var.B1, yv0Var.f40741g2, yv0Var.I0);
        }
    }
}
