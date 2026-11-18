package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class rv0 implements org.telegram.ui.ActionBar.m0, org.telegram.messenger.rr {
    public final iw0 f39317a;

    public rv0(iw0 iw0Var) {
        this.f39317a = iw0Var;
    }

    @Override
    public void a(String str) {
        iw0 iw0Var = this.f39317a;
        new w30(iw0Var.getContext(), iw0Var.f36241j2, null, iw0Var.J0).show();
    }

    @Override
    public void g(int i7) {
        String str;
        iw0 iw0Var = this.f39317a;
        org.telegram.ui.ActionBar.h2 h2Var = iw0Var.G1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = iw0Var.N1;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + org.telegram.messenger.mp.u1(iw0Var.f30187a).X2 + "/addemoji/" + iw0Var.N1.set.short_name;
            } else {
                str = "https://" + org.telegram.messenger.mp.u1(iw0Var.f30187a).X2 + "/addstickers/" + iw0Var.N1.set.short_name;
            }
            String str2 = str;
            if (i7 == 1) {
                Context context = iw0Var.I1;
                if (context == null && h2Var != null) {
                    context = h2Var.getParentActivity();
                }
                if (context == null) {
                    context = iw0Var.getContext();
                }
                uv0 uv0Var = new uv0(iw0Var, context, str2, str2, iw0Var.J0);
                if (h2Var != null) {
                    h2Var.showDialog(uv0Var);
                    if (h2Var instanceof org.telegram.ui.bn) {
                        boolean V9 = ((org.telegram.ui.bn) h2Var).V9();
                        uv0Var.f30208i0 = V9;
                        uv0Var.f30215n = V9;
                        return;
                    }
                    return;
                }
                uv0Var.show();
            } else if (i7 == 2) {
                try {
                    org.telegram.messenger.g0.g(str2);
                    new lc((FrameLayout) iw0Var.f30190b, iw0Var.J0).k(false).j();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == 3) {
                if (iw0Var.M1) {
                    iw0Var.M0();
                } else {
                    iw0Var.O0();
                }
            } else if (i7 == 4) {
                nw0.c(iw0Var.N1.set, iw0Var.J0, iw0Var.getContext(), new d(iw0Var, 21));
            } else if (i7 == 5) {
                nw0.b(iw0Var.N1.set, iw0Var.J0, iw0Var.getContext(), new tv0(iw0Var, 2));
            }
        }
    }
}
