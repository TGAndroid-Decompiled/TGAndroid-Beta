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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.u80;
public final class h7 extends FrameLayout {
    public final org.telegram.ui.Components.w9 f20367a;
    public final e7 f20368b;
    public final TextView f20369c;
    public long d;
    public long e;
    public final int f20370f;
    public final org.telegram.ui.ActionBar.e6 h;

    public h7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f20370f = UserConfig.selectedAccount;
        this.h = e6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f20367a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, w7.y5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f20369c = textView;
        wh.m(org.telegram.ui.ActionBar.j6.f19169j5, e6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.y5.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f20368b = new e7(this, e6Var, 1);
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19152i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        this.f20369c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.w9 w9Var = this.f20367a;
        w9Var.setAnimatedEmojiDrawable(null);
        ng.a aVar = new ng.a(ng.a.f15401k[0]);
        u80 u80Var = new u80(1, null);
        u80Var.a("");
        u80Var.f28662i = 1.8f;
        pq pqVar = new pq(aVar, u80Var, 0, 0);
        pqVar.f27303w = true;
        w9Var.setImageDrawable(pqVar);
    }
}
