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
public final class js0 extends av0 {
    public float f25432q3;
    public float f25433r3;
    public final gs0 f25434s3;
    public final hs0 f25435t3;
    public final kv0 f25436u3;

    public js0(kv0 kv0Var, Context context, gs0 gs0Var, hs0 hs0Var) {
        super(context);
        this.f25436u3 = kv0Var;
        this.f25434s3 = gs0Var;
        this.f25435t3 = hs0Var;
    }

    @Override
    public final boolean A1() {
        return this.f25436u3.f25832o1;
    }

    @Override
    public final boolean B1() {
        return kv0.p0(this.f25436u3.f25834p1);
    }

    @Override
    public final boolean C1() {
        if (this == this.f25434s3.h) {
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
        tt0 tt0Var = this.f25436u3.Q;
        if (adapter == tt0Var && tt0Var.e > 0 && i10 == tt0Var.d.size() - 1) {
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
        kv0 kv0Var = this.f25436u3;
        org.telegram.ui.ActionBar.n2 n2Var = kv0Var.f25848v1;
        st0 st0Var = kv0Var.f25806c0;
        xr0 xr0Var = kv0Var.f25811e0;
        gs0 gs0Var = this.f25434s3;
        if ((adapter == xr0Var || getAdapter() == st0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.S(childAt) == 0) {
            int top = childAt.getTop();
            if (kv0Var.f25832o1) {
                int i12 = kv0Var.f25834p1;
                if (getAdapter() == st0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && gs0Var.f23685r.getChildCount() > 0 && (childAt2 = gs0Var.f23685r.getChildAt(0)) != null) {
                    gs0Var.f23685r.getClass();
                    if (RecyclerView.S(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), kv0Var.f25830n1);
                    }
                }
            }
            if (getAdapter() != st0Var) {
                boolean z10 = true;
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19464z6, this.f30090p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f22741k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (n2Var == null || !ChatObject.isChannelAndNotMegaGroup(n2Var.getMessagesController().getChat(Long.valueOf(-kv0Var.f25823j1)))) ? false : false;
                    if (kv0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f22741k3 = new StaticLayout(LocaleController.getString(i10), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f22742l3 = 0.0f;
                    this.f22743m3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f22741k3.getLineCount(); i13++) {
                        this.f22742l3 = Math.max(this.f22742l3, this.f22741k3.getLineWidth(i13));
                        this.f22743m3 = Math.min(this.f22743m3, this.f22741k3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f22742l3) / 2.0f) - this.f22743m3, top - ((this.f22741k3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f22741k3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (gs0Var.K) {
            float f7 = gs0Var.L + 0.010666667f;
            gs0Var.L = f7;
            if (f7 >= 1.0f) {
                gs0Var.L = 0.0f;
                gs0Var.K = false;
                gs0Var.J = 0;
            }
            invalidate();
        }
        if (this.f22744n3 == null) {
            int currentAccount = n2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f1486f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.f22744n3 = rcVarArr[currentAccount];
        }
        this.f22744n3.a(this);
        if (!kv0Var.f25832o1) {
            kv0Var.f25834p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kv0 kv0Var = this.f25436u3;
        org.telegram.ui.ActionBar.n2 n2Var = kv0Var.f25848v1;
        if (n2Var != null && n2Var.isInPreviewMode()) {
            this.f25432q3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                kv0Var.f25848v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f25433r3 - this.f25432q3;
                kv0Var.f25848v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f25433r3 = this.f25432q3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f25436u3.f25836q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f25436u3.f25830n1;
    }

    @Override
    public final int getColumnsCount() {
        kv0 kv0Var = this.f25436u3;
        if (kv0.p0(kv0Var.f25834p1)) {
            return kv0Var.f25827m1[1];
        }
        return kv0Var.f25827m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f25436u3.O1;
    }

    @Override
    public final el0 getMovingAdapter() {
        kv0 kv0Var = this.f25436u3;
        if (kv0.p0(kv0Var.f25834p1)) {
            return kv0Var.k1(kv0Var.f25834p1);
        }
        return kv0Var.H;
    }

    @Override
    public final el0 getSupportingAdapter() {
        kv0 kv0Var = this.f25436u3;
        if (kv0.p0(kv0Var.f25834p1)) {
            return kv0Var.l1(kv0Var.f25834p1);
        }
        return kv0Var.I;
    }

    @Override
    public final cu0 getSupportingListView() {
        return this.f25434s3.f23685r;
    }

    @Override
    public final void l0(int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        boolean z10 = this.K1;
        kv0 kv0Var = this.f25436u3;
        if (z10 && kv0Var.getSelectedTab() == 11 && (n2Var = kv0Var.f25848v1) != null) {
            AndroidUtilities.hideKeyboard(n2Var.getParentActivity().getCurrentFocus());
        }
        kv0Var.I();
        s4.h0 adapter = getAdapter();
        ru0 ru0Var = kv0Var.N;
        if (adapter == ru0Var) {
            ArrayList<MessageObject> arrayList = ru0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(ru0Var.d).addToPollsQueue(ru0Var.f27974s.f25823j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        gs0 gs0Var = this.f25434s3;
        this.f25436u3.G(gs0Var, gs0Var.h, this.f25435t3);
        if (gs0Var.F == 0) {
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
        gs0 gs0Var = this.f25434s3;
        if (messageId == gs0Var.J && t7Var.f21178c.hasBitmapImage()) {
            if (!gs0Var.K) {
                gs0Var.L = 0.0f;
                gs0Var.K = true;
            }
            float f10 = gs0Var.L;
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
