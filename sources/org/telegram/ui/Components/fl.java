package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class fl implements Comparator {
    public final int f28486a;
    public final Object f28487b;

    public fl(Object obj, int i9) {
        this.f28486a = i9;
        this.f28487b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i9 = this.f28486a;
        Object obj3 = this.f28487b;
        switch (i9) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f26241m1;
                int i10 = albumEntry.bucketId;
                if (i10 != 0 || albumEntry2.bucketId == 0) {
                    if ((i10 != 0 && albumEntry2.bucketId == 0) || (indexOf = arrayList.indexOf(albumEntry)) > (indexOf2 = arrayList.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                wy wyVar = ((jw) obj3).C0;
                int indexOf3 = wyVar.Z0.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = wyVar.Z0.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
