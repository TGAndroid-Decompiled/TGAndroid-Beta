package org.telegram.tgnet;

public class TLRPC$TL_phoneCall extends TLRPC$PhoneCall {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.p2p_allowed = (readInt32 & 32) != 0;
        this.video = (readInt32 & 64) != 0;
        this.id = abstractSerializedData.readInt64(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        this.date = abstractSerializedData.readInt32(z);
        this.admin_id = abstractSerializedData.readInt64(z);
        this.participant_id = abstractSerializedData.readInt64(z);
        this.g_a_or_b = abstractSerializedData.readByteArray(z);
        this.key_fingerprint = abstractSerializedData.readInt64(z);
        this.protocol = TLRPC$PhoneCallProtocol.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$PhoneConnection TLdeserialize = TLRPC$PhoneConnection.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.connections.add(TLdeserialize);
        }
        this.start_date = abstractSerializedData.readInt32(z);
        if ((this.flags & 128) != 0) {
            this.custom_parameters = TLRPC$TL_dataJSON.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(810769141);
        int i = this.p2p_allowed ? this.flags | 32 : this.flags & (-33);
        this.flags = i;
        int i2 = this.video ? i | 64 : i & (-65);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.access_hash);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt64(this.admin_id);
        abstractSerializedData.writeInt64(this.participant_id);
        abstractSerializedData.writeByteArray(this.g_a_or_b);
        abstractSerializedData.writeInt64(this.key_fingerprint);
        this.protocol.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.connections.size();
        abstractSerializedData.writeInt32(size);
        for (int i3 = 0; i3 < size; i3++) {
            ((TLRPC$PhoneConnection) this.connections.get(i3)).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.start_date);
        if ((this.flags & 128) != 0) {
            this.custom_parameters.serializeToStream(abstractSerializedData);
        }
    }
}
