package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class no extends LinearLayout implements org.telegram.messenger.ls {
    public org.telegram.ui.Components.k9 f48235a;
    public org.telegram.ui.Components.c80 f48236b;
    public int f48237c;

    public final void a() {
        boolean z9;
        org.telegram.ui.Components.k9 k9Var = this.f48235a;
        int i7 = this.f48237c;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.ui.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            k9Var.k(org.telegram.messenger.hc.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f48236b, tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i7);
        if (tL_messages_stickerSet == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        b02.c1("tg_placeholders_android", false, z9);
        k9Var.setImageDrawable(this.f48236b);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25115y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.qs.f(this.f48237c).c(this, org.telegram.messenger.qs.f25115y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f48237c).n(this, org.telegram.messenger.qs.f25115y0);
    }
}
