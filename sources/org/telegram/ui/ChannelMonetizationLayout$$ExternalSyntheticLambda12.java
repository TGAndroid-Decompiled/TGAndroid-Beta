package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.PollEditTextCell;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda12 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda12(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ((ChannelMonetizationLayout) this.f$0).lambda$new$18((BaseFragment) this.f$1, textView, i, keyEvent);
            default:
                return ((PollCreateActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$0((PollEditTextCell) this.f$1, textView, i, keyEvent);
        }
    }
}
