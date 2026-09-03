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
    public float f32819n3;
    public float f32820o3;
    public final tr0 f32821p3;
    public final ur0 f32822q3;
    public final yu0 f32823r3;

    public wr0(yu0 yu0Var, Context context, tr0 tr0Var, ur0 ur0Var) {
        super(context);
        this.f32823r3 = yu0Var;
        this.f32821p3 = tr0Var;
        this.f32822q3 = ur0Var;
    }

    @Override
    public final boolean A1() {
        if (this == this.f32821p3.h) {
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
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    @Override
    public final Integer V0(int i10) {
        f2.p0 adapter = getAdapter();
        gt0 gt0Var = this.f32823r3.N;
        if (adapter == gt0Var && gt0Var.f27279e > 0 && i10 == gt0Var.d.size() - 1) {
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
        f2.p0 adapter = getAdapter();
        yu0 yu0Var = this.f32823r3;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f33649s1;
        ft0 ft0Var = yu0Var.W;
        mr0 mr0Var = yu0Var.f33610b0;
        tr0 tr0Var = this.f32821p3;
        if ((adapter == mr0Var || getAdapter() == ft0Var) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.R(childAt) == 0) {
            int top = childAt.getTop();
            if (yu0Var.l1) {
                int i12 = yu0Var.f33634m1;
                if (getAdapter() == ft0Var) {
                    i11 = 8;
                } else {
                    i11 = 9;
                }
                if (i12 == i11 && tr0Var.f30522r.getChildCount() > 0 && (childAt2 = tr0Var.f30522r.getChildAt(0)) != null) {
                    tr0Var.f30522r.getClass();
                    if (RecyclerView.R(childAt2) == 0) {
                        top = AndroidUtilities.lerp(top, childAt2.getTop(), yu0Var.f33632k1);
                    }
                }
            }
            if (getAdapter() != ft0Var) {
                boolean z4 = true;
                if (this.f29891g3 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f29891g3 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f29891g3.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22055z6, this.f31106m2));
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                StaticLayout staticLayout = this.f29892h3;
                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                    z4 = (p2Var == null || !ChatObject.isChannelAndNotMegaGroup(p2Var.getMessagesController().getChat(Long.valueOf(-yu0Var.f33624g1)))) ? false : false;
                    if (yu0Var.q0()) {
                        if (z4) {
                            i10 = R.string.ProfileStoriesArchiveChannelHint;
                        } else {
                            i10 = R.string.ProfileStoriesArchiveGroupHint;
                        }
                    } else {
                        i10 = R.string.ProfileStoriesArchiveHint;
                    }
                    this.f29892h3 = new StaticLayout(LocaleController.getString(i10), this.f29891g3, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    this.f29893i3 = 0.0f;
                    this.f29894j3 = measuredWidth;
                    for (int i13 = 0; i13 < this.f29892h3.getLineCount(); i13++) {
                        this.f29893i3 = Math.max(this.f29893i3, this.f29892h3.getLineWidth(i13));
                        this.f29894j3 = Math.min(this.f29894j3, this.f29892h3.getLineLeft(i13));
                    }
                }
                canvas.save();
                canvas.translate(((getWidth() - this.f29893i3) / 2.0f) - this.f29894j3, top - ((this.f29892h3.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                this.f29892h3.draw(canvas);
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
        if (this.f29895k3 == null) {
            int currentAccount = p2Var.getCurrentAccount();
            oh.q9[] q9VarArr = oh.q9.f17670f;
            if (q9VarArr[currentAccount] == null) {
                q9VarArr[currentAccount] = new oh.q9(currentAccount);
            }
            this.f29895k3 = q9VarArr[currentAccount];
        }
        this.f29895k3.a(this);
        if (!yu0Var.l1) {
            yu0Var.f33634m1 = -1;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yu0 yu0Var = this.f32823r3;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f33649s1;
        if (p2Var != null && p2Var.isInPreviewMode()) {
            this.f32819n3 = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                yu0Var.f33649s1.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f10 = this.f32820o3 - this.f32819n3;
                yu0Var.f33649s1.movePreviewFragment(f10);
                if (f10 < 0.0f) {
                    this.f32820o3 = this.f32819n3;
                }
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f32823r3.f33637n1;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f32823r3.f33632k1;
    }

    @Override
    public final int getColumnsCount() {
        yu0 yu0Var = this.f32823r3;
        if (yu0.p0(yu0Var.f33634m1)) {
            return yu0Var.f33630j1[1];
        }
        return yu0Var.f33630j1[0];
    }

    @Override
    public final SparseArray getMessageAlphaEnter() {
        return this.f32823r3.L1;
    }

    @Override
    public final cl0 getMovingAdapter() {
        yu0 yu0Var = this.f32823r3;
        if (yu0.p0(yu0Var.f33634m1)) {
            return yu0Var.k1(yu0Var.f33634m1);
        }
        return yu0Var.E;
    }

    @Override
    public final cl0 getSupportingAdapter() {
        yu0 yu0Var = this.f32823r3;
        if (yu0.p0(yu0Var.f33634m1)) {
            return yu0Var.l1(yu0Var.f33634m1);
        }
        return yu0Var.F;
    }

    @Override
    public final pt0 getSupportingListView() {
        return this.f32821p3.f30522r;
    }

    @Override
    public final void k0(int i10, int i11) {
        org.telegram.ui.ActionBar.p2 p2Var;
        boolean z4 = this.H1;
        yu0 yu0Var = this.f32823r3;
        if (z4 && yu0Var.getSelectedTab() == 11 && (p2Var = yu0Var.f33649s1) != null) {
            AndroidUtilities.hideKeyboard(p2Var.getParentActivity().getCurrentFocus());
        }
        yu0Var.I();
        f2.p0 adapter = getAdapter();
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
            MessagesController.getInstance(eu0Var.d).addToPollsQueue(eu0Var.f26668s.f33624g1, arrayList);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        tr0 tr0Var = this.f32821p3;
        this.f32823r3.G(tr0Var, tr0Var.h, this.f32822q3);
        if (tr0Var.C == 0) {
            PhotoViewer.t1().y0();
        }
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        View B1;
        try {
        } catch (Exception e6) {
            FileLog.e(e6);
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
    public final void x1(org.telegram.ui.Cells.r7 r7Var) {
        float f10;
        int messageId = r7Var.getMessageId();
        tr0 tr0Var = this.f32821p3;
        if (messageId == tr0Var.G && r7Var.f23563c.hasBitmapImage()) {
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
    public final boolean y1() {
        return this.f32823r3.l1;
    }

    @Override
    public final boolean z1() {
        return yu0.p0(this.f32823r3.f33634m1);
    }
}
