package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jq0 extends wq0 {
    public final xq0 f25531n;

    public jq0(xq0 xq0Var, Context context) {
        super(context);
        this.f25531n = xq0Var;
        this.f30043f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.h6.O5;
        int i11 = xq0.f30453a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.b0(dp, xq0Var.getThemedColor(i10)));
        addView(view, w7.y5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ci.bb bbVar = new ci.bb(this, context, 23);
        this.f30042c = bbVar;
        addView(bbVar, w7.y5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f30041b = h5Var;
        int i12 = org.telegram.ui.ActionBar.h6.f19267ng;
        h5Var.setTextColor(xq0Var.getThemedColor(i12));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, w7.y5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setOnClickListener(new View.OnClickListener(this) {
            public final jq0 f29714b;

            {
                this.f29714b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f29714b.a(0);
                        return;
                    default:
                        this.f29714b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f30040a = h5Var2;
        h5Var2.setTextColor(xq0Var.getThemedColor(i12));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        h5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final jq0 f29714b;

            {
                this.f29714b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f29714b.a(0);
                        return;
                    default:
                        this.f29714b.a(1);
                        return;
                }
            }
        });
    }
}
