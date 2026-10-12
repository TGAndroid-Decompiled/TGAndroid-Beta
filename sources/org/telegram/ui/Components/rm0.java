package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class rm0 implements s4.s0 {
    public final int f30187a = 0;
    public final Object f30188b;

    public rm0(s4.z zVar) {
        this.f30188b = zVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f30187a) {
            case 0:
                return;
            default:
                s4.z zVar = (s4.z) this.f30188b;
                p4.t0 t0Var = zVar.I;
                ((GestureDetector) zVar.N.f16326a).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = zVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (zVar.f48063w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(zVar.f48063w);
                    if (findPointerIndex >= 0) {
                        zVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.d1 d1Var = zVar.f48057c;
                    if (d1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == zVar.f48063w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            zVar.f48063w = motionEvent.getPointerId(i10);
                                            zVar.s(zVar.E, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = zVar.J;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                zVar.s(zVar.E, findPointerIndex, motionEvent);
                                zVar.n(d1Var);
                                zVar.H.removeCallbacks(t0Var);
                                t0Var.run();
                                zVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        zVar.p(null, 0);
                        zVar.f48063w = -1;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10;
        View E;
        nm0 nm0Var;
        int findPointerIndex;
        switch (this.f30187a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                wm0 wm0Var = (wm0) this.f30188b;
                Rect rect = wm0Var.E1;
                if (wm0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && wm0Var.L1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    wm0Var.X0 = false;
                    s4.n0 itemAnimator = wm0Var.getItemAnimator();
                    if ((wm0Var.f32457i1 || itemAnimator == null || !itemAnimator.k()) && wm0Var.E0(y3) && (E = wm0Var.E(x10, y3)) != null && wm0Var.F0(E)) {
                        wm0Var.L1 = E;
                    }
                    if (wm0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - wm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - wm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) wm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    wm0Var.L1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    wm0Var.M1 = -1;
                    View view = wm0Var.L1;
                    if (view != null) {
                        if (wm0Var.f32451f1) {
                            wm0Var.M1 = RecyclerView.S(view);
                        } else {
                            wm0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - wm0Var.L1.getLeft(), motionEvent.getY() - wm0Var.L1.getTop(), 0);
                        if (wm0Var.L1.onTouchEvent(obtain)) {
                            wm0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (wm0Var.L1 != null && !wm0Var.N1) {
                    try {
                        wm0Var.K1.y0(motionEvent);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && wm0Var.L1 != null) {
                        om0 om0Var = wm0Var.f32445c1;
                        if (om0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(om0Var);
                            wm0Var.f32445c1 = null;
                        }
                        View view2 = wm0Var.L1;
                        wm0Var.h1(view2, 0.0f, 0.0f, false);
                        wm0Var.L1 = null;
                        wm0Var.N1 = false;
                        wm0Var.k1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (nm0Var = wm0Var.W0) != null && wm0Var.X0) {
                            nm0Var.h();
                            wm0Var.X0 = false;
                        }
                    }
                } else if (!wm0Var.N1 && wm0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    om0 om0Var2 = new om0(this, x12, y11, 0);
                    wm0Var.f32445c1 = om0Var2;
                    AndroidUtilities.runOnUIThread(om0Var2, ViewConfiguration.getTapTimeout());
                    if (wm0Var.L1.isEnabled()) {
                        View view3 = wm0Var.L1;
                        if (wm0Var.H0(view3, x12 - view3.getX(), y11 - wm0Var.L1.getY())) {
                            wm0Var.i1(wm0Var.M1, wm0Var.L1);
                            org.telegram.ui.Cells.z zVar = wm0Var.B1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (wm0Var.V0 == null && wm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                wm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            wm0Var.w1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.z zVar2 = (s4.z) this.f30188b;
                ((GestureDetector) zVar2.N.f16326a).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    zVar2.f48063w = motionEvent.getPointerId(0);
                    zVar2.d = motionEvent.getX();
                    zVar2.f48058e = motionEvent.getY();
                    VelocityTracker velocityTracker = zVar2.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    zVar2.J = VelocityTracker.obtain();
                    if (zVar2.f48057c == null) {
                        ArrayList arrayList = zVar2.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = zVar2.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.f48027e.f47897a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.d1 d1Var = uVar.f48027e;
                            zVar2.d -= uVar.f48030r;
                            zVar2.f48058e -= uVar.f48031s;
                            zVar2.j(d1Var, true);
                            if (zVar2.f48055a.remove(d1Var.f47897a)) {
                                zVar2.f48064x.a(zVar2.H, d1Var);
                            }
                            zVar2.p(d1Var, uVar.f48028f);
                            zVar2.s(zVar2.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = zVar2.f48063w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        zVar2.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    zVar2.f48063w = -1;
                    zVar2.p(null, 0);
                }
                VelocityTracker velocityTracker2 = zVar2.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (zVar2.f48057c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f30187a) {
            case 0:
                ((wm0) this.f30188b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.z) this.f30188b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public rm0(wm0 wm0Var, Context context) {
        this.f30188b = wm0Var;
        l2.g gVar = new l2.g(context, new qm0(this));
        wm0Var.K1 = gVar;
        ((e30) gVar.f15081b).f25581t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
