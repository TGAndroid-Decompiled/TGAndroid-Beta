package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class StoryCellFactory extends UItem.UItemFactory {
    private SharedPhotoVideoCell2.SharedResources sharedResources;

    static {
        UItem.UItemFactory.setup(new StoryCellFactory());
    }

    @Override
    public SharedPhotoVideoCell2 createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        if (this.sharedResources == null) {
            this.sharedResources = new SharedPhotoVideoCell2.SharedResources(context, resourcesProvider);
        }
        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(context, this.sharedResources, i);
        sharedPhotoVideoCell2.setCheck2();
        sharedPhotoVideoCell2.isStory = true;
        return sharedPhotoVideoCell2;
    }

    @Override
    public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
        sharedPhotoVideoCell2.setMessageObject((MessageObject) uItem.object, uItem.parentSpanCount);
        sharedPhotoVideoCell2.setChecked(uItem.checked, false);
        sharedPhotoVideoCell2.setReordering(uItem.reordering, false);
    }

    @Override
    public void attachedView(View view, UItem uItem) {
        ((SharedPhotoVideoCell2) view).setReordering(uItem.reordering, false);
    }

    public static UItem asStory(int i, MessageObject messageObject, int i2, boolean z) {
        TL_stories.StoryItem storyItem;
        UItem spanCount = UItem.ofFactory(StoryCellFactory.class).setSpanCount(1);
        spanCount.intValue = i;
        spanCount.object = messageObject;
        spanCount.longValue = (messageObject == null || (storyItem = messageObject.storyItem) == null) ? -1L : storyItem.id;
        spanCount.collapsed = z;
        spanCount.parentSpanCount = i2;
        return spanCount;
    }

    @Override
    public boolean equals(UItem uItem, UItem uItem2) {
        return uItem.accent == uItem2.accent && uItem.checked == uItem2.checked && uItem.longValue == uItem2.longValue;
    }
}
