package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$User;
public class TL_bots$popularAppBots extends TLObject {
    public int flags;
    public String next_offset;
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TL_bots$popularAppBots TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (428978491 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_bots_popularAppBots", Integer.valueOf(i)));
            }
            return null;
        }
        TL_bots$popularAppBots tL_bots$popularAppBots = new TL_bots$popularAppBots();
        tL_bots$popularAppBots.readParams(abstractSerializedData, z);
        return tL_bots$popularAppBots;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.next_offset = abstractSerializedData.readString(z);
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.users.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(428978491);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.next_offset);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.users.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.users.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
