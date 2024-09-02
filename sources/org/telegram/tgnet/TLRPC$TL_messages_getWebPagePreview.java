package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_messages_getWebPagePreview extends TLObject {
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public String message;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1956073268);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.message);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.entities.get(i).serializeToStream(abstractSerializedData);
            }
        }
    }
}
