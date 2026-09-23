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
import org.telegram.messenger.ul;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.qq;
public final class g7 extends FrameLayout {
    public final org.telegram.ui.Components.w9 f20105a;
    public final d7 f20106b;
    public final TextView f20107c;
    public long d;
    public long e;
    public final int f20108f;
    public final org.telegram.ui.ActionBar.d6 h;

    public g7(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f20108f = UserConfig.selectedAccount;
        this.h = d6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f20105a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, w7.x5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f20107c = textView;
        ul.o(org.telegram.ui.ActionBar.h6.f18895j5, d6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.x5.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f20106b = new d7(this, d6Var, 1);
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.e;
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
        this.f20107c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.w9 w9Var = this.f20105a;
        w9Var.setAnimatedEmojiDrawable(null);
        ng.a aVar = new ng.a(ng.a.f15192k[0]);
        m80 m80Var = new m80(1, null);
        m80Var.a("");
        m80Var.f26140i = 1.8f;
        qq qqVar = new qq(aVar, m80Var, 0, 0);
        qqVar.f27431w = true;
        w9Var.setImageDrawable(qqVar);
    }
}
