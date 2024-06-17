package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_account_connectedBots extends TLObject {
    public static int constructor = 400029819;
    public ArrayList<TLRPC$TL_connectedBot> connected_bots = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_account_connectedBots TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != constructor) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_account_connectedBots", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_account_connectedBots tLRPC$TL_account_connectedBots = new TLRPC$TL_account_connectedBots();
        tLRPC$TL_account_connectedBots.readParams(abstractSerializedData, z);
        return tLRPC$TL_account_connectedBots;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.connected_bots.add(TLRPC$TL_connectedBot.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        if (readInt323 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
        } else {
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt324; i2++) {
                this.users.add(TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(this.connected_bots.size());
        for (int i = 0; i < this.connected_bots.size(); i++) {
            this.connected_bots.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        abstractSerializedData.writeInt32(this.users.size());
        for (int i2 = 0; i2 < this.users.size(); i2++) {
            this.users.get(i2).serializeToStream(abstractSerializedData);
        }
    }
}
