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
import org.telegram.messenger.em;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vq;
public final class i7 extends FrameLayout {
    public final org.telegram.ui.Components.w9 f19312a;
    public final f7 f19313b;
    public final TextView f19314c;
    public long d;
    public long e;
    public final int f19315f;
    public final org.telegram.ui.ActionBar.f6 h;

    public i7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f19315f = UserConfig.selectedAccount;
        this.h = f6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f19312a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, w7.a6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f19314c = textView;
        em.n(org.telegram.ui.ActionBar.j6.f18034j5, f6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.a6.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f19313b = new f7(this, f6Var, 1);
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        this.f19314c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.w9 w9Var = this.f19312a;
        w9Var.setAnimatedEmojiDrawable(null);
        mg.a aVar = new mg.a(mg.a.f13646k[0]);
        v80 v80Var = new v80(1, null);
        v80Var.a("");
        v80Var.f27884i = 1.8f;
        vq vqVar = new vq(aVar, v80Var, 0, 0);
        vqVar.f28580w = true;
        w9Var.setImageDrawable(vqVar);
    }
}
