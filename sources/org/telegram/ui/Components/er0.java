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
public final class er0 extends qt0 {
    public float f25916u3;
    public float f25917v3;
    public final br0 f25918w3;
    public final cr0 f25919x3;
    public final au0 y3;

    public er0(au0 au0Var, Context context, br0 br0Var, cr0 cr0Var) {
        super(context);
        this.y3 = au0Var;
        this.f25918w3 = br0Var;
        this.f25919x3 = cr0Var;
    }

    @Override
    public final boolean A1() {
        return this.y3.f24548q1;
    }

    @Override
    public final boolean B1() {
        return au0.y0(this.y3.f24552r1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f25918w3.h) {
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
        ks0 ks0Var = this.y3.S;
        if (adapter == ks0Var && ks0Var.e > 0 && i10 == ks0Var.d.size() - 1) {
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
        au0 au0Var = this.y3;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
        is0 is0Var = au0Var.f24511e0;
        uq0 uq0Var = au0Var.f24518g0;
        br0 br0Var = this.f25918w3;
        if ((adapter == uq0Var || getAdapter() == is0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (au0Var.f24548q1) {
                int i12 = au0Var.f24552r1;
                if (getAdapter() == is0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && br0Var.f30719n.getChildCount() > 0 && (childAt2 = br0Var.f30719n.getChildAt(0)) != null) {
                    br0Var.f30719n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.i0.W1(au0Var.f24545p1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != is0Var && getMeasuredWidth() > org.telegram.messenger.i0.L(60.0f)) {
                boolean z10 = true;
                if (this.f29800n3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f29800n3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
                    this.f29800n3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, this.f31008n2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(60.0f);
                StaticLayout staticLayout = this.f29801o3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (k2Var == null || !org.telegram.messenger.w3.V(k2Var.getMessagesController().L0(Long.valueOf(-au0Var.l1)))) ? false : false;
                    if (au0Var.z0()) {
                        if (z10) {
                            i10 = 2131746648;
                        } else {
                            i10 = 2131746644;
                        }
                    } else {
                        i10 = 2131746643;
                    }
                    this.f29801o3 = new StaticLayout(org.telegram.messenger.dd.L0(i10, null), this.f29800n3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f29802p3 = 0.0f;
                    this.f29803q3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f29801o3.getLineCount(); i13++) {
                        this.f29802p3 = Math.max(this.f29802p3, this.f29801o3.getLineWidth(i13));
                        this.f29803q3 = Math.min(this.f29803q3, this.f29801o3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f29802p3) / 2.0f) - this.f29803q3, top - ((this.f29801o3.getHeight() + org.telegram.messenger.i0.L(64.0f)) / 2.0f));
                this.f29801o3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (br0Var.J) {
            float f7 = br0Var.K + 0.010666667f;
            br0Var.K = f7;
            if (f7 >= 1.0f) {
                br0Var.K = 0.0f;
                br0Var.J = false;
                br0Var.I = 0;
            }
            invalidate();
        }
        if (this.f29804r3 == null) {
            int currentAccount = k2Var.getCurrentAccount();
            th.w7[] w7VarArr = th.w7.f49606f;
            if (w7VarArr[currentAccount] == null) {
                w7VarArr[currentAccount] = new th.w7(currentAccount);
            }
            this.f29804r3 = w7VarArr[currentAccount];
        }
        this.f29804r3.a(this);
        if (!au0Var.f24548q1) {
            au0Var.f24552r1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        au0 au0Var = this.y3;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
        if (k2Var != null && k2Var.isInPreviewMode()) {
            this.f25916u3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                au0Var.f24568x1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f25917v3 - this.f25916u3;
                au0Var.f24568x1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f25917v3 = this.f25916u3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.y3.f24556s1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.y3.f24545p1;
    }

    @Override
    public final int getColumnsCount() {
        au0 au0Var = this.y3;
        if (au0.y0(au0Var.f24552r1)) {
            return au0Var.f24542o1[1];
        }
        return au0Var.f24542o1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.y3.R1;
    }

    @Override
    public final bk0 getMovingAdapter() {
        au0 au0Var = this.y3;
        if (au0.y0(au0Var.f24552r1)) {
            return au0Var.v1(au0Var.f24552r1);
        }
        return au0Var.J;
    }

    @Override
    public final bk0 getSupportingAdapter() {
        au0 au0Var = this.y3;
        if (au0.y0(au0Var.f24552r1)) {
            return au0Var.w1(au0Var.f24552r1);
        }
        return au0Var.K;
    }

    @Override
    public final ss0 getSupportingListView() {
        return this.f25918w3.f30719n;
    }

    @Override
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z10 = this.I1;
        au0 au0Var = this.y3;
        if (z10 && au0Var.getSelectedTab() == 11 && (k2Var = au0Var.f24568x1) != null) {
            org.telegram.messenger.i0.v1(k2Var.getParentActivity().getCurrentFocus());
        }
        au0Var.R();
        s4.g0 adapter = getAdapter();
        ht0 ht0Var = au0Var.P;
        if (adapter == ht0Var) {
            ArrayList arrayList = ht0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.wp.r1(ht0Var.d).l(arrayList, ht0Var.f26919s.l1);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        br0 br0Var = this.f25918w3;
        this.y3.N(br0Var, br0Var.h, this.f25919x3);
        if (br0Var.E == 0) {
            PhotoViewer.v1().z0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.er0.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(org.telegram.ui.Cells.s7 s7Var) {
        float f7;
        int messageId = s7Var.getMessageId();
        br0 br0Var = this.f25918w3;
        if (messageId == br0Var.I && s7Var.f23022c.I()) {
            if (!br0Var.J) {
                br0Var.K = 0.0f;
                br0Var.J = true;
            }
            float f10 = br0Var.K;
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
