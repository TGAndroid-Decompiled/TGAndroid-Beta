package org.telegram.tgnet;
public class TLRPC$TL_messageMediaGame extends TLRPC$MessageMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.game = TLRPC$TL_game.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-38694904);
        this.game.serializeToStream(abstractSerializedData);
    }
}
