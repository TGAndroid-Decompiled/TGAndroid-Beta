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
public final class ul0 implements s4.r0 {
    public final int f28890a = 0;
    public final Object f28891b;

    public ul0(s4.y yVar) {
        this.f28891b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f28890a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f28891b;
                pg.c1 c1Var = yVar.I;
                ((GestureDetector) yVar.N.f15132b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f43215w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f43215w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.c1 c1Var2 = yVar.f43210c;
                    if (c1Var2 != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f43215w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f43215w = motionEvent.getPointerId(i10);
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
                        yVar.f43215w = -1;
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
        ql0 ql0Var;
        int findPointerIndex;
        switch (this.f28890a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                zl0 zl0Var = (zl0) this.f28891b;
                Rect rect = zl0Var.G1;
                if (zl0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && zl0Var.N1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    zl0Var.Z0 = false;
                    s4.m0 itemAnimator = zl0Var.getItemAnimator();
                    if ((zl0Var.f31005k1 || itemAnimator == null || !itemAnimator.k()) && zl0Var.F0(y3) && (E = zl0Var.E(x10, y3)) != null && zl0Var.G0(E)) {
                        zl0Var.N1 = E;
                    }
                    if (zl0Var.N1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - zl0Var.N1.getLeft();
                        float y10 = motionEvent.getY() - zl0Var.N1.getTop();
                        ViewGroup viewGroup = (ViewGroup) zl0Var.N1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    zl0Var.N1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    zl0Var.O1 = -1;
                    View view = zl0Var.N1;
                    if (view != null) {
                        if (zl0Var.f30999h1) {
                            zl0Var.O1 = RecyclerView.S(view);
                        } else {
                            zl0Var.O1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - zl0Var.N1.getLeft(), motionEvent.getY() - zl0Var.N1.getTop(), 0);
                        if (zl0Var.N1.onTouchEvent(obtain)) {
                            zl0Var.P1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (zl0Var.N1 != null && !zl0Var.P1) {
                    try {
                        zl0Var.M1.g0(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && zl0Var.N1 != null) {
                        rl0 rl0Var = zl0Var.f30993e1;
                        if (rl0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(rl0Var);
                            zl0Var.f30993e1 = null;
                        }
                        View view2 = zl0Var.N1;
                        zl0Var.k1(view2, 0.0f, 0.0f, false);
                        zl0Var.N1 = null;
                        zl0Var.P1 = false;
                        zl0Var.n1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (ql0Var = zl0Var.Y0) != null && zl0Var.Z0) {
                            ql0Var.g();
                            zl0Var.Z0 = false;
                        }
                    }
                } else if (!zl0Var.P1 && zl0Var.N1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    rl0 rl0Var2 = new rl0(this, x12, y11, 0);
                    zl0Var.f30993e1 = rl0Var2;
                    AndroidUtilities.runOnUIThread(rl0Var2, ViewConfiguration.getTapTimeout());
                    if (zl0Var.N1.isEnabled()) {
                        View view3 = zl0Var.N1;
                        if (zl0Var.I0(view3, x12 - view3.getX(), y11 - zl0Var.N1.getY())) {
                            zl0Var.l1(zl0Var.O1, zl0Var.N1);
                            org.telegram.ui.Cells.z zVar = zl0Var.D1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (zl0Var.X0 == null && zl0Var.W0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                zl0Var.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            zl0Var.x1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.f28891b;
                ((GestureDetector) yVar.N.f15132b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f43215w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f43210c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f43068a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.c1 c1Var = uVar.e;
                            yVar.d -= uVar.f43190r;
                            yVar.e -= uVar.f43191s;
                            yVar.j(c1Var, true);
                            if (yVar.f43208a.remove(c1Var.f43068a)) {
                                yVar.f43216x.a(yVar.H, c1Var);
                            }
                            yVar.p(c1Var, uVar.f43188f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f43215w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f43215w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f43210c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f28890a) {
            case 0:
                ((zl0) this.f28891b).J0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f28891b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public ul0(zl0 zl0Var, Context context) {
        this.f28891b = zl0Var;
        ka.c cVar = new ka.c(context, new tl0(this));
        zl0Var.M1 = cVar;
        ((o20) cVar.f13567b).f26962t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
