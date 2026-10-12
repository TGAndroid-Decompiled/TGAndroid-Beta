package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ti extends vi {
    public TLRPC.User f30882b;
    public TLRPC.TL_attachMenuBot f30883c;
    public final aj d;

    public ti(aj ajVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.d = ajVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        c6Var = ((org.telegram.ui.ActionBar.e3) ajVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = c6Var;
        bVar.Q = true;
        TextView textView = bVar.f16890a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f16891b.setVisibility(8);
        bVar.a(false);
        y9 y9Var = new y9(context);
        bVar.f16892c = y9Var;
        bVar.addView(y9Var, w7.w5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f16898w = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.cl, c6Var);
        bVar.f16897s = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.bl, c6Var);
        bVar.f();
        this.f31524a = bVar;
        bVar.getBackupImageView().f33001a.setDelegate(new f2(17));
        addView(this.f31524a, w7.w5.d(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f30883c != null && (-this.f30882b.f19949id) == this.d.Z0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31524a.e(z11, z10);
        fk0 lottieAnimation = this.f31524a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
