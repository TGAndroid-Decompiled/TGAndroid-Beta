package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gc;
public final class n5 extends g71 {
    public boolean W;
    public final m5 f44615a0;
    public final ArrayList f44616b0;
    public final t0 f44617c0;
    public final int f44618d0;
    public final Rect f44619e0;
    public final View[] f44620f0;

    public n5(Context context, org.telegram.ui.ActionBar.i6 i6Var, final ArrayList arrayList, final t0 t0Var, int i7, Rect rect, View[] viewArr) {
        super(context, i6Var);
        this.f44616b0 = arrayList;
        this.f44617c0 = t0Var;
        this.f44618d0 = i7;
        this.f44619e0 = rect;
        this.f44620f0 = viewArr;
        this.f44615a0 = new fs() {
            @Override
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                int i12;
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = t0Var.f45043c;
                u0[] u0VarArr = u0.R;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    u0.J(identityHashMap, hashMap, i13, (TL_wallet.walletTransaction) arrayList2.get(i13), true);
                }
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
                    if (treeSet != null && !treeSet.isEmpty()) {
                        i12 = ((Integer) treeSet.first()).intValue();
                    } else {
                        i12 = -1;
                    }
                    ArrayList s02 = u0.s0(wallettransaction);
                    int size2 = s02.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj2 = s02.get(i15);
                        i15++;
                        TreeSet treeSet2 = (TreeSet) hashMap.get((String) obj2);
                        if (treeSet2 != null && !treeSet2.isEmpty()) {
                            int intValue = ((Integer) treeSet2.first()).intValue();
                            if (i12 < 0) {
                                i12 = intValue;
                            } else {
                                i12 = Math.min(i12, intValue);
                            }
                        }
                    }
                    if (i12 >= 0) {
                        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) arrayList2.get(i12);
                        if (wallettransaction2 != wallettransaction) {
                            u0.J(identityHashMap, hashMap, i12, wallettransaction2, false);
                            arrayList2.set(i12, wallettransaction);
                            u0.J(identityHashMap, hashMap, i12, wallettransaction, true);
                        }
                    } else {
                        arrayList2.add(wallettransaction);
                        u0.J(identityHashMap, hashMap, arrayList2.size() - 1, wallettransaction, true);
                    }
                }
            }
        };
    }

    @Override
    public final void B(View view, float f10) {
        float measuredWidth;
        view.setTranslationX(f10);
        if (getMeasuredWidth() > 0) {
            float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
            view.setTranslationX(f10 - ((2.0f * i7) * this.f44619e0.left));
            if (i7 > 0.0f) {
                measuredWidth = 0.0f;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            view.setPivotX(measuredWidth);
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * i7));
            view.setRotationY(10.0f * i7);
            m7 m7Var = (m7) view.findViewWithTag(m7.class);
            if (m7Var != null) {
                boolean z10 = this.W;
                long nanoTime = System.nanoTime();
                if (!m7Var.T) {
                    m7Var.T = true;
                    m7Var.O = i7;
                    m7Var.S = nanoTime;
                    return;
                }
                float f11 = i7 - m7Var.O;
                m7Var.O = i7;
                if (!z10) {
                    m7Var.R = 0.0f;
                    m7Var.S = nanoTime;
                } else if (f11 != 0.0f) {
                    float C = a8.p0.C((float) (nanoTime - m7Var.S), 1.0E9f, 0.033333335f, 0.008333334f);
                    m7Var.S = nanoTime;
                    float f12 = f11 / C;
                    float L = (-(f12 - m7Var.R)) * org.telegram.messenger.g0.L(140.0f);
                    m7Var.R = f12;
                    if (m7Var.P == null) {
                        r1.g gVar = new r1.g(m7Var, r1.g.f56306o);
                        m7Var.P = gVar;
                        r1.h hVar = new r1.h(0.0f);
                        hVar.a(0.32f);
                        hVar.b(300.0f);
                        gVar.f56323m = hVar;
                        m7Var.P.b(new g7(m7Var, 1));
                    }
                    float A = n10.A(m7Var.Q, L, org.telegram.messenger.g0.L(1600.0f), -org.telegram.messenger.g0.L(1600.0f));
                    m7Var.Q = A;
                    r1.g gVar2 = m7Var.P;
                    gVar2.f56313a = A;
                    gVar2.c(0.0f);
                }
                if (f11 != 0.0f) {
                    m7Var.V = Math.max(-720.0f, Math.min(720.0f, m7Var.V - (f11 * 300.0f)));
                    if (!m7Var.f44569a0 && m7Var.f44585n) {
                        m7Var.f44569a0 = true;
                        m7Var.W = 0L;
                        Choreographer.getInstance().postFrameCallback(m7Var.f44571b0);
                    }
                }
            }
        }
    }

    public final void H() {
        if (this.f35376b >= this.f44616b0.size() - 2) {
            t0 t0Var = this.f44617c0;
            if (!t0Var.f45049k && !t0Var.h) {
                t0Var.h();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f44619e0;
        canvas.clipRect(rect.left, -getHeight(), getWidth() - rect.right, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.W = true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.W = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.f44619e0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f44618d0).c(this.f44615a0, ks.f25108e4);
        H();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f44618d0).n(this.f44615a0, ks.f25108e4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = getViewPages()[0];
        if (view != null) {
            view.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            View view2 = getViewPages()[1];
            if (view2 != null && view2.getVisibility() == 0 && getMeasuredWidth() > 0) {
                view2.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = org.telegram.messenger.g0.W1(Utilities.i(Math.abs(view.getTranslationX()) / getAvailableTranslationX(), 1.0f, 0.0f), measuredHeight, view2.getMeasuredHeight());
            }
            i10 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void p(View view, View view2, int i7, int i10) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        H();
        gc gcVar = gc.f35453w;
        if (gcVar != null) {
            gcVar.c(0L, false);
        }
    }

    @Override
    public final void s(boolean z10) {
        requestLayout();
        View view = this.f44620f0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
