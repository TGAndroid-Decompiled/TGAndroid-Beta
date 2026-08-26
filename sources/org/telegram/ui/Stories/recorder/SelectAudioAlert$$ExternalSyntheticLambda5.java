package org.telegram.ui.Stories.recorder;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.ui.Components.UItem;

public final class SelectAudioAlert$$ExternalSyntheticLambda5 implements Consumer {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;

    public SelectAudioAlert$$ExternalSyntheticLambda5(KeyEvent.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void accept(Object obj) {
        MultipleStoriesSelector.AnonymousClass1 anonymousClass1;
        int childAdapterPosition;
        UItem item;
        switch (this.$r8$classId) {
            case 0:
                ((SelectAudioAlert) this.f$0).lambda$loadGlobalAudio$4((Long) obj);
                break;
            case 1:
                View view = (View) obj;
                MultipleStoriesSelector multipleStoriesSelector = (MultipleStoriesSelector) this.f$0;
                multipleStoriesSelector.getClass();
                if ((view instanceof MultipleStoriesSelector.EntryView) && (item = anonymousClass1.adapter.getItem((childAdapterPosition = (anonymousClass1 = multipleStoriesSelector.listView).getChildAdapterPosition(view)))) != null) {
                    MultipleStoriesSelector.EntryView entryView = (MultipleStoriesSelector.EntryView) view;
                    entryView.setPosition(multipleStoriesSelector.getPositionOf(childAdapterPosition));
                    boolean z = multipleStoriesSelector.selectedStory == item.id;
                    if (entryView.selected != z) {
                        entryView.selected = z;
                        entryView.invalidate();
                    }
                    boolean zContains = multipleStoriesSelector.selectedStories.contains(Integer.valueOf(item.id));
                    if (entryView.checked != zContains) {
                        entryView.checked = zContains;
                        entryView.invalidate();
                    }
                    view.setPressed(false);
                    break;
                }
                break;
            default:
                View view2 = (View) obj;
                MultipleStoriesSelector.AnonymousClass1 anonymousClass2 = (MultipleStoriesSelector.AnonymousClass1) this.f$0;
                anonymousClass2.getClass();
                if (view2 instanceof MultipleStoriesSelector.EntryView) {
                    StoryRecorder.AnonymousClass11 anonymousClass11 = anonymousClass2.this$0;
                    ((MultipleStoriesSelector.EntryView) view2).setPosition(anonymousClass11.getPositionOf(anonymousClass11.listView.getChildAdapterPosition(view2)));
                    view2.setPressed(false);
                }
                break;
        }
    }
}
