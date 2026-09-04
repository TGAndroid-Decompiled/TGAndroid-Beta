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
public final class wr0 extends nu0 {
    public float f32324q3;
    public float f32325r3;
    public final tr0 f32326s3;
    public final ur0 f32327t3;
    public final xu0 f32328u3;

    public wr0(xu0 xu0Var, Context context, tr0 tr0Var, ur0 ur0Var) {
        super(context);
        this.f32328u3 = xu0Var;
        this.f32326s3 = tr0Var;
        this.f32327t3 = ur0Var;
    }

    @Override
    public final boolean A1() {
        if (this == this.f32326s3.h) {
            return true;
        }
        return false;
    }

    public final View B1() {
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
    public final Integer V0(int i10) {
        s4.h0 adapter = getAdapter();
        gt0 gt0Var = this.f32328u3.Q;
        if (adapter == gt0Var && gt0Var.f26511e > 0 && i10 == gt0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int i10;
        int i11;
        View childAt2;
        s4.h0 adapter = getAdapter();
        xu0 xu0Var = this.f32328u3;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32726v1;
        ft0 ft0Var = xu0Var.f32683c0;
        kr0 kr0Var = xu0Var.f32689e0;
        tr0 tr0Var = this.f32326s3;
        if ((adapter == kr0Var || getAdapter() == ft0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (xu0Var.f32710o1) {
                int i12 = xu0Var.f32712p1;
                if (getAdapter() == ft0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && tr0Var.f29821r.getChildCount() > 0 && (childAt2 = tr0Var.f29821r.getChildAt(0)) != null) {
                    tr0Var.f29821r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), xu0Var.f32708n1);
                    }
                }
            }
            if (getAdapter() != ft0Var) {
                boolean z10 = true;
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21061z6, this.f28224p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f28873k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (n2Var == null || !ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-xu0Var.f32701j1)))) ? false : false;
                    if (xu0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f28873k3 = new StaticLayout(LocaleController.getString(i10), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f28874l3 = 0.0f;
                    this.f28875m3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f28873k3.getLineCount(); i13++) {
                        this.f28874l3 = Math.max(this.f28874l3, this.f28873k3.getLineWidth(i13));
                        this.f28875m3 = Math.min(this.f28875m3, this.f28873k3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f28874l3) / 2.0f) - this.f28875m3, top - ((this.f28873k3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f28873k3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (tr0Var.K) {
            float f7 = tr0Var.L + 0.010666667f;
            tr0Var.L = f7;
            if (f7 >= 1.0f) {
                tr0Var.L = 0.0f;
                tr0Var.K = false;
                tr0Var.J = 0;
            }
            invalidate();
        }
        if (this.f28876n3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            bi.xb[] xbVarArr = bi.xb.f4001f;
            if (xbVarArr[currentAccount] == null) {
                xbVarArr[currentAccount] = new bi.xb(currentAccount);
            }
            this.f28876n3 = xbVarArr[currentAccount];
        }
        this.f28876n3.a(this);
        if (!xu0Var.f32710o1) {
            xu0Var.f32712p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xu0 xu0Var = this.f32328u3;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32726v1;
        if (n2Var != null && n2Var.isInPreviewMode()) {
            this.f32324q3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                xu0Var.f32726v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f32325r3 - this.f32324q3;
                xu0Var.f32726v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f32325r3 = this.f32324q3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f32328u3.f32714q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f32328u3.f32708n1;
    }

    @Override
    public final int getColumnsCount() {
        xu0 xu0Var = this.f32328u3;
        if (xu0.p0(xu0Var.f32712p1)) {
            return xu0Var.f32705m1[1];
        }
        return xu0Var.f32705m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f32328u3.O1;
    }

    @Override
    public final tk0 getMovingAdapter() {
        xu0 xu0Var = this.f32328u3;
        if (xu0.p0(xu0Var.f32712p1)) {
            return xu0Var.k1(xu0Var.f32712p1);
        }
        return xu0Var.H;
    }

    @Override
    public final tk0 getSupportingAdapter() {
        xu0 xu0Var = this.f32328u3;
        if (xu0.p0(xu0Var.f32712p1)) {
            return xu0Var.l1(xu0Var.f32712p1);
        }
        return xu0Var.I;
    }

    @Override
    public final pt0 getSupportingListView() {
        return this.f32326s3.f29821r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.K1;
        xu0 xu0Var = this.f32328u3;
        if (z10 && xu0Var.getSelectedTab() == 11 && (n2Var = xu0Var.f32726v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        xu0Var.I();
        s4.h0 adapter = getAdapter();
        eu0 eu0Var = xu0Var.N;
        if (adapter == eu0Var) {
            ArrayList<MessageObject> arrayList = eu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(eu0Var.d).addToPollsQueue(eu0Var.f25791s.f32701j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        tr0 tr0Var = this.f32326s3;
        this.f32328u3.G(tr0Var, tr0Var.h, this.f32327t3);
        if (tr0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View B1;
        try {
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (i10 == 4096) {
            View B12 = B1();
            if (B12 != null && B12.canScrollVertically(1) && B12.performAccessibilityAction(i10, bundle)) {
                return true;
            }
        } else {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (B1 = B1()) != null && B1.canScrollVertically(-1) && B1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    @Override
    public final void x1(org.telegram.ui.Cells.t7 t7Var) {
        float f7;
        int messageId = t7Var.getMessageId();
        tr0 tr0Var = this.f32326s3;
        if (messageId == tr0Var.J && t7Var.f23262c.hasBitmapImage()) {
            if (!tr0Var.K) {
                tr0Var.L = 0.0f;
                tr0Var.K = true;
            }
            float f10 = tr0Var.L;
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

    @Override
    public final boolean y1() {
        return this.f32328u3.f32710o1;
    }

    @Override
    public final boolean z1() {
        return xu0.p0(this.f32328u3.f32712p1);
    }
}
