package org.telegram.tgnet;
public class TLRPC$TL_messageFwdHeader extends TLRPC$MessageFwdHeader {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.imported = (readInt32 & 128) != 0;
        if ((readInt32 & 1) != 0) {
            this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 32) != 0) {
            this.from_name = abstractSerializedData.readString(z);
        }
        this.date = abstractSerializedData.readInt32(z);
        if ((this.flags & 4) != 0) {
            this.channel_post = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 8) != 0) {
            this.post_author = abstractSerializedData.readString(z);
        }
        if ((this.flags & 16) != 0) {
            this.saved_from_peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 16) != 0) {
            this.saved_from_msg_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 64) != 0) {
            this.psa_type = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1601666510);
        int i = this.imported ? this.flags | 128 : this.flags & (-129);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        if ((this.flags & 1) != 0) {
            this.from_id.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 32) != 0) {
            abstractSerializedData.writeString(this.from_name);
        }
        abstractSerializedData.writeInt32(this.date);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.channel_post);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.post_author);
        }
        if ((this.flags & 16) != 0) {
            this.saved_from_peer.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.saved_from_msg_id);
        }
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeString(this.psa_type);
        }
    }
}
