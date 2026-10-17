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
public final class rs0 extends iv0 {
    public float f30034o3;
    public float f30035p3;
    public final os0 f30036q3;
    public final ps0 f30037r3;
    public final sv0 f30038s3;

    public rs0(sv0 sv0Var, Context context, os0 os0Var, ps0 ps0Var) {
        super(context);
        this.f30038s3 = sv0Var;
        this.f30036q3 = os0Var;
        this.f30037r3 = ps0Var;
    }

    @Override
    public final boolean A1() {
        return this.f30038s3.f30372o1;
    }

    @Override
    public final boolean B1() {
        return sv0.q0(this.f30038s3.f30374p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f30036q3.h) {
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
        bu0 bu0Var = this.f30038s3.Q;
        if (adapter == bu0Var && bu0Var.e > 0 && i10 == bu0Var.d.size() - 1) {
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
        sv0 sv0Var = this.f30038s3;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
        au0 au0Var = sv0Var.f30346c0;
        gs0 gs0Var = sv0Var.f30351e0;
        os0 os0Var = this.f30036q3;
        if ((adapter == gs0Var || getAdapter() == au0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (sv0Var.f30372o1) {
                int i12 = sv0Var.f30374p1;
                if (getAdapter() == au0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && os0Var.f28332r.getChildCount() > 0 && (childAt2 = os0Var.f28332r.getChildAt(0)) != null) {
                    os0Var.f28332r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), sv0Var.f30370n1);
                    }
                }
            }
            if (getAdapter() != au0Var) {
                boolean z10 = true;
                if (this.f27360h3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f27360h3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f27360h3.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21391z6, this.f27284n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f27361i3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (n2Var == null || !ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-sv0Var.f30363j1)))) ? false : false;
                    if (sv0Var.r0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f27361i3 = new StaticLayout(LocaleController.getString(i10), this.f27360h3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f27362j3 = 0.0f;
                    this.f27363k3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f27361i3.getLineCount(); i13++) {
                        this.f27362j3 = Math.max(this.f27362j3, this.f27361i3.getLineWidth(i13));
                        this.f27363k3 = Math.min(this.f27363k3, this.f27361i3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f27362j3) / 2.0f) - this.f27363k3, top - ((this.f27361i3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f27361i3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (os0Var.K) {
            float f7 = os0Var.L + 0.010666667f;
            os0Var.L = f7;
            if (f7 >= 1.0f) {
                os0Var.L = 0.0f;
                os0Var.K = false;
                os0Var.J = 0;
            }
            invalidate();
        }
        if (this.f27364l3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ci.ia[] iaVarArr = ci.ia.f5521f;
            if (iaVarArr[currentAccount] == null) {
                iaVarArr[currentAccount] = new ci.ia(currentAccount);
            }
            this.f27364l3 = iaVarArr[currentAccount];
        }
        this.f27364l3.a(this);
        if (!sv0Var.f30372o1) {
            sv0Var.f30374p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sv0 sv0Var = this.f30038s3;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
        if (n2Var != null && n2Var.isInPreviewMode()) {
            this.f30034o3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                sv0Var.f30388v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f30035p3 - this.f30034o3;
                sv0Var.f30388v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f30035p3 = this.f30034o3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f30038s3.f30376q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f30038s3.f30370n1;
    }

    @Override
    public final int getColumnsCount() {
        sv0 sv0Var = this.f30038s3;
        if (sv0.q0(sv0Var.f30374p1)) {
            return sv0Var.f30367m1[1];
        }
        return sv0Var.f30367m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f30038s3.O1;
    }

    @Override
    public final ql0 getMovingAdapter() {
        sv0 sv0Var = this.f30038s3;
        if (sv0.q0(sv0Var.f30374p1)) {
            return sv0Var.m1(sv0Var.f30374p1);
        }
        return sv0Var.H;
    }

    @Override
    public final ql0 getSupportingAdapter() {
        sv0 sv0Var = this.f30038s3;
        if (sv0.q0(sv0Var.f30374p1)) {
            return sv0Var.n1(sv0Var.f30374p1);
        }
        return sv0Var.I;
    }

    @Override
    public final ku0 getSupportingListView() {
        return this.f30036q3.f28332r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.I1;
        sv0 sv0Var = this.f30038s3;
        if (z10 && sv0Var.getSelectedTab() == 11 && (n2Var = sv0Var.f30388v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        sv0Var.I();
        s4.g0 adapter = getAdapter();
        zu0 zu0Var = sv0Var.N;
        if (adapter == zu0Var) {
            ArrayList<MessageObject> arrayList = zu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(zu0Var.d).addToPollsQueue(zu0Var.f33031s.f30363j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        os0 os0Var = this.f30036q3;
        this.f30038s3.G(os0Var, os0Var.h, this.f30037r3);
        if (os0Var.F == 0) {
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
    public final void z1(org.telegram.ui.Cells.s7 s7Var) {
        float f7;
        int messageId = s7Var.getMessageId();
        os0 os0Var = this.f30036q3;
        if (messageId == os0Var.J && s7Var.f23026c.hasBitmapImage()) {
            if (!os0Var.K) {
                os0Var.L = 0.0f;
                os0Var.K = true;
            }
            float f10 = os0Var.L;
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
