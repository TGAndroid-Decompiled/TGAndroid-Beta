package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
public final class pf extends MessageObject {
    @Override
    public final boolean isOutOwner() {
        return true;
    }

    @Override
    public final boolean needDrawShareButton() {
        return false;
    }
}
