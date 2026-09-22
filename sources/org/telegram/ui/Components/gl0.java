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
public final class gl0 implements s4.r0 {
    public final int f24416a = 0;
    public final Object f24417b;

    public gl0(s4.y yVar) {
        this.f24417b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f24416a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f24417b;
                qg.b0 b0Var = yVar.I;
                ((GestureDetector) yVar.N.f13384b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f42818w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f42818w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.c1 c1Var = yVar.f42813c;
                    if (c1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f42818w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f42818w = motionEvent.getPointerId(i10);
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
                        yVar.f42818w = -1;
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
        cl0 cl0Var;
        int findPointerIndex;
        switch (this.f24416a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ll0 ll0Var = (ll0) this.f24417b;
                Rect rect = ll0Var.G1;
                if (ll0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && ll0Var.N1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ll0Var.Z0 = false;
                    s4.m0 itemAnimator = ll0Var.getItemAnimator();
                    if ((ll0Var.f25959k1 || itemAnimator == null || !itemAnimator.k()) && ll0Var.E0(y3) && (E = ll0Var.E(x10, y3)) != null && ll0Var.F0(E)) {
                        ll0Var.N1 = E;
                    }
                    if (ll0Var.N1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - ll0Var.N1.getLeft();
                        float y10 = motionEvent.getY() - ll0Var.N1.getTop();
                        ViewGroup viewGroup = (ViewGroup) ll0Var.N1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    ll0Var.N1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    ll0Var.O1 = -1;
                    View view = ll0Var.N1;
                    if (view != null) {
                        if (ll0Var.f25953h1) {
                            ll0Var.O1 = RecyclerView.S(view);
                        } else {
                            ll0Var.O1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - ll0Var.N1.getLeft(), motionEvent.getY() - ll0Var.N1.getTop(), 0);
                        if (ll0Var.N1.onTouchEvent(obtain)) {
                            ll0Var.P1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (ll0Var.N1 != null && !ll0Var.P1) {
                    try {
                        ll0Var.M1.y(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && ll0Var.N1 != null) {
                        dl0 dl0Var = ll0Var.f25947e1;
                        if (dl0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(dl0Var);
                            ll0Var.f25947e1 = null;
                        }
                        View view2 = ll0Var.N1;
                        ll0Var.h1(view2, 0.0f, 0.0f, false);
                        ll0Var.N1 = null;
                        ll0Var.P1 = false;
                        ll0Var.k1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (cl0Var = ll0Var.Y0) != null && ll0Var.Z0) {
                            cl0Var.g();
                            ll0Var.Z0 = false;
                        }
                    }
                } else if (!ll0Var.P1 && ll0Var.N1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    dl0 dl0Var2 = new dl0(this, x12, y11, 0);
                    ll0Var.f25947e1 = dl0Var2;
                    AndroidUtilities.runOnUIThread(dl0Var2, ViewConfiguration.getTapTimeout());
                    if (ll0Var.N1.isEnabled()) {
                        View view3 = ll0Var.N1;
                        if (ll0Var.H0(view3, x12 - view3.getX(), y11 - ll0Var.N1.getY())) {
                            ll0Var.i1(ll0Var.O1, ll0Var.N1);
                            org.telegram.ui.Cells.z zVar = ll0Var.D1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (ll0Var.X0 == null && ll0Var.W0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                ll0Var.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            ll0Var.v1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.f24417b;
                ((GestureDetector) yVar.N.f13384b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f42818w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f42813c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f42671a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.c1 c1Var = uVar.e;
                            yVar.d -= uVar.f42793r;
                            yVar.e -= uVar.f42794s;
                            yVar.j(c1Var, true);
                            if (yVar.f42811a.remove(c1Var.f42671a)) {
                                yVar.f42819x.a(yVar.H, c1Var);
                            }
                            yVar.p(c1Var, uVar.f42791f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f42818w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f42818w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f42813c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f24416a) {
            case 0:
                ((ll0) this.f24417b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f24417b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public gl0(ll0 ll0Var, Context context) {
        this.f24417b = ll0Var;
        org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, new fl0(this));
        ll0Var.M1 = iaVar;
        ((k20) iaVar.f20260b).f25526t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
