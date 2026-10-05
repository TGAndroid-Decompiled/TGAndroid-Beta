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
public final class ps0 extends gv0 {
    public final ns0 A3;
    public final qv0 B3;
    public float f29841x3;
    public float y3;
    public final ms0 f29842z3;

    public ps0(qv0 qv0Var, Context context, ms0 ms0Var, ns0 ns0Var) {
        super(context);
        this.B3 = qv0Var;
        this.f29842z3 = ms0Var;
        this.A3 = ns0Var;
    }

    @Override
    public final boolean A1() {
        return this.B3.f30247o1;
    }

    @Override
    public final boolean B1() {
        return qv0.p0(this.B3.f30249p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f29842z3.h) {
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
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    @Override
    public final Integer W0(int i10) {
        s4.h0 adapter = getAdapter();
        zt0 zt0Var = this.B3.Q;
        if (adapter == zt0Var && zt0Var.f33640e > 0 && i10 == zt0Var.d.size() - 1) {
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
        s4.h0 adapter = getAdapter();
        qv0 qv0Var = this.B3;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.f30263v1;
        yt0 yt0Var = qv0Var.f30220c0;
        ds0 ds0Var = qv0Var.f30226e0;
        ms0 ms0Var = this.f29842z3;
        if ((adapter == ds0Var || getAdapter() == yt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (qv0Var.f30247o1) {
                int i12 = qv0Var.f30249p1;
                if (getAdapter() == yt0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && ms0Var.f27977r.getChildCount() > 0 && (childAt2 = ms0Var.f27977r.getChildAt(0)) != null) {
                    ms0Var.f27977r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), qv0Var.f30245n1);
                    }
                }
            }
            if (getAdapter() != yt0Var) {
                boolean z10 = true;
                if (this.f26983q3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f26983q3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f26983q3.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21233z6, this.f33560p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f26984r3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (n2Var == null || !ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-qv0Var.f30238j1)))) ? false : false;
                    if (qv0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f26984r3 = new StaticLayout(LocaleController.getString(i10), this.f26983q3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f26985s3 = 0.0f;
                    this.f26986t3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f26984r3.getLineCount(); i13++) {
                        this.f26985s3 = Math.max(this.f26985s3, this.f26984r3.getLineWidth(i13));
                        this.f26986t3 = Math.min(this.f26986t3, this.f26984r3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f26985s3) / 2.0f) - this.f26986t3, top - ((this.f26984r3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f26984r3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ms0Var.K) {
            float f7 = ms0Var.L + 0.010666667f;
            ms0Var.L = f7;
            if (f7 >= 1.0f) {
                ms0Var.L = 0.0f;
                ms0Var.K = false;
                ms0Var.J = 0;
            }
            invalidate();
        }
        if (this.f26987u3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f1604f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.f26987u3 = rcVarArr[currentAccount];
        }
        this.f26987u3.a(this);
        if (!qv0Var.f30247o1) {
            qv0Var.f30249p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qv0 qv0Var = this.B3;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.f30263v1;
        if (n2Var != null && n2Var.isInPreviewMode()) {
            this.f29841x3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                qv0Var.f30263v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.y3 - this.f29841x3;
                qv0Var.f30263v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.y3 = this.f29841x3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.B3.f30251q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.B3.f30245n1;
    }

    @Override
    public final int getColumnsCount() {
        qv0 qv0Var = this.B3;
        if (qv0.p0(qv0Var.f30249p1)) {
            return qv0Var.f30242m1[1];
        }
        return qv0Var.f30242m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.B3.O1;
    }

    @Override
    public final gl0 getMovingAdapter() {
        qv0 qv0Var = this.B3;
        if (qv0.p0(qv0Var.f30249p1)) {
            return qv0Var.k1(qv0Var.f30249p1);
        }
        return qv0Var.H;
    }

    @Override
    public final gl0 getSupportingAdapter() {
        qv0 qv0Var = this.B3;
        if (qv0.p0(qv0Var.f30249p1)) {
            return qv0Var.l1(qv0Var.f30249p1);
        }
        return qv0Var.I;
    }

    @Override
    public final iu0 getSupportingListView() {
        return this.f29842z3.f27977r;
    }

    @Override
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.K1;
        qv0 qv0Var = this.B3;
        if (z10 && qv0Var.getSelectedTab() == 11 && (n2Var = qv0Var.f30263v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        qv0Var.I();
        s4.h0 adapter = getAdapter();
        xu0 xu0Var = qv0Var.N;
        if (adapter == xu0Var) {
            ArrayList<MessageObject> arrayList = xu0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(xu0Var.d).addToPollsQueue(xu0Var.f33096s.f30238j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ms0 ms0Var = this.f29842z3;
        this.B3.G(ms0Var, ms0Var.h, this.A3);
        if (ms0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View D1;
        try {
        } catch (Exception e7) {
            FileLog.e(e7);
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
        ms0 ms0Var = this.f29842z3;
        if (messageId == ms0Var.J && t7Var.f23079c.hasBitmapImage()) {
            if (!ms0Var.K) {
                ms0Var.L = 0.0f;
                ms0Var.K = true;
            }
            float f10 = ms0Var.L;
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
