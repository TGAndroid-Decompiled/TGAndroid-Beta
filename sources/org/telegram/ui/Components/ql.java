package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class ql implements Comparator {
    public final int f27777a;
    public final Object f27778b;

    public ql(Object obj, int i10) {
        this.f27777a = i10;
        this.f27778b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i10 = this.f27777a;
        Object obj3 = this.f27778b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f22123q1;
                int i11 = albumEntry.bucketId;
                if (i11 != 0 || albumEntry2.bucketId == 0) {
                    if ((i11 != 0 && albumEntry2.bucketId == 0) || (indexOf = arrayList.indexOf(albumEntry)) > (indexOf2 = arrayList.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                mz mzVar = ((yw) obj3).G0;
                int indexOf3 = mzVar.f26577d1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = mzVar.f26577d1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
