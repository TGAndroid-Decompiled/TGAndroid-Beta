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
public final class cq0 extends ns0 {
    public float f32633u3;
    public float f32634v3;
    public final zp0 f32635w3;
    public final aq0 f32636x3;
    public final xs0 f32637y3;

    public cq0(xs0 xs0Var, Context context, zp0 zp0Var, aq0 aq0Var) {
        super(context);
        this.f32637y3 = xs0Var;
        this.f32635w3 = zp0Var;
        this.f32636x3 = aq0Var;
    }

    @Override
    public final boolean A1() {
        return this.f32637y3.f40420q1;
    }

    @Override
    public final boolean B1() {
        return xs0.z0(this.f32637y3.f40424r1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f32635w3.h) {
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
        jr0 jr0Var = this.f32637y3.S;
        if (adapter == jr0Var && jr0Var.f35048e > 0 && i7 == jr0Var.d.size() - 1) {
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
        xs0 xs0Var = this.f32637y3;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40440x1;
        gr0 gr0Var = xs0Var.f40384e0;
        rp0 rp0Var = xs0Var.f40391g0;
        zp0 zp0Var = this.f32635w3;
        if ((adapter == rp0Var || getAdapter() == gr0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (xs0Var.f40420q1) {
                int i11 = xs0Var.f40424r1;
                if (getAdapter() == gr0Var) {
                    i10 = 8;
                } else {
                    i10 = 9;
                }
                if (i11 == i10 && zp0Var.f38110n.getChildCount() > 0 && (childAt2 = zp0Var.f38110n.getChildAt(0)) != null) {
                    zp0Var.f38110n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(xs0Var.f40417p1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != gr0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                boolean z9 = true;
                if (this.f36415n3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f36415n3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.f36415n3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28259z6, this.f36955n2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.f36416o3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z9 = (f2Var == null || !org.telegram.messenger.t3.V(f2Var.getMessagesController().M0(Long.valueOf(-xs0Var.l1)))) ? false : false;
                    if (xs0Var.A0()) {
                        if (z9) {
                            i7 = 2131746632;
                        } else {
                            i7 = 2131746628;
                        }
                    } else {
                        i7 = 2131746627;
                    }
                    this.f36416o3 = new StaticLayout(org.telegram.messenger.hd.M0(i7, null), this.f36415n3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f36417p3 = 0.0f;
                    this.f36418q3 = measuredWidth;
                    for (int i12 = 0; i12 < this.f36416o3.getLineCount(); i12++) {
                        this.f36417p3 = Math.max(this.f36417p3, this.f36416o3.getLineWidth(i12));
                        this.f36418q3 = Math.min(this.f36418q3, this.f36416o3.getLineLeft(i12));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f36417p3) / 2.0f) - this.f36418q3, top - ((this.f36416o3.getHeight() + org.telegram.messenger.g0.L(64.0f)) / 2.0f));
                this.f36416o3.draw(canvas);
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
        if (this.f36419r3 == null) {
            int currentAccount = f2Var.getCurrentAccount();
            di.x9[] x9VarArr = di.x9.f9945f;
            if (x9VarArr[currentAccount] == null) {
                x9VarArr[currentAccount] = new di.x9(currentAccount);
            }
            this.f36419r3 = x9VarArr[currentAccount];
        }
        this.f36419r3.a(this);
        if (!xs0Var.f40420q1) {
            xs0Var.f40424r1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xs0 xs0Var = this.f32637y3;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40440x1;
        if (f2Var != null && f2Var.isInPreviewMode()) {
            this.f32633u3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                xs0Var.f40440x1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f32634v3 - this.f32633u3;
                xs0Var.f40440x1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f32634v3 = this.f32633u3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f32637y3.f40428s1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f32637y3.f40417p1;
    }

    @Override
    public final int getColumnsCount() {
        xs0 xs0Var = this.f32637y3;
        if (xs0.z0(xs0Var.f40424r1)) {
            return xs0Var.f40414o1[1];
        }
        return xs0Var.f40414o1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f32637y3.R1;
    }

    @Override
    public final vi0 getMovingAdapter() {
        xs0 xs0Var = this.f32637y3;
        if (xs0.z0(xs0Var.f40424r1)) {
            return xs0Var.x1(xs0Var.f40424r1);
        }
        return xs0Var.J;
    }

    @Override
    public final vi0 getSupportingAdapter() {
        xs0 xs0Var = this.f32637y3;
        if (xs0.z0(xs0Var.f40424r1)) {
            return xs0Var.y1(xs0Var.f40424r1);
        }
        return xs0Var.K;
    }

    @Override
    public final rr0 getSupportingListView() {
        return this.f32635w3.f38110n;
    }

    @Override
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.f2 f2Var;
        boolean z9 = this.I1;
        xs0 xs0Var = this.f32637y3;
        if (z9 && xs0Var.getSelectedTab() == 11 && (f2Var = xs0Var.f40440x1) != null) {
            org.telegram.messenger.g0.v1(f2Var.getParentActivity().getCurrentFocus());
        }
        xs0Var.S();
        v4.g0 adapter = getAdapter();
        gs0 gs0Var = xs0Var.P;
        if (adapter == gs0Var) {
            ArrayList arrayList = gs0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    arrayList.add(((org.telegram.ui.Cells.q1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.qp.s1(gs0Var.d).l(arrayList, gs0Var.f33995s.l1);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        zp0 zp0Var = this.f32635w3;
        this.f32637y3.O(zp0Var, zp0Var.h, this.f32636x3);
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
        zp0 zp0Var = this.f32635w3;
        if (messageId == zp0Var.I && o7Var.f29661c.I()) {
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
