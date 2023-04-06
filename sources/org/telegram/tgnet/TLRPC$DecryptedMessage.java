package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$DecryptedMessage extends TLObject {
    public TLRPC$DecryptedMessageAction action;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public int flags;
    public long grouped_id;
    public TLRPC$DecryptedMessageMedia media;
    public String message;
    public byte[] random_bytes;
    public long random_id;
    public long reply_to_random_id;
    public boolean silent;
    public int ttl;
    public String via_bot_name;

    public static TLRPC$DecryptedMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$DecryptedMessage tLRPC$TL_decryptedMessage;
        switch (i) {
            case -1848883596:
                tLRPC$TL_decryptedMessage = new TLRPC$TL_decryptedMessage();
                break;
            case -1438109059:
                tLRPC$TL_decryptedMessage = new TLRPC$TL_decryptedMessageService_layer8();
                break;
            case 528568095:
                tLRPC$TL_decryptedMessage = new TLRPC$TL_decryptedMessage_layer8();
                break;
            case 541931640:
                tLRPC$TL_decryptedMessage = new TLRPC$TL_decryptedMessage_layer17();
                break;
            case 917541342:
                tLRPC$TL_decryptedMessage = new TLRPC$TL_decryptedMessage_layer45();
                break;
            case 1930838368:
                tLRPC$TL_decryptedMessage = new TLRPC$TL_decryptedMessageService();
                break;
            default:
                tLRPC$TL_decryptedMessage = null;
                break;
        }
        if (tLRPC$TL_decryptedMessage == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in DecryptedMessage", Integer.valueOf(i)));
        }
        if (tLRPC$TL_decryptedMessage != null) {
            tLRPC$TL_decryptedMessage.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_decryptedMessage;
    }
}
