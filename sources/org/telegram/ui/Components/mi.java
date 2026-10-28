package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class mi extends oi {
    public TLRPC.User f30543b;
    public TLRPC.TL_attachMenuBot f30544c;
    public final ti d;

    public mi(ti tiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        this.d = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
        qh.b bVar = new qh.b(context);
        bVar.d = u6Var;
        bVar.Q = true;
        TextView textView = bVar.f47089a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f47090b.setVisibility(8);
        bVar.b(false);
        y9 y9Var = new y9(context);
        bVar.f47091c = y9Var;
        bVar.addView(y9Var, kb1.h(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f47096w = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.cl, u6Var);
        bVar.f47095s = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.al, u6Var);
        bVar.v = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.bl, u6Var);
        bVar.a();
        this.f31294a = bVar;
        bVar.getBackupImageView().f35004a.setDelegate(new f2(22));
        addView(this.f31294a, kb1.g(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f30544c != null && (-this.f30543b.f22177id) == this.d.Z0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31294a.f(z11, z10);
        yj0 lottieAnimation = this.f31294a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
