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
public final class vj0 implements v4.t0 {
    public final int f40688a = 0;
    public final Object f40689b;

    public vj0(v4.z zVar) {
        this.f40689b = zVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f40688a) {
            case 0:
                return;
            default:
                v4.z zVar = (v4.z) this.f40689b;
                s4.s0 s0Var = zVar.J;
                ((GestureDetector) zVar.O.f35933b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = zVar.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (zVar.f59269x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(zVar.f59269x);
                    if (findPointerIndex >= 0) {
                        zVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    v4.f1 f1Var = zVar.f59262c;
                    if (f1Var != null) {
                        int i7 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == zVar.f59269x) {
                                            if (actionIndex == 0) {
                                                i7 = 1;
                                            }
                                            zVar.f59269x = motionEvent.getPointerId(i7);
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
                        zVar.f59269x = -1;
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
        rj0 rj0Var;
        int findPointerIndex;
        switch (this.f40688a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ck0 ck0Var = (ck0) this.f40689b;
                Rect rect = ck0Var.F1;
                if (ck0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && ck0Var.M1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ck0Var.Y0 = false;
                    v4.n0 itemAnimator = ck0Var.getItemAnimator();
                    if ((ck0Var.f34065j1 || itemAnimator == null || !itemAnimator.k()) && ck0Var.E0(y10) && (E = ck0Var.E(x10, y10)) != null && ck0Var.F0(E)) {
                        ck0Var.M1 = E;
                    }
                    if (ck0Var.M1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - ck0Var.M1.getLeft();
                        float y11 = motionEvent.getY() - ck0Var.M1.getTop();
                        ViewGroup viewGroup = (ViewGroup) ck0Var.M1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y11 >= childAt.getTop() && y11 <= childAt.getBottom() && childAt.isClickable()) {
                                    ck0Var.M1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    ck0Var.N1 = -1;
                    View view = ck0Var.M1;
                    if (view != null) {
                        if (ck0Var.f34059g1) {
                            ck0Var.N1 = RecyclerView.S(view);
                        } else {
                            ck0Var.N1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - ck0Var.M1.getLeft(), motionEvent.getY() - ck0Var.M1.getTop(), 0);
                        if (ck0Var.M1.onTouchEvent(obtain)) {
                            ck0Var.O1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (ck0Var.M1 != null && !ck0Var.O1) {
                    try {
                        ck0Var.L1.w0(motionEvent);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && ck0Var.M1 != null) {
                        sj0 sj0Var = ck0Var.f34054d1;
                        if (sj0Var != null) {
                            org.telegram.messenger.g0.r(sj0Var);
                            ck0Var.f34054d1 = null;
                        }
                        View view2 = ck0Var.M1;
                        ck0Var.j1(view2, 0.0f, 0.0f, false);
                        ck0Var.M1 = null;
                        ck0Var.O1 = false;
                        ck0Var.m1(view2, motionEvent);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (rj0Var = ck0Var.X0) != null && ck0Var.Y0) {
                            rj0Var.j();
                            ck0Var.Y0 = false;
                        }
                    }
                } else if (!ck0Var.O1 && ck0Var.M1 != null) {
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    sj0 sj0Var2 = new sj0(this, x12, y12, 0);
                    ck0Var.f34054d1 = sj0Var2;
                    org.telegram.messenger.g0.h3(sj0Var2, ViewConfiguration.getTapTimeout());
                    if (ck0Var.M1.isEnabled()) {
                        View view3 = ck0Var.M1;
                        if (ck0Var.H0(view3, x12 - view3.getX(), y12 - ck0Var.M1.getY())) {
                            ck0Var.k1(ck0Var.N1, ck0Var.M1);
                            org.telegram.ui.Cells.y yVar = ck0Var.C1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (ck0Var.W0 == null && ck0Var.V0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                ck0Var.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            ck0Var.y1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                v4.z zVar = (v4.z) this.f40689b;
                ((GestureDetector) zVar.O.f35933b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                v4.v vVar = null;
                if (actionMasked2 == 0) {
                    zVar.f59269x = motionEvent.getPointerId(0);
                    zVar.d = motionEvent.getX();
                    zVar.f59263e = motionEvent.getY();
                    VelocityTracker velocityTracker = zVar.K;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    zVar.K = VelocityTracker.obtain();
                    if (zVar.f59262c == null) {
                        ArrayList arrayList = zVar.G;
                        if (!arrayList.isEmpty()) {
                            View m10 = zVar.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    v4.v vVar2 = (v4.v) arrayList.get(size);
                                    if (vVar2.f59236e.f59123a == m10) {
                                        vVar = vVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (vVar != null) {
                            v4.f1 f1Var = vVar.f59236e;
                            zVar.d -= vVar.f59239r;
                            zVar.f59263e -= vVar.f59240s;
                            zVar.l(f1Var, true);
                            if (zVar.f59260a.remove(f1Var.f59123a)) {
                                zVar.f59270y.a(zVar.I, f1Var);
                            }
                            zVar.r(f1Var, vVar.f59237f);
                            zVar.u(zVar.F, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i7 = zVar.f59269x;
                    if (i7 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i7)) >= 0) {
                        zVar.j(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    zVar.f59269x = -1;
                    zVar.r(null, 0);
                }
                VelocityTracker velocityTracker2 = zVar.K;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (zVar.f59262c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f40688a) {
            case 0:
                ((ck0) this.f40689b).I0(true);
                return;
            default:
                if (z10) {
                    ((v4.z) this.f40689b).r(null, 0);
                    return;
                }
                return;
        }
    }

    public vj0(Context context, ck0 ck0Var) {
        this.f40689b = ck0Var;
        of ofVar = new of(context, new uj0(this));
        ck0Var.L1 = ofVar;
        ((l10) ofVar.f38076b).f36972t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
