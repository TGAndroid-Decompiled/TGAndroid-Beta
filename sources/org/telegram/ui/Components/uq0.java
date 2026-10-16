package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uq0 extends hr0 {
    public final ir0 f29421r;

    public uq0(ir0 ir0Var, Context context) {
        super(context);
        this.f29421r = ir0Var;
        this.h = new Paint(1);
        this.f25391n = new RectF();
        View view = new View(context);
        this.f25387a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.g6.O5;
        int i11 = ir0.f25739a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.c0(dp, ir0Var.getThemedColor(i10)));
        addView(view, w7.z5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        di.ab abVar = new di.ab(this, context, 23);
        this.d = abVar;
        addView(abVar, w7.z5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25389c = h5Var;
        int i12 = org.telegram.ui.ActionBar.g6.f19794ng;
        h5Var.setTextColor(ir0Var.getThemedColor(i12));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, w7.z5.a(-1.0f, 14.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        h5Var.setOnClickListener(new View.OnClickListener(this) {
            public final uq0 f25099b;

            {
                this.f25099b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f25099b.a(0);
                        return;
                    default:
                        this.f25099b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f25388b = h5Var2;
        h5Var2.setTextColor(ir0Var.getThemedColor(i12));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, w7.z5.a(-1.0f, 0.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        h5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final uq0 f25099b;

            {
                this.f25099b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f25099b.a(0);
                        return;
                    default:
                        this.f25099b.a(1);
                        return;
                }
            }
        });
    }
}
