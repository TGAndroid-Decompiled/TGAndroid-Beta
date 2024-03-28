package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$User;
public class TL_stats$TL_megagroupStats extends TLObject {
    public TL_stats$StatsGraph actions_graph;
    public TL_stats$StatsGraph growth_graph;
    public TL_stats$StatsGraph languages_graph;
    public TL_stats$TL_statsAbsValueAndPrev members;
    public TL_stats$StatsGraph members_graph;
    public TL_stats$TL_statsAbsValueAndPrev messages;
    public TL_stats$StatsGraph messages_graph;
    public TL_stats$StatsGraph new_members_by_source_graph;
    public TL_stats$TL_statsDateRangeDays period;
    public TL_stats$TL_statsAbsValueAndPrev posters;
    public TL_stats$StatsGraph top_hours_graph;
    public TL_stats$TL_statsAbsValueAndPrev viewers;
    public TL_stats$StatsGraph weekdays_graph;
    public ArrayList<TL_stats$TL_statsGroupTopPoster> top_posters = new ArrayList<>();
    public ArrayList<TL_stats$TL_statsGroupTopAdmin> top_admins = new ArrayList<>();
    public ArrayList<TL_stats$TL_statsGroupTopInviter> top_inviters = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TL_stats$TL_megagroupStats TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-276825834 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stats_megagroupStats", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_megagroupStats tL_stats$TL_megagroupStats = new TL_stats$TL_megagroupStats();
        tL_stats$TL_megagroupStats.readParams(abstractSerializedData, z);
        return tL_stats$TL_megagroupStats;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.period = TL_stats$TL_statsDateRangeDays.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.members = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.messages = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.viewers = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.posters = TL_stats$TL_statsAbsValueAndPrev.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.growth_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.members_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.new_members_by_source_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.languages_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.messages_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.actions_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.top_hours_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.weekdays_graph = TL_stats$StatsGraph.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TL_stats$TL_statsGroupTopPoster TLdeserialize = TL_stats$TL_statsGroupTopPoster.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.top_posters.add(TLdeserialize);
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        if (readInt323 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
            return;
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt324; i2++) {
            TL_stats$TL_statsGroupTopAdmin TLdeserialize2 = TL_stats$TL_statsGroupTopAdmin.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize2 == null) {
                return;
            }
            this.top_admins.add(TLdeserialize2);
        }
        int readInt325 = abstractSerializedData.readInt32(z);
        if (readInt325 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
            }
            return;
        }
        int readInt326 = abstractSerializedData.readInt32(z);
        for (int i3 = 0; i3 < readInt326; i3++) {
            TL_stats$TL_statsGroupTopInviter TLdeserialize3 = TL_stats$TL_statsGroupTopInviter.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize3 == null) {
                return;
            }
            this.top_inviters.add(TLdeserialize3);
        }
        int readInt327 = abstractSerializedData.readInt32(z);
        if (readInt327 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt327)));
            }
            return;
        }
        int readInt328 = abstractSerializedData.readInt32(z);
        for (int i4 = 0; i4 < readInt328; i4++) {
            TLRPC$User TLdeserialize4 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize4 == null) {
                return;
            }
            this.users.add(TLdeserialize4);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-276825834);
        this.period.serializeToStream(abstractSerializedData);
        this.members.serializeToStream(abstractSerializedData);
        this.messages.serializeToStream(abstractSerializedData);
        this.viewers.serializeToStream(abstractSerializedData);
        this.posters.serializeToStream(abstractSerializedData);
        this.growth_graph.serializeToStream(abstractSerializedData);
        this.members_graph.serializeToStream(abstractSerializedData);
        this.new_members_by_source_graph.serializeToStream(abstractSerializedData);
        this.languages_graph.serializeToStream(abstractSerializedData);
        this.messages_graph.serializeToStream(abstractSerializedData);
        this.actions_graph.serializeToStream(abstractSerializedData);
        this.top_hours_graph.serializeToStream(abstractSerializedData);
        this.weekdays_graph.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(481674261);
        int size = this.top_posters.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.top_posters.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.top_admins.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.top_admins.get(i2).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.top_inviters.size();
        abstractSerializedData.writeInt32(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            this.top_inviters.get(i3).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size4 = this.users.size();
        abstractSerializedData.writeInt32(size4);
        for (int i4 = 0; i4 < size4; i4++) {
            this.users.get(i4).serializeToStream(abstractSerializedData);
        }
    }
}
