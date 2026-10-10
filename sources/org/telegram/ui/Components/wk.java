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
public final class wk implements View.OnTouchListener {
    public final int f32686a;
    public final Object f32687b;

    public wk(Object obj, int i10) {
        this.f32686a = i10;
        this.f32687b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.f0 f0Var;
        float f10;
        l80 l80Var;
        switch (this.f32686a) {
            case 0:
                gl glVar = (gl) this.f32687b;
                glVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    glVar.c0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.n1 n1Var = ((os) this.f32687b).f29593a;
                if (motionEvent.getActionMasked() == 1 && n1Var != null && n1Var.isShowing()) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        n1Var.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 2:
                t60 t60Var = (t60) this.f32687b;
                boolean z10 = false;
                if (t60Var.P == null || t60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = t60Var.f31001a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    t60Var.B0 = false;
                    t60Var.f31031y0 = motionEvent.getPointerId(0);
                    t60Var.f31032z0 = -1;
                    int i10 = t60Var.R.f15109a;
                    if (i10 == 5) {
                        ImageView imageView = t60Var.I;
                        ki.t0 t0Var = t60Var.P;
                        if (t0Var != null && i10 == 5) {
                            boolean z11 = t60Var.f31009h0;
                            t60Var.f31009h0 = !z11;
                            ki.t0.t();
                            if (t0Var.W == 5 && (f0Var = t0Var.S) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                f0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = t60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = t60Var.f31009h0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (t60Var.f31009h0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.bi.s(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.s0 s0Var = t60Var.R;
                        if (s0Var.f15109a == 3 && !s0Var.f15112e) {
                            t60Var.f31031y0 = motionEvent.getPointerId(0);
                            t60Var.f31032z0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            t60Var.f31027w0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            t60Var.B0 = z10;
                            t60Var.f31029x0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && t60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(t60Var.f31031y0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(t60Var.f31032z0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / t60Var.f31027w0;
                            ki.l0 l0Var = t60Var.S;
                            if (l0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = l0Var.f15032c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            t60Var.f31029x0 = f11;
                            t60Var.P.w(f11);
                        } else {
                            t60Var.r();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && t60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == t60Var.f31031y0 || pointerId == t60Var.f31032z0) {
                            t60Var.r();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && t60Var.B0) {
                        t60Var.r();
                    }
                }
                return true;
            case 3:
                q80 q80Var = (q80) ((WeakReference) this.f32687b).get();
                if (q80Var != null && (l80Var = q80Var.f30110m) != null && l80Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        q80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        q80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = q80Var.f30116p0;
                        if (view2 != null) {
                            q80Var.f30116p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        q80Var.f30114o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = q80Var.f30116p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            q80Var.f30116p0 = null;
                        }
                        view.setOnTouchListener(null);
                        q80Var.f30114o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                qb0 qb0Var = (qb0) this.f32687b;
                qb0Var.getClass();
                return org.telegram.ui.rt.q().s(motionEvent, qb0Var.getListView(), qb0Var.f30171w, null, qb0Var.f30163a);
            case 5:
                qc0 qc0Var = (qc0) this.f32687b;
                qc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    qc0Var.f30183c0.a(true);
                }
                return true;
            default:
                return yy0.x((yy0) this.f32687b, motionEvent);
        }
    }
}
