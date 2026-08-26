package org.telegram.ui.Adapters;

import android.view.View;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.ui.Components.RecyclerListView;

public final class DialogsSearchAdapter$$ExternalSyntheticLambda2 implements DialogsSearchAdapter.OnRecentSearchLoaded, RecyclerListView.OnItemLongClickListener {
    public final DialogsSearchAdapter f$0;

    public DialogsSearchAdapter$$ExternalSyntheticLambda2(DialogsSearchAdapter dialogsSearchAdapter) {
        this.f$0 = dialogsSearchAdapter;
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$onCreateViewHolder$24(view, i);
    }

    @Override
    public void setRecentSearch(ArrayList arrayList, LongSparseArray longSparseArray) {
        this.f$0.lambda$loadRecentSearch$5(arrayList, longSparseArray);
    }
}
