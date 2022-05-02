package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$DecryptedMessageAction extends TLObject {
    public TLRPC$SendMessageAction action;
    public int end_seq_no;
    public long exchange_id;
    public byte[] g_a;
    public byte[] g_b;
    public long key_fingerprint;
    public int layer;
    public ArrayList<Long> random_ids = new ArrayList<>();
    public int start_seq_no;
    public int ttl_seconds;

    public static TLRPC$DecryptedMessageAction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$DecryptedMessageAction tLRPC$DecryptedMessageAction;
        switch (i) {
            case -1967000459:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionScreenshotMessages();
                break;
            case -1586283796:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionSetMessageTTL();
                break;
            case -1473258141:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionNoop();
                break;
            case -860719551:
                tLRPC$DecryptedMessageAction = new TLRPC$DecryptedMessageAction() {
                    public static int constructor = -860719551;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.action = TLRPC$SendMessageAction.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.action.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -586814357:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionAbortKey();
                break;
            case -332526693:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionCommitKey();
                break;
            case -217806717:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionNotifyLayer();
                break;
            case -204906213:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionRequestKey();
                break;
            case 206520510:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionReadMessages();
                break;
            case 1360072880:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionResend();
                break;
            case 1700872964:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionDeleteMessages();
                break;
            case 1729750108:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionFlushHistory();
                break;
            case 1877046107:
                tLRPC$DecryptedMessageAction = new TLRPC$TL_decryptedMessageActionAcceptKey();
                break;
            default:
                tLRPC$DecryptedMessageAction = null;
                break;
        }
        if (tLRPC$DecryptedMessageAction != null || !z) {
            if (tLRPC$DecryptedMessageAction != null) {
                tLRPC$DecryptedMessageAction.readParams(abstractSerializedData, z);
            }
            return tLRPC$DecryptedMessageAction;
        }
        throw new RuntimeException(String.format("can't parse magic %x in DecryptedMessageAction", Integer.valueOf(i)));
    }
}
