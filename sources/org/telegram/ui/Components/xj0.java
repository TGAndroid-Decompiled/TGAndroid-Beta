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
public final class xj0 implements v4.t0 {
    public final int f42151a = 0;
    public final Object f42152b;

    public xj0(v4.z zVar) {
        this.f42152b = zVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f42151a) {
            case 0:
                return;
            default:
                v4.z zVar = (v4.z) this.f42152b;
                s4.s0 s0Var = zVar.J;
                ((GestureDetector) zVar.O.f36566b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = zVar.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (zVar.f59311x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(zVar.f59311x);
                    if (findPointerIndex >= 0) {
                        zVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    v4.f1 f1Var = zVar.f59304c;
                    if (f1Var != null) {
                        int i7 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == zVar.f59311x) {
                                            if (actionIndex == 0) {
                                                i7 = 1;
                                            }
                                            zVar.f59311x = motionEvent.getPointerId(i7);
                                            zVar.u(zVar.F, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = zVar.K;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                zVar.u(zVar.F, findPointerIndex, motionEvent);
                                zVar.p(f1Var);
                                zVar.I.removeCallbacks(s0Var);
                                s0Var.run();
                                zVar.I.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        zVar.r(null, 0);
                        zVar.f59311x = -1;
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
        tj0 tj0Var;
        int findPointerIndex;
        switch (this.f42151a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ek0 ek0Var = (ek0) this.f42152b;
                Rect rect = ek0Var.F1;
                if (ek0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && ek0Var.M1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ek0Var.Y0 = false;
                    v4.n0 itemAnimator = ek0Var.getItemAnimator();
                    if ((ek0Var.f34864j1 || itemAnimator == null || !itemAnimator.k()) && ek0Var.E0(y10) && (E = ek0Var.E(x10, y10)) != null && ek0Var.F0(E)) {
                        ek0Var.M1 = E;
                    }
                    if (ek0Var.M1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - ek0Var.M1.getLeft();
                        float y11 = motionEvent.getY() - ek0Var.M1.getTop();
                        ViewGroup viewGroup = (ViewGroup) ek0Var.M1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y11 >= childAt.getTop() && y11 <= childAt.getBottom() && childAt.isClickable()) {
                                    ek0Var.M1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    ek0Var.N1 = -1;
                    View view = ek0Var.M1;
                    if (view != null) {
                        if (ek0Var.f34858g1) {
                            ek0Var.N1 = RecyclerView.S(view);
                        } else {
                            ek0Var.N1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - ek0Var.M1.getLeft(), motionEvent.getY() - ek0Var.M1.getTop(), 0);
                        if (ek0Var.M1.onTouchEvent(obtain)) {
                            ek0Var.O1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (ek0Var.M1 != null && !ek0Var.O1) {
                    try {
                        ek0Var.L1.w0(motionEvent);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && ek0Var.M1 != null) {
                        uj0 uj0Var = ek0Var.f34853d1;
                        if (uj0Var != null) {
                            org.telegram.messenger.g0.r(uj0Var);
                            ek0Var.f34853d1 = null;
                        }
                        View view2 = ek0Var.M1;
                        ek0Var.j1(view2, 0.0f, 0.0f, false);
                        ek0Var.M1 = null;
                        ek0Var.O1 = false;
                        ek0Var.m1(view2, motionEvent);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (tj0Var = ek0Var.X0) != null && ek0Var.Y0) {
                            tj0Var.j();
                            ek0Var.Y0 = false;
                        }
                    }
                } else if (!ek0Var.O1 && ek0Var.M1 != null) {
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    uj0 uj0Var2 = new uj0(this, x12, y12, 0);
                    ek0Var.f34853d1 = uj0Var2;
                    org.telegram.messenger.g0.h3(uj0Var2, ViewConfiguration.getTapTimeout());
                    if (ek0Var.M1.isEnabled()) {
                        View view3 = ek0Var.M1;
                        if (ek0Var.H0(view3, x12 - view3.getX(), y12 - ek0Var.M1.getY())) {
                            ek0Var.k1(ek0Var.N1, ek0Var.M1);
                            org.telegram.ui.Cells.y yVar = ek0Var.C1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (ek0Var.W0 == null && ek0Var.V0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                ek0Var.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            ek0Var.y1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                v4.z zVar = (v4.z) this.f42152b;
                ((GestureDetector) zVar.O.f36566b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                v4.v vVar = null;
                if (actionMasked2 == 0) {
                    zVar.f59311x = motionEvent.getPointerId(0);
                    zVar.d = motionEvent.getX();
                    zVar.f59305e = motionEvent.getY();
                    VelocityTracker velocityTracker = zVar.K;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    zVar.K = VelocityTracker.obtain();
                    if (zVar.f59304c == null) {
                        ArrayList arrayList = zVar.G;
                        if (!arrayList.isEmpty()) {
                            View m10 = zVar.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    v4.v vVar2 = (v4.v) arrayList.get(size);
                                    if (vVar2.f59278e.f59165a == m10) {
                                        vVar = vVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (vVar != null) {
                            v4.f1 f1Var = vVar.f59278e;
                            zVar.d -= vVar.f59281r;
                            zVar.f59305e -= vVar.f59282s;
                            zVar.l(f1Var, true);
                            if (zVar.f59302a.remove(f1Var.f59165a)) {
                                zVar.f59312y.a(zVar.I, f1Var);
                            }
                            zVar.r(f1Var, vVar.f59279f);
                            zVar.u(zVar.F, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i7 = zVar.f59311x;
                    if (i7 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i7)) >= 0) {
                        zVar.j(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    zVar.f59311x = -1;
                    zVar.r(null, 0);
                }
                VelocityTracker velocityTracker2 = zVar.K;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (zVar.f59304c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f42151a) {
            case 0:
                ((ek0) this.f42152b).I0(true);
                return;
            default:
                if (z10) {
                    ((v4.z) this.f42152b).r(null, 0);
                    return;
                }
                return;
        }
    }

    public xj0(Context context, ek0 ek0Var) {
        this.f42152b = ek0Var;
        qf qfVar = new qf(context, new wj0(this));
        ek0Var.L1 = qfVar;
        ((o10) qfVar.f38895b).f38054t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
