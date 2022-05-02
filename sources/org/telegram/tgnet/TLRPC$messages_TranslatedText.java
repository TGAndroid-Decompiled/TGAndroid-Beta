package org.telegram.tgnet;

public abstract class TLRPC$messages_TranslatedText extends TLObject {
    public static TLRPC$messages_TranslatedText TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_TranslatedText tLRPC$messages_TranslatedText;
        if (i != -1575684144) {
            tLRPC$messages_TranslatedText = i != 1741309751 ? null : new TLRPC$messages_TranslatedText() {
                public static int constructor = 1741309751;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$messages_TranslatedText = new TLRPC$messages_TranslatedText() {
                public static int constructor = -1575684144;
                public String text;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.text = abstractSerializedData2.readString(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeString(this.text);
                }
            };
        }
        if (tLRPC$messages_TranslatedText != null || !z) {
            if (tLRPC$messages_TranslatedText != null) {
                tLRPC$messages_TranslatedText.readParams(abstractSerializedData, z);
            }
            return tLRPC$messages_TranslatedText;
        }
        throw new RuntimeException(String.format("can't parse magic %x in messages_TranslatedText", Integer.valueOf(i)));
    }
}
