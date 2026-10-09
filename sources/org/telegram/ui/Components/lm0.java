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
public final class lm0 implements s4.s0 {
    public final int f28487a = 0;
    public final Object f28488b;

    public lm0(s4.z zVar) {
        this.f28488b = zVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f28487a) {
            case 0:
                return;
            default:
                s4.z zVar = (s4.z) this.f28488b;
                org.telegram.ui.Wallet.m5 m5Var = zVar.I;
                ((GestureDetector) zVar.N.f15668b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = zVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (zVar.f47822w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(zVar.f47822w);
                    if (findPointerIndex >= 0) {
                        zVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.d1 d1Var = zVar.f47816c;
                    if (d1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == zVar.f47822w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            zVar.f47822w = motionEvent.getPointerId(i10);
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
                                zVar.H.removeCallbacks(m5Var);
                                m5Var.run();
                                zVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        zVar.p(null, 0);
                        zVar.f47822w = -1;
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
        hm0 hm0Var;
        int findPointerIndex;
        switch (this.f28487a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                qm0 qm0Var = (qm0) this.f28488b;
                Rect rect = qm0Var.E1;
                if (qm0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && qm0Var.L1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    qm0Var.X0 = false;
                    s4.n0 itemAnimator = qm0Var.getItemAnimator();
                    if ((qm0Var.f30206i1 || itemAnimator == null || !itemAnimator.k()) && qm0Var.E0(y3) && (E = qm0Var.E(x10, y3)) != null && qm0Var.F0(E)) {
                        qm0Var.L1 = E;
                    }
                    if (qm0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - qm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - qm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) qm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    qm0Var.L1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    qm0Var.M1 = -1;
                    View view = qm0Var.L1;
                    if (view != null) {
                        if (qm0Var.f30200f1) {
                            qm0Var.M1 = RecyclerView.S(view);
                        } else {
                            qm0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - qm0Var.L1.getLeft(), motionEvent.getY() - qm0Var.L1.getTop(), 0);
                        if (qm0Var.L1.onTouchEvent(obtain)) {
                            qm0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (qm0Var.L1 != null && !qm0Var.N1) {
                    try {
                        qm0Var.K1.T0(motionEvent);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && qm0Var.L1 != null) {
                        im0 im0Var = qm0Var.f30194c1;
                        if (im0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(im0Var);
                            qm0Var.f30194c1 = null;
                        }
                        View view2 = qm0Var.L1;
                        qm0Var.h1(view2, 0.0f, 0.0f, false);
                        qm0Var.L1 = null;
                        qm0Var.N1 = false;
                        qm0Var.k1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (hm0Var = qm0Var.W0) != null && qm0Var.X0) {
                            hm0Var.h();
                            qm0Var.X0 = false;
                        }
                    }
                } else if (!qm0Var.N1 && qm0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    im0 im0Var2 = new im0(this, x12, y11, 0);
                    qm0Var.f30194c1 = im0Var2;
                    AndroidUtilities.runOnUIThread(im0Var2, ViewConfiguration.getTapTimeout());
                    if (qm0Var.L1.isEnabled()) {
                        View view3 = qm0Var.L1;
                        if (qm0Var.H0(view3, x12 - view3.getX(), y11 - qm0Var.L1.getY())) {
                            qm0Var.i1(qm0Var.M1, qm0Var.L1);
                            org.telegram.ui.Cells.z zVar = qm0Var.B1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (qm0Var.V0 == null && qm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                qm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            qm0Var.w1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.z zVar2 = (s4.z) this.f28488b;
                ((GestureDetector) zVar2.N.f15668b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    zVar2.f47822w = motionEvent.getPointerId(0);
                    zVar2.d = motionEvent.getX();
                    zVar2.f47817e = motionEvent.getY();
                    VelocityTracker velocityTracker = zVar2.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    zVar2.J = VelocityTracker.obtain();
                    if (zVar2.f47816c == null) {
                        ArrayList arrayList = zVar2.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = zVar2.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.f47786e.f47656a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.d1 d1Var = uVar.f47786e;
                            zVar2.d -= uVar.f47789r;
                            zVar2.f47817e -= uVar.f47790s;
                            zVar2.j(d1Var, true);
                            if (zVar2.f47814a.remove(d1Var.f47656a)) {
                                zVar2.f47823x.a(zVar2.H, d1Var);
                            }
                            zVar2.p(d1Var, uVar.f47787f);
                            zVar2.s(zVar2.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = zVar2.f47822w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        zVar2.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    zVar2.f47822w = -1;
                    zVar2.p(null, 0);
                }
                VelocityTracker velocityTracker2 = zVar2.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (zVar2.f47816c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f28487a) {
            case 0:
                ((qm0) this.f28488b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.z) this.f28488b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public lm0(qm0 qm0Var, Context context) {
        this.f28488b = qm0Var;
        k2.g0 g0Var = new k2.g0(context, new km0(this));
        qm0Var.K1 = g0Var;
        ((b30) g0Var.f14470b).f24882t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
