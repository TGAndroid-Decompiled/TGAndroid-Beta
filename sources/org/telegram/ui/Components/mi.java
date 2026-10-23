package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class mi extends oi {
    public TLRPC.User f28662b;
    public TLRPC.TL_attachMenuBot f28663c;
    public final ti d;

    public mi(ti tiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.d = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        g6Var = ((org.telegram.ui.ActionBar.h3) tiVar).resourcesProvider;
        ph.b bVar = new ph.b(context);
        bVar.d = g6Var;
        bVar.Q = true;
        TextView textView = bVar.f44726a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f44727b.setVisibility(8);
        bVar.b(false);
        w9 w9Var = new w9(context);
        bVar.f44728c = w9Var;
        bVar.addView(w9Var, w7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f44733w = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.cl, g6Var);
        bVar.f44732s = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.al, g6Var);
        bVar.v = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bl, g6Var);
        bVar.a();
        this.f29184a = bVar;
        bVar.getBackupImageView().f32195a.setDelegate(new e2(18));
        addView(this.f29184a, w7.z5.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f28663c != null && (-this.f28662b.f20490id) == this.d.Z0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29184a.f(z11, z10);
        yj0 lottieAnimation = this.f29184a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
