package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class StoryCellFactory extends UItem.UItemFactory {
    public static final int $r8$clinit = 0;
    public SharedPhotoVideoCell2.SharedResources sharedResources;

    static {
        UItem.UItemFactory.setup(new StoryCellFactory());
    }

    @Override
    public final void attachedView(RecyclerListView recyclerListView, View view, UItem uItem) {
        ((SharedPhotoVideoCell2) view).setReordering(uItem.reordering, false);
    }

    @Override
    public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
        sharedPhotoVideoCell2.setMessageObject((MessageObject) uItem.object, uItem.parentSpanCount, false);
        sharedPhotoVideoCell2.setChecked(uItem.checked, false);
        sharedPhotoVideoCell2.setReordering(uItem.reordering, false);
    }

    @Override
    public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        if (this.sharedResources == null) {
            this.sharedResources = new SharedPhotoVideoCell2.SharedResources(context, resourcesProvider);
        }
        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(context, this.sharedResources, i);
        sharedPhotoVideoCell2.check2 = true;
        sharedPhotoVideoCell2.isStory = true;
        return sharedPhotoVideoCell2;
    }

    @Override
    public final boolean equals(UItem uItem, UItem uItem2) {
        return uItem.accent == uItem2.accent && uItem.checked == uItem2.checked && uItem.longValue == uItem2.longValue;
    }
}
