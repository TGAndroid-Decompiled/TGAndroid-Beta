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
public final class mq0 extends ys0 {
    public float f37522v3;
    public float f37523w3;
    public final jq0 f37524x3;
    public final kq0 f37525y3;
    public final it0 f37526z3;

    public mq0(it0 it0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, jq0 jq0Var, kq0 kq0Var) {
        super(context, i6Var);
        this.f37526z3 = it0Var;
        this.f37524x3 = jq0Var;
        this.f37525y3 = kq0Var;
    }

    @Override
    public final boolean A1() {
        return this.f37526z3.f36146r1;
    }

    @Override
    public final boolean B1() {
        return it0.z0(this.f37526z3.f36150s1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f37524x3.h) {
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
        tr0 tr0Var = this.f37526z3.T;
        if (adapter == tr0Var && tr0Var.f40138e > 0 && i7 == tr0Var.d.size() - 1) {
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
        it0 it0Var = this.f37526z3;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
        rr0 rr0Var = it0Var.f36110f0;
        dq0 dq0Var = it0Var.f36116h0;
        jq0 jq0Var = this.f37524x3;
        if ((adapter == dq0Var || getAdapter() == rr0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (it0Var.f36146r1) {
                int i11 = it0Var.f36150s1;
                if (getAdapter() == rr0Var) {
                    i10 = 8;
                } else {
                    i10 = 9;
                }
                if (i11 == i10 && jq0Var.f34446n.getChildCount() > 0 && (childAt2 = jq0Var.f34446n.getChildAt(0)) != null) {
                    jq0Var.f34446n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(it0Var.f36142q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != rr0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                boolean z10 = true;
                if (this.f42553o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f42553o3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.f42553o3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29862z6, this.f34767o2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.f42554p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (g2Var == null || !org.telegram.messenger.v3.V(g2Var.getMessagesController().O0(Long.valueOf(-it0Var.f36130m1)))) ? false : false;
                    if (it0Var.A0()) {
                        if (z10) {
                            i7 = 2131746437;
                        } else {
                            i7 = 2131746433;
                        }
                    } else {
                        i7 = 2131746432;
                    }
                    this.f42554p3 = new StaticLayout(org.telegram.messenger.gd.N0(i7, null), this.f42553o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f42555q3 = 0.0f;
                    this.f42556r3 = measuredWidth;
                    for (int i12 = 0; i12 < this.f42554p3.getLineCount(); i12++) {
                        this.f42555q3 = Math.max(this.f42555q3, this.f42554p3.getLineWidth(i12));
                        this.f42556r3 = Math.min(this.f42556r3, this.f42554p3.getLineLeft(i12));
                    }
                }
                canvas.save();
                org.telegram.messenger.m10.k(this.f42554p3.getHeight() + org.telegram.messenger.g0.L(64.0f), 2.0f, top, ((getWidth() - this.f42555q3) / 2.0f) - this.f42556r3, canvas);
                this.f42554p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (jq0Var.K) {
            float f10 = jq0Var.L + 0.010666667f;
            jq0Var.L = f10;
            if (f10 >= 1.0f) {
                jq0Var.L = 0.0f;
                jq0Var.K = false;
                jq0Var.J = 0;
            }
            invalidate();
        }
        if (this.f42557s3 == null) {
            int currentAccount = g2Var.getCurrentAccount();
            fi.n9[] n9VarArr = fi.n9.f12317f;
            if (n9VarArr[currentAccount] == null) {
                n9VarArr[currentAccount] = new fi.n9(currentAccount);
            }
            this.f42557s3 = n9VarArr[currentAccount];
        }
        this.f42557s3.a(this);
        if (!it0Var.f36146r1) {
            it0Var.f36150s1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        it0 it0Var = this.f37526z3;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
        if (g2Var != null && g2Var.isInPreviewMode()) {
            this.f37522v3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                it0Var.f36166y1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f37523w3 - this.f37522v3;
                it0Var.f36166y1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f37523w3 = this.f37522v3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f37526z3.f36153t1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f37526z3.f36142q1;
    }

    @Override
    public final int getColumnsCount() {
        it0 it0Var = this.f37526z3;
        if (it0.z0(it0Var.f36150s1)) {
            return it0Var.f36139p1[1];
        }
        return it0Var.f36139p1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f37526z3.S1;
    }

    @Override
    public final kj0 getMovingAdapter() {
        it0 it0Var = this.f37526z3;
        if (it0.z0(it0Var.f36150s1)) {
            return it0Var.z1(it0Var.f36150s1);
        }
        return it0Var.K;
    }

    @Override
    public final kj0 getSupportingAdapter() {
        it0 it0Var = this.f37526z3;
        if (it0.z0(it0Var.f36150s1)) {
            return it0Var.A1(it0Var.f36150s1);
        }
        return it0Var.L;
    }

    @Override
    public final cs0 getSupportingListView() {
        return this.f37524x3.f34446n;
    }

    @Override
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.g2 g2Var;
        boolean z10 = this.J1;
        it0 it0Var = this.f37526z3;
        if (z10 && it0Var.getSelectedTab() == 11 && (g2Var = it0Var.f36166y1) != null) {
            org.telegram.messenger.g0.v1(g2Var.getParentActivity().getCurrentFocus());
        }
        it0Var.S();
        v4.i0 adapter = getAdapter();
        rs0 rs0Var = it0Var.Q;
        if (adapter == rs0Var) {
            ArrayList arrayList = rs0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    arrayList.add(((org.telegram.ui.Cells.r1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.mp.u1(rs0Var.d).l(arrayList, rs0Var.f39403s.f36130m1);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        jq0 jq0Var = this.f37524x3;
        this.f37526z3.O(jq0Var, jq0Var.h, this.f37525y3);
        if (jq0Var.F == 0) {
            PhotoViewer.p1().r0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mq0.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(org.telegram.ui.Cells.o7 o7Var) {
        float f10;
        int messageId = o7Var.getMessageId();
        jq0 jq0Var = this.f37524x3;
        if (messageId == jq0Var.J && o7Var.f31263c.J()) {
            if (!jq0Var.K) {
                jq0Var.L = 0.0f;
                jq0Var.K = true;
            }
            float f11 = jq0Var.L;
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
