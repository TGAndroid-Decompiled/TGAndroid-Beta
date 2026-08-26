package org.telegram.ui.Components.ListView;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.OpReorderer;
import java.util.ArrayList;
import org.telegram.ui.Components.RecyclerListView;

public abstract class AdapterWithDiffUtils extends RecyclerListView.SelectionAdapter {
    DiffUtilsCallback callback = new DiffUtilsCallback();

    public final class DiffUtilsCallback extends DiffUtil.Callback {
        public ArrayList newItems;
        public ArrayList oldItems;

        @Override
        public final boolean areContentsTheSame(int i, int i2) {
            return ((Item) this.oldItems.get(i)).compareContents((Item) this.newItems.get(i2));
        }

        @Override
        public final boolean areItemsTheSame(int i, int i2) {
            return ((Item) this.oldItems.get(i)).compare((Item) this.newItems.get(i2));
        }

        @Override
        public final int getNewListSize() {
            return this.newItems.size();
        }

        @Override
        public final int getOldListSize() {
            return this.oldItems.size();
        }
    }

    public abstract class Item {
        public boolean selectable;
        public int viewType;

        public Item(int i, boolean z) {
            this.viewType = i;
            this.selectable = z;
        }

        public boolean compare(Item item) {
            if (this.viewType != item.viewType) {
                return false;
            }
            return equals(item);
        }

        public boolean compareContents(Item item) {
            if (this.viewType != item.viewType) {
                return false;
            }
            return contentsEquals(item);
        }

        public boolean contentsEquals(Item item) {
            return false;
        }
    }

    public void setItems(ArrayList<? extends Item> arrayList, ArrayList<? extends Item> arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        DiffUtilsCallback diffUtilsCallback = this.callback;
        diffUtilsCallback.oldItems = arrayList;
        diffUtilsCallback.newItems = arrayList2;
        DiffUtil.calculateDiff(diffUtilsCallback, true).dispatchUpdatesTo(new OpReorderer(this));
    }
}
