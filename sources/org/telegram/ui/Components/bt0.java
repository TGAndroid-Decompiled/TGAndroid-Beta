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
public final class bt0 extends sv0 {
    public float f25051o3;
    public float f25052p3;
    public final ys0 f25053q3;
    public final zs0 f25054r3;
    public final cw0 f25055s3;

    public bt0(cw0 cw0Var, Context context, ys0 ys0Var, zs0 zs0Var) {
        super(context);
        this.f25055s3 = cw0Var;
        this.f25053q3 = ys0Var;
        this.f25054r3 = zs0Var;
    }

    @Override
    public final boolean A1() {
        return this.f25055s3.f25458o1;
    }

    @Override
    public final boolean B1() {
        return cw0.p0(this.f25055s3.f25460p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f25053q3.h) {
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
        lu0 lu0Var = this.f25055s3.Q;
        if (adapter == lu0Var && lu0Var.f28545e > 0 && i10 == lu0Var.d.size() - 1) {
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
        cw0 cw0Var = this.f25055s3;
        org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
        ku0 ku0Var = cw0Var.f25431c0;
        qs0 qs0Var = cw0Var.f25437e0;
        ys0 ys0Var = this.f25053q3;
        if ((adapter == qs0Var || getAdapter() == ku0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (cw0Var.f25458o1) {
                int i12 = cw0Var.f25460p1;
                if (getAdapter() == ku0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && ys0Var.f32519r.getChildCount() > 0 && (childAt2 = ys0Var.f32519r.getChildAt(0)) != null) {
                    ys0Var.f32519r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), cw0Var.f25456n1);
                    }
                }
            }
            if (getAdapter() != ku0Var) {
                boolean z10 = true;
                if (this.f30873h3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f30873h3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f30873h3.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, this.f30511n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f30874i3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (n2Var == null || !ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-cw0Var.f25449j1)))) ? false : false;
                    if (cw0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f30874i3 = new StaticLayout(LocaleController.getString(i10), this.f30873h3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.j3 = 0.0f;
                    this.f30875k3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f30874i3.getLineCount(); i13++) {
                        this.j3 = Math.max(this.j3, this.f30874i3.getLineWidth(i13));
                        this.f30875k3 = Math.min(this.f30875k3, this.f30874i3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.j3) / 2.0f) - this.f30875k3, top - ((this.f30874i3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f30874i3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ys0Var.K) {
            float f7 = ys0Var.L + 0.010666667f;
            ys0Var.L = f7;
            if (f7 >= 1.0f) {
                ys0Var.L = 0.0f;
                ys0Var.K = false;
                ys0Var.J = 0;
            }
            invalidate();
        }
        if (this.f30876l3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ai.sc[] scVarArr = ai.sc.f1715f;
            if (scVarArr[currentAccount] == null) {
                scVarArr[currentAccount] = new ai.sc(currentAccount);
            }
            this.f30876l3 = scVarArr[currentAccount];
        }
        this.f30876l3.a(this);
        if (!cw0Var.f25458o1) {
            cw0Var.f25460p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cw0 cw0Var = this.f25055s3;
        org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
        if (n2Var != null && n2Var.isInPreviewMode()) {
            this.f25051o3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                cw0Var.f25474v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f25052p3 - this.f25051o3;
                cw0Var.f25474v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f25052p3 = this.f25051o3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f25055s3.f25462q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f25055s3.f25456n1;
    }

    @Override
    public final int getColumnsCount() {
        cw0 cw0Var = this.f25055s3;
        if (cw0.p0(cw0Var.f25460p1)) {
            return cw0Var.f25453m1[1];
        }
        return cw0Var.f25453m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f25055s3.O1;
    }

    @Override
    public final zl0 getMovingAdapter() {
        cw0 cw0Var = this.f25055s3;
        if (cw0.p0(cw0Var.f25460p1)) {
            return cw0Var.k1(cw0Var.f25460p1);
        }
        return cw0Var.H;
    }

    @Override
    public final zl0 getSupportingAdapter() {
        cw0 cw0Var = this.f25055s3;
        if (cw0.p0(cw0Var.f25460p1)) {
            return cw0Var.l1(cw0Var.f25460p1);
        }
        return cw0Var.I;
    }

    @Override
    public final uu0 getSupportingListView() {
        return this.f25053q3.f32519r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.I1;
        cw0 cw0Var = this.f25055s3;
        if (z10 && cw0Var.getSelectedTab() == 11 && (n2Var = cw0Var.f25474v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        cw0Var.I();
        s4.i0 adapter = getAdapter();
        jv0 jv0Var = cw0Var.N;
        if (adapter == jv0Var) {
            ArrayList<MessageObject> arrayList = jv0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(jv0Var.d).addToPollsQueue(jv0Var.f27797s.f25449j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ys0 ys0Var = this.f25053q3;
        this.f25055s3.G(ys0Var, ys0Var.h, this.f25054r3);
        if (ys0Var.F == 0) {
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
        ys0 ys0Var = this.f25053q3;
        if (messageId == ys0Var.J && t7Var.f23069c.hasBitmapImage()) {
            if (!ys0Var.K) {
                ys0Var.L = 0.0f;
                ys0Var.K = true;
            }
            float f10 = ys0Var.L;
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
