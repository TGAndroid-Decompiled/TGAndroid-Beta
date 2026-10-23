package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.VideoEditedInfo;
public final class rk implements View.OnTouchListener {
    public final int f30181a;
    public final Object f30182b;

    public rk(Object obj, int i10) {
        this.f30181a = i10;
        this.f30182b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.h0 h0Var;
        float f10;
        e80 e80Var;
        switch (this.f30181a) {
            case 0:
                al alVar = (al) this.f30182b;
                alVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    alVar.c0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = ((hs) this.f30182b).f27042a;
                if (motionEvent.getActionMasked() == 1 && m1Var != null && m1Var.isShowing()) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m1Var.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 2:
                m60 m60Var = (m60) this.f30182b;
                boolean z10 = false;
                if (m60Var.P == null || m60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = m60Var.f28521a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    m60Var.B0 = false;
                    m60Var.f28552z0 = motionEvent.getPointerId(0);
                    m60Var.A0 = -1;
                    int i10 = m60Var.R.f47242a;
                    if (i10 == 5) {
                        ImageView imageView = m60Var.I;
                        si.u0 u0Var = m60Var.P;
                        if (u0Var != null && i10 == 5) {
                            boolean z11 = m60Var.f28530i0;
                            m60Var.f28530i0 = !z11;
                            si.u0.t();
                            if (u0Var.W == 5 && (h0Var = u0Var.S) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                h0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = m60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = m60Var.f28530i0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (m60Var.f28530i0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.sl.s(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        si.t0 t0Var = m60Var.R;
                        if (t0Var.f47242a == 3 && !t0Var.e) {
                            m60Var.f28552z0 = motionEvent.getPointerId(0);
                            m60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            m60Var.f28549x0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            m60Var.B0 = z10;
                            m60Var.f28551y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && m60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(m60Var.f28552z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(m60Var.A0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / m60Var.f28549x0;
                            si.l0 l0Var = m60Var.S;
                            if (l0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = l0Var.f47145c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            m60Var.f28551y0 = f11;
                            m60Var.P.w(f11);
                        } else {
                            m60Var.s();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && m60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == m60Var.f28552z0 || pointerId == m60Var.A0) {
                            m60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && m60Var.B0) {
                        m60Var.s();
                    }
                }
                return true;
            case 3:
                j80 j80Var = (j80) ((WeakReference) this.f30182b).get();
                if (j80Var != null && (e80Var = j80Var.f27570m) != null && e80Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        j80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        j80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = j80Var.f27576p0;
                        if (view2 != null) {
                            j80Var.f27576p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        j80Var.f27574o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = j80Var.f27576p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            j80Var.f27576p0 = null;
                        }
                        view.setOnTouchListener(null);
                        j80Var.f27574o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                jb0 jb0Var = (jb0) this.f30182b;
                jb0Var.getClass();
                return org.telegram.ui.ht.o().q(motionEvent, jb0Var.getListView(), jb0Var.f27659w, null, jb0Var.f27652a);
            case 5:
                lc0 lc0Var = (lc0) this.f30182b;
                lc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    lc0Var.f28340c0.a(true);
                }
                return true;
            default:
                return ty0.y((ty0) this.f30182b, motionEvent);
        }
    }
}
