package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pq0 extends cr0 {
    public final dr0 f29405r;

    public pq0(dr0 dr0Var, Context context) {
        super(context);
        this.f29405r = dr0Var;
        this.h = new Paint(1);
        this.f25366n = new RectF();
        View view = new View(context);
        this.f25362a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.h6.O5;
        int i11 = dr0.f25658a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(dp, dr0Var.getThemedColor(i10)));
        addView(view, w7.z5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        ai.ic icVar = new ai.ic(this, context, 24);
        this.d = icVar;
        addView(icVar, w7.z5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f25364c = j5Var;
        int i12 = org.telegram.ui.ActionBar.h6.f21186ng;
        j5Var.setTextColor(dr0Var.getThemedColor(i12));
        j5Var.setTextSize(13);
        j5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        j5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        j5Var.setGravity(17);
        addView(j5Var, w7.z5.a(-1.0f, 14.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        j5Var.setOnClickListener(new View.OnClickListener(this) {
            public final pq0 f25036b;

            {
                this.f25036b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f25036b.a(0);
                        return;
                    default:
                        this.f25036b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f25363b = j5Var2;
        j5Var2.setTextColor(dr0Var.getThemedColor(i12));
        j5Var2.setTextSize(13);
        j5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        j5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        j5Var2.setGravity(17);
        addView(j5Var2, w7.z5.a(-1.0f, 0.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        j5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final pq0 f25036b;

            {
                this.f25036b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f25036b.a(0);
                        return;
                    default:
                        this.f25036b.a(1);
                        return;
                }
            }
        });
    }
}
