package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class fi extends hi {
    public TLRPC.User f26922b;
    public TLRPC.TL_attachMenuBot f26923c;
    public final mi d;

    public fi(mi miVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.d = miVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        g6Var = ((org.telegram.ui.ActionBar.h3) miVar).resourcesProvider;
        ch.b bVar = new ch.b(context);
        bVar.d = g6Var;
        bVar.N = true;
        TextView textView = bVar.f2519a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f2520b.setVisibility(8);
        bVar.a(false);
        p9 p9Var = new p9(context);
        bVar.f2521c = p9Var;
        bVar.addView(p9Var, k7.c6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f2527w = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.cl, g6Var);
        bVar.f2526s = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.al, g6Var);
        bVar.v = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.bl, g6Var);
        bVar.f();
        this.f27509a = bVar;
        bVar.getBackupImageView().f30011a.setDelegate(new k2(11));
        addView(this.f27509a, k7.c6.c(-1.0f, -1));
    }

    public final void a(boolean z4) {
        boolean z10;
        if (this.f26923c != null && (-this.f26922b.f20992id) == this.d.T0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27509a.e(z10, z4);
        hj0 lottieAnimation = this.f27509a.getBackupImageView().getImageReceiver().getLottieAnimation();
        if (z4) {
            if (z10 && lottieAnimation != null) {
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
