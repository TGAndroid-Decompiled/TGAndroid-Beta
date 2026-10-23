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
public final class ts0 extends kv0 {
    public float f30671o3;
    public float f30672p3;
    public final qs0 f30673q3;
    public final rs0 f30674r3;
    public final uv0 f30675s3;

    public ts0(uv0 uv0Var, Context context, qs0 qs0Var, rs0 rs0Var) {
        super(context);
        this.f30675s3 = uv0Var;
        this.f30673q3 = qs0Var;
        this.f30674r3 = rs0Var;
    }

    @Override
    public final boolean A1() {
        return this.f30675s3.f31059o1;
    }

    @Override
    public final boolean B1() {
        return uv0.q0(this.f30675s3.f31061p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f30673q3.h) {
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
        du0 du0Var = this.f30675s3.Q;
        if (adapter == du0Var && du0Var.e > 0 && i10 == du0Var.d.size() - 1) {
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
        uv0 uv0Var = this.f30675s3;
        org.telegram.ui.ActionBar.n2 n2Var = uv0Var.f31075v1;
        cu0 cu0Var = uv0Var.f31033c0;
        is0 is0Var = uv0Var.f31038e0;
        qs0 qs0Var = this.f30673q3;
        if ((adapter == is0Var || getAdapter() == cu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (uv0Var.f31059o1) {
                int i12 = uv0Var.f31061p1;
                if (getAdapter() == cu0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && qs0Var.f28885r.getChildCount() > 0 && (childAt2 = qs0Var.f28885r.getChildAt(0)) != null) {
                    qs0Var.f28885r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), uv0Var.f31057n1);
                    }
                }
            }
            if (getAdapter() != cu0Var) {
                boolean z10 = true;
                if (this.f27962h3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f27962h3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f27962h3.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21399z6, this.f27583n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f27963i3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (n2Var == null || !ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-uv0Var.f31050j1)))) ? false : false;
                    if (uv0Var.r0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f27963i3 = new StaticLayout(LocaleController.getString(i10), this.f27962h3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f27964j3 = 0.0f;
                    this.f27965k3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f27963i3.getLineCount(); i13++) {
                        this.f27964j3 = Math.max(this.f27964j3, this.f27963i3.getLineWidth(i13));
                        this.f27965k3 = Math.min(this.f27965k3, this.f27963i3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f27964j3) / 2.0f) - this.f27965k3, top - ((this.f27963i3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f27963i3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (qs0Var.K) {
            float f7 = qs0Var.L + 0.010666667f;
            qs0Var.L = f7;
            if (f7 >= 1.0f) {
                qs0Var.L = 0.0f;
                qs0Var.K = false;
                qs0Var.J = 0;
            }
            invalidate();
        }
        if (this.f27966l3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ci.ia[] iaVarArr = ci.ia.f5519f;
            if (iaVarArr[currentAccount] == null) {
                iaVarArr[currentAccount] = new ci.ia(currentAccount);
            }
            this.f27966l3 = iaVarArr[currentAccount];
        }
        this.f27966l3.a(this);
        if (!uv0Var.f31059o1) {
            uv0Var.f31061p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        uv0 uv0Var = this.f30675s3;
        org.telegram.ui.ActionBar.n2 n2Var = uv0Var.f31075v1;
        if (n2Var != null && n2Var.isInPreviewMode()) {
            this.f30671o3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                uv0Var.f31075v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f30672p3 - this.f30671o3;
                uv0Var.f31075v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f30672p3 = this.f30671o3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f30675s3.f31063q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f30675s3.f31057n1;
    }

    @Override
    public final int getColumnsCount() {
        uv0 uv0Var = this.f30675s3;
        if (uv0.q0(uv0Var.f31061p1)) {
            return uv0Var.f31054m1[1];
        }
        return uv0Var.f31054m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f30675s3.O1;
    }

    @Override
    public final rl0 getMovingAdapter() {
        uv0 uv0Var = this.f30675s3;
        if (uv0.q0(uv0Var.f31061p1)) {
            return uv0Var.m1(uv0Var.f31061p1);
        }
        return uv0Var.H;
    }

    @Override
    public final rl0 getSupportingAdapter() {
        uv0 uv0Var = this.f30675s3;
        if (uv0.q0(uv0Var.f31061p1)) {
            return uv0Var.n1(uv0Var.f31061p1);
        }
        return uv0Var.I;
    }

    @Override
    public final mu0 getSupportingListView() {
        return this.f30673q3.f28885r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.I1;
        uv0 uv0Var = this.f30675s3;
        if (z10 && uv0Var.getSelectedTab() == 11 && (n2Var = uv0Var.f31075v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        uv0Var.I();
        s4.g0 adapter = getAdapter();
        bv0 bv0Var = uv0Var.N;
        if (adapter == bv0Var) {
            ArrayList<MessageObject> arrayList = bv0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(bv0Var.d).addToPollsQueue(bv0Var.f25049s.f31050j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        qs0 qs0Var = this.f30673q3;
        this.f30675s3.G(qs0Var, qs0Var.h, this.f30674r3);
        if (qs0Var.F == 0) {
            PhotoViewer.u1().z0();
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
        qs0 qs0Var = this.f30673q3;
        if (messageId == qs0Var.J && s7Var.f23031c.hasBitmapImage()) {
            if (!qs0Var.K) {
                qs0Var.L = 0.0f;
                qs0Var.K = true;
            }
            float f10 = qs0Var.L;
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
