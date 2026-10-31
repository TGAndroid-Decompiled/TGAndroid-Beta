package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class cg0 extends LinearLayout implements org.telegram.messenger.us {
    public final org.telegram.ui.Components.g9 f36462a;
    public final int f36463b;

    public cg0(Context context) {
        super(context);
        this.f36463b = org.telegram.messenger.d20.f15147s0;
        setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f36462a = g9Var;
        addView(g9Var, w7.b6.t(104, 104, 49, 0, 2, 0, 0));
    }

    public final void a() {
        boolean z10;
        int i10 = this.f36463b;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i10).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.ui.b0(i10).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 4) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.f36462a.k(org.telegram.messenger.ic.b(document), "104_104", "tgs", org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.f20872a7, 1.0f, null), tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
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
        org.telegram.messenger.zs.f(this.f36463b).c(this, org.telegram.messenger.zs.f19725y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.f36463b).n(this, org.telegram.messenger.zs.f19725y0);
    }
}
