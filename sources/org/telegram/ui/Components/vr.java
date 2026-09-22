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
    public final int f29784a;
    public final Object f29785b;

    public vr(Object obj, int i10) {
        this.f29784a = i10;
        this.f29785b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.e0 e0Var;
        float f10;
        t70 t70Var;
        switch (this.f29784a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((xr) this.f29785b).f30400a;
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
                b60 b60Var = (b60) this.f29785b;
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
                    b60Var.f22889r0 = false;
                    b60Var.f22886p0 = motionEvent.getPointerId(0);
                    b60Var.f22887q0 = -1;
                    int i10 = b60Var.O.f13812a;
                    if (i10 == 5) {
                        ImageView imageView = b60Var.I;
                        ki.q0 q0Var = b60Var.M;
                        if (q0Var != null && i10 == 5) {
                            boolean z11 = b60Var.f22874e0;
                            b60Var.f22874e0 = !z11;
                            ki.q0.s();
                            if (q0Var.U == 5 && (e0Var = q0Var.Q) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                e0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = b60Var.R;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = b60Var.f22874e0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (b60Var.f22874e0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.rk.r(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ki.p0 p0Var = b60Var.O;
                        if (p0Var.f13812a == 3 && !p0Var.e) {
                            b60Var.f22886p0 = motionEvent.getPointerId(0);
                            b60Var.f22887q0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            b60Var.f22884n0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            b60Var.f22889r0 = z10;
                            b60Var.f22885o0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && b60Var.f22889r0) {
                        int findPointerIndex = motionEvent.findPointerIndex(b60Var.f22886p0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(b60Var.f22887q0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / b60Var.f22884n0;
                            ki.h0 h0Var = b60Var.P;
                            if (h0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = h0Var.f13738c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            b60Var.f22885o0 = f11;
                            b60Var.M.v(f11);
                        } else {
                            b60Var.p();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && b60Var.f22889r0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == b60Var.f22886p0 || pointerId == b60Var.f22887q0) {
                            b60Var.p();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && b60Var.f22889r0) {
                        b60Var.p();
                    }
                }
                return true;
            case 2:
                y70 y70Var = (y70) ((WeakReference) this.f29785b).get();
                if (y70Var != null && (t70Var = y70Var.f30558m) != null && t70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        y70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        y70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = y70Var.f30564p0;
                        if (view2 != null) {
                            y70Var.f30564p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        y70Var.f30562o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = y70Var.f30564p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            y70Var.f30564p0 = null;
                        }
                        view.setOnTouchListener(null);
                        y70Var.f30562o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 3:
                ya0 ya0Var = (ya0) this.f29785b;
                ya0Var.getClass();
                return org.telegram.ui.st.q().s(motionEvent, ya0Var.getListView(), ya0Var.f30622w, null, ya0Var.f30615a);
            case 4:
                ac0 ac0Var = (ac0) this.f29785b;
                ac0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ac0Var.f22625c0.a(true);
                }
                return true;
            default:
                return iy0.v((iy0) this.f29785b, motionEvent);
        }
    }
}
