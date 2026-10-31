package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLRPC;
public final class ja extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.g9 f22096a;
    public final TextView f22097b;
    public TLRPC.TL_forumTopic f22098c;
    public boolean d;

    public ja(Context context) {
        super(context);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f22096a = g9Var;
        TextView textView = new TextView(context);
        this.f22097b = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.G6, null, 1, 16.0f);
        if (cd.X) {
            addView(g9Var, w7.b6.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, w7.b6.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(g9Var, w7.b6.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, w7.b6.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int L = org.telegram.messenger.i0.L(56.0f);
            if (cd.X) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f22098c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f22098c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f22097b;
        if (isEmpty) {
            textView.setText(org.telegram.messenger.i0.D2(tL_forumTopic.title));
        } else {
            textView.setText(org.telegram.messenger.i0.w1(org.telegram.messenger.i0.D2(tL_forumTopic.title), tL_forumTopic.searchQuery, null));
        }
        org.telegram.ui.Components.g9 g9Var = this.f22096a;
        gg.e.p(g9Var, tL_forumTopic, false, false, null);
        if (g9Var != null && g9Var.getImageReceiver() != null && (g9Var.getImageReceiver().t() instanceof gg.d)) {
            ((gg.d) g9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20913c9, false));
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.g9 g9Var = this.f22096a;
        if (g9Var != null) {
            try {
                if (g9Var.getImageReceiver() != null && (g9Var.getImageReceiver().t() instanceof gg.d)) {
                    ((gg.d) g9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20913c9, false));
                    g9Var.invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
