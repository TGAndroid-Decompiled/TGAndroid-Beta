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
public final class hl0 implements s4.r0 {
    public final int f24692a = 0;
    public final Object f24693b;

    public hl0(s4.y yVar) {
        this.f24693b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f24692a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f24693b;
                qg.b0 b0Var = yVar.I;
                ((GestureDetector) yVar.N.f13385b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f42844w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f42844w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.c1 c1Var = yVar.f42839c;
                    if (c1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f42844w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f42844w = motionEvent.getPointerId(i10);
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
                                yVar.H.removeCallbacks(b0Var);
                                b0Var.run();
                                yVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        yVar.p(null, 0);
                        yVar.f42844w = -1;
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
        dl0 dl0Var;
        int findPointerIndex;
        switch (this.f24692a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ml0 ml0Var = (ml0) this.f24693b;
                Rect rect = ml0Var.G1;
                if (ml0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && ml0Var.N1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ml0Var.Z0 = false;
                    s4.m0 itemAnimator = ml0Var.getItemAnimator();
                    if ((ml0Var.f26181k1 || itemAnimator == null || !itemAnimator.k()) && ml0Var.F0(y3) && (F = ml0Var.F(x10, y3)) != null && ml0Var.G0(F)) {
                        ml0Var.N1 = F;
                    }
                    if (ml0Var.N1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - ml0Var.N1.getLeft();
                        float y10 = motionEvent.getY() - ml0Var.N1.getTop();
                        ViewGroup viewGroup = (ViewGroup) ml0Var.N1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    ml0Var.N1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    ml0Var.O1 = -1;
                    View view = ml0Var.N1;
                    if (view != null) {
                        if (ml0Var.f26175h1) {
                            ml0Var.O1 = RecyclerView.T(view);
                        } else {
                            ml0Var.O1 = RecyclerView.S(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - ml0Var.N1.getLeft(), motionEvent.getY() - ml0Var.N1.getTop(), 0);
                        if (ml0Var.N1.onTouchEvent(obtain)) {
                            ml0Var.P1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (ml0Var.N1 != null && !ml0Var.P1) {
                    try {
                        ml0Var.M1.y(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && ml0Var.N1 != null) {
                        el0 el0Var = ml0Var.f26169e1;
                        if (el0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(el0Var);
                            ml0Var.f26169e1 = null;
                        }
                        View view2 = ml0Var.N1;
                        ml0Var.i1(view2, 0.0f, 0.0f, false);
                        ml0Var.N1 = null;
                        ml0Var.P1 = false;
                        ml0Var.l1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (dl0Var = ml0Var.Y0) != null && ml0Var.Z0) {
                            dl0Var.g();
                            ml0Var.Z0 = false;
                        }
                    }
                } else if (!ml0Var.P1 && ml0Var.N1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    el0 el0Var2 = new el0(this, x12, y11, 0);
                    ml0Var.f26169e1 = el0Var2;
                    AndroidUtilities.runOnUIThread(el0Var2, ViewConfiguration.getTapTimeout());
                    if (ml0Var.N1.isEnabled()) {
                        View view3 = ml0Var.N1;
                        if (ml0Var.I0(view3, x12 - view3.getX(), y11 - ml0Var.N1.getY())) {
                            ml0Var.j1(ml0Var.O1, ml0Var.N1);
                            org.telegram.ui.Cells.z zVar = ml0Var.D1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (ml0Var.X0 == null && ml0Var.W0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                ml0Var.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            ml0Var.w1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.f24693b;
                ((GestureDetector) yVar.N.f13385b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f42844w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f42839c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f42697a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.c1 c1Var = uVar.e;
                            yVar.d -= uVar.f42819r;
                            yVar.e -= uVar.f42820s;
                            yVar.j(c1Var, true);
                            if (yVar.f42837a.remove(c1Var.f42697a)) {
                                yVar.f42845x.a(yVar.H, c1Var);
                            }
                            yVar.p(c1Var, uVar.f42817f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f42844w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f42844w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f42839c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f24692a) {
            case 0:
                ((ml0) this.f24693b).J0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f24693b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public hl0(ml0 ml0Var, Context context) {
        this.f24693b = ml0Var;
        org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, new gl0(this));
        ml0Var.M1 = iaVar;
        ((k20) iaVar.f20290b).f25548t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
