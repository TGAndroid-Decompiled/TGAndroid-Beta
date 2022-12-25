package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_attachMenuBotsBot extends TLObject {
    public static int constructor = -1816172929;
    public TLRPC$TL_attachMenuBot bot;
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_attachMenuBotsBot TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_attachMenuBotsBot", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_attachMenuBotsBot tLRPC$TL_attachMenuBotsBot = new TLRPC$TL_attachMenuBotsBot();
        tLRPC$TL_attachMenuBotsBot.readParams(abstractSerializedData, z);
        return tLRPC$TL_attachMenuBotsBot;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.bot = TLRPC$AttachMenuBot.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.users.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.bot.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.users.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.users.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
