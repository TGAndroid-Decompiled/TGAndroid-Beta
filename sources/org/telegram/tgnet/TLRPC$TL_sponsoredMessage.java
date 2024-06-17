package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.LiteMode;

public class TLRPC$TL_sponsoredMessage extends TLObject {
    public String additional_info;
    public String button_text;
    public boolean can_report;
    public TLRPC$TL_peerColor color;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public String message;
    public TLRPC$Photo photo;
    public byte[] random_id;
    public boolean recommended;
    public String sponsor_info;
    public String title;
    public String url;

    public static TLRPC$TL_sponsoredMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1108478618 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_sponsoredMessage", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_sponsoredMessage tLRPC$TL_sponsoredMessage = new TLRPC$TL_sponsoredMessage();
        tLRPC$TL_sponsoredMessage.readParams(abstractSerializedData, z);
        return tLRPC$TL_sponsoredMessage;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.recommended = (readInt32 & 32) != 0;
        this.can_report = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
        this.random_id = abstractSerializedData.readByteArray(z);
        this.url = abstractSerializedData.readString(z);
        this.title = abstractSerializedData.readString(z);
        this.message = abstractSerializedData.readString(z);
        if ((this.flags & 2) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.entities.add(TLdeserialize);
            }
        }
        if ((this.flags & 64) != 0) {
            this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
            this.color = TLRPC$TL_peerColor.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.button_text = abstractSerializedData.readString(z);
        if ((this.flags & 128) != 0) {
            this.sponsor_info = abstractSerializedData.readString(z);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.additional_info = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1108478618);
        int i = this.recommended ? this.flags | 32 : this.flags & (-33);
        this.flags = i;
        int i2 = this.can_report ? i | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i & (-4097);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeByteArray(this.random_id);
        abstractSerializedData.writeString(this.url);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.message);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i3 = 0; i3 < size; i3++) {
                this.entities.get(i3).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 64) != 0) {
            this.photo.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
            this.color.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.button_text);
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeString(this.sponsor_info);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            abstractSerializedData.writeString(this.additional_info);
        }
    }
}
