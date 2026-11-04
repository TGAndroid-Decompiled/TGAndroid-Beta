package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
public final class yj implements View.OnTouchListener {
    public final int f40755a;
    public final Object f40756b;

    public yj(Object obj, int i3) {
        this.f40755a = i3;
        this.f40756b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        k2.i0 i0Var;
        float f11;
        b60 b60Var;
        switch (this.f40755a) {
            case 0:
                hk hkVar = (hk) this.f40756b;
                hkVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    hkVar.e0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) ((k.a) this.f40756b).f16385b;
                if (motionEvent.getActionMasked() == 1 && f1Var != null && f1Var.isShowing()) {
                    Rect rect = org.telegram.messenger.g0.Q;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        f1Var.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 2:
                j40 j40Var = (j40) this.f40756b;
                boolean z10 = false;
                if (j40Var.P == null || j40Var.R == null) {
                    return false;
                }
                float f12 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = j40Var.f34929b0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    j40Var.C0 = false;
                    j40Var.A0 = motionEvent.getPointerId(0);
                    j40Var.B0 = -1;
                    int i3 = j40Var.R.f58047a;
                    if (i3 == 5) {
                        ImageView imageView = j40Var.I;
                        wi.t0 t0Var = j40Var.P;
                        if (t0Var != null && i3 == 5) {
                            boolean z11 = j40Var.f34939j0;
                            j40Var.f34939j0 = !z11;
                            wi.t0.u();
                            if (t0Var.Z == 5 && (i0Var = t0Var.V) != null) {
                                if (!z11) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = 1.0f;
                                }
                                i0Var.R(f11);
                            }
                            org.telegram.messenger.b20 b20Var = j40Var.U;
                            if (b20Var != null) {
                                b20Var.f21727t = j40Var.f34939j0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (j40Var.f34939j0) {
                                f12 = 1.0f;
                            }
                            org.telegram.messenger.camera.q.k(animate, f12, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        wi.s0 s0Var = j40Var.R;
                        if (s0Var.f58047a == 3 && !s0Var.f58051f) {
                            j40Var.A0 = motionEvent.getPointerId(0);
                            j40Var.B0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            j40Var.f34959y0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            j40Var.C0 = z10;
                            j40Var.f34960z0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && j40Var.C0) {
                        int findPointerIndex = motionEvent.findPointerIndex(j40Var.A0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(j40Var.B0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / j40Var.f34959y0;
                            wi.l0 l0Var = j40Var.S;
                            if (l0Var == null) {
                                f10 = 1.0f;
                            } else {
                                f10 = l0Var.f57945c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f10 > 1.0f) {
                                f12 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f10 - 1.0f)));
                            }
                            j40Var.f34960z0 = f12;
                            j40Var.P.x(f12);
                        } else {
                            j40Var.u();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && j40Var.C0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == j40Var.A0 || pointerId == j40Var.B0) {
                            j40Var.u();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && j40Var.C0) {
                        j40Var.u();
                    }
                }
                return true;
            case 3:
                f60 f60Var = (f60) ((WeakReference) this.f40756b).get();
                if (f60Var != null && (b60Var = f60Var.f33737m) != null && b60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        f60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        f60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = f60Var.f33743p0;
                        if (view2 != null) {
                            f60Var.f33743p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        f60Var.f33741o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = f60Var.f33743p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            f60Var.f33743p0 = null;
                        }
                        view.setOnTouchListener(null);
                        f60Var.f33741o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                c90 c90Var = (c90) this.f40756b;
                c90Var.getClass();
                return org.telegram.ui.is.p().r(motionEvent, c90Var.getListView(), c90Var.f32619x, null, c90Var.f32610a);
            case 5:
                x90 x90Var = (x90) this.f40756b;
                x90Var.getClass();
                if (motionEvent.getAction() == 1) {
                    x90Var.f40291d0.a(true);
                }
                return true;
            default:
                xv0 xv0Var = (xv0) this.f40756b;
                if (xv0Var.J1) {
                    return false;
                }
                return org.telegram.ui.is.p().r(motionEvent, xv0Var.k1, xv0Var.f40533z1, xv0Var.f40509e2, xv0Var.J0);
        }
    }
}
