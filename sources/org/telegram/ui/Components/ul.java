package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class ul implements Comparator {
    public final int f40483a;
    public final Object f40484b;

    public ul(Object obj, int i7) {
        this.f40483a = i7;
        this.f40484b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i7 = this.f40483a;
        Object obj3 = this.f40484b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.ue ueVar = (org.telegram.messenger.ue) obj;
                org.telegram.messenger.ue ueVar2 = (org.telegram.messenger.ue) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f32795r1;
                int i10 = ueVar.f27183a;
                if (i10 != 0 || ueVar2.f27183a == 0) {
                    if ((i10 != 0 && ueVar2.f27183a == 0) || (indexOf = arrayList.indexOf(ueVar)) > (indexOf2 = arrayList.indexOf(ueVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                ty tyVar = ((hw) obj3).H0;
                int indexOf3 = tyVar.f40102e1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = tyVar.f40102e1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
