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
public final class dr0 extends ut0 {
    public float f27797m3;
    public float f27798n3;
    public final ar0 f27799o3;
    public final br0 f27800p3;
    public final eu0 f27801q3;

    public dr0(eu0 eu0Var, Context context, ar0 ar0Var, br0 br0Var) {
        super(context);
        this.f27801q3 = eu0Var;
        this.f27799o3 = ar0Var;
        this.f27800p3 = br0Var;
    }

    @Override
    public final boolean A1() {
        return eu0.p0(this.f27801q3.l1);
    }

    @Override
    public final boolean B1() {
        if (this == this.f27799o3.h) {
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
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override
    public final Integer W0(int i9) {
        f2.r0 adapter = getAdapter();
        ns0 ns0Var = this.f27801q3.M;
        if (adapter == ns0Var && ns0Var.f31178e > 0 && i9 == ns0Var.d.size() - 1) {
            return 0;
        }
        return super.W0(i9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int i9;
        int i10;
        View childAt2;
        f2.r0 adapter = getAdapter();
        eu0 eu0Var = this.f27801q3;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        ms0 ms0Var = eu0Var.V;
        tq0 tq0Var = eu0Var.f28121a0;
        ar0 ar0Var = this.f27799o3;
        if ((adapter == tq0Var || getAdapter() == ms0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (eu0Var.f28146k1) {
                int i11 = eu0Var.l1;
                if (getAdapter() == ms0Var) {
                    i10 = 8;
                } else {
                    i10 = 9;
                }
                if (i11 == i10 && ar0Var.f34761r.getChildCount() > 0 && (childAt2 = ar0Var.f34761r.getChildAt(0)) != null) {
                    ar0Var.f34761r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), eu0Var.f28144j1);
                    }
                }
            }
            if (getAdapter() != ms0Var) {
                boolean z10 = true;
                if (this.f33136f3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f33136f3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f33136f3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, this.f34260l2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f33137g3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z10 = (o2Var == null || !ChatObject.isChannelAndNotMegaGroup(o2Var.getMessagesController().getChat(Long.valueOf(-eu0Var.f28136f1)))) ? false : false;
                    if (eu0Var.q0()) {
                        if (z10) {
                            i9 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i9 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i9 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f33137g3 = new StaticLayout(LocaleController.getString(i9), this.f33136f3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f33138h3 = 0.0f;
                    this.f33139i3 = measuredWidth;
                    for (int i12 = 0; i12 < this.f33137g3.getLineCount(); i12++) {
                        this.f33138h3 = Math.max(this.f33138h3, this.f33137g3.getLineWidth(i12));
                        this.f33139i3 = Math.min(this.f33139i3, this.f33137g3.getLineLeft(i12));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f33138h3) / 2.0f) - this.f33139i3, top - ((this.f33137g3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f33137g3.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (ar0Var.G) {
            float f10 = ar0Var.H + 0.010666667f;
            ar0Var.H = f10;
            if (f10 >= 1.0f) {
                ar0Var.H = 0.0f;
                ar0Var.G = false;
                ar0Var.F = 0;
            }
            invalidate();
        }
        if (this.f33140j3 == null) {
            int currentAccount = o2Var.getCurrentAccount();
            ih.u9[] u9VarArr = ih.u9.f12212f;
            if (u9VarArr[currentAccount] == null) {
                u9VarArr[currentAccount] = new ih.u9(currentAccount);
            }
            this.f33140j3 = u9VarArr[currentAccount];
        }
        this.f33140j3.a(this);
        if (!eu0Var.f28146k1) {
            eu0Var.l1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eu0 eu0Var = this.f27801q3;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        if (o2Var != null && o2Var.isInPreviewMode()) {
            this.f27797m3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                eu0Var.f28160r1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f27798n3 - this.f27797m3;
                eu0Var.f28160r1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f27798n3 = this.f27797m3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f27801q3.f28148m1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f27801q3.f28144j1;
    }

    @Override
    public final int getColumnsCount() {
        eu0 eu0Var = this.f27801q3;
        if (eu0.p0(eu0Var.l1)) {
            return eu0Var.f28142i1[1];
        }
        return eu0Var.f28142i1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f27801q3.K1;
    }

    @Override
    public final gk0 getMovingAdapter() {
        eu0 eu0Var = this.f27801q3;
        if (eu0.p0(eu0Var.l1)) {
            return eu0Var.k1(eu0Var.l1);
        }
        return eu0Var.D;
    }

    @Override
    public final gk0 getSupportingAdapter() {
        eu0 eu0Var = this.f27801q3;
        if (eu0.p0(eu0Var.l1)) {
            return eu0Var.l1(eu0Var.l1);
        }
        return eu0Var.E;
    }

    @Override
    public final ws0 getSupportingListView() {
        return this.f27799o3.f34761r;
    }

    @Override
    public final void k0(int i9, int i10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        boolean z10 = this.G1;
        eu0 eu0Var = this.f27801q3;
        if (z10 && eu0Var.getSelectedTab() == 11 && (o2Var = eu0Var.f28160r1) != null) {
            AndroidUtilities.hideKeyboard(o2Var.getParentActivity().getCurrentFocus());
        }
        eu0Var.I();
        f2.r0 adapter = getAdapter();
        lt0 lt0Var = eu0Var.J;
        if (adapter == lt0Var) {
            ArrayList<MessageObject> arrayList = lt0Var.h;
            arrayList.clear();
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    arrayList.add(((org.telegram.ui.Cells.t1) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(lt0Var.d).addToPollsQueue(lt0Var.f30550s.f28136f1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        ar0 ar0Var = this.f27799o3;
        this.f27801q3.G(ar0Var, ar0Var.h, this.f27800p3);
        if (ar0Var.B == 0) {
            PhotoViewer.t1().x0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        View C1;
        try {
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (i9 == 4096) {
            View C12 = C1();
            if (C12 != null && C12.canScrollVertically(1) && C12.performAccessibilityAction(i9, bundle)) {
                return true;
            }
        } else {
            if (i9 == 8192) {
                if (!canScrollVertically(-1) && (C1 = C1()) != null && C1.canScrollVertically(-1) && C1.performAccessibilityAction(i9, bundle)) {
                    return true;
                }
            }
            return super.performAccessibilityAction(i9, bundle);
        }
        return super.performAccessibilityAction(i9, bundle);
    }

    @Override
    public final void y1(org.telegram.ui.Cells.r7 r7Var) {
        float f10;
        int messageId = r7Var.getMessageId();
        ar0 ar0Var = this.f27799o3;
        if (messageId == ar0Var.F && r7Var.f25094c.hasBitmapImage()) {
            if (!ar0Var.G) {
                ar0Var.H = 0.0f;
                ar0Var.G = true;
            }
            float f11 = ar0Var.H;
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
        return this.f27801q3.f28146k1;
    }
}
