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
public final class oa extends FrameLayout {
    public final org.telegram.ui.Components.p9 f23323a;
    public final TextView f23324b;
    public TLRPC.TL_forumTopic f23325c;
    public boolean d;

    public oa(Context context) {
        super(context);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f23323a = p9Var;
        TextView textView = new TextView(context);
        this.f23324b = textView;
        org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), 1, 16.0f);
        if (LocaleController.isRTL) {
            addView(p9Var, k7.c6.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, k7.c6.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(p9Var, k7.c6.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, k7.c6.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int dp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f23325c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f23325c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f23324b;
        if (isEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (org.telegram.ui.ActionBar.g6) null));
        }
        org.telegram.ui.Components.p9 p9Var = this.f23323a;
        bg.e.p(p9Var, tL_forumTopic, false, false, null);
        if (p9Var != null && p9Var.getImageReceiver() != null && (p9Var.getImageReceiver().getDrawable() instanceof bg.d)) {
            ((bg.d) p9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21646c9, false));
        }
    }
}
