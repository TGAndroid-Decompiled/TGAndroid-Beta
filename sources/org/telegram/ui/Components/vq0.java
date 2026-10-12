package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vq0 extends ir0 {
    public final jr0 f30626r;

    public vq0(jr0 jr0Var, Context context) {
        super(context);
        this.f30626r = jr0Var;
        this.h = new Paint(1);
        this.f26080n = new RectF();
        View view = new View(context);
        this.f26076a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.g6.O5;
        int i11 = jr0.f26456a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.c0(dp, jr0Var.getThemedColor(i10)));
        addView(view, w7.a6.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        di.ab abVar = new di.ab(this, context, 23);
        this.d = abVar;
        addView(abVar, w7.a6.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f26078c = h5Var;
        int i12 = org.telegram.ui.ActionBar.g6.f20094ng;
        h5Var.setTextColor(jr0Var.getThemedColor(i12));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, w7.a6.a(-1.0f, 14.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        h5Var.setOnClickListener(new View.OnClickListener(this) {
            public final vq0 f25737b;

            {
                this.f25737b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f25737b.a(0);
                        return;
                    default:
                        this.f25737b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f26077b = h5Var2;
        h5Var2.setTextColor(jr0Var.getThemedColor(i12));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, w7.a6.a(-1.0f, 0.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        h5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final vq0 f25737b;

            {
                this.f25737b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f25737b.a(0);
                        return;
                    default:
                        this.f25737b.a(1);
                        return;
                }
            }
        });
    }
}
