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
public final class rl0 implements s4.r0 {
    public final int f27927a = 0;
    public final Object f27928b;

    public rl0(s4.y yVar) {
        this.f27928b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f27927a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f27928b;
                p8.b bVar = yVar.I;
                ((GestureDetector) yVar.N.f15073b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f43076w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f43076w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.c1 c1Var = yVar.f43071c;
                    if (c1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f43076w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f43076w = motionEvent.getPointerId(i10);
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
                                yVar.H.removeCallbacks(bVar);
                                bVar.run();
                                yVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        yVar.p(null, 0);
                        yVar.f43076w = -1;
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
        nl0 nl0Var;
        int findPointerIndex;
        switch (this.f27927a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                wl0 wl0Var = (wl0) this.f27928b;
                Rect rect = wl0Var.G1;
                if (wl0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && wl0Var.N1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    wl0Var.Z0 = false;
                    s4.m0 itemAnimator = wl0Var.getItemAnimator();
                    if ((wl0Var.f30080k1 || itemAnimator == null || !itemAnimator.k()) && wl0Var.F0(y3) && (F = wl0Var.F(x10, y3)) != null && wl0Var.G0(F)) {
                        wl0Var.N1 = F;
                    }
                    if (wl0Var.N1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - wl0Var.N1.getLeft();
                        float y10 = motionEvent.getY() - wl0Var.N1.getTop();
                        ViewGroup viewGroup = (ViewGroup) wl0Var.N1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    wl0Var.N1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    wl0Var.O1 = -1;
                    View view = wl0Var.N1;
                    if (view != null) {
                        if (wl0Var.f30074h1) {
                            wl0Var.O1 = RecyclerView.T(view);
                        } else {
                            wl0Var.O1 = RecyclerView.S(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - wl0Var.N1.getLeft(), motionEvent.getY() - wl0Var.N1.getTop(), 0);
                        if (wl0Var.N1.onTouchEvent(obtain)) {
                            wl0Var.P1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (wl0Var.N1 != null && !wl0Var.P1) {
                    try {
                        wl0Var.M1.g0(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && wl0Var.N1 != null) {
                        ol0 ol0Var = wl0Var.f30068e1;
                        if (ol0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(ol0Var);
                            wl0Var.f30068e1 = null;
                        }
                        View view2 = wl0Var.N1;
                        wl0Var.i1(view2, 0.0f, 0.0f, false);
                        wl0Var.N1 = null;
                        wl0Var.P1 = false;
                        wl0Var.l1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (nl0Var = wl0Var.Y0) != null && wl0Var.Z0) {
                            nl0Var.g();
                            wl0Var.Z0 = false;
                        }
                    }
                } else if (!wl0Var.P1 && wl0Var.N1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    ol0 ol0Var2 = new ol0(this, x12, y11, 0);
                    wl0Var.f30068e1 = ol0Var2;
                    AndroidUtilities.runOnUIThread(ol0Var2, ViewConfiguration.getTapTimeout());
                    if (wl0Var.N1.isEnabled()) {
                        View view3 = wl0Var.N1;
                        if (wl0Var.I0(view3, x12 - view3.getX(), y11 - wl0Var.N1.getY())) {
                            wl0Var.j1(wl0Var.O1, wl0Var.N1);
                            org.telegram.ui.Cells.z zVar = wl0Var.D1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (wl0Var.X0 == null && wl0Var.W0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                wl0Var.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            wl0Var.w1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.f27928b;
                ((GestureDetector) yVar.N.f15073b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f43076w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f43071c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f42929a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.c1 c1Var = uVar.e;
                            yVar.d -= uVar.f43051r;
                            yVar.e -= uVar.f43052s;
                            yVar.j(c1Var, true);
                            if (yVar.f43069a.remove(c1Var.f42929a)) {
                                yVar.f43077x.a(yVar.H, c1Var);
                            }
                            yVar.p(c1Var, uVar.f43049f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f43076w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f43076w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f43071c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f27927a) {
            case 0:
                ((wl0) this.f27928b).J0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f27928b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public rl0(wl0 wl0Var, Context context) {
        this.f27928b = wl0Var;
        ka.c cVar = new ka.c(context, new ql0(this));
        wl0Var.M1 = cVar;
        ((k20) cVar.f13565b).f25559t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
