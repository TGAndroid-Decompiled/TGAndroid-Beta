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
    public final int f32258a;
    public final Object f32259b;

    public rk(Object obj, int i10) {
        this.f32258a = i10;
        this.f32259b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.j0 j0Var;
        float f10;
        f80 f80Var;
        switch (this.f32258a) {
            case 0:
                al alVar = (al) this.f32259b;
                alVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    alVar.c0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.o1 o1Var = ((js) this.f32259b).f29710a;
                if (motionEvent.getActionMasked() == 1 && o1Var != null && o1Var.isShowing()) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        o1Var.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 2:
                n60 n60Var = (n60) this.f32259b;
                boolean z10 = false;
                if (n60Var.P == null || n60Var.R == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = n60Var.f30847a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    n60Var.B0 = false;
                    n60Var.f30878z0 = motionEvent.getPointerId(0);
                    n60Var.A0 = -1;
                    int i10 = n60Var.R.f50531a;
                    if (i10 == 5) {
                        ImageView imageView = n60Var.I;
                        vi.s0 s0Var = n60Var.P;
                        if (s0Var != null && i10 == 5) {
                            boolean z11 = n60Var.f30856i0;
                            n60Var.f30856i0 = !z11;
                            vi.s0.t();
                            if (s0Var.W == 5 && (j0Var = s0Var.S) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                j0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = n60Var.U;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = n60Var.f30856i0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (n60Var.f30856i0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.vh.p(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        vi.r0 r0Var = n60Var.R;
                        if (r0Var.f50531a == 3 && !r0Var.e) {
                            n60Var.f30878z0 = motionEvent.getPointerId(0);
                            n60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            n60Var.f30875x0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            n60Var.B0 = z10;
                            n60Var.f30877y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && n60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(n60Var.f30878z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(n60Var.A0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / n60Var.f30875x0;
                            vi.k0 k0Var = n60Var.S;
                            if (k0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = k0Var.f50480c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            n60Var.f30877y0 = f11;
                            n60Var.P.w(f11);
                        } else {
                            n60Var.s();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && n60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == n60Var.f30878z0 || pointerId == n60Var.A0) {
                            n60Var.s();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && n60Var.B0) {
                        n60Var.s();
                    }
                }
                return true;
            case 3:
                k80 k80Var = (k80) ((WeakReference) this.f32259b).get();
                if (k80Var != null && (f80Var = k80Var.f29856m) != null && f80Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        k80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        k80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = k80Var.f29862p0;
                        if (view2 != null) {
                            k80Var.f29862p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        k80Var.f29860o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = k80Var.f29862p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            k80Var.f29862p0 = null;
                        }
                        view.setOnTouchListener(null);
                        k80Var.f29860o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                gb0 gb0Var = (gb0) this.f32259b;
                gb0Var.getClass();
                return org.telegram.ui.ft.o().q(motionEvent, gb0Var.getListView(), gb0Var.f28524w, null, gb0Var.f28517a);
            case 5:
                hc0 hc0Var = (hc0) this.f32259b;
                hc0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    hc0Var.f28917c0.a(true);
                }
                return true;
            default:
                return cz0.x((cz0) this.f32259b, motionEvent);
        }
    }
}
