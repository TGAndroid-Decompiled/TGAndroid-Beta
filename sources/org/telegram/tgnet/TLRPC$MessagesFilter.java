package org.telegram.tgnet;
public abstract class TLRPC$MessagesFilter extends TLObject {
    public int flags;
    public boolean missed;

    public static TLRPC$MessagesFilter TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MessagesFilter tLRPC$TL_inputMessagesFilterPhoneCalls;
        switch (i) {
            case -2134272152:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterPhoneCalls();
                break;
            case -1777752804:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterPhotos();
                break;
            case -1629621880:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterDocument();
                break;
            case -1614803355:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterVideo();
                break;
            case -1253451181:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$MessagesFilter() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1253451181);
                    }
                };
                break;
            case -1040652646:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$MessagesFilter() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1040652646);
                    }
                };
                break;
            case -648121413:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$MessagesFilter() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-648121413);
                    }
                };
                break;
            case -530392189:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$MessagesFilter() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-530392189);
                    }
                };
                break;
            case -419271411:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$MessagesFilter() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-419271411);
                    }
                };
                break;
            case -3644025:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterGif();
                break;
            case 464520273:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterPinned();
                break;
            case 928101534:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterMusic();
                break;
            case 975236280:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterChatPhotos();
                break;
            case 1358283666:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$MessagesFilter() {
                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1358283666);
                    }
                };
                break;
            case 1458172132:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterPhotoVideo();
                break;
            case 1474492012:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterEmpty();
                break;
            case 2054952868:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterRoundVoice();
                break;
            case 2129714567:
                tLRPC$TL_inputMessagesFilterPhoneCalls = new TLRPC$TL_inputMessagesFilterUrl();
                break;
            default:
                tLRPC$TL_inputMessagesFilterPhoneCalls = null;
                break;
        }
        if (tLRPC$TL_inputMessagesFilterPhoneCalls == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MessagesFilter", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputMessagesFilterPhoneCalls != null) {
            tLRPC$TL_inputMessagesFilterPhoneCalls.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputMessagesFilterPhoneCalls;
    }
}
