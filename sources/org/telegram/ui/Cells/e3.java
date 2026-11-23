package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gc;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.mz;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
public abstract class e3 extends LinearLayout implements gs {
    public int f30594a;
    public org.telegram.ui.Components.q9 f30595b;
    public TextView f30596c;
    public TextView d;
    public TextView f30597e;

    public final void a() {
        TLRPC.Document document;
        org.telegram.ui.Components.q9 q9Var = this.f30595b;
        int i7 = this.f30594a;
        TLRPC.TL_messages_stickerSet r02 = si.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            r02 = si.d0(i7).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        boolean z10 = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            mz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f29324a7, 0.2f, false);
            if (d != null) {
                d.f25692e = 512;
                d.f25693f = 512;
            }
            this.f30595b.k(gc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
            q9Var.getImageReceiver().W(2);
            return;
        }
        si d02 = si.d0(i7);
        if (tL_messages_stickerSet != null) {
            z10 = false;
        }
        d02.f1("tg_placeholders_android", false, z10);
        q9Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25419y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(this.f30594a).c(this, ls.f25419y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.f30594a).n(this, ls.f25419y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.f30596c;
        TextView textView3 = this.f30597e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(hd.N0(2131747951, null));
            textView.setText(hd.N0(2131747950, null));
            textView3.setVisibility(0);
            textView3.setText(hd.N0(2131751740, null));
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            textView2.setText(hd.N0(2131747949, null));
            textView.setText(hd.N0(2131747948, null));
            textView3.setVisibility(0);
            textView3.setText(hd.N0(2131751734, null));
        } else {
            textView2.setText(hd.N0(2131747947, null));
            textView.setText(hd.N0(2131747946, null));
            textView3.setVisibility(8);
        }
    }
}
