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
public final class lq0 extends ws0 {
    public float f37203v3;
    public float f37204w3;
    public final iq0 f37205x3;
    public final jq0 f37206y3;
    public final gt0 f37207z3;

    public lq0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, iq0 iq0Var, jq0 jq0Var) {
        super(context, i6Var);
        this.f37207z3 = gt0Var;
        this.f37205x3 = iq0Var;
        this.f37206y3 = jq0Var;
    }

    @Override
    public final boolean A1() {
        return this.f37207z3.f35622r1;
    }

    @Override
    public final boolean B1() {
        return gt0.z0(this.f37207z3.f35626s1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f37205x3.h) {
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
        v4.i0 adapter = getAdapter();
        sr0 sr0Var = this.f37207z3.T;
        if (adapter == sr0Var && sr0Var.f39832e > 0 && i7 == sr0Var.d.size() - 1) {
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
        v4.i0 adapter = getAdapter();
        gt0 gt0Var = this.f37207z3;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
        qr0 qr0Var = gt0Var.f35586f0;
        cq0 cq0Var = gt0Var.f35592h0;
        iq0 iq0Var = this.f37205x3;
        if ((adapter == cq0Var || getAdapter() == qr0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (gt0Var.f35622r1) {
                int i11 = gt0Var.f35626s1;
                if (getAdapter() == qr0Var) {
                    i10 = 8;
                } else {
                    i10 = 9;
                }
                if (i11 == i10 && iq0Var.f33771n.getChildCount() > 0 && (childAt2 = iq0Var.f33771n.getChildAt(0)) != null) {
                    iq0Var.f33771n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(gt0Var.f35618q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != qr0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                boolean z10 = true;
                if (this.f41779o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f41779o3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.f41779o3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29807z6, this.f34074o2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.f41780p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (h2Var == null || !org.telegram.messenger.v3.V(h2Var.getMessagesController().O0(Long.valueOf(-gt0Var.f35606m1)))) ? false : false;
                    if (gt0Var.A0()) {
                        if (z10) {
                            i7 = 2131746438;
                        } else {
                            i7 = 2131746434;
                        }
                    } else {
                        i7 = 2131746433;
                    }
                    this.f41780p3 = new StaticLayout(org.telegram.messenger.gd.M0(i7, null), this.f41779o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f41781q3 = 0.0f;
                    this.f41782r3 = measuredWidth;
                    for (int i12 = 0; i12 < this.f41780p3.getLineCount(); i12++) {
                        this.f41781q3 = Math.max(this.f41781q3, this.f41780p3.getLineWidth(i12));
                        this.f41782r3 = Math.min(this.f41782r3, this.f41780p3.getLineLeft(i12));
                    }
                }
                canvas.save();
                org.telegram.messenger.n10.k(this.f41780p3.getHeight() + org.telegram.messenger.g0.L(64.0f), 2.0f, top, ((getWidth() - this.f41781q3) / 2.0f) - this.f41782r3, canvas);
                this.f41780p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (iq0Var.K) {
            float f10 = iq0Var.L + 0.010666667f;
            iq0Var.L = f10;
            if (f10 >= 1.0f) {
                iq0Var.L = 0.0f;
                iq0Var.K = false;
                iq0Var.J = 0;
            }
            invalidate();
        }
        if (this.f41783s3 == null) {
            int currentAccount = h2Var.getCurrentAccount();
            fi.n9[] n9VarArr = fi.n9.f12313f;
            if (n9VarArr[currentAccount] == null) {
                n9VarArr[currentAccount] = new fi.n9(currentAccount);
            }
            this.f41783s3 = n9VarArr[currentAccount];
        }
        this.f41783s3.a(this);
        if (!gt0Var.f35622r1) {
            gt0Var.f35626s1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gt0 gt0Var = this.f37207z3;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
        if (h2Var != null && h2Var.isInPreviewMode()) {
            this.f37203v3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                gt0Var.f35642y1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f37204w3 - this.f37203v3;
                gt0Var.f35642y1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f37204w3 = this.f37203v3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f37207z3.f35629t1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f37207z3.f35618q1;
    }

    @Override
    public final int getColumnsCount() {
        gt0 gt0Var = this.f37207z3;
        if (gt0.z0(gt0Var.f35626s1)) {
            return gt0Var.f35615p1[1];
        }
        return gt0Var.f35615p1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f37207z3.S1;
    }

    @Override
    public final ij0 getMovingAdapter() {
        gt0 gt0Var = this.f37207z3;
        if (gt0.z0(gt0Var.f35626s1)) {
            return gt0Var.z1(gt0Var.f35626s1);
        }
        return gt0Var.K;
    }

    @Override
    public final ij0 getSupportingAdapter() {
        gt0 gt0Var = this.f37207z3;
        if (gt0.z0(gt0Var.f35626s1)) {
            return gt0Var.A1(gt0Var.f35626s1);
        }
        return gt0Var.L;
    }

    @Override
    public final as0 getSupportingListView() {
        return this.f37205x3.f33771n;
    }

    @Override
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.h2 h2Var;
        boolean z10 = this.J1;
        gt0 gt0Var = this.f37207z3;
        if (z10 && gt0Var.getSelectedTab() == 11 && (h2Var = gt0Var.f35642y1) != null) {
            org.telegram.messenger.g0.v1(h2Var.getParentActivity().getCurrentFocus());
        }
        gt0Var.S();
        v4.i0 adapter = getAdapter();
        ps0 ps0Var = gt0Var.Q;
        if (adapter == ps0Var) {
            ArrayList arrayList = ps0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.mp.u1(ps0Var.d).l(arrayList, ps0Var.f38548s.f35606m1);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        iq0 iq0Var = this.f37205x3;
        this.f37207z3.O(iq0Var, iq0Var.h, this.f37206y3);
        if (iq0Var.F == 0) {
            PhotoViewer.p1().r0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lq0.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(org.telegram.ui.Cells.o7 o7Var) {
        float f10;
        int messageId = o7Var.getMessageId();
        iq0 iq0Var = this.f37205x3;
        if (messageId == iq0Var.J && o7Var.f31179c.I()) {
            if (!iq0Var.K) {
                iq0Var.L = 0.0f;
                iq0Var.K = true;
            }
            float f11 = iq0Var.L;
            if (f11 < 0.3f) {
                f10 = f11 / 0.3f;
            } else if (f11 > 0.7f) {
                f10 = (1.0f - f11) / 0.3f;
            } else {
                f10 = 1.0f;
            }
            o7Var.setHighlightProgress(f10);
            return;
        }
        o7Var.setHighlightProgress(0.0f);
    }
}
