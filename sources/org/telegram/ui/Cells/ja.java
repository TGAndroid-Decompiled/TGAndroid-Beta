package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
public final class ja extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.k9 f29458a;
    public final TextView f29459b;
    public TLRPC.TL_forumTopic f29460c;
    public boolean d;

    public ja(Context context) {
        super(context);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29458a = k9Var;
        TextView textView = new TextView(context);
        this.f29459b = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.G6, null, 1, 16.0f);
        if (bd.f21784a0) {
            addView(k9Var, mf.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, mf.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(k9Var, mf.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, mf.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int L = org.telegram.messenger.g0.L(56.0f);
            if (bd.f21784a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f29460c;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f29460c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f29459b;
        if (isEmpty) {
            textView.setText(org.telegram.messenger.g0.D2(tL_forumTopic.title));
        } else {
            textView.setText(org.telegram.messenger.g0.w1(org.telegram.messenger.g0.D2(tL_forumTopic.title), tL_forumTopic.searchQuery, null));
        }
        org.telegram.ui.Components.k9 k9Var = this.f29458a;
        rg.c.p(k9Var, tL_forumTopic, false, false, null);
        if (k9Var != null && k9Var.getImageReceiver() != null && (k9Var.getImageReceiver().t() instanceof rg.b)) {
            ((rg.b) k9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27864c9, false));
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.k9 k9Var = this.f29458a;
        if (k9Var != null) {
            try {
                if (k9Var.getImageReceiver() != null && (k9Var.getImageReceiver().t() instanceof rg.b)) {
                    ((rg.b) k9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27864c9, false));
                    k9Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
