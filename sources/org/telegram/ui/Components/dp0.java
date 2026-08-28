package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dp0 extends qp0 {
    public final rp0 f27784n;

    public dp0(rp0 rp0Var, Context context) {
        super(context);
        this.f27784n = rp0Var;
        this.f32008f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i9 = org.telegram.ui.ActionBar.f6.O5;
        int i10 = rp0.W0;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.b0(dp, rp0Var.getThemedColor(i9)));
        addView(view, g7.e6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        fh.l2 l2Var = new fh.l2(this, context, 22);
        this.f32006c = l2Var;
        addView(l2Var, g7.e6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f32005b = h5Var;
        int i11 = org.telegram.ui.ActionBar.f6.f23188ng;
        h5Var.setTextColor(rp0Var.getThemedColor(i11));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, g7.e6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setOnClickListener(new View.OnClickListener(this) {
            public final dp0 f31723b;

            {
                this.f31723b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f31723b.a(0);
                        return;
                    default:
                        this.f31723b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f32004a = h5Var2;
        h5Var2.setTextColor(rp0Var.getThemedColor(i11));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        h5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final dp0 f31723b;

            {
                this.f31723b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f31723b.a(0);
                        return;
                    default:
                        this.f31723b.a(1);
                        return;
                }
            }
        });
    }
}
