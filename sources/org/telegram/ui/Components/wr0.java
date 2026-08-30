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
public final class wr0 extends ou0 {
    public float f30413n3;
    public float f30414o3;
    public final tr0 f30415p3;
    public final ur0 f30416q3;
    public final yu0 f30417r3;

    public wr0(yu0 yu0Var, Context context, tr0 tr0Var, ur0 ur0Var) {
        super(context);
        this.f30417r3 = yu0Var;
        this.f30415p3 = tr0Var;
        this.f30416q3 = ur0Var;
    }

    @Override
    public final boolean A1() {
        return yu0.p0(this.f30417r3.f31129m1);
    }

    @Override
    public final boolean B1() {
        if (this == this.f30415p3.h) {
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
        f2.o0 adapter = getAdapter();
        gt0 gt0Var = this.f30417r3.N;
        if (adapter == gt0Var && gt0Var.e > 0 && i10 == gt0Var.d.size() - 1) {
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
        f2.o0 adapter = getAdapter();
        yu0 yu0Var = this.f30417r3;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31144s1;
        ft0 ft0Var = yu0Var.W;
        mr0 mr0Var = yu0Var.f31106b0;
        tr0 tr0Var = this.f30415p3;
        if ((adapter == mr0Var || getAdapter() == ft0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (yu0Var.l1) {
                int i12 = yu0Var.f31129m1;
                if (getAdapter() == ft0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && tr0Var.f28242r.getChildCount() > 0 && (childAt2 = tr0Var.f28242r.getChildAt(0)) != null) {
                    tr0Var.f28242r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), yu0Var.f31127k1);
                    }
                }
            }
            if (getAdapter() != ft0Var) {
                boolean z4 = true;
                if (this.f27670g3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f27670g3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f27670g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20298z6, this.f28750m2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f27671h3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z4 = (p2Var == null || !ChatObject.isChannelAndNotMegaGroup(p2Var.getMessagesController().getChat(Long.valueOf(-yu0Var.f31119g1)))) ? false : false;
                    if (yu0Var.q0()) {
                        if (z4) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f27671h3 = new StaticLayout(LocaleController.getString(i10), this.f27670g3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f27672i3 = 0.0f;
                    this.f27673j3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f27671h3.getLineCount(); i13++) {
                        this.f27672i3 = Math.max(this.f27672i3, this.f27671h3.getLineWidth(i13));
                        this.f27673j3 = Math.min(this.f27673j3, this.f27671h3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f27672i3) / 2.0f) - this.f27673j3, top - ((this.f27671h3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f27671h3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (tr0Var.H) {
            float f10 = tr0Var.I + 0.010666667f;
            tr0Var.I = f10;
            if (f10 >= 1.0f) {
                tr0Var.I = 0.0f;
                tr0Var.H = false;
                tr0Var.G = 0;
            }
            invalidate();
        }
        if (this.f27674k3 == null) {
            int currentAccount = p2Var.getCurrentAccount();
            nh.q9[] q9VarArr = nh.q9.f15812f;
            if (q9VarArr[currentAccount] == null) {
                q9VarArr[currentAccount] = new nh.q9(currentAccount);
            }
            this.f27674k3 = q9VarArr[currentAccount];
        }
        this.f27674k3.a(this);
        if (!yu0Var.l1) {
            yu0Var.f31129m1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yu0 yu0Var = this.f30417r3;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31144s1;
        if (p2Var != null && p2Var.isInPreviewMode()) {
            this.f30413n3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                yu0Var.f31144s1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f30414o3 - this.f30413n3;
                yu0Var.f31144s1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f30414o3 = this.f30413n3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f30417r3.f31132n1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f30417r3.f31127k1;
    }

    @Override
    public final int getColumnsCount() {
        yu0 yu0Var = this.f30417r3;
        if (yu0.p0(yu0Var.f31129m1)) {
            return yu0Var.f31125j1[1];
        }
        return yu0Var.f31125j1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f30417r3.L1;
    }

    @Override
    public final cl0 getMovingAdapter() {
        yu0 yu0Var = this.f30417r3;
        if (yu0.p0(yu0Var.f31129m1)) {
            return yu0Var.k1(yu0Var.f31129m1);
        }
        return yu0Var.E;
    }

    @Override
    public final cl0 getSupportingAdapter() {
        yu0 yu0Var = this.f30417r3;
        if (yu0.p0(yu0Var.f31129m1)) {
            return yu0Var.l1(yu0Var.f31129m1);
        }
        return yu0Var.F;
    }

    @Override
    public final pt0 getSupportingListView() {
        return this.f30415p3.f28242r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z4 = this.H1;
        yu0 yu0Var = this.f30417r3;
        if (z4 && yu0Var.getSelectedTab() == 11 && (p2Var = yu0Var.f31144s1) != null) {
            AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
        }
        yu0Var.I();
        f2.o0 adapter = getAdapter();
        eu0 eu0Var = yu0Var.K;
        if (adapter == eu0Var) {
            ArrayList<MessageObject> arrayList = eu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(eu0Var.d).addToPollsQueue(eu0Var.f24679s.f31119g1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        tr0 tr0Var = this.f30415p3;
        this.f30417r3.G(tr0Var, tr0Var.h, this.f30416q3);
        if (tr0Var.C == 0) {
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
    public final void y1(org.telegram.ui.Cells.r7 r7Var) {
        float f10;
        int messageId = r7Var.getMessageId();
        tr0 tr0Var = this.f30415p3;
        if (messageId == tr0Var.G && r7Var.f21769c.hasBitmapImage()) {
            if (!tr0Var.H) {
                tr0Var.I = 0.0f;
                tr0Var.H = true;
            }
            float f11 = tr0Var.I;
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
        return this.f30417r3.l1;
    }
}
