package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class jv0 implements org.telegram.ui.ActionBar.m0, org.telegram.messenger.wr {
    public final zv0 f35165a;

    public jv0(zv0 zv0Var) {
        this.f35165a = zv0Var;
    }

    @Override
    public void a(String str) {
        zv0 zv0Var = this.f35165a;
        new m30(zv0Var.getContext(), zv0Var.f41148f2, null, zv0Var.I0).show();
    }

    @Override
    public void i(int i7) {
        String str;
        zv0 zv0Var = this.f35165a;
        org.telegram.ui.ActionBar.f2 f2Var = zv0Var.C1;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zv0Var.J1;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null && stickerSet.emojis) {
                str = "https://" + org.telegram.messenger.qp.s1(zv0Var.f28621a).U2 + "/addemoji/" + zv0Var.J1.set.short_name;
            } else {
                str = "https://" + org.telegram.messenger.qp.s1(zv0Var.f28621a).U2 + "/addstickers/" + zv0Var.J1.set.short_name;
            }
            String str2 = str;
            if (i7 == 1) {
                Context context = zv0Var.E1;
                if (context == null && f2Var != null) {
                    context = f2Var.getParentActivity();
                }
                if (context == null) {
                    context = zv0Var.getContext();
                }
                lv0 lv0Var = new lv0(zv0Var, context, str2, str2, zv0Var.I0);
                if (f2Var != null) {
                    f2Var.showDialog(lv0Var);
                    if (f2Var instanceof org.telegram.ui.cn) {
                        boolean U9 = ((org.telegram.ui.cn) f2Var).U9();
                        lv0Var.f28640h0 = U9;
                        lv0Var.f28645n = U9;
                        return;
                    }
                    return;
                }
                lv0Var.show();
            } else if (i7 == 2) {
                try {
                    org.telegram.messenger.g0.g(str2);
                    new hc((FrameLayout) zv0Var.f28624b, zv0Var.I0).k(false).j();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i7 == 3) {
                if (zv0Var.I1) {
                    zv0Var.L0();
                } else {
                    zv0Var.N0();
                }
            } else if (i7 == 4) {
                ew0.c(zv0Var.J1.set, zv0Var.I0, zv0Var.getContext(), new d(zv0Var, 20));
            } else if (i7 == 5) {
                ew0.b(zv0Var.J1.set, zv0Var.I0, zv0Var.getContext(), new kv0(zv0Var, 2));
            }
        }
    }
}
