package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class oi extends qi {
    public TLRPC.User f27962b;
    public TLRPC.TL_attachMenuBot f27963c;
    public final vi d;

    public oi(vi viVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.d = viVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        c6Var = ((org.telegram.ui.ActionBar.e3) viVar).resourcesProvider;
        ph.b bVar = new ph.b(context);
        bVar.d = c6Var;
        bVar.Q = true;
        TextView textView = bVar.f43216a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f43217b.setVisibility(8);
        bVar.a(false);
        z9 z9Var = new z9(context);
        bVar.f43218c = z9Var;
        bVar.addView(z9Var, w7.a6.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f43223w = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.f43222s = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        this.f28613a = bVar;
        bVar.getBackupImageView().f31813a.setDelegate(new l2(12));
        addView(this.f28613a, w7.a6.d(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f27963c != null && (-this.f27962b.f19363id) == this.d.Z0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28613a.e(z11, z10);
        yj0 lottieAnimation = this.f28613a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
