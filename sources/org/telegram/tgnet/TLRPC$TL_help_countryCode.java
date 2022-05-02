package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_help_countryCode extends TLObject {
    public static int constructor = 1107543535;
    public String country_code;
    public int flags;
    public ArrayList<String> prefixes = new ArrayList<>();
    public ArrayList<String> patterns = new ArrayList<>();

    public static TLRPC$TL_help_countryCode TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_help_countryCode tLRPC$TL_help_countryCode = new TLRPC$TL_help_countryCode();
            tLRPC$TL_help_countryCode.readParams(abstractSerializedData, z);
            return tLRPC$TL_help_countryCode;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_help_countryCode", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.country_code = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 == 481674261) {
                int readInt322 = abstractSerializedData.readInt32(z);
                for (int i = 0; i < readInt322; i++) {
                    this.prefixes.add(abstractSerializedData.readString(z));
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            } else {
                return;
            }
        }
        if ((this.flags & 2) != 0) {
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 == 481674261) {
                int readInt324 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt324; i2++) {
                    this.patterns.add(abstractSerializedData.readString(z));
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.country_code);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.prefixes.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                abstractSerializedData.writeString(this.prefixes.get(i));
            }
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.patterns.size();
            abstractSerializedData.writeInt32(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                abstractSerializedData.writeString(this.patterns.get(i2));
            }
        }
    }
}
