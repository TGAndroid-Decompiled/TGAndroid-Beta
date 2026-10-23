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
public final class em0 implements s4.q0 {
    public final int f25934a = 0;
    public final Object f25935b;

    public em0(s4.y yVar) {
        this.f25935b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f25934a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f25935b;
                p8.b bVar = yVar.I;
                ((GestureDetector) yVar.N.f16009b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f46074w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f46074w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.b1 b1Var = yVar.f46069c;
                    if (b1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f46074w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f46074w = motionEvent.getPointerId(i10);
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
                                yVar.H.removeCallbacks(bVar);
                                bVar.run();
                                yVar.H.invalidate();
                                return;
                            } else {
                                return;
                            }
                        }
                        yVar.p(null, 0);
                        yVar.f46074w = -1;
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
        am0 am0Var;
        int findPointerIndex;
        switch (this.f25934a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                jm0 jm0Var = (jm0) this.f25935b;
                Rect rect = jm0Var.E1;
                if (jm0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && jm0Var.L1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    jm0Var.X0 = false;
                    s4.l0 itemAnimator = jm0Var.getItemAnimator();
                    if ((jm0Var.f27573i1 || itemAnimator == null || !itemAnimator.k()) && jm0Var.E0(y3) && (E = jm0Var.E(x10, y3)) != null && jm0Var.F0(E)) {
                        jm0Var.L1 = E;
                    }
                    if (jm0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - jm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - jm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) jm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    jm0Var.L1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    jm0Var.M1 = -1;
                    View view = jm0Var.L1;
                    if (view != null) {
                        if (jm0Var.f27567f1) {
                            jm0Var.M1 = RecyclerView.S(view);
                        } else {
                            jm0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - jm0Var.L1.getLeft(), motionEvent.getY() - jm0Var.L1.getTop(), 0);
                        if (jm0Var.L1.onTouchEvent(obtain)) {
                            jm0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (jm0Var.L1 != null && !jm0Var.N1) {
                    try {
                        jm0Var.K1.k(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && jm0Var.L1 != null) {
                        bm0 bm0Var = jm0Var.f27561c1;
                        if (bm0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(bm0Var);
                            jm0Var.f27561c1 = null;
                        }
                        View view2 = jm0Var.L1;
                        jm0Var.h1(view2, 0.0f, 0.0f, false);
                        jm0Var.L1 = null;
                        jm0Var.N1 = false;
                        jm0Var.k1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (am0Var = jm0Var.W0) != null && jm0Var.X0) {
                            am0Var.h();
                            jm0Var.X0 = false;
                        }
                    }
                } else if (!jm0Var.N1 && jm0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    bm0 bm0Var2 = new bm0(this, x12, y11, 0);
                    jm0Var.f27561c1 = bm0Var2;
                    AndroidUtilities.runOnUIThread(bm0Var2, ViewConfiguration.getTapTimeout());
                    if (jm0Var.L1.isEnabled()) {
                        View view3 = jm0Var.L1;
                        if (jm0Var.H0(view3, x12 - view3.getX(), y11 - jm0Var.L1.getY())) {
                            jm0Var.i1(jm0Var.M1, jm0Var.L1);
                            org.telegram.ui.Cells.z zVar = jm0Var.B1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (jm0Var.V0 == null && jm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                jm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            jm0Var.w1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.f25935b;
                ((GestureDetector) yVar.N.f16009b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f46074w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f46069c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f45921a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.b1 b1Var = uVar.e;
                            yVar.d -= uVar.f46046r;
                            yVar.e -= uVar.f46047s;
                            yVar.j(b1Var, true);
                            if (yVar.f46067a.remove(b1Var.f45921a)) {
                                yVar.f46075x.a(yVar.H, b1Var);
                            }
                            yVar.p(b1Var, uVar.f46044f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f46074w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f46074w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f46069c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f25934a) {
            case 0:
                ((jm0) this.f25935b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f25935b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public em0(jm0 jm0Var, Context context) {
        this.f25935b = jm0Var;
        le.b bVar = new le.b(context, (u20) new dm0(this));
        jm0Var.K1 = bVar;
        ((t20) bVar.f16009b).f30423t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
