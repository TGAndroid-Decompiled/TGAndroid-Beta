package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class dp0 extends rp0 {

    public final sp0 f27819n;

    public dp0(sp0 sp0Var, Context context) {
        super(context);
        this.f27819n = sp0Var;
        final int i10 = 1;
        this.f32252f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int iDp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.g6.O5;
        int i12 = sp0.W0;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(iDp, sp0Var.getThemedColor(i11)));
        addView(view, h7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ag.s0 s0Var = new ag.s0(this, context, 22);
        this.f32250c = s0Var;
        addView(s0Var, h7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f32249b = h5Var;
        int i13 = org.telegram.ui.ActionBar.g6.f23242ng;
        h5Var.setTextColor(sp0Var.getThemedColor(i13));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i14 = 0;
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, h7.z5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setOnClickListener(new View.OnClickListener(this) {

            public final dp0 f31961b;

            {
                this.f31961b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f31961b.a(0);
                        break;
                    default:
                        this.f31961b.a(1);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f32248a = h5Var2;
        h5Var2.setTextColor(sp0Var.getThemedColor(i13));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        h5Var2.setOnClickListener(new View.OnClickListener(this) {

            public final dp0 f31961b;

            {
                this.f31961b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.f31961b.a(0);
                        break;
                    default:
                        this.f31961b.a(1);
                        break;
                }
            }
        });
    }
}
