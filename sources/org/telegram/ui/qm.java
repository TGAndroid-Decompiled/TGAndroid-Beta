package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class qm implements Runnable {
    public final int f40463a;
    public final en f40464b;
    public final MessageObject f40465c;

    public qm(en enVar, MessageObject messageObject, int i10) {
        this.f40463a = i10;
        this.f40464b = enVar;
        this.f40465c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40463a) {
            case 0:
                en enVar = this.f40464b;
                sn snVar = enVar.f36569a;
                snVar.T7();
                UndoView undoView = snVar.y3;
                if (undoView != null) {
                    if (snVar.Y.getVisibility() == 0 && snVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    MessageObject messageObject = this.f40465c;
                    undoView.k(0L, i11, messageObject.getDiceEmoji(), null, null, new qm(enVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f40464b.f36569a;
                snVar2.f41430wb = this.f40465c.getId();
                snVar2.f41444xb = 0;
                return;
            default:
                sn snVar3 = this.f40464b.f36569a;
                if (snVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f40465c.getDiceEmoji(), snVar3.T5, snVar3.f41311n5, snVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = snVar3.H8();
                    snVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
