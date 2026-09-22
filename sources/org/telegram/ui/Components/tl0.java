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
public final class tl0 implements s4.r0 {
    public final int f28495a = 0;
    public final Object f28496b;

    public tl0(s4.y yVar) {
        this.f28496b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f28495a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f28496b;
                pg.c1 c1Var = yVar.I;
                ((GestureDetector) yVar.N.f13912b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f43142w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f43142w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.c1 c1Var2 = yVar.f43137c;
                    if (c1Var2 != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f43142w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f43142w = motionEvent.getPointerId(i10);
                                            yVar.s(yVar.E, actionIndex, motionEvent);
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
                                yVar.s(yVar.E, findPointerIndex, motionEvent);
                                yVar.n(c1Var2);
                                yVar.H.removeCallbacks(c1Var);
                                c1Var.run();
                                yVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        yVar.p(null, 0);
                        yVar.f43142w = -1;
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
        View F;
        pl0 pl0Var;
        int findPointerIndex;
        switch (this.f28495a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                yl0 yl0Var = (yl0) this.f28496b;
                Rect rect = yl0Var.G1;
                if (yl0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && yl0Var.N1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    yl0Var.Z0 = false;
                    s4.m0 itemAnimator = yl0Var.getItemAnimator();
                    if ((yl0Var.f30694k1 || itemAnimator == null || !itemAnimator.k()) && yl0Var.F0(y3) && (F = yl0Var.F(x10, y3)) != null && yl0Var.G0(F)) {
                        yl0Var.N1 = F;
                    }
                    if (yl0Var.N1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - yl0Var.N1.getLeft();
                        float y10 = motionEvent.getY() - yl0Var.N1.getTop();
                        ViewGroup viewGroup = (ViewGroup) yl0Var.N1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    yl0Var.N1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    yl0Var.O1 = -1;
                    View view = yl0Var.N1;
                    if (view != null) {
                        if (yl0Var.f30688h1) {
                            yl0Var.O1 = RecyclerView.T(view);
                        } else {
                            yl0Var.O1 = RecyclerView.S(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - yl0Var.N1.getLeft(), motionEvent.getY() - yl0Var.N1.getTop(), 0);
                        if (yl0Var.N1.onTouchEvent(obtain)) {
                            yl0Var.P1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (yl0Var.N1 != null && !yl0Var.P1) {
                    try {
                        yl0Var.M1.J(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && yl0Var.N1 != null) {
                        ql0 ql0Var = yl0Var.f30682e1;
                        if (ql0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(ql0Var);
                            yl0Var.f30682e1 = null;
                        }
                        View view2 = yl0Var.N1;
                        yl0Var.i1(view2, 0.0f, 0.0f, false);
                        yl0Var.N1 = null;
                        yl0Var.P1 = false;
                        yl0Var.l1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (pl0Var = yl0Var.Y0) != null && yl0Var.Z0) {
                            pl0Var.g();
                            yl0Var.Z0 = false;
                        }
                    }
                } else if (!yl0Var.P1 && yl0Var.N1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    ql0 ql0Var2 = new ql0(this, x12, y11, 0);
                    yl0Var.f30682e1 = ql0Var2;
                    AndroidUtilities.runOnUIThread(ql0Var2, ViewConfiguration.getTapTimeout());
                    if (yl0Var.N1.isEnabled()) {
                        View view3 = yl0Var.N1;
                        if (yl0Var.I0(view3, x12 - view3.getX(), y11 - yl0Var.N1.getY())) {
                            yl0Var.j1(yl0Var.O1, yl0Var.N1);
                            org.telegram.ui.Cells.z zVar = yl0Var.D1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (yl0Var.X0 == null && yl0Var.W0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                yl0Var.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            yl0Var.w1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.f28496b;
                ((GestureDetector) yVar.N.f13912b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f43142w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f43137c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f42995a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.c1 c1Var = uVar.e;
                            yVar.d -= uVar.f43117r;
                            yVar.e -= uVar.f43118s;
                            yVar.j(c1Var, true);
                            if (yVar.f43135a.remove(c1Var.f42995a)) {
                                yVar.f43143x.a(yVar.H, c1Var);
                            }
                            yVar.p(c1Var, uVar.f43115f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f43142w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f43142w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f43137c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f28495a) {
            case 0:
                ((yl0) this.f28496b).J0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f28496b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public tl0(yl0 yl0Var, Context context) {
        this.f28496b = yl0Var;
        k2.e eVar = new k2.e(context, new sl0(this));
        yl0Var.M1 = eVar;
        ((k20) eVar.f13244b).f25604t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
