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
    public final int f32262a;
    public final Object f32263b;

    public rk(Object obj, int i10) {
        this.f32262a = i10;
        this.f32263b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f7;
        i2.j0 j0Var;
        float f10;
        g80 g80Var;
        switch (this.f32262a) {
            case 0:
                al alVar = (al) this.f32263b;
                alVar.getClass();
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    alVar.c0();
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.o1 o1Var = ((js) this.f32263b).f29757a;
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
                o60 o60Var = (o60) this.f32263b;
                boolean z10 = false;
                if (o60Var.O == null || o60Var.Q == null) {
                    return false;
                }
                float f11 = 0.0f;
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = o60Var.f31172a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    o60Var.B0 = false;
                    o60Var.f31203z0 = motionEvent.getPointerId(0);
                    o60Var.A0 = -1;
                    int i10 = o60Var.Q.f50625a;
                    if (i10 == 5) {
                        ImageView imageView = o60Var.H;
                        vi.u0 u0Var = o60Var.O;
                        if (u0Var != null && i10 == 5) {
                            boolean z11 = o60Var.f31181i0;
                            o60Var.f31181i0 = !z11;
                            vi.u0.u();
                            if (u0Var.Z == 5 && (j0Var = u0Var.V) != null) {
                                if (!z11) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = 1.0f;
                                }
                                j0Var.U(f10);
                            }
                            VideoEditedInfo videoEditedInfo = o60Var.T;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.muted = o60Var.f31181i0;
                            }
                            imageView.animate().cancel();
                            ViewPropertyAnimator animate = imageView.animate();
                            if (o60Var.f31181i0) {
                                f11 = 1.0f;
                            }
                            org.telegram.messenger.wh.p(animate, f11, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        vi.t0 t0Var = o60Var.Q;
                        if (t0Var.f50625a == 3 && !t0Var.f50628f) {
                            o60Var.f31203z0 = motionEvent.getPointerId(0);
                            o60Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            o60Var.f31200x0 = hypot;
                            if (hypot > 0.0f) {
                                z10 = true;
                            }
                            o60Var.B0 = z10;
                            o60Var.f31202y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && o60Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(o60Var.f31203z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(o60Var.A0);
                        if (findPointerIndex >= 0 && findPointerIndex2 >= 0) {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / o60Var.f31200x0;
                            vi.m0 m0Var = o60Var.R;
                            if (m0Var == null) {
                                f7 = 1.0f;
                            } else {
                                f7 = m0Var.f50553c;
                            }
                            float max = (Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f;
                            if (f7 > 1.0f) {
                                f11 = Math.max(0.0f, Math.min(1.0f, (max - 1.0f) / (f7 - 1.0f)));
                            }
                            o60Var.f31202y0 = f11;
                            o60Var.O.x(f11);
                        } else {
                            o60Var.u();
                        }
                    } else if (motionEvent.getActionMasked() == 6 && o60Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == o60Var.f31203z0 || pointerId == o60Var.A0) {
                            o60Var.u();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && o60Var.B0) {
                        o60Var.u();
                    }
                }
                return true;
            case 3:
                l80 l80Var = (l80) ((WeakReference) this.f32263b).get();
                if (l80Var != null && (g80Var = l80Var.f30158m) != null && g80Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        l80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        l80Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = l80Var.f30164p0;
                        if (view2 != null) {
                            l80Var.f30164p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        l80Var.f30162o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = l80Var.f30164p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            l80Var.f30164p0 = null;
                        }
                        view.setOnTouchListener(null);
                        l80Var.f30162o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 4:
                hb0 hb0Var = (hb0) this.f32263b;
                hb0Var.getClass();
                return org.telegram.ui.ht.o().q(motionEvent, hb0Var.getListView(), hb0Var.f28947w, null, hb0Var.f28940a);
            case 5:
                ic0 ic0Var = (ic0) this.f32263b;
                ic0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ic0Var.f29306c0.a(true);
                }
                return true;
            default:
                return dz0.x((dz0) this.f32263b, motionEvent);
        }
    }
}
