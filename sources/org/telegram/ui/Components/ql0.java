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
public final class ql0 implements s4.r0 {
    public final int f26445a = 0;
    public final Object f26446b;

    public ql0(s4.y yVar) {
        this.f26446b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f26445a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f26446b;
                org.telegram.ui.Cells.l9 l9Var = yVar.I;
                ((GestureDetector) yVar.N.f12721b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f41757w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f41757w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.c1 c1Var = yVar.f41752c;
                    if (c1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f41757w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f41757w = motionEvent.getPointerId(i10);
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
                                yVar.n(c1Var);
                                yVar.H.removeCallbacks(l9Var);
                                l9Var.run();
                                yVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        yVar.p(null, 0);
                        yVar.f41757w = -1;
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
        ml0 ml0Var;
        int findPointerIndex;
        switch (this.f26445a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                vl0 vl0Var = (vl0) this.f26446b;
                Rect rect = vl0Var.G1;
                if (vl0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && vl0Var.N1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    vl0Var.Z0 = false;
                    s4.m0 itemAnimator = vl0Var.getItemAnimator();
                    if ((vl0Var.f27977k1 || itemAnimator == null || !itemAnimator.k()) && vl0Var.E0(y3) && (E = vl0Var.E(x10, y3)) != null && vl0Var.F0(E)) {
                        vl0Var.N1 = E;
                    }
                    if (vl0Var.N1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - vl0Var.N1.getLeft();
                        float y10 = motionEvent.getY() - vl0Var.N1.getTop();
                        ViewGroup viewGroup = (ViewGroup) vl0Var.N1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    vl0Var.N1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    vl0Var.O1 = -1;
                    View view = vl0Var.N1;
                    if (view != null) {
                        if (vl0Var.f27971h1) {
                            vl0Var.O1 = RecyclerView.S(view);
                        } else {
                            vl0Var.O1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - vl0Var.N1.getLeft(), motionEvent.getY() - vl0Var.N1.getTop(), 0);
                        if (vl0Var.N1.onTouchEvent(obtain)) {
                            vl0Var.P1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (vl0Var.N1 != null && !vl0Var.P1) {
                    try {
                        vl0Var.M1.B(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && vl0Var.N1 != null) {
                        nl0 nl0Var = vl0Var.f27965e1;
                        if (nl0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(nl0Var);
                            vl0Var.f27965e1 = null;
                        }
                        View view2 = vl0Var.N1;
                        vl0Var.g1(view2, 0.0f, 0.0f, false);
                        vl0Var.N1 = null;
                        vl0Var.P1 = false;
                        vl0Var.j1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (ml0Var = vl0Var.Y0) != null && vl0Var.Z0) {
                            ml0Var.h();
                            vl0Var.Z0 = false;
                        }
                    }
                } else if (!vl0Var.P1 && vl0Var.N1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    nl0 nl0Var2 = new nl0(this, x12, y11, 0);
                    vl0Var.f27965e1 = nl0Var2;
                    AndroidUtilities.runOnUIThread(nl0Var2, ViewConfiguration.getTapTimeout());
                    if (vl0Var.N1.isEnabled()) {
                        View view3 = vl0Var.N1;
                        if (vl0Var.H0(view3, x12 - view3.getX(), y11 - vl0Var.N1.getY())) {
                            vl0Var.h1(vl0Var.O1, vl0Var.N1);
                            org.telegram.ui.Cells.z zVar = vl0Var.D1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (vl0Var.X0 == null && vl0Var.W0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                vl0Var.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            vl0Var.u1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.f26446b;
                ((GestureDetector) yVar.N.f12721b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f41757w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f41752c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f41610a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.c1 c1Var = uVar.e;
                            yVar.d -= uVar.f41732r;
                            yVar.e -= uVar.f41733s;
                            yVar.j(c1Var, true);
                            if (yVar.f41750a.remove(c1Var.f41610a)) {
                                yVar.f41758x.a(yVar.H, c1Var);
                            }
                            yVar.p(c1Var, uVar.f41730f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f41757w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f41757w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f41752c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f26445a) {
            case 0:
                ((vl0) this.f26446b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f26446b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public ql0(vl0 vl0Var, Context context) {
        this.f26446b = vl0Var;
        l2.g gVar = new l2.g(context, new pl0(this));
        vl0Var.M1 = gVar;
        ((t20) gVar.f12719b).f27296t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
