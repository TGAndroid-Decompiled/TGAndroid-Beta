package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.ActionBar.ActionBarMenuItem;

public final class StickersAlert$$ExternalSyntheticLambda16 implements ActionBarMenuItem.ActionBarMenuItemDelegate, MessagesStorage.StringCallback {
    public final StickersAlert f$0;

    public StickersAlert$$ExternalSyntheticLambda16(StickersAlert stickersAlert) {
        this.f$0 = stickersAlert;
    }

    @Override
    public void onItemClick(int i) {
        this.f$0.onSubItemClick$2(i);
    }

    @Override
    public void run(String str) {
        this.f$0.lambda$showNameEnterAlert$43();
    }
}
