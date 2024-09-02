package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stats$TL_broadcastStats extends TLObject {
    public static int constructor = 963421692;
    public TL_stats$TL_statsPercentValue enabled_notifications;
    public TL_stats$TL_statsAbsValueAndPrev followers;
    public TL_stats$StatsGraph followers_graph;
    public TL_stats$StatsGraph growth_graph;
    public TL_stats$StatsGraph interactions_graph;
    public TL_stats$StatsGraph iv_interactions_graph;
    public TL_stats$StatsGraph languages_graph;
    public TL_stats$StatsGraph mute_graph;
    public TL_stats$StatsGraph new_followers_by_source_graph;
    public TL_stats$TL_statsDateRangeDays period;
    public TL_stats$StatsGraph reactions_by_emotion_graph;
    public TL_stats$TL_statsAbsValueAndPrev reactions_per_post;
    public TL_stats$TL_statsAbsValueAndPrev reactions_per_story;
    public ArrayList<TL_stats$PostInteractionCounters> recent_posts_interactions = new ArrayList<>();
    public TL_stats$TL_statsAbsValueAndPrev shares_per_post;
    public TL_stats$TL_statsAbsValueAndPrev shares_per_story;
    public TL_stats$StatsGraph story_interactions_graph;
    public TL_stats$StatsGraph story_reactions_by_emotion_graph;
    public TL_stats$StatsGraph top_hours_graph;
    public TL_stats$StatsGraph views_by_source_graph;
    public TL_stats$TL_statsAbsValueAndPrev views_per_post;
    public TL_stats$TL_statsAbsValueAndPrev views_per_story;

    public static TL_stats$TL_broadcastStats TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stats_broadcastStats", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_broadcastStats tL_stats$TL_broadcastStats = new TL_stats$TL_broadcastStats();
        tL_stats$TL_broadcastStats.readParams(abstractSerializedData, z);
        return tL_stats$TL_broadcastStats;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.period = TL_stats$TL_statsDateRangeDays.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.followers = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.views_per_post = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.shares_per_post = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.reactions_per_post = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.views_per_story = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.shares_per_story = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.reactions_per_story = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.enabled_notifications = TL_stats$TL_statsPercentValue.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.growth_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.followers_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.mute_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.top_hours_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.interactions_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.iv_interactions_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.views_by_source_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.new_followers_by_source_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.languages_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.reactions_by_emotion_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.story_interactions_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.story_reactions_by_emotion_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TL_stats$PostInteractionCounters TLdeserialize = TL_stats$PostInteractionCounters.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.recent_posts_interactions.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.period.serializeToStream(abstractSerializedData);
        this.followers.serializeToStream(abstractSerializedData);
        this.views_per_post.serializeToStream(abstractSerializedData);
        this.shares_per_post.serializeToStream(abstractSerializedData);
        this.reactions_per_post.serializeToStream(abstractSerializedData);
        this.views_per_story.serializeToStream(abstractSerializedData);
        this.shares_per_story.serializeToStream(abstractSerializedData);
        this.reactions_per_story.serializeToStream(abstractSerializedData);
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
        this.reactions_by_emotion_graph.serializeToStream(abstractSerializedData);
        this.story_interactions_graph.serializeToStream(abstractSerializedData);
        this.story_reactions_by_emotion_graph.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.recent_posts_interactions.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.recent_posts_interactions.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
