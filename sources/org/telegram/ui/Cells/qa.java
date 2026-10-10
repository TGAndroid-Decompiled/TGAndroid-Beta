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
public final class qa extends FrameLayout {
    public final org.telegram.ui.Components.y9 f22700a;
    public final TextView f22701b;
    public TLRPC.TL_forumTopic f22702c;
    public boolean d;

    public qa(Context context) {
        super(context);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f22700a = y9Var;
        TextView textView = new TextView(context);
        this.f22701b = textView;
        org.telegram.messenger.q.m(16.0f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, textView);
        if (LocaleController.isRTL) {
            addView(y9Var, w7.x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, 30, 21));
            addView(textView, w7.x5.a(-2.0f, 12.0f, 0.0f, 56.0f, 0.0f, -1, 21));
            return;
        }
        addView(y9Var, w7.x5.a(30.0f, 12.0f, 0.0f, 12.0f, 0.0f, 30, 16));
        addView(textView, w7.x5.a(-2.0f, 56.0f, 0.0f, 12.0f, 0.0f, -1, 16));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int dp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20923k0);
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20923k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f22702c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f22702c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f22701b;
        if (isEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (org.telegram.ui.ActionBar.e6) null));
        }
        org.telegram.ui.Components.y9 y9Var = this.f22700a;
        ng.d.p(y9Var, tL_forumTopic, false, false, null);
        if (y9Var != null && y9Var.getImageReceiver() != null && (y9Var.getImageReceiver().getDrawable() instanceof ng.c)) {
            ((ng.c) y9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20787c9, false));
        }
    }
}
