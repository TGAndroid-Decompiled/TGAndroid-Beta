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
public final class yr0 extends pu0 {
    public float f30311q3;
    public float f30312r3;
    public final vr0 f30313s3;
    public final wr0 f30314t3;
    public final zu0 f30315u3;

    public yr0(zu0 zu0Var, Context context, vr0 vr0Var, wr0 wr0Var) {
        super(context);
        this.f30315u3 = zu0Var;
        this.f30313s3 = vr0Var;
        this.f30314t3 = wr0Var;
    }

    @Override
    public final boolean A1() {
        return this.f30315u3.f30643o1;
    }

    @Override
    public final boolean B1() {
        return zu0.p0(this.f30315u3.f30645p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f30313s3.h) {
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
    public final Integer X0(int i10) {
        s4.h0 adapter = getAdapter();
        it0 it0Var = this.f30315u3.Q;
        if (adapter == it0Var && it0Var.e > 0 && i10 == it0Var.d.size() - 1) {
            return 0;
        }
        return super.X0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int i10;
        int i11;
        View childAt2;
        s4.h0 adapter = getAdapter();
        zu0 zu0Var = this.f30315u3;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
        ht0 ht0Var = zu0Var.f30617c0;
        mr0 mr0Var = zu0Var.f30622e0;
        vr0 vr0Var = this.f30313s3;
        if ((adapter == mr0Var || getAdapter() == ht0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.S(childAt) == 0) {
            int top = childAt.getTop();
            if (zu0Var.f30643o1) {
                int i12 = zu0Var.f30645p1;
                if (getAdapter() == ht0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && vr0Var.f27925r.getChildCount() > 0 && (childAt2 = vr0Var.f27925r.getChildAt(0)) != null) {
                    vr0Var.f27925r.getClass();
                    if (RecyclerView.S(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), zu0Var.f30641n1);
                    }
                }
            }
            if (getAdapter() != ht0Var) {
                boolean z10 = true;
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19264z6, this.f26194p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f27141k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (o2Var == null || !ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(-zu0Var.f30634j1)))) ? false : false;
                    if (zu0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f27141k3 = new StaticLayout(LocaleController.getString(i10), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f27142l3 = 0.0f;
                    this.f27143m3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f27141k3.getLineCount(); i13++) {
                        this.f27142l3 = Math.max(this.f27142l3, this.f27141k3.getLineWidth(i13));
                        this.f27143m3 = Math.min(this.f27143m3, this.f27141k3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f27142l3) / 2.0f) - this.f27143m3, top - ((this.f27141k3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f27141k3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (vr0Var.K) {
            float f7 = vr0Var.L + 0.010666667f;
            vr0Var.L = f7;
            if (f7 >= 1.0f) {
                vr0Var.L = 0.0f;
                vr0Var.K = false;
                vr0Var.J = 0;
            }
            invalidate();
        }
        if (this.f27144n3 == null) {
            int currentAccount = o2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f1486f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.f27144n3 = rcVarArr[currentAccount];
        }
        this.f27144n3.a(this);
        if (!zu0Var.f30643o1) {
            zu0Var.f30645p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zu0 zu0Var = this.f30315u3;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
        if (o2Var != null && o2Var.isInPreviewMode()) {
            this.f30311q3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                zu0Var.f30659v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f30312r3 - this.f30311q3;
                zu0Var.f30659v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f30312r3 = this.f30311q3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f30315u3.f30647q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f30315u3.f30641n1;
    }

    @Override
    public final int getColumnsCount() {
        zu0 zu0Var = this.f30315u3;
        if (zu0.p0(zu0Var.f30645p1)) {
            return zu0Var.f30638m1[1];
        }
        return zu0Var.f30638m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f30315u3.O1;
    }

    @Override
    public final uk0 getMovingAdapter() {
        zu0 zu0Var = this.f30315u3;
        if (zu0.p0(zu0Var.f30645p1)) {
            return zu0Var.k1(zu0Var.f30645p1);
        }
        return zu0Var.H;
    }

    @Override
    public final uk0 getSupportingAdapter() {
        zu0 zu0Var = this.f30315u3;
        if (zu0.p0(zu0Var.f30645p1)) {
            return zu0Var.l1(zu0Var.f30645p1);
        }
        return zu0Var.I;
    }

    @Override
    public final rt0 getSupportingListView() {
        return this.f30313s3.f27925r;
    }

    @Override
    public final void l0(int i10, int i11) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10 = this.K1;
        zu0 zu0Var = this.f30315u3;
        if (z10 && zu0Var.getSelectedTab() == 11 && (o2Var = zu0Var.f30659v1) != null) {
            AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
        }
        zu0Var.I();
        s4.h0 adapter = getAdapter();
        gu0 gu0Var = zu0Var.N;
        if (adapter == gu0Var) {
            ArrayList<MessageObject> arrayList = gu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(gu0Var.d).addToPollsQueue(gu0Var.f24405s.f30634j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        vr0 vr0Var = this.f30313s3;
        this.f30315u3.G(vr0Var, vr0Var.h, this.f30314t3);
        if (vr0Var.F == 0) {
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
        vr0 vr0Var = this.f30313s3;
        if (messageId == vr0Var.J && t7Var.f21386c.hasBitmapImage()) {
            if (!vr0Var.K) {
                vr0Var.L = 0.0f;
                vr0Var.K = true;
            }
            float f10 = vr0Var.L;
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
