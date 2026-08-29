package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gi extends ii {
    public TLRPC.User f28889b;
    public TLRPC.TL_attachMenuBot f28890c;
    public final ni d;

    public gi(ni niVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.d = niVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        c6Var = ((org.telegram.ui.ActionBar.f3) niVar).resourcesProvider;
        zg.b bVar = new zg.b(context);
        bVar.d = c6Var;
        bVar.M = true;
        TextView textView = bVar.f50859a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f50860b.setVisibility(8);
        bVar.a(false);
        t9 t9Var = new t9(context);
        bVar.f50861c = t9Var;
        bVar.addView(t9Var, i7.f6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f50867w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.f50866s = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        this.f29393a = bVar;
        bVar.getBackupImageView().f32903a.setDelegate(new r2(6));
        addView(this.f29393a, i7.f6.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f28890c != null && (-this.f28889b.f22539id) == this.d.S0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29393a.e(z11, z10);
        xi0 lottieAnimation = this.f29393a.getBackupImageView().getImageReceiver().getLottieAnimation();
        if (z10) {
            if (z11 && lottieAnimation != null) {
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
