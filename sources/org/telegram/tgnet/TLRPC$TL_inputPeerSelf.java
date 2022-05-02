package org.telegram.tgnet;

public class TLRPC$TL_inputPeerSelf extends TLRPC$InputPeer {
    public static int constructor = 2107670217;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
