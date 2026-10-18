package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class qm implements Runnable {
    public final int f40435a;
    public final en f40436b;
    public final MessageObject f40437c;

    public qm(en enVar, MessageObject messageObject, int i10) {
        this.f40435a = i10;
        this.f40436b = enVar;
        this.f40437c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40435a) {
            case 0:
                en enVar = this.f40436b;
                sn snVar = enVar.f36557a;
                snVar.T7();
                UndoView undoView = snVar.y3;
                if (undoView != null) {
                    if (snVar.Y.getVisibility() == 0 && snVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    MessageObject messageObject = this.f40437c;
                    undoView.k(0L, i11, messageObject.getDiceEmoji(), null, null, new qm(enVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f40436b.f36557a;
                snVar2.f41416wb = this.f40437c.getId();
                snVar2.f41430xb = 0;
                return;
            default:
                sn snVar3 = this.f40436b.f36557a;
                if (snVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f40437c.getDiceEmoji(), snVar3.T5, snVar3.f41297n5, snVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = snVar3.H8();
                    snVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
