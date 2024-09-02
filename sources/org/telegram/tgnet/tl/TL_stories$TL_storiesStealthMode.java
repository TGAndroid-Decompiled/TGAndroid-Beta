package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stories$TL_storiesStealthMode extends TLObject {
    public int active_until_date;
    public int cooldown_until_date;
    public int flags;

    public static TL_stories$TL_storiesStealthMode TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1898850301 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_storiesStealthMode", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_storiesStealthMode tL_stories$TL_storiesStealthMode = new TL_stories$TL_storiesStealthMode();
        tL_stories$TL_storiesStealthMode.readParams(abstractSerializedData, z);
        return tL_stories$TL_storiesStealthMode;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.active_until_date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.cooldown_until_date = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1898850301);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.active_until_date);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.cooldown_until_date);
        }
    }
}
