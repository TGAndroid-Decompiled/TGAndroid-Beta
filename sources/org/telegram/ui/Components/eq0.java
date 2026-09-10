package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class eq0 extends rq0 {
    public final sq0 f22743n;

    public eq0(sq0 sq0Var, Context context) {
        super(context);
        this.f22743n = sq0Var;
        this.f26742f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.O5;
        int i11 = sq0.f27165a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(dp, sq0Var.getThemedColor(i10)));
        addView(view, w7.a6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.nc ncVar = new bi.nc(this, context, 23);
        this.f26741c = ncVar;
        addView(ncVar, w7.a6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f26740b = l5Var;
        int i12 = org.telegram.ui.ActionBar.j6.f18117ng;
        l5Var.setTextColor(sq0Var.getThemedColor(i12));
        l5Var.setTextSize(13);
        l5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        l5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        l5Var.setGravity(17);
        addView(l5Var, w7.a6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        l5Var.setOnClickListener(new View.OnClickListener(this) {
            public final eq0 f26475b;

            {
                this.f26475b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f26475b.a(0);
                        return;
                    default:
                        this.f26475b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f26739a = l5Var2;
        l5Var2.setTextColor(sq0Var.getThemedColor(i12));
        l5Var2.setTextSize(13);
        l5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        l5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        l5Var2.setGravity(17);
        addView(l5Var2, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        l5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final eq0 f26475b;

            {
                this.f26475b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f26475b.a(0);
                        return;
                    default:
                        this.f26475b.a(1);
                        return;
                }
            }
        });
    }
}
