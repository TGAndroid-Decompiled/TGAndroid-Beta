package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

public final class bl implements Comparator {

    public final int f27125a;

    public final Object f27126b;

    public bl(Object obj, int i10) {
        this.f27125a = i10;
        this.f27126b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int iIndexOf;
        int iIndexOf2;
        int i10 = this.f27125a;
        Object obj3 = this.f27126b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f26237m1;
                int i11 = albumEntry.bucketId;
                if (i11 != 0 || albumEntry2.bucketId == 0) {
                    if ((i11 != 0 && albumEntry2.bucketId == 0) || (iIndexOf = arrayList.indexOf(albumEntry)) > (iIndexOf2 = arrayList.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (iIndexOf >= iIndexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                yy yyVar = ((iw) obj3).C0;
                int iIndexOf3 = yyVar.Z0.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int iIndexOf4 = yyVar.Z0.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (iIndexOf3 < 0 || iIndexOf4 < 0) {
                    return 0;
                }
                return iIndexOf3 - iIndexOf4;
        }
    }
}
