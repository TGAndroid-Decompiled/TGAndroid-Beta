package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class kh implements Runnable {

    public final int f39728a;

    public final rn f39729b;

    public final int f39730c;
    public final TLObject d;

    public final TLRPC.TL_error f39731e;

    public final int f39732f;
    public final MessageObject h;

    public final TLRPC.TL_messages_getDiscussionMessage f39733n;

    public final TLRPC.Chat f39734r;

    public final int f39735s;
    public final MessageObject v;

    public kh(rn rnVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f39728a = i13;
        this.f39729b = rnVar;
        this.f39730c = i10;
        this.d = tLObject;
        this.f39731e = tL_error;
        this.f39732f = i11;
        this.h = messageObject;
        this.f39733n = tL_messages_getDiscussionMessage;
        this.f39734r = chat;
        this.f39735s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f39728a) {
            case 0:
                rn rnVar = this.f39729b;
                rnVar.h8(new kh(rnVar, this.f39730c, this.d, this.f39731e, this.f39732f, this.h, this.f39733n, this.f39734r, this.f39735s, this.v, 1));
                break;
            default:
                rn rnVar2 = this.f39729b;
                if (this.f39730c == rnVar2.f41999bc) {
                    rnVar2.f42025dc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        rnVar2.f42089ic = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.f39731e.text)) {
                        MessagesController.showCantOpenAlert(rnVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        rnVar2.f42038ec = 0;
                        rnVar2.fc = false;
                        rnVar2.f42213t0.f1();
                    }
                    rnVar2.ya(rnVar2.f42076hc, rnVar2.f42089ic, this.f39732f, this.h, this.f39733n, this.f39734r, this.f39735s, this.v);
                    break;
                }
                break;
        }
    }
}
