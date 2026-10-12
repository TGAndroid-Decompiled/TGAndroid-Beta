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
import org.telegram.messenger.am;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.r90;
public final class g7 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f21916a;
    public final d7 f21917b;
    public final TextView f21918c;
    public long d;
    public long f21919e;
    public final int f21920f;
    public final org.telegram.ui.ActionBar.c6 h;

    public g7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f21920f = UserConfig.selectedAccount;
        this.h = c6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f21916a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(y9Var, w7.w5.a(56.0f, 0.0f, 7.0f, 0.0f, 0.0f, 56, 49));
        TextView textView = new TextView(context);
        this.f21918c = textView;
        am.o(org.telegram.ui.ActionBar.h6.f20667j5, c6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.w5.a(-2.0f, 6.0f, 66.0f, 6.0f, 0.0f, -1, 51));
        this.f21917b = new d7(this, c6Var, 1);
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20650i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f21919e;
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
        this.f21918c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.y9 y9Var = this.f21916a;
        y9Var.setAnimatedEmojiDrawable(null);
        ng.a aVar = new ng.a(ng.a.f16595k[0]);
        r90 r90Var = new r90(1, null);
        r90Var.a("");
        r90Var.f30107i = 1.8f;
        hr hrVar = new hr(aVar, r90Var, 0, 0);
        hrVar.f26897w = true;
        y9Var.setImageDrawable(hrVar);
    }
}
