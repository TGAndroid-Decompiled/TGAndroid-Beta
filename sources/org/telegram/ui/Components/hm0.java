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
public final class hm0 implements s4.q0 {
    public final int f25710a = 0;
    public final Object f25711b;

    public hm0(s4.y yVar) {
        this.f25711b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f25710a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f25711b;
                org.telegram.ui.Wallet.m5 m5Var = yVar.I;
                ((GestureDetector) yVar.N.f13233b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f44991w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f44991w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.b1 b1Var = yVar.f44986c;
                    if (b1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f44991w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f44991w = motionEvent.getPointerId(i10);
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
                                yVar.H.removeCallbacks(m5Var);
                                m5Var.run();
                                yVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        yVar.p(null, 0);
                        yVar.f44991w = -1;
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
        dm0 dm0Var;
        int findPointerIndex;
        switch (this.f25710a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                mm0 mm0Var = (mm0) this.f25711b;
                Rect rect = mm0Var.E1;
                if (mm0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && mm0Var.L1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    mm0Var.X0 = false;
                    s4.l0 itemAnimator = mm0Var.getItemAnimator();
                    if ((mm0Var.f27429i1 || itemAnimator == null || !itemAnimator.k()) && mm0Var.E0(y3) && (E = mm0Var.E(x10, y3)) != null && mm0Var.F0(E)) {
                        mm0Var.L1 = E;
                    }
                    if (mm0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - mm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - mm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) mm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    mm0Var.L1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    mm0Var.M1 = -1;
                    View view = mm0Var.L1;
                    if (view != null) {
                        if (mm0Var.f27423f1) {
                            mm0Var.M1 = RecyclerView.S(view);
                        } else {
                            mm0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - mm0Var.L1.getLeft(), motionEvent.getY() - mm0Var.L1.getTop(), 0);
                        if (mm0Var.L1.onTouchEvent(obtain)) {
                            mm0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (mm0Var.L1 != null && !mm0Var.N1) {
                    try {
                        mm0Var.K1.Y0(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && mm0Var.L1 != null) {
                        em0 em0Var = mm0Var.f27417c1;
                        if (em0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(em0Var);
                            mm0Var.f27417c1 = null;
                        }
                        View view2 = mm0Var.L1;
                        mm0Var.h1(view2, 0.0f, 0.0f, false);
                        mm0Var.L1 = null;
                        mm0Var.N1 = false;
                        mm0Var.k1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (dm0Var = mm0Var.W0) != null && mm0Var.X0) {
                            dm0Var.h();
                            mm0Var.X0 = false;
                        }
                    }
                } else if (!mm0Var.N1 && mm0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    em0 em0Var2 = new em0(this, x12, y11, 0);
                    mm0Var.f27417c1 = em0Var2;
                    AndroidUtilities.runOnUIThread(em0Var2, ViewConfiguration.getTapTimeout());
                    if (mm0Var.L1.isEnabled()) {
                        View view3 = mm0Var.L1;
                        if (mm0Var.H0(view3, x12 - view3.getX(), y11 - mm0Var.L1.getY())) {
                            mm0Var.i1(mm0Var.M1, mm0Var.L1);
                            org.telegram.ui.Cells.z zVar = mm0Var.B1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (mm0Var.V0 == null && mm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                mm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            mm0Var.w1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.f25711b;
                ((GestureDetector) yVar.N.f13233b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f44991w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f44986c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f44838a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.b1 b1Var = uVar.e;
                            yVar.d -= uVar.f44963r;
                            yVar.e -= uVar.f44964s;
                            yVar.j(b1Var, true);
                            if (yVar.f44984a.remove(b1Var.f44838a)) {
                                yVar.f44992x.a(yVar.H, b1Var);
                            }
                            yVar.p(b1Var, uVar.f44961f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f44991w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f44991w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f44986c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f25710a) {
            case 0:
                ((mm0) this.f25711b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f25711b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public hm0(mm0 mm0Var, Context context) {
        this.f25711b = mm0Var;
        ji.h5 h5Var = new ji.h5(context, new gm0(this));
        mm0Var.K1 = h5Var;
        ((x20) h5Var.f13312b).f31140t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
