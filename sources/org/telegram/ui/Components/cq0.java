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
public final class cq0 extends ms0 {
    public float f32819v3;
    public float f32820w3;
    public final zp0 f32821x3;
    public final aq0 f32822y3;
    public final ws0 f32823z3;

    public cq0(ws0 ws0Var, Context context, zp0 zp0Var, aq0 aq0Var) {
        super(context);
        this.f32823z3 = ws0Var;
        this.f32821x3 = zp0Var;
        this.f32822y3 = aq0Var;
    }

    @Override
    public final boolean A1() {
        return this.f32823z3.f40122r1;
    }

    @Override
    public final boolean B1() {
        return ws0.z0(this.f32823z3.f40126s1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f32821x3.h) {
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
    public final Integer V0(int i3) {
        u4.h0 adapter = getAdapter();
        ir0 ir0Var = this.f32823z3.T;
        if (adapter == ir0Var && ir0Var.f34803e > 0 && i3 == ir0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i3);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int i3;
        int i10;
        View childAt2;
        u4.h0 adapter = getAdapter();
        ws0 ws0Var = this.f32823z3;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        gr0 gr0Var = ws0Var.f40086f0;
        rp0 rp0Var = ws0Var.f40092h0;
        zp0 zp0Var = this.f32821x3;
        if ((adapter == rp0Var || getAdapter() == gr0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (ws0Var.f40122r1) {
                int i11 = ws0Var.f40126s1;
                if (getAdapter() == gr0Var) {
                    i10 = 8;
                } else {
                    i10 = 9;
                }
                if (i11 == i10 && zp0Var.f37787n.getChildCount() > 0 && (childAt2 = zp0Var.f37787n.getChildAt(0)) != null) {
                    zp0Var.f37787n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(ws0Var.f40118q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != gr0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                boolean z10 = true;
                if (this.f36243o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f36243o3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.f36243o3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, this.f38460o2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.f36244p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (d2Var == null || !org.telegram.messenger.t3.V(d2Var.getMessagesController().M0(Long.valueOf(-ws0Var.m1)))) ? false : false;
                    if (ws0Var.A0()) {
                        if (z10) {
                            i3 = 2131746641;
                        } else {
                            i3 = 2131746637;
                        }
                    } else {
                        i3 = 2131746636;
                    }
                    this.f36244p3 = new StaticLayout(org.telegram.messenger.bd.M0(i3, null), this.f36243o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f36245q3 = 0.0f;
                    this.f36246r3 = measuredWidth;
                    for (int i12 = 0; i12 < this.f36244p3.getLineCount(); i12++) {
                        this.f36245q3 = Math.max(this.f36245q3, this.f36244p3.getLineWidth(i12));
                        this.f36246r3 = Math.min(this.f36246r3, this.f36244p3.getLineLeft(i12));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f36245q3) / 2.0f) - this.f36246r3, top - ((this.f36244p3.getHeight() + org.telegram.messenger.g0.L(64.0f)) / 2.0f));
                this.f36244p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (zp0Var.K) {
            float f10 = zp0Var.L + 0.010666667f;
            zp0Var.L = f10;
            if (f10 >= 1.0f) {
                zp0Var.L = 0.0f;
                zp0Var.K = false;
                zp0Var.J = 0;
            }
            invalidate();
        }
        if (this.f36247s3 == null) {
            int currentAccount = d2Var.getCurrentAccount();
            ei.z9[] z9VarArr = ei.z9.f11302f;
            if (z9VarArr[currentAccount] == null) {
                z9VarArr[currentAccount] = new ei.z9(currentAccount);
            }
            this.f36247s3 = z9VarArr[currentAccount];
        }
        this.f36247s3.a(this);
        if (!ws0Var.f40122r1) {
            ws0Var.f40126s1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ws0 ws0Var = this.f32823z3;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        if (d2Var != null && d2Var.isInPreviewMode()) {
            this.f32819v3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                ws0Var.f40142y1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f32820w3 - this.f32819v3;
                ws0Var.f40142y1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f32820w3 = this.f32819v3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f32823z3.f40129t1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f32823z3.f40118q1;
    }

    @Override
    public final int getColumnsCount() {
        ws0 ws0Var = this.f32823z3;
        if (ws0.z0(ws0Var.f40126s1)) {
            return ws0Var.f40115p1[1];
        }
        return ws0Var.f40115p1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f32823z3.S1;
    }

    @Override
    public final zi0 getMovingAdapter() {
        ws0 ws0Var = this.f32823z3;
        if (ws0.z0(ws0Var.f40126s1)) {
            return ws0Var.x1(ws0Var.f40126s1);
        }
        return ws0Var.K;
    }

    @Override
    public final zi0 getSupportingAdapter() {
        ws0 ws0Var = this.f32823z3;
        if (ws0.z0(ws0Var.f40126s1)) {
            return ws0Var.y1(ws0Var.f40126s1);
        }
        return ws0Var.L;
    }

    @Override
    public final qr0 getSupportingListView() {
        return this.f32821x3.f37787n;
    }

    @Override
    public final void l0(int i3) {
        org.telegram.ui.ActionBar.d2 d2Var;
        boolean z10 = this.J1;
        ws0 ws0Var = this.f32823z3;
        if (z10 && ws0Var.getSelectedTab() == 11 && (d2Var = ws0Var.f40142y1) != null) {
            org.telegram.messenger.g0.v1(d2Var.getParentActivity().getCurrentFocus());
        }
        ws0Var.S();
        u4.h0 adapter = getAdapter();
        fs0 fs0Var = ws0Var.Q;
        if (adapter == fs0Var) {
            ArrayList arrayList = fs0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.hp.s1(fs0Var.d).l(arrayList, fs0Var.f33864s.m1);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        zp0 zp0Var = this.f32821x3;
        this.f32823z3.O(zp0Var, zp0Var.h, this.f32822y3);
        if (zp0Var.F == 0) {
            PhotoViewer.v1().z0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cq0.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(org.telegram.ui.Cells.n7 n7Var) {
        float f10;
        int messageId = n7Var.getMessageId();
        zp0 zp0Var = this.f32821x3;
        if (messageId == zp0Var.J && n7Var.f29683c.I()) {
            if (!zp0Var.K) {
                zp0Var.L = 0.0f;
                zp0Var.K = true;
            }
            float f11 = zp0Var.L;
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
