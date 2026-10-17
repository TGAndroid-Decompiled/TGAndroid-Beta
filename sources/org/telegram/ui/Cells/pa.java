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
public final class pa extends FrameLayout {
    public final org.telegram.ui.Components.w9 f22760a;
    public final TextView f22761b;
    public TLRPC.TL_forumTopic f22762c;
    public boolean d;

    public pa(Context context) {
        super(context);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f22760a = w9Var;
        TextView textView = new TextView(context);
        this.f22761b = textView;
        org.telegram.messenger.q.m(16.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, textView);
        if (LocaleController.isRTL) {
            addView(w9Var, w7.z5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, 30, 21));
            addView(textView, w7.z5.a(-2.0f, 12.0f, 0.0f, 56.0f, 0.0f, -1, 21));
            return;
        }
        addView(w9Var, w7.z5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, 30, 16));
        addView(textView, w7.z5.a(-2.0f, 56.0f, 0.0f, 12.0f, 0.0f, -1, 16));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int dp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21107k0);
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21107k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f22762c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f22762c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f22761b;
        if (isEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (org.telegram.ui.ActionBar.d6) null));
        }
        org.telegram.ui.Components.w9 w9Var = this.f22760a;
        og.d.p(w9Var, tL_forumTopic, false, false, null);
        if (w9Var != null && w9Var.getImageReceiver() != null && (w9Var.getImageReceiver().getDrawable() instanceof og.c)) {
            ((og.c) w9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20970c9, false));
        }
    }
}
