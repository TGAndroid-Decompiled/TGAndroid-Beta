package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class qi extends si {
    public TLRPC.User f30042b;
    public TLRPC.TL_attachMenuBot f30043c;
    public final xi d;

    public qi(xi xiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.d = xiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        d6Var = ((org.telegram.ui.ActionBar.f3) xiVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = d6Var;
        bVar.Q = true;
        TextView textView = bVar.f17197a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f17198b.setVisibility(8);
        bVar.a(false);
        w9 w9Var = new w9(context);
        bVar.f17199c = w9Var;
        bVar.addView(w9Var, w7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f17205w = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.cl, d6Var);
        bVar.f17204s = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.al, d6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.bl, d6Var);
        bVar.f();
        this.f30731a = bVar;
        bVar.getBackupImageView().f32486a.setDelegate(new w1(27));
        addView(this.f30731a, w7.z5.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f30043c != null && (-this.f30042b.f20184id) == this.d.W0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f30731a.e(z11, z10);
        kj0 lottieAnimation = this.f30731a.getBackupImageView().getImageReceiver().getLottieAnimation();
        if (z10) {
            if (z11 && lottieAnimation != null) {
                lottieAnimation.K(0);
                lottieAnimation.P(-1);
                lottieAnimation.T(0.0f, false);
                lottieAnimation.start();
            }
        } else if (lottieAnimation != null) {
            lottieAnimation.stop();
            lottieAnimation.T(0.0f, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
