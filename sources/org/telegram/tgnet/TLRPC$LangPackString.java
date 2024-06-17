package org.telegram.tgnet;

public abstract class TLRPC$LangPackString extends TLObject {
    public String few_value;
    public int flags;
    public String key;
    public String many_value;
    public String one_value;
    public String other_value;
    public String two_value;
    public String value;
    public String zero_value;

    public static TLRPC$LangPackString TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$LangPackString tLRPC$LangPackString;
        if (i == -892239370) {
            tLRPC$LangPackString = new TLRPC$LangPackString() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.key = abstractSerializedData2.readString(z2);
                    this.value = abstractSerializedData2.readString(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-892239370);
                    abstractSerializedData2.writeString(this.key);
                    abstractSerializedData2.writeString(this.value);
                }
            };
        } else if (i != 695856818) {
            tLRPC$LangPackString = i != 1816636575 ? null : new TLRPC$LangPackString() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.key = abstractSerializedData2.readString(z2);
                    if ((this.flags & 1) != 0) {
                        this.zero_value = abstractSerializedData2.readString(z2);
                    }
                    if ((this.flags & 2) != 0) {
                        this.one_value = abstractSerializedData2.readString(z2);
                    }
                    if ((this.flags & 4) != 0) {
                        this.two_value = abstractSerializedData2.readString(z2);
                    }
                    if ((this.flags & 8) != 0) {
                        this.few_value = abstractSerializedData2.readString(z2);
                    }
                    if ((this.flags & 16) != 0) {
                        this.many_value = abstractSerializedData2.readString(z2);
                    }
                    this.other_value = abstractSerializedData2.readString(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(1816636575);
                    abstractSerializedData2.writeInt32(this.flags);
                    abstractSerializedData2.writeString(this.key);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeString(this.zero_value);
                    }
                    if ((this.flags & 2) != 0) {
                        abstractSerializedData2.writeString(this.one_value);
                    }
                    if ((this.flags & 4) != 0) {
                        abstractSerializedData2.writeString(this.two_value);
                    }
                    if ((this.flags & 8) != 0) {
                        abstractSerializedData2.writeString(this.few_value);
                    }
                    if ((this.flags & 16) != 0) {
                        abstractSerializedData2.writeString(this.many_value);
                    }
                    abstractSerializedData2.writeString(this.other_value);
                }
            };
        } else {
            tLRPC$LangPackString = new TLRPC$LangPackString() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.key = abstractSerializedData2.readString(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(695856818);
                    abstractSerializedData2.writeString(this.key);
                }
            };
        }
        if (tLRPC$LangPackString == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in LangPackString", Integer.valueOf(i)));
        }
        if (tLRPC$LangPackString != null) {
            tLRPC$LangPackString.readParams(abstractSerializedData, z);
        }
        return tLRPC$LangPackString;
    }
}
