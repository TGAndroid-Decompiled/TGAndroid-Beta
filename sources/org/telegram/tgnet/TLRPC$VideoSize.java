package org.telegram.tgnet;

import android.text.TextUtils;

public abstract class TLRPC$VideoSize extends TLObject {
    public int flags;
    public int h;
    public TLRPC$FileLocation location;
    public int size;
    public String type;
    public double video_start_ts;
    public int w;

    public static TLRPC$VideoSize TLdeserialize(long j, long j2, AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_videoSize tLRPC$TL_videoSize;
        if (i == -567037804) {
            tLRPC$TL_videoSize = new TLRPC$TL_videoSize();
        } else if (i != -399391402) {
            tLRPC$TL_videoSize = i != 1130084743 ? null : new TLRPC$TL_videoSize() {
                public static int constructor = 1130084743;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.type = abstractSerializedData2.readString(z2);
                    this.location = TLRPC$FileLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.w = abstractSerializedData2.readInt32(z2);
                    this.h = abstractSerializedData2.readInt32(z2);
                    this.size = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeString(this.type);
                    this.location.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(this.w);
                    abstractSerializedData2.writeInt32(this.h);
                    abstractSerializedData2.writeInt32(this.size);
                }
            };
        } else {
            tLRPC$TL_videoSize = new TLRPC$TL_videoSize() {
                public static int constructor = -399391402;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.flags = abstractSerializedData2.readInt32(z2);
                    this.type = abstractSerializedData2.readString(z2);
                    this.location = TLRPC$FileLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    this.w = abstractSerializedData2.readInt32(z2);
                    this.h = abstractSerializedData2.readInt32(z2);
                    this.size = abstractSerializedData2.readInt32(z2);
                    if ((this.flags & 1) != 0) {
                        this.video_start_ts = abstractSerializedData2.readDouble(z2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(this.flags);
                    abstractSerializedData2.writeString(this.type);
                    this.location.serializeToStream(abstractSerializedData2);
                    abstractSerializedData2.writeInt32(this.w);
                    abstractSerializedData2.writeInt32(this.h);
                    abstractSerializedData2.writeInt32(this.size);
                    if ((this.flags & 1) != 0) {
                        abstractSerializedData2.writeDouble(this.video_start_ts);
                    }
                }
            };
        }
        if (tLRPC$TL_videoSize != null || !z) {
            if (tLRPC$TL_videoSize != null) {
                tLRPC$TL_videoSize.readParams(abstractSerializedData, z);
                if (tLRPC$TL_videoSize.location == null) {
                    if (TextUtils.isEmpty(tLRPC$TL_videoSize.type) || (j == 0 && j2 == 0)) {
                        tLRPC$TL_videoSize.location = new TLRPC$TL_fileLocationUnavailable();
                    } else {
                        TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated = new TLRPC$TL_fileLocationToBeDeprecated();
                        tLRPC$TL_videoSize.location = tLRPC$TL_fileLocationToBeDeprecated;
                        if (j != 0) {
                            tLRPC$TL_fileLocationToBeDeprecated.volume_id = -j;
                            tLRPC$TL_fileLocationToBeDeprecated.local_id = tLRPC$TL_videoSize.type.charAt(0);
                        } else {
                            tLRPC$TL_fileLocationToBeDeprecated.volume_id = -j2;
                            tLRPC$TL_fileLocationToBeDeprecated.local_id = tLRPC$TL_videoSize.type.charAt(0) + 1000;
                        }
                    }
                }
            }
            return tLRPC$TL_videoSize;
        }
        throw new RuntimeException(String.format("can't parse magic %x in VideoSize", Integer.valueOf(i)));
    }
}
