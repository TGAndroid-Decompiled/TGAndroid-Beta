package org.telegram.tgnet;
public class TLRPC$TL_messages_toggleBotInAttachMenu extends TLObject {
    public TLRPC$InputUser bot;
    public boolean enabled;
    public int flags;
    public boolean write_allowed;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1777704297);
        int i = this.write_allowed ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.bot.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.enabled);
    }
}
