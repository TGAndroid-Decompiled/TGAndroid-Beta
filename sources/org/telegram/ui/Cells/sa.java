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
public final class sa extends FrameLayout {
    public final org.telegram.ui.Components.x9 f22853a;
    public final TextView f22854b;
    public TLRPC.TL_forumTopic f22855c;
    public boolean d;

    public sa(Context context) {
        super(context);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f22853a = x9Var;
        TextView textView = new TextView(context);
        this.f22854b = textView;
        org.telegram.messenger.w1.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f);
        if (LocaleController.isRTL) {
            addView(x9Var, w7.x5.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, w7.x5.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(x9Var, w7.x5.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, w7.x5.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int dp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20785k0);
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20785k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f22855c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f22855c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f22854b;
        if (isEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (org.telegram.ui.ActionBar.f6) null));
        }
        org.telegram.ui.Components.x9 x9Var = this.f22853a;
        og.d.p(x9Var, tL_forumTopic, false, false, null);
        if (x9Var != null && x9Var.getImageReceiver() != null && (x9Var.getImageReceiver().getDrawable() instanceof og.c)) {
            ((og.c) x9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20648c9, false));
        }
    }
}
