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
import org.telegram.messenger.kk;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.zq;
public final class f7 extends FrameLayout {
    public final org.telegram.ui.Components.w9 f22258a;
    public final c7 f22259b;
    public final TextView f22260c;
    public long d;
    public long e;
    public final int f22261f;
    public final org.telegram.ui.ActionBar.d6 h;

    public f7(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f22261f = UserConfig.selectedAccount;
        this.h = d6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f22258a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, w7.z5.a(56.0f, 0.0f, 7.0f, 0.0f, 0.0f, 56, 49));
        TextView textView = new TextView(context);
        this.f22260c = textView;
        kk.o(org.telegram.ui.ActionBar.h6.f21099j5, d6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.z5.a(-2.0f, 6.0f, 66.0f, 6.0f, 0.0f, -1, 51));
        this.f22259b = new c7(this, d6Var, 1);
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21082i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        this.f22260c.setText(LocaleController.getString(i10));
        org.telegram.ui.Components.w9 w9Var = this.f22258a;
        w9Var.setAnimatedEmojiDrawable(null);
        og.a aVar = new og.a(og.a.f17733k[0]);
        f90 f90Var = new f90(1, null);
        f90Var.a("");
        f90Var.f26184i = 1.8f;
        zq zqVar = new zq(aVar, f90Var, 0, 0);
        zqVar.f33006w = true;
        w9Var.setImageDrawable(zqVar);
    }
}
