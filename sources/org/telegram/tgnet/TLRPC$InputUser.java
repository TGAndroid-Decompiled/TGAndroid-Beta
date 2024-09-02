package org.telegram.tgnet;

public abstract class TLRPC$InputUser extends TLObject {
    public long access_hash;
    public long user_id;

    public static TLRPC$InputUser TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputUser tLRPC$TL_inputUserEmpty;
        if (i == -1182234929) {
            tLRPC$TL_inputUserEmpty = new TLRPC$TL_inputUserEmpty();
        } else if (i == -233744186) {
            tLRPC$TL_inputUserEmpty = new TLRPC$TL_inputUser();
        } else if (i == -138301121) {
            tLRPC$TL_inputUserEmpty = new TLRPC$TL_inputUserSelf();
        } else {
            tLRPC$TL_inputUserEmpty = i != 497305826 ? null : new TLRPC$InputUser() {
                public int msg_id;
                public TLRPC$InputPeer peer;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.msg_id = abstractSerializedData2.readInt32(z2);
                    this.user_id = abstractSerializedData2.readInt64(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(497305826);
                    this.peer.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(this.msg_id);
                    abstractSerializedData2.writeInt64(this.user_id);
                }
            };
        }
        if (tLRPC$TL_inputUserEmpty == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputUser", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputUserEmpty != null) {
            tLRPC$TL_inputUserEmpty.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputUserEmpty;
    }
}
