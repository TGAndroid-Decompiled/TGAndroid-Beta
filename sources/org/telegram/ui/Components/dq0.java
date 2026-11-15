package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.PhotoViewer;
public final class dq0 extends os0 {
    public float f34034v3;
    public float f34035w3;
    public final aq0 f34036x3;
    public final bq0 f34037y3;
    public final ys0 f34038z3;

    public dq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, aq0 aq0Var, bq0 bq0Var) {
        super(context, e6Var);
        this.f34038z3 = ys0Var;
        this.f34036x3 = aq0Var;
        this.f34037y3 = bq0Var;
    }

    @Override
    public final boolean A1() {
        return this.f34038z3.f42132r1;
    }

    @Override
    public final boolean B1() {
        return ys0.z0(this.f34038z3.f42136s1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f34036x3.h) {
            return true;
        }
        return false;
    }

    public final View D1() {
        try {
            for (ViewParent parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    @Override
    public final Integer V0(int i7) {
        v4.h0 adapter = getAdapter();
        kr0 kr0Var = this.f34038z3.T;
        if (adapter == kr0Var && kr0Var.f36581e > 0 && i7 == kr0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int i7;
        int i10;
        View childAt2;
        v4.h0 adapter = getAdapter();
        ys0 ys0Var = this.f34038z3;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42152y1;
        ir0 ir0Var = ys0Var.f42096f0;
        up0 up0Var = ys0Var.f42102h0;
        aq0 aq0Var = this.f34036x3;
        if ((adapter == up0Var || getAdapter() == ir0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (ys0Var.f42132r1) {
                int i11 = ys0Var.f42136s1;
                if (getAdapter() == ir0Var) {
                    i10 = 8;
                } else {
                    i10 = 9;
                }
                if (i11 == i10 && aq0Var.f39792n.getChildCount() > 0 && (childAt2 = aq0Var.f39792n.getChildAt(0)) != null) {
                    aq0Var.f39792n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(ys0Var.f42128q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != ir0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                boolean z10 = true;
                if (this.f38067o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f38067o3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.f38067o3.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29260z6, this.f40069o2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.f38068p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (e2Var == null || !org.telegram.messenger.t3.V(e2Var.getMessagesController().M0(Long.valueOf(-ys0Var.f42116m1)))) ? false : false;
                    if (ys0Var.A0()) {
                        if (z10) {
                            i7 = 2131746633;
                        } else {
                            i7 = 2131746629;
                        }
                    } else {
                        i7 = 2131746628;
                    }
                    this.f38068p3 = new StaticLayout(org.telegram.messenger.hd.M0(i7, null), this.f38067o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f38069q3 = 0.0f;
                    this.f38070r3 = measuredWidth;
                    for (int i12 = 0; i12 < this.f38068p3.getLineCount(); i12++) {
                        this.f38069q3 = Math.max(this.f38069q3, this.f38068p3.getLineWidth(i12));
                        this.f38070r3 = Math.min(this.f38070r3, this.f38068p3.getLineLeft(i12));
                    }
                }
                canvas.save();
                org.telegram.messenger.i20.j(this.f38068p3.getHeight() + org.telegram.messenger.g0.L(64.0f), 2.0f, top, ((getWidth() - this.f38069q3) / 2.0f) - this.f38070r3, canvas);
                this.f38068p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (aq0Var.K) {
            float f10 = aq0Var.L + 0.010666667f;
            aq0Var.L = f10;
            if (f10 >= 1.0f) {
                aq0Var.L = 0.0f;
                aq0Var.K = false;
                aq0Var.J = 0;
            }
            invalidate();
        }
        if (this.f38071s3 == null) {
            int currentAccount = e2Var.getCurrentAccount();
            fi.q9[] q9VarArr = fi.q9.f12237f;
            if (q9VarArr[currentAccount] == null) {
                q9VarArr[currentAccount] = new fi.q9(currentAccount);
            }
            this.f38071s3 = q9VarArr[currentAccount];
        }
        this.f38071s3.a(this);
        if (!ys0Var.f42132r1) {
            ys0Var.f42136s1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ys0 ys0Var = this.f34038z3;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42152y1;
        if (e2Var != null && e2Var.isInPreviewMode()) {
            this.f34034v3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                ys0Var.f42152y1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f34035w3 - this.f34034v3;
                ys0Var.f42152y1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f34035w3 = this.f34034v3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f34038z3.f42139t1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f34038z3.f42128q1;
    }

    @Override
    public final int getColumnsCount() {
        ys0 ys0Var = this.f34038z3;
        if (ys0.z0(ys0Var.f42136s1)) {
            return ys0Var.f42125p1[1];
        }
        return ys0Var.f42125p1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f34038z3.S1;
    }

    @Override
    public final aj0 getMovingAdapter() {
        ys0 ys0Var = this.f34038z3;
        if (ys0.z0(ys0Var.f42136s1)) {
            return ys0Var.z1(ys0Var.f42136s1);
        }
        return ys0Var.K;
    }

    @Override
    public final aj0 getSupportingAdapter() {
        ys0 ys0Var = this.f34038z3;
        if (ys0.z0(ys0Var.f42136s1)) {
            return ys0Var.A1(ys0Var.f42136s1);
        }
        return ys0Var.L;
    }

    @Override
    public final sr0 getSupportingListView() {
        return this.f34036x3.f39792n;
    }

    @Override
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.e2 e2Var;
        boolean z10 = this.J1;
        ys0 ys0Var = this.f34038z3;
        if (z10 && ys0Var.getSelectedTab() == 11 && (e2Var = ys0Var.f42152y1) != null) {
            org.telegram.messenger.g0.v1(e2Var.getParentActivity().getCurrentFocus());
        }
        ys0Var.S();
        v4.h0 adapter = getAdapter();
        hs0 hs0Var = ys0Var.Q;
        if (adapter == hs0Var) {
            ArrayList arrayList = hs0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.np.s1(hs0Var.d).l(arrayList, hs0Var.f35333s.f42116m1);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        aq0 aq0Var = this.f34036x3;
        this.f34038z3.O(aq0Var, aq0Var.h, this.f34037y3);
        if (aq0Var.F == 0) {
            PhotoViewer.p1().r0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq0.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(org.telegram.ui.Cells.n7 n7Var) {
        float f10;
        int messageId = n7Var.getMessageId();
        aq0 aq0Var = this.f34036x3;
        if (messageId == aq0Var.J && n7Var.f30744c.I()) {
            if (!aq0Var.K) {
                aq0Var.L = 0.0f;
                aq0Var.K = true;
            }
            float f11 = aq0Var.L;
            if (f11 < 0.3f) {
                f10 = f11 / 0.3f;
            } else if (f11 > 0.7f) {
                f10 = (1.0f - f11) / 0.3f;
            } else {
                f10 = 1.0f;
            }
            n7Var.setHighlightProgress(f10);
            return;
        }
        n7Var.setHighlightProgress(0.0f);
    }
}
