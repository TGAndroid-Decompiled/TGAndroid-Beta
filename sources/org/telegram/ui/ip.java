package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ip extends LinearLayout implements org.telegram.messenger.us {
    public org.telegram.ui.Components.g9 f38286a;
    public org.telegram.ui.Components.v80 f38287b;
    public int f38288c;

    public final void a() {
        boolean z10;
        org.telegram.ui.Components.g9 g9Var = this.f38286a;
        int i10 = this.f38288c;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i10).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.ui.b0(i10).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            g9Var.k(org.telegram.messenger.ic.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f38287b, tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
        g9Var.setImageDrawable(this.f38287b);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19725y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.zs.f(this.f38288c).c(this, org.telegram.messenger.zs.f19725y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.f38288c).n(this, org.telegram.messenger.zs.f19725y0);
    }
}
