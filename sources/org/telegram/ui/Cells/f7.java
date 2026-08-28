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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.u70;
public final class f7 extends FrameLayout {
    public final org.telegram.ui.Components.o9 f24341a;
    public final c7 f24342b;
    public final TextView f24343c;
    public long d;
    public long f24344e;
    public final int f24345f;
    public final org.telegram.ui.ActionBar.b6 h;

    public f7(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f24345f = UserConfig.selectedAccount;
        this.h = b6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f24341a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(o9Var, g7.e6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f24343c = textView;
        ll.n(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, g7.e6.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f24342b = new c7(this, b6Var, 1);
        setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f24344e;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z10) {
        int i9;
        if (z10) {
            i9 = R.string.ShareSendToNewTopic;
        } else {
            i9 = R.string.ShareSendToOffTopic;
        }
        this.f24343c.setText(LocaleController.getString(i9));
        org.telegram.ui.Components.o9 o9Var = this.f24341a;
        o9Var.setAnimatedEmojiDrawable(null);
        vf.a aVar = new vf.a(vf.a.f48390k[0]);
        u70 u70Var = new u70(1, null);
        u70Var.a("");
        u70Var.f32947i = 1.8f;
        fq fqVar = new fq(aVar, u70Var, 0, 0);
        fqVar.f28550w = true;
        o9Var.setImageDrawable(fqVar);
    }
}
