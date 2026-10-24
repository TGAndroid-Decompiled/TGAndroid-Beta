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
public final class pk implements View.OnTouchListener {
    public final int f29576a;
    public final Object f29577b;

    public pk(Object obj, int i10) {
        this.f29576a = i10;
        this.f29577b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.h0 h0Var;
        float f10;
        c80 c80Var;
        switch (this.f29576a) {
            case 0:
                yk ykVar = (yk) this.f29577b;
                ykVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    ykVar.c0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = ((fs) this.f29577b).f26426a;
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
                k60 k60Var = (k60) this.f29577b;
                boolean z10 = false;
                if (k60Var.P == null || k60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = k60Var.f27875a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    k60Var.B0 = false;
                    k60Var.f27906z0 = motionEvent.getPointerId(0);
                    k60Var.A0 = -1;
                    int i10 = k60Var.R.f47241a;
                    if (i10 == 5) {
                        ImageView imageView = k60Var.I;
                        si.u0 u0Var = k60Var.P;
                        if (u0Var != null && i10 == 5) {
                            boolean z11 = k60Var.f27884i0;
                            k60Var.f27884i0 = !z11;
                            si.u0.t();
                            if (u0Var.W == 5 && (h0Var = u0Var.S) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                h0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = k60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = k60Var.f27884i0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (k60Var.f27884i0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.tl.s(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        si.t0 t0Var = k60Var.R;
                        if (t0Var.f47241a == 3 && !t0Var.e) {
                            k60Var.f27906z0 = motionEvent.getPointerId(0);
                            k60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            k60Var.f27903x0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            k60Var.B0 = z10;
                            k60Var.f27905y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && k60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(k60Var.f27906z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(k60Var.A0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / k60Var.f27903x0;
                            si.l0 l0Var = k60Var.S;
                            if (l0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = l0Var.f47144c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            k60Var.f27905y0 = f11;
                            k60Var.P.w(f11);
                        } else {
                            k60Var.s();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && k60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == k60Var.f27906z0 || pointerId == k60Var.A0) {
                            k60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && k60Var.B0) {
                        k60Var.s();
                    }
                }
                return true;
            case 3:
                h80 h80Var = (h80) ((WeakReference) this.f29577b).get();
                if (h80Var != null && (c80Var = h80Var.f26919m) != null && c80Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        h80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        h80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = h80Var.f26925p0;
                        if (view2 != null) {
                            h80Var.f26925p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        h80Var.f26923o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = h80Var.f26925p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            h80Var.f26925p0 = null;
                        }
                        view.setOnTouchListener(null);
                        h80Var.f26923o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                hb0 hb0Var = (hb0) this.f29577b;
                hb0Var.getClass();
                return org.telegram.ui.ht.o().q(motionEvent, hb0Var.getListView(), hb0Var.f26999w, null, hb0Var.f26992a);
            case 5:
                jc0 jc0Var = (jc0) this.f29577b;
                jc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    jc0Var.f27674c0.a(true);
                }
                return true;
            default:
                return sy0.y((sy0) this.f29577b, motionEvent);
        }
    }
}
