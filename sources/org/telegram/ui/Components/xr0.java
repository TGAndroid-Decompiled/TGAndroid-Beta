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
public final class xr0 extends ou0 {
    public float f30047q3;
    public float f30048r3;
    public final ur0 f30049s3;
    public final vr0 f30050t3;
    public final yu0 f30051u3;

    public xr0(yu0 yu0Var, Context context, ur0 ur0Var, vr0 vr0Var) {
        super(context);
        this.f30051u3 = yu0Var;
        this.f30049s3 = ur0Var;
        this.f30050t3 = vr0Var;
    }

    @Override
    public final boolean A1() {
        return yu0.p0(this.f30051u3.f30378p1);
    }

    @Override
    public final boolean B1() {
        if (this == this.f30049s3.h) {
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
        s4.h0 adapter = getAdapter();
        ht0 ht0Var = this.f30051u3.Q;
        if (adapter == ht0Var && ht0Var.e > 0 && i10 == ht0Var.d.size() - 1) {
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
        s4.h0 adapter = getAdapter();
        yu0 yu0Var = this.f30051u3;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
        gt0 gt0Var = yu0Var.f30350c0;
        lr0 lr0Var = yu0Var.f30355e0;
        ur0 ur0Var = this.f30049s3;
        if ((adapter == lr0Var || getAdapter() == gt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (yu0Var.f30376o1) {
                int i12 = yu0Var.f30378p1;
                if (getAdapter() == gt0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && ur0Var.f27688r.getChildCount() > 0 && (childAt2 = ur0Var.f27688r.getChildAt(0)) != null) {
                    ur0Var.f27688r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), yu0Var.f30374n1);
                    }
                }
            }
            if (getAdapter() != gt0Var) {
                boolean z10 = true;
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19237z6, this.f25966p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f26893k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (n2Var == null || !ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-yu0Var.f30367j1)))) ? false : false;
                    if (yu0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f26893k3 = new StaticLayout(LocaleController.getString(i10), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f26894l3 = 0.0f;
                    this.f26895m3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f26893k3.getLineCount(); i13++) {
                        this.f26894l3 = Math.max(this.f26894l3, this.f26893k3.getLineWidth(i13));
                        this.f26895m3 = Math.min(this.f26895m3, this.f26893k3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f26894l3) / 2.0f) - this.f26895m3, top - ((this.f26893k3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f26893k3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ur0Var.K) {
            float f7 = ur0Var.L + 0.010666667f;
            ur0Var.L = f7;
            if (f7 >= 1.0f) {
                ur0Var.L = 0.0f;
                ur0Var.K = false;
                ur0Var.J = 0;
            }
            invalidate();
        }
        if (this.f26896n3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f1481f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.f26896n3 = rcVarArr[currentAccount];
        }
        this.f26896n3.a(this);
        if (!yu0Var.f30376o1) {
            yu0Var.f30378p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yu0 yu0Var = this.f30051u3;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
        if (n2Var != null && n2Var.isInPreviewMode()) {
            this.f30047q3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                yu0Var.f30392v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f30048r3 - this.f30047q3;
                yu0Var.f30392v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f30048r3 = this.f30047q3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f30051u3.f30380q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f30051u3.f30374n1;
    }

    @Override
    public final int getColumnsCount() {
        yu0 yu0Var = this.f30051u3;
        if (yu0.p0(yu0Var.f30378p1)) {
            return yu0Var.f30371m1[1];
        }
        return yu0Var.f30371m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f30051u3.O1;
    }

    @Override
    public final tk0 getMovingAdapter() {
        yu0 yu0Var = this.f30051u3;
        if (yu0.p0(yu0Var.f30378p1)) {
            return yu0Var.k1(yu0Var.f30378p1);
        }
        return yu0Var.H;
    }

    @Override
    public final tk0 getSupportingAdapter() {
        yu0 yu0Var = this.f30051u3;
        if (yu0.p0(yu0Var.f30378p1)) {
            return yu0Var.l1(yu0Var.f30378p1);
        }
        return yu0Var.I;
    }

    @Override
    public final qt0 getSupportingListView() {
        return this.f30049s3.f27688r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.K1;
        yu0 yu0Var = this.f30051u3;
        if (z10 && yu0Var.getSelectedTab() == 11 && (n2Var = yu0Var.f30392v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        yu0Var.I();
        s4.h0 adapter = getAdapter();
        fu0 fu0Var = yu0Var.N;
        if (adapter == fu0Var) {
            ArrayList<MessageObject> arrayList = fu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(fu0Var.d).addToPollsQueue(fu0Var.f24094s.f30367j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ur0 ur0Var = this.f30049s3;
        this.f30051u3.G(ur0Var, ur0Var.h, this.f30050t3);
        if (ur0Var.F == 0) {
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
    public final void y1(org.telegram.ui.Cells.t7 t7Var) {
        float f7;
        int messageId = t7Var.getMessageId();
        ur0 ur0Var = this.f30049s3;
        if (messageId == ur0Var.J && t7Var.f21375c.hasBitmapImage()) {
            if (!ur0Var.K) {
                ur0Var.L = 0.0f;
                ur0Var.K = true;
            }
            float f10 = ur0Var.L;
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

    @Override
    public final boolean z1() {
        return this.f30051u3.f30376o1;
    }
}
