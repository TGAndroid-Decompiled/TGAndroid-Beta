package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class pi extends ri {
    public TLRPC.User f27376b;
    public TLRPC.TL_attachMenuBot f27377c;
    public final wi d;

    public pi(wi wiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.d = wiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        e6Var = ((org.telegram.ui.ActionBar.g3) wiVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = e6Var;
        bVar.Q = true;
        TextView textView = bVar.f15767a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f15768b.setVisibility(8);
        bVar.a(false);
        w9 w9Var = new w9(context);
        bVar.f15769c = w9Var;
        bVar.addView(w9Var, w7.y5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f15774w = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.cl, e6Var);
        bVar.f15773s = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.al, e6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.bl, e6Var);
        bVar.f();
        this.f28006a = bVar;
        bVar.getBackupImageView().f29894a.setDelegate(new w1(26));
        addView(this.f28006a, w7.y5.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f27377c != null && (-this.f27376b.f18476id) == this.d.W0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28006a.e(z11, z10);
        kj0 lottieAnimation = this.f28006a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
