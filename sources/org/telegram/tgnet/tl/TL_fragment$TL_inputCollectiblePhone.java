package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
public class TL_fragment$TL_inputCollectiblePhone extends TL_fragment$InputCollectible {
    public String phone;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1562241884);
        abstractSerializedData.writeString(this.phone);
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.phone = abstractSerializedData.readString(z);
    }
}
