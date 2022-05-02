package org.telegram.tgnet;

public class TLRPC$TL_messages_translateText extends TLObject {
    public static int constructor = 617508334;
    public int flags;
    public String from_lang;
    public int msg_id;
    public TLRPC$InputPeer peer;
    public String text;
    public String to_lang;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_TranslatedText.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            this.peer.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.msg_id);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.text);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.from_lang);
        }
        abstractSerializedData.writeString(this.to_lang);
    }
}
