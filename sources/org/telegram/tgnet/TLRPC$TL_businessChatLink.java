package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_businessChatLink extends TLObject {
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public String link;
    public String message;
    public String title;
    public int views;

    public static TLRPC$TL_businessChatLink TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1263638929 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_businessChatLink", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_businessChatLink tLRPC$TL_businessChatLink = new TLRPC$TL_businessChatLink();
        tLRPC$TL_businessChatLink.readParams(abstractSerializedData, z);
        return tLRPC$TL_businessChatLink;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.link = abstractSerializedData.readString(z);
        this.message = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.entities.add(TLdeserialize);
            }
        }
        if ((this.flags & 2) != 0) {
            this.title = abstractSerializedData.readString(z);
        }
        this.views = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1263638929);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.link);
        abstractSerializedData.writeString(this.message);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.entities.get(i).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.title);
        }
        abstractSerializedData.writeInt32(this.views);
    }
}
