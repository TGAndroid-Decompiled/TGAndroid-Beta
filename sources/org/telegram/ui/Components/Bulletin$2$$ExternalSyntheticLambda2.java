package org.telegram.ui.Components;

import android.view.View;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;

public final class Bulletin$2$$ExternalSyntheticLambda2 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public Bulletin$2$$ExternalSyntheticLambda2(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        switch (this.$r8$classId) {
            case 0:
                Float f = (Float) obj;
                Bulletin bulletin = Bulletin.this;
                Bulletin.Delegate delegate = bulletin.currentDelegate;
                if (delegate != null && !this.f$1) {
                    delegate.onBottomOffsetChange(bulletin.layout.getHeight() - f.floatValue());
                    break;
                }
                break;
            case 1:
                View view = (View) obj;
                if (view instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) view;
                    MediaController.PhotoEntry photoEntry = photoAttachPhotoCell.getPhotoEntry();
                    if (photoEntry != null) {
                        if (((ArrayList) this.f$0).contains(Integer.valueOf(photoEntry.imageId)) && this.f$1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    photoAttachPhotoCell.setHasSpoiler(z);
                }
                break;
            default:
                View view2 = (View) obj;
                if (view2 instanceof PhotoAttachPhotoCell) {
                    PhotoAttachPhotoCell photoAttachPhotoCell2 = (PhotoAttachPhotoCell) view2;
                    MediaController.PhotoEntry photoEntry2 = photoAttachPhotoCell2.getPhotoEntry();
                    if (photoEntry2 != null) {
                        if (((ArrayList) this.f$0).contains(Integer.valueOf(photoEntry2.imageId)) && this.f$1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    photoAttachPhotoCell2.setHighQuality(z2);
                }
                break;
        }
    }
}
