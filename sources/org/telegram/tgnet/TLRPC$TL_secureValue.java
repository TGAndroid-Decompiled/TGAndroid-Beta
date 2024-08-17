package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_secureValue extends TLObject {
    public TLRPC$TL_secureData data;
    public int flags;
    public TLRPC$SecureFile front_side;
    public byte[] hash;
    public TLRPC$SecurePlainData plain_data;
    public TLRPC$SecureFile reverse_side;
    public TLRPC$SecureFile selfie;
    public TLRPC$SecureValueType type;
    public ArrayList<TLRPC$SecureFile> translation = new ArrayList<>();
    public ArrayList<TLRPC$SecureFile> files = new ArrayList<>();

    public static TLRPC$TL_secureValue TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (411017418 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_secureValue", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_secureValue tLRPC$TL_secureValue = new TLRPC$TL_secureValue();
        tLRPC$TL_secureValue.readParams(abstractSerializedData, z);
        return tLRPC$TL_secureValue;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.type = TLRPC$SecureValueType.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.data = TLRPC$TL_secureData.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            this.front_side = TLRPC$SecureFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.reverse_side = TLRPC$SecureFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 8) != 0) {
            this.selfie = TLRPC$SecureFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 64) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                TLRPC$SecureFile TLdeserialize = TLRPC$SecureFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.translation.add(TLdeserialize);
            }
        }
        if ((this.flags & 16) != 0) {
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                }
                return;
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt324; i2++) {
                TLRPC$SecureFile TLdeserialize2 = TLRPC$SecureFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.files.add(TLdeserialize2);
            }
        }
        if ((this.flags & 32) != 0) {
            this.plain_data = TLRPC$SecurePlainData.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.hash = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(411017418);
        abstractSerializedData.writeInt32(this.flags);
        this.type.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            this.data.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2) != 0) {
            this.front_side.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            this.reverse_side.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            this.selfie.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.translation.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.translation.get(i).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.files.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                this.files.get(i2).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 32) != 0) {
            this.plain_data.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeByteArray(this.hash);
    }
}
