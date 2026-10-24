package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class qa extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.u9 f23054a;
    public final TextView f23055b;
    public TLRPC.TL_forumTopic f23056c;
    public boolean d;

    public qa(Context context) {
        super(context);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f23054a = u9Var;
        TextView textView = new TextView(context);
        this.f23055b = textView;
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.G6, null, 1, 16.0f);
        if (LocaleController.isRTL) {
            addView(u9Var, w7.z5.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, w7.z5.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
            return;
        }
        addView(u9Var, w7.z5.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
        addView(textView, w7.z5.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int dp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.f23056c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f23056c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.f23055b;
        if (isEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (org.telegram.ui.ActionBar.g6) null));
        }
        org.telegram.ui.Components.u9 u9Var = this.f23054a;
        og.d.p(u9Var, tL_forumTopic, false, false, null);
        if (u9Var != null && u9Var.getImageReceiver() != null && (u9Var.getImageReceiver().getDrawable() instanceof og.c)) {
            ((og.c) u9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21168c9, false));
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.u9 u9Var = this.f23054a;
        if (u9Var != null) {
            try {
                if (u9Var.getImageReceiver() != null && (u9Var.getImageReceiver().getDrawable() instanceof og.c)) {
                    ((og.c) u9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21168c9, false));
                    u9Var.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
