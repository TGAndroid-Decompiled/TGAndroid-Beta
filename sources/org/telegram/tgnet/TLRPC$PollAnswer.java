package org.telegram.tgnet;

public class TLRPC$PollAnswer extends TLObject {
    public byte[] option;
    public TLRPC$TL_textWithEntities text = new TLRPC$TL_textWithEntities();

    public static TLRPC$PollAnswer TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_pollAnswer tLRPC$TL_pollAnswer;
        if (i == -15277366) {
            tLRPC$TL_pollAnswer = new TLRPC$TL_pollAnswer();
        } else {
            tLRPC$TL_pollAnswer = i != 1823064809 ? null : new TLRPC$TL_pollAnswer() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = new TLRPC$TL_textWithEntities();
                    this.text = tLRPC$TL_textWithEntities;
                    tLRPC$TL_textWithEntities.text = abstractSerializedData2.readString(z2);
                    this.option = abstractSerializedData2.readByteArray(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1823064809);
                    TLRPC$TL_textWithEntities tLRPC$TL_textWithEntities = this.text;
                    abstractSerializedData2.writeString(tLRPC$TL_textWithEntities == null ? "" : tLRPC$TL_textWithEntities.text);
                    abstractSerializedData2.writeByteArray(this.option);
                }
            };
        }
        if (tLRPC$TL_pollAnswer == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in JSONValue", Integer.valueOf(i)));
        }
        if (tLRPC$TL_pollAnswer != null) {
            tLRPC$TL_pollAnswer.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_pollAnswer;
    }
}
