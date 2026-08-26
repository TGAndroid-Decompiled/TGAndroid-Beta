package org.telegram.ui.Components;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class StickersAlert$$ExternalSyntheticLambda44 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public StickersAlert$$ExternalSyntheticLambda44(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((StickersAlert) this.f$0).lambda$new$4(this.f$1, (TLRPC.TL_messages_getAttachedStickers) this.f$2, (ShareAlert$$ExternalSyntheticLambda13) this.f$3, tLObject, tL_error);
                break;
            default:
                ((StickerMasksAlert.StickersSearchGridAdapter.AnonymousClass1) this.f$0).lambda$run$2((TLRPC.TL_messages_getStickers) this.f$1, (ArrayList) this.f$2, (LongSparseArray) this.f$3, tLObject, tL_error);
                break;
        }
    }
}
