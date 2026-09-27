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
    public float f25834q3;
    public float f25835r3;
    public final hs0 f25836s3;
    public final is0 f25837t3;
    public final lv0 f25838u3;

    public ks0(lv0 lv0Var, Context context, hs0 hs0Var, is0 is0Var) {
        super(context);
        this.f25838u3 = lv0Var;
        this.f25836s3 = hs0Var;
        this.f25837t3 = is0Var;
    }

    @Override
    public final boolean A1() {
        return this.f25838u3.f26196o1;
    }

    @Override
    public final boolean B1() {
        return lv0.p0(this.f25838u3.f26198p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f25836s3.h) {
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
    public final Integer X0(int i10) {
        s4.h0 adapter = getAdapter();
        ut0 ut0Var = this.f25838u3.Q;
        if (adapter == ut0Var && ut0Var.e > 0 && i10 == ut0Var.d.size() - 1) {
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
        lv0 lv0Var = this.f25838u3;
        org.telegram.ui.ActionBar.o2 o2Var = lv0Var.f26212v1;
        tt0 tt0Var = lv0Var.f26170c0;
        yr0 yr0Var = lv0Var.f26175e0;
        hs0 hs0Var = this.f25836s3;
        if ((adapter == yr0Var || getAdapter() == tt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.S(childAt) == 0) {
            int top = childAt.getTop();
            if (lv0Var.f26196o1) {
                int i12 = lv0Var.f26198p1;
                if (getAdapter() == tt0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && hs0Var.f24129r.getChildCount() > 0 && (childAt2 = hs0Var.f24129r.getChildAt(0)) != null) {
                    hs0Var.f24129r.getClass();
                    if (RecyclerView.S(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), lv0Var.f26194n1);
                    }
                }
            }
            if (getAdapter() != tt0Var) {
                boolean z10 = true;
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19461z6, this.f30709p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f23139k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (o2Var == null || !ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(-lv0Var.f26187j1)))) ? false : false;
                    if (lv0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f23139k3 = new StaticLayout(LocaleController.getString(i10), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f23140l3 = 0.0f;
                    this.f23141m3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f23139k3.getLineCount(); i13++) {
                        this.f23140l3 = Math.max(this.f23140l3, this.f23139k3.getLineWidth(i13));
                        this.f23141m3 = Math.min(this.f23141m3, this.f23139k3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f23140l3) / 2.0f) - this.f23141m3, top - ((this.f23139k3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f23139k3.draw(canvas);
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
        if (this.f23142n3 == null) {
            int currentAccount = o2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f1477f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.f23142n3 = rcVarArr[currentAccount];
        }
        this.f23142n3.a(this);
        if (!lv0Var.f26196o1) {
            lv0Var.f26198p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        lv0 lv0Var = this.f25838u3;
        org.telegram.ui.ActionBar.o2 o2Var = lv0Var.f26212v1;
        if (o2Var != null && o2Var.isInPreviewMode()) {
            this.f25834q3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                lv0Var.f26212v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f25835r3 - this.f25834q3;
                lv0Var.f26212v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f25835r3 = this.f25834q3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f25838u3.f26200q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f25838u3.f26194n1;
    }

    @Override
    public final int getColumnsCount() {
        lv0 lv0Var = this.f25838u3;
        if (lv0.p0(lv0Var.f26198p1)) {
            return lv0Var.f26191m1[1];
        }
        return lv0Var.f26191m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f25838u3.O1;
    }

    @Override
    public final gl0 getMovingAdapter() {
        lv0 lv0Var = this.f25838u3;
        if (lv0.p0(lv0Var.f26198p1)) {
            return lv0Var.k1(lv0Var.f26198p1);
        }
        return lv0Var.H;
    }

    @Override
    public final gl0 getSupportingAdapter() {
        lv0 lv0Var = this.f25838u3;
        if (lv0.p0(lv0Var.f26198p1)) {
            return lv0Var.l1(lv0Var.f26198p1);
        }
        return lv0Var.I;
    }

    @Override
    public final du0 getSupportingListView() {
        return this.f25836s3.f24129r;
    }

    @Override
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10 = this.K1;
        lv0 lv0Var = this.f25838u3;
        if (z10 && lv0Var.getSelectedTab() == 11 && (o2Var = lv0Var.f26212v1) != null) {
            AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
        }
        lv0Var.I();
        s4.h0 adapter = getAdapter();
        su0 su0Var = lv0Var.N;
        if (adapter == su0Var) {
            ArrayList<MessageObject> arrayList = su0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(su0Var.d).addToPollsQueue(su0Var.f28385s.f26187j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        hs0 hs0Var = this.f25836s3;
        this.f25838u3.G(hs0Var, hs0Var.h, this.f25837t3);
        if (hs0Var.F == 0) {
            PhotoViewer.t1().y0();
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
    public final void z1(org.telegram.ui.Cells.t7 t7Var) {
        float f7;
        int messageId = t7Var.getMessageId();
        hs0 hs0Var = this.f25836s3;
        if (messageId == hs0Var.J && t7Var.f21216c.hasBitmapImage()) {
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
}
