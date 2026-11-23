package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class oo extends LinearLayout implements org.telegram.messenger.gs {
    public org.telegram.ui.Components.q9 f50633a;
    public org.telegram.ui.Components.s80 f50634b;
    public int f50635c;

    public final void a() {
        boolean z10;
        org.telegram.ui.Components.q9 q9Var = this.f50633a;
        int i7 = this.f50635c;
        TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.si.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            r02 = org.telegram.messenger.si.d0(i7).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            q9Var.k(org.telegram.messenger.gc.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f50634b, tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i7);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d02.f1("tg_placeholders_android", false, z10);
        q9Var.setImageDrawable(this.f50634b);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25419y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ls.f(this.f50635c).c(this, org.telegram.messenger.ls.f25419y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.f(this.f50635c).n(this, org.telegram.messenger.ls.f25419y0);
    }
}
