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
public final class uk implements View.OnTouchListener {
    public final int f29702a;
    public final Object f29703b;

    public uk(Object obj, int i10) {
        this.f29702a = i10;
        this.f29703b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.h0 h0Var;
        float f10;
        h80 h80Var;
        switch (this.f29702a) {
            case 0:
                dl dlVar = (dl) this.f29703b;
                dlVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    dlVar.c0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = ((ks) this.f29703b).f26796a;
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
                o60 o60Var = (o60) this.f29703b;
                boolean z10 = false;
                if (o60Var.P == null || o60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = o60Var.f27860a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    o60Var.B0 = false;
                    o60Var.f27891z0 = motionEvent.getPointerId(0);
                    o60Var.A0 = -1;
                    int i10 = o60Var.R.f14957a;
                    if (i10 == 5) {
                        ImageView imageView = o60Var.I;
                        li.u0 u0Var = o60Var.P;
                        if (u0Var != null && i10 == 5) {
                            boolean z11 = o60Var.f27869i0;
                            o60Var.f27869i0 = !z11;
                            li.u0.t();
                            if (u0Var.W == 5 && (h0Var = u0Var.S) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                h0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = o60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = o60Var.f27869i0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (o60Var.f27869i0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.yh.r(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        li.t0 t0Var = o60Var.R;
                        if (t0Var.f14957a == 3 && !t0Var.e) {
                            o60Var.f27891z0 = motionEvent.getPointerId(0);
                            o60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            o60Var.f27888x0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            o60Var.B0 = z10;
                            o60Var.f27890y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && o60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(o60Var.f27891z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(o60Var.A0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / o60Var.f27888x0;
                            li.m0 m0Var = o60Var.S;
                            if (m0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = m0Var.f14906c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            o60Var.f27890y0 = f11;
                            o60Var.P.w(f11);
                        } else {
                            o60Var.s();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && o60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == o60Var.f27891z0 || pointerId == o60Var.A0) {
                            o60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && o60Var.B0) {
                        o60Var.s();
                    }
                }
                return true;
            case 3:
                m80 m80Var = (m80) ((WeakReference) this.f29703b).get();
                if (m80Var != null && (h80Var = m80Var.f27288m) != null && h80Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        m80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        m80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = m80Var.f27294p0;
                        if (view2 != null) {
                            m80Var.f27294p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        m80Var.f27292o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = m80Var.f27294p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            m80Var.f27294p0 = null;
                        }
                        view.setOnTouchListener(null);
                        m80Var.f27292o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                ob0 ob0Var = (ob0) this.f29703b;
                ob0Var.getClass();
                return org.telegram.ui.xt.q().s(motionEvent, ob0Var.getListView(), ob0Var.f27933w, null, ob0Var.f27926a);
            case 5:
                pc0 pc0Var = (pc0) this.f29703b;
                pc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    pc0Var.f28286c0.a(true);
                }
                return true;
            default:
                return ty0.x((ty0) this.f29703b, motionEvent);
        }
    }
}
