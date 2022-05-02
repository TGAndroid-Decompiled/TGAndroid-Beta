package org.telegram.tgnet;

public class TLRPC$TL_inputPeerEmpty extends TLRPC$InputPeer {
    public static int constructor = 2134579434;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
