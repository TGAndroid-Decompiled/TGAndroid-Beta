package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class er0 extends rr0 {
    public final sr0 f25780r;

    public er0(sr0 sr0Var, Context context) {
        super(context);
        this.f25780r = sr0Var;
        this.h = new Paint(1);
        this.f30229n = new RectF();
        View view = new View(context);
        this.f30224a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.h6.O5;
        int i11 = sr0.f30631a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(dp, sr0Var.getThemedColor(i10)));
        addView(view, w7.w5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        ci.bb bbVar = new ci.bb(this, context, 23);
        this.d = bbVar;
        addView(bbVar, w7.w5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f30226c = h5Var;
        int i12 = org.telegram.ui.ActionBar.h6.f20753ng;
        h5Var.setTextColor(sr0Var.getThemedColor(i12));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, w7.w5.a(-1.0f, 14.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        h5Var.setOnClickListener(new View.OnClickListener(this) {
            public final er0 f29923b;

            {
                this.f29923b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f29923b.a(0);
                        return;
                    default:
                        this.f29923b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f30225b = h5Var2;
        h5Var2.setTextColor(sr0Var.getThemedColor(i12));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, w7.w5.a(-1.0f, 0.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        h5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final er0 f29923b;

            {
                this.f29923b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f29923b.a(0);
                        return;
                    default:
                        this.f29923b.a(1);
                        return;
                }
            }
        });
    }
}
