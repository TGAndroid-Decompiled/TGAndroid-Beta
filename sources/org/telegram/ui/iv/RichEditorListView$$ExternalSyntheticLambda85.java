package org.telegram.ui.iv;

import androidx.recyclerview.widget.RecyclerView;

public final class RichEditorListView$$ExternalSyntheticLambda85 implements Runnable {
    public final int $r8$classId;
    public final RichEditorListView f$0;
    public final RecyclerView.ItemAnimator f$1;

    public RichEditorListView$$ExternalSyntheticLambda85(RichEditorListView richEditorListView, RecyclerView.ItemAnimator itemAnimator, int i) {
        this.$r8$classId = i;
        this.f$0 = richEditorListView;
        this.f$1 = itemAnimator;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.setItemAnimator(this.f$1);
                break;
            default:
                this.f$0.setItemAnimator(this.f$1);
                break;
        }
    }
}
