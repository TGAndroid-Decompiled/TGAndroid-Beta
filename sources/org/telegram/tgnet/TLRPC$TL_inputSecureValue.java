package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_inputSecureValue extends TLObject {
    public TLRPC$TL_secureData data;
    public int flags;
    public TLRPC$InputSecureFile front_side;
    public TLRPC$SecurePlainData plain_data;
    public TLRPC$InputSecureFile reverse_side;
    public TLRPC$InputSecureFile selfie;
    public TLRPC$SecureValueType type;
    public ArrayList<TLRPC$InputSecureFile> translation = new ArrayList<>();
    public ArrayList<TLRPC$InputSecureFile> files = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.type = TLRPC$SecureValueType.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.data = TLRPC$TL_secureData.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2) != 0) {
            this.front_side = TLRPC$InputSecureFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.reverse_side = TLRPC$InputSecureFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 8) != 0) {
            this.selfie = TLRPC$InputSecureFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
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
                TLRPC$InputSecureFile TLdeserialize = TLRPC$InputSecureFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
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
                TLRPC$InputSecureFile TLdeserialize2 = TLRPC$InputSecureFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.files.add(TLdeserialize2);
            }
        }
        if ((this.flags & 32) != 0) {
            this.plain_data = TLRPC$SecurePlainData.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-618540889);
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
    }
}
