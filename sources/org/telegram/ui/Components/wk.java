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
    public final int f32716a;
    public final Object f32717b;

    public wk(Object obj, int i10) {
        this.f32716a = i10;
        this.f32717b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.f0 f0Var;
        float f10;
        k80 k80Var;
        switch (this.f32716a) {
            case 0:
                gl glVar = (gl) this.f32717b;
                glVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    glVar.c0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = ((os) this.f32717b).f29625a;
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
                s60 s60Var = (s60) this.f32717b;
                boolean z10 = false;
                if (s60Var.P == null || s60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = s60Var.f30750a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    s60Var.B0 = false;
                    s60Var.f30781z0 = motionEvent.getPointerId(0);
                    s60Var.A0 = -1;
                    int i10 = s60Var.R.f15150a;
                    if (i10 == 5) {
                        ImageView imageView = s60Var.I;
                        ki.v0 v0Var = s60Var.P;
                        if (v0Var != null && i10 == 5) {
                            boolean z11 = s60Var.f30759i0;
                            s60Var.f30759i0 = !z11;
                            ki.v0.t();
                            if (v0Var.W == 5 && (f0Var = v0Var.S) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                f0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = s60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = s60Var.f30759i0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (s60Var.f30759i0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.ai.s(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.u0 u0Var = s60Var.R;
                        if (u0Var.f15150a == 3 && !u0Var.f15153e) {
                            s60Var.f30781z0 = motionEvent.getPointerId(0);
                            s60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            s60Var.f30778x0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            s60Var.B0 = z10;
                            s60Var.f30780y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && s60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(s60Var.f30781z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(s60Var.A0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / s60Var.f30778x0;
                            ki.n0 n0Var = s60Var.S;
                            if (n0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = n0Var.f15072c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            s60Var.f30780y0 = f11;
                            s60Var.P.w(f11);
                        } else {
                            s60Var.s();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && s60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == s60Var.f30781z0 || pointerId == s60Var.A0) {
                            s60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && s60Var.B0) {
                        s60Var.s();
                    }
                }
                return true;
            case 3:
                p80 p80Var = (p80) ((WeakReference) this.f32717b).get();
                if (p80Var != null && (k80Var = p80Var.f29769m) != null && k80Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        p80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        p80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = p80Var.f29775p0;
                        if (view2 != null) {
                            p80Var.f29775p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        p80Var.f29773o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = p80Var.f29775p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            p80Var.f29775p0 = null;
                        }
                        view.setOnTouchListener(null);
                        p80Var.f29773o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                pb0 pb0Var = (pb0) this.f32717b;
                pb0Var.getClass();
                return org.telegram.ui.qt.q().s(motionEvent, pb0Var.getListView(), pb0Var.f29836w, null, pb0Var.f29828a);
            case 5:
                pc0 pc0Var = (pc0) this.f32717b;
                pc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    pc0Var.f29848c0.a(true);
                }
                return true;
            default:
                return yy0.x((yy0) this.f32717b, motionEvent);
        }
    }
}
