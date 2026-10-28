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
public final class hm0 implements s4.t0 {
    public final int f29025a = 0;
    public final Object f29026b;

    public hm0(s4.z zVar) {
        this.f29026b = zVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f29025a) {
            case 0:
                return;
            default:
                s4.z zVar = (s4.z) this.f29026b;
                dy0 dy0Var = zVar.I;
                ((GestureDetector) zVar.N.f15827b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = zVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (zVar.f47903w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(zVar.f47903w);
                    if (findPointerIndex >= 0) {
                        zVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.e1 e1Var = zVar.f47898c;
                    if (e1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == zVar.f47903w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            zVar.f47903w = motionEvent.getPointerId(i10);
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
                                zVar.H.removeCallbacks(dy0Var);
                                dy0Var.run();
                                zVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        zVar.r(null, 0);
                        zVar.f47903w = -1;
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
        switch (this.f29025a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                nm0 nm0Var = (nm0) this.f29026b;
                Rect rect = nm0Var.E1;
                if (nm0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && nm0Var.L1 == null && z10) {
                    float x9 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    nm0Var.X0 = false;
                    s4.m0 itemAnimator = nm0Var.getItemAnimator();
                    if ((nm0Var.f30978i1 || itemAnimator == null || !itemAnimator.k()) && nm0Var.E0(y3) && (E = nm0Var.E(x9, y3)) != null && nm0Var.F0(E)) {
                        nm0Var.L1 = E;
                    }
                    if (nm0Var.L1 instanceof ViewGroup) {
                        float x10 = motionEvent.getX() - nm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - nm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) nm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    nm0Var.L1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    nm0Var.M1 = -1;
                    View view = nm0Var.L1;
                    if (view != null) {
                        if (nm0Var.f30972f1) {
                            nm0Var.M1 = RecyclerView.S(view);
                        } else {
                            nm0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - nm0Var.L1.getLeft(), motionEvent.getY() - nm0Var.L1.getTop(), 0);
                        if (nm0Var.L1.onTouchEvent(obtain)) {
                            nm0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (nm0Var.L1 != null && !nm0Var.N1) {
                    try {
                        nm0Var.K1.g0(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && nm0Var.L1 != null) {
                        em0 em0Var = nm0Var.f30966c1;
                        if (em0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(em0Var);
                            nm0Var.f30966c1 = null;
                        }
                        View view2 = nm0Var.L1;
                        nm0Var.k1(view2, 0.0f, 0.0f, false);
                        nm0Var.L1 = null;
                        nm0Var.N1 = false;
                        nm0Var.n1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (dm0Var = nm0Var.W0) != null && nm0Var.X0) {
                            dm0Var.g();
                            nm0Var.X0 = false;
                        }
                    }
                } else if (!nm0Var.N1 && nm0Var.L1 != null) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    em0 em0Var2 = new em0(this, x11, y11, 0);
                    nm0Var.f30966c1 = em0Var2;
                    AndroidUtilities.runOnUIThread(em0Var2, ViewConfiguration.getTapTimeout());
                    if (nm0Var.L1.isEnabled()) {
                        View view3 = nm0Var.L1;
                        if (nm0Var.H0(view3, x11 - view3.getX(), y11 - nm0Var.L1.getY())) {
                            nm0Var.l1(nm0Var.M1, nm0Var.L1);
                            org.telegram.ui.Cells.y yVar = nm0Var.B1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (nm0Var.V0 == null && nm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                nm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            nm0Var.B1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.z zVar = (s4.z) this.f29026b;
                ((GestureDetector) zVar.N.f15827b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.v vVar = null;
                if (actionMasked2 == 0) {
                    zVar.f47903w = motionEvent.getPointerId(0);
                    zVar.d = motionEvent.getX();
                    zVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = zVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    zVar.J = VelocityTracker.obtain();
                    if (zVar.f47898c == null) {
                        ArrayList arrayList = zVar.F;
                        if (!arrayList.isEmpty()) {
                            View m10 = zVar.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.v vVar2 = (s4.v) arrayList.get(size);
                                    if (vVar2.e.f47773a == m10) {
                                        vVar = vVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (vVar != null) {
                            s4.e1 e1Var = vVar.e;
                            zVar.d -= vVar.f47880r;
                            zVar.e -= vVar.f47881s;
                            zVar.l(e1Var, true);
                            if (zVar.f47896a.remove(e1Var.f47773a)) {
                                zVar.f47904x.a(zVar.H, e1Var);
                            }
                            zVar.r(e1Var, vVar.f47878f);
                            zVar.u(zVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = zVar.f47903w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        zVar.j(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    zVar.f47903w = -1;
                    zVar.r(null, 0);
                }
                VelocityTracker velocityTracker2 = zVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (zVar.f47898c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f29025a) {
            case 0:
                ((nm0) this.f29026b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.z) this.f29026b).r(null, 0);
                    return;
                }
                return;
        }
    }

    public hm0(Context context, nm0 nm0Var) {
        this.f29026b = nm0Var;
        jg.i iVar = new jg.i(context, new gm0(this));
        nm0Var.K1 = iVar;
        ((v20) iVar.f15725a).f33541t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
