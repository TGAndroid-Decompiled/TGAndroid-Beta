package org.telegram.ui.Components.ListView;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.GroupCallActivity;

public abstract class AdapterWithDiffUtils extends RecyclerListView.SelectionAdapter {
    public final DialogsAdapter.AnonymousClass1 callback = new DialogsAdapter.AnonymousClass1();

    public abstract class Item {
        public boolean selectable;
        public int viewType;

        public Item(int i, boolean z) {
            this.viewType = i;
            this.selectable = z;
        }

        public boolean contentsEquals(Item item) {
            return false;
        }
    }

    public final void setItems(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        DialogsAdapter.AnonymousClass1 anonymousClass1 = this.callback;
        anonymousClass1.val$newItems = arrayList;
        anonymousClass1.this$0 = arrayList2;
        DiffUtil.calculateDiff(anonymousClass1, true).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this, 1));
    }
}
