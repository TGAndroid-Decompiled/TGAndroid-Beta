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
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.v61;
public final class z4 extends v61 {
    public boolean V;
    public final y4 W;
    public final ArrayList f43439a0;
    public final k0 f43440b0;
    public final int f43441c0;
    public final Rect f43442d0;
    public final View[] f43443e0;

    public z4(Context context, org.telegram.ui.ActionBar.h6 h6Var, final ArrayList arrayList, final k0 k0Var, int i7, Rect rect, View[] viewArr) {
        super(context, h6Var);
        this.f43439a0 = arrayList;
        this.f43440b0 = k0Var;
        this.f43441c0 = i7;
        this.f43442d0 = rect;
        this.f43443e0 = viewArr;
        this.W = new ls() {
            @Override
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                int i12;
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = k0Var.f42699c;
                l0[] l0VarArr = l0.O;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    l0.D(identityHashMap, hashMap, i13, (TL_wallet.walletTransaction) arrayList2.get(i13), true);
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
                    ArrayList h02 = l0.h0(wallettransaction);
                    int size2 = h02.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj2 = h02.get(i15);
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
                            l0.D(identityHashMap, hashMap, i12, wallettransaction2, false);
                            arrayList2.set(i12, wallettransaction);
                            l0.D(identityHashMap, hashMap, i12, wallettransaction, true);
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
    public final void F(View view, float f10) {
        float measuredWidth;
        view.setTranslationX(f10);
        if (getMeasuredWidth() > 0) {
            float i7 = Utilities.i(f10 / getMeasuredWidth(), 1.0f, -1.0f);
            view.setTranslationX(f10 - ((2.0f * i7) * this.f43442d0.left));
            if (i7 > 0.0f) {
                measuredWidth = 0.0f;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            view.setPivotX(measuredWidth);
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * i7));
            view.setRotationY(10.0f * i7);
            x6 x6Var = (x6) view.findViewWithTag(x6.class);
            if (x6Var != null) {
                boolean z9 = this.V;
                long nanoTime = System.nanoTime();
                if (!x6Var.S) {
                    x6Var.S = true;
                    x6Var.N = i7;
                    x6Var.R = nanoTime;
                    return;
                }
                float f11 = i7 - x6Var.N;
                x6Var.N = i7;
                if (!z9) {
                    x6Var.Q = 0.0f;
                    x6Var.R = nanoTime;
                } else if (f11 != 0.0f) {
                    float max = Math.max(0.008333334f, Math.min(0.033333335f, ((float) (nanoTime - x6Var.R)) / 1.0E9f));
                    x6Var.R = nanoTime;
                    float f12 = f11 / max;
                    float L = (-(f12 - x6Var.Q)) * org.telegram.messenger.g0.L(140.0f);
                    x6Var.Q = f12;
                    if (x6Var.O == null) {
                        r1.g gVar = new r1.g(x6Var, r1.g.f54262o);
                        x6Var.O = gVar;
                        r1.h hVar = new r1.h(0.0f);
                        hVar.a(0.32f);
                        hVar.b(300.0f);
                        gVar.f54279m = hVar;
                        x6Var.O.b(new r6(x6Var, 1));
                    }
                    float z10 = org.telegram.messenger.camera.q.z(x6Var.P, L, org.telegram.messenger.g0.L(1600.0f), -org.telegram.messenger.g0.L(1600.0f));
                    x6Var.P = z10;
                    r1.g gVar2 = x6Var.O;
                    gVar2.f54269a = z10;
                    gVar2.c(0.0f);
                }
                if (f11 != 0.0f) {
                    x6Var.U = Math.max(-720.0f, Math.min(720.0f, x6Var.U - (f11 * 300.0f)));
                    if (!x6Var.W && x6Var.f43350n) {
                        x6Var.W = true;
                        x6Var.V = 0L;
                        Choreographer.getInstance().postFrameCallback(x6Var.f43334a0);
                    }
                }
            }
        }
    }

    public final void L() {
        if (this.f38891b >= this.f43439a0.size() - 2) {
            k0 k0Var = this.f43440b0;
            if (!k0Var.h) {
                k0Var.h();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f43442d0;
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
        Rect rect = this.f43442d0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f43441c0).c(this.W, qs.f24981b4);
        L();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f43441c0).n(this.W, qs.f24981b4);
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
    public final void t(View view, View view2, int i7, int i10) {
        requestLayout();
        View childAt = ((FrameLayout) view).getChildAt(0);
        if (childAt != null && (childAt.getTag() instanceof Runnable)) {
            ((Runnable) childAt.getTag()).run();
        }
        L();
        bc bcVar = bc.f32195w;
        if (bcVar != null) {
            bcVar.c(0L, false);
        }
    }

    @Override
    public final void w(boolean z9) {
        requestLayout();
        View view = this.f43443e0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
