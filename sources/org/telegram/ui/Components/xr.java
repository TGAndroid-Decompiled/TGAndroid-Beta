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
public final class xr implements View.OnTouchListener {
    public final int f30473a;
    public final Object f30474b;

    public xr(Object obj, int i10) {
        this.f30473a = i10;
        this.f30474b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.f0 f0Var;
        float f10;
        v70 v70Var;
        switch (this.f30473a) {
            case 0:
                org.telegram.ui.ActionBar.m1 m1Var = ((zr) this.f30474b).f30961a;
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
            case 1:
                d60 d60Var = (d60) this.f30474b;
                boolean z10 = false;
                if (d60Var.P == null || d60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = d60Var.f23534a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    d60Var.f23557u0 = false;
                    d60Var.f23555s0 = motionEvent.getPointerId(0);
                    d60Var.f23556t0 = -1;
                    int i10 = d60Var.R.f13836a;
                    if (i10 == 5) {
                        ImageView imageView = d60Var.I;
                        ki.s0 s0Var = d60Var.P;
                        if (s0Var != null && i10 == 5) {
                            boolean z11 = d60Var.f23542h0;
                            d60Var.f23542h0 = !z11;
                            ki.s0.t();
                            if (s0Var.W == 5 && (f0Var = s0Var.S) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                f0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = d60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = d60Var.f23542h0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (d60Var.f23542h0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.ok.r(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.r0 r0Var = d60Var.R;
                        if (r0Var.f13836a == 3 && !r0Var.e) {
                            d60Var.f23555s0 = motionEvent.getPointerId(0);
                            d60Var.f23556t0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            d60Var.f23551q0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            d60Var.f23557u0 = z10;
                            d60Var.f23553r0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && d60Var.f23557u0) {
                        int findPointerIndex = motionEvent.findPointerIndex(d60Var.f23555s0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(d60Var.f23556t0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / d60Var.f23551q0;
                            ki.k0 k0Var = d60Var.S;
                            if (k0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = k0Var.f13762c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            d60Var.f23553r0 = f11;
                            d60Var.P.w(f11);
                        } else {
                            d60Var.q();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && d60Var.f23557u0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == d60Var.f23555s0 || pointerId == d60Var.f23556t0) {
                            d60Var.q();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && d60Var.f23557u0) {
                        d60Var.q();
                    }
                }
                return true;
            case 2:
                a80 a80Var = (a80) ((WeakReference) this.f30474b).get();
                if (a80Var != null && (v70Var = a80Var.f22593m) != null && v70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        a80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        a80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = a80Var.f22599p0;
                        if (view2 != null) {
                            a80Var.f22599p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        a80Var.f22597o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = a80Var.f22599p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            a80Var.f22599p0 = null;
                        }
                        view.setOnTouchListener(null);
                        a80Var.f22597o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 3:
                bb0 bb0Var = (bb0) this.f30474b;
                bb0Var.getClass();
                return org.telegram.ui.nt.q().s(motionEvent, bb0Var.getListView(), bb0Var.f22941w, null, bb0Var.f22934a);
            case 4:
                bc0 bc0Var = (bc0) this.f30474b;
                bc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    bc0Var.f22951c0.a(true);
                }
                return true;
            default:
                return hy0.v((hy0) this.f30474b, motionEvent);
        }
    }
}
