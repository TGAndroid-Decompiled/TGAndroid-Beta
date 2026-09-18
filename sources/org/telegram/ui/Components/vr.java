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
    public final int f29746a;
    public final Object f29747b;

    public vr(Object obj, int i10) {
        this.f29746a = i10;
        this.f29747b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ki.g0 g0Var;
        i2.e0 e0Var;
        float f7;
        r70 r70Var;
        int i10 = this.f29746a;
        Object obj = this.f29747b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((xr) obj).f30365a;
                if (motionEvent.getActionMasked() == 1 && n1Var != null && n1Var.isShowing()) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        n1Var.d(true);
                    }
                }
                return false;
            case 1:
                a60 a60Var = (a60) obj;
                if (a60Var.J == null || a60Var.K == null) {
                    return false;
                }
                float f10 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    a60Var.f22520k0 = false;
                    ValueAnimator valueAnimator = a60Var.Q;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    a60Var.f22518i0 = motionEvent.getY();
                    a60Var.f22519j0 = 0.0f;
                } else if (motionEvent.getActionMasked() == 2) {
                    ki.g0 g0Var2 = a60Var.K;
                    if (g0Var2.f13699a == 3 && !g0Var2.e) {
                        float y3 = a60Var.f22518i0 - motionEvent.getY();
                        if (y3 > AndroidUtilities.dp(8.0f) || a60Var.f22520k0) {
                            a60Var.f22520k0 = true;
                            float max = Math.max(0.0f, Math.min(1.0f, y3 / Math.max(1.0f, view.getHeight())));
                            a60Var.f22519j0 = max;
                            a60Var.J.w(max);
                        }
                    }
                } else if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
                    return false;
                } else {
                    if (a60Var.f22520k0) {
                        if (a60Var.J != null) {
                            ValueAnimator valueAnimator2 = a60Var.Q;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(a60Var.f22519j0, 0.0f);
                            a60Var.Q = ofFloat;
                            ofFloat.setDuration(180L);
                            a60Var.Q.addUpdateListener(new v50(a60Var, 1));
                            a60Var.Q.start();
                        }
                    } else if (motionEvent.getActionMasked() == 1) {
                        ImageView imageView = a60Var.F;
                        ki.h0 h0Var = a60Var.J;
                        if (h0Var != null && (g0Var = a60Var.K) != null && g0Var.f13699a == 5) {
                            boolean z10 = a60Var.f22509a0;
                            a60Var.f22509a0 = !z10;
                            ki.h0.r();
                            if (h0Var.Q == 5 && (e0Var = h0Var.L) != null) {
                                if (!z10) {
                                    f7 = 0.0f;
                                } else {
                                    f7 = 1.0f;
                                }
                                e0Var.U(f7);
                            }
                            VideoEditedInfo videoEditedInfo = a60Var.N;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = a60Var.f22509a0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (a60Var.f22509a0) {
                                f10 = 1.0f;
                            }
                            org.telegram.messenger.wh.q(animate, f10, 180L);
                        }
                    }
                }
                return true;
            case 2:
                w70 w70Var = (w70) ((WeakReference) obj).get();
                if (w70Var != null && (r70Var = w70Var.f29914m) != null && r70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        w70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        w70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = w70Var.f29920p0;
                        if (view2 != null) {
                            w70Var.f29920p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        w70Var.f29918o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = w70Var.f29920p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            w70Var.f29920p0 = null;
                        }
                        view.setOnTouchListener(null);
                        w70Var.f29918o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 3:
                wa0 wa0Var = (wa0) obj;
                wa0Var.getClass();
                return org.telegram.ui.st.q().s(motionEvent, wa0Var.getListView(), wa0Var.f30010w, null, wa0Var.f30003a);
            case 4:
                yb0 yb0Var = (yb0) obj;
                yb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    yb0Var.f30537c0.a(true);
                }
                return true;
            default:
                return hy0.v((hy0) obj, motionEvent);
        }
    }
}
