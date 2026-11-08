package org.telegram.ui.Cells;

import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
public abstract class d3 extends LinearLayout implements ls {
    public int f29015a;
    public org.telegram.ui.Components.l9 f29016b;
    public TextView f29017c;
    public TextView d;
    public TextView f29018e;

    public final void a() {
        TLRPC.Document document;
        org.telegram.ui.Components.l9 l9Var = this.f29016b;
        int i7 = this.f29015a;
        TLRPC.TL_messages_stickerSet p02 = ui.b0(i7).p0("tg_placeholders_android");
        if (p02 == null) {
            p02 = ui.b0(i7).n0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
        boolean z9 = true;
        if (tL_messages_stickerSet != null && 1 < tL_messages_stickerSet.documents.size()) {
            document = tL_messages_stickerSet.documents.get(1);
        } else {
            document = null;
        }
        if (document != null) {
            rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f27796a7, 0.2f, false);
            if (d != null) {
                d.f25382e = 512;
                d.f25383f = 512;
            }
            this.f29016b.k(hc.b(document), "130_130", "tgs", d, tL_messages_stickerSet);
            l9Var.getImageReceiver().W(2);
            return;
        }
        ui b02 = ui.b0(i7);
        if (tL_messages_stickerSet != null) {
            z9 = false;
        }
        b02.c1("tg_placeholders_android", false, z9);
        l9Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25111y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f29015a).c(this, qs.f25111y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f29015a).n(this, qs.f25111y0);
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        TextView textView = this.d;
        TextView textView2 = this.f29017c;
        TextView textView3 = this.f29018e;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            textView2.setText(id.M0(2131748145, null));
            textView.setText(id.M0(2131748144, null));
            textView3.setVisibility(0);
            textView3.setText(id.M0(2131751752, null));
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            textView2.setText(id.M0(2131748143, null));
            textView.setText(id.M0(2131748142, null));
            textView3.setVisibility(0);
            textView3.setText(id.M0(2131751746, null));
        } else {
            textView2.setText(id.M0(2131748141, null));
            textView.setText(id.M0(2131748140, null));
            textView3.setVisibility(8);
        }
    }
}
