package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class mi extends oi {
    public TLRPC.User f28517b;
    public TLRPC.TL_attachMenuBot f28518c;
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
        TextView textView = bVar.f44304a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f44305b.setVisibility(8);
        bVar.a(false);
        w9 w9Var = new w9(context);
        bVar.f44306c = w9Var;
        bVar.addView(w9Var, w7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f44311w = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.cl, d6Var);
        bVar.f44310s = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.al, d6Var);
        bVar.v = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.bl, d6Var);
        bVar.f();
        this.f28978a = bVar;
        bVar.getBackupImageView().f32033a.setDelegate(new k2(12));
        addView(this.f28978a, w7.z5.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f28518c != null && (-this.f28517b.f20419id) == this.d.Z0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28978a.e(z11, z10);
        uj0 lottieAnimation = this.f28978a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
