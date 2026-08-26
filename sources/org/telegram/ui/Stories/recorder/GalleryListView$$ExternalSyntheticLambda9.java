package org.telegram.ui.Stories.recorder;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;

public final class GalleryListView$$ExternalSyntheticLambda9 implements Comparator {
    public final int $r8$classId;
    public final ArrayList f$0;

    public GalleryListView$$ExternalSyntheticLambda9(ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ArrayList arrayList;
        int iIndexOf;
        int iIndexOf2;
        ArrayList arrayList2;
        int iIndexOf3;
        int iIndexOf4;
        MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
        MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
        switch (this.$r8$classId) {
            case 0:
                int i = albumEntry.bucketId;
                if (i != 0 || albumEntry2.bucketId == 0) {
                    if ((i != 0 && albumEntry2.bucketId == 0) || (iIndexOf = (arrayList = this.f$0).indexOf(albumEntry)) > (iIndexOf2 = arrayList.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (iIndexOf >= iIndexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                int i2 = albumEntry.bucketId;
                if (i2 != 0 || albumEntry2.bucketId == 0) {
                    if ((i2 != 0 && albumEntry2.bucketId == 0) || (iIndexOf3 = (arrayList2 = this.f$0).indexOf(albumEntry)) > (iIndexOf4 = arrayList2.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (iIndexOf3 >= iIndexOf4) {
                        return 0;
                    }
                }
                return -1;
        }
    }
}
