package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh implements Runnable {
    public final int f38560a;
    public final sn f38561b;
    public final int f38562c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f38563f;
    public final MessageObject h;
    public final TLRPC.TL_messages_getDiscussionMessage f38564n;
    public final TLRPC.Chat f38565r;
    public final int f38566s;
    public final MessageObject v;

    public jh(sn snVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11, MessageObject messageObject, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i12, MessageObject messageObject2, int i13) {
        this.f38560a = i13;
        this.f38561b = snVar;
        this.f38562c = i10;
        this.d = tLObject;
        this.e = tL_error;
        this.f38563f = i11;
        this.h = messageObject;
        this.f38564n = tL_messages_getDiscussionMessage;
        this.f38565r = chat;
        this.f38566s = i12;
        this.v = messageObject2;
    }

    @Override
    public final void run() {
        switch (this.f38560a) {
            case 0:
                sn snVar = this.f38561b;
                snVar.k8(new jh(snVar, this.f38562c, this.d, this.e, this.f38563f, this.h, this.f38564n, this.f38565r, this.f38566s, this.v, 1));
                return;
            default:
                sn snVar2 = this.f38561b;
                if (this.f38562c == snVar2.f41681sc) {
                    snVar2.f41706uc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        snVar2.zc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        MessagesController.showCantOpenAlert(snVar2, LocaleController.getString(R.string.ChannelCantOpenBannedByAdmin));
                        snVar2.f41719vc = 0;
                        snVar2.f41732wc = false;
                        snVar2.f41734x0.g1();
                        return;
                    }
                    snVar2.Ca(snVar2.yc, snVar2.zc, this.f38563f, this.h, this.f38564n, this.f38565r, this.f38566s, this.v);
                    return;
                }
                return;
        }
    }
}
