package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lh implements Runnable {
    public final int f38878a;
    public final sn f38879b;
    public final int f38880c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38881f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38882n;
    public final TLRPC.Chat f38883r;
    public final int f38884s;
    public final MessageObject v;

    public lh(sn snVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38878a = i13;
        this.f38879b = snVar;
        this.f38880c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38881f = i11;
        this.h = messageObject;
        this.f38882n = tL_messages_getDiscussionMessage;
        this.f38883r = chat;
        this.f38884s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38878a) {
            case 0:
                sn snVar = this.f38879b;
                snVar.k8(new lh(snVar, this.f38880c, this.d, this.e, this.f38881f, this.h, this.f38882n, this.f38883r, this.f38884s, this.v, 1));
                return;
            default:
                sn snVar2 = this.f38879b;
                if (this.f38880c == snVar2.fc) {
                    snVar2.hc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        snVar2.f41304mc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(snVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        snVar2.f41255ic = 0;
                        snVar2.f41268jc = false;
                        snVar2.f41433x0.f1();
                        return;
                    }
                    snVar2.Ca(snVar2.f41292lc, snVar2.f41304mc, this.f38881f, this.h, this.f38882n, this.f38883r, this.f38884s, this.v);
                    return;
                }
                return;
        }
    }
}
