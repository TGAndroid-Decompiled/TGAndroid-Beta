package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Peer;

public class TL_stories$TL_myBoost extends TLObject {
    public static int constructor = -1001897636;
    public int cooldown_until_date;
    public int date;
    public int expires;
    public int flags;
    public TLRPC$Peer peer;
    public int slot;

    public static TL_stories$TL_myBoost TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_myBoost", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_myBoost tL_stories$TL_myBoost = new TL_stories$TL_myBoost();
        tL_stories$TL_myBoost.readParams(abstractSerializedData, z);
        return tL_stories$TL_myBoost;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.slot = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.date = abstractSerializedData.readInt32(z);
        this.expires = abstractSerializedData.readInt32(z);
        if ((this.flags & 2) != 0) {
            this.cooldown_until_date = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.slot);
        if ((this.flags & 1) != 0) {
            this.peer.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.expires);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.cooldown_until_date);
        }
    }
}
