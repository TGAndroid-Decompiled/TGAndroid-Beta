package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda11 implements RecyclerAnimationScrollHelper.ScrollListener, AlertDialog.OnButtonClickListener {
    public final SelectAnimatedEmojiDialog f$0;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda11(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog) {
        this.f$0 = selectAnimatedEmojiDialog;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$onRecentLongClick$5(alertDialog, i);
    }

    @Override
    public void onScroll() {
        this.f$0.lambda$new$3();
    }
}
