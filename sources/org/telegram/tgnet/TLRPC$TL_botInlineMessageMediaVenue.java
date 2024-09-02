package org.telegram.tgnet;

public class TLRPC$TL_botInlineMessageMediaVenue extends TLRPC$BotInlineMessage {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.title = abstractSerializedData.readString(z);
        this.address = abstractSerializedData.readString(z);
        this.provider = abstractSerializedData.readString(z);
        this.venue_id = abstractSerializedData.readString(z);
        this.venue_type = abstractSerializedData.readString(z);
        if ((this.flags & 4) != 0) {
            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1970903652);
        abstractSerializedData.writeInt32(this.flags);
        this.geo.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.address);
        abstractSerializedData.writeString(this.provider);
        abstractSerializedData.writeString(this.venue_id);
        abstractSerializedData.writeString(this.venue_type);
        if ((this.flags & 4) != 0) {
            this.reply_markup.serializeToStream(abstractSerializedData);
        }
    }
}
