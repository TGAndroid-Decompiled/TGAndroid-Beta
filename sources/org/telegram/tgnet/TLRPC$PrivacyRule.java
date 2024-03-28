package org.telegram.tgnet;
public abstract class TLRPC$PrivacyRule extends TLObject {
    public static TLRPC$PrivacyRule TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$PrivacyRule tLRPC$PrivacyRule;
        switch (i) {
            case -1955338397:
                tLRPC$PrivacyRule = new TLRPC$PrivacyRule() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1955338397);
                    }
                };
                break;
            case -1198497870:
                tLRPC$PrivacyRule = new TLRPC$TL_privacyValueAllowUsers();
                break;
            case -463335103:
                tLRPC$PrivacyRule = new TLRPC$TL_privacyValueDisallowUsers();
                break;
            case -320241333:
                tLRPC$PrivacyRule = new TLRPC$PrivacyRule() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-320241333);
                    }
                };
                break;
            case -135735141:
                tLRPC$PrivacyRule = new TLRPC$TL_privacyValueAllowCloseFriends();
                break;
            case -125240806:
                tLRPC$PrivacyRule = new TLRPC$PrivacyRule() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-125240806);
                    }
                };
                break;
            case -123988:
                tLRPC$PrivacyRule = new TLRPC$TL_privacyValueAllowContacts();
                break;
            case 1103656293:
                tLRPC$PrivacyRule = new TLRPC$TL_privacyValueDisallowChatParticipants();
                break;
            case 1698855810:
                tLRPC$PrivacyRule = new TLRPC$TL_privacyValueAllowAll();
                break;
            case 1796427406:
                tLRPC$PrivacyRule = new TLRPC$TL_privacyValueAllowChatParticipants();
                break;
            default:
                tLRPC$PrivacyRule = null;
                break;
        }
        if (tLRPC$PrivacyRule == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PrivacyRule", Integer.valueOf(i)));
        }
        if (tLRPC$PrivacyRule != null) {
            tLRPC$PrivacyRule.readParams(abstractSerializedData, z);
        }
        return tLRPC$PrivacyRule;
    }
}
