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
public final class et0 extends rv0 {
    public float f27927v3;
    public float f27928w3;
    public final bt0 f27929x3;
    public final ct0 y3;
    public final bw0 f27930z3;

    public et0(bw0 bw0Var, Context context, bt0 bt0Var, ct0 ct0Var) {
        super(context);
        this.f27930z3 = bw0Var;
        this.f27929x3 = bt0Var;
        this.y3 = ct0Var;
    }

    @Override
    public final void C1(org.telegram.ui.Cells.w7 w7Var) {
        float f7;
        int messageId = w7Var.getMessageId();
        bt0 bt0Var = this.f27929x3;
        if (messageId == bt0Var.I && w7Var.f25640c.hasBitmapImage()) {
            if (!bt0Var.J) {
                bt0Var.K = 0.0f;
                bt0Var.J = true;
            }
            float f10 = bt0Var.K;
            if (f10 < 0.3f) {
                f7 = f10 / 0.3f;
            } else if (f10 > 0.7f) {
                f7 = (1.0f - f10) / 0.3f;
            } else {
                f7 = 1.0f;
            }
            w7Var.setHighlightProgress(f7);
            return;
        }
        w7Var.setHighlightProgress(0.0f);
    }

    @Override
    public final boolean D1() {
        return this.f27930z3.f26974q1;
    }

    @Override
    public final boolean E1() {
        return bw0.w0(this.f27930z3.f26977r1);
    }

    @Override
    public final boolean F1() {
        if (this == this.f27929x3.h) {
            return true;
        }
        return false;
    }

    public final View G1() {
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
        s4.h0 adapter = getAdapter();
        ku0 ku0Var = this.f27930z3.S;
        if (adapter == ku0Var && ku0Var.e > 0 && i10 == ku0Var.d.size() - 1) {
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
        bw0 bw0Var = this.f27930z3;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
        iu0 iu0Var = bw0Var.f26938e0;
        us0 us0Var = bw0Var.f26945g0;
        bt0 bt0Var = this.f27929x3;
        if ((adapter == us0Var || getAdapter() == iu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (bw0Var.f26974q1) {
                int i12 = bw0Var.f26977r1;
                if (getAdapter() == iu0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && bt0Var.f33468n.getChildCount() > 0 && (childAt2 = bt0Var.f33468n.getChildAt(0)) != null) {
                    bt0Var.f33468n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), bw0Var.f26972p1);
                    }
                }
            }
            if (getAdapter() != iu0Var) {
                boolean z10 = true;
                if (this.f32385o3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f32385o3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f32385o3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23768z6, this.f30988n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f32386p3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (r2Var == null || !ChatObject.isChannelAndNotMegaGroup(r2Var.getMessagesController().getChat(Long.valueOf(-bw0Var.l1)))) ? false : false;
                    if (bw0Var.x0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f32386p3 = new StaticLayout(LocaleController.getString(i10), this.f32385o3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f32387q3 = 0.0f;
                    this.f32388r3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f32386p3.getLineCount(); i13++) {
                        this.f32387q3 = Math.max(this.f32387q3, this.f32386p3.getLineWidth(i13));
                        this.f32388r3 = Math.min(this.f32388r3, this.f32386p3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f32387q3) / 2.0f) - this.f32388r3, top - ((this.f32386p3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f32386p3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (bt0Var.J) {
            float f7 = bt0Var.K + 0.010666667f;
            bt0Var.K = f7;
            if (f7 >= 1.0f) {
                bt0Var.K = 0.0f;
                bt0Var.J = false;
                bt0Var.I = 0;
            }
            invalidate();
        }
        if (this.f32389s3 == null) {
            int currentAccount = r2Var.getCurrentAccount();
            di.ga[] gaVarArr = di.ga.f8598f;
            if (gaVarArr[currentAccount] == null) {
                gaVarArr[currentAccount] = new di.ga(currentAccount);
            }
            this.f32389s3 = gaVarArr[currentAccount];
        }
        this.f32389s3.a(this);
        if (!bw0Var.f26974q1) {
            bw0Var.f26977r1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bw0 bw0Var = this.f27930z3;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
        if (r2Var != null && r2Var.isInPreviewMode()) {
            this.f27927v3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                bw0Var.f26992x1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f27928w3 - this.f27927v3;
                bw0Var.f26992x1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f27928w3 = this.f27927v3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f27930z3.f26980s1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f27930z3.f26972p1;
    }

    @Override
    public final int getColumnsCount() {
        bw0 bw0Var = this.f27930z3;
        if (bw0.w0(bw0Var.f26977r1)) {
            return bw0Var.f26969o1[1];
        }
        return bw0Var.f26969o1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f27930z3.R1;
    }

    @Override
    public final ul0 getMovingAdapter() {
        bw0 bw0Var = this.f27930z3;
        if (bw0.w0(bw0Var.f26977r1)) {
            return bw0Var.t1(bw0Var.f26977r1);
        }
        return bw0Var.J;
    }

    @Override
    public final ul0 getSupportingAdapter() {
        bw0 bw0Var = this.f27930z3;
        if (bw0.w0(bw0Var.f26977r1)) {
            return bw0Var.u1(bw0Var.f26977r1);
        }
        return bw0Var.K;
    }

    @Override
    public final tu0 getSupportingListView() {
        return this.f27929x3.f33468n;
    }

    @Override
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        boolean z10 = this.I1;
        bw0 bw0Var = this.f27930z3;
        if (z10 && bw0Var.getSelectedTab() == 11 && (r2Var = bw0Var.f26992x1) != null) {
            AndroidUtilities.hideKeyboard(r2Var.getParentActivity().getCurrentFocus());
        }
        bw0Var.P();
        s4.h0 adapter = getAdapter();
        jv0 jv0Var = bw0Var.P;
        if (adapter == jv0Var) {
            ArrayList<MessageObject> arrayList = jv0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    arrayList.add(((org.telegram.ui.Cells.s1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(jv0Var.d).addToPollsQueue(jv0Var.f29774s.l1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        bt0 bt0Var = this.f27929x3;
        this.f27930z3.M(bt0Var, bt0Var.h, this.y3);
        if (bt0Var.E == 0) {
            PhotoViewer.v1().z0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View G1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (i10 == 4096) {
            View G12 = G1();
            if (G12 != null && G12.canScrollVertically(1) && G12.performAccessibilityAction(i10, bundle)) {
                return true;
            }
        } else {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (G1 = G1()) != null && G1.canScrollVertically(-1) && G1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }
}
