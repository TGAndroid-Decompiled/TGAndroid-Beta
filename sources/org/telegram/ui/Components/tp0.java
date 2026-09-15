package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tp0 extends gq0 {
    public final hq0 f28165n;

    public tp0(hq0 hq0Var, Context context) {
        super(context);
        this.f28165n = hq0Var;
        this.f24440f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.i6.O5;
        int i11 = hq0.f24747a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.b0(dp, hq0Var.getThemedColor(i10)));
        addView(view, w7.x5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ci.eb ebVar = new ci.eb(this, context, 23);
        this.f24439c = ebVar;
        addView(ebVar, w7.x5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f24438b = j5Var;
        int i12 = org.telegram.ui.ActionBar.i6.f19028ng;
        j5Var.setTextColor(hq0Var.getThemedColor(i12));
        j5Var.setTextSize(13);
        j5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        j5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        j5Var.setGravity(17);
        addView(j5Var, w7.x5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        j5Var.setOnClickListener(new View.OnClickListener(this) {
            public final tp0 f24059b;

            {
                this.f24059b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f24059b.a(0);
                        return;
                    default:
                        this.f24059b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f24437a = j5Var2;
        j5Var2.setTextColor(hq0Var.getThemedColor(i12));
        j5Var2.setTextSize(13);
        j5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        j5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        j5Var2.setGravity(17);
        addView(j5Var2, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        j5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final tp0 f24059b;

            {
                this.f24059b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f24059b.a(0);
                        return;
                    default:
                        this.f24059b.a(1);
                        return;
                }
            }
        });
    }
}
