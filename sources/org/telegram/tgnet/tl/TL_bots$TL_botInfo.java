package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$TL_botCommand;

public class TL_bots$TL_botInfo extends TL_bots$BotInfo {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.has_preview_medias = (readInt32 & 64) != 0;
        if ((readInt32 & 1) != 0) {
            this.user_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 2) != 0) {
            this.description = abstractSerializedData.readString(z);
        }
        if ((this.flags & 16) != 0) {
            this.description_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 32) != 0) {
            this.description_document = TLRPC$Document.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$TL_botCommand TLdeserialize = TLRPC$TL_botCommand.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.commands.add(TLdeserialize);
            }
        }
        if ((this.flags & 8) != 0) {
            this.menu_button = TL_bots$BotMenuButton.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 128) != 0) {
            this.privacy_policy_url = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2109505932);
        int i = this.has_preview_medias ? this.flags | 64 : this.flags & (-65);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.user_id);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.description);
        }
        if ((this.flags & 16) != 0) {
            this.description_photo.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 32) != 0) {
            this.description_document.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.commands.size();
            abstractSerializedData.writeInt32(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((TLRPC$TL_botCommand) this.commands.get(i2)).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 8) != 0) {
            this.menu_button.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeString(this.privacy_policy_url);
        }
    }
}
