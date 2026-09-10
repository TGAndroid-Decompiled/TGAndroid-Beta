package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ri extends ti {
    public TLRPC.User f26671b;
    public TLRPC.TL_attachMenuBot f26672c;
    public final yi d;

    public ri(yi yiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.d = yiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        f6Var = ((org.telegram.ui.ActionBar.h3) yiVar).resourcesProvider;
        nh.b bVar = new nh.b(context);
        bVar.d = f6Var;
        bVar.Q = true;
        TextView textView = bVar.f14059a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.f14060b.setVisibility(8);
        bVar.a(false);
        w9 w9Var = new w9(context);
        bVar.f14061c = w9Var;
        bVar.addView(w9Var, w7.a6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f14066w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.f14065s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        this.f27412a = bVar;
        bVar.getBackupImageView().f28728a.setDelegate(new q2(8));
        addView(this.f27412a, w7.a6.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f26672c != null && (-this.f26671b.f17342id) == this.d.W0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27412a.e(z11, z10);
        hj0 lottieAnimation = this.f27412a.getBackupImageView().getImageReceiver().getLottieAnimation();
        if (z10) {
            if (z11 && lottieAnimation != null) {
                lottieAnimation.K(0);
                lottieAnimation.P(-1);
                lottieAnimation.S(0.0f, false);
                lottieAnimation.start();
            }
        } else if (lottieAnimation != null) {
            lottieAnimation.stop();
            lottieAnimation.S(0.0f, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
