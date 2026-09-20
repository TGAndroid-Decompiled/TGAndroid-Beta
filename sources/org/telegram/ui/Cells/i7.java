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
import org.telegram.messenger.rk;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.t80;
public final class i7 extends FrameLayout {
    public final org.telegram.ui.Components.v9 f20437a;
    public final f7 f20438b;
    public final TextView f20439c;
    public long d;
    public long e;
    public final int f20440f;
    public final org.telegram.ui.ActionBar.f6 h;

    public i7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f20440f = UserConfig.selectedAccount;
        this.h = f6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.f20437a = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(v9Var, w7.y5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f20439c = textView;
        rk.n(org.telegram.ui.ActionBar.j6.f19201j5, f6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.y5.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f20438b = new f7(this, f6Var, 1);
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19184i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        this.f20439c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.v9 v9Var = this.f20437a;
        v9Var.setAnimatedEmojiDrawable(null);
        ng.a aVar = new ng.a(ng.a.f15436k[0]);
        t80 t80Var = new t80(1, null);
        t80Var.a("");
        t80Var.f28347i = 1.8f;
        pq pqVar = new pq(aVar, t80Var, 0, 0);
        pqVar.f27426w = true;
        v9Var.setImageDrawable(pqVar);
    }
}
