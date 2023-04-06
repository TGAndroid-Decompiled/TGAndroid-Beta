package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_stats_broadcastStats extends TLObject {
    public static int constructor = -1107852396;
    public TLRPC$TL_statsPercentValue enabled_notifications;
    public TLRPC$TL_statsAbsValueAndPrev followers;
    public TLRPC$StatsGraph followers_graph;
    public TLRPC$StatsGraph growth_graph;
    public TLRPC$StatsGraph interactions_graph;
    public TLRPC$StatsGraph iv_interactions_graph;
    public TLRPC$StatsGraph languages_graph;
    public TLRPC$StatsGraph mute_graph;
    public TLRPC$StatsGraph new_followers_by_source_graph;
    public TLRPC$TL_statsDateRangeDays period;
    public ArrayList<TLRPC$TL_messageInteractionCounters> recent_message_interactions = new ArrayList<>();
    public TLRPC$TL_statsAbsValueAndPrev shares_per_post;
    public TLRPC$StatsGraph top_hours_graph;
    public TLRPC$StatsGraph views_by_source_graph;
    public TLRPC$TL_statsAbsValueAndPrev views_per_post;

    public static TLRPC$TL_stats_broadcastStats TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stats_broadcastStats", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_stats_broadcastStats tLRPC$TL_stats_broadcastStats = new TLRPC$TL_stats_broadcastStats();
        tLRPC$TL_stats_broadcastStats.readParams(abstractSerializedData, z);
        return tLRPC$TL_stats_broadcastStats;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.period = TLRPC$TL_statsDateRangeDays.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.followers = TLRPC$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.views_per_post = TLRPC$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.shares_per_post = TLRPC$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.enabled_notifications = TLRPC$TL_statsPercentValue.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.growth_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.followers_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.mute_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.top_hours_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.interactions_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.iv_interactions_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.views_by_source_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.new_followers_by_source_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.languages_graph = TLRPC$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_messageInteractionCounters TLdeserialize = TLRPC$TL_messageInteractionCounters.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.recent_message_interactions.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.period.serializeToStream(abstractSerializedData);
        this.followers.serializeToStream(abstractSerializedData);
        this.views_per_post.serializeToStream(abstractSerializedData);
        this.shares_per_post.serializeToStream(abstractSerializedData);
        this.enabled_notifications.serializeToStream(abstractSerializedData);
        this.growth_graph.serializeToStream(abstractSerializedData);
        this.followers_graph.serializeToStream(abstractSerializedData);
        this.mute_graph.serializeToStream(abstractSerializedData);
        this.top_hours_graph.serializeToStream(abstractSerializedData);
        this.interactions_graph.serializeToStream(abstractSerializedData);
        this.iv_interactions_graph.serializeToStream(abstractSerializedData);
        this.views_by_source_graph.serializeToStream(abstractSerializedData);
        this.new_followers_by_source_graph.serializeToStream(abstractSerializedData);
        this.languages_graph.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.recent_message_interactions.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.recent_message_interactions.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
