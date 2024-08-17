package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_updateUserName extends TLRPC$Update {
    public String first_name;
    public String last_name;
    public long user_id;
    public ArrayList<TLRPC$TL_username> usernames = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.first_name = abstractSerializedData.readString(z);
        this.last_name = abstractSerializedData.readString(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_username TLdeserialize = TLRPC$TL_username.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.usernames.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1484486364);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeString(this.first_name);
        abstractSerializedData.writeString(this.last_name);
        abstractSerializedData.writeInt32(481674261);
        int size = this.usernames.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.usernames.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
