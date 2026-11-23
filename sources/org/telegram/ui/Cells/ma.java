package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
public final class ma extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.p9 f31185a;
    public final TextView f31186b;
    public TLRPC.TL_forumTopic f31187c;
    public boolean d;

    public ma(Context context) {
        super(context);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f31185a = p9Var;
        TextView textView = new TextView(context);
        this.f31186b = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.G6, null, 1, 16.0f);
        if (gd.f24314a0) {
            addView(p9Var, c8.na.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, c8.na.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(p9Var, c8.na.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, c8.na.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int L = org.telegram.messenger.g0.L(56.0f);
            if (gd.f24314a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f31187c;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f31187c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f31186b;
        if (isEmpty) {
            textView.setText(org.telegram.messenger.g0.D2(tL_forumTopic.title));
        } else {
            textView.setText(org.telegram.messenger.g0.w1(org.telegram.messenger.g0.D2(tL_forumTopic.title), tL_forumTopic.searchQuery, null));
        }
        org.telegram.ui.Components.p9 p9Var = this.f31185a;
        qg.c.q(p9Var, tL_forumTopic, false, false, null);
        if (p9Var != null && p9Var.getImageReceiver() != null && (p9Var.getImageReceiver().t() instanceof qg.b)) {
            ((qg.b) p9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29436c9, false));
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.p9 p9Var = this.f31185a;
        if (p9Var != null) {
            try {
                if (p9Var.getImageReceiver() != null && (p9Var.getImageReceiver().t() instanceof qg.b)) {
                    ((qg.b) p9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29436c9, false));
                    p9Var.invalidate();
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
