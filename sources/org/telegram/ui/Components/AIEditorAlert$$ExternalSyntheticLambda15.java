package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.Theme;

public final class AIEditorAlert$$ExternalSyntheticLambda15 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public AIEditorAlert$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return ((AIEditorAlert) this.f$0).lambda$new$12((Theme.ResourcesProvider) this.f$1, (Context) this.f$2, view);
            default:
                return ((ChatActivityEnterView) this.f$0).lambda$setEditingMessageObject$75((MessageObject) this.f$1, (MessageObject.GroupedMessages) this.f$2, view);
        }
    }
}
