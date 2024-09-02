package org.telegram.tgnet;

public abstract class TLRPC$ChatParticipant extends TLObject {
    public int date;
    public long inviter_id;
    public long user_id;

    public static TLRPC$ChatParticipant TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ChatParticipant tLRPC$TL_chatParticipantAdmin;
        switch (i) {
            case -1600962725:
                tLRPC$TL_chatParticipantAdmin = new TLRPC$TL_chatParticipantAdmin();
                break;
            case -1070776313:
                tLRPC$TL_chatParticipantAdmin = new TLRPC$TL_chatParticipant();
                break;
            case -925415106:
                tLRPC$TL_chatParticipantAdmin = new TLRPC$TL_chatParticipant() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.user_id = abstractSerializedData2.readInt32(z2);
                        this.inviter_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-925415106);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeInt32((int) this.inviter_id);
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case -636267638:
                tLRPC$TL_chatParticipantAdmin = new TLRPC$TL_chatParticipantCreator() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.user_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-636267638);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                    }
                };
                break;
            case -489233354:
                tLRPC$TL_chatParticipantAdmin = new TLRPC$TL_chatParticipantAdmin() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.user_id = abstractSerializedData2.readInt32(z2);
                        this.inviter_id = abstractSerializedData2.readInt32(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-489233354);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                        abstractSerializedData2.writeInt32((int) this.inviter_id);
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case -462696732:
                tLRPC$TL_chatParticipantAdmin = new TLRPC$TL_chatParticipantCreator();
                break;
            default:
                tLRPC$TL_chatParticipantAdmin = null;
                break;
        }
        if (tLRPC$TL_chatParticipantAdmin == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ChatParticipant", Integer.valueOf(i)));
        }
        if (tLRPC$TL_chatParticipantAdmin != null) {
            tLRPC$TL_chatParticipantAdmin.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_chatParticipantAdmin;
    }
}
