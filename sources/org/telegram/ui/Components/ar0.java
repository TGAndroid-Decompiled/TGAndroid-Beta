package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ar0 extends nr0 {
    public final or0 f24564r;

    public ar0(or0 or0Var, Context context) {
        super(context);
        this.f24564r = or0Var;
        this.h = new Paint(1);
        this.f29131n = new RectF();
        View view = new View(context);
        this.f29126a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.h6.O5;
        int i11 = or0.f29474a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(dp, or0Var.getThemedColor(i10)));
        addView(view, w7.x5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        ci.bb bbVar = new ci.bb(this, context, 23);
        this.d = bbVar;
        addView(bbVar, w7.x5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f29128c = h5Var;
        int i12 = org.telegram.ui.ActionBar.h6.f20979ng;
        h5Var.setTextColor(or0Var.getThemedColor(i12));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, w7.x5.a(-1.0f, 14.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        h5Var.setOnClickListener(new View.OnClickListener(this) {
            public final ar0 f28843b;

            {
                this.f28843b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f28843b.a(0);
                        return;
                    default:
                        this.f28843b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f29127b = h5Var2;
        h5Var2.setTextColor(or0Var.getThemedColor(i12));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, w7.x5.a(-1.0f, 0.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        h5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ar0 f28843b;

            {
                this.f28843b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f28843b.a(0);
                        return;
                    default:
                        this.f28843b.a(1);
                        return;
                }
            }
        });
    }
}
