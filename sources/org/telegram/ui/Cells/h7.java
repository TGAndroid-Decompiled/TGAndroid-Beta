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
import org.telegram.messenger.yh;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.m90;
public final class h7 extends FrameLayout {
    public final org.telegram.ui.Components.z9 f21276a;
    public final e7 f21277b;
    public final TextView f21278c;
    public long d;
    public long e;
    public final int f21279f;
    public final org.telegram.ui.ActionBar.c6 h;

    public h7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f21279f = UserConfig.selectedAccount;
        this.h = c6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f21276a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(z9Var, w7.a6.a(56.0f, 0.0f, 7.0f, 0.0f, 0.0f, 56, 49));
        TextView textView = new TextView(context);
        this.f21278c = textView;
        yh.n(org.telegram.ui.ActionBar.g6.f20007j5, c6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.a6.a(-2.0f, 6.0f, 66.0f, 6.0f, 0.0f, -1, 51));
        this.f21277b = new e7(this, c6Var, 1);
        setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        this.f21278c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.z9 z9Var = this.f21276a;
        z9Var.setAnimatedEmojiDrawable(null);
        og.a aVar = new og.a(og.a.f16639k[0]);
        m90 m90Var = new m90(1, null);
        m90Var.a("");
        m90Var.f27337i = 1.8f;
        cr crVar = new cr(aVar, m90Var, 0, 0);
        crVar.f24198w = true;
        z9Var.setImageDrawable(crVar);
    }
}
