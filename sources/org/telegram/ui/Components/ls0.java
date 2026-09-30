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
public final class ls0 extends cv0 {
    public final js0 A3;
    public final mv0 B3;
    public float f26101x3;
    public float y3;
    public final is0 f26102z3;

    public ls0(mv0 mv0Var, Context context, is0 is0Var, js0 js0Var) {
        super(context);
        this.B3 = mv0Var;
        this.f26102z3 = is0Var;
        this.A3 = js0Var;
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t7 t7Var) {
        float f7;
        int messageId = t7Var.getMessageId();
        is0 is0Var = this.f26102z3;
        if (messageId == is0Var.J && t7Var.f21236c.hasBitmapImage()) {
            if (!is0Var.K) {
                is0Var.L = 0.0f;
                is0Var.K = true;
            }
            float f10 = is0Var.L;
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
    public final boolean B1() {
        return this.B3.f26433o1;
    }

    @Override
    public final boolean C1() {
        return mv0.p0(this.B3.f26435p1);
    }

    @Override
    public final boolean D1() {
        if (this == this.f26102z3.h) {
            return true;
        }
        return false;
    }

    public final View E1() {
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
        vt0 vt0Var = this.B3.Q;
        if (adapter == vt0Var && vt0Var.e > 0 && i10 == vt0Var.d.size() - 1) {
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
        mv0 mv0Var = this.B3;
        org.telegram.ui.ActionBar.m2 m2Var = mv0Var.f26449v1;
        ut0 ut0Var = mv0Var.f26407c0;
        zr0 zr0Var = mv0Var.f26412e0;
        is0 is0Var = this.f26102z3;
        if ((adapter == zr0Var || getAdapter() == ut0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (mv0Var.f26433o1) {
                int i12 = mv0Var.f26435p1;
                if (getAdapter() == ut0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && is0Var.f24356r.getChildCount() > 0 && (childAt2 = is0Var.f24356r.getChildAt(0)) != null) {
                    is0Var.f24356r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), mv0Var.f26431n1);
                    }
                }
            }
            if (getAdapter() != ut0Var) {
                boolean z10 = true;
                if (this.f23435q3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f23435q3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f23435q3.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19478z6, this.f31015p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f23436r3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (m2Var == null || !ChatObject.isChannelAndNotMegaGroup(m2Var.getMessagesController().getChat(Long.valueOf(-mv0Var.f26424j1)))) ? false : false;
                    if (mv0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f23436r3 = new StaticLayout(LocaleController.getString(i10), this.f23435q3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f23437s3 = 0.0f;
                    this.f23438t3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f23436r3.getLineCount(); i13++) {
                        this.f23437s3 = Math.max(this.f23437s3, this.f23436r3.getLineWidth(i13));
                        this.f23438t3 = Math.min(this.f23438t3, this.f23436r3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f23437s3) / 2.0f) - this.f23438t3, top - ((this.f23436r3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f23436r3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (is0Var.K) {
            float f7 = is0Var.L + 0.010666667f;
            is0Var.L = f7;
            if (f7 >= 1.0f) {
                is0Var.L = 0.0f;
                is0Var.K = false;
                is0Var.J = 0;
            }
            invalidate();
        }
        if (this.f23439u3 == null) {
            int currentAccount = m2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f1480f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.f23439u3 = rcVarArr[currentAccount];
        }
        this.f23439u3.a(this);
        if (!mv0Var.f26433o1) {
            mv0Var.f26435p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mv0 mv0Var = this.B3;
        org.telegram.ui.ActionBar.m2 m2Var = mv0Var.f26449v1;
        if (m2Var != null && m2Var.isInPreviewMode()) {
            this.f26101x3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                mv0Var.f26449v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.y3 - this.f26101x3;
                mv0Var.f26449v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.y3 = this.f26101x3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.B3.f26437q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.B3.f26431n1;
    }

    @Override
    public final int getColumnsCount() {
        mv0 mv0Var = this.B3;
        if (mv0.p0(mv0Var.f26435p1)) {
            return mv0Var.f26428m1[1];
        }
        return mv0Var.f26428m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.B3.O1;
    }

    @Override
    public final hl0 getMovingAdapter() {
        mv0 mv0Var = this.B3;
        if (mv0.p0(mv0Var.f26435p1)) {
            return mv0Var.k1(mv0Var.f26435p1);
        }
        return mv0Var.H;
    }

    @Override
    public final hl0 getSupportingAdapter() {
        mv0 mv0Var = this.B3;
        if (mv0.p0(mv0Var.f26435p1)) {
            return mv0Var.l1(mv0Var.f26435p1);
        }
        return mv0Var.I;
    }

    @Override
    public final eu0 getSupportingListView() {
        return this.f26102z3.f24356r;
    }

    @Override
    public final void l0(int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z10 = this.K1;
        mv0 mv0Var = this.B3;
        if (z10 && mv0Var.getSelectedTab() == 11 && (m2Var = mv0Var.f26449v1) != null) {
            AndroidUtilities.hideKeyboard(m2Var.getParentActivity().getCurrentFocus());
        }
        mv0Var.I();
        s4.h0 adapter = getAdapter();
        tu0 tu0Var = mv0Var.N;
        if (adapter == tu0Var) {
            ArrayList<MessageObject> arrayList = tu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(tu0Var.d).addToPollsQueue(tu0Var.f28662s.f26424j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        is0 is0Var = this.f26102z3;
        this.B3.G(is0Var, is0Var.h, this.A3);
        if (is0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View E1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (i10 == 4096) {
            View E12 = E1();
            if (E12 != null && E12.canScrollVertically(1) && E12.performAccessibilityAction(i10, bundle)) {
                return true;
            }
        } else {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (E1 = E1()) != null && E1.canScrollVertically(-1) && E1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }
}
