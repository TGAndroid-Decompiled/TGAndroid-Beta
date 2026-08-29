package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class qm0 extends org.telegram.ui.Cells.f7 {
    @Override
    public final boolean d(MessageObject messageObject) {
        return MediaController.getInstance().playMessage(messageObject);
    }
}
