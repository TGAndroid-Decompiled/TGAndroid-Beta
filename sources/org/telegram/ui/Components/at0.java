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
public final class at0 extends rv0 {
    public float f24767o3;
    public float f24768p3;
    public final xs0 f24769q3;
    public final ys0 f24770r3;
    public final bw0 f24771s3;

    public at0(bw0 bw0Var, Context context, xs0 xs0Var, ys0 ys0Var) {
        super(context);
        this.f24771s3 = bw0Var;
        this.f24769q3 = xs0Var;
        this.f24770r3 = ys0Var;
    }

    @Override
    public final boolean A1() {
        return this.f24771s3.f25150o1;
    }

    @Override
    public final boolean B1() {
        return bw0.p0(this.f24771s3.f25152p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f24769q3.h) {
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
        ku0 ku0Var = this.f24771s3.Q;
        if (adapter == ku0Var && ku0Var.f28169e > 0 && i10 == ku0Var.d.size() - 1) {
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
        bw0 bw0Var = this.f24771s3;
        org.telegram.ui.ActionBar.n2 n2Var = bw0Var.f25166v1;
        ju0 ju0Var = bw0Var.f25123c0;
        ps0 ps0Var = bw0Var.f25129e0;
        xs0 xs0Var = this.f24769q3;
        if ((adapter == ps0Var || getAdapter() == ju0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (bw0Var.f25150o1) {
                int i12 = bw0Var.f25152p1;
                if (getAdapter() == ju0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && xs0Var.f31625r.getChildCount() > 0 && (childAt2 = xs0Var.f31625r.getChildAt(0)) != null) {
                    xs0Var.f31625r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), bw0Var.f25148n1);
                    }
                }
            }
            if (getAdapter() != ju0Var) {
                boolean z10 = true;
                if (this.f30521h3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f30521h3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f30521h3.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21199z6, this.f30216n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f30522i3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (n2Var == null || !ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-bw0Var.f25141j1)))) ? false : false;
                    if (bw0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f30522i3 = new StaticLayout(LocaleController.getString(i10), this.f30521h3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.j3 = 0.0f;
                    this.f30523k3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f30522i3.getLineCount(); i13++) {
                        this.j3 = Math.max(this.j3, this.f30522i3.getLineWidth(i13));
                        this.f30523k3 = Math.min(this.f30523k3, this.f30522i3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.j3) / 2.0f) - this.f30523k3, top - ((this.f30522i3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f30522i3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (xs0Var.K) {
            float f7 = xs0Var.L + 0.010666667f;
            xs0Var.L = f7;
            if (f7 >= 1.0f) {
                xs0Var.L = 0.0f;
                xs0Var.K = false;
                xs0Var.J = 0;
            }
            invalidate();
        }
        if (this.f30524l3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ai.sc[] scVarArr = ai.sc.f1715f;
            if (scVarArr[currentAccount] == null) {
                scVarArr[currentAccount] = new ai.sc(currentAccount);
            }
            this.f30524l3 = scVarArr[currentAccount];
        }
        this.f30524l3.a(this);
        if (!bw0Var.f25150o1) {
            bw0Var.f25152p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bw0 bw0Var = this.f24771s3;
        org.telegram.ui.ActionBar.n2 n2Var = bw0Var.f25166v1;
        if (n2Var != null && n2Var.isInPreviewMode()) {
            this.f24767o3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                bw0Var.f25166v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f24768p3 - this.f24767o3;
                bw0Var.f25166v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f24768p3 = this.f24767o3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f24771s3.f25154q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f24771s3.f25148n1;
    }

    @Override
    public final int getColumnsCount() {
        bw0 bw0Var = this.f24771s3;
        if (bw0.p0(bw0Var.f25152p1)) {
            return bw0Var.f25145m1[1];
        }
        return bw0Var.f25145m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f24771s3.O1;
    }

    @Override
    public final yl0 getMovingAdapter() {
        bw0 bw0Var = this.f24771s3;
        if (bw0.p0(bw0Var.f25152p1)) {
            return bw0Var.k1(bw0Var.f25152p1);
        }
        return bw0Var.H;
    }

    @Override
    public final yl0 getSupportingAdapter() {
        bw0 bw0Var = this.f24771s3;
        if (bw0.p0(bw0Var.f25152p1)) {
            return bw0Var.l1(bw0Var.f25152p1);
        }
        return bw0Var.I;
    }

    @Override
    public final tu0 getSupportingListView() {
        return this.f24769q3.f31625r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.I1;
        bw0 bw0Var = this.f24771s3;
        if (z10 && bw0Var.getSelectedTab() == 11 && (n2Var = bw0Var.f25166v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        bw0Var.I();
        s4.i0 adapter = getAdapter();
        iv0 iv0Var = bw0Var.N;
        if (adapter == iv0Var) {
            ArrayList<MessageObject> arrayList = iv0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(iv0Var.d).addToPollsQueue(iv0Var.f27494s.f25141j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        xs0 xs0Var = this.f24769q3;
        this.f24771s3.G(xs0Var, xs0Var.h, this.f24770r3);
        if (xs0Var.F == 0) {
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
        xs0 xs0Var = this.f24769q3;
        if (messageId == xs0Var.J && t7Var.f23065c.hasBitmapImage()) {
            if (!xs0Var.K) {
                xs0Var.L = 0.0f;
                xs0Var.K = true;
            }
            float f10 = xs0Var.L;
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
