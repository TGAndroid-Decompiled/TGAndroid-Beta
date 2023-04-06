package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_messages_translateText extends TLObject {
    public static int constructor = 1662529584;
    public int flags;
    public TLRPC$InputPeer peer;
    public String to_lang;
    public ArrayList<Integer> id = new ArrayList<>();
    public ArrayList<TLRPC$TL_textWithEntities> text = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_translateResult.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            this.peer.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.id.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                abstractSerializedData.writeInt32(this.id.get(i).intValue());
            }
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.text.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                this.text.get(i2).serializeToStream(abstractSerializedData);
            }
        }
        abstractSerializedData.writeString(this.to_lang);
    }
}
