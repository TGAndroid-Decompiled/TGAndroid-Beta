package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class pi extends ri {
    public TLRPC.User f27051b;
    public TLRPC.TL_attachMenuBot f27052c;
    public final wi d;

    public pi(wi wiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.d = wiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        d6Var = ((org.telegram.ui.ActionBar.f3) wiVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = d6Var;
        bVar.Q = true;
        TextView textView = bVar.f15521a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f15522b.setVisibility(8);
        bVar.a(false);
        w9 w9Var = new w9(context);
        bVar.f15523c = w9Var;
        bVar.addView(w9Var, w7.x5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f15528w = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.cl, d6Var);
        bVar.f15527s = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.al, d6Var);
        bVar.v = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.bl, d6Var);
        bVar.f();
        this.f27645a = bVar;
        bVar.getBackupImageView().f29579a.setDelegate(new x1(23));
        addView(this.f27645a, w7.x5.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f27052c != null && (-this.f27051b.f18230id) == this.d.W0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27645a.e(z11, z10);
        yi0 lottieAnimation = this.f27645a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
