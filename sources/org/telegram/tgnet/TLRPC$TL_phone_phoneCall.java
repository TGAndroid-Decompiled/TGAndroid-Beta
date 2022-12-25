package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_phone_phoneCall extends TLObject {
    public static int constructor = -326966976;
    public TLRPC$PhoneCall phone_call;
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_phone_phoneCall TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_phone_phoneCall", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_phone_phoneCall tLRPC$TL_phone_phoneCall = new TLRPC$TL_phone_phoneCall();
        tLRPC$TL_phone_phoneCall.readParams(abstractSerializedData, z);
        return tLRPC$TL_phone_phoneCall;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.phone_call = TLRPC$PhoneCall.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$User TLdeserialize = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.users.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.phone_call.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.users.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.users.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
