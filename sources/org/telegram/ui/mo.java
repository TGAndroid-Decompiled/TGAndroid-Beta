package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class mo extends LinearLayout implements org.telegram.messenger.is {
    public org.telegram.ui.Components.i9 f49264a;
    public org.telegram.ui.Components.f80 f49265b;
    public int f49266c;

    public final void a() {
        boolean z10;
        org.telegram.ui.Components.i9 i9Var = this.f49264a;
        int i7 = this.f49266c;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.si.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.si.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            i9Var.k(org.telegram.messenger.gc.b(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f49265b, tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i7);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
        i9Var.setImageDrawable(this.f49265b);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25607y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ns.f(this.f49266c).c(this, org.telegram.messenger.ns.f25607y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.f49266c).n(this, org.telegram.messenger.ns.f25607y0);
    }
}
