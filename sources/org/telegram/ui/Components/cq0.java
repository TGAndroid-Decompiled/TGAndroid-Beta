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
public final class cq0 extends os0 {
    public float f32736u3;
    public float f32737v3;
    public final zp0 f32738w3;
    public final aq0 f32739x3;
    public final ys0 f32740y3;

    public cq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, zp0 zp0Var, aq0 aq0Var) {
        super(context, h6Var);
        this.f32740y3 = ys0Var;
        this.f32738w3 = zp0Var;
        this.f32739x3 = aq0Var;
    }

    @Override
    public final boolean A1() {
        return this.f32740y3.f40699q1;
    }

    @Override
    public final boolean B1() {
        return ys0.z0(this.f32740y3.f40703r1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f32738w3.h) {
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
        v4.g0 adapter = getAdapter();
        kr0 kr0Var = this.f32740y3.S;
        if (adapter == kr0Var && kr0Var.f35420e > 0 && i7 == kr0Var.d.size() - 1) {
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
        v4.g0 adapter = getAdapter();
        ys0 ys0Var = this.f32740y3;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
        hr0 hr0Var = ys0Var.f40663e0;
        rp0 rp0Var = ys0Var.f40670g0;
        zp0 zp0Var = this.f32738w3;
        if ((adapter == rp0Var || getAdapter() == hr0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (ys0Var.f40699q1) {
                int i11 = ys0Var.f40703r1;
                if (getAdapter() == hr0Var) {
                    i10 = 8;
                } else {
                    i10 = 9;
                }
                if (i11 == i10 && zp0Var.f38386n.getChildCount() > 0 && (childAt2 = zp0Var.f38386n.getChildAt(0)) != null) {
                    zp0Var.f38386n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(ys0Var.f40696p1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != hr0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                boolean z9 = true;
                if (this.f36680n3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f36680n3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.f36680n3.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28300z6, this.f36980n2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.f36681o3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z9 = (f2Var == null || !org.telegram.messenger.t3.V(f2Var.getMessagesController().M0(Long.valueOf(-ys0Var.l1)))) ? false : false;
                    if (ys0Var.A0()) {
                        if (z9) {
                            i7 = 2131746633;
                        } else {
                            i7 = 2131746629;
                        }
                    } else {
                        i7 = 2131746628;
                    }
                    this.f36681o3 = new StaticLayout(org.telegram.messenger.id.M0(i7, null), this.f36680n3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f36682p3 = 0.0f;
                    this.f36683q3 = measuredWidth;
                    for (int i12 = 0; i12 < this.f36681o3.getLineCount(); i12++) {
                        this.f36682p3 = Math.max(this.f36682p3, this.f36681o3.getLineWidth(i12));
                        this.f36683q3 = Math.min(this.f36683q3, this.f36681o3.getLineLeft(i12));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f36682p3) / 2.0f) - this.f36683q3, top - ((this.f36681o3.getHeight() + org.telegram.messenger.g0.L(64.0f)) / 2.0f));
                this.f36681o3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (zp0Var.J) {
            float f10 = zp0Var.K + 0.010666667f;
            zp0Var.K = f10;
            if (f10 >= 1.0f) {
                zp0Var.K = 0.0f;
                zp0Var.J = false;
                zp0Var.I = 0;
            }
            invalidate();
        }
        if (this.f36684r3 == null) {
            int currentAccount = f2Var.getCurrentAccount();
            di.y9[] y9VarArr = di.y9.f9981f;
            if (y9VarArr[currentAccount] == null) {
                y9VarArr[currentAccount] = new di.y9(currentAccount);
            }
            this.f36684r3 = y9VarArr[currentAccount];
        }
        this.f36684r3.a(this);
        if (!ys0Var.f40699q1) {
            ys0Var.f40703r1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ys0 ys0Var = this.f32740y3;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
        if (f2Var != null && f2Var.isInPreviewMode()) {
            this.f32736u3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                ys0Var.f40719x1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f32737v3 - this.f32736u3;
                ys0Var.f40719x1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f32737v3 = this.f32736u3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f32740y3.f40707s1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f32740y3.f40696p1;
    }

    @Override
    public final int getColumnsCount() {
        ys0 ys0Var = this.f32740y3;
        if (ys0.z0(ys0Var.f40703r1)) {
            return ys0Var.f40693o1[1];
        }
        return ys0Var.f40693o1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f32740y3.R1;
    }

    @Override
    public final vi0 getMovingAdapter() {
        ys0 ys0Var = this.f32740y3;
        if (ys0.z0(ys0Var.f40703r1)) {
            return ys0Var.z1(ys0Var.f40703r1);
        }
        return ys0Var.J;
    }

    @Override
    public final vi0 getSupportingAdapter() {
        ys0 ys0Var = this.f32740y3;
        if (ys0.z0(ys0Var.f40703r1)) {
            return ys0Var.A1(ys0Var.f40703r1);
        }
        return ys0Var.K;
    }

    @Override
    public final sr0 getSupportingListView() {
        return this.f32738w3.f38386n;
    }

    @Override
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9 = this.I1;
        ys0 ys0Var = this.f32740y3;
        if (z9 && ys0Var.getSelectedTab() == 11 && (f2Var = ys0Var.f40719x1) != null) {
            org.telegram.messenger.g0.v1(f2Var.getParentActivity().getCurrentFocus());
        }
        ys0Var.S();
        v4.g0 adapter = getAdapter();
        hs0 hs0Var = ys0Var.P;
        if (adapter == hs0Var) {
            ArrayList arrayList = hs0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.qp.s1(hs0Var.d).l(arrayList, hs0Var.f34458s.l1);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        zp0 zp0Var = this.f32738w3;
        this.f32740y3.O(zp0Var, zp0Var.h, this.f32739x3);
        if (zp0Var.E == 0) {
            PhotoViewer.p1().r0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cq0.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(org.telegram.ui.Cells.o7 o7Var) {
        float f10;
        int messageId = o7Var.getMessageId();
        zp0 zp0Var = this.f32738w3;
        if (messageId == zp0Var.I && o7Var.f29679c.I()) {
            if (!zp0Var.J) {
                zp0Var.K = 0.0f;
                zp0Var.J = true;
            }
            float f11 = zp0Var.K;
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
