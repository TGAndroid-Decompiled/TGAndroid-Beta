package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ei extends gi {
    public TLRPC.User f24619b;
    public TLRPC.TL_attachMenuBot f24620c;
    public final li d;

    public ei(li liVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.d = liVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        f6Var = ((org.telegram.ui.ActionBar.g3) liVar).resourcesProvider;
        bh.b bVar = new bh.b(context);
        bVar.d = f6Var;
        bVar.N = true;
        TextView textView = bVar.f1843a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f1844b.setVisibility(8);
        bVar.a(false);
        p9 p9Var = new p9(context);
        bVar.f1845c = p9Var;
        bVar.addView(p9Var, k7.b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f1850w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.f1849s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        this.f25147a = bVar;
        bVar.getBackupImageView().f27801a.setDelegate(new k2(11));
        addView(this.f25147a, k7.b6.c(-1.0f, -1));
    }

    public final void a(boolean z4) {
        boolean z10;
        if (this.f24620c != null && (-this.f24619b.f19306id) == this.d.T0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25147a.e(z10, z4);
        gj0 lottieAnimation = this.f25147a.getBackupImageView().getImageReceiver().getLottieAnimation();
        if (z4) {
            if (z10 && lottieAnimation != null) {
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
