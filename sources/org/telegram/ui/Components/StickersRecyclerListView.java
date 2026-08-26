package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;

public class StickersRecyclerListView extends RecyclerListView {
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_STICKER = 1;
    private AdapterWithDiffUtils adapter;
    private ArrayList<Item> items;
    private GridLayoutManager layoutManager;
    private ArrayList<Item> oldItems;
    private Theme.ResourcesProvider resourcesProvider;

    public class Adapter extends AdapterWithDiffUtils {
        private Adapter() {
        }

        @Override
        public int getItemCount() {
            return StickersRecyclerListView.this.items.size();
        }

        @Override
        public int getItemViewType(int i) {
            return ((Item) StickersRecyclerListView.this.items.get(i)).viewType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(null);
        }
    }

    public static abstract class Item extends AdapterWithDiffUtils.Item {
        public Item(int i, boolean z) {
            super(i, z);
        }
    }

    public static class StickerItem extends Item {
        private TLRPC.Document document;

        public StickerItem(TLRPC.Document document) {
            super(1, true);
            this.document = document;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof StickerItem)) {
                return false;
            }
            TLRPC.Document document = ((StickerItem) obj).document;
            TLRPC.Document document2 = this.document;
            return (document2 == null) == (document == null) && document2 != null && document.id == document2.id;
        }
    }

    public StickersRecyclerListView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.items = new ArrayList<>();
        this.oldItems = new ArrayList<>();
        this.resourcesProvider = resourcesProvider;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(5);
        this.layoutManager = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
    }

    public void setItems(ArrayList<Item> arrayList) {
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        this.items.addAll(arrayList);
        this.adapter.setItems(arrayList, this.oldItems);
    }

    public void setSpanCount(int i) {
        this.layoutManager.setSpanCount(i);
    }

    public static class StickerHeaderItem extends Item {
        private TLRPC.StickerSet set;

        public StickerHeaderItem(TLRPC.StickerSet stickerSet) {
            super(0, false);
            this.set = stickerSet;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof StickerHeaderItem)) {
                return false;
            }
            TLRPC.StickerSet stickerSet = ((StickerHeaderItem) obj).set;
            TLRPC.StickerSet stickerSet2 = this.set;
            return (stickerSet2 == null) == (stickerSet == null) && stickerSet2 != null && stickerSet.id == stickerSet2.id;
        }

        public StickerHeaderItem(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            super(0, false);
            if (tL_messages_stickerSet != null) {
                this.set = tL_messages_stickerSet.set;
            }
        }
    }
}
