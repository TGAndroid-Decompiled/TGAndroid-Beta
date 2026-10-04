package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lq0 extends yq0 {
    public final zq0 f28405n;

    public lq0(zq0 zq0Var, Context context) {
        super(context);
        this.f28405n = zq0Var;
        this.f33237f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.i6.O5;
        int i11 = zq0.W0;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.b0(dp, zq0Var.getThemedColor(i10)));
        addView(view, w7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ci.ab abVar = new ci.ab(this, context, 23);
        this.f33235c = abVar;
        addView(abVar, w7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f33234b = i5Var;
        int i12 = org.telegram.ui.ActionBar.i6.f21010ng;
        i5Var.setTextColor(zq0Var.getThemedColor(i12));
        i5Var.setTextSize(13);
        i5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        i5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        i5Var.setGravity(17);
        addView(i5Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        i5Var.setOnClickListener(new View.OnClickListener(this) {
            public final lq0 f32965b;

            {
                this.f32965b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f32965b.a(0);
                        return;
                    default:
                        this.f32965b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
        this.f33233a = i5Var2;
        i5Var2.setTextColor(zq0Var.getThemedColor(i12));
        i5Var2.setTextSize(13);
        i5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        i5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        i5Var2.setGravity(17);
        addView(i5Var2, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        i5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final lq0 f32965b;

            {
                this.f32965b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f32965b.a(0);
                        return;
                    default:
                        this.f32965b.a(1);
                        return;
                }
            }
        });
    }
}
