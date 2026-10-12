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
public final class gt0 extends xv0 {
    public float f26519o3;
    public float f26520p3;
    public final dt0 f26521q3;
    public final et0 f26522r3;
    public final hw0 f26523s3;

    public gt0(hw0 hw0Var, Context context, dt0 dt0Var, et0 et0Var) {
        super(context);
        this.f26523s3 = hw0Var;
        this.f26521q3 = dt0Var;
        this.f26522r3 = et0Var;
    }

    @Override
    public final boolean A1() {
        return this.f26523s3.f26941o1;
    }

    @Override
    public final boolean B1() {
        return hw0.p0(this.f26523s3.f26943p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f26521q3.h) {
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
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    @Override
    public final Integer W0(int i10) {
        s4.i0 adapter = getAdapter();
        qu0 qu0Var = this.f26523s3.Q;
        if (adapter == qu0Var && qu0Var.f29936e > 0 && i10 == qu0Var.d.size() - 1) {
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
        s4.i0 adapter = getAdapter();
        hw0 hw0Var = this.f26523s3;
        org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26957v1;
        pu0 pu0Var = hw0Var.f26914c0;
        vs0 vs0Var = hw0Var.f26920e0;
        dt0 dt0Var = this.f26521q3;
        if ((adapter == vs0Var || getAdapter() == pu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (hw0Var.f26941o1) {
                int i12 = hw0Var.f26943p1;
                if (getAdapter() == pu0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && dt0Var.f24488r.getChildCount() > 0 && (childAt2 = dt0Var.f24488r.getChildAt(0)) != null) {
                    dt0Var.f24488r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), hw0Var.f26939n1);
                    }
                }
            }
            if (getAdapter() != pu0Var) {
                boolean z10 = true;
                if (this.f32874h3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f32874h3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f32874h3.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20964z6, this.f32467n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f32875i3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (m2Var == null || !ChatObject.isChannelAndNotMegaGroup(m2Var.getMessagesController().getChat(Long.valueOf(-hw0Var.f26932j1)))) ? false : false;
                    if (hw0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f32875i3 = new StaticLayout(LocaleController.getString(i10), this.f32874h3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.j3 = 0.0f;
                    this.f32876k3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f32875i3.getLineCount(); i13++) {
                        this.j3 = Math.max(this.j3, this.f32875i3.getLineWidth(i13));
                        this.f32876k3 = Math.min(this.f32876k3, this.f32875i3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.j3) / 2.0f) - this.f32876k3, top - ((this.f32875i3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f32875i3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (dt0Var.K) {
            float f7 = dt0Var.L + 0.010666667f;
            dt0Var.L = f7;
            if (f7 >= 1.0f) {
                dt0Var.L = 0.0f;
                dt0Var.K = false;
                dt0Var.J = 0;
            }
            invalidate();
        }
        if (this.f32877l3 == null) {
            int currentAccount = m2Var.getCurrentAccount();
            ai.sc[] scVarArr = ai.sc.f1713f;
            if (scVarArr[currentAccount] == null) {
                scVarArr[currentAccount] = new ai.sc(currentAccount);
            }
            this.f32877l3 = scVarArr[currentAccount];
        }
        this.f32877l3.a(this);
        if (!hw0Var.f26941o1) {
            hw0Var.f26943p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        hw0 hw0Var = this.f26523s3;
        org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26957v1;
        if (m2Var != null && m2Var.isInPreviewMode()) {
            this.f26519o3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                hw0Var.f26957v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f26520p3 - this.f26519o3;
                hw0Var.f26957v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f26520p3 = this.f26519o3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f26523s3.f26945q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f26523s3.f26939n1;
    }

    @Override
    public final int getColumnsCount() {
        hw0 hw0Var = this.f26523s3;
        if (hw0.p0(hw0Var.f26943p1)) {
            return hw0Var.f26936m1[1];
        }
        return hw0Var.f26936m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f26523s3.O1;
    }

    @Override
    public final em0 getMovingAdapter() {
        hw0 hw0Var = this.f26523s3;
        if (hw0.p0(hw0Var.f26943p1)) {
            return hw0Var.k1(hw0Var.f26943p1);
        }
        return hw0Var.H;
    }

    @Override
    public final em0 getSupportingAdapter() {
        hw0 hw0Var = this.f26523s3;
        if (hw0.p0(hw0Var.f26943p1)) {
            return hw0Var.l1(hw0Var.f26943p1);
        }
        return hw0Var.I;
    }

    @Override
    public final zu0 getSupportingListView() {
        return this.f26521q3.f24488r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z10 = this.I1;
        hw0 hw0Var = this.f26523s3;
        if (z10 && hw0Var.getSelectedTab() == 11 && (m2Var = hw0Var.f26957v1) != null) {
            AndroidUtilities.hideKeyboard(m2Var.getParentActivity().getCurrentFocus());
        }
        hw0Var.I();
        s4.i0 adapter = getAdapter();
        ov0 ov0Var = hw0Var.N;
        if (adapter == ov0Var) {
            ArrayList<MessageObject> arrayList = ov0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(ov0Var.d).addToPollsQueue(ov0Var.f29314s.f26932j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        dt0 dt0Var = this.f26521q3;
        this.f26523s3.G(dt0Var, dt0Var.h, this.f26522r3);
        if (dt0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View D1;
        try {
        } catch (Exception e7) {
            FileLog.e(e7);
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
    public final void z1(org.telegram.ui.Cells.t7 t7Var) {
        float f7;
        int messageId = t7Var.getMessageId();
        dt0 dt0Var = this.f26521q3;
        if (messageId == dt0Var.J && t7Var.f22838c.hasBitmapImage()) {
            if (!dt0Var.K) {
                dt0Var.L = 0.0f;
                dt0Var.K = true;
            }
            float f10 = dt0Var.L;
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
}
