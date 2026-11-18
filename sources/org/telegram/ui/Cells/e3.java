package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
public abstract class e3 extends LinearLayout implements fs {
    public int f30563a;
    public org.telegram.ui.Components.q9 f30564b;
    public TextView f30565c;
    public TextView d;
    public TextView f30566e;

    public final void a() {
        TLRPC.Document document;
        org.telegram.ui.Components.q9 q9Var = this.f30564b;
        int i7 = this.f30563a;
        TLRPC.TL_messages_stickerSet r02 = ri.d0(i7).r0("tg_placeholders_android");
        if (r02 == null) {
            r02 = ri.d0(i7).p0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r02;
        boolean z10 = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            lz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29337a7, 0.2f, false);
            if (d != null) {
                d.f25486e = 512;
                d.f25487f = 512;
            }
            this.f30564b.k(fc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
            q9Var.getImageReceiver().W(2);
            return;
        }
        ri d02 = ri.d0(i7);
        if (tL_messages_stickerSet != null) {
            z10 = false;
        }
        d02.f1("tg_placeholders_android", false, z10);
        q9Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25225y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30563a).c(this, ks.f25225y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30563a).n(this, ks.f25225y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.f30565c;
        TextView textView3 = this.f30566e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(gd.M0(2131747952, null));
            textView.setText(gd.M0(2131747951, null));
            textView3.setVisibility(0);
            textView3.setText(gd.M0(2131751741, null));
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            textView2.setText(gd.M0(2131747950, null));
            textView.setText(gd.M0(2131747949, null));
            textView3.setVisibility(0);
            textView3.setText(gd.M0(2131751735, null));
        } else {
            textView2.setText(gd.M0(2131747948, null));
            textView.setText(gd.M0(2131747947, null));
            textView3.setVisibility(8);
        }
    }
}
