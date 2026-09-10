package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class cn0 extends org.telegram.ui.Cells.k7 {
    @Override
    public final boolean d(MessageObject messageObject) {
        return MediaController.getInstance().playMessage(messageObject);
    }
}
