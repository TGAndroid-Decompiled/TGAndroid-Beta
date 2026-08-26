package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarMenuItem;

public final class AudioPlayerAlert$$ExternalSyntheticLambda36 implements RecyclerListView.OnItemLongClickListener, ActionBarMenuItem.ActionBarMenuItemDelegate {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;

    public AudioPlayerAlert$$ExternalSyntheticLambda36(AudioPlayerAlert audioPlayerAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
    }

    @Override
    public void onItemClick(int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$new$1(i);
                break;
            case 2:
                this.f$0.lambda$new$6(i);
                break;
            default:
                this.f$0.onSubItemClick(i);
                break;
        }
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$new$10(view, i);
    }
}
