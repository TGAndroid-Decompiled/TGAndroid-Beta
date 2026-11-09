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
public final class dq0 extends ps0 {
    public float f33139u3;
    public float f33140v3;
    public final aq0 f33141w3;
    public final bq0 f33142x3;
    public final zs0 f33143y3;

    public dq0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, aq0 aq0Var, bq0 bq0Var) {
        super(context, g6Var);
        this.f33143y3 = zs0Var;
        this.f33141w3 = aq0Var;
        this.f33142x3 = bq0Var;
    }

    @Override
    public final boolean A1() {
        return this.f33143y3.f41107q1;
    }

    @Override
    public final boolean B1() {
        return zs0.z0(this.f33143y3.f41111r1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f33141w3.h) {
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
        lr0 lr0Var = this.f33143y3.S;
        if (adapter == lr0Var && lr0Var.f35828e > 0 && i7 == lr0Var.d.size() - 1) {
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
        zs0 zs0Var = this.f33143y3;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
        ir0 ir0Var = zs0Var.f41071e0;
        sp0 sp0Var = zs0Var.f41078g0;
        aq0 aq0Var = this.f33141w3;
        if ((adapter == sp0Var || getAdapter() == ir0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (zs0Var.f41107q1) {
                int i11 = zs0Var.f41111r1;
                if (getAdapter() == ir0Var) {
                    i10 = 8;
                } else {
                    i10 = 9;
                }
                if (i11 == i10 && aq0Var.f38792n.getChildCount() > 0 && (childAt2 = aq0Var.f38792n.getChildAt(0)) != null) {
                    aq0Var.f38792n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(zs0Var.f41104p1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != ir0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                boolean z9 = true;
                if (this.f37081n3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f37081n3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.f37081n3.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28275z6, this.f37381n2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.f37082o3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z9 = (f2Var == null || !org.telegram.messenger.t3.V(f2Var.getMessagesController().M0(Long.valueOf(-zs0Var.l1)))) ? false : false;
                    if (zs0Var.A0()) {
                        if (z9) {
                            i7 = 2131746633;
                        } else {
                            i7 = 2131746629;
                        }
                    } else {
                        i7 = 2131746628;
                    }
                    this.f37082o3 = new StaticLayout(org.telegram.messenger.id.M0(i7, null), this.f37081n3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f37083p3 = 0.0f;
                    this.f37084q3 = measuredWidth;
                    for (int i12 = 0; i12 < this.f37082o3.getLineCount(); i12++) {
                        this.f37083p3 = Math.max(this.f37083p3, this.f37082o3.getLineWidth(i12));
                        this.f37084q3 = Math.min(this.f37084q3, this.f37082o3.getLineLeft(i12));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f37083p3) / 2.0f) - this.f37084q3, top - ((this.f37082o3.getHeight() + org.telegram.messenger.g0.L(64.0f)) / 2.0f));
                this.f37082o3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (aq0Var.J) {
            float f10 = aq0Var.K + 0.010666667f;
            aq0Var.K = f10;
            if (f10 >= 1.0f) {
                aq0Var.K = 0.0f;
                aq0Var.J = false;
                aq0Var.I = 0;
            }
            invalidate();
        }
        if (this.f37085r3 == null) {
            int currentAccount = f2Var.getCurrentAccount();
            di.y9[] y9VarArr = di.y9.f9976f;
            if (y9VarArr[currentAccount] == null) {
                y9VarArr[currentAccount] = new di.y9(currentAccount);
            }
            this.f37085r3 = y9VarArr[currentAccount];
        }
        this.f37085r3.a(this);
        if (!zs0Var.f41107q1) {
            zs0Var.f41111r1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zs0 zs0Var = this.f33143y3;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
        if (f2Var != null && f2Var.isInPreviewMode()) {
            this.f33139u3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                zs0Var.f41127x1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f33140v3 - this.f33139u3;
                zs0Var.f41127x1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f33140v3 = this.f33139u3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f33143y3.f41115s1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f33143y3.f41104p1;
    }

    @Override
    public final int getColumnsCount() {
        zs0 zs0Var = this.f33143y3;
        if (zs0.z0(zs0Var.f41111r1)) {
            return zs0Var.f41101o1[1];
        }
        return zs0Var.f41101o1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f33143y3.R1;
    }

    @Override
    public final wi0 getMovingAdapter() {
        zs0 zs0Var = this.f33143y3;
        if (zs0.z0(zs0Var.f41111r1)) {
            return zs0Var.z1(zs0Var.f41111r1);
        }
        return zs0Var.J;
    }

    @Override
    public final wi0 getSupportingAdapter() {
        zs0 zs0Var = this.f33143y3;
        if (zs0.z0(zs0Var.f41111r1)) {
            return zs0Var.A1(zs0Var.f41111r1);
        }
        return zs0Var.K;
    }

    @Override
    public final tr0 getSupportingListView() {
        return this.f33141w3.f38792n;
    }

    @Override
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9 = this.I1;
        zs0 zs0Var = this.f33143y3;
        if (z9 && zs0Var.getSelectedTab() == 11 && (f2Var = zs0Var.f41127x1) != null) {
            org.telegram.messenger.g0.v1(f2Var.getParentActivity().getCurrentFocus());
        }
        zs0Var.S();
        v4.g0 adapter = getAdapter();
        is0 is0Var = zs0Var.P;
        if (adapter == is0Var) {
            ArrayList arrayList = is0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.qp.s1(is0Var.d).l(arrayList, is0Var.f34858s.l1);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        aq0 aq0Var = this.f33141w3;
        this.f33143y3.O(aq0Var, aq0Var.h, this.f33142x3);
        if (aq0Var.E == 0) {
            PhotoViewer.p1().r0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq0.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(org.telegram.ui.Cells.o7 o7Var) {
        float f10;
        int messageId = o7Var.getMessageId();
        aq0 aq0Var = this.f33141w3;
        if (messageId == aq0Var.I && o7Var.f29668c.I()) {
            if (!aq0Var.J) {
                aq0Var.K = 0.0f;
                aq0Var.J = true;
            }
            float f11 = aq0Var.K;
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
