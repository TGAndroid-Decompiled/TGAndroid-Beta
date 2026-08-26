package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Stories.recorder.MultipleStoriesSelector;

public final class GroupColorActivity$$ExternalSyntheticLambda0 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public GroupColorActivity$$ExternalSyntheticLambda0(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((GroupColorActivity) this.f$0).lambda$openBoostDialog$0(this.f$1, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                View view = (View) obj;
                MultipleStoriesSelector multipleStoriesSelector = (MultipleStoriesSelector) this.f$0;
                multipleStoriesSelector.getClass();
                if (view instanceof MultipleStoriesSelector.EntryView) {
                    MultipleStoriesSelector.AnonymousClass1 anonymousClass1 = multipleStoriesSelector.listView;
                    anonymousClass1.getClass();
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                    UItem item = anonymousClass1.adapter.getItem(childAdapterPosition);
                    if (item != null) {
                        MultipleStoriesSelector.EntryView entryView = (MultipleStoriesSelector.EntryView) view;
                        entryView.setPosition(multipleStoriesSelector.getPositionOf(childAdapterPosition));
                        boolean z = this.f$1 == item.id;
                        if (entryView.selected != z) {
                            entryView.selected = z;
                            entryView.invalidate();
                        }
                        view.setPressed(false);
                        break;
                    }
                }
                break;
        }
    }
}
