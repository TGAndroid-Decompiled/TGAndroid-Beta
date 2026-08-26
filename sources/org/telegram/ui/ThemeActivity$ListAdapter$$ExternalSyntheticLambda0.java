package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.RecyclerListView;

public final class ThemeActivity$ListAdapter$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ThemeActivity$ListAdapter$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((ThemeActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$2((ThemeActivity.ThemeAccentsListAdapter) this.f$1, (RecyclerListView) this.f$2, view, i);
                break;
            default:
                ((ProfileNotificationsActivity) this.f$0).lambda$createView$6((Context) this.f$1, (String) this.f$2, view, i);
                break;
        }
    }
}
