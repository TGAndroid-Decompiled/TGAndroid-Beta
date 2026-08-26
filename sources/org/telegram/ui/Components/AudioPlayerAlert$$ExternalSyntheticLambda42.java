package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.Theme;

public final class AudioPlayerAlert$$ExternalSyntheticLambda42 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;
    public final Object f$1;

    public AudioPlayerAlert$$ExternalSyntheticLambda42(KeyEvent.Callback callback, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return ((AudioPlayerAlert) this.f$0).lambda$new$4((Theme.ResourcesProvider) this.f$1, view);
            default:
                return ((AIEditorAlert.Tabs) this.f$0).lambda$addTab$3((AIEditorAlert.Tabs.Tab) this.f$1, view);
        }
    }
}
