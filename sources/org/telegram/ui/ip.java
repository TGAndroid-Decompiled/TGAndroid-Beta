package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ip extends LinearLayout implements org.telegram.messenger.vs {
    public org.telegram.ui.Components.g9 f38116a;
    public org.telegram.ui.Components.v80 f38117b;
    public int f38118c;

    public final void a() {
        boolean z10;
        org.telegram.ui.Components.g9 g9Var = this.f38116a;
        int i10 = this.f38118c;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.vi.b0(i10).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.vi.b0(i10).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            g9Var.k(org.telegram.messenger.jc.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f38117b, tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(i10);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
        g9Var.setImageDrawable(this.f38117b);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14821y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.at.f(this.f38118c).c(this, org.telegram.messenger.at.f14821y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(this.f38118c).n(this, org.telegram.messenger.at.f14821y0);
    }
}
