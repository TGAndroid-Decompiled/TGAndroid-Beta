package org.telegram.tgnet;

public abstract class TLRPC$GroupCall extends TLObject {
    public long access_hash;
    public boolean can_change_join_muted;
    public boolean can_start_video;
    public int duration;
    public int flags;
    public long id;
    public boolean join_date_asc;
    public boolean join_muted;
    public boolean listeners_hidden;
    public int participants_count;
    public int record_start_date;
    public boolean record_video_active;
    public boolean rtmp_stream;
    public int schedule_date;
    public boolean schedule_start_subscribed;
    public int stream_dc_id;
    public String title;
    public int unmuted_video_count;
    public int unmuted_video_limit;
    public int version;

    public static TLRPC$GroupCall TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$GroupCall tLRPC$TL_groupCall;
        if (i != -711498484) {
            tLRPC$TL_groupCall = i != 2004925620 ? null : new TLRPC$TL_groupCallDiscarded();
        } else {
            tLRPC$TL_groupCall = new TLRPC$TL_groupCall();
        }
        if (tLRPC$TL_groupCall == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in GroupCall", Integer.valueOf(i)));
        }
        if (tLRPC$TL_groupCall != null) {
            tLRPC$TL_groupCall.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_groupCall;
    }
}
