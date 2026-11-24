package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
public class TL_stats {

    public static class BroadcastRevenueTransaction extends TLObject {
        public static BroadcastRevenueTransaction TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_broadcastRevenueTransactionRefund;
            if (i != 1121127726) {
                if (i != 1434332356) {
                    if (i != 1515784568) {
                        tL_broadcastRevenueTransactionRefund = null;
                    } else {
                        tL_broadcastRevenueTransactionRefund = new TL_broadcastRevenueTransactionWithdrawal();
                    }
                } else {
                    tL_broadcastRevenueTransactionRefund = new TL_broadcastRevenueTransactionProceeds();
                }
            } else {
                tL_broadcastRevenueTransactionRefund = new TL_broadcastRevenueTransactionRefund();
            }
            return (BroadcastRevenueTransaction) TLObject.TLdeserialize(BroadcastRevenueTransaction.class, tL_broadcastRevenueTransactionRefund, inputSerializedData, i, z);
        }
    }

    public static abstract class PostInteractionCounters extends TLObject {
        public static PostInteractionCounters TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_postInteractionCountersStory;
            if (i != -1974989273) {
                if (i != -419066241) {
                    tL_postInteractionCountersStory = null;
                } else {
                    tL_postInteractionCountersStory = new TL_postInteractionCountersMessage();
                }
            } else {
                tL_postInteractionCountersStory = new TL_postInteractionCountersStory();
            }
            return (PostInteractionCounters) TLObject.TLdeserialize(PostInteractionCounters.class, tL_postInteractionCountersStory, inputSerializedData, i, z);
        }
    }

    public static abstract class PublicForward extends TLObject {
        public static PublicForward TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_publicForwardStory;
            if (i != -302797360) {
                if (i != 32685898) {
                    tL_publicForwardStory = null;
                } else {
                    tL_publicForwardStory = new TL_publicForwardMessage();
                }
            } else {
                tL_publicForwardStory = new TL_stories.TL_publicForwardStory();
            }
            return (PublicForward) TLObject.TLdeserialize(PublicForward.class, tL_publicForwardStory, inputSerializedData, i, z);
        }
    }

    public static abstract class StatsGraph extends TLObject {
        public float rate;

        public static StatsGraph TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TLObject tL_statsGraph;
            if (i != -1901828938) {
                if (i != -1092839390) {
                    if (i != 1244130093) {
                        tL_statsGraph = null;
                    } else {
                        tL_statsGraph = new TL_statsGraphAsync();
                    }
                } else {
                    tL_statsGraph = new TL_statsGraphError();
                }
            } else {
                tL_statsGraph = new TL_statsGraph();
            }
            return (StatsGraph) TLObject.TLdeserialize(StatsGraph.class, tL_statsGraph, inputSerializedData, i, z);
        }
    }

    public static class TL_broadcastRevenueStats extends TLObject {
        public static final int constructor = 1409802903;
        public TLRPC.BroadcastRevenueBalances balances;
        public StatsGraph revenue_graph;
        public StatsGraph top_hours_graph;
        public double usd_rate;

        public static TL_broadcastRevenueStats TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_broadcastRevenueStats tL_broadcastRevenueStats;
            if (1409802903 != i) {
                tL_broadcastRevenueStats = null;
            } else {
                tL_broadcastRevenueStats = new TL_broadcastRevenueStats();
            }
            return (TL_broadcastRevenueStats) TLObject.TLdeserialize(TL_broadcastRevenueStats.class, tL_broadcastRevenueStats, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.top_hours_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.revenue_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.balances = TLRPC.BroadcastRevenueBalances.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.usd_rate = inputSerializedData.readDouble(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1409802903);
            this.top_hours_graph.serializeToStream(outputSerializedData);
            this.revenue_graph.serializeToStream(outputSerializedData);
            this.balances.serializeToStream(outputSerializedData);
            outputSerializedData.writeDouble(this.usd_rate);
        }
    }

    public static class TL_broadcastRevenueTransactionProceeds extends BroadcastRevenueTransaction {
        public static final int constructor = 1434332356;
        public long amount;
        public int from_date;
        public int to_date;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.amount = inputSerializedData.readInt64(z);
            this.from_date = inputSerializedData.readInt32(z);
            this.to_date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1434332356);
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeInt32(this.from_date);
            outputSerializedData.writeInt32(this.to_date);
        }
    }

    public static class TL_broadcastRevenueTransactionRefund extends BroadcastRevenueTransaction {
        public static final int constructor = 1121127726;
        public long amount;
        public int from_date;
        public String provider;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.amount = inputSerializedData.readInt64(z);
            this.from_date = inputSerializedData.readInt32(z);
            this.provider = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1121127726);
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeInt32(this.from_date);
            outputSerializedData.writeString(this.provider);
        }
    }

    public static class TL_broadcastRevenueTransactionWithdrawal extends BroadcastRevenueTransaction {
        public static final int constructor = 1515784568;
        public long amount;
        public int date;
        public boolean failed;
        public int flags;
        public boolean pending;
        public String provider;
        public int transaction_date;
        public String transaction_url;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int readInt32 = inputSerializedData.readInt32(z);
            this.flags = readInt32;
            this.pending = TLObject.hasFlag(readInt32, 1);
            this.failed = TLObject.hasFlag(this.flags, 4);
            this.amount = inputSerializedData.readInt64(z);
            this.date = inputSerializedData.readInt32(z);
            this.provider = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.transaction_date = inputSerializedData.readInt32(z);
                this.transaction_url = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i;
            int i2;
            outputSerializedData.writeInt32(1515784568);
            boolean z = this.pending;
            int i3 = this.flags;
            if (z) {
                i = i3 | 1;
            } else {
                i = i3 & (-2);
            }
            this.flags = i;
            if (this.failed) {
                i2 = i | 1;
            } else {
                i2 = i & (-2);
            }
            this.flags = i2;
            outputSerializedData.writeInt64(this.amount);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.provider);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.transaction_date);
                outputSerializedData.writeString(this.transaction_url);
            }
        }
    }

    public static class TL_broadcastRevenueTransactions extends TLObject {
        public static final int constructor = -2028632986;
        public int count;
        public ArrayList<BroadcastRevenueTransaction> transactions = new ArrayList<>();

        public static TL_broadcastRevenueTransactions TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_broadcastRevenueTransactions tL_broadcastRevenueTransactions;
            if (-2028632986 != i) {
                tL_broadcastRevenueTransactions = null;
            } else {
                tL_broadcastRevenueTransactions = new TL_broadcastRevenueTransactions();
            }
            return (TL_broadcastRevenueTransactions) TLObject.TLdeserialize(TL_broadcastRevenueTransactions.class, tL_broadcastRevenueTransactions, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.count = inputSerializedData.readInt32(z);
            this.transactions = Vector.deserialize(inputSerializedData, new rdb((byte) 23), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2028632986);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.transactions);
        }
    }

    public static class TL_broadcastRevenueWithdrawalUrl extends TLObject {
        public static final int constructor = -328886473;
        public String url;

        public static TL_broadcastRevenueWithdrawalUrl TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_broadcastRevenueWithdrawalUrl tL_broadcastRevenueWithdrawalUrl;
            if (-328886473 != i) {
                tL_broadcastRevenueWithdrawalUrl = null;
            } else {
                tL_broadcastRevenueWithdrawalUrl = new TL_broadcastRevenueWithdrawalUrl();
            }
            return (TL_broadcastRevenueWithdrawalUrl) TLObject.TLdeserialize(TL_broadcastRevenueWithdrawalUrl.class, tL_broadcastRevenueWithdrawalUrl, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.url = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-328886473);
            outputSerializedData.writeString(this.url);
        }
    }

    public static class TL_broadcastStats extends TLObject {
        public static int constructor = 963421692;
        public TL_statsPercentValue enabled_notifications;
        public TL_statsAbsValueAndPrev followers;
        public StatsGraph followers_graph;
        public StatsGraph growth_graph;
        public StatsGraph interactions_graph;
        public StatsGraph iv_interactions_graph;
        public StatsGraph languages_graph;
        public StatsGraph mute_graph;
        public StatsGraph new_followers_by_source_graph;
        public TL_statsDateRangeDays period;
        public StatsGraph reactions_by_emotion_graph;
        public TL_statsAbsValueAndPrev reactions_per_post;
        public TL_statsAbsValueAndPrev reactions_per_story;
        public ArrayList<PostInteractionCounters> recent_posts_interactions = new ArrayList<>();
        public TL_statsAbsValueAndPrev shares_per_post;
        public TL_statsAbsValueAndPrev shares_per_story;
        public StatsGraph story_interactions_graph;
        public StatsGraph story_reactions_by_emotion_graph;
        public StatsGraph top_hours_graph;
        public StatsGraph views_by_source_graph;
        public TL_statsAbsValueAndPrev views_per_post;
        public TL_statsAbsValueAndPrev views_per_story;

        public static TL_broadcastStats TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_broadcastStats tL_broadcastStats;
            if (constructor != i) {
                tL_broadcastStats = null;
            } else {
                tL_broadcastStats = new TL_broadcastStats();
            }
            return (TL_broadcastStats) TLObject.TLdeserialize(TL_broadcastStats.class, tL_broadcastStats, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.period = TL_statsDateRangeDays.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.followers = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.views_per_post = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.shares_per_post = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.reactions_per_post = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.views_per_story = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.shares_per_story = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.reactions_per_story = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.enabled_notifications = TL_statsPercentValue.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.growth_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.followers_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.mute_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.top_hours_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.interactions_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.iv_interactions_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.views_by_source_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.new_followers_by_source_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.languages_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.reactions_by_emotion_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.story_interactions_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.story_reactions_by_emotion_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.recent_posts_interactions = Vector.deserialize(inputSerializedData, new rdb((byte) 24), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.period.serializeToStream(outputSerializedData);
            this.followers.serializeToStream(outputSerializedData);
            this.views_per_post.serializeToStream(outputSerializedData);
            this.shares_per_post.serializeToStream(outputSerializedData);
            this.reactions_per_post.serializeToStream(outputSerializedData);
            this.views_per_story.serializeToStream(outputSerializedData);
            this.shares_per_story.serializeToStream(outputSerializedData);
            this.reactions_per_story.serializeToStream(outputSerializedData);
            this.enabled_notifications.serializeToStream(outputSerializedData);
            this.growth_graph.serializeToStream(outputSerializedData);
            this.followers_graph.serializeToStream(outputSerializedData);
            this.mute_graph.serializeToStream(outputSerializedData);
            this.top_hours_graph.serializeToStream(outputSerializedData);
            this.interactions_graph.serializeToStream(outputSerializedData);
            this.iv_interactions_graph.serializeToStream(outputSerializedData);
            this.views_by_source_graph.serializeToStream(outputSerializedData);
            this.new_followers_by_source_graph.serializeToStream(outputSerializedData);
            this.languages_graph.serializeToStream(outputSerializedData);
            this.reactions_by_emotion_graph.serializeToStream(outputSerializedData);
            this.story_interactions_graph.serializeToStream(outputSerializedData);
            this.story_reactions_by_emotion_graph.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.recent_posts_interactions);
        }
    }

    public static class TL_getBroadcastStats extends TLObject {
        public static final int constructor = -1421720550;
        public TLRPC.InputChannel channel;
        public boolean dark;
        public int flags;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_broadcastStats.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i;
            outputSerializedData.writeInt32(-1421720550);
            boolean z = this.dark;
            int i2 = this.flags;
            if (z) {
                i = i2 | 1;
            } else {
                i = i2 & (-2);
            }
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.channel.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_getMegagroupStats extends TLObject {
        public static final int constructor = -589330937;
        public TLRPC.InputChannel channel;
        public boolean dark;
        public int flags;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_megagroupStats.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i;
            outputSerializedData.writeInt32(-589330937);
            boolean z = this.dark;
            int i2 = this.flags;
            if (z) {
                i = i2 | 1;
            } else {
                i = i2 & (-2);
            }
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.channel.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_getMessagePublicForwards extends TLObject {
        public static final int constructor = 1595212100;
        public TLRPC.InputChannel channel;
        public int limit;
        public int msg_id;
        public String offset;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_publicForwards.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1595212100);
            this.channel.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_getMessageStats extends TLObject {
        public static final int constructor = -1226791947;
        public TLRPC.InputChannel channel;
        public boolean dark;
        public int flags;
        public int msg_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_messageStats.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i;
            outputSerializedData.writeInt32(-1226791947);
            boolean z = this.dark;
            int i2 = this.flags;
            if (z) {
                i = i2 | 1;
            } else {
                i = i2 & (-2);
            }
            this.flags = i;
            outputSerializedData.writeInt32(i);
            this.channel.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
        }
    }

    public static class TL_getStoryPublicForwards extends TLObject {
        public static final int constructor = -1505526026;
        public int id;
        public int limit;
        public String offset;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_publicForwards.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1505526026);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.id);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_loadAsyncGraph extends TLObject {
        public static final int constructor = 1646092192;
        public int flags;
        public String token;
        public long x;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
            return StatsGraph.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1646092192);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.token);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.x);
            }
        }
    }

    public static class TL_megagroupStats extends TLObject {
        public static final int constructor = -276825834;
        public StatsGraph actions_graph;
        public StatsGraph growth_graph;
        public StatsGraph languages_graph;
        public TL_statsAbsValueAndPrev members;
        public StatsGraph members_graph;
        public TL_statsAbsValueAndPrev messages;
        public StatsGraph messages_graph;
        public StatsGraph new_members_by_source_graph;
        public TL_statsDateRangeDays period;
        public TL_statsAbsValueAndPrev posters;
        public StatsGraph top_hours_graph;
        public TL_statsAbsValueAndPrev viewers;
        public StatsGraph weekdays_graph;
        public ArrayList<TL_statsGroupTopPoster> top_posters = new ArrayList<>();
        public ArrayList<TL_statsGroupTopAdmin> top_admins = new ArrayList<>();
        public ArrayList<TL_statsGroupTopInviter> top_inviters = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_megagroupStats TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_megagroupStats tL_megagroupStats;
            if (-276825834 != i) {
                tL_megagroupStats = null;
            } else {
                tL_megagroupStats = new TL_megagroupStats();
            }
            return (TL_megagroupStats) TLObject.TLdeserialize(TL_megagroupStats.class, tL_megagroupStats, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.period = TL_statsDateRangeDays.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.members = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.messages = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.viewers = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.posters = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.growth_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.members_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.new_members_by_source_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.languages_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.messages_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.actions_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.top_hours_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.weekdays_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.top_posters = Vector.deserialize(inputSerializedData, new rdb((byte) 25), z);
            this.top_admins = Vector.deserialize(inputSerializedData, new rdb((byte) 26), z);
            this.top_inviters = Vector.deserialize(inputSerializedData, new rdb((byte) 27), z);
            this.users = Vector.deserialize(inputSerializedData, new v0b((byte) 11), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-276825834);
            this.period.serializeToStream(outputSerializedData);
            this.members.serializeToStream(outputSerializedData);
            this.messages.serializeToStream(outputSerializedData);
            this.viewers.serializeToStream(outputSerializedData);
            this.posters.serializeToStream(outputSerializedData);
            this.growth_graph.serializeToStream(outputSerializedData);
            this.members_graph.serializeToStream(outputSerializedData);
            this.new_members_by_source_graph.serializeToStream(outputSerializedData);
            this.languages_graph.serializeToStream(outputSerializedData);
            this.messages_graph.serializeToStream(outputSerializedData);
            this.actions_graph.serializeToStream(outputSerializedData);
            this.top_hours_graph.serializeToStream(outputSerializedData);
            this.weekdays_graph.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.top_posters);
            Vector.serialize(outputSerializedData, this.top_admins);
            Vector.serialize(outputSerializedData, this.top_inviters);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_messageStats extends TLObject {
        public static final int constructor = 2145983508;
        public StatsGraph reactions_by_emotion_graph;
        public StatsGraph views_graph;

        public static TL_messageStats TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_messageStats tL_messageStats;
            if (2145983508 != i) {
                tL_messageStats = null;
            } else {
                tL_messageStats = new TL_messageStats();
            }
            return (TL_messageStats) TLObject.TLdeserialize(TL_messageStats.class, tL_messageStats, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.views_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.reactions_by_emotion_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2145983508);
            this.views_graph.serializeToStream(outputSerializedData);
            this.reactions_by_emotion_graph.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_postInteractionCountersMessage extends PostInteractionCounters {
        public static final int constructor = -419066241;
        public int forwards;
        public int msg_id;
        public int reactions;
        public int views;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.msg_id = inputSerializedData.readInt32(z);
            this.views = inputSerializedData.readInt32(z);
            this.forwards = inputSerializedData.readInt32(z);
            this.reactions = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-419066241);
            outputSerializedData.writeInt32(this.msg_id);
            outputSerializedData.writeInt32(this.views);
            outputSerializedData.writeInt32(this.forwards);
            outputSerializedData.writeInt32(this.reactions);
        }
    }

    public static class TL_postInteractionCountersStory extends PostInteractionCounters {
        public static final int constructor = -1974989273;
        public int forwards;
        public int reactions;
        public int story_id;
        public int views;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.story_id = inputSerializedData.readInt32(z);
            this.views = inputSerializedData.readInt32(z);
            this.forwards = inputSerializedData.readInt32(z);
            this.reactions = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1974989273);
            outputSerializedData.writeInt32(this.story_id);
            outputSerializedData.writeInt32(this.views);
            outputSerializedData.writeInt32(this.forwards);
            outputSerializedData.writeInt32(this.reactions);
        }
    }

    public static class TL_publicForwardMessage extends PublicForward {
        public static final int constructor = 32685898;
        public TLRPC.Message message;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(32685898);
            this.message.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_publicForwards extends TLObject {
        public static final int constructor = -1828487648;
        public int count;
        public int flags;
        public String next_offset;
        public ArrayList<PublicForward> forwards = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_publicForwards TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_publicForwards tL_publicForwards;
            if (-1828487648 != i) {
                tL_publicForwards = null;
            } else {
                tL_publicForwards = new TL_publicForwards();
            }
            return (TL_publicForwards) TLObject.TLdeserialize(TL_publicForwards.class, tL_publicForwards, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.count = inputSerializedData.readInt32(z);
            this.forwards = Vector.deserialize(inputSerializedData, new rdb((byte) 28), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
            this.chats = Vector.deserialize(inputSerializedData, new v0b((byte) 17), z);
            this.users = Vector.deserialize(inputSerializedData, new v0b((byte) 11), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1828487648);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.forwards);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class TL_statsAbsValueAndPrev extends TLObject {
        public static final int constructor = -884757282;
        public double current;
        public double previous;

        public static TL_statsAbsValueAndPrev TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev;
            if (-884757282 != i) {
                tL_statsAbsValueAndPrev = null;
            } else {
                tL_statsAbsValueAndPrev = new TL_statsAbsValueAndPrev();
            }
            return (TL_statsAbsValueAndPrev) TLObject.TLdeserialize(TL_statsAbsValueAndPrev.class, tL_statsAbsValueAndPrev, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.current = inputSerializedData.readDouble(z);
            this.previous = inputSerializedData.readDouble(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-884757282);
            outputSerializedData.writeDouble(this.current);
            outputSerializedData.writeDouble(this.previous);
        }
    }

    public static class TL_statsDateRangeDays extends TLObject {
        public static final int constructor = -1237848657;
        public int max_date;
        public int min_date;

        public static TL_statsDateRangeDays TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_statsDateRangeDays tL_statsDateRangeDays;
            if (-1237848657 != i) {
                tL_statsDateRangeDays = null;
            } else {
                tL_statsDateRangeDays = new TL_statsDateRangeDays();
            }
            return (TL_statsDateRangeDays) TLObject.TLdeserialize(TL_statsDateRangeDays.class, tL_statsDateRangeDays, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.min_date = inputSerializedData.readInt32(z);
            this.max_date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1237848657);
            outputSerializedData.writeInt32(this.min_date);
            outputSerializedData.writeInt32(this.max_date);
        }
    }

    public static class TL_statsGraph extends StatsGraph {
        public static final int constructor = -1901828938;
        public int flags;
        public TLRPC.TL_dataJSON json;
        public String zoom_token;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.json = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.zoom_token = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1901828938);
            outputSerializedData.writeInt32(this.flags);
            this.json.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.zoom_token);
            }
        }
    }

    public static class TL_statsGraphAsync extends StatsGraph {
        public static final int constructor = 1244130093;
        public String token;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.token = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1244130093);
            outputSerializedData.writeString(this.token);
        }
    }

    public static class TL_statsGraphError extends StatsGraph {
        public static final int constructor = -1092839390;
        public String error;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.error = inputSerializedData.readString(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1092839390);
            outputSerializedData.writeString(this.error);
        }
    }

    public static class TL_statsGroupTopAdmin extends TLObject {
        public static final int constructor = -682079097;
        public int banned;
        public int deleted;
        public int kicked;
        public long user_id;

        public static TL_statsGroupTopAdmin TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_statsGroupTopAdmin tL_statsGroupTopAdmin;
            if (-682079097 != i) {
                tL_statsGroupTopAdmin = null;
            } else {
                tL_statsGroupTopAdmin = new TL_statsGroupTopAdmin();
            }
            return (TL_statsGroupTopAdmin) TLObject.TLdeserialize(TL_statsGroupTopAdmin.class, tL_statsGroupTopAdmin, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.user_id = inputSerializedData.readInt64(z);
            this.deleted = inputSerializedData.readInt32(z);
            this.kicked = inputSerializedData.readInt32(z);
            this.banned = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-682079097);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeInt32(this.deleted);
            outputSerializedData.writeInt32(this.kicked);
            outputSerializedData.writeInt32(this.banned);
        }
    }

    public static class TL_statsGroupTopInviter extends TLObject {
        public static final int constructor = 1398765469;
        public int invitations;
        public long user_id;

        public static TL_statsGroupTopInviter TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_statsGroupTopInviter tL_statsGroupTopInviter;
            if (1398765469 != i) {
                tL_statsGroupTopInviter = null;
            } else {
                tL_statsGroupTopInviter = new TL_statsGroupTopInviter();
            }
            return (TL_statsGroupTopInviter) TLObject.TLdeserialize(TL_statsGroupTopInviter.class, tL_statsGroupTopInviter, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.user_id = inputSerializedData.readInt64(z);
            this.invitations = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1398765469);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeInt32(this.invitations);
        }
    }

    public static class TL_statsGroupTopPoster extends TLObject {
        public static final int constructor = -1660637285;
        public int avg_chars;
        public int messages;
        public long user_id;

        public static TL_statsGroupTopPoster TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_statsGroupTopPoster tL_statsGroupTopPoster;
            if (-1660637285 != i) {
                tL_statsGroupTopPoster = null;
            } else {
                tL_statsGroupTopPoster = new TL_statsGroupTopPoster();
            }
            return (TL_statsGroupTopPoster) TLObject.TLdeserialize(TL_statsGroupTopPoster.class, tL_statsGroupTopPoster, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.user_id = inputSerializedData.readInt64(z);
            this.messages = inputSerializedData.readInt32(z);
            this.avg_chars = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1660637285);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeInt32(this.messages);
            outputSerializedData.writeInt32(this.avg_chars);
        }
    }

    public static class TL_statsPercentValue extends TLObject {
        public static final int constructor = -875679776;
        public double part;
        public double total;

        public static TL_statsPercentValue TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_statsPercentValue tL_statsPercentValue;
            if (-875679776 != i) {
                tL_statsPercentValue = null;
            } else {
                tL_statsPercentValue = new TL_statsPercentValue();
            }
            return (TL_statsPercentValue) TLObject.TLdeserialize(TL_statsPercentValue.class, tL_statsPercentValue, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.part = inputSerializedData.readDouble(z);
            this.total = inputSerializedData.readDouble(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-875679776);
            outputSerializedData.writeDouble(this.part);
            outputSerializedData.writeDouble(this.total);
        }
    }

    public static class TL_statsPollStats extends TLObject {
        public static int constructor = 697941741;
        public StatsGraph votes_graph;

        public static TL_statsPollStats TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            TL_statsPollStats tL_statsPollStats;
            if (i != constructor) {
                tL_statsPollStats = null;
            } else {
                tL_statsPollStats = new TL_statsPollStats();
            }
            return (TL_statsPollStats) TLObject.TLdeserialize(TL_statsPollStats.class, tL_statsPollStats, inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.votes_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.votes_graph.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_statsGetPollStats extends TLMethod<TL_statsPollStats> {
        public static int constructor = -1031931288;
        public boolean dark;
        public int flags;
        public int msg_id;
        public TLRPC.InputPeer peer;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            int flag = TLObject.setFlag(this.flags, 1, this.dark);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
        }

        @Override
        public TL_statsPollStats deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TL_statsPollStats.TLdeserialize(inputSerializedData, i, z);
        }
    }
}
