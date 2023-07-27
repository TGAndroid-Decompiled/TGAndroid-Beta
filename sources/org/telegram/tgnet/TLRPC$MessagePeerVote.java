package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$MessagePeerVote extends TLObject {
    int date;
    public TLRPC$Peer peer;

    public static TLRPC$MessagePeerVote TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MessagePeerVote tLRPC$MessagePeerVote;
        if (i == -1228133028) {
            tLRPC$MessagePeerVote = new TLRPC$MessagePeerVote() {
                public static int constructor = -1228133028;
                public byte[] option;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.option = abstractSerializedData2.readByteArray(z2);
                    this.date = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    this.peer.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeByteArray(this.option);
                    abstractSerializedData2.writeInt32(this.date);
                }
            };
        } else if (i == 1177089766) {
            tLRPC$MessagePeerVote = new TLRPC$MessagePeerVote() {
                public static int constructor = 1177089766;
                public ArrayList<byte[]> options = new ArrayList<>();

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        this.options.add(abstractSerializedData2.readByteArray(z2));
                    }
                    this.date = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    this.peer.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.options.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        abstractSerializedData2.writeByteArray(this.options.get(i2));
                    }
                    abstractSerializedData2.writeInt32(this.date);
                }
            };
        } else {
            tLRPC$MessagePeerVote = i != 1959634180 ? null : new TLRPC$TL_messagePeerVoteInputOption();
        }
        if (tLRPC$MessagePeerVote == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MessagePeerVote", Integer.valueOf(i)));
        }
        if (tLRPC$MessagePeerVote != null) {
            tLRPC$MessagePeerVote.readParams(abstractSerializedData, z);
        }
        return tLRPC$MessagePeerVote;
    }
}
