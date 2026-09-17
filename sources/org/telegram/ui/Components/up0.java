package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class up0 extends hq0 {
    public final iq0 f28461n;

    public up0(iq0 iq0Var, Context context) {
        super(context);
        this.f28461n = iq0Var;
        this.f24718f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.j6.O5;
        int i11 = iq0.f24983a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(dp, iq0Var.getThemedColor(i10)));
        addView(view, w7.x5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ci.eb ebVar = new ci.eb(this, context, 23);
        this.f24717c = ebVar;
        addView(ebVar, w7.x5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f24716b = k5Var;
        int i12 = org.telegram.ui.ActionBar.j6.f19054ng;
        k5Var.setTextColor(iq0Var.getThemedColor(i12));
        k5Var.setTextSize(13);
        k5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        k5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        k5Var.setGravity(17);
        addView(k5Var, w7.x5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        k5Var.setOnClickListener(new View.OnClickListener(this) {
            public final up0 f24381b;

            {
                this.f24381b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f24381b.a(0);
                        return;
                    default:
                        this.f24381b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f24715a = k5Var2;
        k5Var2.setTextColor(iq0Var.getThemedColor(i12));
        k5Var2.setTextSize(13);
        k5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        k5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        k5Var2.setGravity(17);
        addView(k5Var2, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        k5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final up0 f24381b;

            {
                this.f24381b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f24381b.a(0);
                        return;
                    default:
                        this.f24381b.a(1);
                        return;
                }
            }
        });
    }
}
