package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xp0 extends kq0 {
    public final lq0 f33148n;

    public xp0(lq0 lq0Var, Context context) {
        super(context);
        this.f33148n = lq0Var;
        this.f28486f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.k6.O5;
        int i11 = lq0.X0;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.b0(dp, lq0Var.getThemedColor(i10)));
        addView(view, k7.c6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        fg.h0 h0Var = new fg.h0(this, context, 18);
        this.f28484c = h0Var;
        addView(h0Var, k7.c6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f28483b = l5Var;
        int i12 = org.telegram.ui.ActionBar.k6.f21850ng;
        l5Var.setTextColor(lq0Var.getThemedColor(i12));
        l5Var.setTextSize(13);
        l5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        l5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        l5Var.setGravity(17);
        addView(l5Var, k7.c6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        l5Var.setOnClickListener(new View.OnClickListener(this) {
            public final xp0 f28166b;

            {
                this.f28166b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f28166b.a(0);
                        return;
                    default:
                        this.f28166b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f28482a = l5Var2;
        l5Var2.setTextColor(lq0Var.getThemedColor(i12));
        l5Var2.setTextSize(13);
        l5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        l5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        l5Var2.setGravity(17);
        addView(l5Var2, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        l5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final xp0 f28166b;

            {
                this.f28166b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f28166b.a(0);
                        return;
                    default:
                        this.f28166b.a(1);
                        return;
                }
            }
        });
    }
}
