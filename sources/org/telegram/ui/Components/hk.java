package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
public final class hk implements View.OnTouchListener {
    public final int f35272a;
    public final Object f35273b;

    public hk(Object obj, int i7) {
        this.f35272a = i7;
        this.f35273b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        l2.f0 f0Var;
        float f11;
        i60 i60Var;
        switch (this.f35272a) {
            case 0:
                qk qkVar = (qk) this.f35273b;
                qkVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    qkVar.e0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.f35273b).f17664b;
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
                q40 q40Var = (q40) this.f35273b;
                boolean z10 = false;
                if (q40Var.P == null || q40Var.R == null) {
                    return false;
                }
                float f12 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = q40Var.f38488c0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    q40Var.D0 = false;
                    q40Var.B0 = motionEvent.getPointerId(0);
                    q40Var.C0 = -1;
                    int i7 = q40Var.R.f61738a;
                    if (i7 == 5) {
                        ImageView imageView = q40Var.I;
                        zi.v0 v0Var = q40Var.P;
                        if (v0Var != null && i7 == 5) {
                            boolean z11 = q40Var.f38498k0;
                            q40Var.f38498k0 = !z11;
                            zi.v0.v();
                            if (v0Var.f61745a0 == 5 && (f0Var = v0Var.W) != null) {
                                if (!z11) {
                                    f11 = 0.0f;
                                } else {
                                    f11 = 1.0f;
                                }
                                f0Var.T(f11);
                            }
                            org.telegram.messenger.g20 g20Var = q40Var.U;
                            if (g20Var != null) {
                                g20Var.f23651t = q40Var.f38498k0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (q40Var.f38498k0) {
                                f12 = 1.0f;
                            }
                            org.telegram.messenger.i20.m(animate, f12, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        zi.u0 u0Var = q40Var.R;
                        if (u0Var.f61738a == 3 && !u0Var.f61742f) {
                            q40Var.B0 = motionEvent.getPointerId(0);
                            q40Var.C0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            q40Var.f38518z0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            q40Var.D0 = z10;
                            q40Var.A0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && q40Var.D0) {
                        int findPointerIndex = motionEvent.findPointerIndex(q40Var.B0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(q40Var.C0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / q40Var.f38518z0;
                            zi.m0 m0Var = q40Var.S;
                            if (m0Var == null) {
                                f10 = 1.0f;
                            } else {
                                f10 = m0Var.f61633c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f10 > 1.0f) {
                                f12 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f10 - 1.0f)));
                            }
                            q40Var.A0 = f12;
                            q40Var.P.y(f12);
                        } else {
                            q40Var.v();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && q40Var.D0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == q40Var.B0 || pointerId == q40Var.C0) {
                            q40Var.v();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && q40Var.D0) {
                        q40Var.v();
                    }
                }
                return true;
            case 3:
                m60 m60Var = (m60) ((WeakReference) this.f35273b).get();
                if (m60Var != null && (i60Var = m60Var.f37101m) != null && i60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        m60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        m60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = m60Var.f37107p0;
                        if (view2 != null) {
                            m60Var.f37107p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        m60Var.f37105o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = m60Var.f37107p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            m60Var.f37107p0 = null;
                        }
                        view.setOnTouchListener(null);
                        m60Var.f37105o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                i90 i90Var = (i90) this.f35273b;
                i90Var.getClass();
                return org.telegram.ui.ns.p().r(motionEvent, i90Var.getListView(), i90Var.f35528x, null, i90Var.f35519a);
            case 5:
                da0 da0Var = (da0) this.f35273b;
                da0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    da0Var.f33900d0.a(true);
                }
                return true;
            default:
                bw0 bw0Var = (bw0) this.f35273b;
                if (bw0Var.M1) {
                    return false;
                }
                return org.telegram.ui.ns.p().r(motionEvent, bw0Var.n1, bw0Var.C1, bw0Var.f33402h2, bw0Var.J0);
        }
    }
}
