package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputUser;
public class TL_bots$getPreviewInfo extends TLObject {
    public TLRPC$InputUser bot;
    public String lang_code = "";

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TL_bots$previewInfo.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1111143341);
        this.bot.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.lang_code);
    }
}
