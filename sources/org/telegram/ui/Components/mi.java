package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class mi extends oi {
    public TLRPC.User f37458b;
    public TLRPC.TL_attachMenuBot f37459c;
    public final ti d;

    public mi(ti tiVar, Context context) {
        super(context);
        this.d = tiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = ti.I4;
        org.telegram.ui.ActionBar.i6 i6Var = tiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = i6Var;
        bVar.R = true;
        TextView textView = bVar.f56279a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.f56280b.setVisibility(8);
        bVar.b(false);
        p9 p9Var = new p9(context);
        bVar.f56281c = p9Var;
        bVar.addView(p9Var, c8.na.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f56288x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tl, i6Var);
        bVar.f56286s = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, i6Var);
        bVar.f56287w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sl, i6Var);
        bVar.a();
        this.f38160a = bVar;
        bVar.getBackupImageView().f38429a.f22737h1 = new k2(18);
        addView(this.f38160a, c8.na.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f37459c != null && (-this.f37458b.f28641id) == this.d.U2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38160a.f(z11, z10);
        nh0 C = this.f38160a.getBackupImageView().getImageReceiver().C();
        if (z10) {
            if (z11 && C != null) {
                C.K(0);
                C.P(-1);
                C.T(false, 0.0f);
                C.start();
            }
        } else if (C != null) {
            C.stop();
            C.T(false, 0.0f);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
