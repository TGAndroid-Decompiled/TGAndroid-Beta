package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class ua extends FrameLayout {
    public final org.telegram.ui.Components.w9 f20529a;
    public final TextView f20530b;
    public TLRPC.TL_forumTopic f20531c;
    public boolean d;

    public ua(Context context) {
        super(context);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f20529a = w9Var;
        TextView textView = new TextView(context);
        this.f20530b = textView;
        org.telegram.messenger.a2.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f);
        if (LocaleController.isRTL) {
            addView(w9Var, w7.a6.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, w7.a6.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(w9Var, w7.a6.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, w7.a6.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int dp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f20531c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f20531c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f20530b;
        if (isEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (org.telegram.ui.ActionBar.f6) null));
        }
        org.telegram.ui.Components.w9 w9Var = this.f20529a;
        mg.d.p(w9Var, tL_forumTopic, false, false, null);
        if (w9Var != null && w9Var.getImageReceiver() != null && (w9Var.getImageReceiver().getDrawable() instanceof mg.c)) {
            ((mg.c) w9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17913c9, false));
        }
    }
}
