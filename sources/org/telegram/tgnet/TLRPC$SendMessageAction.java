package org.telegram.tgnet;

public abstract class TLRPC$SendMessageAction extends TLObject {
    public int progress;

    public static TLRPC$SendMessageAction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SendMessageAction tLRPC$SendMessageAction;
        switch (i) {
            case -1997373508:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageRecordRoundAction();
                break;
            case -1884362354:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageUploadDocumentAction() {
                    public static int constructor = -1884362354;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1845219337:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageUploadVideoAction() {
                    public static int constructor = -1845219337;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1727382502:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageUploadPhotoAction() {
                    public static int constructor = -1727382502;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1584933265:
                tLRPC$SendMessageAction = new TLRPC$SendMessageAction() {
                    public static int constructor = -1584933265;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -1441998364:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageUploadDocumentAction();
                break;
            case -1336228175:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageChooseStickerAction();
                break;
            case -1234857938:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageEmojiInteractionSeen();
                break;
            case -774682074:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageUploadPhotoAction();
                break;
            case -718310409:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageRecordAudioAction();
                break;
            case -651419003:
                tLRPC$SendMessageAction = new TLRPC$TL_speakingInGroupCallAction();
                break;
            case -606432698:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageHistoryImportAction();
                break;
            case -580219064:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageGamePlayAction();
                break;
            case -424899985:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageUploadAudioAction() {
                    public static int constructor = -424899985;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -378127636:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageUploadVideoAction();
                break;
            case -212740181:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageUploadAudioAction();
                break;
            case -44119819:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageCancelAction();
                break;
            case 381645902:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageTypingAction();
                break;
            case 393186209:
                tLRPC$SendMessageAction = new TLRPC$SendMessageAction() {
                    public static int constructor = 393186209;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 608050278:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageUploadRoundAction();
                break;
            case 630664139:
                tLRPC$SendMessageAction = new TLRPC$TL_sendMessageEmojiInteraction();
                break;
            case 1653390447:
                tLRPC$SendMessageAction = new TLRPC$SendMessageAction() {
                    public static int constructor = 1653390447;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            default:
                tLRPC$SendMessageAction = null;
                break;
        }
        if (tLRPC$SendMessageAction != null || !z) {
            if (tLRPC$SendMessageAction != null) {
                tLRPC$SendMessageAction.readParams(abstractSerializedData, z);
            }
            return tLRPC$SendMessageAction;
        }
        throw new RuntimeException(String.format("can't parse magic %x in SendMessageAction", Integer.valueOf(i)));
    }
}
