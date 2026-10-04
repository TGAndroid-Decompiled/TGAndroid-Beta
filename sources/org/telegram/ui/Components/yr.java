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
    public final int f33239a;
    public final Object f33240b;

    public yr(Object obj, int i10) {
        this.f33239a = i10;
        this.f33240b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.f0 f0Var;
        float f10;
        w70 w70Var;
        switch (this.f33239a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((as) this.f33240b).f24650a;
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
            case 1:
                e60 e60Var = (e60) this.f33240b;
                boolean z10 = false;
                if (e60Var.P == null || e60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = e60Var.f25941a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    e60Var.f25964u0 = false;
                    e60Var.f25962s0 = motionEvent.getPointerId(0);
                    e60Var.f25963t0 = -1;
                    int i10 = e60Var.R.f15035a;
                    if (i10 == 5) {
                        ImageView imageView = e60Var.I;
                        ki.s0 s0Var = e60Var.P;
                        if (s0Var != null && i10 == 5) {
                            boolean z11 = e60Var.f25949h0;
                            e60Var.f25949h0 = !z11;
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
                                videoEditedInfo.muted = e60Var.f25949h0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (e60Var.f25949h0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.ok.r(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.r0 r0Var = e60Var.R;
                        if (r0Var.f15035a == 3 && !r0Var.f15038e) {
                            e60Var.f25962s0 = motionEvent.getPointerId(0);
                            e60Var.f25963t0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            e60Var.f25958q0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            e60Var.f25964u0 = z10;
                            e60Var.f25960r0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && e60Var.f25964u0) {
                        int findPointerIndex = motionEvent.findPointerIndex(e60Var.f25962s0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(e60Var.f25963t0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / e60Var.f25958q0;
                            ki.k0 k0Var = e60Var.S;
                            if (k0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = k0Var.f14958c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            e60Var.f25960r0 = f11;
                            e60Var.P.w(f11);
                        } else {
                            e60Var.q();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && e60Var.f25964u0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == e60Var.f25962s0 || pointerId == e60Var.f25963t0) {
                            e60Var.q();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && e60Var.f25964u0) {
                        e60Var.q();
                    }
                }
                return true;
            case 2:
                b80 b80Var = (b80) ((WeakReference) this.f33240b).get();
                if (b80Var != null && (w70Var = b80Var.f24835m) != null && w70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        b80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        b80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = b80Var.f24841p0;
                        if (view2 != null) {
                            b80Var.f24841p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        b80Var.f24839o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = b80Var.f24841p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            b80Var.f24841p0 = null;
                        }
                        view.setOnTouchListener(null);
                        b80Var.f24839o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 3:
                bb0 bb0Var = (bb0) this.f33240b;
                bb0Var.getClass();
                return org.telegram.ui.rt.q().s(motionEvent, bb0Var.getListView(), bb0Var.f24914w, null, bb0Var.f24906a);
            case 4:
                cc0 cc0Var = (cc0) this.f33240b;
                cc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    cc0Var.f25321c0.a(true);
                }
                return true;
            default:
                return qy0.v((qy0) this.f33240b, motionEvent);
        }
    }
}
