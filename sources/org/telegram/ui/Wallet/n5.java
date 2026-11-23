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
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.k71;
public final class n5 extends k71 {
    public boolean W;
    public final m5 f44742a0;
    public final ArrayList f44743b0;
    public final u0 f44744c0;
    public final int f44745d0;
    public final Rect f44746e0;
    public final View[] f44747f0;

    public n5(Context context, org.telegram.ui.ActionBar.i6 i6Var, final ArrayList arrayList, final u0 u0Var, int i7, Rect rect, View[] viewArr) {
        super(context, i6Var);
        this.f44743b0 = arrayList;
        this.f44744c0 = u0Var;
        this.f44745d0 = i7;
        this.f44746e0 = rect;
        this.f44747f0 = viewArr;
        this.f44742a0 = new fs() {
            @Override
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                int i12;
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = u0Var.f45215c;
                v0[] v0VarArr = v0.R;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    v0.J(identityHashMap, hashMap, i13, (TL_wallet.walletTransaction) arrayList2.get(i13), true);
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
                    ArrayList s02 = v0.s0(wallettransaction);
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
                            v0.J(identityHashMap, hashMap, i12, wallettransaction2, false);
                            arrayList2.set(i12, wallettransaction);
                            v0.J(identityHashMap, hashMap, i12, wallettransaction, true);
                        }
                    } else {
                        arrayList2.add(wallettransaction);
                        v0.J(identityHashMap, hashMap, arrayList2.size() - 1, wallettransaction, true);
                    }
                }
            }
        };
    }

    @Override
    public final void D(View view, float f10) {
        float measuredWidth;
        view.setTranslationX(f10);
        if (getMeasuredWidth() > 0) {
            float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
            view.setTranslationX(f10 - ((2.0f * i7) * this.f44746e0.left));
            if (i7 > 0.0f) {
                measuredWidth = 0.0f;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            view.setPivotX(measuredWidth);
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * i7));
            view.setRotationY(10.0f * i7);
            n7 n7Var = (n7) view.findViewWithTag(n7.class);
            if (n7Var != null) {
                boolean z10 = this.W;
                long nanoTime = System.nanoTime();
                if (!n7Var.T) {
                    n7Var.T = true;
                    n7Var.O = i7;
                    n7Var.S = nanoTime;
                    return;
                }
                float f11 = i7 - n7Var.O;
                n7Var.O = i7;
                if (!z10) {
                    n7Var.R = 0.0f;
                    n7Var.S = nanoTime;
                } else if (f11 != 0.0f) {
                    float C = a8.p0.C((float) (nanoTime - n7Var.S), 1.0E9f, 0.033333335f, 0.008333334f);
                    n7Var.S = nanoTime;
                    float f12 = f11 / C;
                    float L = (-(f12 - n7Var.R)) * org.telegram.messenger.g0.L(140.0f);
                    n7Var.R = f12;
                    if (n7Var.P == null) {
                        r1.g gVar = new r1.g(n7Var, r1.g.f56429o);
                        n7Var.P = gVar;
                        r1.h hVar = new r1.h(0.0f);
                        hVar.a(0.32f);
                        hVar.b(300.0f);
                        gVar.f56446m = hVar;
                        n7Var.P.b(new h7(n7Var, 1));
                    }
                    float A = m10.A(n7Var.Q, L, org.telegram.messenger.g0.L(1600.0f), -org.telegram.messenger.g0.L(1600.0f));
                    n7Var.Q = A;
                    r1.g gVar2 = n7Var.P;
                    gVar2.f56436a = A;
                    gVar2.c(0.0f);
                }
                if (f11 != 0.0f) {
                    n7Var.V = Math.max(-720.0f, Math.min(720.0f, n7Var.V - (f11 * 300.0f)));
                    if (!n7Var.f44753a0 && n7Var.f44769n) {
                        n7Var.f44753a0 = true;
                        n7Var.W = 0L;
                        Choreographer.getInstance().postFrameCallback(n7Var.f44755b0);
                    }
                }
            }
        }
    }

    public final void J() {
        if (this.f36663b >= this.f44743b0.size() - 2) {
            u0 u0Var = this.f44744c0;
            if (!u0Var.f45221k && !u0Var.h) {
                u0Var.h();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f44746e0;
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
        Rect rect = this.f44746e0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f44745d0).c(this.f44742a0, ks.f25207e4);
        J();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f44745d0).n(this.f44742a0, ks.f25207e4);
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
    public final void q(View view, View view2, int i7, int i10) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        J();
        fc fcVar = fc.f35083w;
        if (fcVar != null) {
            fcVar.c(0L, false);
        }
    }

    @Override
    public final void t(boolean z10) {
        requestLayout();
        View view = this.f44747f0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
