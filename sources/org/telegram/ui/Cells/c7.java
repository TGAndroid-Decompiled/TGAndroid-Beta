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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.y70;

public final class c7 extends FrameLayout {

    public final org.telegram.ui.Components.n9 f24162a;

    public final z6 f24163b;

    public final TextView f24164c;
    public long d;

    public long f24165e;

    public final int f24166f;
    public final org.telegram.ui.ActionBar.c6 h;

    public c7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24166f = UserConfig.selectedAccount;
        this.h = c6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f24162a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(n9Var, h7.z5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f24164c = textView;
        rl.l(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, h7.z5.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f24163b = new z6(this, c6Var, 1);
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f24165e;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z10) {
        this.f24164c.setText(LocaleController.getString(z10 ? R.string.ShareSendToNewTopic : R.string.ShareSendToOffTopic));
        org.telegram.ui.Components.n9 n9Var = this.f24162a;
        n9Var.setAnimatedEmojiDrawable(null);
        wf.a aVar = new wf.a(wf.a.f49301k[0]);
        y70 y70Var = new y70(1, null);
        y70Var.a("");
        y70Var.f34843i = 1.8f;
        dq dqVar = new dq(aVar, y70Var, 0, 0);
        dqVar.f27828w = true;
        n9Var.setImageDrawable(dqVar);
    }
}
