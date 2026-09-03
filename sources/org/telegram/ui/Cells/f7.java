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
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.pq;
public final class f7 extends FrameLayout {
    public final org.telegram.ui.Components.p9 f22811a;
    public final c7 f22812b;
    public final TextView f22813c;
    public long d;
    public long f22814e;
    public final int f22815f;
    public final org.telegram.ui.ActionBar.g6 h;

    public f7(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22815f = UserConfig.selectedAccount;
        this.h = g6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f22811a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(p9Var, k7.c6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f22813c = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f21768j5, g6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, k7.c6.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f22812b = new c7(this, g6Var, 1);
        setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f22814e;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z4) {
        int i10;
        if (z4) {
            i10 = R.string.ShareSendToNewTopic;
        } else {
            i10 = R.string.ShareSendToOffTopic;
        }
        this.f22813c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.p9 p9Var = this.f22811a;
        p9Var.setAnimatedEmojiDrawable(null);
        bg.b bVar = new bg.b(bg.b.f1966k[0]);
        o80 o80Var = new o80(1, null);
        o80Var.a("");
        o80Var.f29708i = 1.8f;
        pq pqVar = new pq(bVar, o80Var, 0, 0);
        pqVar.f30166w = true;
        p9Var.setImageDrawable(pqVar);
    }
}
