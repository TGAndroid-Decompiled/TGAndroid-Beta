package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class lo extends LinearLayout implements org.telegram.messenger.ls {
    public org.telegram.ui.Components.l9 f47565a;
    public org.telegram.ui.Components.c80 f47566b;
    public int f47567c;

    public final void a() {
        boolean z9;
        org.telegram.ui.Components.l9 l9Var = this.f47565a;
        int i7 = this.f47567c;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.ui.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            l9Var.k(org.telegram.messenger.hc.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f47566b, tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i7);
        if (tL_messages_stickerSet == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        b02.c1("tg_placeholders_android", false, z9);
        l9Var.setImageDrawable(this.f47566b);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25094y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.qs.f(this.f47567c).c(this, org.telegram.messenger.qs.f25094y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f47567c).n(this, org.telegram.messenger.qs.f25094y0);
    }
}
