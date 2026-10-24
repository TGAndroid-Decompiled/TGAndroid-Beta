package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.UndoView;
public final class pm implements Runnable {
    public final int f40597a;
    public final dn f40598b;
    public final MessageObject f40599c;

    public pm(dn dnVar, MessageObject messageObject, int i10) {
        this.f40597a = i10;
        this.f40598b = dnVar;
        this.f40599c = messageObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40597a) {
            case 0:
                dn dnVar = this.f40598b;
                sn snVar = dnVar.f36651a;
                snVar.T7();
                UndoView undoView = snVar.K3;
                if (undoView != null) {
                    if (snVar.Y.getVisibility() == 0 && snVar.R.getVisibility() != 0) {
                        i10 = 16;
                    } else {
                        i10 = 17;
                    }
                    int i11 = i10;
                    MessageObject messageObject = this.f40599c;
                    undoView.k(0L, i11, messageObject.getDiceEmoji(), null, null, new pm(dnVar, messageObject, 2));
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f40598b.f36651a;
                snVar2.Jb = this.f40599c.getId();
                snVar2.Kb = 0;
                return;
            default:
                sn snVar3 = this.f40598b.f36651a;
                if (snVar3.i7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(this.f40599c.getDiceEmoji(), snVar3.f41516f6, snVar3.f41764z5, snVar3.f41561j4, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = snVar3.H8();
                    snVar3.getSendMessagesHelper().sendMessage(of2);
                    return;
                }
                return;
        }
    }
}
