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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.o90;
public final class h7 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f22214a;
    public final e7 f22215b;
    public final TextView f22216c;
    public long d;
    public long f22217e;
    public final int f22218f;
    public final org.telegram.ui.ActionBar.e6 h;

    public h7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f22218f = UserConfig.selectedAccount;
        this.h = e6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f22214a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(y9Var, w7.x5.a(56.0f, 0.0f, 7.0f, 0.0f, 0.0f, 56, 49));
        TextView textView = new TextView(context);
        this.f22216c = textView;
        bi.o(org.telegram.ui.ActionBar.i6.f20909j5, e6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.x5.a(-2.0f, 6.0f, 66.0f, 6.0f, 0.0f, -1, 51));
        this.f22215b = new e7(this, e6Var, 1);
        setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20892i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f22217e;
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
        this.f22216c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.y9 y9Var = this.f22214a;
        y9Var.setAnimatedEmojiDrawable(null);
        ng.a aVar = new ng.a(ng.a.f16847k[0]);
        o90 o90Var = new o90(1, null);
        o90Var.a("");
        o90Var.f29398i = 1.8f;
        fr frVar = new fr(aVar, o90Var, 0, 0);
        frVar.f26503w = true;
        y9Var.setImageDrawable(frVar);
    }
}
