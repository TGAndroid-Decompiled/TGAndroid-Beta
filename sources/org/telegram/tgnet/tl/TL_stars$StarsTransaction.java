package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$WebDocument;

public class TL_stars$StarsTransaction extends TLObject {
    public byte[] bot_payload;
    public int date;
    public String description;
    public ArrayList extended_media = new ArrayList();
    public boolean failed;
    public int flags;
    public boolean gift;
    public int giveaway_post_id;
    public String id;
    public int msg_id;
    public TL_stars$StarsTransactionPeer peer;
    public boolean pending;
    public TLRPC$WebDocument photo;
    public boolean reaction;
    public TLRPC$Peer received_by;
    public boolean refund;
    public TLRPC$Peer sent_by;
    public TL_stars$StarGift stargift;
    public long stars;
    public boolean subscription;
    public int subscription_period;
    public String title;
    public int transaction_date;
    public String transaction_url;

    public static TL_stars$StarsTransaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stars$StarsTransaction tL_stars$StarsTransaction;
        switch (i) {
            case -1442789224:
                tL_stars$StarsTransaction = new TL_stars$TL_starsTransaction() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.refund = (readInt32 & 8) != 0;
                        this.pending = (readInt32 & 16) != 0;
                        this.failed = (readInt32 & 64) != 0;
                        this.id = abstractSerializedData2.readString(z2);
                        this.stars = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.peer = TL_stars$StarsTransactionPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 1) != 0) {
                            this.title = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.description = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.transaction_date = abstractSerializedData2.readInt32(z2);
                            this.transaction_url = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1442789224);
                        int i2 = this.refund ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.pending ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.failed ? i3 | 64 : i3 & (-65);
                        this.flags = i4;
                        abstractSerializedData2.writeInt32(i4);
                        abstractSerializedData2.writeInt64(this.stars);
                        abstractSerializedData2.writeInt32(this.date);
                        this.peer.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.title);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.description);
                        }
                        if ((this.flags & 4) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.transaction_date);
                            abstractSerializedData2.writeString(this.transaction_url);
                        }
                    }
                };
                break;
            case -865044046:
                tL_stars$StarsTransaction = new TL_stars$StarsTransaction() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.refund = (readInt32 & 8) != 0;
                        this.id = abstractSerializedData2.readString(z2);
                        this.stars = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.peer = TL_stars$StarsTransactionPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 1) != 0) {
                            this.title = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.description = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-865044046);
                        int i2 = this.refund ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt64(this.stars);
                        abstractSerializedData2.writeInt32(this.date);
                        this.peer.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.title);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.description);
                        }
                        if ((this.flags & 4) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -294313259:
                tL_stars$StarsTransaction = new TL_stars$TL_starsTransaction() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.refund = (readInt32 & 8) != 0;
                        this.pending = (readInt32 & 16) != 0;
                        this.failed = (readInt32 & 64) != 0;
                        this.gift = (readInt32 & 1024) != 0;
                        this.reaction = (readInt32 & 2048) != 0;
                        this.subscription = (readInt32 & 4096) != 0;
                        this.id = abstractSerializedData2.readString(z2);
                        this.stars = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.peer = TL_stars$StarsTransactionPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 1) != 0) {
                            this.title = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.description = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.transaction_date = abstractSerializedData2.readInt32(z2);
                            this.transaction_url = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 128) != 0) {
                            this.bot_payload = abstractSerializedData2.readByteArray(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 512) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.extended_media.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 4096) != 0) {
                            this.subscription_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.giveaway_post_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-294313259);
                        int i2 = this.refund ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.pending ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.failed ? i3 | 64 : i3 & (-65);
                        this.flags = i4;
                        int i5 = this.gift ? i4 | 1024 : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.reaction ? i5 | 2048 : i5 & (-2049);
                        this.flags = i6;
                        int i7 = this.subscription ? i6 | 4096 : i6 & (-4097);
                        this.flags = i7;
                        abstractSerializedData2.writeInt32(i7);
                        abstractSerializedData2.writeInt64(this.stars);
                        abstractSerializedData2.writeInt32(this.date);
                        this.peer.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.title);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.description);
                        }
                        if ((this.flags & 4) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.transaction_date);
                            abstractSerializedData2.writeString(this.transaction_url);
                        }
                        if ((this.flags & 128) != 0) {
                            abstractSerializedData2.writeByteArray(this.bot_payload);
                        }
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32(this.msg_id);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.extended_media.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i8 = 0; i8 < size; i8++) {
                                ((TLRPC$MessageMedia) this.extended_media.get(i8)).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.subscription_period);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.giveaway_post_id);
                        }
                    }
                };
                break;
            case 178185410:
                tL_stars$StarsTransaction = new TL_stars$TL_starsTransaction();
                break;
            case 766853519:
                tL_stars$StarsTransaction = new TL_stars$TL_starsTransaction() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.refund = (readInt32 & 8) != 0;
                        this.pending = (readInt32 & 16) != 0;
                        this.failed = (readInt32 & 64) != 0;
                        this.gift = (readInt32 & 1024) != 0;
                        this.id = abstractSerializedData2.readString(z2);
                        this.stars = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.peer = TL_stars$StarsTransactionPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 1) != 0) {
                            this.title = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.description = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.transaction_date = abstractSerializedData2.readInt32(z2);
                            this.transaction_url = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 128) != 0) {
                            this.bot_payload = abstractSerializedData2.readByteArray(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 512) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.extended_media.add(TLdeserialize);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(766853519);
                        int i2 = this.refund ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.pending ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.failed ? i3 | 64 : i3 & (-65);
                        this.flags = i4;
                        int i5 = this.gift ? i4 | 1024 : i4 & (-1025);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt64(this.stars);
                        abstractSerializedData2.writeInt32(this.date);
                        this.peer.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.title);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.description);
                        }
                        if ((this.flags & 4) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.transaction_date);
                            abstractSerializedData2.writeString(this.transaction_url);
                        }
                        if ((this.flags & 128) != 0) {
                            abstractSerializedData2.writeByteArray(this.bot_payload);
                        }
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32(this.msg_id);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.extended_media.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i6 = 0; i6 < size; i6++) {
                                ((TLRPC$MessageMedia) this.extended_media.get(i6)).serializeToStream(abstractSerializedData2);
                            }
                        }
                    }
                };
                break;
            case 1127934763:
                tL_stars$StarsTransaction = new TL_stars$TL_starsTransaction() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.refund = (readInt32 & 8) != 0;
                        this.pending = (readInt32 & 16) != 0;
                        this.failed = (readInt32 & 64) != 0;
                        this.gift = (readInt32 & 1024) != 0;
                        this.reaction = (readInt32 & 2048) != 0;
                        this.subscription = (readInt32 & 4096) != 0;
                        this.id = abstractSerializedData2.readString(z2);
                        this.stars = abstractSerializedData2.readInt64(z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.peer = TL_stars$StarsTransactionPeer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 1) != 0) {
                            this.title = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.description = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.transaction_date = abstractSerializedData2.readInt32(z2);
                            this.transaction_url = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 128) != 0) {
                            this.bot_payload = abstractSerializedData2.readByteArray(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 512) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.extended_media.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 4096) != 0) {
                            this.subscription_period = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1127934763);
                        int i2 = this.refund ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.pending ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.failed ? i3 | 64 : i3 & (-65);
                        this.flags = i4;
                        int i5 = this.gift ? i4 | 1024 : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.reaction ? i5 | 2048 : i5 & (-2049);
                        this.flags = i6;
                        int i7 = this.subscription ? i6 | 4096 : i6 & (-4097);
                        this.flags = i7;
                        abstractSerializedData2.writeInt32(i7);
                        abstractSerializedData2.writeInt64(this.stars);
                        abstractSerializedData2.writeInt32(this.date);
                        this.peer.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.title);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.description);
                        }
                        if ((this.flags & 4) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.transaction_date);
                            abstractSerializedData2.writeString(this.transaction_url);
                        }
                        if ((this.flags & 128) != 0) {
                            abstractSerializedData2.writeByteArray(this.bot_payload);
                        }
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32(this.msg_id);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.extended_media.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i8 = 0; i8 < size; i8++) {
                                ((TLRPC$MessageMedia) this.extended_media.get(i8)).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.subscription_period);
                        }
                    }
                };
                break;
            default:
                tL_stars$StarsTransaction = null;
                break;
        }
        if (tL_stars$StarsTransaction == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StarsTransaction", Integer.valueOf(i)));
        }
        if (tL_stars$StarsTransaction != null) {
            tL_stars$StarsTransaction.readParams(abstractSerializedData, z);
        }
        return tL_stars$StarsTransaction;
    }
}
