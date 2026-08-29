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
public final class or0 extends gu0 {
    public float f31464m3;
    public float f31465n3;
    public final lr0 f31466o3;
    public final mr0 f31467p3;
    public final qu0 f31468q3;

    public or0(qu0 qu0Var, Context context, lr0 lr0Var, mr0 mr0Var) {
        super(context);
        this.f31468q3 = qu0Var;
        this.f31466o3 = lr0Var;
        this.f31467p3 = mr0Var;
    }

    @Override
    public final boolean A1() {
        return qu0.p0(this.f31468q3.l1);
    }

    @Override
    public final boolean B1() {
        if (this == this.f31466o3.h) {
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
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override
    public final Integer W0(int i10) {
        f2.p0 adapter = getAdapter();
        ys0 ys0Var = this.f31468q3.M;
        if (adapter == ys0Var && ys0Var.f35128e > 0 && i10 == ys0Var.d.size() - 1) {
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
        f2.p0 adapter = getAdapter();
        qu0 qu0Var = this.f31468q3;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
        xs0 xs0Var = qu0Var.V;
        er0 er0Var = qu0Var.f32054a0;
        lr0 lr0Var = this.f31466o3;
        if ((adapter == er0Var || getAdapter() == xs0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (qu0Var.f32079k1) {
                int i12 = qu0Var.l1;
                if (getAdapter() == xs0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && lr0Var.f29469r.getChildCount() > 0 && (childAt2 = lr0Var.f29469r.getChildAt(0)) != null) {
                    lr0Var.f29469r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), qu0Var.f32077j1);
                    }
                }
            }
            if (getAdapter() != xs0Var) {
                boolean z10 = true;
                if (this.f28992f3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f28992f3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f28992f3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, this.f29709l2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f28993g3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (o2Var == null || !ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(-qu0Var.f32069f1)))) ? false : false;
                    if (qu0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f28993g3 = new StaticLayout(LocaleController.getString(i10), this.f28992f3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f28994h3 = 0.0f;
                    this.f28995i3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f28993g3.getLineCount(); i13++) {
                        this.f28994h3 = Math.max(this.f28994h3, this.f28993g3.getLineWidth(i13));
                        this.f28995i3 = Math.min(this.f28995i3, this.f28993g3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f28994h3) / 2.0f) - this.f28995i3, top - ((this.f28993g3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f28993g3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (lr0Var.G) {
            float f9 = lr0Var.H + 0.010666667f;
            lr0Var.H = f9;
            if (f9 >= 1.0f) {
                lr0Var.H = 0.0f;
                lr0Var.G = false;
                lr0Var.F = 0;
            }
            invalidate();
        }
        if (this.f28996j3 == null) {
            int currentAccount = o2Var.getCurrentAccount();
            lh.q9[] q9VarArr = lh.q9.f16138f;
            if (q9VarArr[currentAccount] == null) {
                q9VarArr[currentAccount] = new lh.q9(currentAccount);
            }
            this.f28996j3 = q9VarArr[currentAccount];
        }
        this.f28996j3.a(this);
        if (!qu0Var.f32079k1) {
            qu0Var.l1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qu0 qu0Var = this.f31468q3;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
        if (o2Var != null && o2Var.isInPreviewMode()) {
            this.f31464m3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                qu0Var.f32093r1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f9 = this.f31465n3 - this.f31464m3;
                qu0Var.f32093r1.movePreviewFragment(f9);
                if (f9 < 0.0f) {
                    this.f31465n3 = this.f31464m3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f31468q3.f32081m1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f31468q3.f32077j1;
    }

    @Override
    public final int getColumnsCount() {
        qu0 qu0Var = this.f31468q3;
        if (qu0.p0(qu0Var.l1)) {
            return qu0Var.f32075i1[1];
        }
        return qu0Var.f32075i1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f31468q3.K1;
    }

    @Override
    public final tk0 getMovingAdapter() {
        qu0 qu0Var = this.f31468q3;
        if (qu0.p0(qu0Var.l1)) {
            return qu0Var.k1(qu0Var.l1);
        }
        return qu0Var.D;
    }

    @Override
    public final tk0 getSupportingAdapter() {
        qu0 qu0Var = this.f31468q3;
        if (qu0.p0(qu0Var.l1)) {
            return qu0Var.l1(qu0Var.l1);
        }
        return qu0Var.E;
    }

    @Override
    public final ht0 getSupportingListView() {
        return this.f31466o3.f29469r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10 = this.G1;
        qu0 qu0Var = this.f31468q3;
        if (z10 && qu0Var.getSelectedTab() == 11 && (o2Var = qu0Var.f32093r1) != null) {
            AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
        }
        qu0Var.I();
        f2.p0 adapter = getAdapter();
        wt0 wt0Var = qu0Var.J;
        if (adapter == wt0Var) {
            ArrayList<MessageObject> arrayList = wt0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    arrayList.add(((org.telegram.ui.Cells.s1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(wt0Var.d).addToPollsQueue(wt0Var.f34493s.f32069f1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        lr0 lr0Var = this.f31466o3;
        this.f31468q3.G(lr0Var, lr0Var.h, this.f31467p3);
        if (lr0Var.B == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View C1;
        try {
        } catch (Exception e10) {
            FileLog.e(e10);
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
    public final void y1(org.telegram.ui.Cells.p7 p7Var) {
        float f9;
        int messageId = p7Var.getMessageId();
        lr0 lr0Var = this.f31466o3;
        if (messageId == lr0Var.F && p7Var.f24978c.hasBitmapImage()) {
            if (!lr0Var.G) {
                lr0Var.H = 0.0f;
                lr0Var.G = true;
            }
            float f10 = lr0Var.H;
            if (f10 < 0.3f) {
                f9 = f10 / 0.3f;
            } else if (f10 > 0.7f) {
                f9 = (1.0f - f10) / 0.3f;
            } else {
                f9 = 1.0f;
            }
            p7Var.setHighlightProgress(f9);
            return;
        }
        p7Var.setHighlightProgress(0.0f);
    }

    @Override
    public final boolean z1() {
        return this.f31468q3.f32079k1;
    }
}
