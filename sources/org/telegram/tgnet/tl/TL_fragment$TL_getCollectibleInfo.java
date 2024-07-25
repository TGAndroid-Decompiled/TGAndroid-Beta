package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public class TL_fragment$TL_getCollectibleInfo extends TLObject {
    public TL_fragment$InputCollectible collectible;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TL_fragment$TL_collectibleInfo.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1105295942);
        this.collectible.serializeToStream(abstractSerializedData);
    }
}
