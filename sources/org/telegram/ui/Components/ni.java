package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ni extends pi {
    public TLRPC.User f37877b;
    public TLRPC.TL_attachMenuBot f37878c;
    public final ui d;

    public ni(ui uiVar, Context context) {
        super(context);
        this.d = uiVar;
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i7 = ui.I4;
        org.telegram.ui.ActionBar.h6 h6Var = uiVar.J0;
        qh.b bVar = new qh.b(context);
        bVar.d = h6Var;
        bVar.R = true;
        TextView textView = bVar.f56197a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        bVar.f56198b.setVisibility(8);
        bVar.b(false);
        q9 q9Var = new q9(context);
        bVar.f56199c = q9Var;
        bVar.addView(q9Var, c8.ma.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f56206x = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Tl, h6Var);
        bVar.f56204s = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Rl, h6Var);
        bVar.f56205w = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Sl, h6Var);
        bVar.a();
        this.f38603a = bVar;
        bVar.getBackupImageView().f38842a.f22667h1 = new l2(18);
        addView(this.f38603a, c8.ma.c(-1.0f, -1));
    }

    public final void a(boolean z10) {
        boolean z11;
        if (this.f37878c != null && (-this.f37877b.f28580id) == this.d.U2) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38603a.f(z11, z10);
        oh0 B = this.f38603a.getBackupImageView().getImageReceiver().B();
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
