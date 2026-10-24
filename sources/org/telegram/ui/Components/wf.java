package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class wf extends MessageObject {
    @Override
    public final boolean isOutOwner() {
        return true;
    }

    @Override
    public final boolean needDrawShareButton() {
        return false;
    }
}
