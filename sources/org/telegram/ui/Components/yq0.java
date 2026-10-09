package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yq0 extends lr0 {
    public final mr0 f33330r;

    public yq0(mr0 mr0Var, Context context) {
        super(context);
        this.f33330r = mr0Var;
        this.h = new Paint(1);
        this.f28578n = new RectF();
        View view = new View(context);
        this.f28573a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.i6.O5;
        int i11 = mr0.f28892a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.c0(dp, mr0Var.getThemedColor(i10)));
        addView(view, w7.x5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        ci.bb bbVar = new ci.bb(this, context, 23);
        this.d = bbVar;
        addView(bbVar, w7.x5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f28575c = j5Var;
        int i12 = org.telegram.ui.ActionBar.i6.f20990ng;
        j5Var.setTextColor(mr0Var.getThemedColor(i12));
        j5Var.setTextSize(13);
        j5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        j5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        j5Var.setGravity(17);
        addView(j5Var, w7.x5.a(-1.0f, 14.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        j5Var.setOnClickListener(new View.OnClickListener(this) {
            public final yq0 f28154b;

            {
                this.f28154b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f28154b.a(0);
                        return;
                    default:
                        this.f28154b.a(1);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f28574b = j5Var2;
        j5Var2.setTextColor(mr0Var.getThemedColor(i12));
        j5Var2.setTextSize(13);
        j5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        j5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        j5Var2.setGravity(17);
        addView(j5Var2, w7.x5.a(-1.0f, 0.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        j5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final yq0 f28154b;

            {
                this.f28154b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f28154b.a(0);
                        return;
                    default:
                        this.f28154b.a(1);
                        return;
                }
            }
        });
    }
}
