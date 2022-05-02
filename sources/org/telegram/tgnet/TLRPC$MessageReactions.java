package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$MessageReactions extends TLObject {
    public boolean can_see_list;
    public int flags;
    public boolean min;
    public ArrayList<TLRPC$TL_reactionCount> results = new ArrayList<>();
    public ArrayList<TLRPC$TL_messagePeerReaction> recent_reactions = new ArrayList<>();

    public static TLRPC$TL_messageReactions TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions;
        if (i == -1199954735) {
            tLRPC$TL_messageReactions = new TLRPC$TL_messageReactions() {
                public static int constructor = -1199954735;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.min = (readInt32 & 1) != 0;
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    if (readInt322 == 481674261) {
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$TL_reactionCount TLdeserialize = TLRPC$TL_reactionCount.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize != null) {
                                this.results.add(TLdeserialize);
                            } else {
                                return;
                            }
                        }
                    } else if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    int i2 = this.min ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    abstractSerializedData2.writeInt32(i2);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.results.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i3 = 0; i3 < size; i3++) {
                        this.results.get(i3).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        } else if (i != 142306870) {
            tLRPC$TL_messageReactions = i != 1328256121 ? null : new TLRPC$TL_messageReactions();
        } else {
            tLRPC$TL_messageReactions = new TLRPC$TL_messageReactions() {
                public static int constructor = 142306870;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    this.flags = readInt32;
                    this.min = (readInt32 & 1) != 0;
                    this.can_see_list = (readInt32 & 4) != 0;
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    if (readInt322 == 481674261) {
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$TL_reactionCount TLdeserialize = TLRPC$TL_reactionCount.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize != null) {
                                this.results.add(TLdeserialize);
                            } else {
                                return;
                            }
                        }
                        if ((this.flags & 2) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 == 481674261) {
                                int readInt325 = abstractSerializedData2.readInt32(z2);
                                for (int i3 = 0; i3 < readInt325; i3++) {
                                    TLRPC$TL_messagePeerReaction TLdeserialize2 = TLRPC$MessagePeerReaction.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                    if (TLdeserialize2 != null) {
                                        this.recent_reactions.add(TLdeserialize2);
                                    } else {
                                        return;
                                    }
                                }
                            } else if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                            }
                        }
                    } else if (z2) {
                        throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    int i2 = this.min ? this.flags | 1 : this.flags & (-2);
                    this.flags = i2;
                    int i3 = this.can_see_list ? i2 | 4 : i2 & (-5);
                    this.flags = i3;
                    abstractSerializedData2.writeInt32(i3);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.results.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        this.results.get(i4).serializeToStream(abstractSerializedData2);
                    }
                    if ((this.flags & 2) != 0) {
                        abstractSerializedData2.writeInt32(481674261);
                        int size2 = this.recent_reactions.size();
                        abstractSerializedData2.writeInt32(size2);
                        for (int i5 = 0; i5 < size2; i5++) {
                            this.recent_reactions.get(i5).serializeToStream(abstractSerializedData2);
                        }
                    }
                }
            };
        }
        if (tLRPC$TL_messageReactions != null || !z) {
            if (tLRPC$TL_messageReactions != null) {
                tLRPC$TL_messageReactions.readParams(abstractSerializedData, z);
            }
            return tLRPC$TL_messageReactions;
        }
        throw new RuntimeException(String.format("can't parse magic %x in MessageReactions", Integer.valueOf(i)));
    }
}
