package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_langPackDifference extends TLObject {
    public int from_version;
    public String lang_code;
    public ArrayList<TLRPC$LangPackString> strings = new ArrayList<>();
    public int version;

    public static TLRPC$TL_langPackDifference TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-209337866 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_langPackDifference", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_langPackDifference tLRPC$TL_langPackDifference = new TLRPC$TL_langPackDifference();
        tLRPC$TL_langPackDifference.readParams(abstractSerializedData, z);
        return tLRPC$TL_langPackDifference;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.lang_code = abstractSerializedData.readString(z);
        this.from_version = abstractSerializedData.readInt32(z);
        this.version = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$LangPackString TLdeserialize = TLRPC$LangPackString.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.strings.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-209337866);
        abstractSerializedData.writeString(this.lang_code);
        abstractSerializedData.writeInt32(this.from_version);
        abstractSerializedData.writeInt32(this.version);
        abstractSerializedData.writeInt32(481674261);
        int size = this.strings.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.strings.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
