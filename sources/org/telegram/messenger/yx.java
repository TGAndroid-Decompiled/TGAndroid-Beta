package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_update;
public final class yx implements Runnable {
    public final int f26675a;
    public final yy f26676b;
    public final TL_update.TL_updateNewMessage f26677c;

    public yx(yy yyVar, TL_update.TL_updateNewMessage tL_updateNewMessage, int i3) {
        this.f26675a = i3;
        this.f26676b = yyVar;
        this.f26677c = tL_updateNewMessage;
    }

    @Override
    public final void run() {
        switch (this.f26675a) {
            case 0:
                hp messagesController = this.f26676b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage = this.f26677c;
                messagesController.M3(tL_updateNewMessage.pts, -1, tL_updateNewMessage.pts_count);
                return;
            case 1:
                hp messagesController2 = this.f26676b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage2 = this.f26677c;
                messagesController2.M3(tL_updateNewMessage2.pts, -1, tL_updateNewMessage2.pts_count);
                return;
            default:
                hp messagesController3 = this.f26676b.getMessagesController();
                TL_update.TL_updateNewMessage tL_updateNewMessage3 = this.f26677c;
                messagesController3.M3(tL_updateNewMessage3.pts, -1, tL_updateNewMessage3.pts_count);
                return;
        }
    }
}
