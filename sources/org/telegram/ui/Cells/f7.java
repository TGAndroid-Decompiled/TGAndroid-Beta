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
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.nq;
public final class f7 extends FrameLayout {
    public final org.telegram.ui.Components.p9 f21064a;
    public final c7 f21065b;
    public final TextView f21066c;
    public long d;
    public long e;
    public final int f21067f;
    public final org.telegram.ui.ActionBar.f6 h;

    public f7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21067f = UserConfig.selectedAccount;
        this.h = f6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f21064a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(p9Var, k7.b6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f21066c = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20012j5, f6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, k7.b6.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f21065b = new c7(this, f6Var, 1);
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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

    public void setAsNewBotForumTopic(boolean z4) {
        int i10;
        if (z4) {
            i10 = R.string.ShareSendToNewTopic;
        } else {
            i10 = R.string.ShareSendToOffTopic;
        }
        this.f21066c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.p9 p9Var = this.f21064a;
        p9Var.setAnimatedEmojiDrawable(null);
        ag.b bVar = new ag.b(ag.b.f175k[0]);
        n80 n80Var = new n80(1, null);
        n80Var.a("");
        n80Var.f27224i = 1.8f;
        nq nqVar = new nq(bVar, n80Var, 0, 0);
        nqVar.f27342w = true;
        p9Var.setImageDrawable(nqVar);
    }
}
