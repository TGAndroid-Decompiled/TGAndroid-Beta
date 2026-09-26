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
public final class sl0 implements s4.r0 {
    public final int f28306a = 0;
    public final Object f28307b;

    public sl0(s4.y yVar) {
        this.f28307b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f28306a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f28307b;
                pg.c1 c1Var = yVar.I;
                ((GestureDetector) yVar.N.f15116b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f43106w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f43106w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.c1 c1Var2 = yVar.f43101c;
                    if (c1Var2 != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f43106w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f43106w = motionEvent.getPointerId(i10);
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
                        yVar.f43106w = -1;
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
        ol0 ol0Var;
        int findPointerIndex;
        switch (this.f28306a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                xl0 xl0Var = (xl0) this.f28307b;
                Rect rect = xl0Var.G1;
                if (xl0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && xl0Var.N1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    xl0Var.Z0 = false;
                    s4.m0 itemAnimator = xl0Var.getItemAnimator();
                    if ((xl0Var.f30389k1 || itemAnimator == null || !itemAnimator.k()) && xl0Var.E0(y3) && (E = xl0Var.E(x10, y3)) != null && xl0Var.F0(E)) {
                        xl0Var.N1 = E;
                    }
                    if (xl0Var.N1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - xl0Var.N1.getLeft();
                        float y10 = motionEvent.getY() - xl0Var.N1.getTop();
                        ViewGroup viewGroup = (ViewGroup) xl0Var.N1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    xl0Var.N1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    xl0Var.O1 = -1;
                    View view = xl0Var.N1;
                    if (view != null) {
                        if (xl0Var.f30383h1) {
                            xl0Var.O1 = RecyclerView.S(view);
                        } else {
                            xl0Var.O1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - xl0Var.N1.getLeft(), motionEvent.getY() - xl0Var.N1.getTop(), 0);
                        if (xl0Var.N1.onTouchEvent(obtain)) {
                            xl0Var.P1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (xl0Var.N1 != null && !xl0Var.P1) {
                    try {
                        xl0Var.M1.g0(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && xl0Var.N1 != null) {
                        pl0 pl0Var = xl0Var.f30377e1;
                        if (pl0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(pl0Var);
                            xl0Var.f30377e1 = null;
                        }
                        View view2 = xl0Var.N1;
                        xl0Var.h1(view2, 0.0f, 0.0f, false);
                        xl0Var.N1 = null;
                        xl0Var.P1 = false;
                        xl0Var.k1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (ol0Var = xl0Var.Y0) != null && xl0Var.Z0) {
                            ol0Var.g();
                            xl0Var.Z0 = false;
                        }
                    }
                } else if (!xl0Var.P1 && xl0Var.N1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    pl0 pl0Var2 = new pl0(this, x12, y11, 0);
                    xl0Var.f30377e1 = pl0Var2;
                    AndroidUtilities.runOnUIThread(pl0Var2, ViewConfiguration.getTapTimeout());
                    if (xl0Var.N1.isEnabled()) {
                        View view3 = xl0Var.N1;
                        if (xl0Var.H0(view3, x12 - view3.getX(), y11 - xl0Var.N1.getY())) {
                            xl0Var.i1(xl0Var.O1, xl0Var.N1);
                            org.telegram.ui.Cells.z zVar = xl0Var.D1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (xl0Var.X0 == null && xl0Var.W0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                xl0Var.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            xl0Var.v1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.f28307b;
                ((GestureDetector) yVar.N.f15116b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f43106w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f43101c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f42959a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.c1 c1Var = uVar.e;
                            yVar.d -= uVar.f43081r;
                            yVar.e -= uVar.f43082s;
                            yVar.j(c1Var, true);
                            if (yVar.f43099a.remove(c1Var.f42959a)) {
                                yVar.f43107x.a(yVar.H, c1Var);
                            }
                            yVar.p(c1Var, uVar.f43079f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f43106w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f43106w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f43101c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f28306a) {
            case 0:
                ((xl0) this.f28307b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f28307b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public sl0(xl0 xl0Var, Context context) {
        this.f28307b = xl0Var;
        ka.c cVar = new ka.c(context, new rl0(this));
        xl0Var.M1 = cVar;
        ((m20) cVar.f13552b).f26302t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
