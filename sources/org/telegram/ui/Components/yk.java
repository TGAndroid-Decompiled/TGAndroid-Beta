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
public final class yk implements View.OnTouchListener {
    public final int f33119a;
    public final Object f33120b;

    public yk(Object obj, int i10) {
        this.f33119a = i10;
        this.f33120b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.f0 f0Var;
        float f10;
        n80 n80Var;
        switch (this.f33119a) {
            case 0:
                il ilVar = (il) this.f33120b;
                ilVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    ilVar.c0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = ((ps) this.f33120b).f29559a;
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
                v60 v60Var = (v60) this.f33120b;
                boolean z10 = false;
                if (v60Var.P == null || v60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = v60Var.f31412a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    v60Var.B0 = false;
                    v60Var.f31443z0 = motionEvent.getPointerId(0);
                    v60Var.A0 = -1;
                    int i10 = v60Var.R.f46817a;
                    if (i10 == 5) {
                        ImageView imageView = v60Var.I;
                        qi.p0 p0Var = v60Var.P;
                        if (p0Var != null && i10 == 5) {
                            boolean z11 = v60Var.f31421i0;
                            v60Var.f31421i0 = !z11;
                            qi.p0.v();
                            if (p0Var.X == 5 && (f0Var = p0Var.T) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                f0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = v60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = v60Var.f31421i0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (v60Var.f31421i0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.am.s(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        qi.o0 o0Var = v60Var.R;
                        if (o0Var.f46817a == 3 && !o0Var.f46820e) {
                            v60Var.f31443z0 = motionEvent.getPointerId(0);
                            v60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            v60Var.f31440x0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            v60Var.B0 = z10;
                            v60Var.f31442y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && v60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(v60Var.f31443z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(v60Var.A0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / v60Var.f31440x0;
                            qi.h0 h0Var = v60Var.S;
                            if (h0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = h0Var.f46767c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            v60Var.f31442y0 = f11;
                            v60Var.P.z(f11);
                        } else {
                            v60Var.s();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && v60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == v60Var.f31443z0 || pointerId == v60Var.A0) {
                            v60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && v60Var.B0) {
                        v60Var.s();
                    }
                }
                return true;
            case 3:
                s80 s80Var = (s80) ((WeakReference) this.f33120b).get();
                if (s80Var != null && (n80Var = s80Var.f30458m) != null && n80Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        s80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        s80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = s80Var.f30464p0;
                        if (view2 != null) {
                            s80Var.f30464p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        s80Var.f30462o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = s80Var.f30464p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            s80Var.f30464p0 = null;
                        }
                        view.setOnTouchListener(null);
                        s80Var.f30462o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                tb0 tb0Var = (tb0) this.f33120b;
                tb0Var.getClass();
                return org.telegram.ui.ut.q().s(motionEvent, tb0Var.getListView(), tb0Var.f30849w, null, tb0Var.f30841a);
            case 5:
                tc0 tc0Var = (tc0) this.f33120b;
                tc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    tc0Var.f30859c0.a(true);
                }
                return true;
            default:
                return dz0.x((dz0) this.f33120b, motionEvent);
        }
    }
}
