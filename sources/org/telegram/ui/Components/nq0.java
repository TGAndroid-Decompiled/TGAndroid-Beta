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
public final class nq0 extends zs0 {
    public float f37951v3;
    public float f37952w3;
    public final kq0 f37953x3;
    public final lq0 f37954y3;
    public final jt0 f37955z3;

    public nq0(jt0 jt0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, kq0 kq0Var, lq0 lq0Var) {
        super(context, h6Var);
        this.f37955z3 = jt0Var;
        this.f37953x3 = kq0Var;
        this.f37954y3 = lq0Var;
    }

    @Override
    public final boolean A1() {
        return this.f37955z3.f36669r1;
    }

    @Override
    public final boolean B1() {
        return jt0.z0(this.f37955z3.f36673s1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f37953x3.h) {
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
        ur0 ur0Var = this.f37955z3.T;
        if (adapter == ur0Var && ur0Var.f40575e > 0 && i7 == ur0Var.d.size() - 1) {
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
        jt0 jt0Var = this.f37955z3;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36689y1;
        sr0 sr0Var = jt0Var.f36633f0;
        eq0 eq0Var = jt0Var.f36639h0;
        kq0 kq0Var = this.f37953x3;
        if ((adapter == eq0Var || getAdapter() == sr0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (jt0Var.f36669r1) {
                int i11 = jt0Var.f36673s1;
                if (getAdapter() == sr0Var) {
                    i10 = 8;
                } else {
                    i10 = 9;
                }
                if (i11 == i10 && kq0Var.f34566n.getChildCount() > 0 && (childAt2 = kq0Var.f34566n.getChildAt(0)) != null) {
                    kq0Var.f34566n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = org.telegram.messenger.g0.W1(jt0Var.f36665q1, top, childAt2.getTop());
                    }
                }
            }
            if (getAdapter() != sr0Var && getMeasuredWidth() > org.telegram.messenger.g0.L(60.0f)) {
                boolean z10 = true;
                if (this.f42979o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f42979o3 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                    this.f42979o3.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29789z6, this.f34875o2));
                }
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f);
                StaticLayout staticLayout = this.f42980p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (g2Var == null || !org.telegram.messenger.v3.V(g2Var.getMessagesController().O0(Long.valueOf(-jt0Var.f36653m1)))) ? false : false;
                    if (jt0Var.A0()) {
                        if (z10) {
                            i7 = 2131746437;
                        } else {
                            i7 = 2131746433;
                        }
                    } else {
                        i7 = 2131746432;
                    }
                    this.f42980p3 = new StaticLayout(org.telegram.messenger.gd.N0(i7, null), this.f42979o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f42981q3 = 0.0f;
                    this.f42982r3 = measuredWidth;
                    for (int i12 = 0; i12 < this.f42980p3.getLineCount(); i12++) {
                        this.f42981q3 = Math.max(this.f42981q3, this.f42980p3.getLineWidth(i12));
                        this.f42982r3 = Math.min(this.f42982r3, this.f42980p3.getLineLeft(i12));
                    }
                }
                canvas.save();
                org.telegram.messenger.n10.k(this.f42980p3.getHeight() + org.telegram.messenger.g0.L(64.0f), 2.0f, top, ((getWidth() - this.f42981q3) / 2.0f) - this.f42982r3, canvas);
                this.f42980p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (kq0Var.K) {
            float f10 = kq0Var.L + 0.010666667f;
            kq0Var.L = f10;
            if (f10 >= 1.0f) {
                kq0Var.L = 0.0f;
                kq0Var.K = false;
                kq0Var.J = 0;
            }
            invalidate();
        }
        if (this.f42983s3 == null) {
            int currentAccount = g2Var.getCurrentAccount();
            fi.n9[] n9VarArr = fi.n9.f12352f;
            if (n9VarArr[currentAccount] == null) {
                n9VarArr[currentAccount] = new fi.n9(currentAccount);
            }
            this.f42983s3 = n9VarArr[currentAccount];
        }
        this.f42983s3.a(this);
        if (!jt0Var.f36669r1) {
            jt0Var.f36673s1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        jt0 jt0Var = this.f37955z3;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36689y1;
        if (g2Var != null && g2Var.isInPreviewMode()) {
            this.f37951v3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                jt0Var.f36689y1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f37952w3 - this.f37951v3;
                jt0Var.f36689y1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f37952w3 = this.f37951v3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f37955z3.f36676t1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f37955z3.f36665q1;
    }

    @Override
    public final int getColumnsCount() {
        jt0 jt0Var = this.f37955z3;
        if (jt0.z0(jt0Var.f36673s1)) {
            return jt0Var.f36662p1[1];
        }
        return jt0Var.f36662p1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f37955z3.S1;
    }

    @Override
    public final kj0 getMovingAdapter() {
        jt0 jt0Var = this.f37955z3;
        if (jt0.z0(jt0Var.f36673s1)) {
            return jt0Var.z1(jt0Var.f36673s1);
        }
        return jt0Var.K;
    }

    @Override
    public final kj0 getSupportingAdapter() {
        jt0 jt0Var = this.f37955z3;
        if (jt0.z0(jt0Var.f36673s1)) {
            return jt0Var.A1(jt0Var.f36673s1);
        }
        return jt0Var.L;
    }

    @Override
    public final cs0 getSupportingListView() {
        return this.f37953x3.f34566n;
    }

    @Override
    public final void l0(int i7) {
        org.telegram.ui.ActionBar.g2 g2Var;
        boolean z10 = this.J1;
        jt0 jt0Var = this.f37955z3;
        if (z10 && jt0Var.getSelectedTab() == 11 && (g2Var = jt0Var.f36689y1) != null) {
            org.telegram.messenger.g0.v1(g2Var.getParentActivity().getCurrentFocus());
        }
        jt0Var.S();
        v4.i0 adapter = getAdapter();
        ss0 ss0Var = jt0Var.Q;
        if (adapter == ss0Var) {
            ArrayList arrayList = ss0Var.h;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    arrayList.add(((org.telegram.ui.Cells.r1) childAt).getMessageObject());
                }
            }
            org.telegram.messenger.mp.u1(ss0Var.d).l(arrayList, ss0Var.f39693s.f36653m1);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        kq0 kq0Var = this.f37953x3;
        this.f37955z3.O(kq0Var, kq0Var.h, this.f37954y3);
        if (kq0Var.F == 0) {
            PhotoViewer.p1().r0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int r4, android.os.Bundle r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nq0.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    @Override
    public final void z1(org.telegram.ui.Cells.p7 p7Var) {
        float f10;
        int messageId = p7Var.getMessageId();
        kq0 kq0Var = this.f37953x3;
        if (messageId == kq0Var.J && p7Var.f31254c.I()) {
            if (!kq0Var.K) {
                kq0Var.L = 0.0f;
                kq0Var.K = true;
            }
            float f11 = kq0Var.L;
            if (f11 < 0.3f) {
                f10 = f11 / 0.3f;
            } else if (f11 > 0.7f) {
                f10 = (1.0f - f11) / 0.3f;
            } else {
                f10 = 1.0f;
            }
            p7Var.setHighlightProgress(f10);
            return;
        }
        p7Var.setHighlightProgress(0.0f);
    }
}
