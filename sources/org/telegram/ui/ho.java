package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class ho extends LinearLayout implements org.telegram.messenger.cs {
    public org.telegram.ui.Components.k9 f45955a;
    public org.telegram.ui.Components.y70 f45956b;
    public int f45957c;

    public final void a() {
        boolean z10;
        org.telegram.ui.Components.k9 k9Var = this.f45955a;
        int i3 = this.f45957c;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.li.b0(i3).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.li.b0(i3).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            k9Var.k(org.telegram.messenger.ac.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f45956b, tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i3);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
        k9Var.setImageDrawable(this.f45956b);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23340y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.hs.f(this.f45957c).c(this, org.telegram.messenger.hs.f23340y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.f45957c).n(this, org.telegram.messenger.hs.f23340y0);
    }
}
