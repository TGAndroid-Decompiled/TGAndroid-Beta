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
public final class vr implements View.OnTouchListener {
    public final int f29821a;
    public final Object f29822b;

    public vr(Object obj, int i10) {
        this.f29821a = i10;
        this.f29822b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.e0 e0Var;
        float f10;
        q70 q70Var;
        switch (this.f29821a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((xr) this.f29822b).f30353a;
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
                z50 z50Var = (z50) this.f29822b;
                boolean z10 = false;
                if (z50Var.K == null || z50Var.M == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = z50Var.S;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    z50Var.f30730p0 = false;
                    z50Var.f30728n0 = motionEvent.getPointerId(0);
                    z50Var.f30729o0 = -1;
                    int i10 = z50Var.M.f13774a;
                    if (i10 == 5) {
                        ImageView imageView = z50Var.G;
                        ki.o0 o0Var = z50Var.K;
                        if (o0Var != null && i10 == 5) {
                            boolean z11 = z50Var.f30716c0;
                            z50Var.f30716c0 = !z11;
                            ki.o0.s();
                            if (o0Var.U == 5 && (e0Var = o0Var.Q) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                e0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = z50Var.P;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = z50Var.f30716c0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (z50Var.f30716c0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.rk.r(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.n0 n0Var = z50Var.M;
                        if (n0Var.f13774a == 3 && !n0Var.e) {
                            z50Var.f30728n0 = motionEvent.getPointerId(0);
                            z50Var.f30729o0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            z50Var.f30726l0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            z50Var.f30730p0 = z10;
                            z50Var.m0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && z50Var.f30730p0) {
                        int findPointerIndex = motionEvent.findPointerIndex(z50Var.f30728n0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(z50Var.f30729o0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / z50Var.f30726l0;
                            ki.g0 g0Var = z50Var.N;
                            if (g0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = g0Var.f13691c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            z50Var.m0 = f11;
                            z50Var.K.v(f11);
                        } else {
                            z50Var.o();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && z50Var.f30730p0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == z50Var.f30728n0 || pointerId == z50Var.f30729o0) {
                            z50Var.o();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && z50Var.f30730p0) {
                        z50Var.o();
                    }
                }
                return true;
            case 2:
                v70 v70Var = (v70) ((WeakReference) this.f29822b).get();
                if (v70Var != null && (q70Var = v70Var.f28984m) != null && q70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        v70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        v70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = v70Var.f28990p0;
                        if (view2 != null) {
                            v70Var.f28990p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        v70Var.f28988o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = v70Var.f28990p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            v70Var.f28990p0 = null;
                        }
                        view.setOnTouchListener(null);
                        v70Var.f28988o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 3:
                va0 va0Var = (va0) this.f29822b;
                va0Var.getClass();
                return org.telegram.ui.st.q().s(motionEvent, va0Var.getListView(), va0Var.f29052w, null, va0Var.f29045a);
            case 4:
                xb0 xb0Var = (xb0) this.f29822b;
                xb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    xb0Var.f30229c0.a(true);
                }
                return true;
            default:
                return gy0.v((gy0) this.f29822b, motionEvent);
        }
    }
}
