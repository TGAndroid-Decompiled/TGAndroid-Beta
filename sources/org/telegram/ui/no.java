package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class no extends LinearLayout implements org.telegram.messenger.fs {
    public org.telegram.ui.Components.p9 f50345a;
    public org.telegram.ui.Components.p80 f50346b;
    public int f50347c;

    public final void a() {
        boolean z10;
        org.telegram.ui.Components.p9 p9Var = this.f50345a;
        int i7 = this.f50347c;
        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            r02 = org.telegram.messenger.ri.d0(i7).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            p9Var.k(org.telegram.messenger.fc.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f50346b, tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i7);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d02.f1("tg_placeholders_android", false, z10);
        p9Var.setImageDrawable(this.f50346b);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25324y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ks.f(this.f50347c).c(this, org.telegram.messenger.ks.f25324y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f50347c).n(this, org.telegram.messenger.ks.f25324y0);
    }
}
