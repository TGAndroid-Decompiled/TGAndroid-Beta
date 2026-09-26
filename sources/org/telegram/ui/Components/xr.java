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
    public final int f30457a;
    public final Object f30458b;

    public xr(Object obj, int i10) {
        this.f30457a = i10;
        this.f30458b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.f0 f0Var;
        float f10;
        u70 u70Var;
        switch (this.f30457a) {
            case 0:
                org.telegram.ui.ActionBar.m1 m1Var = ((zr) this.f30458b).f30949a;
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
                c60 c60Var = (c60) this.f30458b;
                boolean z10 = false;
                if (c60Var.P == null || c60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = c60Var.f23218a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    c60Var.f23241u0 = false;
                    c60Var.f23239s0 = motionEvent.getPointerId(0);
                    c60Var.f23240t0 = -1;
                    int i10 = c60Var.R.f13835a;
                    if (i10 == 5) {
                        ImageView imageView = c60Var.I;
                        ki.s0 s0Var = c60Var.P;
                        if (s0Var != null && i10 == 5) {
                            boolean z11 = c60Var.f23226h0;
                            c60Var.f23226h0 = !z11;
                            ki.s0.s();
                            if (s0Var.V == 5 && (f0Var = s0Var.R) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                f0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = c60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = c60Var.f23226h0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (c60Var.f23226h0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.ok.r(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.r0 r0Var = c60Var.R;
                        if (r0Var.f13835a == 3 && !r0Var.e) {
                            c60Var.f23239s0 = motionEvent.getPointerId(0);
                            c60Var.f23240t0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            c60Var.f23235q0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            c60Var.f23241u0 = z10;
                            c60Var.f23237r0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && c60Var.f23241u0) {
                        int findPointerIndex = motionEvent.findPointerIndex(c60Var.f23239s0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(c60Var.f23240t0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / c60Var.f23235q0;
                            ki.k0 k0Var = c60Var.S;
                            if (k0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = k0Var.f13761c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            c60Var.f23237r0 = f11;
                            c60Var.P.v(f11);
                        } else {
                            c60Var.q();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && c60Var.f23241u0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == c60Var.f23239s0 || pointerId == c60Var.f23240t0) {
                            c60Var.q();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && c60Var.f23241u0) {
                        c60Var.q();
                    }
                }
                return true;
            case 2:
                z70 z70Var = (z70) ((WeakReference) this.f30458b).get();
                if (z70Var != null && (u70Var = z70Var.f30829m) != null && u70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        z70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        z70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = z70Var.f30835p0;
                        if (view2 != null) {
                            z70Var.f30835p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        z70Var.f30833o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = z70Var.f30835p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            z70Var.f30835p0 = null;
                        }
                        view.setOnTouchListener(null);
                        z70Var.f30833o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 3:
                ab0 ab0Var = (ab0) this.f30458b;
                ab0Var.getClass();
                return org.telegram.ui.nt.q().s(motionEvent, ab0Var.getListView(), ab0Var.f22597w, null, ab0Var.f22590a);
            case 4:
                ac0 ac0Var = (ac0) this.f30458b;
                ac0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ac0Var.f22606c0.a(true);
                }
                return true;
            default:
                return gy0.v((gy0) this.f30458b, motionEvent);
        }
    }
}
