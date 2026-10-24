package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tq0 extends gr0 {
    public final hr0 f30876r;

    public tq0(hr0 hr0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        this.f30876r = hr0Var;
        this.h = new Paint(1);
        this.f26782n = new RectF();
        View view = new View(context);
        this.f26778a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.k6.O5;
        int i11 = hr0.f27117d1;
        Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, hr0Var.getThemedColor(i10));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        g6Var = ((org.telegram.ui.ActionBar.h3) hr0Var).resourcesProvider;
        view.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(view, c02, O, null, g6Var);
        addView(view, w7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ai.jc jcVar = new ai.jc(this, context, 23);
        this.d = jcVar;
        addView(jcVar, w7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f26780c = n5Var;
        int i12 = org.telegram.ui.ActionBar.k6.f21377ng;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) hr0Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i12, g6Var2);
        n5Var.setTextSize(13);
        n5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        n5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        n5Var.setGravity(17);
        addView(n5Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        n5Var.setOnClickListener(new View.OnClickListener(this) {
            public final tq0 f26425b;

            {
                this.f26425b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f26425b.a(0);
                        return;
                    default:
                        this.f26425b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f26779b = n5Var2;
        g6Var3 = ((org.telegram.ui.ActionBar.h3) hr0Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.Z(n5Var2, i12, g6Var3);
        n5Var2.setTextSize(13);
        n5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        n5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        n5Var2.setGravity(17);
        addView(n5Var2, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        n5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final tq0 f26425b;

            {
                this.f26425b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f26425b.a(0);
                        return;
                    default:
                        this.f26425b.a(1);
                        return;
                }
            }
        });
    }
}
