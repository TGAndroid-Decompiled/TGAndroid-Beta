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
public final class ks0 extends bv0 {
    public float f25809q3;
    public float f25810r3;
    public final hs0 f25811s3;
    public final is0 f25812t3;
    public final lv0 f25813u3;

    public ks0(lv0 lv0Var, Context context, hs0 hs0Var, is0 is0Var) {
        super(context);
        this.f25813u3 = lv0Var;
        this.f25811s3 = hs0Var;
        this.f25812t3 = is0Var;
    }

    @Override
    public final boolean A1() {
        return lv0.p0(this.f25813u3.f26145p1);
    }

    @Override
    public final boolean B1() {
        if (this == this.f25811s3.h) {
            return true;
        }
        return false;
    }

    public final View C1() {
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
        ut0 ut0Var = this.f25813u3.Q;
        if (adapter == ut0Var && ut0Var.e > 0 && i10 == ut0Var.d.size() - 1) {
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
        lv0 lv0Var = this.f25813u3;
        org.telegram.ui.ActionBar.m2 m2Var = lv0Var.f26159v1;
        tt0 tt0Var = lv0Var.f26117c0;
        yr0 yr0Var = lv0Var.f26122e0;
        hs0 hs0Var = this.f25811s3;
        if ((adapter == yr0Var || getAdapter() == tt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (lv0Var.f26143o1) {
                int i12 = lv0Var.f26145p1;
                if (getAdapter() == tt0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && hs0Var.f24069r.getChildCount() > 0 && (childAt2 = hs0Var.f24069r.getChildAt(0)) != null) {
                    hs0Var.f24069r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), lv0Var.f26141n1);
                    }
                }
            }
            if (getAdapter() != tt0Var) {
                boolean z10 = true;
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19461z6, this.f30704p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f23121k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (m2Var == null || !ChatObject.isChannelAndNotMegaGroup(m2Var.getMessagesController().getChat(Long.valueOf(-lv0Var.f26134j1)))) ? false : false;
                    if (lv0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f23121k3 = new StaticLayout(LocaleController.getString(i10), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f23122l3 = 0.0f;
                    this.f23123m3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f23121k3.getLineCount(); i13++) {
                        this.f23122l3 = Math.max(this.f23122l3, this.f23121k3.getLineWidth(i13));
                        this.f23123m3 = Math.min(this.f23123m3, this.f23121k3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f23122l3) / 2.0f) - this.f23123m3, top - ((this.f23121k3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f23121k3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (hs0Var.K) {
            float f7 = hs0Var.L + 0.010666667f;
            hs0Var.L = f7;
            if (f7 >= 1.0f) {
                hs0Var.L = 0.0f;
                hs0Var.K = false;
                hs0Var.J = 0;
            }
            invalidate();
        }
        if (this.f23124n3 == null) {
            int currentAccount = m2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f1475f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.f23124n3 = rcVarArr[currentAccount];
        }
        this.f23124n3.a(this);
        if (!lv0Var.f26143o1) {
            lv0Var.f26145p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lv0 lv0Var = this.f25813u3;
        org.telegram.ui.ActionBar.m2 m2Var = lv0Var.f26159v1;
        if (m2Var != null && m2Var.isInPreviewMode()) {
            this.f25809q3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                lv0Var.f26159v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f25810r3 - this.f25809q3;
                lv0Var.f26159v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f25810r3 = this.f25809q3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f25813u3.f26147q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f25813u3.f26141n1;
    }

    @Override
    public final int getColumnsCount() {
        lv0 lv0Var = this.f25813u3;
        if (lv0.p0(lv0Var.f26145p1)) {
            return lv0Var.f26138m1[1];
        }
        return lv0Var.f26138m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f25813u3.O1;
    }

    @Override
    public final gl0 getMovingAdapter() {
        lv0 lv0Var = this.f25813u3;
        if (lv0.p0(lv0Var.f26145p1)) {
            return lv0Var.k1(lv0Var.f26145p1);
        }
        return lv0Var.H;
    }

    @Override
    public final gl0 getSupportingAdapter() {
        lv0 lv0Var = this.f25813u3;
        if (lv0.p0(lv0Var.f26145p1)) {
            return lv0Var.l1(lv0Var.f26145p1);
        }
        return lv0Var.I;
    }

    @Override
    public final du0 getSupportingListView() {
        return this.f25811s3.f24069r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z10 = this.K1;
        lv0 lv0Var = this.f25813u3;
        if (z10 && lv0Var.getSelectedTab() == 11 && (m2Var = lv0Var.f26159v1) != null) {
            AndroidUtilities.hideKeyboard(m2Var.getParentActivity().getCurrentFocus());
        }
        lv0Var.I();
        s4.h0 adapter = getAdapter();
        su0 su0Var = lv0Var.N;
        if (adapter == su0Var) {
            ArrayList<MessageObject> arrayList = su0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(su0Var.d).addToPollsQueue(su0Var.f28374s.f26134j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        hs0 hs0Var = this.f25811s3;
        this.f25813u3.G(hs0Var, hs0Var.h, this.f25812t3);
        if (hs0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View C1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (i10 == 4096) {
            View C12 = C1();
            if (C12 != null && C12.canScrollVertically(1) && C12.performAccessibilityAction(i10, bundle)) {
                return true;
            }
        } else {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (C1 = C1()) != null && C1.canScrollVertically(-1) && C1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    @Override
    public final void y1(org.telegram.ui.Cells.t7 t7Var) {
        float f7;
        int messageId = t7Var.getMessageId();
        hs0 hs0Var = this.f25811s3;
        if (messageId == hs0Var.J && t7Var.f21214c.hasBitmapImage()) {
            if (!hs0Var.K) {
                hs0Var.L = 0.0f;
                hs0Var.K = true;
            }
            float f10 = hs0Var.L;
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
    public final boolean z1() {
        return this.f25813u3.f26143o1;
    }
}
