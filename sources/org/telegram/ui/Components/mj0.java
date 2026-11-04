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
public final class mj0 implements u4.s0 {
    public final int f36171a = 0;
    public final Object f36172b;

    public mj0(u4.y yVar) {
        this.f36172b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f36171a) {
            case 0:
                return;
            default:
                u4.y yVar = (u4.y) this.f36172b;
                lt ltVar = yVar.J;
                ((GestureDetector) yVar.O.f40562a).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f55686x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f55686x);
                    if (findPointerIndex >= 0) {
                        yVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    u4.d1 d1Var = yVar.f55679c;
                    if (d1Var != null) {
                        int i3 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f55686x) {
                                            if (actionIndex == 0) {
                                                i3 = 1;
                                            }
                                            yVar.f55686x = motionEvent.getPointerId(i3);
                                            yVar.u(yVar.F, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = yVar.K;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                yVar.u(yVar.F, findPointerIndex, motionEvent);
                                yVar.p(d1Var);
                                yVar.I.removeCallbacks(ltVar);
                                ltVar.run();
                                yVar.I.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        yVar.r(null, 0);
                        yVar.f55686x = -1;
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
        ij0 ij0Var;
        int findPointerIndex;
        switch (this.f36171a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                tj0 tj0Var = (tj0) this.f36172b;
                Rect rect = tj0Var.F1;
                if (tj0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && tj0Var.M1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y9 = motionEvent.getY();
                    tj0Var.Y0 = false;
                    u4.m0 itemAnimator = tj0Var.getItemAnimator();
                    if ((tj0Var.f38451j1 || itemAnimator == null || !itemAnimator.k()) && tj0Var.E0(y9) && (E = tj0Var.E(x10, y9)) != null && tj0Var.F0(E)) {
                        tj0Var.M1 = E;
                    }
                    if (tj0Var.M1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - tj0Var.M1.getLeft();
                        float y10 = motionEvent.getY() - tj0Var.M1.getTop();
                        ViewGroup viewGroup = (ViewGroup) tj0Var.M1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    tj0Var.M1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    tj0Var.N1 = -1;
                    View view = tj0Var.M1;
                    if (view != null) {
                        if (tj0Var.f38445g1) {
                            tj0Var.N1 = RecyclerView.S(view);
                        } else {
                            tj0Var.N1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - tj0Var.M1.getLeft(), motionEvent.getY() - tj0Var.M1.getTop(), 0);
                        if (tj0Var.M1.onTouchEvent(obtain)) {
                            tj0Var.O1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (tj0Var.M1 != null && !tj0Var.O1) {
                    try {
                        tj0Var.L1.y(motionEvent);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && tj0Var.M1 != null) {
                        jj0 jj0Var = tj0Var.f38439d1;
                        if (jj0Var != null) {
                            org.telegram.messenger.g0.r(jj0Var);
                            tj0Var.f38439d1 = null;
                        }
                        View view2 = tj0Var.M1;
                        tj0Var.j1(view2, 0.0f, 0.0f, false);
                        tj0Var.M1 = null;
                        tj0Var.O1 = false;
                        tj0Var.m1(view2, motionEvent);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (ij0Var = tj0Var.X0) != null && tj0Var.Y0) {
                            ij0Var.h();
                            tj0Var.Y0 = false;
                        }
                    }
                } else if (!tj0Var.O1 && tj0Var.M1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    jj0 jj0Var2 = new jj0(this, x12, y11, 0);
                    tj0Var.f38439d1 = jj0Var2;
                    org.telegram.messenger.g0.i3(jj0Var2, ViewConfiguration.getTapTimeout());
                    if (tj0Var.M1.isEnabled()) {
                        View view3 = tj0Var.M1;
                        if (tj0Var.H0(view3, x12 - view3.getX(), y11 - tj0Var.M1.getY())) {
                            tj0Var.k1(tj0Var.N1, tj0Var.M1);
                            org.telegram.ui.Cells.y yVar = tj0Var.C1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (tj0Var.W0 == null && tj0Var.V0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                tj0Var.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            tj0Var.y1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                u4.y yVar2 = (u4.y) this.f36172b;
                ((GestureDetector) yVar2.O.f40562a).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                u4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar2.f55686x = motionEvent.getPointerId(0);
                    yVar2.d = motionEvent.getX();
                    yVar2.f55680e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar2.K;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar2.K = VelocityTracker.obtain();
                    if (yVar2.f55679c == null) {
                        ArrayList arrayList = yVar2.G;
                        if (!arrayList.isEmpty()) {
                            View m10 = yVar2.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    u4.u uVar2 = (u4.u) arrayList.get(size);
                                    if (uVar2.f55658e.f55540a == m10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            u4.d1 d1Var = uVar.f55658e;
                            yVar2.d -= uVar.f55661r;
                            yVar2.f55680e -= uVar.f55662s;
                            yVar2.l(d1Var, true);
                            if (yVar2.f55677a.remove(d1Var.f55540a)) {
                                yVar2.f55687y.a(yVar2.I, d1Var);
                            }
                            yVar2.r(d1Var, uVar.f55659f);
                            yVar2.u(yVar2.F, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i3 = yVar2.f55686x;
                    if (i3 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i3)) >= 0) {
                        yVar2.j(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar2.f55686x = -1;
                    yVar2.r(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar2.K;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar2.f55679c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f36171a) {
            case 0:
                ((tj0) this.f36172b).I0(true);
                return;
            default:
                if (z10) {
                    ((u4.y) this.f36172b).r(null, 0);
                    return;
                }
                return;
        }
    }

    public mj0(Context context, tj0 tj0Var) {
        this.f36172b = tj0Var;
        y00 y00Var = new y00(context, (x00) new lj0(this));
        tj0Var.L1 = y00Var;
        ((w00) y00Var.f40562a).f39850t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
