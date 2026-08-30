package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xp0 extends kq0 {
    public final lq0 f30708n;

    public xp0(lq0 lq0Var, Context context) {
        super(context);
        this.f30708n = lq0Var;
        this.f26368f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.O5;
        int i11 = lq0.X0;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(dp, lq0Var.getThemedColor(i10)));
        addView(view, k7.b6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        eg.h0 h0Var = new eg.h0(this, context, 18);
        this.f26367c = h0Var;
        addView(h0Var, k7.b6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f26366b = k5Var;
        int i12 = org.telegram.ui.ActionBar.j6.f20094ng;
        k5Var.setTextColor(lq0Var.getThemedColor(i12));
        k5Var.setTextSize(13);
        k5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        k5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        k5Var.setGravity(17);
        addView(k5Var, k7.b6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        k5Var.setOnClickListener(new View.OnClickListener(this) {
            public final xp0 f26022b;

            {
                this.f26022b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f26022b.a(0);
                        return;
                    default:
                        this.f26022b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f26365a = k5Var2;
        k5Var2.setTextColor(lq0Var.getThemedColor(i12));
        k5Var2.setTextSize(13);
        k5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        k5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        k5Var2.setGravity(17);
        addView(k5Var2, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        k5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final xp0 f26022b;

            {
                this.f26022b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f26022b.a(0);
                        return;
                    default:
                        this.f26022b.a(1);
                        return;
                }
            }
        });
    }
}
