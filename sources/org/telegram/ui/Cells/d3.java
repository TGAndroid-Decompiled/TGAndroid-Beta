package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.pz;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
public abstract class d3 extends LinearLayout implements is {
    public int f30136a;
    public org.telegram.ui.Components.i9 f30137b;
    public TextView f30138c;
    public TextView d;
    public TextView f30139e;

    public final void a() {
        TLRPC.Document document;
        org.telegram.ui.Components.i9 i9Var = this.f30137b;
        int i7 = this.f30136a;
        TLRPC.TL_messages_stickerSet p02 = si.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = si.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        boolean z10 = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            pz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.f28792a7, 0.2f, false);
            if (d != null) {
                d.f26029e = 512;
                d.f26030f = 512;
            }
            this.f30137b.k(gc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
            i9Var.getImageReceiver().W(2);
            return;
        }
        si b02 = si.b0(i7);
        if (tL_messages_stickerSet != null) {
            z10 = false;
        }
        b02.c1("tg_placeholders_android", false, z10);
        i9Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25608y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.f30136a).c(this, ns.f25608y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f30136a).n(this, ns.f25608y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.f30138c;
        TextView textView3 = this.f30139e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(hd.M0(2131748144, null));
            textView.setText(hd.M0(2131748143, null));
            textView3.setVisibility(0);
            textView3.setText(hd.M0(2131751752, null));
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            textView2.setText(hd.M0(2131748142, null));
            textView.setText(hd.M0(2131748141, null));
            textView3.setVisibility(0);
            textView3.setText(hd.M0(2131751746, null));
        } else {
            textView2.setText(hd.M0(2131748140, null));
            textView.setText(hd.M0(2131748139, null));
            textView3.setVisibility(8);
        }
    }
}
