package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
public final class ja extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.i9 f30519a;
    public final TextView f30520b;
    public TLRPC.TL_forumTopic f30521c;
    public boolean d;

    public ja(Context context) {
        super(context);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f30519a = i9Var;
        TextView textView = new TextView(context);
        this.f30520b = textView;
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.G6, null, 1, 16.0f);
        if (hd.f24104a0) {
            addView(i9Var, c8.ja.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, c8.ja.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(i9Var, c8.ja.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, c8.ja.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int L = org.telegram.messenger.g0.L(56.0f);
            if (hd.f24104a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f30521c;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f30521c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f30520b;
        if (isEmpty) {
            textView.setText(org.telegram.messenger.g0.D2(tL_forumTopic.title));
        } else {
            textView.setText(org.telegram.messenger.g0.w1(org.telegram.messenger.g0.D2(tL_forumTopic.title), tL_forumTopic.searchQuery, null));
        }
        org.telegram.ui.Components.i9 i9Var = this.f30519a;
        qg.c.p(i9Var, tL_forumTopic, false, false, null);
        if (i9Var != null && i9Var.getImageReceiver() != null && (i9Var.getImageReceiver().t() instanceof qg.b)) {
            ((qg.b) i9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28834c9, false));
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.i9 i9Var = this.f30519a;
        if (i9Var != null) {
            try {
                if (i9Var.getImageReceiver() != null && (i9Var.getImageReceiver().t() instanceof qg.b)) {
                    ((qg.b) i9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28834c9, false));
                    i9Var.invalidate();
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
