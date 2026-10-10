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
public final class mm0 implements s4.s0 {
    public final int f28849a = 0;
    public final Object f28850b;

    public mm0(s4.z zVar) {
        this.f28850b = zVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f28849a) {
            case 0:
                return;
            default:
                s4.z zVar = (s4.z) this.f28850b;
                org.telegram.ui.Wallet.o5 o5Var = zVar.I;
                ((GestureDetector) zVar.N.f15672b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = zVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (zVar.f47868w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(zVar.f47868w);
                    if (findPointerIndex >= 0) {
                        zVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.d1 d1Var = zVar.f47862c;
                    if (d1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == zVar.f47868w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            zVar.f47868w = motionEvent.getPointerId(i10);
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
                                zVar.H.removeCallbacks(o5Var);
                                o5Var.run();
                                zVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        zVar.p(null, 0);
                        zVar.f47868w = -1;
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
        im0 im0Var;
        int findPointerIndex;
        switch (this.f28849a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                rm0 rm0Var = (rm0) this.f28850b;
                Rect rect = rm0Var.E1;
                if (rm0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && rm0Var.L1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    rm0Var.X0 = false;
                    s4.n0 itemAnimator = rm0Var.getItemAnimator();
                    if ((rm0Var.f30501i1 || itemAnimator == null || !itemAnimator.k()) && rm0Var.E0(y3) && (E = rm0Var.E(x10, y3)) != null && rm0Var.F0(E)) {
                        rm0Var.L1 = E;
                    }
                    if (rm0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - rm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - rm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) rm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    rm0Var.L1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    rm0Var.M1 = -1;
                    View view = rm0Var.L1;
                    if (view != null) {
                        if (rm0Var.f30495f1) {
                            rm0Var.M1 = RecyclerView.S(view);
                        } else {
                            rm0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - rm0Var.L1.getLeft(), motionEvent.getY() - rm0Var.L1.getTop(), 0);
                        if (rm0Var.L1.onTouchEvent(obtain)) {
                            rm0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (rm0Var.L1 != null && !rm0Var.N1) {
                    try {
                        rm0Var.K1.T0(motionEvent);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && rm0Var.L1 != null) {
                        jm0 jm0Var = rm0Var.f30489c1;
                        if (jm0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(jm0Var);
                            rm0Var.f30489c1 = null;
                        }
                        View view2 = rm0Var.L1;
                        rm0Var.h1(view2, 0.0f, 0.0f, false);
                        rm0Var.L1 = null;
                        rm0Var.N1 = false;
                        rm0Var.k1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (im0Var = rm0Var.W0) != null && rm0Var.X0) {
                            im0Var.h();
                            rm0Var.X0 = false;
                        }
                    }
                } else if (!rm0Var.N1 && rm0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    jm0 jm0Var2 = new jm0(this, x12, y11, 0);
                    rm0Var.f30489c1 = jm0Var2;
                    AndroidUtilities.runOnUIThread(jm0Var2, ViewConfiguration.getTapTimeout());
                    if (rm0Var.L1.isEnabled()) {
                        View view3 = rm0Var.L1;
                        if (rm0Var.H0(view3, x12 - view3.getX(), y11 - rm0Var.L1.getY())) {
                            rm0Var.i1(rm0Var.M1, rm0Var.L1);
                            org.telegram.ui.Cells.z zVar = rm0Var.B1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (rm0Var.V0 == null && rm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                rm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            rm0Var.w1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.z zVar2 = (s4.z) this.f28850b;
                ((GestureDetector) zVar2.N.f15672b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    zVar2.f47868w = motionEvent.getPointerId(0);
                    zVar2.d = motionEvent.getX();
                    zVar2.f47863e = motionEvent.getY();
                    VelocityTracker velocityTracker = zVar2.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    zVar2.J = VelocityTracker.obtain();
                    if (zVar2.f47862c == null) {
                        ArrayList arrayList = zVar2.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = zVar2.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.f47832e.f47702a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.d1 d1Var = uVar.f47832e;
                            zVar2.d -= uVar.f47835r;
                            zVar2.f47863e -= uVar.f47836s;
                            zVar2.j(d1Var, true);
                            if (zVar2.f47860a.remove(d1Var.f47702a)) {
                                zVar2.f47869x.a(zVar2.H, d1Var);
                            }
                            zVar2.p(d1Var, uVar.f47833f);
                            zVar2.s(zVar2.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = zVar2.f47868w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        zVar2.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    zVar2.f47868w = -1;
                    zVar2.p(null, 0);
                }
                VelocityTracker velocityTracker2 = zVar2.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (zVar2.f47862c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f28849a) {
            case 0:
                ((rm0) this.f28850b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.z) this.f28850b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public mm0(rm0 rm0Var, Context context) {
        this.f28850b = rm0Var;
        k2.g0 g0Var = new k2.g0(context, new lm0(this));
        rm0Var.K1 = g0Var;
        ((c30) g0Var.f14470b).f25165t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
