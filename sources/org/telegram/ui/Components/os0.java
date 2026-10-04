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
public final class os0 extends fv0 {
    public final ms0 A3;
    public final pv0 B3;
    public float f29443x3;
    public float y3;
    public final ls0 f29444z3;

    public os0(pv0 pv0Var, Context context, ls0 ls0Var, ms0 ms0Var) {
        super(context);
        this.B3 = pv0Var;
        this.f29444z3 = ls0Var;
        this.A3 = ms0Var;
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t7 t7Var) {
        float f7;
        int messageId = t7Var.getMessageId();
        ls0 ls0Var = this.f29444z3;
        if (messageId == ls0Var.J && t7Var.f23071c.hasBitmapImage()) {
            if (!ls0Var.K) {
                ls0Var.L = 0.0f;
                ls0Var.K = true;
            }
            float f10 = ls0Var.L;
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
        return this.B3.f29784o1;
    }

    @Override
    public final boolean C1() {
        return pv0.p0(this.B3.f29786p1);
    }

    @Override
    public final boolean D1() {
        if (this == this.f29444z3.h) {
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
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    @Override
    public final Integer X0(int i10) {
        s4.h0 adapter = getAdapter();
        yt0 yt0Var = this.B3.Q;
        if (adapter == yt0Var && yt0Var.f33249e > 0 && i10 == yt0Var.d.size() - 1) {
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
        pv0 pv0Var = this.B3;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29800v1;
        xt0 xt0Var = pv0Var.f29757c0;
        cs0 cs0Var = pv0Var.f29763e0;
        ls0 ls0Var = this.f29444z3;
        if ((adapter == cs0Var || getAdapter() == xt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (pv0Var.f29784o1) {
                int i12 = pv0Var.f29786p1;
                if (getAdapter() == xt0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && ls0Var.f27501r.getChildCount() > 0 && (childAt2 = ls0Var.f27501r.getChildAt(0)) != null) {
                    ls0Var.f27501r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), pv0Var.f29782n1);
                    }
                }
            }
            if (getAdapter() != xt0Var) {
                boolean z10 = true;
                if (this.f26574q3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f26574q3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f26574q3.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21223z6, this.f33545p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f26575r3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (n2Var == null || !ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-pv0Var.f29775j1)))) ? false : false;
                    if (pv0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f26575r3 = new StaticLayout(LocaleController.getString(i10), this.f26574q3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f26576s3 = 0.0f;
                    this.f26577t3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f26575r3.getLineCount(); i13++) {
                        this.f26576s3 = Math.max(this.f26576s3, this.f26575r3.getLineWidth(i13));
                        this.f26577t3 = Math.min(this.f26577t3, this.f26575r3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f26576s3) / 2.0f) - this.f26577t3, top - ((this.f26575r3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f26575r3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ls0Var.K) {
            float f7 = ls0Var.L + 0.010666667f;
            ls0Var.L = f7;
            if (f7 >= 1.0f) {
                ls0Var.L = 0.0f;
                ls0Var.K = false;
                ls0Var.J = 0;
            }
            invalidate();
        }
        if (this.f26578u3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f1604f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.f26578u3 = rcVarArr[currentAccount];
        }
        this.f26578u3.a(this);
        if (!pv0Var.f29784o1) {
            pv0Var.f29786p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pv0 pv0Var = this.B3;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29800v1;
        if (n2Var != null && n2Var.isInPreviewMode()) {
            this.f29443x3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                pv0Var.f29800v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.y3 - this.f29443x3;
                pv0Var.f29800v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.y3 = this.f29443x3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.B3.f29788q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.B3.f29782n1;
    }

    @Override
    public final int getColumnsCount() {
        pv0 pv0Var = this.B3;
        if (pv0.p0(pv0Var.f29786p1)) {
            return pv0Var.f29779m1[1];
        }
        return pv0Var.f29779m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.B3.O1;
    }

    @Override
    public final gl0 getMovingAdapter() {
        pv0 pv0Var = this.B3;
        if (pv0.p0(pv0Var.f29786p1)) {
            return pv0Var.k1(pv0Var.f29786p1);
        }
        return pv0Var.H;
    }

    @Override
    public final gl0 getSupportingAdapter() {
        pv0 pv0Var = this.B3;
        if (pv0.p0(pv0Var.f29786p1)) {
            return pv0Var.l1(pv0Var.f29786p1);
        }
        return pv0Var.I;
    }

    @Override
    public final hu0 getSupportingListView() {
        return this.f29444z3.f27501r;
    }

    @Override
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.K1;
        pv0 pv0Var = this.B3;
        if (z10 && pv0Var.getSelectedTab() == 11 && (n2Var = pv0Var.f29800v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        pv0Var.I();
        s4.h0 adapter = getAdapter();
        wu0 wu0Var = pv0Var.N;
        if (adapter == wu0Var) {
            ArrayList<MessageObject> arrayList = wu0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(wu0Var.d).addToPollsQueue(wu0Var.f32627s.f29775j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ls0 ls0Var = this.f29444z3;
        this.B3.G(ls0Var, ls0Var.h, this.A3);
        if (ls0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View E1;
        try {
        } catch (Exception e7) {
            FileLog.e(e7);
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
