package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$InputUser;
public class TL_bots$editPreviewMedia extends TLObject {
    public TLRPC$InputUser bot;
    public String lang_code = "";
    public TLRPC$InputMedia media;
    public TLRPC$InputMedia new_media;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TL_bots$botPreviewMedia.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2061148049);
        this.bot.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.lang_code);
        this.media.serializeToStream(abstractSerializedData);
        this.new_media.serializeToStream(abstractSerializedData);
    }
}
