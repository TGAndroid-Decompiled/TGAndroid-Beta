package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class StoryLinkSheet$$ExternalSyntheticLambda6 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final BottomSheetWithRecyclerListView f$0;
    public final Object f$1;
    public final Object f$2;

    public StoryLinkSheet$$ExternalSyntheticLambda6(BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetWithRecyclerListView;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((StoryLinkSheet) this.f$0).lambda$new$4((Context) this.f$1, (StoryRecorder.AnonymousClass7) this.f$2, view, i);
                break;
            default:
                ((SelectAudioAlert) this.f$0).lambda$new$1((Utilities.Callback) this.f$1, (DarkThemeResourceProvider) this.f$2, view, i);
                break;
        }
    }
}
