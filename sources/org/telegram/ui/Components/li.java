package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class li extends ni {
    public TLRPC.User f37129b;
    public TLRPC.TL_attachMenuBot f37130c;
    public final si d;

    public li(si siVar, Context context) {
        super(context);
        this.d = siVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = si.I4;
        org.telegram.ui.ActionBar.i6 i6Var = siVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = i6Var;
        bVar.R = true;
        TextView textView = bVar.f56156a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.f56157b.setVisibility(8);
        bVar.b(false);
        q9 q9Var = new q9(context);
        bVar.f56158c = q9Var;
        bVar.addView(q9Var, c8.ma.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f56165x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tl, i6Var);
        bVar.f56163s = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, i6Var);
        bVar.f56164w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sl, i6Var);
        bVar.a();
        this.f37793a = bVar;
        bVar.getBackupImageView().f38742a.f22639h1 = new k2(18);
        addView(this.f37793a, c8.ma.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f37130c != null && (-this.f37129b.f28552id) == this.d.U2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37793a.f(z11, z10);
        mh0 B = this.f37793a.getBackupImageView().getImageReceiver().B();
        if (z10) {
            if (z11 && B != null) {
                B.K(0);
                B.P(-1);
                B.T(false, 0.0f);
                B.start();
            }
        } else if (B != null) {
            B.stop();
            B.T(false, 0.0f);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }
}
