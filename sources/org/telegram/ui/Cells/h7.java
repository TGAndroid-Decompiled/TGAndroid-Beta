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
import org.telegram.messenger.ai;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.o90;
public final class h7 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f22202a;
    public final e7 f22203b;
    public final TextView f22204c;
    public long d;
    public long f22205e;
    public final int f22206f;
    public final org.telegram.ui.ActionBar.d6 h;

    public h7(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f22206f = UserConfig.selectedAccount;
        this.h = d6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f22202a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(y9Var, w7.x5.a(56.0f, 0.0f, 7.0f, 0.0f, 0.0f, 56, 49));
        TextView textView = new TextView(context);
        this.f22204c = textView;
        ai.o(org.telegram.ui.ActionBar.h6.f20894j5, d6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.x5.a(-2.0f, 6.0f, 66.0f, 6.0f, 0.0f, -1, 51));
        this.f22203b = new e7(this, d6Var, 1);
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20877i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f22205e;
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
        this.f22204c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.y9 y9Var = this.f22202a;
        y9Var.setAnimatedEmojiDrawable(null);
        ng.a aVar = new ng.a(ng.a.f16892k[0]);
        o90 o90Var = new o90(1, null);
        o90Var.a("");
        o90Var.f29355i = 1.8f;
        fr frVar = new fr(aVar, o90Var, 0, 0);
        frVar.f26475w = true;
        y9Var.setImageDrawable(frVar);
    }
}
