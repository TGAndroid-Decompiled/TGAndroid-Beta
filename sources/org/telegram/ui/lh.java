package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh implements Runnable {
    public final int f38825a;
    public final sn f38826b;
    public final int f38827c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38828f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38829n;
    public final TLRPC.Chat f38830r;
    public final int f38831s;
    public final MessageObject v;

    public lh(sn snVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38825a = i13;
        this.f38826b = snVar;
        this.f38827c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38828f = i11;
        this.h = messageObject;
        this.f38829n = tL_messages_getDiscussionMessage;
        this.f38830r = chat;
        this.f38831s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38825a) {
            case 0:
                sn snVar = this.f38826b;
                snVar.k8(new lh(snVar, this.f38827c, this.d, this.e, this.f38828f, this.h, this.f38829n, this.f38830r, this.f38831s, this.v, 1));
                return;
            default:
                sn snVar2 = this.f38826b;
                if (this.f38827c == snVar2.fc) {
                    snVar2.hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        snVar2.f41290mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(snVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        snVar2.f41241ic = 0;
                        snVar2.f41254jc = false;
                        snVar2.f41419x0.f1();
                        return;
                    }
                    snVar2.Ca(snVar2.f41278lc, snVar2.f41290mc, this.f38828f, this.h, this.f38829n, this.f38830r, this.f38831s, this.v);
                    return;
                }
                return;
        }
    }
}
