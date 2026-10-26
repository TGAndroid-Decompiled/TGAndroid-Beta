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
public final class gm0 implements s4.t0 {
    public final int f28602a = 0;
    public final Object f28603b;

    public gm0(s4.z zVar) {
        this.f28603b = zVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f28602a) {
            case 0:
                return;
            default:
                s4.z zVar = (s4.z) this.f28603b;
                cy0 cy0Var = zVar.I;
                ((GestureDetector) zVar.N.f15828b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = zVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (zVar.f47868w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(zVar.f47868w);
                    if (findPointerIndex >= 0) {
                        zVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.e1 e1Var = zVar.f47863c;
                    if (e1Var != null) {
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
                                            zVar.u(zVar.E, actionIndex, motionEvent);
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
                                zVar.u(zVar.E, findPointerIndex, motionEvent);
                                zVar.p(e1Var);
                                zVar.H.removeCallbacks(cy0Var);
                                cy0Var.run();
                                zVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        zVar.r(null, 0);
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
        cm0 cm0Var;
        int findPointerIndex;
        switch (this.f28602a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                mm0 mm0Var = (mm0) this.f28603b;
                Rect rect = mm0Var.E1;
                if (mm0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && mm0Var.L1 == null && z10) {
                    float x9 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    mm0Var.X0 = false;
                    s4.m0 itemAnimator = mm0Var.getItemAnimator();
                    if ((mm0Var.f30636i1 || itemAnimator == null || !itemAnimator.k()) && mm0Var.E0(y3) && (E = mm0Var.E(x9, y3)) != null && mm0Var.F0(E)) {
                        mm0Var.L1 = E;
                    }
                    if (mm0Var.L1 instanceof ViewGroup) {
                        float x10 = motionEvent.getX() - mm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - mm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) mm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
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
                        if (mm0Var.f30630f1) {
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
                        mm0Var.K1.g0(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && mm0Var.L1 != null) {
                        dm0 dm0Var = mm0Var.f30624c1;
                        if (dm0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(dm0Var);
                            mm0Var.f30624c1 = null;
                        }
                        View view2 = mm0Var.L1;
                        mm0Var.k1(view2, 0.0f, 0.0f, false);
                        mm0Var.L1 = null;
                        mm0Var.N1 = false;
                        mm0Var.n1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (cm0Var = mm0Var.W0) != null && mm0Var.X0) {
                            cm0Var.g();
                            mm0Var.X0 = false;
                        }
                    }
                } else if (!mm0Var.N1 && mm0Var.L1 != null) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    dm0 dm0Var2 = new dm0(this, x11, y11, 0);
                    mm0Var.f30624c1 = dm0Var2;
                    AndroidUtilities.runOnUIThread(dm0Var2, ViewConfiguration.getTapTimeout());
                    if (mm0Var.L1.isEnabled()) {
                        View view3 = mm0Var.L1;
                        if (mm0Var.H0(view3, x11 - view3.getX(), y11 - mm0Var.L1.getY())) {
                            mm0Var.l1(mm0Var.M1, mm0Var.L1);
                            org.telegram.ui.Cells.y yVar = mm0Var.B1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (mm0Var.V0 == null && mm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                mm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            mm0Var.B1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.z zVar = (s4.z) this.f28603b;
                ((GestureDetector) zVar.N.f15828b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.v vVar = null;
                if (actionMasked2 == 0) {
                    zVar.f47868w = motionEvent.getPointerId(0);
                    zVar.d = motionEvent.getX();
                    zVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = zVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    zVar.J = VelocityTracker.obtain();
                    if (zVar.f47863c == null) {
                        ArrayList arrayList = zVar.F;
                        if (!arrayList.isEmpty()) {
                            View m10 = zVar.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.v vVar2 = (s4.v) arrayList.get(size);
                                    if (vVar2.e.f47738a == m10) {
                                        vVar = vVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (vVar != null) {
                            s4.e1 e1Var = vVar.e;
                            zVar.d -= vVar.f47845r;
                            zVar.e -= vVar.f47846s;
                            zVar.l(e1Var, true);
                            if (zVar.f47861a.remove(e1Var.f47738a)) {
                                zVar.f47869x.a(zVar.H, e1Var);
                            }
                            zVar.r(e1Var, vVar.f47843f);
                            zVar.u(zVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = zVar.f47868w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        zVar.j(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    zVar.f47868w = -1;
                    zVar.r(null, 0);
                }
                VelocityTracker velocityTracker2 = zVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (zVar.f47863c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f28602a) {
            case 0:
                ((mm0) this.f28603b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.z) this.f28603b).r(null, 0);
                    return;
                }
                return;
        }
    }

    public gm0(Context context, mm0 mm0Var) {
        this.f28603b = mm0Var;
        jg.i iVar = new jg.i(context, new fm0(this));
        mm0Var.K1 = iVar;
        ((v20) iVar.f15726a).f33556t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
