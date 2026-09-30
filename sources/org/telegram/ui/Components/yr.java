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
public final class yr implements View.OnTouchListener {
    public final int f30801a;
    public final Object f30802b;

    public yr(Object obj, int i10) {
        this.f30801a = i10;
        this.f30802b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.f0 f0Var;
        float f10;
        w70 w70Var;
        switch (this.f30801a) {
            case 0:
                org.telegram.ui.ActionBar.m1 m1Var = ((as) this.f30802b).f22706a;
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
                e60 e60Var = (e60) this.f30802b;
                boolean z10 = false;
                if (e60Var.P == null || e60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = e60Var.f23858a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    e60Var.f23881u0 = false;
                    e60Var.f23879s0 = motionEvent.getPointerId(0);
                    e60Var.f23880t0 = -1;
                    int i10 = e60Var.R.f13851a;
                    if (i10 == 5) {
                        ImageView imageView = e60Var.I;
                        ki.s0 s0Var = e60Var.P;
                        if (s0Var != null && i10 == 5) {
                            boolean z11 = e60Var.f23866h0;
                            e60Var.f23866h0 = !z11;
                            ki.s0.t();
                            if (s0Var.W == 5 && (f0Var = s0Var.S) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                f0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = e60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = e60Var.f23866h0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (e60Var.f23866h0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.ok.r(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.r0 r0Var = e60Var.R;
                        if (r0Var.f13851a == 3 && !r0Var.e) {
                            e60Var.f23879s0 = motionEvent.getPointerId(0);
                            e60Var.f23880t0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            e60Var.f23875q0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            e60Var.f23881u0 = z10;
                            e60Var.f23877r0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && e60Var.f23881u0) {
                        int findPointerIndex = motionEvent.findPointerIndex(e60Var.f23879s0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(e60Var.f23880t0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / e60Var.f23875q0;
                            ki.k0 k0Var = e60Var.S;
                            if (k0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = k0Var.f13777c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            e60Var.f23877r0 = f11;
                            e60Var.P.w(f11);
                        } else {
                            e60Var.q();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && e60Var.f23881u0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == e60Var.f23879s0 || pointerId == e60Var.f23880t0) {
                            e60Var.q();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && e60Var.f23881u0) {
                        e60Var.q();
                    }
                }
                return true;
            case 2:
                b80 b80Var = (b80) ((WeakReference) this.f30802b).get();
                if (b80Var != null && (w70Var = b80Var.f22862m) != null && w70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        b80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        b80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = b80Var.f22868p0;
                        if (view2 != null) {
                            b80Var.f22868p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        b80Var.f22866o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = b80Var.f22868p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            b80Var.f22868p0 = null;
                        }
                        view.setOnTouchListener(null);
                        b80Var.f22866o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 3:
                cb0 cb0Var = (cb0) this.f30802b;
                cb0Var.getClass();
                return org.telegram.ui.nt.q().s(motionEvent, cb0Var.getListView(), cb0Var.f23254w, null, cb0Var.f23247a);
            case 4:
                cc0 cc0Var = (cc0) this.f30802b;
                cc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    cc0Var.f23264c0.a(true);
                }
                return true;
            default:
                return iy0.v((iy0) this.f30802b, motionEvent);
        }
    }
}
