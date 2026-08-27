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

public final class la extends FrameLayout {

    public final org.telegram.ui.Components.n9 f24639a;

    public final TextView f24640b;

    public TLRPC.TL_forumTopic f24641c;
    public boolean d;

    public la(Context context) {
        super(context);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f24639a = n9Var;
        TextView textView = new TextView(context);
        this.f24640b = textView;
        org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f);
        if (LocaleController.isRTL) {
            addView(n9Var, h7.z5.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, h7.z5.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
        } else {
            addView(n9Var, h7.z5.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, h7.z5.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int iDp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - iDp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
            } else {
                canvas.drawLine(iDp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f24641c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f24641c = tL_forumTopic;
        boolean zIsEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f24640b;
        if (zIsEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (org.telegram.ui.ActionBar.c6) null));
        }
        org.telegram.ui.Components.n9 n9Var = this.f24639a;
        wf.c.p(n9Var, tL_forumTopic, false, false, null);
        if (n9Var == null || n9Var.getImageReceiver() == null || !(n9Var.getImageReceiver().getDrawable() instanceof wf.b)) {
            return;
        }
        ((wf.b) n9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23039c9, false));
    }
}
