package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class ul implements Comparator {
    public final int f40475a;
    public final Object f40476b;

    public ul(Object obj, int i7) {
        this.f40475a = i7;
        this.f40476b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i7 = this.f40475a;
        Object obj3 = this.f40476b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) obj;
                org.telegram.messenger.ve veVar2 = (org.telegram.messenger.ve) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f32798r1;
                int i10 = veVar.f27354a;
                if (i10 != 0 || veVar2.f27354a == 0) {
                    if ((i10 != 0 && veVar2.f27354a == 0) || (indexOf = arrayList.indexOf(veVar)) > (indexOf2 = arrayList.indexOf(veVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                ty tyVar = ((hw) obj3).H0;
                int indexOf3 = tyVar.f40094e1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = tyVar.f40094e1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
