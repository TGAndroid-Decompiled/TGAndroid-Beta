package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class bm implements Comparator {
    public final int f23494a;
    public final Object f23495b;

    public bm(Object obj, int i10) {
        this.f23494a = i10;
        this.f23495b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i10 = this.f23494a;
        Object obj3 = this.f23495b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f22718q1;
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
                wz wzVar = ((ix) obj3).G0;
                int indexOf3 = wzVar.f30710d1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = wzVar.f30710d1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
