package org.telegram.tgnet;
public class TLRPC$TL_sendMessageEmojiInteraction extends TLRPC$SendMessageAction {
    public static int constructor = 630664139;
    public String emoticon;
    public TLRPC$TL_dataJSON interaction;
    public int msg_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.emoticon = abstractSerializedData.readString(z);
        this.msg_id = abstractSerializedData.readInt32(z);
        this.interaction = TLRPC$TL_dataJSON.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.emoticon);
        abstractSerializedData.writeInt32(this.msg_id);
        this.interaction.serializeToStream(abstractSerializedData);
    }
}
