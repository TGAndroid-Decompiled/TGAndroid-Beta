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
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.yq;
public final class h7 extends FrameLayout {
    public final org.telegram.ui.Components.w9 f22472a;
    public final e7 f22473b;
    public final TextView f22474c;
    public long d;
    public long e;
    public final int f22475f;
    public final org.telegram.ui.ActionBar.g6 h;

    public h7(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22475f = UserConfig.selectedAccount;
        this.h = g6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f22472a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, w7.z5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f22474c = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21289j5, g6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.z5.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f22473b = new e7(this, g6Var, 1);
        int i10 = org.telegram.ui.ActionBar.k6.f21272i6;
        Drawable Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.x0(null, i10, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(this, Z, null, O, null);
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
        this.f22474c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.w9 w9Var = this.f22472a;
        w9Var.setAnimatedEmojiDrawable(null);
        og.a aVar = new og.a(og.a.f17793k[0]);
        g90 g90Var = new g90(1, null);
        g90Var.a("");
        g90Var.f26579i = 1.8f;
        yq yqVar = new yq(aVar, g90Var, 0, 0);
        yqVar.f33019w = true;
        w9Var.setImageDrawable(yqVar);
    }
}
