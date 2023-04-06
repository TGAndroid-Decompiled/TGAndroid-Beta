package org.telegram.tgnet;
public class TLRPC$TL_updateBotMenuButton extends TLRPC$Update {
    public static int constructor = 347625491;
    public long bot_id;
    public TLRPC$BotMenuButton button;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.bot_id = abstractSerializedData.readInt64(z);
        this.button = TLRPC$BotMenuButton.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.bot_id);
        this.button.serializeToStream(abstractSerializedData);
    }
}
