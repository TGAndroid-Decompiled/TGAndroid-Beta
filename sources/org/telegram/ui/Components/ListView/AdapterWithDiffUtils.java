package org.telegram.ui.Components.ListView;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.ui.Components.RecyclerListView;

public abstract class AdapterWithDiffUtils extends RecyclerListView.SelectionAdapter {
    DiffUtilsCallback callback = new DiffUtilsCallback();

    public void setItems(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        this.callback.setItems(arrayList, arrayList2);
        DiffUtil.calculateDiff(this.callback).dispatchUpdatesTo(this);
    }

    public static abstract class Item {
        public boolean selectable;
        public int viewType;

        protected boolean contentsEquals(Item item) {
            return false;
        }

        public Item(int i, boolean z) {
            this.viewType = i;
            this.selectable = z;
        }

        boolean compare(Item item) {
            if (this.viewType != item.viewType) {
                return false;
            }
            return equals(item);
        }

        boolean compareContents(Item item) {
            if (this.viewType != item.viewType) {
                return false;
            }
            return contentsEquals(item);
        }
    }

    private class DiffUtilsCallback extends DiffUtil.Callback {
        ArrayList newItems;
        ArrayList oldItems;

        private DiffUtilsCallback() {
        }

        public void setItems(ArrayList arrayList, ArrayList arrayList2) {
            this.oldItems = arrayList;
            this.newItems = arrayList2;
        }

        @Override
        public int getOldListSize() {
            return this.oldItems.size();
        }

        @Override
        public int getNewListSize() {
            return this.newItems.size();
        }

        @Override
        public boolean areItemsTheSame(int i, int i2) {
            return ((Item) this.oldItems.get(i)).compare((Item) this.newItems.get(i2));
        }

        @Override
        public boolean areContentsTheSame(int i, int i2) {
            return ((Item) this.oldItems.get(i)).compareContents((Item) this.newItems.get(i2));
        }
    }
}
