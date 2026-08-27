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

public final class er0 extends xt0 {

    public float f28132m3;

    public float f28133n3;

    public final br0 f28134o3;

    public final cr0 f28135p3;

    public final hu0 f28136q3;

    public er0(hu0 hu0Var, Context context, br0 br0Var, cr0 cr0Var) {
        super(context);
        this.f28136q3 = hu0Var;
        this.f28134o3 = br0Var;
        this.f28135p3 = cr0Var;
    }

    @Override
    public final boolean A1() {
        return hu0.p0(this.f28136q3.l1);
    }

    @Override
    public final boolean B1() {
        return this == this.f28134o3.h;
    }

    public final View C1() {
        try {
            for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                if (parent != this && (parent instanceof RecyclerView)) {
                    return (View) parent;
                }
            }
            return null;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    @Override
    public final Integer W0(int i10) {
        f2.q0 adapter = getAdapter();
        ps0 ps0Var = this.f28136q3.M;
        if (adapter == ps0Var && ps0Var.f31660e > 0 && i10 == ps0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        View childAt2;
        f2.q0 adapter = getAdapter();
        hu0 hu0Var = this.f28136q3;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        os0 os0Var = hu0Var.V;
        uq0 uq0Var = hu0Var.f29106a0;
        br0 br0Var = this.f28134o3;
        if ((adapter == uq0Var || getAdapter() == os0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (hu0Var.f29131k1) {
                if (hu0Var.l1 == (getAdapter() == os0Var ? 8 : 9) && br0Var.f35340r.getChildCount() > 0 && (childAt2 = br0Var.f35340r.getChildAt(0)) != null) {
                    br0Var.f35340r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), hu0Var.f29129j1);
                    }
                }
            }
            if (getAdapter() != os0Var) {
                if (this.f34704f3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f34704f3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f34704f3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, this.f35277l2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f34705g3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    this.f34705g3 = new StaticLayout(LocaleController.getString(hu0Var.q0() ? n2Var != null && ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-hu0Var.f29121f1))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.f34704f3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f34706h3 = 0.0f;
                    this.f34707i3 = measuredWidth;
                    for (int i10 = 0; i10 < this.f34705g3.getLineCount(); i10++) {
                        this.f34706h3 = Math.max(this.f34706h3, this.f34705g3.getLineWidth(i10));
                        this.f34707i3 = Math.min(this.f34707i3, this.f34705g3.getLineLeft(i10));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f34706h3) / 2.0f) - this.f34707i3, top - ((this.f34705g3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f34705g3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (br0Var.G) {
            float f10 = br0Var.H + 0.010666667f;
            br0Var.H = f10;
            if (f10 >= 1.0f) {
                br0Var.H = 0.0f;
                br0Var.G = false;
                br0Var.F = 0;
            }
            invalidate();
        }
        if (this.f34708j3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            jh.q9[] q9VarArr = jh.q9.f13873f;
            if (q9VarArr[currentAccount] == null) {
                q9VarArr[currentAccount] = new jh.q9(currentAccount);
            }
            this.f34708j3 = q9VarArr[currentAccount];
        }
        this.f34708j3.a(this);
        if (hu0Var.f29131k1) {
            return;
        }
        hu0Var.l1 = -1;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        hu0 hu0Var = this.f28136q3;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        if (n2Var == null || !n2Var.isInPreviewMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f28132m3 = motionEvent.getY();
        if (motionEvent.getAction() == 1) {
            hu0Var.f29145r1.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.f28133n3 - this.f28132m3;
            hu0Var.f29145r1.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.f28133n3 = this.f28132m3;
            }
        }
        return true;
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f28136q3.f29133m1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f28136q3.f29129j1;
    }

    @Override
    public final int getColumnsCount() {
        hu0 hu0Var = this.f28136q3;
        return hu0.p0(hu0Var.l1) ? hu0Var.f29127i1[1] : hu0Var.f29127i1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f28136q3.K1;
    }

    @Override
    public final jk0 getMovingAdapter() {
        hu0 hu0Var = this.f28136q3;
        return hu0.p0(hu0Var.l1) ? hu0Var.k1(hu0Var.l1) : hu0Var.D;
    }

    @Override
    public final jk0 getSupportingAdapter() {
        hu0 hu0Var = this.f28136q3;
        return hu0.p0(hu0Var.l1) ? hu0Var.l1(hu0Var.l1) : hu0Var.E;
    }

    @Override
    public final ys0 getSupportingListView() {
        return this.f28134o3.f35340r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.G1;
        hu0 hu0Var = this.f28136q3;
        if (z10 && hu0Var.getSelectedTab() == 11 && (n2Var = hu0Var.f29145r1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        hu0Var.I();
        f2.q0 adapter = getAdapter();
        nt0 nt0Var = hu0Var.J;
        if (adapter == nt0Var) {
            ArrayList<MessageObject> arrayList = nt0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    arrayList.add(((org.telegram.ui.Cells.s1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(nt0Var.d).addToPollsQueue(nt0Var.f31034s.f29121f1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        br0 br0Var = this.f28134o3;
        this.f28136q3.G(br0Var, br0Var.h, this.f28135p3);
        if (br0Var.B == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View viewC1;
        try {
            if (i10 != 4096) {
                if (i10 == 8192) {
                    if (!canScrollVertically(-1) && (viewC1 = C1()) != null && viewC1.canScrollVertically(-1) && viewC1.performAccessibilityAction(i10, bundle)) {
                        return true;
                    }
                }
                return super.performAccessibilityAction(i10, bundle);
            }
            View viewC2 = C1();
            if (viewC2 != null && viewC2.canScrollVertically(1) && viewC2.performAccessibilityAction(i10, bundle)) {
                return true;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    @Override
    public final void y1(org.telegram.ui.Cells.o7 o7Var) {
        float f10;
        int messageId = o7Var.getMessageId();
        br0 br0Var = this.f28134o3;
        if (messageId != br0Var.F || !o7Var.f24786c.hasBitmapImage()) {
            o7Var.setHighlightProgress(0.0f);
            return;
        }
        if (!br0Var.G) {
            br0Var.H = 0.0f;
            br0Var.G = true;
        }
        float f11 = br0Var.H;
        if (f11 < 0.3f) {
            f10 = f11 / 0.3f;
        } else {
            f10 = f11 > 0.7f ? (1.0f - f11) / 0.3f : 1.0f;
        }
        o7Var.setHighlightProgress(f10);
    }

    @Override
    public final boolean z1() {
        return this.f28136q3.f29131k1;
    }
}
