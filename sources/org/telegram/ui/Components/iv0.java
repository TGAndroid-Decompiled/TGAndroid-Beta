package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class iv0 implements org.telegram.ui.ActionBar.m0, org.telegram.messenger.wr {
    public final yv0 f34772a;

    public iv0(yv0 yv0Var) {
        this.f34772a = yv0Var;
    }

    @Override
    public void a(String str) {
        yv0 yv0Var = this.f34772a;
        new l30(yv0Var.getContext(), yv0Var.f40743i2, null, yv0Var.I0).show();
    }

    @Override
    public void i(int i7) {
        String str;
        yv0 yv0Var = this.f34772a;
        org.telegram.ui.ActionBar.f2 f2Var = yv0Var.F1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yv0Var.M1;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + org.telegram.messenger.qp.s1(yv0Var.f28669a).U2 + "/addemoji/" + yv0Var.M1.set.short_name;
            } else {
                str = "https://" + org.telegram.messenger.qp.s1(yv0Var.f28669a).U2 + "/addstickers/" + yv0Var.M1.set.short_name;
            }
            String str2 = str;
            if (i7 == 1) {
                Context context = yv0Var.H1;
                if (context == null && f2Var != null) {
                    context = f2Var.getParentActivity();
                }
                if (context == null) {
                    context = yv0Var.getContext();
                }
                kv0 kv0Var = new kv0(yv0Var, context, str2, str2, yv0Var.I0);
                if (f2Var != null) {
                    f2Var.showDialog(kv0Var);
                    if (f2Var instanceof org.telegram.ui.cn) {
                        boolean U9 = ((org.telegram.ui.cn) f2Var).U9();
                        kv0Var.f28688h0 = U9;
                        kv0Var.f28696n = U9;
                        return;
                    }
                    return;
                }
                kv0Var.show();
            } else if (i7 == 2) {
                try {
                    org.telegram.messenger.g0.g(str2);
                    new gc((FrameLayout) yv0Var.f28672b, yv0Var.I0).k(false).j();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == 3) {
                if (yv0Var.L1) {
                    yv0Var.L0();
                } else {
                    yv0Var.N0();
                }
            } else if (i7 == 4) {
                dw0.c(yv0Var.M1.set, yv0Var.I0, yv0Var.getContext(), new d(yv0Var, 20));
            } else if (i7 == 5) {
                dw0.b(yv0Var.M1.set, yv0Var.I0, yv0Var.getContext(), new jv0(yv0Var, 2));
            }
        }
    }
}
