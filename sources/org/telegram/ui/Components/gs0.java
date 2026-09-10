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
public final class gs0 extends yu0 {
    public float f23416q3;
    public float f23417r3;
    public final ds0 f23418s3;
    public final es0 f23419t3;
    public final iv0 f23420u3;

    public gs0(iv0 iv0Var, Context context, ds0 ds0Var, es0 es0Var) {
        super(context);
        this.f23420u3 = iv0Var;
        this.f23418s3 = ds0Var;
        this.f23419t3 = es0Var;
    }

    @Override
    public final boolean A1() {
        if (this == this.f23418s3.h) {
            return true;
        }
        return false;
    }

    public final View B1() {
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
    public final Integer V0(int i10) {
        s4.h0 adapter = getAdapter();
        qt0 qt0Var = this.f23420u3.Q;
        if (adapter == qt0Var && qt0Var.e > 0 && i10 == qt0Var.d.size() - 1) {
            return 0;
        }
        return super.V0(i10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int i10;
        int i11;
        View childAt2;
        s4.h0 adapter = getAdapter();
        iv0 iv0Var = this.f23420u3;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
        pt0 pt0Var = iv0Var.f24089c0;
        ur0 ur0Var = iv0Var.f24094e0;
        ds0 ds0Var = this.f23418s3;
        if ((adapter == ur0Var || getAdapter() == pt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (iv0Var.f24115o1) {
                int i12 = iv0Var.f24117p1;
                if (getAdapter() == pt0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && ds0Var.f21595r.getChildCount() > 0 && (childAt2 = ds0Var.f21595r.getChildAt(0)) != null) {
                    ds0Var.f21595r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), iv0Var.f24113n1);
                    }
                }
            }
            if (getAdapter() != pt0Var) {
                boolean z10 = true;
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, this.f27987p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f29504k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (p2Var == null || !ChatObject.isChannelAndNotMegaGroup(p2Var.getMessagesController().getChat(Long.valueOf(-iv0Var.f24106j1)))) ? false : false;
                    if (iv0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f29504k3 = new StaticLayout(LocaleController.getString(i10), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f29505l3 = 0.0f;
                    this.f29506m3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f29504k3.getLineCount(); i13++) {
                        this.f29505l3 = Math.max(this.f29505l3, this.f29504k3.getLineWidth(i13));
                        this.f29506m3 = Math.min(this.f29506m3, this.f29504k3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f29505l3) / 2.0f) - this.f29506m3, top - ((this.f29504k3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f29504k3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ds0Var.K) {
            float f7 = ds0Var.L + 0.010666667f;
            ds0Var.L = f7;
            if (f7 >= 1.0f) {
                ds0Var.L = 0.0f;
                ds0Var.K = false;
                ds0Var.J = 0;
            }
            invalidate();
        }
        if (this.f29507n3 == null) {
            int currentAccount = p2Var.getCurrentAccount();
            zh.c8[] c8VarArr = zh.c8.f48331f;
            if (c8VarArr[currentAccount] == null) {
                c8VarArr[currentAccount] = new zh.c8(currentAccount);
            }
            this.f29507n3 = c8VarArr[currentAccount];
        }
        this.f29507n3.a(this);
        if (!iv0Var.f24115o1) {
            iv0Var.f24117p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        iv0 iv0Var = this.f23420u3;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
        if (p2Var != null && p2Var.isInPreviewMode()) {
            this.f23416q3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                iv0Var.f24131v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f23417r3 - this.f23416q3;
                iv0Var.f24131v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f23417r3 = this.f23416q3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f23420u3.f24119q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f23420u3.f24113n1;
    }

    @Override
    public final int getColumnsCount() {
        iv0 iv0Var = this.f23420u3;
        if (iv0.p0(iv0Var.f24117p1)) {
            return iv0Var.f24110m1[1];
        }
        return iv0Var.f24110m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f23420u3.O1;
    }

    @Override
    public final dl0 getMovingAdapter() {
        iv0 iv0Var = this.f23420u3;
        if (iv0.p0(iv0Var.f24117p1)) {
            return iv0Var.k1(iv0Var.f24117p1);
        }
        return iv0Var.H;
    }

    @Override
    public final dl0 getSupportingAdapter() {
        iv0 iv0Var = this.f23420u3;
        if (iv0.p0(iv0Var.f24117p1)) {
            return iv0Var.l1(iv0Var.f24117p1);
        }
        return iv0Var.I;
    }

    @Override
    public final zt0 getSupportingListView() {
        return this.f23418s3.f21595r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z10 = this.K1;
        iv0 iv0Var = this.f23420u3;
        if (z10 && iv0Var.getSelectedTab() == 11 && (p2Var = iv0Var.f24131v1) != null) {
            AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
        }
        iv0Var.I();
        s4.h0 adapter = getAdapter();
        ou0 ou0Var = iv0Var.N;
        if (adapter == ou0Var) {
            ArrayList<MessageObject> arrayList = ou0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(ou0Var.d).addToPollsQueue(ou0Var.f25918s.f24106j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ds0 ds0Var = this.f23418s3;
        this.f23420u3.G(ds0Var, ds0Var.h, this.f23419t3);
        if (ds0Var.F == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View B1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (i10 == 4096) {
            View B12 = B1();
            if (B12 != null && B12.canScrollVertically(1) && B12.performAccessibilityAction(i10, bundle)) {
                return true;
            }
        } else {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (B1 = B1()) != null && B1.canScrollVertically(-1) && B1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    @Override
    public final void x1(org.telegram.ui.Cells.u7 u7Var) {
        float f7;
        int messageId = u7Var.getMessageId();
        ds0 ds0Var = this.f23418s3;
        if (messageId == ds0Var.J && u7Var.f20497c.hasBitmapImage()) {
            if (!ds0Var.K) {
                ds0Var.L = 0.0f;
                ds0Var.K = true;
            }
            float f10 = ds0Var.L;
            if (f10 < 0.3f) {
                f7 = f10 / 0.3f;
            } else if (f10 > 0.7f) {
                f7 = (1.0f - f10) / 0.3f;
            } else {
                f7 = 1.0f;
            }
            u7Var.setHighlightProgress(f7);
            return;
        }
        u7Var.setHighlightProgress(0.0f);
    }

    @Override
    public final boolean y1() {
        return this.f23420u3.f24115o1;
    }

    @Override
    public final boolean z1() {
        return iv0.p0(this.f23420u3.f24117p1);
    }
}
