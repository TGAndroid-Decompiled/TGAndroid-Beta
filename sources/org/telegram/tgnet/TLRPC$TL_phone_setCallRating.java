package org.telegram.tgnet;

public class TLRPC$TL_phone_setCallRating extends TLObject {
    public static int constructor = 1508562471;
    public String comment;
    public int flags;
    public TLRPC$TL_inputPhoneCall peer;
    public int rating;
    public boolean user_initiative;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.user_initiative ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.rating);
        abstractSerializedData.writeString(this.comment);
    }
}
