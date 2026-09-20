package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class oi extends qi {
    public TLRPC.User f26940b;
    public TLRPC.TL_attachMenuBot f26941c;
    public final vi d;

    public oi(vi viVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.d = viVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        f6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = f6Var;
        bVar.Q = true;
        TextView textView = bVar.f15717a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f15718b.setVisibility(8);
        bVar.a(false);
        v9 v9Var = new v9(context);
        bVar.f15719c = v9Var;
        bVar.addView(v9Var, w7.y5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f15724w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.f15723s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        this.f27583a = bVar;
        bVar.getBackupImageView().f29029a.setDelegate(new i2(14));
        addView(this.f27583a, w7.y5.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f26941c != null && (-this.f26940b.f18475id) == this.d.W0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27583a.e(z11, z10);
        hj0 lottieAnimation = this.f27583a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
