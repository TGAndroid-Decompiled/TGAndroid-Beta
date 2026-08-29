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
public final class ma extends FrameLayout {
    public final org.telegram.ui.Components.t9 f24719a;
    public final TextView f24720b;
    public TLRPC.TL_forumTopic f24721c;
    public boolean d;

    public ma(Context context) {
        super(context);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f24719a = t9Var;
        TextView textView = new TextView(context);
        this.f24720b = textView;
        org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f);
        if (LocaleController.isRTL) {
            addView(t9Var, i7.f6.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, i7.f6.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(t9Var, i7.f6.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, i7.f6.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int dp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f24721c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f24721c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f24720b;
        if (isEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (org.telegram.ui.ActionBar.c6) null));
        }
        org.telegram.ui.Components.t9 t9Var = this.f24719a;
        yf.d.p(t9Var, tL_forumTopic, false, false, null);
        if (t9Var != null && t9Var.getImageReceiver() != null && (t9Var.getImageReceiver().getDrawable() instanceof yf.c)) {
            ((yf.c) t9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23047c9, false));
        }
    }
}
