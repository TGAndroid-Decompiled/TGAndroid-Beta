package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class dl implements Comparator {
    public final int f33153a;
    public final Object f33154b;

    public dl(Object obj, int i3) {
        this.f33153a = i3;
        this.f33154b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i3 = this.f33153a;
        Object obj3 = this.f33154b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.pe peVar = (org.telegram.messenger.pe) obj;
                org.telegram.messenger.pe peVar2 = (org.telegram.messenger.pe) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
                int i10 = peVar.f24735a;
                if (i10 != 0 || peVar2.f24735a == 0) {
                    if ((i10 != 0 && peVar2.f24735a == 0) || (indexOf = arrayList.indexOf(peVar)) > (indexOf2 = arrayList.indexOf(peVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                ey eyVar = ((sv) obj3).H0;
                int indexOf3 = eyVar.f33533e1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = eyVar.f33533e1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
