package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rq0 extends er0 {
    public final fr0 f29996r;

    public rq0(fr0 fr0Var, Context context) {
        super(context);
        this.f29996r = fr0Var;
        this.h = new Paint(1);
        this.f25962n = new RectF();
        View view = new View(context);
        this.f25958a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.h6.O5;
        int i11 = fr0.f26366b1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(dp, fr0Var.getThemedColor(i10)));
        addView(view, w7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ai.ic icVar = new ai.ic(this, context, 24);
        this.d = icVar;
        addView(icVar, w7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f25960c = j5Var;
        int i12 = org.telegram.ui.ActionBar.h6.f21187ng;
        j5Var.setTextColor(fr0Var.getThemedColor(i12));
        j5Var.setTextSize(13);
        j5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        j5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        j5Var.setGravity(17);
        addView(j5Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        j5Var.setOnClickListener(new View.OnClickListener(this) {
            public final rq0 f25621b;

            {
                this.f25621b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f25621b.a(0);
                        return;
                    default:
                        this.f25621b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f25959b = j5Var2;
        j5Var2.setTextColor(fr0Var.getThemedColor(i12));
        j5Var2.setTextSize(13);
        j5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        j5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        j5Var2.setGravity(17);
        addView(j5Var2, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        j5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final rq0 f25621b;

            {
                this.f25621b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f25621b.a(0);
                        return;
                    default:
                        this.f25621b.a(1);
                        return;
                }
            }
        });
    }
}
