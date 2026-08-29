package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.l;
import org.telegram.tgnet.tl.TL_stories;
public class TL_stats {

    public static class BroadcastRevenueTransaction extends TLObject {
        public static BroadcastRevenueTransaction TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_broadcastRevenueTransactionRefund;
            if (i10 != 1121127726) {
                if (i10 != 1434332356) {
                    if (i10 != 1515784568) {
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
            return (BroadcastRevenueTransaction) TLObject.TLdeserialize(BroadcastRevenueTransaction.class, tL_broadcastRevenueTransactionRefund, inputSerializedData, i10, z10);
        }
    }

    public static abstract class PostInteractionCounters extends TLObject {
        public static PostInteractionCounters TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_postInteractionCountersStory;
            if (i10 != -1974989273) {
                if (i10 != -419066241) {
                    tL_postInteractionCountersStory = null;
                } else {
                    tL_postInteractionCountersStory = new TL_postInteractionCountersMessage();
                }
            } else {
                tL_postInteractionCountersStory = new TL_postInteractionCountersStory();
            }
            return (PostInteractionCounters) TLObject.TLdeserialize(PostInteractionCounters.class, tL_postInteractionCountersStory, inputSerializedData, i10, z10);
        }
    }

    public static abstract class PublicForward extends TLObject {
        public static PublicForward TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_publicForwardStory;
            if (i10 != -302797360) {
                if (i10 != 32685898) {
                    tL_publicForwardStory = null;
                } else {
                    tL_publicForwardStory = new TL_publicForwardMessage();
                }
            } else {
                tL_publicForwardStory = new TL_stories.TL_publicForwardStory();
            }
            return (PublicForward) TLObject.TLdeserialize(PublicForward.class, tL_publicForwardStory, inputSerializedData, i10, z10);
        }
    }

    public static abstract class StatsGraph extends TLObject {
        public float rate;

        public static StatsGraph TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_statsGraph;
            if (i10 != -1901828938) {
                if (i10 != -1092839390) {
                    if (i10 != 1244130093) {
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
            return (StatsGraph) TLObject.TLdeserialize(StatsGraph.class, tL_statsGraph, inputSerializedData, i10, z10);
        }
    }

    public static class TL_broadcastRevenueStats extends TLObject {
        public static final int constructor = 1409802903;
        public TLRPC.BroadcastRevenueBalances balances;
        public StatsGraph revenue_graph;
        public StatsGraph top_hours_graph;
        public double usd_rate;

        public static TL_broadcastRevenueStats TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_broadcastRevenueStats tL_broadcastRevenueStats;
            if (1409802903 != i10) {
                tL_broadcastRevenueStats = null;
            } else {
                tL_broadcastRevenueStats = new TL_broadcastRevenueStats();
            }
            return (TL_broadcastRevenueStats) TLObject.TLdeserialize(TL_broadcastRevenueStats.class, tL_broadcastRevenueStats, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.top_hours_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.revenue_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.balances = TLRPC.BroadcastRevenueBalances.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.usd_rate = inputSerializedData.readDouble(z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.amount = inputSerializedData.readInt64(z10);
            this.from_date = inputSerializedData.readInt32(z10);
            this.to_date = inputSerializedData.readInt32(z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.amount = inputSerializedData.readInt64(z10);
            this.from_date = inputSerializedData.readInt32(z10);
            this.provider = inputSerializedData.readString(z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.pending = TLObject.hasFlag(readInt32, 1);
            this.failed = TLObject.hasFlag(this.flags, 4);
            this.amount = inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
            this.provider = inputSerializedData.readString(z10);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.transaction_date = inputSerializedData.readInt32(z10);
                this.transaction_url = inputSerializedData.readString(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            int i11;
            outputSerializedData.writeInt32(1515784568);
            if (this.pending) {
                i10 = this.flags | 1;
            } else {
                i10 = this.flags & (-2);
            }
            this.flags = i10;
            if (this.failed) {
                i11 = i10 | 1;
            } else {
                i11 = i10 & (-2);
            }
            this.flags = i11;
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

        public static TL_broadcastRevenueTransactions TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_broadcastRevenueTransactions tL_broadcastRevenueTransactions;
            if (-2028632986 != i10) {
                tL_broadcastRevenueTransactions = null;
            } else {
                tL_broadcastRevenueTransactions = new TL_broadcastRevenueTransactions();
            }
            return (TL_broadcastRevenueTransactions) TLObject.TLdeserialize(TL_broadcastRevenueTransactions.class, tL_broadcastRevenueTransactions, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.count = inputSerializedData.readInt32(z10);
            this.transactions = Vector.deserialize(inputSerializedData, new a(27), z10);
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

        public static TL_broadcastRevenueWithdrawalUrl TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_broadcastRevenueWithdrawalUrl tL_broadcastRevenueWithdrawalUrl;
            if (-328886473 != i10) {
                tL_broadcastRevenueWithdrawalUrl = null;
            } else {
                tL_broadcastRevenueWithdrawalUrl = new TL_broadcastRevenueWithdrawalUrl();
            }
            return (TL_broadcastRevenueWithdrawalUrl) TLObject.TLdeserialize(TL_broadcastRevenueWithdrawalUrl.class, tL_broadcastRevenueWithdrawalUrl, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.url = inputSerializedData.readString(z10);
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

        public static TL_broadcastStats TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_broadcastStats tL_broadcastStats;
            if (constructor != i10) {
                tL_broadcastStats = null;
            } else {
                tL_broadcastStats = new TL_broadcastStats();
            }
            return (TL_broadcastStats) TLObject.TLdeserialize(TL_broadcastStats.class, tL_broadcastStats, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.period = TL_statsDateRangeDays.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.followers = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.views_per_post = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.shares_per_post = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.reactions_per_post = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.views_per_story = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.shares_per_story = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.reactions_per_story = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.enabled_notifications = TL_statsPercentValue.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.growth_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.followers_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.mute_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.top_hours_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.interactions_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.iv_interactions_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.views_by_source_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.new_followers_by_source_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.languages_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.reactions_by_emotion_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.story_interactions_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.story_reactions_by_emotion_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.recent_posts_interactions = Vector.deserialize(inputSerializedData, new a(28), z10);
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
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_broadcastStats.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            outputSerializedData.writeInt32(-1421720550);
            if (this.dark) {
                i10 = this.flags | 1;
            } else {
                i10 = this.flags & (-2);
            }
            this.flags = i10;
            outputSerializedData.writeInt32(i10);
            this.channel.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_getMegagroupStats extends TLObject {
        public static final int constructor = -589330937;
        public TLRPC.InputChannel channel;
        public boolean dark;
        public int flags;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_megagroupStats.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            outputSerializedData.writeInt32(-589330937);
            if (this.dark) {
                i10 = this.flags | 1;
            } else {
                i10 = this.flags & (-2);
            }
            this.flags = i10;
            outputSerializedData.writeInt32(i10);
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
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_publicForwards.TLdeserialize(inputSerializedData, i10, z10);
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
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_messageStats.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            outputSerializedData.writeInt32(-1226791947);
            if (this.dark) {
                i10 = this.flags | 1;
            } else {
                i10 = this.flags & (-2);
            }
            this.flags = i10;
            outputSerializedData.writeInt32(i10);
            this.channel.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
        }
    }

    public static class TL_getStoryPublicForwards extends TLObject {
        public static final int constructor = -1505526026;
        public int f22622id;
        public int limit;
        public String offset;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_publicForwards.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1505526026);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.f22622id);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_loadAsyncGraph extends TLObject {
        public static final int constructor = 1646092192;
        public int flags;
        public String token;
        public long f22623x;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return StatsGraph.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1646092192);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeString(this.token);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.f22623x);
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

        public static TL_megagroupStats TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_megagroupStats tL_megagroupStats;
            if (-276825834 != i10) {
                tL_megagroupStats = null;
            } else {
                tL_megagroupStats = new TL_megagroupStats();
            }
            return (TL_megagroupStats) TLObject.TLdeserialize(TL_megagroupStats.class, tL_megagroupStats, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.period = TL_statsDateRangeDays.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.members = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.messages = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.viewers = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.posters = TL_statsAbsValueAndPrev.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.growth_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.members_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.new_members_by_source_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.languages_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.messages_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.actions_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.top_hours_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.weekdays_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.top_posters = Vector.deserialize(inputSerializedData, new a(29), z10);
            this.top_admins = Vector.deserialize(inputSerializedData, new d(0), z10);
            this.top_inviters = Vector.deserialize(inputSerializedData, new d(1), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
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

        public static TL_messageStats TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_messageStats tL_messageStats;
            if (2145983508 != i10) {
                tL_messageStats = null;
            } else {
                tL_messageStats = new TL_messageStats();
            }
            return (TL_messageStats) TLObject.TLdeserialize(TL_messageStats.class, tL_messageStats, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.views_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.reactions_by_emotion_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.msg_id = inputSerializedData.readInt32(z10);
            this.views = inputSerializedData.readInt32(z10);
            this.forwards = inputSerializedData.readInt32(z10);
            this.reactions = inputSerializedData.readInt32(z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.story_id = inputSerializedData.readInt32(z10);
            this.views = inputSerializedData.readInt32(z10);
            this.forwards = inputSerializedData.readInt32(z10);
            this.reactions = inputSerializedData.readInt32(z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
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

        public static TL_publicForwards TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_publicForwards tL_publicForwards;
            if (-1828487648 != i10) {
                tL_publicForwards = null;
            } else {
                tL_publicForwards = new TL_publicForwards();
            }
            return (TL_publicForwards) TLObject.TLdeserialize(TL_publicForwards.class, tL_publicForwards, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.count = inputSerializedData.readInt32(z10);
            this.forwards = Vector.deserialize(inputSerializedData, new d(2), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z10);
            }
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
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

        public static TL_statsAbsValueAndPrev TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev;
            if (-884757282 != i10) {
                tL_statsAbsValueAndPrev = null;
            } else {
                tL_statsAbsValueAndPrev = new TL_statsAbsValueAndPrev();
            }
            return (TL_statsAbsValueAndPrev) TLObject.TLdeserialize(TL_statsAbsValueAndPrev.class, tL_statsAbsValueAndPrev, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.current = inputSerializedData.readDouble(z10);
            this.previous = inputSerializedData.readDouble(z10);
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

        public static TL_statsDateRangeDays TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_statsDateRangeDays tL_statsDateRangeDays;
            if (-1237848657 != i10) {
                tL_statsDateRangeDays = null;
            } else {
                tL_statsDateRangeDays = new TL_statsDateRangeDays();
            }
            return (TL_statsDateRangeDays) TLObject.TLdeserialize(TL_statsDateRangeDays.class, tL_statsDateRangeDays, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.min_date = inputSerializedData.readInt32(z10);
            this.max_date = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1237848657);
            outputSerializedData.writeInt32(this.min_date);
            outputSerializedData.writeInt32(this.max_date);
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
        public TL_statsPollStats deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_statsPollStats.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_statsGraph extends StatsGraph {
        public static final int constructor = -1901828938;
        public int flags;
        public TLRPC.TL_dataJSON json;
        public String zoom_token;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.json = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.zoom_token = inputSerializedData.readString(z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.token = inputSerializedData.readString(z10);
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
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.error = inputSerializedData.readString(z10);
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

        public static TL_statsGroupTopAdmin TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_statsGroupTopAdmin tL_statsGroupTopAdmin;
            if (-682079097 != i10) {
                tL_statsGroupTopAdmin = null;
            } else {
                tL_statsGroupTopAdmin = new TL_statsGroupTopAdmin();
            }
            return (TL_statsGroupTopAdmin) TLObject.TLdeserialize(TL_statsGroupTopAdmin.class, tL_statsGroupTopAdmin, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.user_id = inputSerializedData.readInt64(z10);
            this.deleted = inputSerializedData.readInt32(z10);
            this.kicked = inputSerializedData.readInt32(z10);
            this.banned = inputSerializedData.readInt32(z10);
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

        public static TL_statsGroupTopInviter TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_statsGroupTopInviter tL_statsGroupTopInviter;
            if (1398765469 != i10) {
                tL_statsGroupTopInviter = null;
            } else {
                tL_statsGroupTopInviter = new TL_statsGroupTopInviter();
            }
            return (TL_statsGroupTopInviter) TLObject.TLdeserialize(TL_statsGroupTopInviter.class, tL_statsGroupTopInviter, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.user_id = inputSerializedData.readInt64(z10);
            this.invitations = inputSerializedData.readInt32(z10);
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

        public static TL_statsGroupTopPoster TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_statsGroupTopPoster tL_statsGroupTopPoster;
            if (-1660637285 != i10) {
                tL_statsGroupTopPoster = null;
            } else {
                tL_statsGroupTopPoster = new TL_statsGroupTopPoster();
            }
            return (TL_statsGroupTopPoster) TLObject.TLdeserialize(TL_statsGroupTopPoster.class, tL_statsGroupTopPoster, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.user_id = inputSerializedData.readInt64(z10);
            this.messages = inputSerializedData.readInt32(z10);
            this.avg_chars = inputSerializedData.readInt32(z10);
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

        public static TL_statsPercentValue TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_statsPercentValue tL_statsPercentValue;
            if (-875679776 != i10) {
                tL_statsPercentValue = null;
            } else {
                tL_statsPercentValue = new TL_statsPercentValue();
            }
            return (TL_statsPercentValue) TLObject.TLdeserialize(TL_statsPercentValue.class, tL_statsPercentValue, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.part = inputSerializedData.readDouble(z10);
            this.total = inputSerializedData.readDouble(z10);
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

        public static TL_statsPollStats TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_statsPollStats tL_statsPollStats;
            if (i10 != constructor) {
                tL_statsPollStats = null;
            } else {
                tL_statsPollStats = new TL_statsPollStats();
            }
            return (TL_statsPollStats) TLObject.TLdeserialize(TL_statsPollStats.class, tL_statsPollStats, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.votes_graph = StatsGraph.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            this.votes_graph.serializeToStream(outputSerializedData);
        }
    }
}
