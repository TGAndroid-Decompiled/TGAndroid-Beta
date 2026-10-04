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
    public final int f31088a = 0;
    public final Object f31089b;

    public tl0(s4.y yVar) {
        this.f31089b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f31088a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f31089b;
                pg.c1 c1Var = yVar.I;
                ((GestureDetector) yVar.N.f14388b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f46688w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f46688w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.c1 c1Var2 = yVar.f46682c;
                    if (c1Var2 != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f46688w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f46688w = motionEvent.getPointerId(i10);
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
                        yVar.f46688w = -1;
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
        pl0 pl0Var;
        int findPointerIndex;
        switch (this.f31088a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                zl0 zl0Var = (zl0) this.f31089b;
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
                    if ((zl0Var.f33535k1 || itemAnimator == null || !itemAnimator.k()) && zl0Var.F0(y3) && (E = zl0Var.E(x10, y3)) != null && zl0Var.G0(E)) {
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
                        if (zl0Var.f33529h1) {
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
                        zl0Var.M1.G(motionEvent);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && zl0Var.N1 != null) {
                        ql0 ql0Var = zl0Var.f33523e1;
                        if (ql0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(ql0Var);
                            zl0Var.f33523e1 = null;
                        }
                        View view2 = zl0Var.N1;
                        zl0Var.k1(view2, 0.0f, 0.0f, false);
                        zl0Var.N1 = null;
                        zl0Var.P1 = false;
                        zl0Var.n1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (pl0Var = zl0Var.Y0) != null && zl0Var.Z0) {
                            pl0Var.i();
                            zl0Var.Z0 = false;
                        }
                    }
                } else if (!zl0Var.P1 && zl0Var.N1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    ql0 ql0Var2 = new ql0(this, x12, y11, 0);
                    zl0Var.f33523e1 = ql0Var2;
                    AndroidUtilities.runOnUIThread(ql0Var2, ViewConfiguration.getTapTimeout());
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
                s4.y yVar = (s4.y) this.f31089b;
                ((GestureDetector) yVar.N.f14388b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f46688w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.f46683e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f46682c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.f46658e.f46523a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.c1 c1Var = uVar.f46658e;
                            yVar.d -= uVar.f46661r;
                            yVar.f46683e -= uVar.f46662s;
                            yVar.j(c1Var, true);
                            if (yVar.f46680a.remove(c1Var.f46523a)) {
                                yVar.f46689x.a(yVar.H, c1Var);
                            }
                            yVar.p(c1Var, uVar.f46659f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f46688w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f46688w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f46682c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f31088a) {
            case 0:
                ((zl0) this.f31089b).J0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f31089b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public tl0(Context context, zl0 zl0Var) {
        this.f31089b = zl0Var;
        ii.n4 n4Var = new ii.n4(context, new sl0(this));
        zl0Var.M1 = n4Var;
        ((o20) n4Var.f12543b).f29207t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
