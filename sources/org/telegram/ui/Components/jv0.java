package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class jv0 implements org.telegram.ui.ActionBar.l0, org.telegram.messenger.tr {
    public final bw0 f36191a;

    public jv0(bw0 bw0Var) {
        this.f36191a = bw0Var;
    }

    @Override
    public void a(String str) {
        bw0 bw0Var = this.f36191a;
        new o30(bw0Var.getContext(), bw0Var.f33404j2, null, bw0Var.J0).show();
    }

    @Override
    public void g(int i7) {
        String str;
        bw0 bw0Var = this.f36191a;
        org.telegram.ui.ActionBar.e2 e2Var = bw0Var.G1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = bw0Var.N1;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + org.telegram.messenger.np.s1(bw0Var.f29679a).V2 + "/addemoji/" + bw0Var.N1.set.short_name;
            } else {
                str = "https://" + org.telegram.messenger.np.s1(bw0Var.f29679a).V2 + "/addstickers/" + bw0Var.N1.set.short_name;
            }
            String str2 = str;
            if (i7 == 1) {
                Context context = bw0Var.I1;
                if (context == null && e2Var != null) {
                    context = e2Var.getParentActivity();
                }
                if (context == null) {
                    context = bw0Var.getContext();
                }
                mv0 mv0Var = new mv0(bw0Var, context, str2, str2, bw0Var.J0);
                if (e2Var != null) {
                    e2Var.showDialog(mv0Var);
                    if (e2Var instanceof org.telegram.ui.an) {
                        boolean V9 = ((org.telegram.ui.an) e2Var).V9();
                        mv0Var.f29700i0 = V9;
                        mv0Var.f29707n = V9;
                        return;
                    }
                    return;
                }
                mv0Var.show();
            } else if (i7 == 2) {
                try {
                    org.telegram.messenger.g0.g(str2);
                    new cc((FrameLayout) bw0Var.f29682b, bw0Var.J0).k(false).j();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == 3) {
                if (bw0Var.M1) {
                    bw0Var.L0();
                } else {
                    bw0Var.N0();
                }
            } else if (i7 == 4) {
                gw0.c(bw0Var.N1.set, bw0Var.J0, bw0Var.getContext(), new d(bw0Var, 20));
            } else if (i7 == 5) {
                gw0.b(bw0Var.N1.set, bw0Var.J0, bw0Var.getContext(), new kv0(bw0Var, 2));
            }
        }
    }
}
