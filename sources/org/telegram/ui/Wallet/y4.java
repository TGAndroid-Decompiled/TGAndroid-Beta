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
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.v61;
public final class y4 extends v61 {
    public boolean V;
    public final x4 W;
    public final ArrayList f43360a0;
    public final m0 f43361b0;
    public final int f43362c0;
    public final Rect f43363d0;
    public final View[] f43364e0;

    public y4(Context context, org.telegram.ui.ActionBar.f6 f6Var, final ArrayList arrayList, final m0 m0Var, int i7, Rect rect, View[] viewArr) {
        super(context, f6Var);
        this.f43360a0 = arrayList;
        this.f43361b0 = m0Var;
        this.f43362c0 = i7;
        this.f43363d0 = rect;
        this.f43364e0 = viewArr;
        this.W = new ls() {
            @Override
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                int i12;
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = m0Var.f42756c;
                n0[] n0VarArr = n0.O;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                HashMap hashMap = new HashMap();
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    n0.D(identityHashMap, hashMap, i13, (TL_wallet.walletTransaction) arrayList2.get(i13), true);
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
                    ArrayList h02 = n0.h0(wallettransaction);
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
                            n0.D(identityHashMap, hashMap, i12, wallettransaction2, false);
                            arrayList2.set(i12, wallettransaction);
                            n0.D(identityHashMap, hashMap, i12, wallettransaction, true);
                        }
                    } else {
                        arrayList2.add(wallettransaction);
                        n0.D(identityHashMap, hashMap, arrayList2.size() - 1, wallettransaction, true);
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
            view.setTranslationX(f10 - ((2.0f * i7) * this.f43363d0.left));
            if (i7 > 0.0f) {
                measuredWidth = 0.0f;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            view.setPivotX(measuredWidth);
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * i7));
            view.setRotationY(10.0f * i7);
            w6 w6Var = (w6) view.findViewWithTag(w6.class);
            if (w6Var != null) {
                boolean z9 = this.V;
                long nanoTime = System.nanoTime();
                if (!w6Var.S) {
                    w6Var.S = true;
                    w6Var.N = i7;
                    w6Var.R = nanoTime;
                    return;
                }
                float f11 = i7 - w6Var.N;
                w6Var.N = i7;
                if (!z9) {
                    w6Var.Q = 0.0f;
                    w6Var.R = nanoTime;
                } else if (f11 != 0.0f) {
                    float max = Math.max(0.008333334f, Math.min(0.033333335f, ((float) (nanoTime - w6Var.R)) / 1.0E9f));
                    w6Var.R = nanoTime;
                    float f12 = f11 / max;
                    float L = (-(f12 - w6Var.Q)) * org.telegram.messenger.g0.L(140.0f);
                    w6Var.Q = f12;
                    if (w6Var.O == null) {
                        r1.g gVar = new r1.g(w6Var, r1.g.f54157o);
                        w6Var.O = gVar;
                        r1.h hVar = new r1.h(0.0f);
                        hVar.a(0.32f);
                        hVar.b(300.0f);
                        gVar.f54174m = hVar;
                        w6Var.O.b(new q6(w6Var, 1));
                    }
                    float z10 = org.telegram.messenger.camera.q.z(w6Var.P, L, org.telegram.messenger.g0.L(1600.0f), -org.telegram.messenger.g0.L(1600.0f));
                    w6Var.P = z10;
                    r1.g gVar2 = w6Var.O;
                    gVar2.f54164a = z10;
                    gVar2.c(0.0f);
                }
                if (f11 != 0.0f) {
                    w6Var.U = Math.max(-720.0f, Math.min(720.0f, w6Var.U - (f11 * 300.0f)));
                    if (!w6Var.W && w6Var.f43302n) {
                        w6Var.W = true;
                        w6Var.V = 0L;
                        Choreographer.getInstance().postFrameCallback(w6Var.f43286a0);
                    }
                }
            }
        }
    }

    public final void L() {
        if (this.f38888b >= this.f43360a0.size() - 2) {
            m0 m0Var = this.f43361b0;
            if (!m0Var.h) {
                m0Var.h();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f43363d0;
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
        Rect rect = this.f43363d0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f43362c0).c(this.W, qs.f24968b4);
        L();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f43362c0).n(this.W, qs.f24968b4);
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
        cc ccVar = cc.f32506w;
        if (ccVar != null) {
            ccVar.c(0L, false);
        }
    }

    @Override
    public final void w(boolean z9) {
        requestLayout();
        View view = this.f43364e0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
