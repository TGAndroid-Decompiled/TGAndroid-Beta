package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
public abstract class d3 extends LinearLayout implements cs {
    public int f29078a;
    public org.telegram.ui.Components.k9 f29079b;
    public TextView f29080c;
    public TextView d;
    public TextView f29081e;

    public final void a() {
        TLRPC.Document document;
        org.telegram.ui.Components.k9 k9Var = this.f29079b;
        int i3 = this.f29078a;
        TLRPC.TL_messages_stickerSet p02 = li.b0(i3).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = li.b0(i3).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        boolean z10 = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            jz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f27824a7, 0.2f, false);
            if (d != null) {
                d.f23763e = 512;
                d.f23764f = 512;
            }
            this.f29079b.k(ac.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
            k9Var.getImageReceiver().W(2);
            return;
        }
        li b02 = li.b0(i3);
        if (tL_messages_stickerSet != null) {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
        k9Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23340y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f29078a).c(this, hs.f23340y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f29078a).n(this, hs.f23340y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.f29080c;
        TextView textView3 = this.f29081e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(bd.M0(2131748152, null));
            textView.setText(bd.M0(2131748151, null));
            textView3.setVisibility(0);
            textView3.setText(bd.M0(2131751752, null));
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            textView2.setText(bd.M0(2131748150, null));
            textView.setText(bd.M0(2131748149, null));
            textView3.setVisibility(0);
            textView3.setText(bd.M0(2131751746, null));
        } else {
            textView2.setText(bd.M0(2131748148, null));
            textView.setText(bd.M0(2131748147, null));
            textView3.setVisibility(8);
        }
    }
}
