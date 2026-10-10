package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ri extends ti {
    public TLRPC.User f30470b;
    public TLRPC.TL_attachMenuBot f30471c;
    public final yi d;

    public ri(yi yiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.d = yiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        e6Var = ((org.telegram.ui.ActionBar.f3) yiVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = e6Var;
        bVar.Q = true;
        TextView textView = bVar.f17143a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f17144b.setVisibility(8);
        bVar.a(false);
        y9 y9Var = new y9(context);
        bVar.f17145c = y9Var;
        bVar.addView(y9Var, w7.x5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f17151w = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.cl, e6Var);
        bVar.f17150s = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.al, e6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.bl, e6Var);
        bVar.f();
        this.f31146a = bVar;
        bVar.getBackupImageView().f33135a.setDelegate(new f2(17));
        addView(this.f31146a, w7.x5.d(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f30471c != null && (-this.f30470b.f20189id) == this.d.Z0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f31146a.e(z11, z10);
        dk0 lottieAnimation = this.f31146a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
