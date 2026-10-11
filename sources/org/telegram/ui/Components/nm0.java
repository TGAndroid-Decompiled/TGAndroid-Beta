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
public final class nm0 implements s4.s0 {
    public final int f29092a = 0;
    public final Object f29093b;

    public nm0(s4.z zVar) {
        this.f29093b = zVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f29092a) {
            case 0:
                return;
            default:
                s4.z zVar = (s4.z) this.f29093b;
                org.telegram.ui.Wallet.p5 p5Var = zVar.I;
                ((GestureDetector) zVar.N.f15693b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = zVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (zVar.f47914w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(zVar.f47914w);
                    if (findPointerIndex >= 0) {
                        zVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.d1 d1Var = zVar.f47908c;
                    if (d1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == zVar.f47914w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            zVar.f47914w = motionEvent.getPointerId(i10);
                                            zVar.s(zVar.E, actionIndex, motionEvent);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                VelocityTracker velocityTracker2 = zVar.J;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (findPointerIndex >= 0) {
                                zVar.s(zVar.E, findPointerIndex, motionEvent);
                                zVar.n(d1Var);
                                zVar.H.removeCallbacks(p5Var);
                                p5Var.run();
                                zVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        zVar.p(null, 0);
                        zVar.f47914w = -1;
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
        jm0 jm0Var;
        int findPointerIndex;
        switch (this.f29092a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                sm0 sm0Var = (sm0) this.f29093b;
                Rect rect = sm0Var.E1;
                if (sm0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && sm0Var.L1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    sm0Var.X0 = false;
                    s4.n0 itemAnimator = sm0Var.getItemAnimator();
                    if ((sm0Var.f30797i1 || itemAnimator == null || !itemAnimator.k()) && sm0Var.E0(y3) && (E = sm0Var.E(x10, y3)) != null && sm0Var.F0(E)) {
                        sm0Var.L1 = E;
                    }
                    if (sm0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - sm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - sm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) sm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    sm0Var.L1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    sm0Var.M1 = -1;
                    View view = sm0Var.L1;
                    if (view != null) {
                        if (sm0Var.f30791f1) {
                            sm0Var.M1 = RecyclerView.S(view);
                        } else {
                            sm0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - sm0Var.L1.getLeft(), motionEvent.getY() - sm0Var.L1.getTop(), 0);
                        if (sm0Var.L1.onTouchEvent(obtain)) {
                            sm0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (sm0Var.L1 != null && !sm0Var.N1) {
                    try {
                        sm0Var.K1.T0(motionEvent);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && sm0Var.L1 != null) {
                        km0 km0Var = sm0Var.f30785c1;
                        if (km0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(km0Var);
                            sm0Var.f30785c1 = null;
                        }
                        View view2 = sm0Var.L1;
                        sm0Var.h1(view2, 0.0f, 0.0f, false);
                        sm0Var.L1 = null;
                        sm0Var.N1 = false;
                        sm0Var.k1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (jm0Var = sm0Var.W0) != null && sm0Var.X0) {
                            jm0Var.h();
                            sm0Var.X0 = false;
                        }
                    }
                } else if (!sm0Var.N1 && sm0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    km0 km0Var2 = new km0(this, x12, y11, 0);
                    sm0Var.f30785c1 = km0Var2;
                    AndroidUtilities.runOnUIThread(km0Var2, ViewConfiguration.getTapTimeout());
                    if (sm0Var.L1.isEnabled()) {
                        View view3 = sm0Var.L1;
                        if (sm0Var.H0(view3, x12 - view3.getX(), y11 - sm0Var.L1.getY())) {
                            sm0Var.i1(sm0Var.M1, sm0Var.L1);
                            org.telegram.ui.Cells.z zVar = sm0Var.B1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (sm0Var.V0 == null && sm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                sm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            sm0Var.w1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.z zVar2 = (s4.z) this.f29093b;
                ((GestureDetector) zVar2.N.f15693b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    zVar2.f47914w = motionEvent.getPointerId(0);
                    zVar2.d = motionEvent.getX();
                    zVar2.f47909e = motionEvent.getY();
                    VelocityTracker velocityTracker = zVar2.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    zVar2.J = VelocityTracker.obtain();
                    if (zVar2.f47908c == null) {
                        ArrayList arrayList = zVar2.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = zVar2.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.f47878e.f47748a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.d1 d1Var = uVar.f47878e;
                            zVar2.d -= uVar.f47881r;
                            zVar2.f47909e -= uVar.f47882s;
                            zVar2.j(d1Var, true);
                            if (zVar2.f47906a.remove(d1Var.f47748a)) {
                                zVar2.f47915x.a(zVar2.H, d1Var);
                            }
                            zVar2.p(d1Var, uVar.f47879f);
                            zVar2.s(zVar2.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = zVar2.f47914w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        zVar2.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    zVar2.f47914w = -1;
                    zVar2.p(null, 0);
                }
                VelocityTracker velocityTracker2 = zVar2.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (zVar2.f47908c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f29092a) {
            case 0:
                ((sm0) this.f29093b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.z) this.f29093b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public nm0(sm0 sm0Var, Context context) {
        this.f29093b = sm0Var;
        k2.g0 g0Var = new k2.g0(context, new mm0(this));
        sm0Var.K1 = g0Var;
        ((c30) g0Var.f14469b).f25100t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
