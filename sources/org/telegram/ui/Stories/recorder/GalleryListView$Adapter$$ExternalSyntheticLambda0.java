package org.telegram.ui.Stories.recorder;

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
                GalleryListView galleryListView = GalleryListView.this;
                GalleryListView.AnonymousClass1 anonymousClass1 = galleryListView.listView;
                GalleryListView.Cell cell = this.f$1;
                int childAdapterPosition = anonymousClass1.getChildAdapterPosition(cell);
                if (childAdapterPosition != -1) {
                    galleryListView.listView.clickItem(cell, childAdapterPosition);
                }
                break;
            default:
                GalleryListView galleryListView2 = GalleryListView.this;
                GalleryListView.AnonymousClass1 anonymousClass2 = galleryListView2.listView;
                GalleryListView.Cell cell2 = this.f$1;
                int childAdapterPosition2 = anonymousClass2.getChildAdapterPosition(cell2);
                if (childAdapterPosition2 != -1) {
                    galleryListView2.listView.longClickItem(cell2, childAdapterPosition2);
                }
                break;
        }
    }
}
