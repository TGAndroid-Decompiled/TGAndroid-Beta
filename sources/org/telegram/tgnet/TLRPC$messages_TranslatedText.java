package org.telegram.tgnet;

public abstract class TLRPC$messages_TranslatedText extends TLObject {
    public static TLRPC$messages_TranslatedText TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_TranslatedText tLRPC$TL_messages_translateResultText;
        if (i != -1575684144) {
            tLRPC$TL_messages_translateResultText = i != 1741309751 ? null : new TLRPC$messages_TranslatedText() {
                public static int constructor = 1741309751;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$TL_messages_translateResultText = new TLRPC$TL_messages_translateResultText();
        }
        if (tLRPC$TL_messages_translateResultText == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_TranslatedText", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_translateResultText != null) {
            tLRPC$TL_messages_translateResultText.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_translateResultText;
    }
}
