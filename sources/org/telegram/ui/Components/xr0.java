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
public final class xr0 extends pu0 {
    public float f33168n3;
    public float f33169o3;
    public final ur0 f33170p3;
    public final vr0 f33171q3;
    public final zu0 f33172r3;

    public xr0(zu0 zu0Var, Context context, ur0 ur0Var, vr0 vr0Var) {
        super(context);
        this.f33172r3 = zu0Var;
        this.f33170p3 = ur0Var;
        this.f33171q3 = vr0Var;
    }

    @Override
    public final boolean A1() {
        return zu0.p0(this.f33172r3.f33989m1);
    }

    @Override
    public final boolean B1() {
        if (this == this.f33170p3.h) {
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
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    @Override
    public final Integer W0(int i10) {
        f2.p0 adapter = getAdapter();
        ht0 ht0Var = this.f33172r3.N;
        if (adapter == ht0Var && ht0Var.f27586e > 0 && i10 == ht0Var.d.size() - 1) {
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
        zu0 zu0Var = this.f33172r3;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        gt0 gt0Var = zu0Var.W;
        nr0 nr0Var = zu0Var.f33965b0;
        ur0 ur0Var = this.f33170p3;
        if ((adapter == nr0Var || getAdapter() == gt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (zu0Var.l1) {
                int i12 = zu0Var.f33989m1;
                if (getAdapter() == gt0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && ur0Var.f30850r.getChildCount() > 0 && (childAt2 = ur0Var.f30850r.getChildAt(0)) != null) {
                    ur0Var.f30850r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), zu0Var.f33987k1);
                    }
                }
            }
            if (getAdapter() != gt0Var) {
                boolean z4 = true;
                if (this.f30208g3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f30208g3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f30208g3.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22053z6, this.f31383m2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f30209h3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z4 = (p2Var == null || !ChatObject.isChannelAndNotMegaGroup(p2Var.getMessagesController().getChat(Long.valueOf(-zu0Var.f33979g1)))) ? false : false;
                    if (zu0Var.q0()) {
                        if (z4) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f30209h3 = new StaticLayout(LocaleController.getString(i10), this.f30208g3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f30210i3 = 0.0f;
                    this.f30211j3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f30209h3.getLineCount(); i13++) {
                        this.f30210i3 = Math.max(this.f30210i3, this.f30209h3.getLineWidth(i13));
                        this.f30211j3 = Math.min(this.f30211j3, this.f30209h3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f30210i3) / 2.0f) - this.f30211j3, top - ((this.f30209h3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f30209h3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ur0Var.H) {
            float f10 = ur0Var.I + 0.010666667f;
            ur0Var.I = f10;
            if (f10 >= 1.0f) {
                ur0Var.I = 0.0f;
                ur0Var.H = false;
                ur0Var.G = 0;
            }
            invalidate();
        }
        if (this.f30212k3 == null) {
            int currentAccount = p2Var.getCurrentAccount();
            oh.q9[] q9VarArr = oh.q9.f17668f;
            if (q9VarArr[currentAccount] == null) {
                q9VarArr[currentAccount] = new oh.q9(currentAccount);
            }
            this.f30212k3 = q9VarArr[currentAccount];
        }
        this.f30212k3.a(this);
        if (!zu0Var.l1) {
            zu0Var.f33989m1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zu0 zu0Var = this.f33172r3;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        if (p2Var != null && p2Var.isInPreviewMode()) {
            this.f33168n3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                zu0Var.f34004s1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f33169o3 - this.f33168n3;
                zu0Var.f34004s1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f33169o3 = this.f33168n3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f33172r3.f33992n1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f33172r3.f33987k1;
    }

    @Override
    public final int getColumnsCount() {
        zu0 zu0Var = this.f33172r3;
        if (zu0.p0(zu0Var.f33989m1)) {
            return zu0Var.f33985j1[1];
        }
        return zu0Var.f33985j1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f33172r3.L1;
    }

    @Override
    public final dl0 getMovingAdapter() {
        zu0 zu0Var = this.f33172r3;
        if (zu0.p0(zu0Var.f33989m1)) {
            return zu0Var.k1(zu0Var.f33989m1);
        }
        return zu0Var.E;
    }

    @Override
    public final dl0 getSupportingAdapter() {
        zu0 zu0Var = this.f33172r3;
        if (zu0.p0(zu0Var.f33989m1)) {
            return zu0Var.l1(zu0Var.f33989m1);
        }
        return zu0Var.F;
    }

    @Override
    public final qt0 getSupportingListView() {
        return this.f33170p3.f30850r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z4 = this.H1;
        zu0 zu0Var = this.f33172r3;
        if (z4 && zu0Var.getSelectedTab() == 11 && (p2Var = zu0Var.f34004s1) != null) {
            AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
        }
        zu0Var.I();
        f2.p0 adapter = getAdapter();
        fu0 fu0Var = zu0Var.K;
        if (adapter == fu0Var) {
            ArrayList<MessageObject> arrayList = fu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(fu0Var.d).addToPollsQueue(fu0Var.f27017s.f33979g1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        ur0 ur0Var = this.f33170p3;
        this.f33172r3.G(ur0Var, ur0Var.h, this.f33171q3);
        if (ur0Var.C == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View C1;
        try {
        } catch (Exception e6) {
            FileLog.e(e6);
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
    public final void y1(org.telegram.ui.Cells.r7 r7Var) {
        float f10;
        int messageId = r7Var.getMessageId();
        ur0 ur0Var = this.f33170p3;
        if (messageId == ur0Var.G && r7Var.f23561c.hasBitmapImage()) {
            if (!ur0Var.H) {
                ur0Var.I = 0.0f;
                ur0Var.H = true;
            }
            float f11 = ur0Var.I;
            if (f11 < 0.3f) {
                f10 = f11 / 0.3f;
            } else if (f11 > 0.7f) {
                f10 = (1.0f - f11) / 0.3f;
            } else {
                f10 = 1.0f;
            }
            r7Var.setHighlightProgress(f10);
            return;
        }
        r7Var.setHighlightProgress(0.0f);
    }

    @Override
    public final boolean z1() {
        return this.f33172r3.l1;
    }
}
