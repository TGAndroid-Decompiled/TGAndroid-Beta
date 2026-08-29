package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.jq;
public final class d7 extends FrameLayout {
    public final org.telegram.ui.Components.t9 f24234a;
    public final a7 f24235b;
    public final TextView f24236c;
    public long d;
    public long f24237e;
    public final int f24238f;
    public final org.telegram.ui.ActionBar.c6 h;

    public d7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24238f = UserConfig.selectedAccount;
        this.h = c6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f24234a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(t9Var, i7.f6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f24236c = textView;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, i7.f6.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f24235b = new a7(this, c6Var, 1);
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f24237e;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z10) {
        int i10;
        if (z10) {
            i10 = R.string.ShareSendToNewTopic;
        } else {
            i10 = R.string.ShareSendToOffTopic;
        }
        this.f24236c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.t9 t9Var = this.f24234a;
        t9Var.setAnimatedEmojiDrawable(null);
        yf.b bVar = new yf.b(yf.b.f50526k[0]);
        h80 h80Var = new h80(1, null);
        h80Var.a("");
        h80Var.f29135i = 1.8f;
        jq jqVar = new jq(bVar, h80Var, 0, 0);
        jqVar.f29792w = true;
        t9Var.setImageDrawable(jqVar);
    }
}
