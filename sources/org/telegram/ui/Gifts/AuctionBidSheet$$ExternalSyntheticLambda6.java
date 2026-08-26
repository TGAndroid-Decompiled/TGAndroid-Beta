package org.telegram.ui.Gifts;

import android.view.View;
import org.telegram.ui.Cells.AudioPlayerCell;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.Components.RecyclerListView;

public final class AuctionBidSheet$$ExternalSyntheticLambda6 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;

    public AuctionBidSheet$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    private final void onItemClick$org$telegram$ui$ThemePreviewActivity$$ExternalSyntheticLambda12(int i, View view) {
    }

    @Override
    public final void onItemClick(int i, View view) {
        switch (this.$r8$classId) {
            case 0:
                int i2 = AuctionBidSheet.$r8$clinit;
                break;
            case 1:
                if (view instanceof AudioPlayerCell) {
                    ((AudioPlayerCell) view).didPressedButton();
                }
                break;
            case 2:
                if (view instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
                    photoAttachPhotoCell.delegate.onCheckClick(photoAttachPhotoCell);
                }
                break;
            case 3:
                int i3 = AcquiredGiftsSheet.$r8$clinit;
                break;
        }
    }
}
