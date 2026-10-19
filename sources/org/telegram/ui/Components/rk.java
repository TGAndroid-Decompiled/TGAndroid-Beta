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
    public final int f29966a;
    public final Object f29967b;

    public rk(Object obj, int i10) {
        this.f29966a = i10;
        this.f29967b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.i0 i0Var;
        float f10;
        d80 d80Var;
        switch (this.f29966a) {
            case 0:
                al alVar = (al) this.f29967b;
                alVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    alVar.c0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = ((hs) this.f29967b).f26929a;
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
                l60 l60Var = (l60) this.f29967b;
                boolean z10 = false;
                if (l60Var.P == null || l60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = l60Var.f28090a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    l60Var.B0 = false;
                    l60Var.f28121z0 = motionEvent.getPointerId(0);
                    l60Var.A0 = -1;
                    int i10 = l60Var.R.f46751a;
                    if (i10 == 5) {
                        ImageView imageView = l60Var.I;
                        si.s0 s0Var = l60Var.P;
                        if (s0Var != null && i10 == 5) {
                            boolean z11 = l60Var.f28099i0;
                            l60Var.f28099i0 = !z11;
                            si.s0.t();
                            if (s0Var.W == 5 && (i0Var = s0Var.S) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                i0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = l60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = l60Var.f28099i0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (l60Var.f28099i0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.lk.s(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        si.r0 r0Var = l60Var.R;
                        if (r0Var.f46751a == 3 && !r0Var.e) {
                            l60Var.f28121z0 = motionEvent.getPointerId(0);
                            l60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            l60Var.f28118x0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            l60Var.B0 = z10;
                            l60Var.f28120y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && l60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(l60Var.f28121z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(l60Var.A0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / l60Var.f28118x0;
                            si.k0 k0Var = l60Var.S;
                            if (k0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = k0Var.f46697c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            l60Var.f28120y0 = f11;
                            l60Var.P.w(f11);
                        } else {
                            l60Var.s();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && l60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == l60Var.f28121z0 || pointerId == l60Var.A0) {
                            l60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && l60Var.B0) {
                        l60Var.s();
                    }
                }
                return true;
            case 3:
                i80 i80Var = (i80) ((WeakReference) this.f29967b).get();
                if (i80Var != null && (d80Var = i80Var.f27126m) != null && d80Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        i80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        i80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = i80Var.f27132p0;
                        if (view2 != null) {
                            i80Var.f27132p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        i80Var.f27130o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = i80Var.f27132p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            i80Var.f27132p0 = null;
                        }
                        view.setOnTouchListener(null);
                        i80Var.f27130o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                ib0 ib0Var = (ib0) this.f29967b;
                ib0Var.getClass();
                return org.telegram.ui.et.q().s(motionEvent, ib0Var.getListView(), ib0Var.f27192w, null, ib0Var.f27185a);
            case 5:
                ic0 ic0Var = (ic0) this.f29967b;
                ic0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ic0Var.f27202c0.a(true);
                }
                return true;
            default:
                return py0.x((py0) this.f29967b, motionEvent);
        }
    }
}
