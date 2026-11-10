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
public final class ij0 implements v4.r0 {
    public final int f34688a = 0;
    public final Object f34689b;

    public ij0(v4.y yVar) {
        this.f34689b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f34688a) {
            case 0:
                return;
            default:
                v4.y yVar = (v4.y) this.f34689b;
                tg.y yVar2 = yVar.I;
                ((GestureDetector) yVar.N.f38776b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f57203x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f57203x);
                    if (findPointerIndex >= 0) {
                        yVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    v4.d1 d1Var = yVar.f57196c;
                    if (d1Var != null) {
                        int i7 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f57203x) {
                                            if (actionIndex == 0) {
                                                i7 = 1;
                                            }
                                            yVar.f57203x = motionEvent.getPointerId(i7);
                                            yVar.u(yVar.E, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = yVar.J;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                yVar.u(yVar.E, findPointerIndex, motionEvent);
                                yVar.p(d1Var);
                                yVar.H.removeCallbacks(yVar2);
                                yVar2.run();
                                yVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        yVar.r(null, 0);
                        yVar.f57203x = -1;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z9;
        View E;
        ej0 ej0Var;
        int findPointerIndex;
        switch (this.f34688a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                pj0 pj0Var = (pj0) this.f34689b;
                Rect rect = pj0Var.E1;
                if (pj0Var.getScrollState() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && pj0Var.L1 == null && z9) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    pj0Var.X0 = false;
                    v4.l0 itemAnimator = pj0Var.getItemAnimator();
                    if ((pj0Var.f36971i1 || itemAnimator == null || !itemAnimator.k()) && pj0Var.E0(y10) && (E = pj0Var.E(x10, y10)) != null && pj0Var.F0(E)) {
                        pj0Var.L1 = E;
                    }
                    if (pj0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - pj0Var.L1.getLeft();
                        float y11 = motionEvent.getY() - pj0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) pj0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y11 >= childAt.getTop() && y11 <= childAt.getBottom() && childAt.isClickable()) {
                                    pj0Var.L1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    pj0Var.M1 = -1;
                    View view = pj0Var.L1;
                    if (view != null) {
                        if (pj0Var.f36965f1) {
                            pj0Var.M1 = RecyclerView.S(view);
                        } else {
                            pj0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - pj0Var.L1.getLeft(), motionEvent.getY() - pj0Var.L1.getTop(), 0);
                        if (pj0Var.L1.onTouchEvent(obtain)) {
                            pj0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (pj0Var.L1 != null && !pj0Var.N1) {
                    try {
                        pj0Var.K1.n0(motionEvent);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z9) && pj0Var.L1 != null) {
                        fj0 fj0Var = pj0Var.f36960c1;
                        if (fj0Var != null) {
                            org.telegram.messenger.g0.r(fj0Var);
                            pj0Var.f36960c1 = null;
                        }
                        View view2 = pj0Var.L1;
                        pj0Var.j1(view2, 0.0f, 0.0f, false);
                        pj0Var.L1 = null;
                        pj0Var.N1 = false;
                        pj0Var.m1(view2, motionEvent);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (ej0Var = pj0Var.W0) != null && pj0Var.X0) {
                            ej0Var.i();
                            pj0Var.X0 = false;
                        }
                    }
                } else if (!pj0Var.N1 && pj0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    fj0 fj0Var2 = new fj0(this, x12, y12, 0);
                    pj0Var.f36960c1 = fj0Var2;
                    org.telegram.messenger.g0.i3(fj0Var2, ViewConfiguration.getTapTimeout());
                    if (pj0Var.L1.isEnabled()) {
                        View view3 = pj0Var.L1;
                        if (pj0Var.H0(view3, x12 - view3.getX(), y12 - pj0Var.L1.getY())) {
                            pj0Var.k1(pj0Var.M1, pj0Var.L1);
                            org.telegram.ui.Cells.y yVar = pj0Var.B1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (pj0Var.V0 == null && pj0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                pj0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            pj0Var.y1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                v4.y yVar2 = (v4.y) this.f34689b;
                ((GestureDetector) yVar2.N.f38776b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                v4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar2.f57203x = motionEvent.getPointerId(0);
                    yVar2.d = motionEvent.getX();
                    yVar2.f57197e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar2.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar2.J = VelocityTracker.obtain();
                    if (yVar2.f57196c == null) {
                        ArrayList arrayList = yVar2.F;
                        if (!arrayList.isEmpty()) {
                            View m10 = yVar2.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    v4.u uVar2 = (v4.u) arrayList.get(size);
                                    if (uVar2.f57172e.f57052a == m10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            v4.d1 d1Var = uVar.f57172e;
                            yVar2.d -= uVar.f57175r;
                            yVar2.f57197e -= uVar.f57176s;
                            yVar2.l(d1Var, true);
                            if (yVar2.f57194a.remove(d1Var.f57052a)) {
                                yVar2.f57204y.a(yVar2.H, d1Var);
                            }
                            yVar2.r(d1Var, uVar.f57173f);
                            yVar2.u(yVar2.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i7 = yVar2.f57203x;
                    if (i7 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i7)) >= 0) {
                        yVar2.j(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar2.f57203x = -1;
                    yVar2.r(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar2.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar2.f57196c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z9) {
        switch (this.f34688a) {
            case 0:
                ((pj0) this.f34689b).I0(true);
                return;
            default:
                if (z9) {
                    ((v4.y) this.f34689b).r(null, 0);
                    return;
                }
                return;
        }
    }

    public ij0(Context context, pj0 pj0Var) {
        this.f34689b = pj0Var;
        qt qtVar = new qt(context, new hj0(this));
        pj0Var.K1 = qtVar;
        ((a10) qtVar.f37395b).f31666t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
