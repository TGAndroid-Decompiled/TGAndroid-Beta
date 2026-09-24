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
public final class is0 extends zu0 {
    public float f25137q3;
    public float f25138r3;
    public final fs0 f25139s3;
    public final gs0 f25140t3;
    public final jv0 f25141u3;

    public is0(jv0 jv0Var, Context context, fs0 fs0Var, gs0 gs0Var) {
        super(context);
        this.f25141u3 = jv0Var;
        this.f25139s3 = fs0Var;
        this.f25140t3 = gs0Var;
    }

    @Override
    public final boolean A1() {
        return jv0.p0(this.f25141u3.f25529p1);
    }

    @Override
    public final boolean B1() {
        if (this == this.f25139s3.h) {
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
        st0 st0Var = this.f25141u3.Q;
        if (adapter == st0Var && st0Var.e > 0 && i10 == st0Var.d.size() - 1) {
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
        jv0 jv0Var = this.f25141u3;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.f25543v1;
        rt0 rt0Var = jv0Var.f25501c0;
        wr0 wr0Var = jv0Var.f25506e0;
        fs0 fs0Var = this.f25139s3;
        if ((adapter == wr0Var || getAdapter() == rt0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (jv0Var.f25527o1) {
                int i12 = jv0Var.f25529p1;
                if (getAdapter() == rt0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && fs0Var.f23389r.getChildCount() > 0 && (childAt2 = fs0Var.f23389r.getChildAt(0)) != null) {
                    fs0Var.f23389r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), jv0Var.f25525n1);
                    }
                }
            }
            if (getAdapter() != rt0Var) {
                boolean z10 = true;
                if (this.j3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.j3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.j3.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19447z6, this.f30094p2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f30987k3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (m2Var == null || !ChatObject.isChannelAndNotMegaGroup(m2Var.getMessagesController().getChat(Long.valueOf(-jv0Var.f25518j1)))) ? false : false;
                    if (jv0Var.q0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f30987k3 = new StaticLayout(LocaleController.getString(i10), this.j3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f30988l3 = 0.0f;
                    this.f30989m3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f30987k3.getLineCount(); i13++) {
                        this.f30988l3 = Math.max(this.f30988l3, this.f30987k3.getLineWidth(i13));
                        this.f30989m3 = Math.min(this.f30989m3, this.f30987k3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f30988l3) / 2.0f) - this.f30989m3, top - ((this.f30987k3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f30987k3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (fs0Var.K) {
            float f7 = fs0Var.L + 0.010666667f;
            fs0Var.L = f7;
            if (f7 >= 1.0f) {
                fs0Var.L = 0.0f;
                fs0Var.K = false;
                fs0Var.J = 0;
            }
            invalidate();
        }
        if (this.f30990n3 == null) {
            int currentAccount = m2Var.getCurrentAccount();
            ai.rc[] rcVarArr = ai.rc.f1475f;
            if (rcVarArr[currentAccount] == null) {
                rcVarArr[currentAccount] = new ai.rc(currentAccount);
            }
            this.f30990n3 = rcVarArr[currentAccount];
        }
        this.f30990n3.a(this);
        if (!jv0Var.f25527o1) {
            jv0Var.f25529p1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        jv0 jv0Var = this.f25141u3;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.f25543v1;
        if (m2Var != null && m2Var.isInPreviewMode()) {
            this.f25137q3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                jv0Var.f25543v1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f25138r3 - this.f25137q3;
                jv0Var.f25543v1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f25138r3 = this.f25137q3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f25141u3.f25531q1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f25141u3.f25525n1;
    }

    @Override
    public final int getColumnsCount() {
        jv0 jv0Var = this.f25141u3;
        if (jv0.p0(jv0Var.f25529p1)) {
            return jv0Var.f25522m1[1];
        }
        return jv0Var.f25522m1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f25141u3.O1;
    }

    @Override
    public final el0 getMovingAdapter() {
        jv0 jv0Var = this.f25141u3;
        if (jv0.p0(jv0Var.f25529p1)) {
            return jv0Var.k1(jv0Var.f25529p1);
        }
        return jv0Var.H;
    }

    @Override
    public final el0 getSupportingAdapter() {
        jv0 jv0Var = this.f25141u3;
        if (jv0.p0(jv0Var.f25529p1)) {
            return jv0Var.l1(jv0Var.f25529p1);
        }
        return jv0Var.I;
    }

    @Override
    public final bu0 getSupportingListView() {
        return this.f25139s3.f23389r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z10 = this.K1;
        jv0 jv0Var = this.f25141u3;
        if (z10 && jv0Var.getSelectedTab() == 11 && (m2Var = jv0Var.f25543v1) != null) {
            AndroidUtilities.hideKeyboard(m2Var.getParentActivity().getCurrentFocus());
        }
        jv0Var.I();
        s4.h0 adapter = getAdapter();
        qu0 qu0Var = jv0Var.N;
        if (adapter == qu0Var) {
            ArrayList<MessageObject> arrayList = qu0Var.h;
            arrayList.clear();
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    arrayList.add(((org.telegram.ui.Cells.u1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(qu0Var.d).addToPollsQueue(qu0Var.f27763s.f25518j1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        fs0 fs0Var = this.f25139s3;
        this.f25141u3.G(fs0Var, fs0Var.h, this.f25140t3);
        if (fs0Var.F == 0) {
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
        fs0 fs0Var = this.f25139s3;
        if (messageId == fs0Var.J && t7Var.f21200c.hasBitmapImage()) {
            if (!fs0Var.K) {
                fs0Var.L = 0.0f;
                fs0Var.K = true;
            }
            float f10 = fs0Var.L;
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
        return this.f25141u3.f25527o1;
    }
}
