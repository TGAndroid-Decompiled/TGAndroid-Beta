package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.RecyclerListView;

public final class PeerColorActivity$Page$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final int f$1;

    public PeerColorActivity$Page$$ExternalSyntheticLambda0(FrameLayout frameLayout, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = frameLayout;
        this.f$1 = i;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((PeerColorActivity.Page) this.f$0).lambda$new$0(this.f$1, view, i);
                break;
            default:
                ((SelectAnimatedEmojiDialog) this.f$0).lambda$new$4(this.f$1, view, i);
                break;
        }
    }
}
