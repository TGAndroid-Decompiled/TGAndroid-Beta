package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class el implements Comparator {
    public final int f33325a;
    public final Object f33326b;

    public el(Object obj, int i7) {
        this.f33325a = i7;
        this.f33326b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i7 = this.f33325a;
        Object obj3 = this.f33326b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.we weVar = (org.telegram.messenger.we) obj;
                org.telegram.messenger.we weVar2 = (org.telegram.messenger.we) obj2;
                boolean z9 = ChatAttachAlertPhotoLayout.f31188q1;
                int i10 = weVar.f26297a;
                if (i10 != 0 || weVar2.f26297a == 0) {
                    if ((i10 != 0 && weVar2.f26297a == 0) || (indexOf = arrayList.indexOf(weVar)) > (indexOf2 = arrayList.indexOf(weVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                hy hyVar = ((uv) obj3).G0;
                int indexOf3 = hyVar.f34403d1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = hyVar.f34403d1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
