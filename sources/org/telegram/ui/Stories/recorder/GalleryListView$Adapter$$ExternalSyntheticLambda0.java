package org.telegram.ui.Stories.recorder;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.RecyclerListView;

public final class GalleryListView$Adapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final GalleryListView.Adapter f$0;
    public final GalleryListView.Cell f$1;

    public GalleryListView$Adapter$$ExternalSyntheticLambda0(GalleryListView.Adapter adapter, GalleryListView.Cell cell, int i) {
        this.$r8$classId = i;
        this.f$0 = adapter;
        this.f$1 = cell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GalleryListView.AnonymousClass1 anonymousClass1 = GalleryListView.this.listView;
                anonymousClass1.getClass();
                GalleryListView.Cell cell = this.f$1;
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(cell);
                if (childAdapterPosition != -1) {
                    RecyclerListView.OnItemClickListener onItemClickListener = anonymousClass1.onItemClickListener;
                    if (onItemClickListener == null) {
                        RecyclerListView.OnItemClickListenerExtended onItemClickListenerExtended = anonymousClass1.onItemClickListenerExtended;
                        if (onItemClickListenerExtended != null) {
                            onItemClickListenerExtended.onItemClick(cell, childAdapterPosition, 0.0f, 0.0f);
                        }
                    } else {
                        onItemClickListener.onItemClick(childAdapterPosition, cell);
                    }
                }
                break;
            default:
                GalleryListView.AnonymousClass1 anonymousClass2 = GalleryListView.this.listView;
                anonymousClass2.getClass();
                GalleryListView.Cell cell2 = this.f$1;
                int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(cell2);
                if (childAdapterPosition2 != -1) {
                    RecyclerListView.OnItemLongClickListener onItemLongClickListener = anonymousClass2.onItemLongClickListener;
                    if (onItemLongClickListener == null) {
                        RecyclerListView.OnItemLongClickListenerExtended onItemLongClickListenerExtended = anonymousClass2.onItemLongClickListenerExtended;
                        if (onItemLongClickListenerExtended != null) {
                            onItemLongClickListenerExtended.mo1082onItemClick(cell2, childAdapterPosition2, 0.0f, 0.0f);
                        }
                    } else {
                        onItemLongClickListener.onItemClick(childAdapterPosition2, cell2);
                    }
                }
                break;
        }
    }
}
