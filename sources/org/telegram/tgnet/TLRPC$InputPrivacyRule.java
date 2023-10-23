package org.telegram.tgnet;
public abstract class TLRPC$InputPrivacyRule extends TLObject {
    public static TLRPC$InputPrivacyRule TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputPrivacyRule tLRPC$TL_inputPrivacyValueAllowChatParticipants;
        switch (i) {
            case -2079962673:
                tLRPC$TL_inputPrivacyValueAllowChatParticipants = new TLRPC$TL_inputPrivacyValueAllowChatParticipants();
                break;
            case -1877932953:
                tLRPC$TL_inputPrivacyValueAllowChatParticipants = new TLRPC$TL_inputPrivacyValueDisallowUsers();
                break;
            case -697604407:
                tLRPC$TL_inputPrivacyValueAllowChatParticipants = new TLRPC$TL_inputPrivacyValueDisallowAll();
                break;
            case -380694650:
                tLRPC$TL_inputPrivacyValueAllowChatParticipants = new TLRPC$TL_inputPrivacyValueDisallowChatParticipants();
                break;
            case 195371015:
                tLRPC$TL_inputPrivacyValueAllowChatParticipants = new TLRPC$InputPrivacyRule() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(195371015);
                    }
                };
                break;
            case 218751099:
                tLRPC$TL_inputPrivacyValueAllowChatParticipants = new TLRPC$TL_inputPrivacyValueAllowContacts();
                break;
            case 320652927:
                tLRPC$TL_inputPrivacyValueAllowChatParticipants = new TLRPC$TL_inputPrivacyValueAllowUsers();
                break;
            case 407582158:
                tLRPC$TL_inputPrivacyValueAllowChatParticipants = new TLRPC$TL_inputPrivacyValueAllowAll();
                break;
            case 793067081:
                tLRPC$TL_inputPrivacyValueAllowChatParticipants = new TLRPC$TL_inputPrivacyValueAllowCloseFriends();
                break;
            default:
                tLRPC$TL_inputPrivacyValueAllowChatParticipants = null;
                break;
        }
        if (tLRPC$TL_inputPrivacyValueAllowChatParticipants == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputPrivacyRule", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputPrivacyValueAllowChatParticipants != null) {
            tLRPC$TL_inputPrivacyValueAllowChatParticipants.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputPrivacyValueAllowChatParticipants;
    }
}
