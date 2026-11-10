package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class dl implements Comparator {
    public final int f33020a;
    public final Object f33021b;

    public dl(Object obj, int i7) {
        this.f33020a = i7;
        this.f33021b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i7 = this.f33020a;
        Object obj3 = this.f33021b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.we weVar = (org.telegram.messenger.we) obj;
                org.telegram.messenger.we weVar2 = (org.telegram.messenger.we) obj2;
                boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
                int i10 = weVar.f26301a;
                if (i10 != 0 || weVar2.f26301a == 0) {
                    if ((i10 != 0 && weVar2.f26301a == 0) || (indexOf = arrayList.indexOf(weVar)) > (indexOf2 = arrayList.indexOf(weVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                gy gyVar = ((tv) obj3).G0;
                int indexOf3 = gyVar.f34019d1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = gyVar.f34019d1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
