package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.RecyclerListView;

public final class DialogsActivity$$ExternalSyntheticLambda20 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda20(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$18(view, i);
                break;
            default:
                this.f$0.lambda$createSearchViewPager$150(view, i);
                break;
        }
    }
}
