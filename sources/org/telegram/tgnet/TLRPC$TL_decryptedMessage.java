package org.telegram.tgnet;

import org.telegram.messenger.BuildVars;

public class TLRPC$TL_decryptedMessage extends TLRPC$DecryptedMessage {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.silent = (readInt32 & 32) != 0;
        this.random_id = abstractSerializedData.readInt64(z);
        this.ttl = abstractSerializedData.readInt32(z);
        this.message = abstractSerializedData.readString(z);
        if ((this.flags & 512) != 0) {
            this.media = TLRPC$DecryptedMessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z || BuildVars.DEBUG_PRIVATE_VERSION);
        }
        if ((this.flags & 128) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z || BuildVars.DEBUG_PRIVATE_VERSION);
                if (TLdeserialize == null) {
                    return;
                }
                this.entities.add(TLdeserialize);
            }
        }
        if ((this.flags & 2048) != 0) {
            this.via_bot_name = abstractSerializedData.readString(z);
        }
        if ((this.flags & 8) != 0) {
            this.reply_to_random_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 131072) != 0) {
            this.grouped_id = abstractSerializedData.readInt64(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1848883596);
        int i = this.silent ? this.flags | 32 : this.flags & (-33);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.random_id);
        abstractSerializedData.writeInt32(this.ttl);
        abstractSerializedData.writeString(this.message);
        if ((this.flags & 512) != 0) {
            this.media.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((TLRPC$MessageEntity) this.entities.get(i2)).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 2048) != 0) {
            abstractSerializedData.writeString(this.via_bot_name);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt64(this.reply_to_random_id);
        }
        if ((this.flags & 131072) != 0) {
            abstractSerializedData.writeInt64(this.grouped_id);
        }
    }
}
