package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
public final class e implements Vector.TLDeserializer {
    public final int f22293a;

    public e(int i10) {
        this.f22293a = i10;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f22293a) {
            case 0:
                return TL_wallet.walletTransaction.TLdeserialize(inputSerializedData, i10, z10);
            default:
                return TL_iv.PageListItem.TLdeserialize(inputSerializedData, i10, z10);
        }
    }
}
