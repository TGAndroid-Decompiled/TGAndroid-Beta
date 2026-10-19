package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class mi extends oi {
    public TLRPC.User f28530b;
    public TLRPC.TL_attachMenuBot f28531c;
    public final ti d;

    public mi(ti tiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        this.d = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        d6Var = ((org.telegram.ui.ActionBar.f3) tiVar).resourcesProvider;
        ph.b bVar = new ph.b(context);
        bVar.d = d6Var;
        bVar.Q = true;
        TextView textView = bVar.f44301a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f44302b.setVisibility(8);
        bVar.a(false);
        w9 w9Var = new w9(context);
        bVar.f44303c = w9Var;
        bVar.addView(w9Var, w7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f44308w = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.cl, d6Var);
        bVar.f44307s = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.al, d6Var);
        bVar.v = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.bl, d6Var);
        bVar.f();
        this.f29004a = bVar;
        bVar.getBackupImageView().f32040a.setDelegate(new k2(12));
        addView(this.f29004a, w7.z5.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f28531c != null && (-this.f28530b.f20420id) == this.d.Z0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29004a.e(z11, z10);
        uj0 lottieAnimation = this.f29004a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
