package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h90;
public final class l7 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f24391a;
    public final i7 f24392b;
    public final TextView f24393c;
    public long d;
    public long e;
    public final int f24394f;
    public final org.telegram.ui.ActionBar.u6 h;

    public l7(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f24394f = UserConfig.selectedAccount;
        this.h = u6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f24391a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(y9Var, gb1.h(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f24393c = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, u6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, gb1.h(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f24392b = new i7(this, u6Var, 1);
        int i10 = org.telegram.ui.ActionBar.y6.f23448i6;
        Drawable Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.x0(null, i10, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(this, Z, null, N, null);
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
        this.f24393c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.y9 y9Var = this.f24391a;
        y9Var.setAnimatedEmojiDrawable(null);
        pg.a aVar = new pg.a(pg.a.f46842k[0]);
        h90 h90Var = new h90(1, null);
        h90Var.a("");
        h90Var.f28878i = 1.8f;
        ar arVar = new ar(aVar, h90Var, 0, 0);
        arVar.f26599w = true;
        y9Var.setImageDrawable(arVar);
    }
}
