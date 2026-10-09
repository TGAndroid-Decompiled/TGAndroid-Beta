package org.telegram.ui.Wallet;

import android.content.Context;
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
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.tc;
public final class a4 extends o91 {
    public boolean T;
    public final z3 U;
    public final j0 V;
    public final ArrayList W;
    public final int f34614a0;
    public final Rect f34615b0;
    public final View[] f34616c0;

    public a4(Context context, org.telegram.ui.ActionBar.e6 e6Var, final j0 j0Var, final ArrayList arrayList, int i10, Rect rect, View[] viewArr) {
        super(context, e6Var);
        this.V = j0Var;
        this.W = arrayList;
        this.f34614a0 = i10;
        this.f34615b0 = rect;
        this.f34616c0 = viewArr;
        this.U = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                ArrayList arrayList2;
                ArrayList arrayList3 = j0.this.f35061c;
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
                            if (arrayList2.get(i14) == wallettransaction || k0.d0((TL_wallet.walletTransaction) arrayList2.get(i14), wallettransaction)) {
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
            view.setTranslationX(f7 - ((2.0f * clamp) * this.f34615b0.left));
            if (clamp > 0.0f) {
                measuredWidth = 0.0f;
            } else {
                measuredWidth = view.getMeasuredWidth();
            }
            view.setPivotX(measuredWidth);
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * clamp));
            view.setRotationY(10.0f * clamp);
            c6 c6Var = (c6) view.findViewWithTag(c6.class);
            if (c6Var != null) {
                boolean z10 = this.T;
                long nanoTime = System.nanoTime();
                if (!c6Var.S) {
                    c6Var.S = true;
                    c6Var.N = clamp;
                    c6Var.R = nanoTime;
                    return;
                }
                float f10 = clamp - c6Var.N;
                c6Var.N = clamp;
                if (!z10) {
                    c6Var.Q = 0.0f;
                    c6Var.R = nanoTime;
                } else if (f10 != 0.0f) {
                    float max = Math.max(0.008333334f, Math.min(0.033333335f, ((float) (nanoTime - c6Var.R)) / 1.0E9f));
                    c6Var.R = nanoTime;
                    float f11 = f10 / max;
                    float dp = (-(f11 - c6Var.Q)) * AndroidUtilities.dp(140.0f);
                    c6Var.Q = f11;
                    if (c6Var.O == null) {
                        o1.k kVar = new o1.k(c6Var, o1.h.f16919m);
                        c6Var.O = kVar;
                        o1.l lVar = new o1.l(0.0f);
                        lVar.a(0.32f);
                        lVar.b(300.0f);
                        kVar.f16938u = lVar;
                        c6Var.O.b(new w5(c6Var, 1));
                    }
                    float max2 = Math.max(-AndroidUtilities.dp(1600.0f), Math.min(AndroidUtilities.dp(1600.0f), c6Var.P + dp));
                    c6Var.P = max2;
                    o1.k kVar2 = c6Var.O;
                    kVar2.f16927a = max2;
                    kVar2.g(0.0f);
                }
                if (f10 != 0.0f) {
                    c6Var.U = Math.max(-720.0f, Math.min(720.0f, c6Var.U - (f10 * 300.0f)));
                    if (!c6Var.W && c6Var.f34746n) {
                        c6Var.W = true;
                        c6Var.V = 0L;
                        Choreographer.getInstance().postFrameCallback(c6Var.f34730a0);
                    }
                }
            }
        }
    }

    public final void J() {
        if (this.f29427b >= this.W.size() - 2) {
            j0 j0Var = this.V;
            if (!j0Var.f35064g) {
                j0Var.e();
            }
        }
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
        return getMeasuredWidth();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f34614a0).addObserver(this.U, NotificationCenter.walletTransactionsUpdate);
        J();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f34614a0).removeObserver(this.U, NotificationCenter.walletTransactionsUpdate);
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
                measuredHeight = AndroidUtilities.lerp(measuredHeight, view2.getMeasuredHeight(), Utilities.clamp(Math.abs(view.getTranslationX()) / getMeasuredWidth(), 1.0f, 0.0f));
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
        tc tcVar = tc.f31122w;
        if (tcVar != null) {
            tcVar.c(0L, false);
        }
    }

    @Override
    public final void w(boolean z10) {
        requestLayout();
        View view = this.f34616c0[0];
        if (view != null) {
            view.invalidate();
        }
    }
}
