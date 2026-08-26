package org.telegram.ui.Adapters;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.telegram.ui.DialogsActivity;

public final class DialogsAdapter$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final DialogsAdapter f$0;

    public DialogsAdapter$$ExternalSyntheticLambda1(DialogsAdapter dialogsAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsAdapter;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                for (DialogsActivity.ViewPage viewPage : this.f$0.parentFragment.viewPages) {
                    ((LinearLayoutManager) viewPage.listView.getLayoutManager()).mDisableScroll = false;
                }
                break;
            default:
                this.f$0.onArchiveSettingsClick();
                break;
        }
    }
}
