package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public final class qe0 extends LinearLayout implements org.telegram.messenger.cs {
    public final org.telegram.ui.Components.k9 f48869a;
    public final int f48870b;

    public qe0(Context context) {
        super(context);
        this.f48870b = org.telegram.messenger.h10.f22829t0;
        setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f48869a = k9Var;
        addView(k9Var, b8.mf.t(104, 104, 49, 0, 2, 0, 0));
    }

    public final void a() {
        boolean z10;
        int i3 = this.f48870b;
        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.li.b0(i3).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = org.telegram.messenger.li.b0(i3).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 4) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.f48869a.k(org.telegram.messenger.ac.b(document), "104_104", "tgs", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f27824a7, 1.0f, null), tL_messages_stickerSet);
            return;
        }
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i3);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
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
        org.telegram.messenger.hs.f(this.f48870b).c(this, org.telegram.messenger.hs.f23340y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.f48870b).n(this, org.telegram.messenger.hs.f23340y0);
    }
}
