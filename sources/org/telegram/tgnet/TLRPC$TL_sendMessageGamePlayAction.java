package org.telegram.tgnet;
public class TLRPC$TL_sendMessageGamePlayAction extends TLRPC$SendMessageAction {
    public static int constructor = -580219064;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
