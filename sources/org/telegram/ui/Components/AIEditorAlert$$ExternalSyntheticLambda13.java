package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaMusic;

public final class AIEditorAlert$$ExternalSyntheticLambda13 implements Utilities.CallbackReturn {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public AIEditorAlert$$ExternalSyntheticLambda13(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((AIEditorAlert) this.f$0).lambda$new$8((Theme.ResourcesProvider) this.f$1, (Context) this.f$2, (AIEditorAlert.Tabs.Tab) obj);
            case 1:
                return ChatAttachAlertPollLayout.lambda$openEditOrReplaceMenu$16((String) this.f$0, (String) this.f$1, (PollAttachedMediaMusic) this.f$2, (View) obj);
            default:
                return RecyclerListView.lambda$cachedIsViewTypeShadow$3((RecyclerListView) this.f$0, (Utilities.CallbackReturn) this.f$1, (SparseIntArray) this.f$2, (View) obj);
        }
    }
}
