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
public final class wr implements View.OnTouchListener {
    public final int f30152a;
    public final Object f30153b;

    public wr(Object obj, int i10) {
        this.f30152a = i10;
        this.f30153b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.f0 f0Var;
        float f10;
        t70 t70Var;
        switch (this.f30152a) {
            case 0:
                org.telegram.ui.ActionBar.m1 m1Var = ((yr) this.f30153b).f30662a;
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
                b60 b60Var = (b60) this.f30153b;
                boolean z10 = false;
                if (b60Var.M == null || b60Var.O == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = b60Var.U;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    b60Var.f22886r0 = false;
                    b60Var.f22883p0 = motionEvent.getPointerId(0);
                    b60Var.f22884q0 = -1;
                    int i10 = b60Var.O.f13825a;
                    if (i10 == 5) {
                        ImageView imageView = b60Var.I;
                        ki.r0 r0Var = b60Var.M;
                        if (r0Var != null && i10 == 5) {
                            boolean z11 = b60Var.f22871e0;
                            b60Var.f22871e0 = !z11;
                            ki.r0.s();
                            if (r0Var.V == 5 && (f0Var = r0Var.R) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                f0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = b60Var.R;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = b60Var.f22871e0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (b60Var.f22871e0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.ok.r(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.q0 q0Var = b60Var.O;
                        if (q0Var.f13825a == 3 && !q0Var.e) {
                            b60Var.f22883p0 = motionEvent.getPointerId(0);
                            b60Var.f22884q0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            b60Var.f22881n0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            b60Var.f22886r0 = z10;
                            b60Var.f22882o0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && b60Var.f22886r0) {
                        int findPointerIndex = motionEvent.findPointerIndex(b60Var.f22883p0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(b60Var.f22884q0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / b60Var.f22881n0;
                            ki.j0 j0Var = b60Var.P;
                            if (j0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = j0Var.f13755c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            b60Var.f22882o0 = f11;
                            b60Var.M.v(f11);
                        } else {
                            b60Var.p();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && b60Var.f22886r0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == b60Var.f22883p0 || pointerId == b60Var.f22884q0) {
                            b60Var.p();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && b60Var.f22886r0) {
                        b60Var.p();
                    }
                }
                return true;
            case 2:
                y70 y70Var = (y70) ((WeakReference) this.f30153b).get();
                if (y70Var != null && (t70Var = y70Var.f30537m) != null && t70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        y70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        y70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = y70Var.f30543p0;
                        if (view2 != null) {
                            y70Var.f30543p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        y70Var.f30541o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = y70Var.f30543p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            y70Var.f30543p0 = null;
                        }
                        view.setOnTouchListener(null);
                        y70Var.f30541o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 3:
                za0 za0Var = (za0) this.f30153b;
                za0Var.getClass();
                return org.telegram.ui.nt.q().s(motionEvent, za0Var.getListView(), za0Var.f30820w, null, za0Var.f30813a);
            case 4:
                zb0 zb0Var = (zb0) this.f30153b;
                zb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    zb0Var.f30829c0.a(true);
                }
                return true;
            default:
                return fy0.v((fy0) this.f30153b, motionEvent);
        }
    }
}
