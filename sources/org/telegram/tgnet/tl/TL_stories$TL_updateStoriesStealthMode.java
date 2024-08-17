package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$Update;

public class TL_stories$TL_updateStoriesStealthMode extends TLRPC$Update {
    public TL_stories$TL_storiesStealthMode stealth_mode;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.stealth_mode = TL_stories$TL_storiesStealthMode.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(738741697);
        this.stealth_mode.serializeToStream(abstractSerializedData);
    }
}
