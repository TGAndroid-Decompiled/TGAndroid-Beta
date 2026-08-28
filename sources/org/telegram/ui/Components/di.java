package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class di extends fi {
    public TLRPC.User f27739b;
    public TLRPC.TL_attachMenuBot f27740c;
    public final ki d;

    public di(ki kiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        this.d = kiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        b6Var = ((org.telegram.ui.ActionBar.f3) kiVar).resourcesProvider;
        wg.b bVar = new wg.b(context);
        bVar.d = b6Var;
        bVar.M = true;
        TextView textView = bVar.f48828a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f48829b.setVisibility(8);
        bVar.a(false);
        o9 o9Var = new o9(context);
        bVar.f48830c = o9Var;
        bVar.addView(o9Var, g7.e6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f48836w = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.cl, b6Var);
        bVar.f48835s = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.al, b6Var);
        bVar.v = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.bl, b6Var);
        bVar.f();
        this.f28435a = bVar;
        bVar.getBackupImageView().f31328a.setDelegate(new g2(12));
        addView(this.f28435a, g7.e6.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f27740c != null && (-this.f27739b.f22527id) == this.d.S0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28435a.e(z11, z10);
        mi0 lottieAnimation = this.f28435a.getBackupImageView().getImageReceiver().getLottieAnimation();
        if (z10) {
            if (z11 && lottieAnimation != null) {
                lottieAnimation.I(0);
                lottieAnimation.N(-1);
                lottieAnimation.Q(0.0f, false);
                lottieAnimation.start();
            }
        } else if (lottieAnimation != null) {
            lottieAnimation.stop();
            lottieAnimation.Q(0.0f, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
