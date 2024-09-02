package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$Update;

public class TL_bots$TL_updateBotMenuButton extends TLRPC$Update {
    public long bot_id;
    public TL_bots$BotMenuButton button;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.bot_id = abstractSerializedData.readInt64(z);
        this.button = TL_bots$BotMenuButton.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(347625491);
        abstractSerializedData.writeInt64(this.bot_id);
        this.button.serializeToStream(abstractSerializedData);
    }
}
