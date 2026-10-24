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
public final class vs0 extends mv0 {
    public float f32036r3;
    public float f32037s3;
    public final ss0 f32038t3;
    public final ts0 f32039u3;
    public final wv0 f32040v3;

    public vs0(wv0 wv0Var, Context context, ss0 ss0Var, ts0 ts0Var) {
        super(context);
        this.f32040v3 = wv0Var;
        this.f32038t3 = ss0Var;
        this.f32039u3 = ts0Var;
    }

    @Override
    public final void E1(org.telegram.ui.Cells.s7 s7Var) {
        float f7;
        int messageId = s7Var.getMessageId();
        ss0 ss0Var = this.f32038t3;
        if (messageId == ss0Var.J && s7Var.f23264c.hasBitmapImage()) {
            if (!ss0Var.K) {
                ss0Var.L = 0.0f;
                ss0Var.K = true;
            }
            float f10 = ss0Var.L;
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

    @Override
    public final boolean F1() {
        return this.f32040v3.f32394o1;
    }

    @Override
    public final boolean G1() {
        return wv0.r0(this.f32040v3.f32396p1);
    }

    @Override
    public final boolean H1() {
        if (this == this.f32038t3.h) {
            return true;
        }
        return false;
    }

    public final View I1() {
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
        s4.g0 adapter = getAdapter();
        fu0 fu0Var = this.f32040v3.Q;
        if (adapter == fu0Var && fu0Var.e > 0 && i10 == fu0Var.d.size() - 1) {
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
        s4.g0 adapter = getAdapter();
        wv0 wv0Var = this.f32040v3;
        org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
        eu0 eu0Var = wv0Var.f32365c0;
        ks0 ks0Var = wv0Var.f32371e0;
        ss0 ss0Var = this.f32038t3;
        if ((adapter == ks0Var || getAdapter() == eu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (wv0Var.f32394o1) {
                int i12 = wv0Var.f32396p1;
                if (getAdapter() == eu0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && ss0Var.f29677r.getChildCount() > 0 && (childAt2 = ss0Var.f29677r.getChildAt(0)) != null) {
                    ss0Var.f29677r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), wv0Var.f32392n1);
                    }
                }
            }
            if (getAdapter() != eu0Var) {
                boolean z10 = true;
                if (this.f28706k3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f28706k3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f28706k3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21589z6, this.f28396n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f28707l3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (o2Var == null || !ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(-wv0Var.f32385j1)))) ? false : false;
                    if (wv0Var.s0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f28707l3 = new StaticLayout(LocaleController.getString(i10), this.f28706k3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f28708m3 = 0.0f;
                    this.f28709n3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f28707l3.getLineCount(); i13++) {
                        this.f28708m3 = Math.max(this.f28708m3, this.f28707l3.getLineWidth(i13));
                        this.f28709n3 = Math.min(this.f28709n3, this.f28707l3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f28708m3) / 2.0f) - this.f28709n3, top - ((this.f28707l3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f28707l3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ss0Var.K) {
            float f7 = ss0Var.L + 0.010666667f;
            ss0Var.L = f7;
            if (f7 >= 1.0f) {
                ss0Var.L = 0.0f;
                ss0Var.K = false;
                ss0Var.J = 0;
            }
            invalidate();
        }
        if (this.f28710o3 == null) {
            int currentAccount = o2Var.getCurrentAccount();
            ci.ha[] haVarArr = ci.ha.f5427f;
            if (haVarArr[currentAccount] == null) {
                haVarArr[currentAccount] = new ci.ha(currentAccount);
            }
            this.f28710o3 = haVarArr[currentAccount];
        }
        this.f28710o3.a(this);
        if (!wv0Var.f32394o1) {
            wv0Var.f32396p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        wv0 wv0Var = this.f32040v3;
        org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
        if (o2Var != null && o2Var.isInPreviewMode()) {
            this.f32036r3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                wv0Var.f32410v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f32037s3 - this.f32036r3;
                wv0Var.f32410v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f32037s3 = this.f32036r3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f32040v3.f32398q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f32040v3.f32392n1;
    }

    @Override
    public final int getColumnsCount() {
        wv0 wv0Var = this.f32040v3;
        if (wv0.r0(wv0Var.f32396p1)) {
            return wv0Var.f32389m1[1];
        }
        return wv0Var.f32389m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f32040v3.P1;
    }

    @Override
    public final tl0 getMovingAdapter() {
        wv0 wv0Var = this.f32040v3;
        if (wv0.r0(wv0Var.f32396p1)) {
            return wv0Var.n1(wv0Var.f32396p1);
        }
        return wv0Var.H;
    }

    @Override
    public final tl0 getSupportingAdapter() {
        wv0 wv0Var = this.f32040v3;
        if (wv0.r0(wv0Var.f32396p1)) {
            return wv0Var.o1(wv0Var.f32396p1);
        }
        return wv0Var.I;
    }

    @Override
    public final ou0 getSupportingListView() {
        return this.f32038t3.f29677r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10 = this.I1;
        wv0 wv0Var = this.f32040v3;
        if (z10 && wv0Var.getSelectedTab() == 11 && (o2Var = wv0Var.f32410v1) != null) {
            AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
        }
        wv0Var.J();
        s4.g0 adapter = getAdapter();
        dv0 dv0Var = wv0Var.N;
        if (adapter == dv0Var) {
            ArrayList<MessageObject> arrayList = dv0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(dv0Var.d).addToPollsQueue(dv0Var.f25846s.f32385j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ss0 ss0Var = this.f32038t3;
        this.f32040v3.H(ss0Var, ss0Var.h, this.f32039u3);
        if (ss0Var.F == 0) {
            PhotoViewer.u1().z0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View I1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (i10 == 4096) {
            View I12 = I1();
            if (I12 != null && I12.canScrollVertically(1) && I12.performAccessibilityAction(i10, bundle)) {
                return true;
            }
        } else {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (I1 = I1()) != null && I1.canScrollVertically(-1) && I1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }
}
