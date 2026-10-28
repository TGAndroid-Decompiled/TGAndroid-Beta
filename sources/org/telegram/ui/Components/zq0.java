package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zq0 extends mr0 {
    public final nr0 f35429r;

    public zq0(nr0 nr0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        this.f35429r = nr0Var;
        this.h = new Paint(1);
        this.f30614n = new RectF();
        View view = new View(context);
        this.f30610a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.y6.O5;
        int i11 = nr0.Z0;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, nr0Var.getThemedColor(i10));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        u6Var = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
        view.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(view, c02, N, null, u6Var);
        addView(view, kb1.h(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.cc ccVar = new bi.cc(this, context, 23);
        this.d = ccVar;
        addView(ccVar, kb1.h(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f30612c = b6Var;
        int i12 = org.telegram.ui.ActionBar.y6.f23551ng;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i12, u6Var2);
        b6Var.setTextSize(13);
        b6Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        b6Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        b6Var.setGravity(17);
        addView(b6Var, kb1.h(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        b6Var.setOnClickListener(new View.OnClickListener(this) {
            public final zq0 f30295b;

            {
                this.f30295b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f30295b.a(0);
                        return;
                    default:
                        this.f30295b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.f30611b = b6Var2;
        u6Var3 = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.Y(b6Var2, i12, u6Var3);
        b6Var2.setTextSize(13);
        b6Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        b6Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        b6Var2.setGravity(17);
        addView(b6Var2, kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        b6Var2.setOnClickListener(new View.OnClickListener(this) {
            public final zq0 f30295b;

            {
                this.f30295b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f30295b.a(0);
                        return;
                    default:
                        this.f30295b.a(1);
                        return;
                }
            }
        });
    }
}
