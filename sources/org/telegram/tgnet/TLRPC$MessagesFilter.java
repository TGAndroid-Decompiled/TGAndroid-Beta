package org.telegram.tgnet;

public abstract class TLRPC$MessagesFilter extends TLObject {
    public int flags;
    public boolean missed;

    public static TLRPC$MessagesFilter TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MessagesFilter tLRPC$MessagesFilter;
        switch (i) {
            case -2134272152:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterPhoneCalls();
                break;
            case -1777752804:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterPhotos();
                break;
            case -1629621880:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterDocument();
                break;
            case -1614803355:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterVideo();
                break;
            case -1253451181:
                tLRPC$MessagesFilter = new TLRPC$MessagesFilter() {
                    public static int constructor = -1253451181;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1040652646:
                tLRPC$MessagesFilter = new TLRPC$MessagesFilter() {
                    public static int constructor = -1040652646;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -648121413:
                tLRPC$MessagesFilter = new TLRPC$MessagesFilter() {
                    public static int constructor = -648121413;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -530392189:
                tLRPC$MessagesFilter = new TLRPC$MessagesFilter() {
                    public static int constructor = -530392189;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -419271411:
                tLRPC$MessagesFilter = new TLRPC$MessagesFilter() {
                    public static int constructor = -419271411;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -3644025:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterGif();
                break;
            case 464520273:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterPinned();
                break;
            case 928101534:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterMusic();
                break;
            case 975236280:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterChatPhotos();
                break;
            case 1358283666:
                tLRPC$MessagesFilter = new TLRPC$MessagesFilter() {
                    public static int constructor = 1358283666;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1458172132:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterPhotoVideo();
                break;
            case 1474492012:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterEmpty();
                break;
            case 2054952868:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterRoundVoice();
                break;
            case 2129714567:
                tLRPC$MessagesFilter = new TLRPC$TL_inputMessagesFilterUrl();
                break;
            default:
                tLRPC$MessagesFilter = null;
                break;
        }
        if (tLRPC$MessagesFilter != null || !z) {
            if (tLRPC$MessagesFilter != null) {
                tLRPC$MessagesFilter.readParams(abstractSerializedData, z);
            }
            return tLRPC$MessagesFilter;
        }
        throw new RuntimeException(String.format("can't parse magic %x in MessagesFilter", Integer.valueOf(i)));
    }
}
