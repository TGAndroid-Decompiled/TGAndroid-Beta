package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.ActionBar.ActionBarMenuItem;

public final class StickersAlert$$ExternalSyntheticLambda20 implements MessagesStorage.StringCallback, ActionBarMenuItem.ActionBarMenuItemDelegate {
    public final StickersAlert f$0;

    public StickersAlert$$ExternalSyntheticLambda20(StickersAlert stickersAlert) {
        this.f$0 = stickersAlert;
    }

    @Override
    public void onItemClick(int i) {
        this.f$0.onSubItemClick(i);
    }

    @Override
    public void run(String str) {
        this.f$0.lambda$showNameEnterAlert$43(str);
    }
}
