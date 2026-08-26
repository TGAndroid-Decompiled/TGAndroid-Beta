package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda6 implements AlertDialog.OnButtonClickListener, RecyclerAnimationScrollHelper.ScrollListener {
    public final SelectAnimatedEmojiDialog f$0;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda6(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog) {
        this.f$0 = selectAnimatedEmojiDialog;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = this.f$0;
        int i2 = selectAnimatedEmojiDialog.currentAccount;
        ConnectionsManager.getInstance(i2).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i2).clearRecentEmojiStatuses();
        selectAnimatedEmojiDialog.updateRows(false, true, true);
    }

    @Override
    public void onScroll() {
        this.f$0.invalidateParent();
    }
}
