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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.v91;
public final class k4 extends v91 {
    public boolean V;
    public final j4 W;
    public final ArrayList f36806a0;
    public final k0 f36807b0;
    public final int f36808c0;
    public final Rect f36809d0;
    public final View[] f36810e0;

    public k4(Context context, org.telegram.ui.ActionBar.u6 u6Var, final ArrayList arrayList, final k0 k0Var, int i10, Rect rect, View[] viewArr) {
        super(context, u6Var);
        this.f36806a0 = arrayList;
        this.f36807b0 = k0Var;
        this.f36808c0 = i10;
        this.f36809d0 = rect;
        this.f36810e0 = viewArr;
        this.W = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                int i13;
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = k0Var.f36789c;
                l0[] l0VarArr = l0.O;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    l0.D(identityHashMap, hashMap, i14, (TL_wallet.walletTransaction) arrayList2.get(i14), true);
                }
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    TreeSet treeSet = (TreeSet) identityHashMap.get(wallettransaction);
                    if (treeSet != null && !treeSet.isEmpty()) {
                        i13 = ((Integer) treeSet.first()).intValue();
                    } else {
                        i13 = -1;
                    }
                    ArrayList h02 = l0.h0(wallettransaction);
                    int size2 = h02.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj2 = h02.get(i16);
                        i16++;
                        TreeSet treeSet2 = (TreeSet) hashMap.get((String) obj2);
                        if (treeSet2 != null && !treeSet2.isEmpty()) {
                            int intValue = ((Integer) treeSet2.first()).intValue();
                            if (i13 < 0) {
                                i13 = intValue;
                            } else {
                                i13 = Math.min(i13, intValue);
                            }
                        }
                    }
                    if (i13 >= 0) {
                        TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) arrayList2.get(i13);
                        if (wallettransaction2 != wallettransaction) {
                            l0.D(identityHashMap, hashMap, i13, wallettransaction2, false);
                            arrayList2.set(i13, wallettransaction);
                            l0.D(identityHashMap, hashMap, i13, wallettransaction, true);
                        }
                    } else {
                        arrayList2.add(wallettransaction);
                        l0.D(identityHashMap, hashMap, arrayList2.size() - 1, wallettransaction, true);
                    }
                }
            }
        };
    }

    @Override
    public final void F(View view, float f7) {
        float measuredWidth;
        view.setTranslationX(f7);
        if (getMeasuredWidth() > 0) {
            float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
            view.setTranslationX(f7 - ((2.0f * clamp) * this.f36809d0.left));
            if (clamp > 0.0f) {
                measuredWidth = 0.0f;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            view.setPivotX(measuredWidth);
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * clamp));
            view.setRotationY(10.0f * clamp);
            m6 m6Var = (m6) view.findViewWithTag(m6.class);
            if (m6Var != null) {
                boolean z10 = this.V;
                long nanoTime = System.nanoTime();
                if (!m6Var.S) {
                    m6Var.S = true;
                    m6Var.N = clamp;
                    m6Var.R = nanoTime;
                    return;
                }
                float f10 = clamp - m6Var.N;
                m6Var.N = clamp;
                if (!z10) {
                    m6Var.Q = 0.0f;
                    m6Var.R = nanoTime;
                } else if (f10 != 0.0f) {
                    float max = Math.max(0.008333334f, Math.min(0.033333335f, ((float) (nanoTime - m6Var.R)) / 1.0E9f));
                    m6Var.R = nanoTime;
                    float f11 = f10 / max;
                    float dp = (-(f11 - m6Var.Q)) * AndroidUtilities.dp(140.0f);
                    m6Var.Q = f11;
                    if (m6Var.O == null) {
                        o1.j jVar = new o1.j(m6Var, o1.h.f18951m);
                        m6Var.O = jVar;
                        o1.k kVar = new o1.k(0.0f);
                        kVar.a(0.32f);
                        kVar.b(300.0f);
                        jVar.f18968u = kVar;
                        m6Var.O.b(new g6(m6Var, 1));
                    }
                    float A = wh.A(m6Var.P, dp, AndroidUtilities.dp(1600.0f), -AndroidUtilities.dp(1600.0f));
                    m6Var.P = A;
                    o1.j jVar2 = m6Var.O;
                    jVar2.f18959a = A;
                    jVar2.g(0.0f);
                }
                if (f10 != 0.0f) {
                    m6Var.U = Math.max(-720.0f, Math.min(720.0f, m6Var.U - (f10 * 300.0f)));
                    if (!m6Var.W && m6Var.f36989n) {
                        m6Var.W = true;
                        m6Var.V = 0L;
                        Choreographer.getInstance().postFrameCallback(m6Var.f36974a0);
                    }
                }
            }
        }
    }

    public final void L() {
        if (this.f33632b >= this.f36806a0.size() - 2) {
            k0 k0Var = this.f36807b0;
            if (!k0Var.h) {
                k0Var.h();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f36809d0;
        canvas.clipRect(rect.left, -getHeight(), getWidth() - rect.right, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.V = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.f36809d0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f36808c0).addWeakObserver(this.W, NotificationCenter.walletTransactionsUpdate);
        L();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f36808c0).removeObserver(this.W, NotificationCenter.walletTransactionsUpdate);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = getViewPages()[0];
        if (view != null) {
            view.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            View view2 = getViewPages()[1];
            if (view2 != null && view2.getVisibility() == 0 && getMeasuredWidth() > 0) {
                view2.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = AndroidUtilities.lerp(measuredHeight, view2.getMeasuredHeight(), Utilities.clamp(Math.abs(view.getTranslationX()) / getAvailableTranslationX(), 1.0f, 0.0f));
            }
            i11 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        L();
        qc qcVar = qc.f31854x;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
    }

    @Override
    public final void w(boolean z10) {
        requestLayout();
        View view = this.f36810e0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
