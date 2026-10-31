package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class jl implements Comparator {
    public final int f27396a;
    public final Object f27397b;

    public jl(Object obj, int i10) {
        this.f27396a = i10;
        this.f27397b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i10 = this.f27396a;
        Object obj3 = this.f27397b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.we weVar = (org.telegram.messenger.we) obj;
                org.telegram.messenger.we weVar2 = (org.telegram.messenger.we) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.f23845q1;
                int i11 = weVar.f19085a;
                if (i11 != 0 || weVar2.f19085a == 0) {
                    if ((i11 != 0 && weVar2.f19085a == 0) || (indexOf = arrayList.indexOf(weVar)) > (indexOf2 = arrayList.indexOf(weVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                vy vyVar = ((gw) obj3).G0;
                int indexOf3 = vyVar.f31868d1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = vyVar.f31868d1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
