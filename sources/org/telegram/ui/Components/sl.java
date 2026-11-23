package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class sl implements Comparator {
    public final int f39636a;
    public final Object f39637b;

    public sl(Object obj, int i7) {
        this.f39636a = i7;
        this.f39637b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i7 = this.f39636a;
        Object obj3 = this.f39637b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.ue ueVar = (org.telegram.messenger.ue) obj;
                org.telegram.messenger.ue ueVar2 = (org.telegram.messenger.ue) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
                int i10 = ueVar.f27259a;
                if (i10 != 0 || ueVar2.f27259a == 0) {
                    if ((i10 != 0 && ueVar2.f27259a == 0) || (indexOf = arrayList.indexOf(ueVar)) > (indexOf2 = arrayList.indexOf(ueVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                qy qyVar = ((ew) obj3).H0;
                int indexOf3 = qyVar.f39050e1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = qyVar.f39050e1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
