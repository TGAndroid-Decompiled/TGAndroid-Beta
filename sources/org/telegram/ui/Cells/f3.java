package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.at;
import org.telegram.messenger.d00;
import org.telegram.messenger.dd;
import org.telegram.messenger.jc;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
public abstract class f3 extends LinearLayout implements vs {
    public int f21892a;
    public org.telegram.ui.Components.g9 f21893b;
    public TextView f21894c;
    public TextView d;
    public TextView e;

    public final void a() {
        TLRPC.Document document;
        org.telegram.ui.Components.g9 g9Var = this.f21893b;
        int i10 = this.f21892a;
        TLRPC.TL_messages_stickerSet p02 = vi.b0(i10).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = vi.b0(i10).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        boolean z10 = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            d00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.f20873a7, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f15264f = 512;
            }
            this.f21893b.k(jc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
            g9Var.getImageReceiver().W(2);
            return;
        }
        vi b02 = vi.b0(i10);
        if (tL_messages_stickerSet != null) {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
        g9Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14821y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.f(this.f21892a).c(this, at.f14821y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.f(this.f21892a).n(this, at.f14821y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.f21894c;
        TextView textView3 = this.e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(dd.L0(2131748160, null));
            textView.setText(dd.L0(2131748159, null));
            textView3.setVisibility(0);
            textView3.setText(dd.L0(2131751752, null));
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            textView2.setText(dd.L0(2131748158, null));
            textView.setText(dd.L0(2131748157, null));
            textView3.setVisibility(0);
            textView3.setText(dd.L0(2131751746, null));
        } else {
            textView2.setText(dd.L0(2131748156, null));
            textView.setText(dd.L0(2131748155, null));
            textView3.setVisibility(8);
        }
    }
}
