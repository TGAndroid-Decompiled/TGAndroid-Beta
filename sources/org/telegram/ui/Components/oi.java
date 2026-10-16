package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class oi extends qi {
    public TLRPC.User f27651b;
    public TLRPC.TL_attachMenuBot f27652c;
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
        TextView textView = bVar.f42917a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f42918b.setVisibility(8);
        bVar.a(false);
        z9 z9Var = new z9(context);
        bVar.f42919c = z9Var;
        bVar.addView(z9Var, w7.z5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f42924w = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.f42923s = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        this.f28295a = bVar;
        bVar.getBackupImageView().f31507a.setDelegate(new n2(10));
        addView(this.f28295a, w7.z5.d(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f27652c != null && (-this.f27651b.f19063id) == this.d.Z0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28295a.e(z11, z10);
        yj0 lottieAnimation = this.f28295a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
