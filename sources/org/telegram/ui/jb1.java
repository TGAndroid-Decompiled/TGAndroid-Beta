package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class jb1 implements View.OnClickListener {
    public final int f46592a;
    public final zb1 f46593b;
    public final VoIPService f46594c;

    public jb1(zb1 zb1Var, VoIPService voIPService, int i3) {
        this.f46592a = i3;
        this.f46593b = zb1Var;
        this.f46594c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46592a) {
            case 0:
                zb1 zb1Var = this.f46593b;
                org.telegram.messenger.g0.h3(new kb1(zb1Var, 8));
                int i3 = zb1Var.M;
                if (i3 > 0) {
                    this.f46594c.sendCallRating(i3);
                    return;
                }
                return;
            default:
                zb1 zb1Var2 = this.f46593b;
                org.telegram.messenger.g0.h3(new kb1(zb1Var2, 10));
                int i10 = zb1Var2.M;
                if (i10 > 0) {
                    this.f46594c.sendCallRating(i10);
                    return;
                }
                return;
        }
    }
}
