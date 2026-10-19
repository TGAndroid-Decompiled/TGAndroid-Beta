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
public final class dm0 implements s4.q0 {
    public final int f25593a = 0;
    public final Object f25594b;

    public dm0(s4.y yVar) {
        this.f25594b = yVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.f25593a) {
            case 0:
                return;
            default:
                s4.y yVar = (s4.y) this.f25594b;
                p8.b bVar = yVar.I;
                ((GestureDetector) yVar.N.f16011b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.f46063w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.f46063w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.b1 b1Var = yVar.f46058c;
                    if (b1Var != null) {
                        int i10 = 0;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                    if (actionMasked == 6) {
                                        int actionIndex = motionEvent.getActionIndex();
                                        if (motionEvent.getPointerId(actionIndex) == yVar.f46063w) {
                                            if (actionIndex == 0) {
                                                i10 = 1;
                                            }
                                            yVar.f46063w = motionEvent.getPointerId(i10);
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
                        yVar.f46063w = -1;
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
        zl0 zl0Var;
        int findPointerIndex;
        switch (this.f25593a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                im0 im0Var = (im0) this.f25594b;
                Rect rect = im0Var.E1;
                if (im0Var.getScrollState() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((actionMasked == 0 || actionMasked == 5) && im0Var.L1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    im0Var.X0 = false;
                    s4.l0 itemAnimator = im0Var.getItemAnimator();
                    if ((im0Var.f27291i1 || itemAnimator == null || !itemAnimator.k()) && im0Var.E0(y3) && (E = im0Var.E(x10, y3)) != null && im0Var.F0(E)) {
                        im0Var.L1 = E;
                    }
                    if (im0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - im0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - im0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) im0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 >= childAt.getLeft() && x11 <= childAt.getRight() && y10 >= childAt.getTop() && y10 <= childAt.getBottom() && childAt.isClickable()) {
                                    im0Var.L1 = null;
                                } else {
                                    childCount--;
                                }
                            }
                        }
                    }
                    im0Var.M1 = -1;
                    View view = im0Var.L1;
                    if (view != null) {
                        if (im0Var.f27285f1) {
                            im0Var.M1 = RecyclerView.S(view);
                        } else {
                            im0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - im0Var.L1.getLeft(), motionEvent.getY() - im0Var.L1.getTop(), 0);
                        if (im0Var.L1.onTouchEvent(obtain)) {
                            im0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (im0Var.L1 != null && !im0Var.N1) {
                    try {
                        im0Var.K1.k(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && im0Var.L1 != null) {
                        am0 am0Var = im0Var.f27279c1;
                        if (am0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(am0Var);
                            im0Var.f27279c1 = null;
                        }
                        View view2 = im0Var.L1;
                        im0Var.h1(view2, 0.0f, 0.0f, false);
                        im0Var.L1 = null;
                        im0Var.N1 = false;
                        im0Var.k1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (zl0Var = im0Var.W0) != null && im0Var.X0) {
                            zl0Var.h();
                            im0Var.X0 = false;
                        }
                    }
                } else if (!im0Var.N1 && im0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    am0 am0Var2 = new am0(this, x12, y11, 0);
                    im0Var.f27279c1 = am0Var2;
                    AndroidUtilities.runOnUIThread(am0Var2, ViewConfiguration.getTapTimeout());
                    if (im0Var.L1.isEnabled()) {
                        View view3 = im0Var.L1;
                        if (im0Var.H0(view3, x12 - view3.getX(), y11 - im0Var.L1.getY())) {
                            im0Var.i1(im0Var.M1, im0Var.L1);
                            org.telegram.ui.Cells.z zVar = im0Var.B1;
                            if (zVar != null) {
                                Drawable current = zVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (im0Var.V0 == null && im0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                im0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            im0Var.w1();
                        }
                    }
                    rect.setEmpty();
                } else {
                    rect.setEmpty();
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.f25594b;
                ((GestureDetector) yVar.N.f16011b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.f46063w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.f46058c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.f45910a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.b1 b1Var = uVar.e;
                            yVar.d -= uVar.f46035r;
                            yVar.e -= uVar.f46036s;
                            yVar.j(b1Var, true);
                            if (yVar.f46056a.remove(b1Var.f45910a)) {
                                yVar.f46064x.a(yVar.H, b1Var);
                            }
                            yVar.p(b1Var, uVar.f46033f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 != 3 && actionMasked2 != 1) {
                    int i10 = yVar.f46063w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                } else {
                    yVar.f46063w = -1;
                    yVar.p(null, 0);
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar.f46058c != null) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final void c(boolean z10) {
        switch (this.f25593a) {
            case 0:
                ((im0) this.f25594b).I0(true);
                return;
            default:
                if (z10) {
                    ((s4.y) this.f25594b).p(null, 0);
                    return;
                }
                return;
        }
    }

    public dm0(im0 im0Var, Context context) {
        this.f25594b = im0Var;
        le.b bVar = new le.b(context, (u20) new cm0(this));
        im0Var.K1 = bVar;
        ((t20) bVar.f16011b).f30407t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
