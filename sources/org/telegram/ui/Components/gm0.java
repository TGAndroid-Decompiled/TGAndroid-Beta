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
public final class gm0 implements s4.q0 {
    public final int f26728a = 0;
    public final Object f26729b;

    public gm0(s4.y yVar) {
        this.f26729b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f26728a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f26729b;
                org.telegram.ui.Wallet.m4 m4Var = yVar.I;
                ((GestureDetector) yVar.N.f16072b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f46495w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f46495w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.b1 b1Var = yVar.f46490c;
                    if (b1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f46495w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f46495w = motionEvent.getPointerId(i10);
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
                                yVar.n(b1Var);
                                yVar.H.removeCallbacks(m4Var);
                                m4Var.run();
                                yVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        yVar.p(null, 0);
                        yVar.f46495w = -1;
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
        cm0 cm0Var;
        int findPointerIndex;
        switch (this.f26728a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                lm0 lm0Var = (lm0) this.f26729b;
                Rect rect = lm0Var.E1;
                if (lm0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && lm0Var.L1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    lm0Var.X0 = false;
                    s4.l0 itemAnimator = lm0Var.getItemAnimator();
                    if ((lm0Var.f28386i1 || itemAnimator == null || !itemAnimator.k()) && lm0Var.E0(y3) && (E = lm0Var.E(x10, y3)) != null && lm0Var.F0(E)) {
                        lm0Var.L1 = E;
                    }
                    if (lm0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - lm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - lm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) lm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    lm0Var.L1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    lm0Var.M1 = -1;
                    View view = lm0Var.L1;
                    if (view != null) {
                        if (lm0Var.f28380f1) {
                            lm0Var.M1 = RecyclerView.S(view);
                        } else {
                            lm0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - lm0Var.L1.getLeft(), motionEvent.getY() - lm0Var.L1.getTop(), 0);
                        if (lm0Var.L1.onTouchEvent(obtain)) {
                            lm0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (lm0Var.L1 != null && !lm0Var.N1) {
                    try {
                        lm0Var.K1.k(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && lm0Var.L1 != null) {
                        dm0 dm0Var = lm0Var.f28374c1;
                        if (dm0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(dm0Var);
                            lm0Var.f28374c1 = null;
                        }
                        View view2 = lm0Var.L1;
                        lm0Var.j1(view2, 0.0f, 0.0f, false);
                        lm0Var.L1 = null;
                        lm0Var.N1 = false;
                        lm0Var.m1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (cm0Var = lm0Var.W0) != null && lm0Var.X0) {
                            cm0Var.h();
                            lm0Var.X0 = false;
                        }
                    }
                } else if (!lm0Var.N1 && lm0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    dm0 dm0Var2 = new dm0(this, x12, y11, 0);
                    lm0Var.f28374c1 = dm0Var2;
                    AndroidUtilities.runOnUIThread(dm0Var2, ViewConfiguration.getTapTimeout());
                    if (lm0Var.L1.isEnabled()) {
                        View view3 = lm0Var.L1;
                        if (lm0Var.H0(view3, x12 - view3.getX(), y11 - lm0Var.L1.getY())) {
                            lm0Var.k1(lm0Var.M1, lm0Var.L1);
                            org.telegram.ui.Cells.y yVar = lm0Var.B1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (lm0Var.V0 == null && lm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                lm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            lm0Var.B1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar2 = (s4.y) this.f26729b;
                ((GestureDetector) yVar2.N.f16072b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar2.f46495w = motionEvent.getPointerId(0);
                    yVar2.d = motionEvent.getX();
                    yVar2.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar2.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar2.J = VelocityTracker.obtain();
                    if (yVar2.f46490c == null) {
                        ArrayList arrayList = yVar2.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar2.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f46342a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.b1 b1Var = uVar.e;
                            yVar2.d -= uVar.f46467r;
                            yVar2.e -= uVar.f46468s;
                            yVar2.j(b1Var, true);
                            if (yVar2.f46488a.remove(b1Var.f46342a)) {
                                yVar2.f46496x.a(yVar2.H, b1Var);
                            }
                            yVar2.p(b1Var, uVar.f46465f);
                            yVar2.s(yVar2.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar2.f46495w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar2.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar2.f46495w = -1;
                    yVar2.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar2.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar2.f46490c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f26728a) {
            case 0:
                ((lm0) this.f26729b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f26729b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public gm0(lm0 lm0Var, Context context) {
        this.f26729b = lm0Var;
        le.b bVar = new le.b(context, (s20) new fm0(this));
        lm0Var.K1 = bVar;
        ((r20) bVar.f16072b).f30053t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
