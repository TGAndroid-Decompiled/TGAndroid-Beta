package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
public abstract class f3 extends LinearLayout implements us {
    public int f21891a;
    public org.telegram.ui.Components.g9 f21892b;
    public TextView f21893c;
    public TextView d;
    public TextView e;

    public final void a() {
        TLRPC.Document document;
        org.telegram.ui.Components.g9 g9Var = this.f21892b;
        int i10 = this.f21891a;
        TLRPC.TL_messages_stickerSet p02 = ui.b0(i10).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = ui.b0(i10).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        boolean z10 = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            c00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.f20872a7, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f14875f = 512;
            }
            this.f21892b.k(ic.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
            g9Var.getImageReceiver().W(2);
            return;
        }
        ui b02 = ui.b0(i10);
        if (tL_messages_stickerSet != null) {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
        g9Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19725y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.f21891a).c(this, zs.f19725y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.f21891a).n(this, zs.f19725y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.f21893c;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(cd.L0(2131748160, null));
            textView.setText(cd.L0(2131748159, null));
            textView3.setVisibility(0);
            textView3.setText(cd.L0(2131751752, null));
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            textView2.setText(cd.L0(2131748158, null));
            textView.setText(cd.L0(2131748157, null));
            textView3.setVisibility(0);
            textView3.setText(cd.L0(2131751746, null));
        } else {
            textView2.setText(cd.L0(2131748156, null));
            textView.setText(cd.L0(2131748155, null));
            textView3.setVisibility(8);
        }
    }
}
