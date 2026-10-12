package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;
public final class ws0 extends nv0 {
    public float f30958o3;
    public float f30959p3;
    public final ts0 f30960q3;
    public final us0 f30961r3;
    public final xv0 f30962s3;

    public ws0(xv0 xv0Var, Context context, ts0 ts0Var, us0 us0Var) {
        super(context);
        this.f30962s3 = xv0Var;
        this.f30960q3 = ts0Var;
        this.f30961r3 = us0Var;
    }

    @Override
    public final boolean A1() {
        return this.f30962s3.f31372o1;
    }

    @Override
    public final boolean B1() {
        return xv0.p0(this.f30962s3.f31374p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f30960q3.h) {
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
            FileLog.e(e);
            return null;
        }
    }

    @Override
    public final Integer W0(int i10) {
        s4.g0 adapter = getAdapter();
        gu0 gu0Var = this.f30962s3.Q;
        if (adapter == gu0Var && gu0Var.e > 0 && i10 == gu0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int i10;
        int i11;
        View childAt2;
        s4.g0 adapter = getAdapter();
        xv0 xv0Var = this.f30962s3;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
        fu0 fu0Var = xv0Var.f31346c0;
        ls0 ls0Var = xv0Var.f31351e0;
        ts0 ts0Var = this.f30960q3;
        if ((adapter == ls0Var || getAdapter() == fu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (xv0Var.f31372o1) {
                int i12 = xv0Var.f31374p1;
                if (getAdapter() == fu0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && ts0Var.f28680r.getChildCount() > 0 && (childAt2 = ts0Var.f28680r.getChildAt(0)) != null) {
                    ts0Var.f28680r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), xv0Var.f31370n1);
                    }
                }
            }
            if (getAdapter() != fu0Var) {
                boolean z10 = true;
                if (this.f27724h3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f27724h3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f27724h3.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, this.f27439n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f27725i3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (m2Var == null || !ChatObject.isChannelAndNotMegaGroup(m2Var.getMessagesController().getChat(Long.valueOf(-xv0Var.f31363j1)))) ? false : false;
                    if (xv0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f27725i3 = new StaticLayout(LocaleController.getString(i10), this.f27724h3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f27726j3 = 0.0f;
                    this.f27727k3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f27725i3.getLineCount(); i13++) {
                        this.f27726j3 = Math.max(this.f27726j3, this.f27725i3.getLineWidth(i13));
                        this.f27727k3 = Math.min(this.f27727k3, this.f27725i3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f27726j3) / 2.0f) - this.f27727k3, top - ((this.f27725i3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f27725i3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ts0Var.K) {
            float f7 = ts0Var.L + 0.010666667f;
            ts0Var.L = f7;
            if (f7 >= 1.0f) {
                ts0Var.L = 0.0f;
                ts0Var.K = false;
                ts0Var.J = 0;
            }
            invalidate();
        }
        if (this.f27728l3 == null) {
            int currentAccount = m2Var.getCurrentAccount();
            bi.ac[] acVarArr = bi.ac.f2840f;
            if (acVarArr[currentAccount] == null) {
                acVarArr[currentAccount] = new bi.ac(currentAccount);
            }
            this.f27728l3 = acVarArr[currentAccount];
        }
        this.f27728l3.a(this);
        if (!xv0Var.f31372o1) {
            xv0Var.f31374p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xv0 xv0Var = this.f30962s3;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
        if (m2Var != null && m2Var.isInPreviewMode()) {
            this.f30958o3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                xv0Var.f31388v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f30959p3 - this.f30958o3;
                xv0Var.f31388v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f30959p3 = this.f30958o3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f30962s3.f31376q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f30962s3.f31370n1;
    }

    @Override
    public final int getColumnsCount() {
        xv0 xv0Var = this.f30962s3;
        if (xv0.p0(xv0Var.f31374p1)) {
            return xv0Var.f31367m1[1];
        }
        return xv0Var.f31367m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f30962s3.O1;
    }

    @Override
    public final ul0 getMovingAdapter() {
        xv0 xv0Var = this.f30962s3;
        if (xv0.p0(xv0Var.f31374p1)) {
            return xv0Var.k1(xv0Var.f31374p1);
        }
        return xv0Var.H;
    }

    @Override
    public final ul0 getSupportingAdapter() {
        xv0 xv0Var = this.f30962s3;
        if (xv0.p0(xv0Var.f31374p1)) {
            return xv0Var.l1(xv0Var.f31374p1);
        }
        return xv0Var.I;
    }

    @Override
    public final pu0 getSupportingListView() {
        return this.f30960q3.f28680r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z10 = this.I1;
        xv0 xv0Var = this.f30962s3;
        if (z10 && xv0Var.getSelectedTab() == 11 && (m2Var = xv0Var.f31388v1) != null) {
            AndroidUtilities.hideKeyboard(m2Var.getParentActivity().getCurrentFocus());
        }
        xv0Var.I();
        s4.g0 adapter = getAdapter();
        ev0 ev0Var = xv0Var.N;
        if (adapter == ev0Var) {
            ArrayList<MessageObject> arrayList = ev0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(ev0Var.d).addToPollsQueue(ev0Var.f24801s.f31363j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ts0 ts0Var = this.f30960q3;
        this.f30962s3.G(ts0Var, ts0Var.h, this.f30961r3);
        if (ts0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View D1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (i10 == 4096) {
            View D12 = D1();
            if (D12 != null && D12.canScrollVertically(1) && D12.performAccessibilityAction(i10, bundle)) {
                return true;
            }
        } else {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (D1 = D1()) != null && D1.canScrollVertically(-1) && D1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    @Override
    public final void z1(org.telegram.ui.Cells.t7 t7Var) {
        float f7;
        int messageId = t7Var.getMessageId();
        ts0 ts0Var = this.f30960q3;
        if (messageId == ts0Var.J && t7Var.f22101c.hasBitmapImage()) {
            if (!ts0Var.K) {
                ts0Var.L = 0.0f;
                ts0Var.K = true;
            }
            float f10 = ts0Var.L;
            if (f10 < 0.3f) {
                f7 = f10 / 0.3f;
            } else if (f10 > 0.7f) {
                f7 = (1.0f - f10) / 0.3f;
            } else {
                f7 = 1.0f;
            }
            t7Var.setHighlightProgress(f7);
            return;
        }
        t7Var.setHighlightProgress(0.0f);
    }
}
