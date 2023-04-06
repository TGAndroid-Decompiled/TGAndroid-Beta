package org.telegram.tgnet;
public class TLRPC$TL_langPackLanguage extends TLObject {
    public static int constructor = -288727837;
    public String base_lang_code;
    public int flags;
    public String lang_code;
    public String name;
    public String native_name;
    public boolean official;
    public String plural_code;
    public boolean rtl;
    public int strings_count;
    public int translated_count;
    public String translations_url;

    public static TLRPC$TL_langPackLanguage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_langPackLanguage", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_langPackLanguage tLRPC$TL_langPackLanguage = new TLRPC$TL_langPackLanguage();
        tLRPC$TL_langPackLanguage.readParams(abstractSerializedData, z);
        return tLRPC$TL_langPackLanguage;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.official = (readInt32 & 1) != 0;
        this.rtl = (readInt32 & 4) != 0;
        this.name = abstractSerializedData.readString(z);
        this.native_name = abstractSerializedData.readString(z);
        this.lang_code = abstractSerializedData.readString(z);
        if ((this.flags & 2) != 0) {
            this.base_lang_code = abstractSerializedData.readString(z);
        }
        this.plural_code = abstractSerializedData.readString(z);
        this.strings_count = abstractSerializedData.readInt32(z);
        this.translated_count = abstractSerializedData.readInt32(z);
        this.translations_url = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.official ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.rtl ? i | 4 : i & (-5);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeString(this.name);
        abstractSerializedData.writeString(this.native_name);
        abstractSerializedData.writeString(this.lang_code);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeString(this.base_lang_code);
        }
        abstractSerializedData.writeString(this.plural_code);
        abstractSerializedData.writeInt32(this.strings_count);
        abstractSerializedData.writeInt32(this.translated_count);
        abstractSerializedData.writeString(this.translations_url);
    }
}
