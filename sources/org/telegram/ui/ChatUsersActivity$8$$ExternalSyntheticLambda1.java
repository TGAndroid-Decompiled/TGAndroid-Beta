package org.telegram.ui;

import android.view.View;
import androidx.core.util.Consumer;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.SearchTagsList;

public final class ChatUsersActivity$8$$ExternalSyntheticLambda1 implements Consumer {
    public final int $r8$classId;

    public ChatUsersActivity$8$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                View view = (View) obj;
                if (view instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
                    photoAttachPhotoCell.setHasSpoiler(photoAttachPhotoCell.getPhotoEntry() != null && photoAttachPhotoCell.getPhotoEntry().hasSpoiler, Float.valueOf(250.0f));
                    photoAttachPhotoCell.setHighQuality(photoAttachPhotoCell.getPhotoEntry() != null && photoAttachPhotoCell.getPhotoEntry().isHighQuality());
                    photoAttachPhotoCell.setStarsPrice(photoAttachPhotoCell.getPhotoEntry() != null ? photoAttachPhotoCell.getPhotoEntry().starsAmount : 0L, ChatAttachAlertPhotoLayout.selectedPhotos.size() > 1);
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof SearchTagsList.TagButton) {
                    ((SearchTagsList.TagButton) view2).setChosen(false, true);
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof SearchTagsList.TagButton) {
                    ((SearchTagsList.TagButton) view3).setChosen(false, true);
                }
                break;
        }
    }
}
