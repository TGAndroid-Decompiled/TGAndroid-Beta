package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class op0 extends cq0 {
    public final dq0 f31447n;

    public op0(dq0 dq0Var, Context context) {
        super(context);
        this.f31447n = dq0Var;
        this.f27556f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.g6.O5;
        int i11 = dq0.W0;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(dp, dq0Var.getThemedColor(i10)));
        addView(view, i7.f6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        cg.h0 h0Var = new cg.h0(this, context, 20);
        this.f27554c = h0Var;
        addView(h0Var, i7.f6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f27553b = h5Var;
        int i12 = org.telegram.ui.ActionBar.g6.f23251ng;
        h5Var.setTextColor(dq0Var.getThemedColor(i12));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, i7.f6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setOnClickListener(new View.OnClickListener(this) {
            public final op0 f27205b;

            {
                this.f27205b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f27205b.a(0);
                        return;
                    default:
                        this.f27205b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f27552a = h5Var2;
        h5Var2.setTextColor(dq0Var.getThemedColor(i12));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        h5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final op0 f27205b;

            {
                this.f27205b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f27205b.a(0);
                        return;
                    default:
                        this.f27205b.a(1);
                        return;
                }
            }
        });
    }
}
