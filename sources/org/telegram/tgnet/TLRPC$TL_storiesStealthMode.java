package org.telegram.tgnet;
public class TLRPC$TL_storiesStealthMode extends TLObject {
    public static int constructor = 1898850301;
    public int active_until_date;
    public int cooldown_until_date;
    public int flags;

    public static TLRPC$TL_storiesStealthMode TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_storiesStealthMode", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_storiesStealthMode tLRPC$TL_storiesStealthMode = new TLRPC$TL_storiesStealthMode();
        tLRPC$TL_storiesStealthMode.readParams(abstractSerializedData, z);
        return tLRPC$TL_storiesStealthMode;
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
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.active_until_date);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.cooldown_until_date);
        }
    }
}
