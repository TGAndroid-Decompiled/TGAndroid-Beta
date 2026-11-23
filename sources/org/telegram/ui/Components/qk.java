package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
public final class qk implements View.OnTouchListener {
    public final int f38937a;
    public final Object f38938b;

    public qk(Object obj, int i7) {
        this.f38937a = i7;
        this.f38938b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        l2.f0 f0Var;
        float f11;
        t60 t60Var;
        switch (this.f38937a) {
            case 0:
                zk zkVar = (zk) this.f38938b;
                zkVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    zkVar.e0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f38938b).f18090b;
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
                b50 b50Var = (b50) this.f38938b;
                boolean z10 = false;
                if (b50Var.P == null || b50Var.R == null) {
                    return false;
                }
                float f12 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = b50Var.f33738c0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    b50Var.D0 = false;
                    b50Var.B0 = motionEvent.getPointerId(0);
                    b50Var.C0 = -1;
                    int i7 = b50Var.R.f62348a;
                    if (i7 == 5) {
                        ImageView imageView = b50Var.I;
                        zi.u0 u0Var = b50Var.P;
                        if (u0Var != null && i7 == 5) {
                            boolean z11 = b50Var.f33748k0;
                            b50Var.f33748k0 = !z11;
                            zi.u0.v();
                            if (u0Var.f62355a0 == 5 && (f0Var = u0Var.W) != null) {
                                if (!z11) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = 1.0f;
                                }
                                f0Var.T(f11);
                            }
                            org.telegram.messenger.f20 f20Var = b50Var.U;
                            if (f20Var != null) {
                                f20Var.f23845t = b50Var.f33748k0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (b50Var.f33748k0) {
                                f12 = 1.0f;
                            }
                            org.telegram.messenger.o10.n(animate, f12, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        zi.t0 t0Var = b50Var.R;
                        if (t0Var.f62348a == 3 && !t0Var.f62352f) {
                            b50Var.B0 = motionEvent.getPointerId(0);
                            b50Var.C0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            b50Var.f33768z0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            b50Var.D0 = z10;
                            b50Var.A0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && b50Var.D0) {
                        int findPointerIndex = motionEvent.findPointerIndex(b50Var.B0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(b50Var.C0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / b50Var.f33768z0;
                            zi.m0 m0Var = b50Var.S;
                            if (m0Var == null) {
                                f10 = 1.0f;
                            } else {
                                f10 = m0Var.f62245c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f10 > 1.0f) {
                                f12 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f10 - 1.0f)));
                            }
                            b50Var.A0 = f12;
                            b50Var.P.y(f12);
                        } else {
                            b50Var.v();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && b50Var.D0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == b50Var.B0 || pointerId == b50Var.C0) {
                            b50Var.v();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && b50Var.D0) {
                        b50Var.v();
                    }
                }
                return true;
            case 3:
                a70 a70Var = (a70) ((WeakReference) this.f38938b).get();
                if (a70Var != null && (t60Var = a70Var.f33386m) != null && t60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        a70Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        a70Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = a70Var.f33398s0;
                        if (view2 != null) {
                            a70Var.f33398s0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        a70Var.f33396r0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = a70Var.f33398s0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            a70Var.f33398s0 = null;
                        }
                        view.setOnTouchListener(null);
                        a70Var.f33396r0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                v90 v90Var = (v90) this.f38938b;
                v90Var.getClass();
                return org.telegram.ui.ns.p().r(motionEvent, v90Var.getListView(), v90Var.f40751x, null, v90Var.f40742a);
            case 5:
                qa0 qa0Var = (qa0) this.f38938b;
                qa0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    qa0Var.f38857d0.a(true);
                }
                return true;
            default:
                kw0 kw0Var = (kw0) this.f38938b;
                if (kw0Var.M1) {
                    return false;
                }
                return org.telegram.ui.ns.p().r(motionEvent, kw0Var.n1, kw0Var.C1, kw0Var.f37010h2, kw0Var.J0);
        }
    }
}
