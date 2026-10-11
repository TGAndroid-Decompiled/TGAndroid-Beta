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
public final class ct0 extends tv0 {
    public float f25318o3;
    public float f25319p3;
    public final zs0 f25320q3;
    public final at0 f25321r3;
    public final dw0 f25322s3;

    public ct0(dw0 dw0Var, Context context, zs0 zs0Var, at0 at0Var) {
        super(context);
        this.f25322s3 = dw0Var;
        this.f25320q3 = zs0Var;
        this.f25321r3 = at0Var;
    }

    @Override
    public final boolean A1() {
        return this.f25322s3.f25719o1;
    }

    @Override
    public final boolean B1() {
        return dw0.p0(this.f25322s3.f25721p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f25320q3.h) {
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
        mu0 mu0Var = this.f25322s3.Q;
        if (adapter == mu0Var && mu0Var.f28862e > 0 && i10 == mu0Var.d.size() - 1) {
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
        dw0 dw0Var = this.f25322s3;
        org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
        lu0 lu0Var = dw0Var.f25692c0;
        rs0 rs0Var = dw0Var.f25698e0;
        zs0 zs0Var = this.f25320q3;
        if ((adapter == rs0Var || getAdapter() == lu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (dw0Var.f25719o1) {
                int i12 = dw0Var.f25721p1;
                if (getAdapter() == lu0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && zs0Var.f32744r.getChildCount() > 0 && (childAt2 = zs0Var.f32744r.getChildAt(0)) != null) {
                    zs0Var.f32744r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), dw0Var.f25717n1);
                    }
                }
            }
            if (getAdapter() != lu0Var) {
                boolean z10 = true;
                if (this.f31161h3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f31161h3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f31161h3.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21189z6, this.f30807n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f31162i3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (m2Var == null || !ChatObject.isChannelAndNotMegaGroup(m2Var.getMessagesController().getChat(Long.valueOf(-dw0Var.f25710j1)))) ? false : false;
                    if (dw0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f31162i3 = new StaticLayout(LocaleController.getString(i10), this.f31161h3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.j3 = 0.0f;
                    this.f31163k3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f31162i3.getLineCount(); i13++) {
                        this.j3 = Math.max(this.j3, this.f31162i3.getLineWidth(i13));
                        this.f31163k3 = Math.min(this.f31163k3, this.f31162i3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.j3) / 2.0f) - this.f31163k3, top - ((this.f31162i3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f31162i3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (zs0Var.K) {
            float f7 = zs0Var.L + 0.010666667f;
            zs0Var.L = f7;
            if (f7 >= 1.0f) {
                zs0Var.L = 0.0f;
                zs0Var.K = false;
                zs0Var.J = 0;
            }
            invalidate();
        }
        if (this.f31164l3 == null) {
            int currentAccount = m2Var.getCurrentAccount();
            ai.sc[] scVarArr = ai.sc.f1715f;
            if (scVarArr[currentAccount] == null) {
                scVarArr[currentAccount] = new ai.sc(currentAccount);
            }
            this.f31164l3 = scVarArr[currentAccount];
        }
        this.f31164l3.a(this);
        if (!dw0Var.f25719o1) {
            dw0Var.f25721p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dw0 dw0Var = this.f25322s3;
        org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
        if (m2Var != null && m2Var.isInPreviewMode()) {
            this.f25318o3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                dw0Var.f25735v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f25319p3 - this.f25318o3;
                dw0Var.f25735v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f25319p3 = this.f25318o3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f25322s3.f25723q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f25322s3.f25717n1;
    }

    @Override
    public final int getColumnsCount() {
        dw0 dw0Var = this.f25322s3;
        if (dw0.p0(dw0Var.f25721p1)) {
            return dw0Var.f25714m1[1];
        }
        return dw0Var.f25714m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f25322s3.O1;
    }

    @Override
    public final am0 getMovingAdapter() {
        dw0 dw0Var = this.f25322s3;
        if (dw0.p0(dw0Var.f25721p1)) {
            return dw0Var.k1(dw0Var.f25721p1);
        }
        return dw0Var.H;
    }

    @Override
    public final am0 getSupportingAdapter() {
        dw0 dw0Var = this.f25322s3;
        if (dw0.p0(dw0Var.f25721p1)) {
            return dw0Var.l1(dw0Var.f25721p1);
        }
        return dw0Var.I;
    }

    @Override
    public final vu0 getSupportingListView() {
        return this.f25320q3.f32744r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z10 = this.I1;
        dw0 dw0Var = this.f25322s3;
        if (z10 && dw0Var.getSelectedTab() == 11 && (m2Var = dw0Var.f25735v1) != null) {
            AndroidUtilities.hideKeyboard(m2Var.getParentActivity().getCurrentFocus());
        }
        dw0Var.I();
        s4.i0 adapter = getAdapter();
        kv0 kv0Var = dw0Var.N;
        if (adapter == kv0Var) {
            ArrayList<MessageObject> arrayList = kv0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(kv0Var.d).addToPollsQueue(kv0Var.f28094s.f25710j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        zs0 zs0Var = this.f25320q3;
        this.f25322s3.G(zs0Var, zs0Var.h, this.f25321r3);
        if (zs0Var.F == 0) {
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
        zs0 zs0Var = this.f25320q3;
        if (messageId == zs0Var.J && t7Var.f23057c.hasBitmapImage()) {
            if (!zs0Var.K) {
                zs0Var.L = 0.0f;
                zs0Var.K = true;
            }
            float f10 = zs0Var.L;
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
