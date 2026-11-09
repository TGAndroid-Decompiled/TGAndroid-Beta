package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
public final class zj implements View.OnTouchListener {
    public final int f40988a;
    public final Object f40989b;

    public zj(Object obj, int i7) {
        this.f40988a = i7;
        this.f40989b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        l2.i0 i0Var;
        float f11;
        g60 g60Var;
        switch (this.f40988a) {
            case 0:
                ik ikVar = (ik) this.f40989b;
                ikVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    ikVar.e0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f40989b).f17106b;
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
                o40 o40Var = (o40) this.f40989b;
                boolean z9 = false;
                if (o40Var.O == null || o40Var.Q == null) {
                    return false;
                }
                float f12 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = o40Var.f36617b0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    o40Var.C0 = false;
                    o40Var.A0 = motionEvent.getPointerId(0);
                    o40Var.B0 = -1;
                    int i7 = o40Var.Q.f58148a;
                    if (i7 == 5) {
                        ImageView imageView = o40Var.H;
                        wi.t0 t0Var = o40Var.O;
                        if (t0Var != null && i7 == 5) {
                            boolean z10 = o40Var.f36627j0;
                            o40Var.f36627j0 = !z10;
                            wi.t0.v();
                            if (t0Var.f58202a0 == 5 && (i0Var = t0Var.W) != null) {
                                if (!z10) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = 1.0f;
                                }
                                i0Var.T(f11);
                            }
                            org.telegram.messenger.j20 j20Var = o40Var.T;
                            if (j20Var != null) {
                                j20Var.f23490t = o40Var.f36627j0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (o40Var.f36627j0) {
                                f12 = 1.0f;
                            }
                            org.telegram.messenger.camera.q.k(animate, f12, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        wi.s0 s0Var = o40Var.Q;
                        if (s0Var.f58148a == 3 && !s0Var.f58152f) {
                            o40Var.A0 = motionEvent.getPointerId(0);
                            o40Var.B0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            o40Var.f36647y0 = hypot;
                            if (hypot > 0.0f) {
                                z9 = true;
                            }
                            o40Var.C0 = z9;
                            o40Var.f36648z0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && o40Var.C0) {
                        int findPointerIndex = motionEvent.findPointerIndex(o40Var.A0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(o40Var.B0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / o40Var.f36647y0;
                            wi.l0 l0Var = o40Var.R;
                            if (l0Var == null) {
                                f10 = 1.0f;
                            } else {
                                f10 = l0Var.f58090c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f10 > 1.0f) {
                                f12 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f10 - 1.0f)));
                            }
                            o40Var.f36648z0 = f12;
                            o40Var.O.y(f12);
                        } else {
                            o40Var.v();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && o40Var.C0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == o40Var.A0 || pointerId == o40Var.B0) {
                            o40Var.v();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && o40Var.C0) {
                        o40Var.v();
                    }
                }
                return true;
            case 3:
                l60 l60Var = (l60) ((WeakReference) this.f40989b).get();
                if (l60Var != null && (g60Var = l60Var.f35607m) != null && g60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        l60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        l60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = l60Var.f35613p0;
                        if (view2 != null) {
                            l60Var.f35613p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        l60Var.f35611o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = l60Var.f35613p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            l60Var.f35613p0 = null;
                        }
                        view.setOnTouchListener(null);
                        l60Var.f35611o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                h90 h90Var = (h90) this.f40989b;
                h90Var.getClass();
                return org.telegram.ui.ms.p().r(motionEvent, h90Var.getListView(), h90Var.f34255x, null, h90Var.f34246a);
            case 5:
                da0 da0Var = (da0) this.f40989b;
                da0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    da0Var.f32920c0.a(true);
                }
                return true;
            default:
                zv0 zv0Var = (zv0) this.f40989b;
                if (zv0Var.I1) {
                    return false;
                }
                return org.telegram.ui.ms.p().r(motionEvent, zv0Var.f41153j1, zv0Var.f41170y1, zv0Var.d2, zv0Var.I0);
        }
    }
}
