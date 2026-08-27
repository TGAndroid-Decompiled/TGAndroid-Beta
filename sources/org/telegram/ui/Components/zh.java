package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class zh extends bi {

    public TLRPC.User f35238b;

    public TLRPC.TL_attachMenuBot f35239c;
    public final gi d;

    public zh(gi giVar, Context context) {
        super(context);
        this.d = giVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        org.telegram.ui.ActionBar.c6 c6Var = ((org.telegram.ui.ActionBar.e3) giVar).resourcesProvider;
        xg.b bVar = new xg.b(context);
        bVar.d = c6Var;
        bVar.M = true;
        TextView textView = bVar.f49427a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f49428b.setVisibility(8);
        bVar.a(false);
        n9 n9Var = new n9(context);
        bVar.f49429c = n9Var;
        bVar.addView(n9Var, h7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f49435w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.f49434s = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        this.f27104a = bVar;
        bVar.getBackupImageView().f30898a.setDelegate(new c2(17));
        addView(this.f27104a, h7.z5.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11 = this.f35239c != null && (-this.f35238b.f22527id) == this.d.S0;
        this.f27104a.e(z11, z10);
        oi0 lottieAnimation = this.f27104a.getBackupImageView().getImageReceiver().getLottieAnimation();
        if (!z10) {
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                lottieAnimation.Q(0.0f, false);
                return;
            }
            return;
        }
        if (!z11 || lottieAnimation == null) {
            return;
        }
        lottieAnimation.I(0);
        lottieAnimation.N(-1);
        lottieAnimation.Q(0.0f, false);
        lottieAnimation.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
