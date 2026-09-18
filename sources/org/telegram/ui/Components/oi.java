package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class oi extends qi {
    public TLRPC.User f26950b;
    public TLRPC.TL_attachMenuBot f26951c;
    public final vi d;

    public oi(vi viVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.d = viVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        e6Var = ((org.telegram.ui.ActionBar.f3) viVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = e6Var;
        bVar.Q = true;
        TextView textView = bVar.f15685a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f15686b.setVisibility(8);
        bVar.a(false);
        w9 w9Var = new w9(context);
        bVar.f15687c = w9Var;
        bVar.addView(w9Var, w7.y5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f15692w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, e6Var);
        bVar.f15691s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, e6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, e6Var);
        bVar.f();
        this.f27614a = bVar;
        bVar.getBackupImageView().f29987a.setDelegate(new j2(12));
        addView(this.f27614a, w7.y5.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f26951c != null && (-this.f26950b.f18443id) == this.d.W0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27614a.e(z11, z10);
        ij0 lottieAnimation = this.f27614a.getBackupImageView().getImageReceiver().getLottieAnimation();
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
