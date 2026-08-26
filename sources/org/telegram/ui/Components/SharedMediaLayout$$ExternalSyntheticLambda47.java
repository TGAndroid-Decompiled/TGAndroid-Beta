package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class SharedMediaLayout$$ExternalSyntheticLambda47 implements AlertDialog.OnButtonClickListener, MessagesStorage.StringCallback {
    public final SharedMediaLayout f$0;
    public final TL_stories.StoryItem f$1;

    public SharedMediaLayout$$ExternalSyntheticLambda47(SharedMediaLayout sharedMediaLayout, TL_stories.StoryItem storyItem) {
        this.f$0 = sharedMediaLayout;
        this.f$1 = storyItem;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        SharedMediaLayout sharedMediaLayout = this.f$0;
        sharedMediaLayout.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f$1);
        BaseFragment baseFragment = sharedMediaLayout.profileActivity;
        baseFragment.getMessagesController().getStoriesController().deleteStories(sharedMediaLayout.dialog_id, arrayList);
        BulletinFactory.of(baseFragment).createSimpleBulletinWithIconSize(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).show();
        sharedMediaLayout.closeActionMode(false);
    }

    @Override
    public void run(String str) {
        this.f$0.lambda$onItemLongClick$53(this.f$1, str);
    }
}
