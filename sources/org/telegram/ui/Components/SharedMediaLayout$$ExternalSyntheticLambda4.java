package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;

public final class SharedMediaLayout$$ExternalSyntheticLambda4 implements MessagesStorage.StringCallback, AlertDialog.OnButtonClickListener {
    public final SharedMediaLayout f$0;
    public final TL_stories.StoryItem f$1;

    public SharedMediaLayout$$ExternalSyntheticLambda4(SharedMediaLayout sharedMediaLayout, TL_stories.StoryItem storyItem) {
        this.f$0 = sharedMediaLayout;
        this.f$1 = storyItem;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$onItemLongClick$64(this.f$1, alertDialog, i);
    }

    @Override
    public void run(String str) {
        this.f$0.lambda$onItemLongClick$53(this.f$1, str);
    }
}
