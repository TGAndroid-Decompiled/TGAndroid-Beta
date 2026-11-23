package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class uv0 implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.sr {
    public final kw0 f40594a;

    public uv0(kw0 kw0Var) {
        this.f40594a = kw0Var;
    }

    @Override
    public void a(String str) {
        kw0 kw0Var = this.f40594a;
        new z30(kw0Var.getContext(), kw0Var.f37012j2, null, kw0Var.J0).show();
    }

    @Override
    public void g(int i7) {
        String str;
        kw0 kw0Var = this.f40594a;
        org.telegram.ui.ActionBar.g2 g2Var = kw0Var.G1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kw0Var.N1;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + org.telegram.messenger.np.u1(kw0Var.f30173a).X2 + "/addemoji/" + kw0Var.N1.set.short_name;
            } else {
                str = "https://" + org.telegram.messenger.np.u1(kw0Var.f30173a).X2 + "/addstickers/" + kw0Var.N1.set.short_name;
            }
            String str2 = str;
            if (i7 == 1) {
                Context context = kw0Var.I1;
                if (context == null && g2Var != null) {
                    context = g2Var.getParentActivity();
                }
                if (context == null) {
                    context = kw0Var.getContext();
                }
                wv0 wv0Var = new wv0(kw0Var, context, str2, str2, kw0Var.J0);
                if (g2Var != null) {
                    g2Var.showDialog(wv0Var);
                    if (g2Var instanceof org.telegram.ui.bn) {
                        boolean V9 = ((org.telegram.ui.bn) g2Var).V9();
                        wv0Var.f30194i0 = V9;
                        wv0Var.f30201n = V9;
                        return;
                    }
                    return;
                }
                wv0Var.show();
            } else if (i7 == 2) {
                try {
                    org.telegram.messenger.g0.g(str2);
                    new lc((FrameLayout) kw0Var.f30176b, kw0Var.J0).k(false).j();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == 3) {
                if (kw0Var.M1) {
                    kw0Var.M0();
                } else {
                    kw0Var.O0();
                }
            } else if (i7 == 4) {
                pw0.c(kw0Var.N1.set, kw0Var.J0, kw0Var.getContext(), new d(kw0Var, 21));
            } else if (i7 == 5) {
                pw0.b(kw0Var.N1.set, kw0Var.J0, kw0Var.getContext(), new vv0(kw0Var, 2));
            }
        }
    }
}
