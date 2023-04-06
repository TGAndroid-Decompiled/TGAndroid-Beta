package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_phone_getGroupParticipants extends TLObject {
    public static int constructor = -984033109;
    public TLRPC$TL_inputGroupCall call;
    public int limit;
    public String offset;
    public ArrayList<TLRPC$InputPeer> ids = new ArrayList<>();
    public ArrayList<Integer> sources = new ArrayList<>();

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_phone_groupParticipants.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.call.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.ids.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.ids.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.sources.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            abstractSerializedData.writeInt32(this.sources.get(i2).intValue());
        }
        abstractSerializedData.writeString(this.offset);
        abstractSerializedData.writeInt32(this.limit);
    }
}
