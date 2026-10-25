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
public final class dt0 extends qv0 {
    public float f27598u3;
    public float f27599v3;
    public final at0 f27600w3;
    public final bt0 f27601x3;
    public final aw0 y3;

    public dt0(aw0 aw0Var, Context context, at0 at0Var, bt0 bt0Var) {
        super(context);
        this.y3 = aw0Var;
        this.f27600w3 = at0Var;
        this.f27601x3 = bt0Var;
    }

    @Override
    public final void C1(org.telegram.ui.Cells.w7 w7Var) {
        float f7;
        int messageId = w7Var.getMessageId();
        at0 at0Var = this.f27600w3;
        if (messageId == at0Var.I && w7Var.f25636c.hasBitmapImage()) {
            if (!at0Var.J) {
                at0Var.K = 0.0f;
                at0Var.J = true;
            }
            float f10 = at0Var.K;
            if (f10 < 0.3f) {
                f7 = f10 / 0.3f;
            } else if (f10 > 0.7f) {
                f7 = (1.0f - f10) / 0.3f;
            } else {
                f7 = 1.0f;
            }
            w7Var.setHighlightProgress(f7);
            return;
        }
        w7Var.setHighlightProgress(0.0f);
    }

    @Override
    public final boolean D1() {
        return this.y3.f26684q1;
    }

    @Override
    public final boolean E1() {
        return aw0.w0(this.y3.f26687r1);
    }

    @Override
    public final boolean F1() {
        if (this == this.f27600w3.h) {
            return true;
        }
        return false;
    }

    public final View G1() {
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
        ju0 ju0Var = this.y3.S;
        if (adapter == ju0Var && ju0Var.e > 0 && i10 == ju0Var.d.size() - 1) {
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
        aw0 aw0Var = this.y3;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26702x1;
        hu0 hu0Var = aw0Var.f26648e0;
        ts0 ts0Var = aw0Var.f26655g0;
        at0 at0Var = this.f27600w3;
        if ((adapter == ts0Var || getAdapter() == hu0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (aw0Var.f26684q1) {
                int i12 = aw0Var.f26687r1;
                if (getAdapter() == hu0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && at0Var.f33157n.getChildCount() > 0 && (childAt2 = at0Var.f33157n.getChildAt(0)) != null) {
                    at0Var.f33157n.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), aw0Var.f26682p1);
                    }
                }
            }
            if (getAdapter() != hu0Var) {
                boolean z10 = true;
                if (this.f32041n3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f32041n3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f32041n3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23765z6, this.f30644n2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f32042o3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (r2Var == null || !ChatObject.isChannelAndNotMegaGroup(r2Var.getMessagesController().getChat(Long.valueOf(-aw0Var.l1)))) ? false : false;
                    if (aw0Var.x0()) {
                        if (z10) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f32042o3 = new StaticLayout(LocaleController.getString(i10), this.f32041n3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f32043p3 = 0.0f;
                    this.f32044q3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f32042o3.getLineCount(); i13++) {
                        this.f32043p3 = Math.max(this.f32043p3, this.f32042o3.getLineWidth(i13));
                        this.f32044q3 = Math.min(this.f32044q3, this.f32042o3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f32043p3) / 2.0f) - this.f32044q3, top - ((this.f32042o3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f32042o3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (at0Var.J) {
            float f7 = at0Var.K + 0.010666667f;
            at0Var.K = f7;
            if (f7 >= 1.0f) {
                at0Var.K = 0.0f;
                at0Var.J = false;
                at0Var.I = 0;
            }
            invalidate();
        }
        if (this.f32045r3 == null) {
            int currentAccount = r2Var.getCurrentAccount();
            di.ga[] gaVarArr = di.ga.f8599f;
            if (gaVarArr[currentAccount] == null) {
                gaVarArr[currentAccount] = new di.ga(currentAccount);
            }
            this.f32045r3 = gaVarArr[currentAccount];
        }
        this.f32045r3.a(this);
        if (!aw0Var.f26684q1) {
            aw0Var.f26687r1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        aw0 aw0Var = this.y3;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26702x1;
        if (r2Var != null && r2Var.isInPreviewMode()) {
            this.f27598u3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                aw0Var.f26702x1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f7 = this.f27599v3 - this.f27598u3;
                aw0Var.f26702x1.movePreviewFragment(f7);
                if (f7 < 0.0f) {
                    this.f27599v3 = this.f27598u3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.y3.f26690s1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.y3.f26682p1;
    }

    @Override
    public final int getColumnsCount() {
        aw0 aw0Var = this.y3;
        if (aw0.w0(aw0Var.f26687r1)) {
            return aw0Var.f26679o1[1];
        }
        return aw0Var.f26679o1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.y3.R1;
    }

    @Override
    public final tl0 getMovingAdapter() {
        aw0 aw0Var = this.y3;
        if (aw0.w0(aw0Var.f26687r1)) {
            return aw0Var.t1(aw0Var.f26687r1);
        }
        return aw0Var.J;
    }

    @Override
    public final tl0 getSupportingAdapter() {
        aw0 aw0Var = this.y3;
        if (aw0.w0(aw0Var.f26687r1)) {
            return aw0Var.u1(aw0Var.f26687r1);
        }
        return aw0Var.K;
    }

    @Override
    public final su0 getSupportingListView() {
        return this.f27600w3.f33157n;
    }

    @Override
    public final void l0(int i10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        boolean z10 = this.I1;
        aw0 aw0Var = this.y3;
        if (z10 && aw0Var.getSelectedTab() == 11 && (r2Var = aw0Var.f26702x1) != null) {
            AndroidUtilities.hideKeyboard(r2Var.getParentActivity().getCurrentFocus());
        }
        aw0Var.P();
        s4.h0 adapter = getAdapter();
        iv0 iv0Var = aw0Var.P;
        if (adapter == iv0Var) {
            ArrayList<MessageObject> arrayList = iv0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    arrayList.add(((org.telegram.ui.Cells.s1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(iv0Var.d).addToPollsQueue(iv0Var.f29385s.l1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        at0 at0Var = this.f27600w3;
        this.y3.M(at0Var, at0Var.h, this.f27601x3);
        if (at0Var.E == 0) {
            PhotoViewer.u1().z0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View G1;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (i10 == 4096) {
            View G12 = G1();
            if (G12 != null && G12.canScrollVertically(1) && G12.performAccessibilityAction(i10, bundle)) {
                return true;
            }
        } else {
            if (i10 == 8192) {
                if (!canScrollVertically(-1) && (G1 = G1()) != null && G1.canScrollVertically(-1) && G1.performAccessibilityAction(i10, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }
}
