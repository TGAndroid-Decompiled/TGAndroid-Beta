package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class jl implements Comparator {
    public final int f29686a;
    public final Object f29687b;

    public jl(Object obj, int i10) {
        this.f29686a = i10;
        this.f29687b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i10 = this.f29686a;
        Object obj3 = this.f29687b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f26252m1;
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
                fz fzVar = ((pw) obj3).C0;
                int indexOf3 = fzVar.Z0.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = fzVar.Z0.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
