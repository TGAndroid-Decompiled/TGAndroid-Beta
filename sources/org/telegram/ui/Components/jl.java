package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class jl implements Comparator {
    public final int f27441a;
    public final Object f27442b;

    public jl(Object obj, int i10) {
        this.f27441a = i10;
        this.f27442b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i10 = this.f27441a;
        Object obj3 = this.f27442b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) obj;
                org.telegram.messenger.xe xeVar2 = (org.telegram.messenger.xe) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
                int i11 = xeVar.f19428a;
                if (i11 != 0 || xeVar2.f19428a == 0) {
                    if ((i11 != 0 && xeVar2.f19428a == 0) || (indexOf = arrayList.indexOf(xeVar)) > (indexOf2 = arrayList.indexOf(xeVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                vy vyVar = ((gw) obj3).G0;
                int indexOf3 = vyVar.f31946d1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = vyVar.f31946d1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
