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
public final class ws0 extends nv0 {
    public float f32340r3;
    public float f32341s3;
    public final ts0 f32342t3;
    public final us0 f32343u3;
    public final xv0 f32344v3;

    public ws0(xv0 xv0Var, Context context, ts0 ts0Var, us0 us0Var) {
        super(context);
        this.f32344v3 = xv0Var;
        this.f32342t3 = ts0Var;
        this.f32343u3 = us0Var;
    }

    @Override
    public final void E1(org.telegram.ui.Cells.s7 s7Var) {
        float f7;
        int messageId = s7Var.getMessageId();
        ts0 ts0Var = this.f32342t3;
        if (messageId == ts0Var.J && s7Var.f23263c.hasBitmapImage()) {
            if (!ts0Var.K) {
                ts0Var.L = 0.0f;
                ts0Var.K = true;
            }
            float f10 = ts0Var.L;
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
        return this.f32344v3.f32695o1;
    }

    @Override
    public final boolean G1() {
        return xv0.r0(this.f32344v3.f32697p1);
    }

    @Override
    public final boolean H1() {
        if (this == this.f32342t3.h) {
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
        gu0 gu0Var = this.f32344v3.Q;
        if (adapter == gu0Var && gu0Var.e > 0 && i10 == gu0Var.d.size() - 1) {
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
        xv0 xv0Var = this.f32344v3;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
        fu0 fu0Var = xv0Var.f32666c0;
        ls0 ls0Var = xv0Var.f32672e0;
        ts0 ts0Var = this.f32342t3;
        if ((adapter == ls0Var || getAdapter() == fu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (xv0Var.f32695o1) {
                int i12 = xv0Var.f32697p1;
                if (getAdapter() == fu0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && ts0Var.f30004r.getChildCount() > 0 && (childAt2 = ts0Var.f30004r.getChildAt(0)) != null) {
                    ts0Var.f30004r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), xv0Var.f32693n1);
                    }
                }
            }
            if (getAdapter() != fu0Var) {
                boolean z10 = true;
                if (this.f29022k3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f29022k3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f29022k3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21588z6, this.f28705n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f29023l3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (o2Var == null || !ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(-xv0Var.f32686j1)))) ? false : false;
                    if (xv0Var.s0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f29023l3 = new StaticLayout(LocaleController.getString(i10), this.f29022k3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f29024m3 = 0.0f;
                    this.f29025n3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f29023l3.getLineCount(); i13++) {
                        this.f29024m3 = Math.max(this.f29024m3, this.f29023l3.getLineWidth(i13));
                        this.f29025n3 = Math.min(this.f29025n3, this.f29023l3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f29024m3) / 2.0f) - this.f29025n3, top - ((this.f29023l3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f29023l3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ts0Var.K) {
            float f7 = ts0Var.L + 0.010666667f;
            ts0Var.L = f7;
            if (f7 >= 1.0f) {
                ts0Var.L = 0.0f;
                ts0Var.K = false;
                ts0Var.J = 0;
            }
            invalidate();
        }
        if (this.f29026o3 == null) {
            int currentAccount = o2Var.getCurrentAccount();
            ci.ha[] haVarArr = ci.ha.f5427f;
            if (haVarArr[currentAccount] == null) {
                haVarArr[currentAccount] = new ci.ha(currentAccount);
            }
            this.f29026o3 = haVarArr[currentAccount];
        }
        this.f29026o3.a(this);
        if (!xv0Var.f32695o1) {
            xv0Var.f32697p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xv0 xv0Var = this.f32344v3;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
        if (o2Var != null && o2Var.isInPreviewMode()) {
            this.f32340r3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                xv0Var.f32711v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f32341s3 - this.f32340r3;
                xv0Var.f32711v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f32341s3 = this.f32340r3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f32344v3.f32699q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f32344v3.f32693n1;
    }

    @Override
    public final int getColumnsCount() {
        xv0 xv0Var = this.f32344v3;
        if (xv0.r0(xv0Var.f32697p1)) {
            return xv0Var.f32690m1[1];
        }
        return xv0Var.f32690m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f32344v3.P1;
    }

    @Override
    public final ul0 getMovingAdapter() {
        xv0 xv0Var = this.f32344v3;
        if (xv0.r0(xv0Var.f32697p1)) {
            return xv0Var.n1(xv0Var.f32697p1);
        }
        return xv0Var.H;
    }

    @Override
    public final ul0 getSupportingAdapter() {
        xv0 xv0Var = this.f32344v3;
        if (xv0.r0(xv0Var.f32697p1)) {
            return xv0Var.o1(xv0Var.f32697p1);
        }
        return xv0Var.I;
    }

    @Override
    public final pu0 getSupportingListView() {
        return this.f32342t3.f30004r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10 = this.I1;
        xv0 xv0Var = this.f32344v3;
        if (z10 && xv0Var.getSelectedTab() == 11 && (o2Var = xv0Var.f32711v1) != null) {
            AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
        }
        xv0Var.J();
        s4.g0 adapter = getAdapter();
        ev0 ev0Var = xv0Var.N;
        if (adapter == ev0Var) {
            ArrayList<MessageObject> arrayList = ev0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(ev0Var.d).addToPollsQueue(ev0Var.f26084s.f32686j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ts0 ts0Var = this.f32342t3;
        this.f32344v3.H(ts0Var, ts0Var.h, this.f32343u3);
        if (ts0Var.F == 0) {
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
