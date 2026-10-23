package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh implements Runnable {
    public final int f38567a;
    public final sn f38568b;
    public final int f38569c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38570f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38571n;
    public final TLRPC.Chat f38572r;
    public final int f38573s;
    public final MessageObject v;

    public jh(sn snVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38567a = i13;
        this.f38568b = snVar;
        this.f38569c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38570f = i11;
        this.h = messageObject;
        this.f38571n = tL_messages_getDiscussionMessage;
        this.f38572r = chat;
        this.f38573s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38567a) {
            case 0:
                sn snVar = this.f38568b;
                snVar.k8(new jh(snVar, this.f38569c, this.d, this.e, this.f38570f, this.h, this.f38571n, this.f38572r, this.f38573s, this.v, 1));
                return;
            default:
                sn snVar2 = this.f38568b;
                if (this.f38569c == snVar2.f41684sc) {
                    snVar2.f41709uc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        snVar2.zc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(snVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        snVar2.f41722vc = 0;
                        snVar2.f41735wc = false;
                        snVar2.f41737x0.g1();
                        return;
                    }
                    snVar2.Ca(snVar2.yc, snVar2.zc, this.f38570f, this.h, this.f38571n, this.f38572r, this.f38573s, this.v);
                    return;
                }
                return;
        }
    }
}
