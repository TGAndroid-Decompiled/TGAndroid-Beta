package org.telegram.tgnet;

public class TLRPC$TL_bots_setBotInfo extends TLObject {
    public String about;
    public TLRPC$InputUser bot;
    public String description;
    public int flags;
    public String lang_code;
    public String name;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(282013987);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 4) != 0) {
            this.bot.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.lang_code);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.name);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.about);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.description);
        }
    }
}
