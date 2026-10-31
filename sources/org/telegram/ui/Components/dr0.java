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
public final class dr0 extends pt0 {
    public float f25524u3;
    public float f25525v3;
    public final ar0 f25526w3;
    public final br0 f25527x3;
    public final zt0 y3;

    public dr0(zt0 zt0Var, Context context, ar0 ar0Var, br0 br0Var) {
        super(context);
        this.y3 = zt0Var;
        this.f25526w3 = ar0Var;
        this.f25527x3 = br0Var;
    }

    @Override
    public final boolean A1() {
        return this.y3.f33220q1;
    }

    @Override
    public final boolean B1() {
        return zt0.x0(this.y3.f33224r1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f25526w3.h) {
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return null;
        }
    }

    @Override
    public final Integer V0(int i10) {
        s4.g0 adapter = getAdapter();
        js0 js0Var = this.y3.S;
        if (adapter == js0Var && js0Var.e > 0 && i10 == js0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int i10;
        int i11;
        View childAt2;
        s4.g0 adapter = getAdapter();
        zt0 zt0Var = this.y3;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
        hs0 hs0Var = zt0Var.f33183e0;
        tq0 tq0Var = zt0Var.f33190g0;
        ar0 ar0Var = this.f25526w3;
        if ((adapter == tq0Var || getAdapter() == hs0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (zt0Var.f33220q1) {
                int i12 = zt0Var.f33224r1;
                if (getAdapter() == hs0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && ar0Var.f30352n.getChildCount() > 0 && (childAt2 = ar0Var.f30352n.getChildAt(0)) != null) {
                    ar0Var.f30352n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.i0.W1(zt0Var.f33217p1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != hs0Var && getMeasuredWidth() > org.telegram.messenger.i0.L(60.0f)) {
                boolean z10 = true;
                if (this.f29428n3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f29428n3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
                    this.f29428n3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21330z6, this.f30625n2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(60.0f);
                StaticLayout staticLayout = this.f29429o3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (k2Var == null || !org.telegram.messenger.w3.V(k2Var.getMessagesController().L0(Long.valueOf(-zt0Var.l1)))) ? false : false;
                    if (zt0Var.y0()) {
                        if (z10) {
                            i10 = 2131746648;
                        } else {
                            i10 = 2131746644;
                        }
                    } else {
                        i10 = 2131746643;
                    }
                    this.f29429o3 = new StaticLayout(org.telegram.messenger.cd.L0(i10, null), this.f29428n3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f29430p3 = 0.0f;
                    this.f29431q3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f29429o3.getLineCount(); i13++) {
                        this.f29430p3 = Math.max(this.f29430p3, this.f29429o3.getLineWidth(i13));
                        this.f29431q3 = Math.min(this.f29431q3, this.f29429o3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f29430p3) / 2.0f) - this.f29431q3, top - ((this.f29429o3.getHeight() + org.telegram.messenger.i0.L(64.0f)) / 2.0f));
                this.f29429o3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ar0Var.J) {
            float f7 = ar0Var.K + 0.010666667f;
            ar0Var.K = f7;
            if (f7 >= 1.0f) {
                ar0Var.K = 0.0f;
                ar0Var.J = false;
                ar0Var.I = 0;
            }
            invalidate();
        }
        if (this.f29432r3 == null) {
            int currentAccount = k2Var.getCurrentAccount();
            th.w7[] w7VarArr = th.w7.f49592f;
            if (w7VarArr[currentAccount] == null) {
                w7VarArr[currentAccount] = new th.w7(currentAccount);
            }
            this.f29432r3 = w7VarArr[currentAccount];
        }
        this.f29432r3.a(this);
        if (!zt0Var.f33220q1) {
            zt0Var.f33224r1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zt0 zt0Var = this.y3;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
        if (k2Var != null && k2Var.isInPreviewMode()) {
            this.f25524u3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                zt0Var.f33240x1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f25525v3 - this.f25524u3;
                zt0Var.f33240x1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f25525v3 = this.f25524u3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.y3.f33228s1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.y3.f33217p1;
    }

    @Override
    public final int getColumnsCount() {
        zt0 zt0Var = this.y3;
        if (zt0.x0(zt0Var.f33224r1)) {
            return zt0Var.f33214o1[1];
        }
        return zt0Var.f33214o1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.y3.R1;
    }

    @Override
    public final ak0 getMovingAdapter() {
        zt0 zt0Var = this.y3;
        if (zt0.x0(zt0Var.f33224r1)) {
            return zt0Var.u1(zt0Var.f33224r1);
        }
        return zt0Var.J;
    }

    @Override
    public final ak0 getSupportingAdapter() {
        zt0 zt0Var = this.y3;
        if (zt0.x0(zt0Var.f33224r1)) {
            return zt0Var.v1(zt0Var.f33224r1);
        }
        return zt0Var.K;
    }

    @Override
    public final rs0 getSupportingListView() {
        return this.f25526w3.f30352n;
    }

    @Override
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z10 = this.I1;
        zt0 zt0Var = this.y3;
        if (z10 && zt0Var.getSelectedTab() == 11 && (k2Var = zt0Var.f33240x1) != null) {
            org.telegram.messenger.i0.v1(k2Var.getParentActivity().getCurrentFocus());
        }
        zt0Var.Q();
        s4.g0 adapter = getAdapter();
        gt0 gt0Var = zt0Var.P;
        if (adapter == gt0Var) {
            ArrayList arrayList = gt0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.vp.r1(gt0Var.d).l(arrayList, gt0Var.f26522s.l1);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ar0 ar0Var = this.f25526w3;
        this.y3.N(ar0Var, ar0Var.h, this.f25527x3);
        if (ar0Var.E == 0) {
            PhotoViewer.v1().z0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dr0.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(org.telegram.ui.Cells.s7 s7Var) {
        float f7;
        int messageId = s7Var.getMessageId();
        ar0 ar0Var = this.f25526w3;
        if (messageId == ar0Var.I && s7Var.f23021c.I()) {
            if (!ar0Var.J) {
                ar0Var.K = 0.0f;
                ar0Var.J = true;
            }
            float f10 = ar0Var.K;
            if (f10 < 0.3f) {
                f7 = f10 / 0.3f;
            } else if (f10 > 0.7f) {
                f7 = (1.0f - f10) / 0.3f;
            } else {
                f7 = 1.0f;
            }
            s7Var.setHighlightProgress(f7);
            return;
        }
        s7Var.setHighlightProgress(0.0f);
    }
}
