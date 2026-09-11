package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tp0 extends gq0 {
    public final hq0 f30674n;

    public tp0(hq0 hq0Var, Context context) {
        super(context);
        this.f30674n = hq0Var;
        this.f26490f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.O5;
        int i11 = hq0.f26786a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(dp, hq0Var.getThemedColor(i10)));
        addView(view, w7.x5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        di.eb ebVar = new di.eb(this, context, 23);
        this.f26488c = ebVar;
        addView(ebVar, w7.x5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f26487b = j5Var;
        int i12 = org.telegram.ui.ActionBar.j6.f20853ng;
        j5Var.setTextColor(hq0Var.getThemedColor(i12));
        j5Var.setTextSize(13);
        j5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        j5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        j5Var.setGravity(17);
        addView(j5Var, w7.x5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        j5Var.setOnClickListener(new View.OnClickListener(this) {
            public final tp0 f26166b;

            {
                this.f26166b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f26166b.a(0);
                        return;
                    default:
                        this.f26166b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f26486a = j5Var2;
        j5Var2.setTextColor(hq0Var.getThemedColor(i12));
        j5Var2.setTextSize(13);
        j5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        j5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        j5Var2.setGravity(17);
        addView(j5Var2, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        j5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final tp0 f26166b;

            {
                this.f26166b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f26166b.a(0);
                        return;
                    default:
                        this.f26166b.a(1);
                        return;
                }
            }
        });
    }
}
