package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.qc;
public final class n4 extends e91 {
    public boolean T;
    public final m4 U;
    public final l0 V;
    public final ArrayList W;
    public final int f34599a0;
    public final Rect f34600b0;
    public final View[] f34601c0;

    public n4(Context context, org.telegram.ui.ActionBar.d6 d6Var, final l0 l0Var, final ArrayList arrayList, int i10, Rect rect, View[] viewArr) {
        super(context, d6Var);
        this.V = l0Var;
        this.W = arrayList;
        this.f34599a0 = i10;
        this.f34600b0 = rect;
        this.f34601c0 = viewArr;
        this.U = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                ArrayList arrayList2;
                ArrayList arrayList3 = l0.this.f34448c;
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    int i14 = 0;
                    while (true) {
                        arrayList2 = arrayList;
                        if (i14 < arrayList2.size()) {
                            if (arrayList2.get(i14) == wallettransaction || m0.f0((TL_wallet.walletTransaction) arrayList2.get(i14), wallettransaction)) {
                                break;
                            }
                            i14++;
                        } else {
                            arrayList2.add(wallettransaction);
                            break;
                        }
                    }
                    arrayList2.set(i14, wallettransaction);
                }
            }
        };
    }

    @Override
    public final void E(View view, float f7) {
        float measuredWidth;
        view.setTranslationX(f7);
        if (getMeasuredWidth() > 0) {
            float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
            view.setTranslationX(f7 - ((2.0f * clamp) * this.f34600b0.left));
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
                boolean z10 = this.T;
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
                        o1.k kVar = new o1.k(m6Var, o1.h.f17541m);
                        m6Var.O = kVar;
                        o1.l lVar = new o1.l(0.0f);
                        lVar.a(0.32f);
                        lVar.b(300.0f);
                        kVar.f17559u = lVar;
                        m6Var.O.b(new g6(m6Var, 1));
                    }
                    float max2 = Math.max(-AndroidUtilities.dp(1600.0f), Math.min(AndroidUtilities.dp(1600.0f), m6Var.P + dp));
                    m6Var.P = max2;
                    o1.k kVar2 = m6Var.O;
                    kVar2.f17549a = max2;
                    kVar2.g(0.0f);
                }
                if (f10 != 0.0f) {
                    m6Var.U = Math.max(-720.0f, Math.min(720.0f, m6Var.U - (f10 * 300.0f)));
                    if (!m6Var.W && m6Var.f34531n) {
                        m6Var.W = true;
                        m6Var.V = 0L;
                        Choreographer.getInstance().postFrameCallback(m6Var.f34516a0);
                    }
                }
            }
        }
    }

    public final void J() {
        if (this.f25862b >= this.W.size() - 2) {
            l0 l0Var = this.V;
            if (!l0Var.h) {
                l0Var.h();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f34600b0;
        canvas.clipRect(rect.left, -getHeight(), getWidth() - rect.right, getHeight() * 2);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.T = true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.T = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final float getAvailableTranslationX() {
        int measuredWidth = getMeasuredWidth();
        Rect rect = this.f34600b0;
        return Math.max(1, (measuredWidth - rect.left) - rect.right);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f34599a0).addObserver(this.U, NotificationCenter.walletTransactionsUpdate);
        J();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f34599a0).removeObserver(this.U, NotificationCenter.walletTransactionsUpdate);
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
        J();
        qc qcVar = qc.f29523w;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
    }

    @Override
    public final void w(boolean z10) {
        requestLayout();
        View view = this.f34601c0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
