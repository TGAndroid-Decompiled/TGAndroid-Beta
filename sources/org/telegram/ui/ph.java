package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph implements Runnable {
    public final int f37154a;
    public final zn f37155b;
    public final int f37156c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f37157f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f37158n;
    public final TLRPC.Chat f37159r;
    public final int f37160s;
    public final MessageObject v;

    public ph(zn znVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f37154a = i13;
        this.f37155b = znVar;
        this.f37156c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f37157f = i11;
        this.h = messageObject;
        this.f37158n = tL_messages_getDiscussionMessage;
        this.f37159r = chat;
        this.f37160s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f37154a) {
            case 0:
                zn znVar = this.f37155b;
                znVar.h8(new ph(znVar, this.f37156c, this.d, this.e, this.f37157f, this.h, this.f37158n, this.f37159r, this.f37160s, this.v, 1));
                return;
            default:
                zn znVar2 = this.f37155b;
                if (this.f37156c == znVar2.f40549cc) {
                    znVar2.f40574ec = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        znVar2.jc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(znVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        znVar2.f40587fc = 0;
                        znVar2.f40600gc = false;
                        znVar2.f40759u0.e1();
                        return;
                    }
                    znVar2.ya(znVar2.ic, znVar2.jc, this.f37157f, this.h, this.f37158n, this.f37159r, this.f37160s, this.v);
                    return;
                }
                return;
        }
    }
}
