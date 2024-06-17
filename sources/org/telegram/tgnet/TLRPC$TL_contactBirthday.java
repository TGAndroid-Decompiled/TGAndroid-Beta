package org.telegram.tgnet;

public class TLRPC$TL_contactBirthday extends TLObject {
    public TLRPC$TL_birthday birthday;
    public long contact_id;

    public static TLRPC$TL_contactBirthday TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != 496600883) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_contactBirthday", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_contactBirthday tLRPC$TL_contactBirthday = new TLRPC$TL_contactBirthday();
        tLRPC$TL_contactBirthday.readParams(abstractSerializedData, z);
        return tLRPC$TL_contactBirthday;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.contact_id = abstractSerializedData.readInt64(z);
        this.birthday = TLRPC$TL_birthday.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(496600883);
        abstractSerializedData.writeInt64(this.contact_id);
        this.birthday.serializeToStream(abstractSerializedData);
    }
}
